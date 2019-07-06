package com.ar.maloba.assessmentmgrana.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.ar.maloba.assessmentmgrana.repository.MLRepository;
import com.ar.maloba.assessmentmgrana.repository.remote.model.ConfigResponse;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public class ConfigViewModel extends ViewModel {

    private MutableLiveData<ConfigResponse> mMutableLiveData;

    private MLRepository mMLRepository;

    public void init(){
        if (mMutableLiveData != null){
            return;
        }
        mMLRepository = MLRepository.getInstance();
        mMutableLiveData = mMLRepository.getConfig();

    }

    public LiveData<ConfigResponse> getMLRepository() {
        return mMutableLiveData;
    }
}
