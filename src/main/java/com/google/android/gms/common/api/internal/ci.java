package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class ci extends be {

    /* renamed from: a */
    private final /* synthetic */ Dialog f52801a;

    /* renamed from: b */
    private final /* synthetic */ ch f52802b;

    ci(ch chVar, Dialog dialog) {
        this.f52802b = chVar;
        this.f52801a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.be
    /* renamed from: a */
    public final void mo73361a() {
        this.f52802b.f52799a.mo73457h();
        if (this.f52801a.isShowing()) {
            this.f52801a.dismiss();
        }
    }
}
