
package com.ar.maloba.assessmentmgrana.repository.remote.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public class Rule {

    @SerializedName("enabled_taxpayer_types")
    @Expose
    private List<String> enabledTaxpayerTypes = null;
    @SerializedName("begins_with")
    @Expose
    private String beginsWith;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("min_length")
    @Expose
    private int minLength;
    @SerializedName("max_length")
    @Expose
    private int maxLength;

    public List<String> getEnabledTaxpayerTypes() {
        return enabledTaxpayerTypes;
    }

    public void setEnabledTaxpayerTypes(List<String> enabledTaxpayerTypes) {
        this.enabledTaxpayerTypes = enabledTaxpayerTypes;
    }

    public String getBeginsWith() {
        return beginsWith;
    }

    public void setBeginsWith(String beginsWith) {
        this.beginsWith = beginsWith;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

}
