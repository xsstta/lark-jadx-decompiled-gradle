package com.huawei.hms.site.api.model;

public class QueryAutocompleteRequest {
    public boolean children;
    public String language;
    public Coordinate location;
    public String politicalView;
    public String query;
    public Integer radius;

    public String getLanguage() {
        return this.language;
    }

    public Coordinate getLocation() {
        return this.location;
    }

    public String getPoliticalView() {
        return this.politicalView;
    }

    public String getQuery() {
        return this.query;
    }

    public Integer getRadius() {
        return this.radius;
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

    public void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    public void setPoliticalView(String str) {
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setRadius(Integer num) {
        this.radius = num;
    }
}
