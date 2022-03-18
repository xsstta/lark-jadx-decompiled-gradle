package com.p943f.p944a;

import androidx.recyclerview.widget.C1374g;
import java.util.Collection;

/* renamed from: com.f.a.b */
class C20965b extends C1374g.AbstractC1376a {

    /* renamed from: a */
    private final int f51326a;

    /* renamed from: b */
    private final int f51327b;

    /* renamed from: c */
    private final Collection<? extends AbstractC20966c> f51328c;

    /* renamed from: d */
    private final Collection<? extends AbstractC20966c> f51329d;

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public int mo7380a() {
        return this.f51326a;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public int mo7382b() {
        return this.f51327b;
    }

    C20965b(Collection<? extends AbstractC20966c> collection, Collection<? extends AbstractC20966c> collection2) {
        this.f51326a = C20971f.m76383a(collection);
        this.f51327b = C20971f.m76383a(collection2);
        this.f51328c = collection;
        this.f51329d = collection2;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public boolean mo7381a(int i, int i2) {
        return C20971f.m76384a(this.f51329d, i2).mo71044a(C20971f.m76384a(this.f51328c, i));
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        return C20971f.m76384a(this.f51329d, i2).mo71047b(C20971f.m76384a(this.f51328c, i));
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: c */
    public Object mo7384c(int i, int i2) {
        return C20971f.m76384a(this.f51328c, i).mo71050d(C20971f.m76384a(this.f51329d, i2));
    }
}
