package com.ss.android.lark.audit.p1377a;

import android.text.TextUtils;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.audit.a.e */
public class C29288e {

    /* renamed from: a */
    private AbstractC29324f f73316a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.audit.a.e$a */
    public static class C29290a {

        /* renamed from: a */
        public static final C29288e f73317a = new C29288e();
    }

    private C29288e() {
    }

    /* renamed from: a */
    public static C29288e m107657a() {
        return C29290a.f73317a;
    }

    /* renamed from: b */
    public void mo103815b() {
        mo103814a("audit_event", true, (String) null, (String) null);
    }

    /* renamed from: c */
    public void mo103817c() {
        mo103814a("audit_pull_permission", true, (String) null, (String) null);
    }

    /* renamed from: a */
    public void mo103809a(AbstractC29324f fVar) {
        this.f73316a = fVar;
    }

    /* renamed from: a */
    public void mo103810a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, "audit_check_auth");
            jSONObject.put("check_auth_result", str);
            mo103812a("audit_sdk_overall", jSONObject, (JSONObject) null, (JSONObject) null);
        } catch (JSONException e) {
            C29287d.m107656a("Audit_Monitor", e);
        }
    }

    /* renamed from: a */
    public void mo103811a(String str, String str2) {
        mo103814a("audit_event", false, str, str2);
    }

    /* renamed from: b */
    public void mo103816b(String str, String str2) {
        mo103814a("audit_pull_permission", false, str, str2);
    }

    /* renamed from: a */
    public void mo103813a(String str, boolean z) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, "audit_check_cache");
            if (z) {
                str2 = "success";
            } else {
                str2 = "other";
            }
            jSONObject.put("result", str2);
            jSONObject.put("check_cache_source", str);
            mo103812a("audit_sdk_overall", jSONObject, (JSONObject) null, (JSONObject) null);
        } catch (JSONException e) {
            C29287d.m107656a("Audit_Monitor", e);
        }
    }

    /* renamed from: a */
    public void mo103812a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        AbstractC29324f fVar = this.f73316a;
        if (fVar == null) {
            Log.m165383e("Audit_Monitor", "Monitor not init!");
        } else {
            fVar.mo103866a(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    /* renamed from: a */
    public void mo103814a(String str, boolean z, String str2, String str3) {
        String str4;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, str);
            if (z) {
                str4 = "success";
            } else {
                str4 = "other";
            }
            jSONObject.put("result", str4);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("error_code", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("error_msg", str3);
            }
            mo103812a("audit_sdk_overall", jSONObject, (JSONObject) null, (JSONObject) null);
        } catch (JSONException e) {
            C29287d.m107656a("Audit_Monitor", e);
        }
    }
}
