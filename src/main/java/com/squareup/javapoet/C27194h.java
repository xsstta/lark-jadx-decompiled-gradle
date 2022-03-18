package com.squareup.javapoet;

import com.squareup.javapoet.C27183d;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.Modifier;

/* renamed from: com.squareup.javapoet.h */
public final class C27194h {

    /* renamed from: a */
    public final String f67657a;

    /* renamed from: b */
    public final C27183d f67658b;

    /* renamed from: c */
    public final List<C27180a> f67659c;

    /* renamed from: d */
    public final Set<Modifier> f67660d;

    /* renamed from: e */
    public final List<C27199l> f67661e;

    /* renamed from: f */
    public final C27197k f67662f;

    /* renamed from: g */
    public final List<C27195i> f67663g;

    /* renamed from: h */
    public final boolean f67664h;

    /* renamed from: i */
    public final List<C27197k> f67665i;

    /* renamed from: j */
    public final C27183d f67666j;

    /* renamed from: k */
    public final C27183d f67667k;

    /* renamed from: a */
    public boolean mo96846a() {
        return this.f67657a.equals("<init>");
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            mo96845a(new C27186e(sb), "Constructor", Collections.emptySet());
            return sb.toString();
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    private C27183d m98856b() {
        C27183d.C27185a b = this.f67658b.mo96805b();
        boolean z = true;
        for (C27195i iVar : this.f67663g) {
            if (!iVar.f67672e.mo96804a()) {
                if (z && !this.f67658b.mo96804a()) {
                    b.mo96809a("\n", new Object[0]);
                }
                b.mo96809a("@param $L $L", iVar.f67668a, iVar.f67672e);
                z = false;
            }
        }
        return b.mo96810a();
    }

    /* renamed from: a */
    public boolean mo96847a(Modifier modifier) {
        return this.f67660d.contains(modifier);
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
    public void mo96845a(C27186e eVar, String str, Set<Modifier> set) throws IOException {
        boolean z;
        eVar.mo96818a(m98856b());
        eVar.mo96820a(this.f67659c, false);
        eVar.mo96822a(this.f67660d, set);
        if (!this.f67661e.isEmpty()) {
            eVar.mo96819a(this.f67661e);
            eVar.mo96815a(" ");
        }
        if (mo96846a()) {
            eVar.mo96816a("$L($Z", str);
        } else {
            eVar.mo96816a("$T $L($Z", this.f67662f, this.f67657a);
        }
        Iterator<C27195i> it = this.f67663g.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            C27195i next = it.next();
            if (!z2) {
                eVar.mo96815a(",").mo96829d();
            }
            if (it.hasNext() || !this.f67664h) {
                z = false;
            } else {
                z = true;
            }
            next.mo96851a(eVar, z);
            z2 = false;
        }
        eVar.mo96815a(")");
        C27183d dVar = this.f67667k;
        if (dVar != null && !dVar.mo96804a()) {
            eVar.mo96815a(" default ");
            eVar.mo96825b(this.f67667k);
        }
        if (!this.f67665i.isEmpty()) {
            eVar.mo96829d().mo96815a("throws");
            boolean z3 = true;
            for (C27197k kVar : this.f67665i) {
                if (!z3) {
                    eVar.mo96815a(",");
                }
                eVar.mo96829d().mo96816a("$T", kVar);
                z3 = false;
            }
        }
        if (mo96847a(Modifier.ABSTRACT)) {
            eVar.mo96815a(";\n");
        } else if (mo96847a(Modifier.NATIVE)) {
            eVar.mo96825b(this.f67666j);
            eVar.mo96815a(";\n");
        } else {
            eVar.mo96815a(" {\n");
            eVar.mo96811a();
            eVar.mo96814a(this.f67666j, true);
            eVar.mo96823b();
            eVar.mo96815a("}\n");
        }
        eVar.mo96827b(this.f67661e);
    }
}
