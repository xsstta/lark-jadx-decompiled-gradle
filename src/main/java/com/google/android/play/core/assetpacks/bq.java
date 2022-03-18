package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.ca;
import com.google.android.play.core.internal.cc;
import java.util.concurrent.Executor;

public final class bq implements cc<bp> {

    /* renamed from: a */
    private final cc<C22614x> f55799a;

    /* renamed from: b */
    private final cc<dl> f55800b;

    /* renamed from: c */
    private final cc<bb> f55801c;

    /* renamed from: d */
    private final cc<Executor> f55802d;

    public bq(cc<C22614x> ccVar, cc<dl> ccVar2, cc<bb> ccVar3, cc<Executor> ccVar4) {
        this.f55799a = ccVar;
        this.f55800b = ccVar2;
        this.f55801c = ccVar3;
        this.f55802d = ccVar4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final /* synthetic */ bp mo78728a() {
        C22614x a = this.f55799a.mo78728a();
        return new bp(a, ca.m82378b(this.f55800b), this.f55801c.mo78728a(), ca.m82378b(this.f55802d));
    }
}
