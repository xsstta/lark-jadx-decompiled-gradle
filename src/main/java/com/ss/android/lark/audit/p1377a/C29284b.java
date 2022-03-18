package com.ss.android.lark.audit.p1377a;

import android.text.TextUtils;
import com.ss.android.lark.audit.AbstractC29324f;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.audit.a.b */
public class C29284b {
    /* renamed from: a */
    public static long m107642a(AbstractC29324f fVar, long j) {
        return m107643a(fVar, "permission_auto_update_interval", j);
    }

    /* renamed from: b */
    public static long m107644b(AbstractC29324f fVar, long j) {
        return m107643a(fVar, "permission_update_threshold", j);
    }

    /* renamed from: a */
    public static long m107643a(AbstractC29324f fVar, String str, long j) {
        if (fVar != null && !TextUtils.isEmpty(str)) {
            String a = fVar.mo103861a("audit_sdk_config");
            if (TextUtils.isEmpty(a)) {
                return j;
            }
            try {
                return new JSONObject(a).optLong(str, j);
            } catch (Exception e) {
                C29287d.m107656a("AuditConfig", e);
            }
        }
        return j;
    }
}
