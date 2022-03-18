package com.squareup.javapoet;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.Modifier;

/* renamed from: com.squareup.javapoet.i */
public final class C27195i {

    /* renamed from: a */
    public final String f67668a;

    /* renamed from: b */
    public final List<C27180a> f67669b;

    /* renamed from: c */
    public final Set<Modifier> f67670c;

    /* renamed from: d */
    public final C27197k f67671d;

    /* renamed from: e */
    public final C27183d f67672e;

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            mo96851a(new C27186e(sb), false);
            return sb.toString();
        } catch (IOException unused) {
            throw new AssertionError();
        }
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
    public void mo96851a(C27186e eVar, boolean z) throws IOException {
        eVar.mo96820a(this.f67669b, true);
        eVar.mo96821a(this.f67670c);
        if (z) {
            C27197k.m98869b(this.f67671d).mo96793a(eVar, true);
        } else {
            this.f67671d.mo96792a(eVar);
        }
        eVar.mo96816a(" $L", this.f67668a);
    }
}
