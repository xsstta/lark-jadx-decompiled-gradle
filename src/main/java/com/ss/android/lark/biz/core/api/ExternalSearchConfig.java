package com.ss.android.lark.biz.core.api;

import java.io.Serializable;

public class ExternalSearchConfig implements Serializable {
    private String iconUrl;
    private String id;
    private String title;

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public ExternalSearchConfig(String str, String str2, String str3) {
        this.id = str;
        this.title = str2;
        this.iconUrl = str3;
    }
}
