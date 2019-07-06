
package com.ar.maloba.assessmentmgrana.repository.remote.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public class Settings {

    @SerializedName("identification_types")
    @Expose
    private List<String> identificationTypes = null;
    @SerializedName("taxpayer_types")
    @Expose
    private List<String> taxpayerTypes = null;
    @SerializedName("identification_types_rules")
    @Expose
    private List<IdentificationTypesRule> identificationTypesRules = null;

    public List<String> getIdentificationTypes() {
        return identificationTypes;
    }

    public void setIdentificationTypes(List<String> identificationTypes) {
        this.identificationTypes = identificationTypes;
    }

    public List<String> getTaxpayerTypes() {
        return taxpayerTypes;
    }

    public void setTaxpayerTypes(List<String> taxpayerTypes) {
        this.taxpayerTypes = taxpayerTypes;
    }

    public List<IdentificationTypesRule> getIdentificationTypesRules() {
        return identificationTypesRules;
    }

    public void setIdentificationTypesRules(List<IdentificationTypesRule> identificationTypesRules) {
        this.identificationTypesRules = identificationTypesRules;
    }

}
