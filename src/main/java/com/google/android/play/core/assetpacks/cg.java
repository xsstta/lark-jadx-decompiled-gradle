package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.ca;
import com.google.android.play.core.internal.cc;
import java.util.concurrent.Executor;

public final class cg implements cc<cf> {

    /* renamed from: a */
    private final cc<C22614x> f55848a;

    /* renamed from: b */
    private final cc<dl> f55849b;

    /* renamed from: c */
    private final cc<bp> f55850c;

    /* renamed from: d */
    private final cc<Executor> f55851d;

    /* renamed from: e */
    private final cc<bb> f55852e;

    public cg(cc<C22614x> ccVar, cc<dl> ccVar2, cc<bp> ccVar3, cc<Executor> ccVar4, cc<bb> ccVar5) {
        this.f55848a = ccVar;
        this.f55849b = ccVar2;
        this.f55850c = ccVar3;
        this.f55851d = ccVar4;
        this.f55852e = ccVar5;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final /* synthetic */ cf mo78728a() {
        C22614x a = this.f55848a.mo78728a();
        return new cf(a, ca.m82378b(this.f55849b), this.f55850c.mo78728a(), ca.m82378b(this.f55851d), this.f55852e.mo78728a());
    }
}
