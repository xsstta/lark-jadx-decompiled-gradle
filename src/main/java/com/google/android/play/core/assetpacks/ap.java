package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C22741m;

final class ap extends al<Void> {

    /* renamed from: c */
    final int f55685c;

    /* renamed from: d */
    final String f55686d;

    /* renamed from: e */
    final int f55687e;

    /* renamed from: f */
    final /* synthetic */ C22604n f55688f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ap(C22604n nVar, C22741m<Void> mVar, int i, String str, int i2) {
        super(nVar, mVar);
        this.f55688f = nVar;
        this.f55685c = i;
        this.f55686d = str;
        this.f55687e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: a */
    public final void mo78739a(Bundle bundle) {
        this.f55688f.f55959e.mo78858a();
        int i = bundle.getInt("error_code");
        C22604n.f55955a.mo78873b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f55687e;
        if (i2 > 0) {
            this.f55688f.m82154a(this.f55685c, this.f55686d, i2 - 1);
        }
    }
}
