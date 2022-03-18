package com.huawei.hms.site.api.model;

import com.huawei.hms.site.C23738a;

public class TextSearchRequest {
    public boolean children;
    public String countryCode;
    public HwLocationType hwPoiType;
    public String language;
    public Coordinate location;
    public Integer pageIndex;
    public Integer pageSize;
    public LocationType poiType;
    public String politicalView;
    public String query;
    public Integer radius;

    public String getCountryCode() {
        return this.countryCode;
    }

    public HwLocationType getHwPoiType() {
        return this.hwPoiType;
    }

    public String getLanguage() {
        return this.language;
    }

    public Coordinate getLocation() {
        return this.location;
    }

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public LocationType getPoiType() {
        return this.poiType;
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

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setHwPoiType(HwLocationType hwLocationType) {
        this.hwPoiType = hwLocationType;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    public void setPageIndex(Integer num) {
        this.pageIndex = num;
    }

    public void setPageSize(Integer num) {
        this.pageSize = num;
    }

    public void setPoiType(LocationType locationType) {
        this.poiType = locationType;
    }

    public void setPoliticalView(String str) {
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setRadius(Integer num) {
        this.radius = num;
    }

    public String toString() {
        StringBuilder a = C23738a.m86922a("TextSearchRequest{poiType=");
        a.append(this.poiType);
        a.append(", hwPoiType=");
        a.append(this.hwPoiType);
        a.append('}');
        return a.toString();
    }
}
