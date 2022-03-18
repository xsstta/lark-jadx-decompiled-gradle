package com.squareup.javapoet;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.squareup.javapoet.l */
public final class C27199l extends C27197k {

    /* renamed from: a */
    public final String f67699a;

    /* renamed from: b */
    public final List<C27197k> f67700b;

    /* access modifiers changed from: package-private */
    @Override // com.squareup.javapoet.C27197k
    /* renamed from: a */
    public C27186e mo96792a(C27186e eVar) throws IOException {
        mo96856b(eVar);
        return eVar.mo96826b(this.f67699a);
    }

    private C27199l(String str, List<C27197k> list) {
        this(str, list, new ArrayList());
    }

    /* renamed from: a */
    static C27199l m98875a(TypeVariable<?> typeVariable, Map<Type, C27199l> map) {
        C27199l lVar = map.get(typeVariable);
        if (lVar != null) {
            return lVar;
        }
        ArrayList arrayList = new ArrayList();
        C27199l lVar2 = new C27199l(typeVariable.getName(), Collections.unmodifiableList(arrayList));
        map.put(typeVariable, lVar2);
        for (Type type : typeVariable.getBounds()) {
            arrayList.add(C27197k.m98865a(type, map));
        }
        arrayList.remove(f67690o);
        return lVar2;
    }

    private C27199l(String str, List<C27197k> list, List<C27180a> list2) {
        super(list2);
        boolean z;
        this.f67699a = (String) C27200m.m98877a(str, "name == null", new Object[0]);
        this.f67700b = list;
        for (C27197k kVar : list) {
            if (kVar.mo96859g() || kVar == f67681f) {
                z = false;
            } else {
                z = true;
            }
            C27200m.m98882a(z, "invalid bound: %s", kVar);
        }
    }
}
