
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
public abstract class ConfigResponse {

    @SerializedName("id")
    public abstract String id();

    @SerializedName("name")
    public abstract String name();

    @SerializedName("country_id")
    public abstract String countryId();

    @SerializedName("sale_fees_mode")
    public abstract String saleFeesMode();

    @SerializedName("mercadopago_version")
    public abstract int mercadopagoVersion();

    @SerializedName("default_currency_id")
    public abstract String defaultCurrencyId();

    @SerializedName("immediate_payment")
    public abstract String immediatePayment();

    @SerializedName("payment_method_ids")
    public abstract List<String> paymentMethodIds();

    @SerializedName("settings")
    public abstract Settings settings();

    @SerializedName("currencies")
    public abstract List<Currency> currencies();

    @SerializedName("categories")
    public abstract List<Category> categories();

    public static TypeAdapter<ConfigResponse> typeAdapter(Gson gson) {
        return new AutoValue_ConfigResponse.GsonTypeAdapter(gson);
    }
}
