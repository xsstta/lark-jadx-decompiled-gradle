package com.ss.android.lark.appstrategy.userscope;

import com.ss.android.lark.appstrategy.dto.SimpleLocation;
import java.io.Serializable;
import java.util.List;

public class PolygonScope implements Serializable {
    private List<SimpleLocation> locationList;

    public PolygonScope() {
    }

    public List<SimpleLocation> getLocationList() {
        return this.locationList;
    }

    public void setLocationList(List<SimpleLocation> list) {
        this.locationList = list;
    }

    public PolygonScope(List<SimpleLocation> list) {
        this.locationList = list;
    }
}
