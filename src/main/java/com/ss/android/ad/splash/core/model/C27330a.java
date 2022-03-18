package com.ss.android.ad.splash.core.model;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.a */
public class C27330a {

    /* renamed from: a */
    private String f68138a;

    /* renamed from: b */
    private String f68139b;

    /* renamed from: c */
    private String f68140c;

    /* renamed from: d */
    private String f68141d;

    public String toString() {
        return "ShareAdInfo{mTitle='" + this.f68138a + '\'' + ", mDescription='" + this.f68139b + '\'' + ", mImageUrl='" + this.f68140c + '\'' + ", mShareUrl='" + this.f68141d + '\'' + '}';
    }

    public C27330a(JSONObject jSONObject) {
        this.f68138a = jSONObject.optString("share_title");
        this.f68139b = jSONObject.optString("share_desc");
        this.f68140c = jSONObject.optString("share_icon");
        this.f68141d = jSONObject.optString("share_url");
    }
}
