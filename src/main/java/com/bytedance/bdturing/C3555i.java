package com.bytedance.bdturing;

import com.bytedance.bdturing.p207c.C3534c;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.i */
public class C3555i {

    /* renamed from: a */
    private WeakReference<DialogC3559k> f11240a;

    /* renamed from: b */
    private long f11241b;

    /* renamed from: c */
    private long f11242c;

    /* renamed from: d */
    private boolean f11243d;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.bdturing.i$a */
    public static class C3557a {

        /* renamed from: a */
        public static C3555i f11244a = new C3555i();
    }

    /* renamed from: d */
    public void mo14366d() {
        this.f11243d = true;
    }

    private C3555i() {
    }

    /* renamed from: a */
    public static C3555i m15002a() {
        return C3557a.f11244a;
    }

    /* renamed from: b */
    public long mo14364b() {
        return this.f11241b;
    }

    /* renamed from: c */
    public long mo14365c() {
        return this.f11242c;
    }

    /* renamed from: a */
    public boolean mo14363a(int i) {
        WeakReference<DialogC3559k> weakReference = this.f11240a;
        if (weakReference == null) {
            return false;
        }
        DialogC3559k kVar = weakReference.get();
        if (!this.f11243d || kVar == null || i != kVar.mo14372c().mo14348f()) {
            return false;
        }
        this.f11243d = false;
        this.f11242c = System.currentTimeMillis();
        kVar.mo14370a(C3534c.m14872a(1, "bytedcert.refreshVerifyView", "call", new JSONObject(), "bytedcert.refreshVerifyView"));
        kVar.show();
        return true;
    }
}
