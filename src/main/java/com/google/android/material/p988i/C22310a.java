package com.google.android.material.p988i;

import android.graphics.Typeface;

/* renamed from: com.google.android.material.i.a */
public final class C22310a extends AbstractC22318f {

    /* renamed from: a */
    private final Typeface f54590a;

    /* renamed from: b */
    private final AbstractC22311a f54591b;

    /* renamed from: c */
    private boolean f54592c;

    /* renamed from: com.google.android.material.i.a$a */
    public interface AbstractC22311a {
        /* renamed from: a */
        void mo77668a(Typeface typeface);
    }

    /* renamed from: a */
    public void mo77667a() {
        this.f54592c = true;
    }

    @Override // com.google.android.material.p988i.AbstractC22318f
    /* renamed from: a */
    public void mo77071a(int i) {
        m80784a(this.f54590a);
    }

    /* renamed from: a */
    private void m80784a(Typeface typeface) {
        if (!this.f54592c) {
            this.f54591b.mo77668a(typeface);
        }
    }

    public C22310a(AbstractC22311a aVar, Typeface typeface) {
        this.f54590a = typeface;
        this.f54591b = aVar;
    }

    @Override // com.google.android.material.p988i.AbstractC22318f
    /* renamed from: a */
    public void mo77072a(Typeface typeface, boolean z) {
        m80784a(typeface);
    }
}
