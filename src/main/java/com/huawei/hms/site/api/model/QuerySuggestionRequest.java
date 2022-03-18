package com.huawei.hms.site.api.model;

import java.util.List;

public class QuerySuggestionRequest {
    public CoordinateBounds bounds;
    public boolean children;
    public String countryCode;
    public String language;
    public Coordinate location;
    public List<LocationType> poiTypes;
    public String politicalView;
    public String query;
    public Integer radius;
    public Boolean strictBounds;

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getLanguage() {
        return this.language;
    }

    public Coordinate getLocation() {
        return this.location;
    }

    public List<LocationType> getPoiTypes() {
        return this.poiTypes;
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

    public Boolean getStrictBounds() {
        return this.strictBounds;
    }

    public boolean isChildren() {
        return this.children;
    }

    public void setBounds(CoordinateBounds coordinateBounds) {
        this.bounds = coordinateBounds;
    }

    public void setChildren(boolean z) {
        this.children = z;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    public void setPoiTypes(List<LocationType> list) {
        this.poiTypes = list;
    }

    public void setPoliticalView(String str) {
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setRadius(Integer num) {
        this.radius = num;
    }

    public void setStrictBounds(Boolean bool) {
        this.strictBounds = bool;
    }
}
