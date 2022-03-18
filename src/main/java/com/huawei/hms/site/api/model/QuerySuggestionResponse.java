package com.huawei.hms.site.api.model;

import java.util.List;

public class QuerySuggestionResponse {
    public List<Site> sites;

    public List<Site> getSites() {
        return this.sites;
    }

    public void setSites(List<Site> list) {
        this.sites = list;
    }
}
