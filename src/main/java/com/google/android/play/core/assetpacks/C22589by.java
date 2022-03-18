package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.ca;
import com.google.android.play.core.internal.cc;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.by */
public final class C22589by implements cc<bx> {

    /* renamed from: a */
    private final cc<String> f55827a;

    /* renamed from: b */
    private final cc<C22609s> f55828b;

    /* renamed from: c */
    private final cc<bb> f55829c;

    /* renamed from: d */
    private final cc<Context> f55830d;

    /* renamed from: e */
    private final cc<ch> f55831e;

    /* renamed from: f */
    private final cc<Executor> f55832f;

    public C22589by(cc<String> ccVar, cc<C22609s> ccVar2, cc<bb> ccVar3, cc<Context> ccVar4, cc<ch> ccVar5, cc<Executor> ccVar6) {
        this.f55827a = ccVar;
        this.f55828b = ccVar2;
        this.f55829c = ccVar3;
        this.f55830d = ccVar4;
        this.f55831e = ccVar5;
        this.f55832f = ccVar6;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final /* synthetic */ bx mo78728a() {
        String a = this.f55827a.mo78728a();
        C22609s a2 = this.f55828b.mo78728a();
        bb a3 = this.f55829c.mo78728a();
        Context b = ((dg) this.f55830d).mo78728a();
        ch a4 = this.f55831e.mo78728a();
        return new bx(a != null ? new File(b.getExternalFilesDir(null), a) : b.getExternalFilesDir(null), a2, a3, b, a4, ca.m82378b(this.f55832f));
    }
}
