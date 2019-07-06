
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
public abstract class Category {

    @SerializedName("id")
    public abstract String id();

    @SerializedName("name")
    public abstract String name();

    public static TypeAdapter<Category> typeAdapter(Gson gson) {
        return new AutoValue_Category.GsonTypeAdapter(gson);
    }
}
