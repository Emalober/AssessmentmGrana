package com.ar.maloba.assessmentmgrana;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ar.maloba.assessmentmgrana.repository.remote.model.Category;
import com.ar.maloba.assessmentmgrana.viewmodels.ConfigViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS = 20;

    private RecyclerView mRecyclerView;

    private CategoriesAdapter mAdapter;

    private ConfigViewModel mConfigViewModel;

    private ArrayList<Category> mCategories = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

        mConfigViewModel = ViewModelProviders.of(this).get(ConfigViewModel.class);
        mConfigViewModel.init();
        mConfigViewModel.getMLRepository().observe(this, configResponse -> {
            List<Category> categories = configResponse.categories();
            mCategories.clear();
            mCategories.addAll(categories);
            mAdapter.notifyDataSetChanged();
        });

        setupRecyclerView();
    }

    private void setupRecyclerView() {

        if (mAdapter == null) {
            mAdapter = new CategoriesAdapter(MainActivity.this, mCategories);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            mRecyclerView.setAdapter(mAdapter);
            mRecyclerView.setItemAnimator(new DefaultItemAnimator());
            mRecyclerView.setNestedScrollingEnabled(true);
        } else {
            mAdapter.notifyDataSetChanged();
        }
    }
}
