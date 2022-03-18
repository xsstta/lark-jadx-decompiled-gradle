package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.bd;

/* renamed from: com.google.android.play.core.assetpacks.at */
public final class C22585at {

    /* renamed from: a */
    private C22592db f55693a;

    private C22585at() {
    }

    /* synthetic */ C22585at(byte[] bArr) {
    }

    /* renamed from: a */
    public final AbstractC22594e mo78749a() {
        C22592db dbVar = this.f55693a;
        if (dbVar != null) {
            return new au(dbVar);
        }
        throw new IllegalStateException(String.valueOf(C22592db.class.getCanonicalName()).concat(" must be set"));
    }

    /* renamed from: a */
    public final void mo78750a(C22592db dbVar) {
        bd.m82321a(dbVar);
        this.f55693a = dbVar;
    }
}
