package com.ss.videoarch.liveplayer.log;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class LiveError extends Error {
    public int code;
    public Map info;
    public long timeStamp = System.currentTimeMillis();

    public String getInfoJSON() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("message", super.toString());
        } catch (JSONException e) {
            Log.d("Live Error", e.toString());
        }
        return jSONObject.toString();
    }

    public String toString() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("message", super.toString());
            jSONObject.put("code", this.code);
            jSONObject.put("timestamp", this.timeStamp);
        } catch (JSONException e) {
            Log.d("Live Error", e.toString());
        }
        return jSONObject.toString();
    }

    public LiveError(int i, String str, Map<String, String> map) {
        super(str);
        this.code = i;
        this.info = map;
    }
}
