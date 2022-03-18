package com.bytedance.memory.model;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class ClassNumber implements Serializable {
    private static final long serialVersionUID = -3511673943004282406L;
    private String mClassName;
    private int mCount;

    public String getClassName() {
        return this.mClassName;
    }

    public int getCount() {
        return this.mCount;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("object_class", this.mClassName);
            jSONObject.put("instance_count", this.mCount);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void setClassName(String str) {
        this.mClassName = str;
    }

    public void setCount(int i) {
        this.mCount = i;
    }
}
