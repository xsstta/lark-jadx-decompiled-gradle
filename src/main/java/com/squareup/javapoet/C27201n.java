package com.squareup.javapoet;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.squareup.javapoet.n */
public final class C27201n extends C27197k {

    /* renamed from: a */
    public final List<C27197k> f67701a;

    /* renamed from: b */
    public final List<C27197k> f67702b;

    /* access modifiers changed from: package-private */
    @Override // com.squareup.javapoet.C27197k
    /* renamed from: a */
    public C27186e mo96792a(C27186e eVar) throws IOException {
        if (this.f67702b.size() == 1) {
            return eVar.mo96816a("? super $T", this.f67702b.get(0));
        } else if (this.f67701a.get(0).equals(C27197k.f67690o)) {
            return eVar.mo96815a("?");
        } else {
            return eVar.mo96816a("? extends $T", this.f67701a.get(0));
        }
    }

    private C27201n(List<C27197k> list, List<C27197k> list2) {
        this(list, list2, new ArrayList());
    }

    /* renamed from: a */
    static C27197k m98885a(WildcardType wildcardType, Map<Type, C27199l> map) {
        return new C27201n(m98868a(wildcardType.getUpperBounds(), map), m98868a(wildcardType.getLowerBounds(), map));
    }

    private C27201n(List<C27197k> list, List<C27197k> list2, List<C27180a> list3) {
        super(list3);
        boolean z;
        boolean z2;
        boolean z3;
        List<C27197k> a = C27200m.m98880a(list);
        this.f67701a = a;
        this.f67702b = C27200m.m98880a(list2);
        if (a.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        C27200m.m98882a(z, "unexpected extends bounds: %s", list);
        for (C27197k kVar : a) {
            if (kVar.mo96859g() || kVar == f67681f) {
                z3 = false;
            } else {
                z3 = true;
            }
            C27200m.m98882a(z3, "invalid upper bound: %s", kVar);
        }
        for (C27197k kVar2 : this.f67702b) {
            if (kVar2.mo96859g() || kVar2 == f67681f) {
                z2 = false;
            } else {
                z2 = true;
            }
            C27200m.m98882a(z2, "invalid lower bound: %s", kVar2);
        }
    }
}
