package com.huawei.hms.site.widget;

import com.huawei.hms.site.api.model.Coordinate;
import com.huawei.hms.site.api.model.CoordinateBounds;
import com.huawei.hms.site.api.model.LocationType;
import java.util.List;

public class SearchFilter {

    /* renamed from: a */
    public String f58877a;

    /* renamed from: b */
    public Coordinate f58878b;

    /* renamed from: c */
    public Integer f58879c;

    /* renamed from: d */
    public CoordinateBounds f58880d;

    /* renamed from: e */
    public String f58881e;

    /* renamed from: f */
    public String f58882f;

    /* renamed from: g */
    public String f58883g;

    /* renamed from: h */
    public List<LocationType> f58884h;

    /* renamed from: i */
    public boolean f58885i;

    /* renamed from: j */
    public Boolean f58886j;

    public CoordinateBounds getBounds() {
        return this.f58880d;
    }

    public String getCountryCode() {
        return this.f58881e;
    }

    public String getLanguage() {
        return this.f58882f;
    }

    public Coordinate getLocation() {
        return this.f58878b;
    }

    public List<LocationType> getPoiType() {
        return this.f58884h;
    }

    public String getPoliticalView() {
        return this.f58883g;
    }

    public String getQuery() {
        return this.f58877a;
    }

    public Integer getRadius() {
        return this.f58879c;
    }

    public Boolean getStrictBounds() {
        return this.f58886j;
    }

    public boolean isChildren() {
        return this.f58885i;
    }

    public void setBounds(CoordinateBounds coordinateBounds) {
        this.f58880d = coordinateBounds;
    }

    public void setChildren(boolean z) {
        this.f58885i = z;
    }

    public void setCountryCode(String str) {
        this.f58881e = str;
    }

    public void setLanguage(String str) {
        this.f58882f = str;
    }

    public void setLocation(Coordinate coordinate) {
        this.f58878b = coordinate;
    }

    public void setPoiType(List<LocationType> list) {
        this.f58884h = list;
    }

    public void setPoliticalView(String str) {
    }

    public void setQuery(String str) {
        this.f58877a = str;
    }

    public void setRadius(Integer num) {
        this.f58879c = num;
    }

    public void setStrictBounds(Boolean bool) {
        this.f58886j = bool;
    }
}
