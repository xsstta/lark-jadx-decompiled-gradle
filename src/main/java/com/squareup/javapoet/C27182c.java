package com.squareup.javapoet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.squareup.javapoet.c */
public final class C27182c extends C27197k implements Comparable<C27182c> {

    /* renamed from: a */
    public static final C27182c f67609a = m98794a((Class<?>) Object.class);

    /* renamed from: b */
    final String f67610b;

    /* renamed from: c */
    final C27182c f67611c;

    /* renamed from: d */
    final String f67612d;

    /* renamed from: e */
    final String f67613e;

    /* renamed from: q */
    private List<String> f67614q;

    /* renamed from: b */
    public String mo96798b() {
        return this.f67610b;
    }

    /* renamed from: c */
    public C27182c mo96799c() {
        return this.f67611c;
    }

    /* renamed from: f */
    public String mo96803f() {
        return this.f67612d;
    }

    /* renamed from: d */
    public C27182c mo96801d() {
        C27182c cVar = this.f67611c;
        if (cVar != null) {
            return cVar.mo96801d();
        }
        return this;
    }

    /* renamed from: h */
    private List<C27182c> m98796h() {
        ArrayList arrayList = new ArrayList();
        for (C27182c cVar = this; cVar != null; cVar = cVar.f67611c) {
            arrayList.add(cVar);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public List<String> mo96802e() {
        List<String> list = this.f67614q;
        if (list != null) {
            return list;
        }
        if (this.f67611c == null) {
            this.f67614q = Collections.singletonList(this.f67612d);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(mo96799c().mo96802e());
            arrayList.add(this.f67612d);
            this.f67614q = Collections.unmodifiableList(arrayList);
        }
        return this.f67614q;
    }

    @Override // com.squareup.javapoet.C27197k
    /* renamed from: a */
    public boolean mo96797a() {
        C27182c cVar;
        if (super.mo96797a() || ((cVar = this.f67611c) != null && cVar.mo96797a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C27182c mo96795a(String str) {
        return new C27182c(this.f67610b, this, str);
    }

    /* renamed from: a */
    public int compareTo(C27182c cVar) {
        return this.f67613e.compareTo(cVar.f67613e);
    }

    /* renamed from: a */
    public C27182c mo96796a(List<C27180a> list) {
        return new C27182c(this.f67610b, this.f67611c, this.f67612d, mo96857b(list));
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.javapoet.C27197k
    /* renamed from: a */
    public C27186e mo96792a(C27186e eVar) throws IOException {
        String str;
        boolean z = false;
        for (C27182c cVar : m98796h()) {
            if (z) {
                eVar.mo96815a(".");
                str = cVar.f67612d;
            } else if (cVar.mo96797a() || cVar == this) {
                str = eVar.mo96817a(cVar);
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    int i = lastIndexOf + 1;
                    eVar.mo96826b(str.substring(0, i));
                    str = str.substring(i);
                    z = true;
                }
            }
            if (cVar.mo96797a()) {
                if (z) {
                    eVar.mo96815a(" ");
                }
                cVar.mo96856b(eVar);
            }
            eVar.mo96815a(str);
            z = true;
        }
        return eVar;
    }

    /* renamed from: a */
    public static C27182c m98794a(Class<?> cls) {
        C27200m.m98877a(cls, "clazz == null", new Object[0]);
        C27200m.m98882a(!cls.isPrimitive(), "primitive types cannot be represented as a ClassName", new Object[0]);
        C27200m.m98882a(!Void.TYPE.equals(cls), "'void' type cannot be represented as a ClassName", new Object[0]);
        C27200m.m98882a(!cls.isArray(), "array types cannot be represented as a ClassName", new Object[0]);
        String str = "";
        String str2 = str;
        while (cls.isAnonymousClass()) {
            int lastIndexOf = cls.getName().lastIndexOf(36);
            str2 = cls.getName().substring(lastIndexOf) + str2;
            cls = cls.getEnclosingClass();
        }
        String str3 = cls.getSimpleName() + str2;
        if (cls.getEnclosingClass() != null) {
            return m98794a(cls.getEnclosingClass()).mo96795a(str3);
        }
        int lastIndexOf2 = cls.getName().lastIndexOf(46);
        if (lastIndexOf2 != -1) {
            str = cls.getName().substring(0, lastIndexOf2);
        }
        return new C27182c(str, null, str3);
    }

    private C27182c(String str, C27182c cVar, String str2) {
        this(str, cVar, str2, Collections.emptyList());
    }

    /* renamed from: a */
    public static C27182c m98795a(String str, String str2, String... strArr) {
        C27182c cVar = new C27182c(str, null, str2);
        for (String str3 : strArr) {
            cVar = cVar.mo96795a(str3);
        }
        return cVar;
    }

    private C27182c(String str, C27182c cVar, String str2, List<C27180a> list) {
        super(list);
        Objects.requireNonNull(str, "packageName == null");
        this.f67610b = str;
        this.f67611c = cVar;
        this.f67612d = str2;
        if (cVar != null) {
            str2 = cVar.f67613e + '.' + str2;
        } else if (!str.isEmpty()) {
            str2 = str + '.' + str2;
        }
        this.f67613e = str2;
    }
}
