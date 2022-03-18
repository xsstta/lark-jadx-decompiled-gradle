package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zaj;

final class bn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zaj f52710a;

    /* renamed from: b */
    private final /* synthetic */ zace f52711b;

    bn(zace zace, zaj zaj) {
        this.f52711b = zace;
        this.f52710a = zaj;
    }

    public final void run() {
        this.f52711b.zac(this.f52710a);
    }
}
