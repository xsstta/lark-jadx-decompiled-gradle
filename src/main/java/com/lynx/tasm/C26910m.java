package com.lynx.tasm;

import android.content.Context;
import com.lynx.jsbridge.C26509d;
import com.lynx.jsbridge.LynxModule;
import com.lynx.tasm.analytics.LynxViewMonitor;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C26622a;
import com.lynx.tasm.behavior.C26636c;
import com.lynx.tasm.component.AbstractC26876a;
import com.lynx.tasm.p1220b.AbstractC26602b;
import com.lynx.tasm.p1220b.C26601a;
import com.lynx.tasm.provider.AbstractC26934b;
import com.lynx.tasm.provider.AbstractC26940g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* renamed from: com.lynx.tasm.m */
public class C26910m {

    /* renamed from: k */
    static Float f66811k;

    /* renamed from: a */
    AbstractC26934b f66812a;

    /* renamed from: b */
    C26636c f66813b;

    /* renamed from: c */
    List<C26509d> f66814c;

    /* renamed from: d */
    C26908k f66815d;

    /* renamed from: e */
    boolean f66816e;

    /* renamed from: f */
    boolean f66817f;

    /* renamed from: g */
    LynxViewMonitor f66818g = new LynxViewMonitor();

    /* renamed from: h */
    Float f66819h;

    /* renamed from: i */
    AbstractC26876a f66820i;

    /* renamed from: j */
    final Map<String, AbstractC26940g> f66821j = new HashMap();

    /* renamed from: l */
    boolean f66822l = true;

    /* renamed from: m */
    boolean f66823m;

    /* renamed from: n */
    ThreadStrategyForRendering f66824n = ThreadStrategyForRendering.ALL_ON_UI;

    /* renamed from: o */
    int f66825o;

    /* renamed from: p */
    int f66826p;

    /* renamed from: q */
    int f66827q = -1;

    /* renamed from: r */
    int f66828r = -1;

    public C26910m() {
        LynxEnv.m96123e().mo94092b();
        this.f66813b = new C26636c(LynxEnv.m96123e().mo94099f());
        this.f66812a = LynxEnv.m96123e().mo94100g();
        this.f66814c = new ArrayList();
        this.f66819h = null;
        Float f = f66811k;
        if (f != null) {
            this.f66819h = f;
        }
    }

    /* renamed from: b */
    public C26910m mo95731b(C26908k kVar) {
        this.f66815d = kVar;
        return this;
    }

    /* renamed from: b */
    public C26910m mo95729b(ThreadStrategyForRendering threadStrategyForRendering) {
        if (threadStrategyForRendering != null) {
            this.f66824n = threadStrategyForRendering;
        }
        return this;
    }

    /* renamed from: b */
    public C26910m mo95730b(@Nonnull C26622a aVar) {
        this.f66813b.mo94606a(aVar);
        return this;
    }

    /* renamed from: a */
    public LynxView mo95734a(Context context) {
        boolean z;
        this.f66818g.mo94367a(1);
        TraceEvent.m96443a("CreateLynxView");
        AbstractC26602b b = C26601a.m96402a().mo94482b();
        if (b == null || !b.mo94484b()) {
            z = false;
        } else {
            z = true;
        }
        this.f66817f = z;
        LynxView lynxView = new LynxView(context, this);
        if (b != null) {
            b.mo94485c();
        }
        TraceEvent.m96444b("CreateLynxView");
        this.f66818g.mo94369b(1);
        return lynxView;
    }

    /* renamed from: b */
    public C26910m mo95732b(List<C26622a> list) {
        this.f66813b.mo94607a(list);
        return this;
    }

    /* renamed from: b */
    public C26910m mo95733b(boolean z) {
        this.f66816e = z;
        return this;
    }

    /* renamed from: a */
    public void mo95726a(String str, Class<? extends LynxModule> cls) {
        mo95727a(str, cls, null);
    }

    /* renamed from: b */
    public C26910m mo95728b(int i, int i2) {
        this.f66826p = i2;
        this.f66825o = i;
        return this;
    }

    /* renamed from: c */
    public C26910m mo95735c(int i, int i2) {
        this.f66827q = i;
        this.f66828r = i2;
        return this;
    }

    /* renamed from: a */
    public void mo95727a(String str, Class<? extends LynxModule> cls, Object obj) {
        C26509d dVar = new C26509d();
        dVar.mo93991a(cls);
        dVar.mo93992a(obj);
        dVar.mo93993a(str);
        this.f66814c.add(dVar);
    }
}
