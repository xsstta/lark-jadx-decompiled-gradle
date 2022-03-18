package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.C0513a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.s */
public class C21684s extends cf {

    /* renamed from: e */
    private final C0513a<cc<?>> f52878e = new C0513a<>();

    /* renamed from: f */
    private C21661c f52879f;

    /* renamed from: a */
    public static void m78767a(Activity activity, C21661c cVar, cc<?> ccVar) {
        AbstractC21667e a = m78340a(activity);
        C21684s sVar = (C21684s) a.mo73471a("ConnectionlessLifecycleHelper", C21684s.class);
        if (sVar == null) {
            sVar = new C21684s(a);
        }
        sVar.f52879f = cVar;
        Preconditions.checkNotNull(ccVar, "ApiKey cannot be null");
        sVar.f52878e.add(ccVar);
        cVar.mo73418a(sVar);
    }

    private C21684s(AbstractC21667e eVar) {
        super(eVar);
        this.f52619a.mo73472a("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.cf, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: b */
    public void mo73329b() {
        super.mo73329b();
        m78768i();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: c */
    public void mo73331c() {
        super.mo73331c();
        m78768i();
    }

    @Override // com.google.android.gms.common.api.internal.cf, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public void mo73332d() {
        super.mo73332d();
        this.f52879f.mo73421b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.cf
    /* renamed from: a */
    public final void mo73451a(ConnectionResult connectionResult, int i) {
        this.f52879f.mo73420b(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.cf
    /* renamed from: f */
    public final void mo73452f() {
        this.f52879f.mo73423d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C0513a<cc<?>> mo73504g() {
        return this.f52878e;
    }

    /* renamed from: i */
    private final void m78768i() {
        if (!this.f52878e.isEmpty()) {
            this.f52879f.mo73418a(this);
        }
    }
}
