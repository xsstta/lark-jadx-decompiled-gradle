package com.squareup.javapoet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Modifier;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.javapoet.e */
public final class C27186e {

    /* renamed from: b */
    private static final String f67621b = new String();

    /* renamed from: a */
    int f67622a;

    /* renamed from: c */
    private final String f67623c;

    /* renamed from: d */
    private final C27190g f67624d;

    /* renamed from: e */
    private int f67625e;

    /* renamed from: f */
    private boolean f67626f;

    /* renamed from: g */
    private boolean f67627g;

    /* renamed from: h */
    private String f67628h;

    /* renamed from: i */
    private final List<TypeSpec> f67629i;

    /* renamed from: j */
    private final Set<String> f67630j;

    /* renamed from: k */
    private final Set<String> f67631k;

    /* renamed from: l */
    private final Set<String> f67632l;

    /* renamed from: m */
    private final Map<String, C27182c> f67633m;

    /* renamed from: n */
    private final Map<String, C27182c> f67634n;

    /* renamed from: o */
    private final Set<String> f67635o;

    /* renamed from: p */
    private final C27188a<String> f67636p;

    /* renamed from: q */
    private boolean f67637q;

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo96818a(C27183d dVar) throws IOException {
        if (!dVar.mo96804a()) {
            mo96815a("/**\n");
            this.f67626f = true;
            try {
                mo96814a(dVar, true);
                this.f67626f = false;
                mo96815a(" */\n");
            } catch (Throwable th) {
                this.f67626f = false;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo96820a(List<C27180a> list, boolean z) throws IOException {
        for (C27180a aVar : list) {
            aVar.mo96788a(this, z);
            mo96815a(z ? " " : "\n");
        }
    }

    /* renamed from: a */
    public void mo96822a(Set<Modifier> set, Set<Modifier> set2) throws IOException {
        if (!set.isEmpty()) {
            Iterator it = EnumSet.copyOf(set).iterator();
            while (it.hasNext()) {
                Modifier modifier = (Modifier) it.next();
                if (!set2.contains(modifier)) {
                    mo96826b(modifier.name().toLowerCase(Locale.US));
                    mo96826b(" ");
                }
            }
        }
    }

    /* renamed from: a */
    public void mo96821a(Set<Modifier> set) throws IOException {
        mo96822a(set, Collections.emptySet());
    }

    /* renamed from: a */
    public void mo96819a(List<C27199l> list) throws IOException {
        if (!list.isEmpty()) {
            list.forEach(new Consumer() {
                /* class com.squareup.javapoet.$$Lambda$e$iB_nvjthEOnK5BwlHk8JmN7cECE */

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C27186e.this.m98823b((C27186e) ((C27199l) obj));
                }
            });
            mo96815a("<");
            boolean z = true;
            for (C27199l lVar : list) {
                if (!z) {
                    mo96815a(", ");
                }
                mo96820a(lVar.f67695p, true);
                mo96816a("$L", lVar.f67699a);
                boolean z2 = true;
                for (C27197k kVar : lVar.f67700b) {
                    mo96816a(z2 ? " extends $T" : " & $T", kVar);
                    z2 = false;
                }
                z = false;
            }
            mo96815a(">");
        }
    }

    /* renamed from: a */
    public C27186e mo96816a(String str, Object... objArr) throws IOException {
        return mo96825b(C27183d.m98807a(str, objArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo96817a(C27182c cVar) {
        String f = cVar.mo96801d().mo96803f();
        if (this.f67636p.mo96832c(f)) {
            return cVar.f67613e;
        }
        C27182c cVar2 = cVar;
        boolean z = false;
        while (cVar2 != null) {
            C27182c d = m98825d(cVar2.mo96803f());
            boolean z2 = d != null;
            if (d == null || !Objects.equals(d.f67613e, cVar2.f67613e)) {
                cVar2 = cVar2.mo96799c();
                z = z2;
            } else {
                return C$r8$backportedMethods$utility$String$2$joinIterable.join(".", cVar.mo96802e().subList(cVar2.mo96802e().size() - 1, cVar.mo96802e().size()));
            }
        }
        if (z) {
            return cVar.f67613e;
        }
        if (Objects.equals(this.f67628h, cVar.mo96798b())) {
            this.f67635o.add(f);
            return C$r8$backportedMethods$utility$String$2$joinIterable.join(".", cVar.mo96802e());
        }
        if (!this.f67626f) {
            m98822b(cVar);
        }
        return cVar.f67613e;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.squareup.javapoet.e$a */
    public static final class C27188a<T> {

        /* renamed from: a */
        private final Map<T, Integer> f67638a;

        private C27188a() {
            this.f67638a = new LinkedHashMap();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo96830a(T t) {
            this.f67638a.put(t, Integer.valueOf(this.f67638a.getOrDefault(t, 0).intValue() + 1));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo96832c(T t) {
            if (this.f67638a.getOrDefault(t, 0).intValue() > 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo96831b(T t) {
            int intValue = this.f67638a.getOrDefault(t, 0).intValue();
            if (intValue != 0) {
                this.f67638a.put(t, Integer.valueOf(intValue - 1));
                return;
            }
            throw new IllegalStateException(((Object) t) + " is not in the multiset");
        }
    }

    /* renamed from: e */
    private void m98826e() throws IOException {
        for (int i = 0; i < this.f67625e; i++) {
            this.f67624d.mo96840a(this.f67623c);
        }
    }

    /* renamed from: a */
    public C27186e mo96811a() {
        return mo96812a(1);
    }

    /* renamed from: b */
    public C27186e mo96823b() {
        return mo96824b(1);
    }

    /* renamed from: c */
    public C27186e mo96828c() {
        List<TypeSpec> list = this.f67629i;
        list.remove(list.size() - 1);
        return this;
    }

    /* renamed from: d */
    public C27186e mo96829d() throws IOException {
        this.f67624d.mo96839a(this.f67625e + 2);
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m98819a(C27199l lVar) {
        this.f67636p.mo96831b(lVar.f67699a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m98823b(C27199l lVar) {
        this.f67636p.mo96830a(lVar.f67699a);
    }

    C27186e(Appendable appendable) {
        this(appendable, "  ", Collections.emptySet(), Collections.emptySet());
    }

    /* renamed from: a */
    public C27186e mo96812a(int i) {
        this.f67625e += i;
        return this;
    }

    /* renamed from: b */
    public C27186e mo96825b(C27183d dVar) throws IOException {
        return mo96814a(dVar, false);
    }

    /* renamed from: b */
    private void m98822b(C27182c cVar) {
        C27182c d;
        String f;
        C27182c put;
        if (!cVar.mo96798b().isEmpty() && !this.f67632l.contains(cVar.f67612d) && (put = this.f67634n.put((f = (d = cVar.mo96801d()).mo96803f()), d)) != null) {
            this.f67634n.put(f, put);
        }
    }

    /* renamed from: c */
    private static String m98824c(String str) {
        C27200m.m98882a(Character.isJavaIdentifierStart(str.charAt(0)), "not an identifier: %s", str);
        for (int i = 1; i <= str.length(); i++) {
            if (!SourceVersion.isIdentifier(str.substring(0, i))) {
                return str.substring(0, i - 1);
            }
        }
        return str;
    }

    /* renamed from: a */
    private void m98820a(Object obj) throws IOException {
        if (obj instanceof TypeSpec) {
            ((TypeSpec) obj).mo96784a(this, null, Collections.emptySet());
        } else if (obj instanceof C27180a) {
            ((C27180a) obj).mo96788a(this, true);
        } else if (obj instanceof C27183d) {
            mo96825b((C27183d) obj);
        } else {
            mo96826b(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    private C27182c m98825d(String str) {
        for (int size = this.f67629i.size() - 1; size >= 0; size--) {
            if (this.f67629i.get(size).f67603p.contains(str)) {
                return m98818a(size, str);
            }
        }
        if (this.f67629i.size() > 0 && Objects.equals(this.f67629i.get(0).f67589b, str)) {
            return C27182c.m98795a(this.f67628h, str, new String[0]);
        }
        C27182c cVar = this.f67633m.get(str);
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    /* renamed from: b */
    public C27186e mo96824b(int i) {
        boolean z;
        if (this.f67625e - i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C27200m.m98882a(z, "cannot unindent %s from %s", Integer.valueOf(i), Integer.valueOf(this.f67625e));
        this.f67625e -= i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C27186e mo96826b(String str) throws IOException {
        String str2;
        String[] split = str.split("\\R", -1);
        int length = split.length;
        int i = 0;
        boolean z = true;
        while (i < length) {
            String str3 = split[i];
            if (!z) {
                if ((this.f67626f || this.f67627g) && this.f67637q) {
                    m98826e();
                    C27190g gVar = this.f67624d;
                    if (this.f67626f) {
                        str2 = " *";
                    } else {
                        str2 = "//";
                    }
                    gVar.mo96840a(str2);
                }
                this.f67624d.mo96840a("\n");
                this.f67637q = true;
                int i2 = this.f67622a;
                if (i2 != -1) {
                    if (i2 == 0) {
                        mo96812a(2);
                    }
                    this.f67622a++;
                }
            }
            if (!str3.isEmpty()) {
                if (this.f67637q) {
                    m98826e();
                    if (this.f67626f) {
                        this.f67624d.mo96840a(" * ");
                    } else if (this.f67627g) {
                        this.f67624d.mo96840a("// ");
                    }
                }
                this.f67624d.mo96840a(str3);
                this.f67637q = false;
            }
            i++;
            z = false;
        }
        return this;
    }

    /* renamed from: a */
    public C27186e mo96813a(TypeSpec typeSpec) {
        this.f67629i.add(typeSpec);
        return this;
    }

    /* renamed from: b */
    public void mo96827b(List<C27199l> list) throws IOException {
        list.forEach(new Consumer() {
            /* class com.squareup.javapoet.$$Lambda$e$GM8rZuD168tVYOLziGbq5O_7s1M */

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C27186e.this.m98819a((C27186e) ((C27199l) obj));
            }
        });
    }

    /* renamed from: a */
    public C27186e mo96815a(String str) throws IOException {
        return mo96826b(str);
    }

    /* renamed from: a */
    private C27182c m98818a(int i, String str) {
        C27182c a = C27182c.m98795a(this.f67628h, this.f67629i.get(0).f67589b, new String[0]);
        for (int i2 = 1; i2 <= i; i2++) {
            a = a.mo96795a(this.f67629i.get(i2).f67589b);
        }
        return a.mo96795a(str);
    }

    /* renamed from: a */
    private boolean m98821a(String str, String str2) throws IOException {
        String substring = str2.substring(1);
        if (substring.isEmpty() || !Character.isJavaIdentifierStart(substring.charAt(0))) {
            return false;
        }
        String str3 = str + "." + m98824c(substring);
        String str4 = str + ".*";
        if (!this.f67631k.contains(str3) && !this.f67631k.contains(str4)) {
            return false;
        }
        mo96826b(substring);
        return true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r5.equals("$]") == false) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.squareup.javapoet.C27186e mo96814a(com.squareup.javapoet.C27183d r12, boolean r13) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 482
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.javapoet.C27186e.mo96814a(com.squareup.javapoet.d, boolean):com.squareup.javapoet.e");
    }

    C27186e(Appendable appendable, String str, Set<String> set, Set<String> set2) {
        this(appendable, str, Collections.emptyMap(), set, set2);
    }

    C27186e(Appendable appendable, String str, Map<String, C27182c> map, Set<String> set, Set<String> set2) {
        this.f67628h = f67621b;
        this.f67629i = new ArrayList();
        this.f67634n = new LinkedHashMap();
        this.f67635o = new LinkedHashSet();
        this.f67636p = new C27188a<>();
        this.f67622a = -1;
        this.f67624d = new C27190g(appendable, str, 100);
        this.f67623c = (String) C27200m.m98877a(str, "indent == null", new Object[0]);
        this.f67633m = (Map) C27200m.m98877a(map, "importedTypes == null", new Object[0]);
        this.f67631k = (Set) C27200m.m98877a(set, "staticImports == null", new Object[0]);
        this.f67632l = (Set) C27200m.m98877a(set2, "alwaysQualify == null", new Object[0]);
        this.f67630j = new LinkedHashSet();
        for (String str2 : set) {
            this.f67630j.add(str2.substring(0, str2.lastIndexOf(46)));
        }
    }
}
