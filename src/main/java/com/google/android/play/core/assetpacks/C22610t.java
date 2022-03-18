package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.ca;
import com.google.android.play.core.internal.cc;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.t */
public final class C22610t implements cc<C22609s> {

    /* renamed from: a */
    private final cc<Context> f55979a;

    /* renamed from: b */
    private final cc<bp> f55980b;

    /* renamed from: c */
    private final cc<az> f55981c;

    /* renamed from: d */
    private final cc<dl> f55982d;

    /* renamed from: e */
    private final cc<bb> f55983e;

    /* renamed from: f */
    private final cc<aj> f55984f;

    /* renamed from: g */
    private final cc<Executor> f55985g;

    /* renamed from: h */
    private final cc<Executor> f55986h;

    public C22610t(cc<Context> ccVar, cc<bp> ccVar2, cc<az> ccVar3, cc<dl> ccVar4, cc<bb> ccVar5, cc<aj> ccVar6, cc<Executor> ccVar7, cc<Executor> ccVar8) {
        this.f55979a = ccVar;
        this.f55980b = ccVar2;
        this.f55981c = ccVar3;
        this.f55982d = ccVar4;
        this.f55983e = ccVar5;
        this.f55984f = ccVar6;
        this.f55985g = ccVar7;
        this.f55986h = ccVar8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final /* synthetic */ C22609s mo78728a() {
        return new C22609s(((dg) this.f55979a).mo78728a(), this.f55980b.mo78728a(), this.f55981c.mo78728a(), ca.m82378b(this.f55982d), this.f55983e.mo78728a(), this.f55984f.mo78728a(), ca.m82378b(this.f55985g), ca.m82378b(this.f55986h));
    }
}
