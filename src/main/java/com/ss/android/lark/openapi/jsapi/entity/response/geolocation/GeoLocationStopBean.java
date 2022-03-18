package com.ss.android.lark.openapi.jsapi.entity.response.geolocation;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class GeoLocationStopBean implements BaseJSModel {
    String sceneId;

    public String getSceneId() {
        return this.sceneId;
    }

    public void setSceneId(String str) {
        this.sceneId = str;
    }
}
