package com.huawei.hms.site.api.model;

public class DetailSearchRequest {
    public boolean children;
    public String language;
    public String politicalView;
    public String siteId;

    public String getLanguage() {
        return this.language;
    }

    public String getPoliticalView() {
        return this.politicalView;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public boolean isChildren() {
        return this.children;
    }

    public void setChildren(boolean z) {
        this.children = z;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setPoliticalView(String str) {
    }

    public void setSiteId(String str) {
        this.siteId = str;
    }
}
