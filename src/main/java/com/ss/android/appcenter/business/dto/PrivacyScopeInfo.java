package com.ss.android.appcenter.business.dto;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class PrivacyScopeInfo implements Serializable {
    @SerializedName("desc")
    String desc;
    @SerializedName("id")
    int id;
    @SerializedName("level")
    String level;

    public String getDesc() {
        return this.desc;
    }

    public int getId() {
        return this.id;
    }

    public String getLevel() {
        return this.level;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setLevel(String str) {
        this.level = str;
    }
}
