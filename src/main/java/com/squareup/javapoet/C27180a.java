package com.squareup.javapoet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.squareup.javapoet.a */
public final class C27180a {

    /* renamed from: a */
    public final C27197k f67606a;

    /* renamed from: b */
    public final Map<String, List<C27183d>> f67607b;

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            new C27186e(sb).mo96816a("$L", this);
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
    public void mo96788a(C27186e eVar, boolean z) throws IOException {
        String str;
        String str2;
        if (z) {
            str = "";
        } else {
            str = "\n";
        }
        if (z) {
            str2 = ", ";
        } else {
            str2 = ",\n";
        }
        if (this.f67607b.isEmpty()) {
            eVar.mo96816a("@$T", this.f67606a);
        } else if (this.f67607b.size() != 1 || !this.f67607b.containsKey("value")) {
            eVar.mo96816a("@$T(" + str, this.f67606a);
            eVar.mo96812a(2);
            Iterator<Map.Entry<String, List<C27183d>>> it = this.f67607b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, List<C27183d>> next = it.next();
                eVar.mo96816a("$L = ", next.getKey());
                m98786a(eVar, str, str2, next.getValue());
                if (it.hasNext()) {
                    eVar.mo96815a(str2);
                }
            }
            eVar.mo96824b(2);
            eVar.mo96815a(str + ")");
        } else {
            eVar.mo96816a("@$T(", this.f67606a);
            m98786a(eVar, str, str2, this.f67607b.get("value"));
            eVar.mo96815a(")");
        }
    }

    /* renamed from: a */
    private void m98786a(C27186e eVar, String str, String str2, List<C27183d> list) throws IOException {
        boolean z = true;
        if (list.size() == 1) {
            eVar.mo96812a(2);
            eVar.mo96825b(list.get(0));
            eVar.mo96824b(2);
            return;
        }
        eVar.mo96815a("{" + str);
        eVar.mo96812a(2);
        for (C27183d dVar : list) {
            if (!z) {
                eVar.mo96815a(str2);
            }
            eVar.mo96825b(dVar);
            z = false;
        }
        eVar.mo96824b(2);
        eVar.mo96815a(str + "}");
    }
}
