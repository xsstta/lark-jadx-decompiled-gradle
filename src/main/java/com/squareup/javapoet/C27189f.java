package com.squareup.javapoet;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.Modifier;

/* renamed from: com.squareup.javapoet.f */
public final class C27189f {

    /* renamed from: a */
    public final C27197k f67639a;

    /* renamed from: b */
    public final String f67640b;

    /* renamed from: c */
    public final C27183d f67641c;

    /* renamed from: d */
    public final List<C27180a> f67642d;

    /* renamed from: e */
    public final Set<Modifier> f67643e;

    /* renamed from: f */
    public final C27183d f67644f;

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            mo96833a(new C27186e(sb), Collections.emptySet());
            return sb.toString();
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public boolean mo96834a(Modifier modifier) {
        return this.f67643e.contains(modifier);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96833a(C27186e eVar, Set<Modifier> set) throws IOException {
        eVar.mo96818a(this.f67641c);
        eVar.mo96820a(this.f67642d, false);
        eVar.mo96822a(this.f67643e, set);
        eVar.mo96816a("$T $L", this.f67639a, this.f67640b);
        if (!this.f67644f.mo96804a()) {
            eVar.mo96815a(" = ");
            eVar.mo96825b(this.f67644f);
        }
        eVar.mo96815a(";\n");
    }
}
