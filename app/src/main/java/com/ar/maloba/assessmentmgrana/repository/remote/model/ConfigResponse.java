
package com.ar.maloba.assessmentmgrana.repository.remote.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public class ConfigResponse {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("country_id")
    @Expose
    private String countryId;
    @SerializedName("sale_fees_mode")
    @Expose
    private String saleFeesMode;
    @SerializedName("mercadopago_version")
    @Expose
    private int mercadopagoVersion;
    @SerializedName("default_currency_id")
    @Expose
    private String defaultCurrencyId;
    @SerializedName("immediate_payment")
    @Expose
    private String immediatePayment;
    @SerializedName("payment_method_ids")
    @Expose
    private List<String> paymentMethodIds = null;
    @SerializedName("settings")
    @Expose
    private Settings settings;
    @SerializedName("currencies")
    @Expose
    private List<Currency> currencies = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getSaleFeesMode() {
        return saleFeesMode;
    }

    public void setSaleFeesMode(String saleFeesMode) {
        this.saleFeesMode = saleFeesMode;
    }

    public int getMercadopagoVersion() {
        return mercadopagoVersion;
    }

    public void setMercadopagoVersion(int mercadopagoVersion) {
        this.mercadopagoVersion = mercadopagoVersion;
    }

    public String getDefaultCurrencyId() {
        return defaultCurrencyId;
    }

    public void setDefaultCurrencyId(String defaultCurrencyId) {
        this.defaultCurrencyId = defaultCurrencyId;
    }

    public String getImmediatePayment() {
        return immediatePayment;
    }

    public void setImmediatePayment(String immediatePayment) {
        this.immediatePayment = immediatePayment;
    }

    public List<String> getPaymentMethodIds() {
        return paymentMethodIds;
    }

    public void setPaymentMethodIds(List<String> paymentMethodIds) {
        this.paymentMethodIds = paymentMethodIds;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
