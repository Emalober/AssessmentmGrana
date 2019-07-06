package com.ar.maloba.assessmentmgrana.repository;

import android.arch.lifecycle.MutableLiveData;

import com.ar.maloba.assessmentmgrana.repository.remote.RetrofitService;
import com.ar.maloba.assessmentmgrana.repository.remote.api.MercadoLibreApi;
import com.ar.maloba.assessmentmgrana.repository.remote.model.ConfigResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public class MLRepository {

    private static MLRepository mMLRepository;

    public static MLRepository getInstance(){
        if (mMLRepository == null){
            mMLRepository = new MLRepository();
        }
        return mMLRepository;
    }

    private MercadoLibreApi mMercadoLibreApi;

    public MLRepository(){
        mMercadoLibreApi = RetrofitService.createService(MercadoLibreApi.class);
    }

    public MutableLiveData<ConfigResponse> getConfig(){
        final MutableLiveData<ConfigResponse> configData = new MutableLiveData<>();

        mMercadoLibreApi.getConfig().enqueue(new Callback<ConfigResponse>() {
            @Override
            public void onResponse(Call<ConfigResponse> call,
                                   Response<ConfigResponse> response) {
                if (response.isSuccessful()){
                    configData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<ConfigResponse> call, Throwable t) {
                configData.setValue(null);
            }
        });
        return configData;
    }
}
