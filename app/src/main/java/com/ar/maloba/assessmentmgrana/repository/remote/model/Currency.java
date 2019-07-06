
package com.ar.maloba.assessmentmgrana.repository.remote.model;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
@AutoValue
public abstract class Currency {

    @SerializedName("id")
    public abstract String id();

    @SerializedName("symbol")
    public abstract String symbol();

    public static TypeAdapter<Currency> typeAdapter(Gson gson) {
        return new AutoValue_Currency.GsonTypeAdapter(gson);
    }
}
