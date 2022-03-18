package com.ss.android.lark.audit.auth;

import android.content.Context;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.audit.auth.c */
public class C29299c implements AbstractC29324f.AbstractC29326b {

    /* renamed from: a */
    private volatile Context f73338a;

    /* renamed from: b */
    private volatile boolean f73339b;

    /* renamed from: c */
    private C29302d f73340c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.audit.auth.c$a */
    public static class C29301a {

        /* renamed from: a */
        public static final C29299c f73341a = new C29299c();
    }

    private C29299c() {
    }

    /* renamed from: a */
    public static C29299c m107708a() {
        return C29301a.f73341a;
    }

    /* renamed from: b */
    private boolean m107709b() {
        if (this.f73338a == null || !this.f73339b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void mo103845a(Context context) {
        if (!m107709b()) {
            this.f73338a = context;
            this.f73340c = new C29302d(context);
            this.f73339b = true;
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void deletePermissionData(String str) {
        if (!m107709b()) {
            Log.m165383e("AuditPerm_PermDataHandler", "delete permission data failed for unInited status!");
        } else {
            this.f73340c.deletePermissionData(str);
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public TransactionalPermData queryPermissionData(String str) {
        if (m107709b()) {
            return this.f73340c.queryPermissionData(str);
        }
        Log.m165383e("AuditPerm_PermDataHandler", "query permission data failed for unInited status!");
        return null;
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void savePermissionData(String str, String str2, byte[] bArr, byte[] bArr2) {
        if (!m107709b()) {
            Log.m165383e("AuditPerm_PermDataHandler", "save permission data failed for unInited status!");
        } else {
            this.f73340c.savePermissionData(str, str2, bArr, bArr2);
        }
    }
}
