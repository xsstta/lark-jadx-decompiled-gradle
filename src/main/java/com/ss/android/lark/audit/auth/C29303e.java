package com.ss.android.lark.audit.auth;

import android.text.TextUtils;
import com.ss.android.lark.pb.authorization.AllPermissionData;

/* renamed from: com.ss.android.lark.audit.auth.e */
public class C29303e {

    /* renamed from: a */
    public String f73342a;

    /* renamed from: b */
    public String f73343b;

    /* renamed from: c */
    public AllPermissionData f73344c;

    /* renamed from: a */
    public boolean mo103851a() {
        if (TextUtils.isEmpty(this.f73342a) || TextUtils.isEmpty(this.f73343b) || this.f73344c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m107711a(C29303e eVar) {
        if (eVar == null || !eVar.mo103851a()) {
            return false;
        }
        return true;
    }

    public C29303e(String str, String str2, AllPermissionData allPermissionData) {
        this.f73342a = str;
        this.f73343b = str2;
        this.f73344c = allPermissionData;
    }
}
