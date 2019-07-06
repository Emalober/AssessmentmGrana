package com.ar.maloba.assessmentmgrana;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ar.maloba.assessmentmgrana.repository.remote.model.Category;

import java.util.ArrayList;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder> {

    private static final String TAG = CategoriesAdapter.class.getSimpleName();

    private ArrayList<Category> mCategories;

    public CategoriesAdapter(@NonNull MainActivity mainActivity,@NonNull ArrayList<Category> categories) {
        mCategories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.category_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        CategoryViewHolder viewHolder = new CategoryViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Log.d(TAG, "#" + position);
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView listItemView;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            listItemView = (TextView) itemView.findViewById(R.id.tv_item_category);
        }

        void bind(int listIndex) {
            Category cat = mCategories.get(listIndex);
            listItemView.setText(cat != null ? cat.name() : " --- ");
        }
    }
}
