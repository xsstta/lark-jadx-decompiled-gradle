package com.ss.android.lark.browser.biz.dybrid.model;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import org.json.JSONObject;

public class TeaTrackerModel implements BaseJSModel {
    private String eventName;
    private JSONObject eventParams;

    public String getEventName() {
        return this.eventName;
    }

    public JSONObject getEventParams() {
        return this.eventParams;
    }

    public void setEventName(String str) {
        this.eventName = str;
    }

    public void setEventParams(JSONObject jSONObject) {
        this.eventParams = jSONObject;
    }
}
