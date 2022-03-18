package com.ss.android.lark.statistics.entity;

import java.io.Serializable;
import org.json.JSONObject;

public class HitPointEntity implements Serializable {
    private static final long serialVersionUID = -420361234508834009L;
    private String event;
    private JSONObject params;

    public String getEvent() {
        return this.event;
    }

    public JSONObject getParams() {
        return this.params;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setParams(JSONObject jSONObject) {
        this.params = jSONObject;
    }
}
