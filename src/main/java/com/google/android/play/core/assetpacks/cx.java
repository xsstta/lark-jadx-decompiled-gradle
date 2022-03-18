package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.AbstractC22633by;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.splitinstall.bc;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class cx {

    /* renamed from: a */
    private static final C22630b f55890a = new C22630b("AssetPackManager");

    /* renamed from: b */
    private final C22614x f55891b;

    /* renamed from: c */
    private final AbstractC22633by<dl> f55892c;

    /* renamed from: d */
    private final C22609s f55893d;

    /* renamed from: e */
    private final bc f55894e;

    /* renamed from: f */
    private final bp f55895f;

    /* renamed from: g */
    private final bb f55896g;

    /* renamed from: h */
    private final aj f55897h;

    /* renamed from: i */
    private final AbstractC22633by<Executor> f55898i;

    /* renamed from: j */
    private final Handler f55899j = new Handler(Looper.getMainLooper());

    cx(C22614x xVar, AbstractC22633by<dl> byVar, C22609s sVar, bc bcVar, bp bpVar, bb bbVar, aj ajVar, AbstractC22633by<Executor> byVar2) {
        this.f55891b = xVar;
        this.f55892c = byVar;
        this.f55893d = sVar;
        this.f55894e = bcVar;
        this.f55895f = bpVar;
        this.f55896g = bbVar;
        this.f55897h = ajVar;
        this.f55898i = byVar2;
    }

    /* renamed from: b */
    private final void m82107b() {
        this.f55898i.mo78909a().execute(new cu(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo78807a() {
        C22614x xVar = this.f55891b;
        xVar.getClass();
        this.f55892c.mo78909a().mo78779a(this.f55891b.mo78832b()).addOnSuccessListener(this.f55898i.mo78909a(), cv.m82104a(xVar)).addOnFailureListener(this.f55898i.mo78909a(), cw.f55889a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78808a(boolean z) {
        boolean a = this.f55893d.mo78659a();
        this.f55893d.mo78658a(z);
        if (z && !a) {
            m82107b();
        }
    }
}
