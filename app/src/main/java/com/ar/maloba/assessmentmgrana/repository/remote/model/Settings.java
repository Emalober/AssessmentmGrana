
package com.ar.maloba.assessmentmgrana.repository.remote.model;

import java.util.List;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
@AutoValue
public abstract class Settings {

    @SerializedName("identification_types")
    public abstract List<String> identificationTypes();

    @SerializedName("taxpayer_types")
    public abstract List<String> taxpayerTypes();

    @SerializedName("identification_types_rules")
    public abstract List<IdentificationTypesRule> identificationTypesRules();

    public static TypeAdapter<Settings> typeAdapter(Gson gson) {
        return new AutoValue_Settings.GsonTypeAdapter(gson);
    }
}
