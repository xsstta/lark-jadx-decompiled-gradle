package com.bytedance.push.p883e;

import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.e.d */
public class C20409d {

    /* renamed from: a */
    public long f49886a;

    /* renamed from: b */
    public String f49887b;

    /* renamed from: c */
    public int f49888c;

    /* renamed from: d */
    private String f49889d;

    /* renamed from: e */
    private String f49890e;

    /* renamed from: f */
    private String f49891f;

    /* renamed from: a */
    public JSONObject mo68828a() {
        if (this.f49888c <= 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareHitPoint.f121869d, this.f49888c);
            jSONObject.put("token", this.f49887b);
            jSONObject.put("did", this.f49889d);
            jSONObject.put("dlid", this.f49890e);
            jSONObject.put("vc", this.f49891f);
            jSONObject.put("t", this.f49886a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "{updateTime=" + this.f49886a + ", deviceId='" + this.f49889d + '\'' + ", deviceLoginId='" + this.f49890e + '\'' + ", versionCode='" + this.f49891f + '\'' + ", token='" + this.f49887b + '\'' + ", type=" + this.f49888c + '}';
    }

    /* renamed from: a */
    public static C20409d m74343a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt(ShareHitPoint.f121869d);
        String optString = jSONObject.optString("token");
        String optString2 = jSONObject.optString("did");
        String optString3 = jSONObject.optString("dlid");
        String optString4 = jSONObject.optString("vc");
        long optLong = jSONObject.optLong("t");
        if (optInt <= 0) {
            return null;
        }
        return new C20409d(optInt, optString, optString2, optString3, optString4, optLong);
    }

    /* renamed from: a */
    public boolean mo68829a(C20409d dVar) {
        if (dVar == this) {
            return true;
        }
        if (dVar.f49888c != this.f49888c || !TextUtils.equals(this.f49891f, dVar.f49891f) || !TextUtils.equals(this.f49887b, dVar.f49887b) || !TextUtils.equals(this.f49889d, dVar.f49889d) || !TextUtils.equals(this.f49890e, dVar.f49890e)) {
            return false;
        }
        return true;
    }

    public C20409d(int i, String str, String str2, String str3, String str4, long j) {
        this.f49888c = i;
        this.f49887b = str;
        this.f49889d = str2;
        this.f49890e = str3;
        this.f49891f = str4;
        this.f49886a = j;
    }
}
