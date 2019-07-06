
package com.ar.maloba.assessmentmgrana.repository.remote.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ezequiel Maloberti on 6/7/2019.
 */
public class Currency {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("symbol")
    @Expose
    private String symbol;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
