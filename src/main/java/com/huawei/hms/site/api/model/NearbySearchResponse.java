package com.huawei.hms.site.api.model;

import java.util.List;

public class NearbySearchResponse {
    public List<Site> sites;
    public int totalCount;

    public List<Site> getSites() {
        return this.sites;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setSites(List<Site> list) {
        this.sites = list;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }
}
