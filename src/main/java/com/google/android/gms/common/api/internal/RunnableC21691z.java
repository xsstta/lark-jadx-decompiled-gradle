package com.google.android.gms.common.api.internal;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.z */
public final class RunnableC21691z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C21690y f52908a;

    RunnableC21691z(C21690y yVar) {
        this.f52908a = yVar;
    }

    public final void run() {
        this.f52908a.f52890d.cancelAvailabilityErrorNotifications(this.f52908a.f52889c);
    }
}
