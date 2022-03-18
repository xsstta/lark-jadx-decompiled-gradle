package com.squareup.javapoet;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.squareup.javapoet.j */
public final class C27196j extends C27197k {

    /* renamed from: a */
    public final C27182c f67673a;

    /* renamed from: b */
    public final List<C27197k> f67674b;

    /* renamed from: c */
    private final C27196j f67675c;

    /* access modifiers changed from: package-private */
    @Override // com.squareup.javapoet.C27197k
    /* renamed from: a */
    public C27186e mo96792a(C27186e eVar) throws IOException {
        C27196j jVar = this.f67675c;
        if (jVar != null) {
            jVar.mo96792a(eVar);
            eVar.mo96815a(".");
            if (mo96797a()) {
                eVar.mo96815a(" ");
                mo96856b(eVar);
            }
            eVar.mo96815a(this.f67673a.mo96803f());
        } else {
            this.f67673a.mo96792a(eVar);
        }
        if (!this.f67674b.isEmpty()) {
            eVar.mo96826b("<");
            boolean z = true;
            for (C27197k kVar : this.f67674b) {
                if (!z) {
                    eVar.mo96826b(", ");
                }
                kVar.mo96792a(eVar);
                z = false;
            }
            eVar.mo96826b(">");
        }
        return eVar;
    }

    /* renamed from: a */
    public C27196j mo96855a(String str, List<C27197k> list) {
        C27200m.m98877a(str, "name == null", new Object[0]);
        return new C27196j(this, this.f67673a.mo96795a(str), list, new ArrayList());
    }

    /* renamed from: a */
    static C27196j m98861a(ParameterizedType parameterizedType, Map<Type, C27199l> map) {
        ParameterizedType parameterizedType2;
        C27182c a = C27182c.m98794a((Class<?>) ((Class) parameterizedType.getRawType()));
        if (!(parameterizedType.getOwnerType() instanceof ParameterizedType) || Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers())) {
            parameterizedType2 = null;
        } else {
            parameterizedType2 = (ParameterizedType) parameterizedType.getOwnerType();
        }
        List<C27197k> a2 = C27197k.m98868a(parameterizedType.getActualTypeArguments(), map);
        if (parameterizedType2 != null) {
            return m98861a(parameterizedType2, map).mo96855a(a.mo96803f(), a2);
        }
        return new C27196j(null, a, a2);
    }

    C27196j(C27196j jVar, C27182c cVar, List<C27197k> list) {
        this(jVar, cVar, list, new ArrayList());
    }

    private C27196j(C27196j jVar, C27182c cVar, List<C27197k> list, List<C27180a> list2) {
        super(list2);
        boolean z;
        boolean z2;
        this.f67673a = ((C27182c) C27200m.m98877a(cVar, "rawType == null", new Object[0])).mo96796a(list2);
        this.f67675c = jVar;
        List<C27197k> a = C27200m.m98880a(list);
        this.f67674b = a;
        if (!a.isEmpty() || jVar != null) {
            z = true;
        } else {
            z = false;
        }
        C27200m.m98882a(z, "no type arguments: %s", cVar);
        for (C27197k kVar : a) {
            if (kVar.mo96859g() || kVar == f67681f) {
                z2 = false;
            } else {
                z2 = true;
            }
            C27200m.m98882a(z2, "invalid type parameter: %s", kVar);
        }
    }
}
