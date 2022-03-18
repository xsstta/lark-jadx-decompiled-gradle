package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.bz;
import com.google.android.play.core.internal.ca;
import com.google.android.play.core.internal.cc;
import com.google.android.play.core.splitinstall.bc;
import java.util.concurrent.Executor;

public final class au implements AbstractC22594e {

    /* renamed from: a */
    private final C22592db f55694a;

    /* renamed from: b */
    private cc<Context> f55695b;

    /* renamed from: c */
    private cc<ch> f55696c;

    /* renamed from: d */
    private cc<C22614x> f55697d;

    /* renamed from: e */
    private cc<bb> f55698e;

    /* renamed from: f */
    private cc<C22604n> f55699f;

    /* renamed from: g */
    private cc<String> f55700g = ca.m82377a(new dh(this.f55695b));

    /* renamed from: h */
    private cc<dl> f55701h = new bz();

    /* renamed from: i */
    private cc<Executor> f55702i;

    /* renamed from: j */
    private cc<bp> f55703j;

    /* renamed from: k */
    private cc<C22609s> f55704k;

    /* renamed from: l */
    private cc<aw> f55705l;

    /* renamed from: m */
    private cc<cr> f55706m;

    /* renamed from: n */
    private cc<cb> f55707n;

    /* renamed from: o */
    private cc<cf> f55708o;

    /* renamed from: p */
    private cc<ck> f55709p;

    /* renamed from: q */
    private cc<C22582ag> f55710q;

    /* renamed from: r */
    private cc<bs> f55711r;

    /* renamed from: s */
    private cc<az> f55712s;

    /* renamed from: t */
    private cc<aj> f55713t;

    /* renamed from: u */
    private cc<Executor> f55714u;

    /* renamed from: v */
    private cc<bx> f55715v;

    /* renamed from: w */
    private cc<bc> f55716w;

    /* renamed from: x */
    private cc<cx> f55717x;

    /* renamed from: y */
    private cc<Object> f55718y;

    /* synthetic */ au(C22592db dbVar) {
        this.f55694a = dbVar;
        dg dgVar = new dg(dbVar);
        this.f55695b = dgVar;
        cc<ch> a = ca.m82377a(new ci(dgVar));
        this.f55696c = a;
        this.f55697d = ca.m82377a(new C22615y(this.f55695b, a));
        cc<bb> a2 = ca.m82377a(bc.m82009a());
        this.f55698e = a2;
        this.f55699f = ca.m82377a(new C22605o(this.f55695b, a2));
        cc<Executor> a3 = ca.m82377a(dc.m82120a());
        this.f55702i = a3;
        this.f55703j = ca.m82377a(new bq(this.f55697d, this.f55701h, this.f55698e, a3));
        bz bzVar = new bz();
        this.f55704k = bzVar;
        this.f55705l = ca.m82377a(new ax(this.f55697d, this.f55701h, bzVar, this.f55698e));
        this.f55706m = ca.m82377a(new cs(this.f55697d));
        this.f55707n = ca.m82377a(new cc(this.f55697d));
        this.f55708o = ca.m82377a(new cg(this.f55697d, this.f55701h, this.f55703j, this.f55702i, this.f55698e));
        this.f55709p = ca.m82377a(new cl(this.f55697d, this.f55701h));
        cc<C22582ag> a4 = ca.m82377a(new C22583ah(this.f55701h));
        this.f55710q = a4;
        cc<bs> a5 = ca.m82377a(new bt(this.f55703j, this.f55697d, a4));
        this.f55711r = a5;
        this.f55712s = ca.m82377a(new ba(this.f55703j, this.f55701h, this.f55705l, this.f55706m, this.f55707n, this.f55708o, this.f55709p, a5));
        this.f55713t = ca.m82377a(ak.f55680a);
        cc<Executor> a6 = ca.m82377a(dj.m82130a());
        this.f55714u = a6;
        bz.m82373a(this.f55704k, ca.m82377a(new C22610t(this.f55695b, this.f55703j, this.f55712s, this.f55701h, this.f55698e, this.f55713t, this.f55702i, a6)));
        cc<bx> a7 = ca.m82377a(new C22589by(this.f55700g, this.f55704k, this.f55698e, this.f55695b, this.f55696c, this.f55702i));
        this.f55715v = a7;
        bz.m82373a(this.f55701h, ca.m82377a(new df(this.f55695b, this.f55699f, a7)));
        cc<bc> a8 = ca.m82377a(new C22593di(this.f55695b));
        this.f55716w = a8;
        cc<cx> a9 = ca.m82377a(new cy(this.f55697d, this.f55701h, this.f55704k, a8, this.f55703j, this.f55698e, this.f55713t, this.f55702i));
        this.f55717x = a9;
        this.f55718y = ca.m82377a(new de(a9, this.f55695b));
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC22594e
    /* renamed from: a */
    public final void mo78751a(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f55642a = dg.m82125a(this.f55694a);
        assetPackExtractionService.f55643b = this.f55717x.mo78728a();
        assetPackExtractionService.f55644c = this.f55697d.mo78728a();
    }
}
