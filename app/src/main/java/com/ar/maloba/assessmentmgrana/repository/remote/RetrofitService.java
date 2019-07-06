package com.ar.maloba.assessmentmgrana.repository.remote;

import com.ar.maloba.assessmentmgrana.repository.remote.api.MercadoLibreApi;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public class RetrofitService {

    private static Retrofit mRetrofit;

    public static <S> S createService(Class<S> serviceClass) {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        String baseUrl = "https://api.mercadolibre.com/";

        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create(
                new GsonBuilder().registerTypeAdapterFactory(AutoValueGsonFactory.create())
                        .create());

        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(gsonConverterFactory)
                    .client(httpClient.build())
                    .build();
        }

        return mRetrofit.create(serviceClass);
    }

}
