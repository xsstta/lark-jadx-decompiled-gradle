package com.ss.videoarch.liveplayer.p3251b;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.b.c */
public final class C65613c {

    /* renamed from: a */
    public final String f165157a;

    /* renamed from: b */
    public final String f165158b;

    /* renamed from: c */
    public String f165159c;

    /* renamed from: a */
    public String mo229618a() {
        JSONObject jSONObject;
        try {
            if (this.f165159c != null) {
                jSONObject = new JSONObject(this.f165159c);
                if (jSONObject == null && jSONObject.has("VCodec")) {
                    String optString = jSONObject.optString("VCodec");
                    if (!TextUtils.isEmpty(optString)) {
                        return optString;
                    }
                    return null;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jSONObject = null;
        return jSONObject == null ? null : null;
    }

    public C65613c(String str, String str2, String str3) {
        this.f165157a = str;
        this.f165158b = str2;
        this.f165159c = str3;
    }
}
