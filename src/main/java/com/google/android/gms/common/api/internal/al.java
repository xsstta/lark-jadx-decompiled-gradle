package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC21631d;
import java.util.concurrent.atomic.AtomicReference;

final class al implements AbstractC21631d.AbstractC21633b {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f52661a;

    /* renamed from: b */
    private final /* synthetic */ C21676k f52662b;

    /* renamed from: c */
    private final /* synthetic */ aj f52663c;

    al(aj ajVar, AtomicReference atomicReference, C21676k kVar) {
        this.f52663c = ajVar;
        this.f52661a = atomicReference;
        this.f52662b = kVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnected(Bundle bundle) {
        this.f52663c.m78369a((AbstractC21631d) this.f52661a.get(), this.f52662b, true);
    }
}
