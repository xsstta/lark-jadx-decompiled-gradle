package com.chad.library.adapter.base.p937d;

import com.chad.library.adapter.base.C20923c;

/* renamed from: com.chad.library.adapter.base.d.a */
public abstract class AbstractC20926a {

    /* renamed from: a */
    private int f51253a = 1;

    /* renamed from: b */
    private boolean f51254b;

    /* renamed from: c */
    public abstract int mo70754c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo70755d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo70756e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo70757f();

    /* renamed from: a */
    public int mo70750a() {
        return this.f51253a;
    }

    /* renamed from: b */
    public final boolean mo70753b() {
        if (mo70757f() == 0) {
            return true;
        }
        return this.f51254b;
    }

    /* renamed from: a */
    public void mo70751a(int i) {
        this.f51253a = i;
    }

    /* renamed from: a */
    public void mo70752a(C20923c cVar) {
        int i = this.f51253a;
        if (i == 1) {
            m76272a(cVar, false);
            m76273b(cVar, false);
            m76274c(cVar, false);
        } else if (i == 2) {
            m76272a(cVar, true);
            m76273b(cVar, false);
            m76274c(cVar, false);
        } else if (i == 3) {
            m76272a(cVar, false);
            m76273b(cVar, true);
            m76274c(cVar, false);
        } else if (i == 4) {
            m76272a(cVar, false);
            m76273b(cVar, false);
            m76274c(cVar, true);
        }
    }

    /* renamed from: a */
    private void m76272a(C20923c cVar, boolean z) {
        cVar.mo70738a(mo70755d(), z);
    }

    /* renamed from: b */
    private void m76273b(C20923c cVar, boolean z) {
        cVar.mo70738a(mo70756e(), z);
    }

    /* renamed from: c */
    private void m76274c(C20923c cVar, boolean z) {
        int f = mo70757f();
        if (f != 0) {
            cVar.mo70738a(f, z);
        }
    }
}
