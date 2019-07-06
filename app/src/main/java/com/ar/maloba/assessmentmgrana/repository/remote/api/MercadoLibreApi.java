package com.ar.maloba.assessmentmgrana.repository.remote.api;

import com.ar.maloba.assessmentmgrana.repository.remote.model.ConfigResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public interface MercadoLibreApi {

    @GET("sites/MLA/")
    Call<ConfigResponse> getConfig();
}
