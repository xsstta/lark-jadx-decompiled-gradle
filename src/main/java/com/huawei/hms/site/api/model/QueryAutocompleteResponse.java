package com.huawei.hms.site.api.model;

public class QueryAutocompleteResponse {
    public AutoCompletePrediction[] predictions;
    public Site[] sites;

    public AutoCompletePrediction[] getPredictions() {
        return this.predictions;
    }

    public Site[] getSites() {
        return this.sites;
    }

    public void setPredictions(AutoCompletePrediction[] autoCompletePredictionArr) {
        this.predictions = autoCompletePredictionArr;
    }

    public void setSites(Site[] siteArr) {
        this.sites = siteArr;
    }
}
