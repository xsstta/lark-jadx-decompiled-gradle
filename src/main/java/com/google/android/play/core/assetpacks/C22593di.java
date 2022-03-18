package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.bd;
import com.google.android.play.core.internal.cc;
import com.google.android.play.core.splitinstall.bc;

/* renamed from: com.google.android.play.core.assetpacks.di */
public final class C22593di implements cc<bc> {

    /* renamed from: a */
    private final cc<Context> f55919a;

    public C22593di(cc<Context> ccVar) {
        this.f55919a = ccVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final /* synthetic */ bc mo78728a() {
        Context b = ((dg) this.f55919a).mo78728a();
        bc bcVar = new bc(b, b.getPackageName());
        bd.m82322a(bcVar, "Cannot return null from a non-@Nullable @Provides method");
        return bcVar;
    }
}
