package com.squareup.javapoet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;

public final class TypeSpec {

    /* renamed from: s */
    static final /* synthetic */ boolean f67587s = true;

    /* renamed from: a */
    public final Kind f67588a;

    /* renamed from: b */
    public final String f67589b;

    /* renamed from: c */
    public final C27183d f67590c;

    /* renamed from: d */
    public final C27183d f67591d;

    /* renamed from: e */
    public final List<C27180a> f67592e;

    /* renamed from: f */
    public final Set<Modifier> f67593f;

    /* renamed from: g */
    public final List<C27199l> f67594g;

    /* renamed from: h */
    public final C27197k f67595h;

    /* renamed from: i */
    public final List<C27197k> f67596i;

    /* renamed from: j */
    public final Map<String, TypeSpec> f67597j;

    /* renamed from: k */
    public final List<C27189f> f67598k;

    /* renamed from: l */
    public final C27183d f67599l;

    /* renamed from: m */
    public final C27183d f67600m;

    /* renamed from: n */
    public final List<C27194h> f67601n;

    /* renamed from: o */
    public final List<TypeSpec> f67602o;

    /* renamed from: p */
    final Set<String> f67603p;

    /* renamed from: q */
    public final List<Element> f67604q;

    /* renamed from: r */
    public final Set<String> f67605r;

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            mo96784a(new C27186e(sb), null, Collections.emptySet());
            return sb.toString();
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return f67587s;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    private TypeSpec(TypeSpec typeSpec) {
        if (f67587s || typeSpec.f67590c == null) {
            this.f67588a = typeSpec.f67588a;
            this.f67589b = typeSpec.f67589b;
            this.f67590c = null;
            this.f67591d = typeSpec.f67591d;
            this.f67592e = Collections.emptyList();
            this.f67593f = Collections.emptySet();
            this.f67594g = Collections.emptyList();
            this.f67595h = null;
            this.f67596i = Collections.emptyList();
            this.f67597j = Collections.emptyMap();
            this.f67598k = Collections.emptyList();
            this.f67599l = typeSpec.f67599l;
            this.f67600m = typeSpec.f67600m;
            this.f67601n = Collections.emptyList();
            this.f67602o = Collections.emptyList();
            this.f67604q = Collections.emptyList();
            this.f67603p = Collections.emptySet();
            this.f67605r = Collections.emptySet();
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96784a(C27186e eVar, String str, Set<Modifier> set) throws IOException {
        List<C27197k> list;
        List<C27197k> list2;
        C27197k kVar;
        int i = eVar.f67622a;
        eVar.f67622a = -1;
        boolean z = f67587s;
        if (str != null) {
            try {
                eVar.mo96818a(this.f67591d);
                eVar.mo96820a(this.f67592e, false);
                eVar.mo96816a("$L", str);
                if (!this.f67590c.f67617c.isEmpty()) {
                    eVar.mo96815a("(");
                    eVar.mo96825b(this.f67590c);
                    eVar.mo96815a(")");
                }
                if (!this.f67598k.isEmpty() || !this.f67601n.isEmpty() || !this.f67602o.isEmpty()) {
                    eVar.mo96815a(" {\n");
                } else {
                    return;
                }
            } finally {
                eVar.f67622a = i;
            }
        } else if (this.f67590c != null) {
            if (!this.f67596i.isEmpty()) {
                kVar = this.f67596i.get(0);
            } else {
                kVar = this.f67595h;
            }
            eVar.mo96816a("new $T(", kVar);
            eVar.mo96825b(this.f67590c);
            eVar.mo96815a(") {\n");
        } else {
            eVar.mo96813a(new TypeSpec(this));
            eVar.mo96818a(this.f67591d);
            eVar.mo96820a(this.f67592e, false);
            eVar.mo96822a(this.f67593f, C27200m.m98881a(set, this.f67588a.asMemberModifiers));
            if (this.f67588a == Kind.ANNOTATION) {
                eVar.mo96816a("$L $L", "@interface", this.f67589b);
            } else {
                eVar.mo96816a("$L $L", this.f67588a.name().toLowerCase(Locale.US), this.f67589b);
            }
            eVar.mo96819a(this.f67594g);
            if (this.f67588a == Kind.INTERFACE) {
                list = this.f67596i;
                list2 = Collections.emptyList();
            } else {
                if (this.f67595h.equals(C27182c.f67609a)) {
                    list = Collections.emptyList();
                } else {
                    list = Collections.singletonList(this.f67595h);
                }
                list2 = this.f67596i;
            }
            if (!list.isEmpty()) {
                eVar.mo96815a(" extends");
                boolean z2 = f67587s;
                for (C27197k kVar2 : list) {
                    if (!z2) {
                        eVar.mo96815a(",");
                    }
                    eVar.mo96816a(" $T", kVar2);
                    z2 = false;
                }
            }
            if (!list2.isEmpty()) {
                eVar.mo96815a(" implements");
                boolean z3 = f67587s;
                for (C27197k kVar3 : list2) {
                    if (!z3) {
                        eVar.mo96815a(",");
                    }
                    eVar.mo96816a(" $T", kVar3);
                    z3 = false;
                }
            }
            eVar.mo96828c();
            eVar.mo96815a(" {\n");
        }
        eVar.mo96813a(this);
        eVar.mo96811a();
        Iterator<Map.Entry<String, TypeSpec>> it = this.f67597j.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, TypeSpec> next = it.next();
            if (!z) {
                eVar.mo96815a("\n");
            }
            next.getValue().mo96784a(eVar, next.getKey(), Collections.emptySet());
            if (it.hasNext()) {
                eVar.mo96815a(",\n");
            } else if (!this.f67598k.isEmpty() || !this.f67601n.isEmpty() || !this.f67602o.isEmpty()) {
                eVar.mo96815a(";\n");
            } else {
                eVar.mo96815a("\n");
            }
            z = false;
        }
        for (C27189f fVar : this.f67598k) {
            if (fVar.mo96834a(Modifier.STATIC)) {
                if (!z) {
                    eVar.mo96815a("\n");
                }
                fVar.mo96833a(eVar, this.f67588a.implicitFieldModifiers);
                z = false;
            }
        }
        if (!this.f67599l.mo96804a()) {
            if (!z) {
                eVar.mo96815a("\n");
            }
            eVar.mo96825b(this.f67599l);
            z = false;
        }
        for (C27189f fVar2 : this.f67598k) {
            if (!fVar2.mo96834a(Modifier.STATIC)) {
                if (!z) {
                    eVar.mo96815a("\n");
                }
                fVar2.mo96833a(eVar, this.f67588a.implicitFieldModifiers);
                z = false;
            }
        }
        if (!this.f67600m.mo96804a()) {
            if (!z) {
                eVar.mo96815a("\n");
            }
            eVar.mo96825b(this.f67600m);
            z = false;
        }
        for (C27194h hVar : this.f67601n) {
            if (hVar.mo96846a()) {
                if (!z) {
                    eVar.mo96815a("\n");
                }
                hVar.mo96845a(eVar, this.f67589b, this.f67588a.implicitMethodModifiers);
                z = false;
            }
        }
        for (C27194h hVar2 : this.f67601n) {
            if (!hVar2.mo96846a()) {
                if (!z) {
                    eVar.mo96815a("\n");
                }
                hVar2.mo96845a(eVar, this.f67589b, this.f67588a.implicitMethodModifiers);
                z = false;
            }
        }
        for (TypeSpec typeSpec : this.f67602o) {
            if (!z) {
                eVar.mo96815a("\n");
            }
            typeSpec.mo96784a(eVar, null, this.f67588a.implicitTypeModifiers);
            z = false;
        }
        eVar.mo96823b();
        eVar.mo96828c();
        eVar.mo96827b(this.f67594g);
        eVar.mo96815a("}");
        if (str == null && this.f67590c == null) {
            eVar.mo96815a("\n");
        }
        eVar.f67622a = i;
    }

    public enum Kind {
        CLASS(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet()),
        INTERFACE(C27200m.m98883b(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)), C27200m.m98883b(Arrays.asList(Modifier.PUBLIC, Modifier.ABSTRACT)), C27200m.m98883b(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC)), C27200m.m98883b(Collections.singletonList(Modifier.STATIC))),
        ENUM(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.singleton(Modifier.STATIC)),
        ANNOTATION(C27200m.m98883b(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)), C27200m.m98883b(Arrays.asList(Modifier.PUBLIC, Modifier.ABSTRACT)), C27200m.m98883b(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC)), C27200m.m98883b(Collections.singletonList(Modifier.STATIC)));
        
        public final Set<Modifier> asMemberModifiers;
        public final Set<Modifier> implicitFieldModifiers;
        public final Set<Modifier> implicitMethodModifiers;
        public final Set<Modifier> implicitTypeModifiers;

        private Kind(Set set, Set set2, Set set3, Set set4) {
            this.implicitFieldModifiers = set;
            this.implicitMethodModifiers = set2;
            this.implicitTypeModifiers = set3;
            this.asMemberModifiers = set4;
        }
    }
}
