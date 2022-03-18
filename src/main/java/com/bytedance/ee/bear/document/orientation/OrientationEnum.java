package com.bytedance.ee.bear.document.orientation;

import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

public enum OrientationEnum {
    LANDSCAPE("landscape"),
    PORTRAIT("portrait");
    
    private String type;

    public String getType() {
        return this.type;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121869d, (Object) this.type);
        return jSONObject;
    }

    public void setType(String str) {
        this.type = str;
    }

    private OrientationEnum(String str) {
        this.type = str;
    }
}
