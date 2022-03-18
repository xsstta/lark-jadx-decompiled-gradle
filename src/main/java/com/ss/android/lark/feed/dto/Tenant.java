package com.ss.android.lark.feed.dto;

import java.io.Serializable;

public class Tenant implements Serializable {
    private static final long serialVersionUID = -92609727225209513L;
    private String iconUrl;
    private String name;

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
