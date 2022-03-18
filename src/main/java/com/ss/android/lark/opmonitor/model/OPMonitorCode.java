package com.ss.android.lark.opmonitor.model;

import com.ss.android.lark.log.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class OPMonitorCode {
    public String ID;
    public int code;
    public String domain;
    public OPMonitorLevel level;
    public String message;
    private int version = 1;

    public int hashCode() {
        return this.ID.hashCode();
    }

    private String generateID() {
        return this.version + "-" + this.domain + "-" + this.code;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OPMonitorCode)) {
            return false;
        }
        return this.ID.equals(((OPMonitorCode) obj).ID);
    }

    public static OPMonitorCode fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new OPMonitorCode(jSONObject.getString("domain"), jSONObject.getInt("code"), OPMonitorLevel.forNumber(jSONObject.getInt("level")), jSONObject.getString("message"));
        } catch (JSONException e) {
            Log.m165384e("OPMonitorCode", "fromJson is exception", e);
            return null;
        }
    }

    public OPMonitorCode(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        this.domain = str;
        this.code = i;
        this.level = oPMonitorLevel;
        this.message = str2;
        this.ID = generateID();
    }
}
