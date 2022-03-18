package com.ss.android.ad.splash.core.model;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.i */
public class C27341i {

    /* renamed from: a */
    private String f68233a;

    /* renamed from: b */
    private int f68234b;

    /* renamed from: c */
    private long f68235c;

    /* renamed from: a */
    static C27341i m99583a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("promotion_icon")) == null) {
            return null;
        }
        return new C27341i(optJSONObject.optString("promotion_icon_url"), optJSONObject.optInt("promotion_style", 0), optJSONObject.optLong("promotion_show_time", -1));
    }

    private C27341i(String str, int i, long j) {
        this.f68233a = str;
        this.f68234b = i;
        this.f68235c = j;
    }
}
