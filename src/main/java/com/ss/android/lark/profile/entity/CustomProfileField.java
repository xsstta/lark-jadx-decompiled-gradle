package com.ss.android.lark.profile.entity;

import java.io.Serializable;

public class CustomProfileField implements Serializable {
    private static final long serialVersionUID = 849543819999452231L;
    private String herf;
    private boolean isUrl;
    private String key;
    private String name;
    private String value;

    public String getHerf() {
        return this.herf;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isUrl() {
        return this.isUrl;
    }

    public CustomProfileField() {
        this.key = "";
        this.name = "";
        this.value = "";
        this.herf = "";
    }

    public void setHerf(String str) {
        this.herf = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUrl(boolean z) {
        this.isUrl = z;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public CustomProfileField(String str, String str2, String str3) {
        this.key = str;
        this.value = str2;
        this.herf = str3;
    }
}
