package com.bytedance.ee.appstrategy;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class OpenAppStrategyDataWrapper {

    /* renamed from: a */
    public int f12588a;

    /* renamed from: b */
    public int f12589b;

    /* renamed from: c */
    public String f12590c;

    /* renamed from: d */
    public String f12591d;

    /* renamed from: e */
    public Map<String, Serializable> f12592e;

    public enum DataVersion {
        V1,
        V2
    }

    private OpenAppStrategyDataWrapper() {
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, Integer.valueOf(this.f12588a));
            jSONObject.putOpt("code", Integer.valueOf(this.f12589b));
            jSONObject.putOpt("err_msg", this.f12590c);
            jSONObject.putOpt("content", this.f12591d);
            Map<String, Serializable> map = this.f12592e;
            if (map != null && !map.isEmpty()) {
                jSONObject.putOpt("extras", new JSONObject(this.f12592e));
            }
        } catch (JSONException e) {
            Log.m165384e("AppStrategyDataWrapper", "", e);
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static OpenAppStrategyDataWrapper m17241a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        OpenAppStrategyDataWrapper openAppStrategyDataWrapper = new OpenAppStrategyDataWrapper();
        openAppStrategyDataWrapper.f12588a = jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        openAppStrategyDataWrapper.f12589b = jSONObject.optInt("code");
        openAppStrategyDataWrapper.f12590c = jSONObject.optString("err_msg");
        openAppStrategyDataWrapper.f12591d = jSONObject.optString("content");
        JSONObject optJSONObject = jSONObject.optJSONObject("extras");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, (Serializable) optJSONObject.opt(next));
            }
            openAppStrategyDataWrapper.f12592e = hashMap;
        }
        return openAppStrategyDataWrapper;
    }

    public OpenAppStrategyDataWrapper(DataVersion dataVersion, int i, String str, String str2, Map map) {
        this.f12588a = dataVersion.ordinal();
        this.f12589b = i;
        this.f12590c = str;
        this.f12591d = str2;
        this.f12592e = map;
    }
}
