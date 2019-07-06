
package com.ar.maloba.assessmentmgrana.repository.remote.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public class IdentificationTypesRule {

    @SerializedName("identification_type")
    @Expose
    private String identificationType;
    @SerializedName("rules")
    @Expose
    private List<Rule> rules = null;

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

}
