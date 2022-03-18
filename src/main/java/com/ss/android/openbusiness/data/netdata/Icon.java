package com.ss.android.openbusiness.data.netdata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Icon implements Serializable {
    @SerializedName("fsUnit")
    @Expose
    private String fsUnit;
    @SerializedName("key")
    @Expose
    private String key;

    public String getFsUnit() {
        return this.fsUnit;
    }

    public String getKey() {
        return this.key;
    }

    public void setFsUnit(String str) {
        this.fsUnit = str;
    }

    public void setKey(String str) {
        this.key = str;
    }
}
