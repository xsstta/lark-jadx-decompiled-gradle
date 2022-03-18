package com.google.firebase.components;

import com.google.firebase.p995a.AbstractC22752a;

/* renamed from: com.google.firebase.components.g */
final /* synthetic */ class C22766g implements AbstractC22752a {

    /* renamed from: a */
    private final C22765f f56302a;

    /* renamed from: b */
    private final Component f56303b;

    private C22766g(C22765f fVar, Component component) {
        this.f56302a = fVar;
        this.f56303b = component;
    }

    /* renamed from: a */
    public static AbstractC22752a m82741a(C22765f fVar, Component component) {
        return new C22766g(fVar, component);
    }

    @Override // com.google.firebase.p995a.AbstractC22752a
    /* renamed from: a */
    public Object mo79125a() {
        return C22765f.m82735a(this.f56302a, this.f56303b);
    }
}
