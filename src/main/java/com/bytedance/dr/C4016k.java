package com.bytedance.dr;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.dr.k */
public final class C4016k {

    /* renamed from: a */
    final String f12175a;

    /* renamed from: b */
    final String f12176b;

    /* renamed from: c */
    final Boolean f12177c;

    /* renamed from: d */
    final Long f12178d;

    /* renamed from: e */
    final Long f12179e;

    /* renamed from: f */
    final Integer f12180f;

    /* renamed from: g */
    final Long f12181g;

    public String toString() {
        return mo15751b().toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public JSONObject mo15751b() {
        JSONObject jSONObject = new JSONObject();
        C4011h.m16686a(jSONObject, "id", this.f12175a);
        C4011h.m16686a(jSONObject, "req_id", this.f12176b);
        C4011h.m16686a(jSONObject, "is_track_limited", this.f12177c);
        C4011h.m16686a(jSONObject, "take_ms", this.f12178d);
        C4011h.m16686a(jSONObject, "time", this.f12179e);
        C4011h.m16686a(jSONObject, "query_times", this.f12180f);
        C4011h.m16686a(jSONObject, "hw_id_version_code", this.f12181g);
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, String> mo15750a() {
        HashMap hashMap = new HashMap();
        C4011h.m16685a(hashMap, "id", this.f12175a);
        C4011h.m16685a(hashMap, "req_id", this.f12176b);
        C4011h.m16685a(hashMap, "is_track_limited", String.valueOf(this.f12177c));
        C4011h.m16685a(hashMap, "take_ms", String.valueOf(this.f12178d));
        C4011h.m16685a(hashMap, "time", String.valueOf(this.f12179e));
        C4011h.m16685a(hashMap, "query_times", String.valueOf(this.f12180f));
        C4011h.m16685a(hashMap, "hw_id_version_code", String.valueOf(this.f12181g));
        return hashMap;
    }

    /* renamed from: a */
    static C4016k m16693a(String str) {
        Boolean bool;
        Long l;
        Long l2;
        Integer num;
        Long l3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("id", null);
            String optString2 = jSONObject.optString("req_id", null);
            if (jSONObject.has("is_track_limited")) {
                bool = Boolean.valueOf(jSONObject.optBoolean("is_track_limited"));
            } else {
                bool = null;
            }
            if (jSONObject.has("take_ms")) {
                l = Long.valueOf(jSONObject.optLong("take_ms", -1));
            } else {
                l = null;
            }
            if (jSONObject.has("time")) {
                l2 = Long.valueOf(jSONObject.optLong("time", -1));
            } else {
                l2 = null;
            }
            if (jSONObject.has("query_times")) {
                num = Integer.valueOf(jSONObject.optInt("query_times", -1));
            } else {
                num = null;
            }
            if (jSONObject.has("hw_id_version_code")) {
                l3 = Long.valueOf(jSONObject.optLong("hw_id_version_code", -1));
            } else {
                l3 = null;
            }
            return new C4016k(optString, optString2, bool, l, l2, num, l3);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    C4016k(String str, String str2, Boolean bool, Long l, Long l2, Integer num, Long l3) {
        this.f12175a = str;
        this.f12176b = str2;
        this.f12177c = bool;
        this.f12178d = l;
        this.f12179e = l2;
        this.f12180f = num;
        this.f12181g = l3;
    }
}
