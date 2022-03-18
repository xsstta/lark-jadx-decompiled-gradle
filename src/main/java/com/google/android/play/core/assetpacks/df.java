package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.bd;
import com.google.android.play.core.internal.ca;
import com.google.android.play.core.internal.cc;

public final class df implements cc<dl> {

    /* renamed from: a */
    private final cc<Context> f55914a;

    /* renamed from: b */
    private final cc<C22604n> f55915b;

    /* renamed from: c */
    private final cc<bx> f55916c;

    public df(cc<Context> ccVar, cc<C22604n> ccVar2, cc<bx> ccVar3) {
        this.f55914a = ccVar;
        this.f55915b = ccVar2;
        this.f55916c = ccVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final /* synthetic */ dl mo78728a() {
        dl dlVar = (dl) (C22592db.m82118a(((dg) this.f55914a).mo78728a()) == null ? ca.m82378b(this.f55915b).mo78909a() : ca.m82378b(this.f55916c).mo78909a());
        bd.m82322a(dlVar, "Cannot return null from a non-@Nullable @Provides method");
        return dlVar;
    }
}
