package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.base.HandlerC21909h;
import java.util.concurrent.atomic.AtomicReference;

public abstract class cf extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    protected volatile boolean f52793b;

    /* renamed from: c */
    protected final AtomicReference<cg> f52794c;

    /* renamed from: d */
    protected final C21608a f52795d;

    /* renamed from: e */
    private final Handler f52796e;

    protected cf(AbstractC21667e eVar) {
        this(eVar, C21608a.m78228a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73451a(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo73452f();

    private cf(AbstractC21667e eVar, C21608a aVar) {
        super(eVar);
        this.f52794c = new AtomicReference<>(null);
        this.f52796e = new HandlerC21909h(Looper.getMainLooper());
        this.f52795d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo73451a(new ConnectionResult(13, null), m78625a(this.f52794c.get()));
        mo73457h();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public void mo73327a(Bundle bundle) {
        super.mo73327a(bundle);
        if (bundle != null) {
            this.f52794c.set(bundle.getBoolean("resolving_error", false) ? new cg(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: b */
    public void mo73330b(Bundle bundle) {
        super.mo73330b(bundle);
        cg cgVar = this.f52794c.get();
        if (cgVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", cgVar.mo73459a());
            bundle.putInt("failed_status", cgVar.mo73460b().getErrorCode());
            bundle.putParcelable("failed_resolution", cgVar.mo73460b().getResolution());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: b */
    public void mo73329b() {
        super.mo73329b();
        this.f52793b = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73326a(int r4, int r5, android.content.Intent r6) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.cf.mo73326a(int, int, android.content.Intent):void");
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public void mo73332d() {
        super.mo73332d();
        this.f52793b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo73457h() {
        this.f52794c.set(null);
        mo73452f();
    }

    /* renamed from: b */
    public final void mo73456b(ConnectionResult connectionResult, int i) {
        cg cgVar = new cg(connectionResult, i);
        if (this.f52794c.compareAndSet(null, cgVar)) {
            this.f52796e.post(new ch(this, cgVar));
        }
    }

    /* renamed from: a */
    private static int m78625a(cg cgVar) {
        if (cgVar == null) {
            return -1;
        }
        return cgVar.mo73459a();
    }
}
