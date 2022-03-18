package com.ss.android.lark.passport.infra.base.architecture.p2424a;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g.AbstractC49028a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;

/* renamed from: com.ss.android.lark.passport.infra.base.architecture.a.b */
public abstract class AbstractC49021b<M extends AbstractC49025e, V extends AbstractC49027g<VD>, VD extends AbstractC49027g.AbstractC49028a> implements AbstractC49026f<M, V> {

    /* renamed from: a */
    public V f123079a;

    /* renamed from: b */
    public UniContext f123080b;

    /* renamed from: c */
    public PassportLog f123081c;

    /* renamed from: d */
    private M f123082d;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract VD mo171180c();

    /* renamed from: d */
    public V mo171181d() {
        return this.f123079a;
    }

    /* renamed from: e */
    public M mo171182e() {
        return this.f123082d;
    }

    /* renamed from: f */
    public void mo171183f() {
        M m = this.f123082d;
        if (m != null && (m instanceof C49020a)) {
            ((C49020a) m).mo171177f();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f123081c.mo171465b("BasePresenter", "create invoked");
        V v = this.f123079a;
        if (v != null) {
            v.mo171169a();
        }
        M m = this.f123082d;
        if (m != null) {
            m.mo171169a();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f123081c.mo171465b("BasePresenter", "destroy invoked");
        M m = this.f123082d;
        if (m != null) {
            m.cn_();
        }
        C49148ac.m193806a(new Runnable() {
            /* class com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b.RunnableC490221 */

            public void run() {
                if (AbstractC49021b.this.f123079a != null) {
                    AbstractC49021b.this.f123079a.cn_();
                }
            }
        });
    }

    /* renamed from: a */
    public synchronized void mo171178a(PassportLog passportLog) {
        this.f123081c = passportLog;
        M m = this.f123082d;
        if (m != null) {
            m.mo171170a(passportLog);
        }
        V v = this.f123079a;
        if (v != null) {
            v.mo171185a(passportLog);
        }
    }

    /* renamed from: a */
    public synchronized void mo171179a(UniContext uniContext) {
        this.f123080b = uniContext;
        M m = this.f123082d;
        if (m != null) {
            m.mo171172a(uniContext);
        }
        V v = this.f123079a;
        if (v != null) {
            v.mo171186a(uniContext);
        }
    }

    public AbstractC49021b(M m, V v, UniContext uniContext, PassportLog passportLog) {
        this.f123079a = v;
        this.f123082d = m;
        if (v != null) {
            v.mo171188a(mo171180c());
        }
        mo171179a(uniContext);
        mo171178a(passportLog);
    }
}
