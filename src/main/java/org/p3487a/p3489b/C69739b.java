package org.p3487a.p3489b;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: org.a.b.b */
public class C69739b {

    /* renamed from: a */
    private final int f174188a;

    /* renamed from: b */
    private final C69739b f174189b;

    /* renamed from: c */
    private Map<Character, C69739b> f174190c;

    /* renamed from: d */
    private C69739b f174191d;

    /* renamed from: e */
    private Set<String> f174192e;

    /* renamed from: b */
    public C69739b mo244657b() {
        return this.f174191d;
    }

    public C69739b() {
        this(0);
    }

    /* renamed from: a */
    public Collection<String> mo244655a() {
        Set<String> set = this.f174192e;
        if (set == null) {
            return Collections.emptyList();
        }
        return set;
    }

    /* renamed from: a */
    public C69739b mo244656a(Character ch) {
        return m267672a(ch, false);
    }

    public C69739b(int i) {
        this.f174190c = new HashMap();
        C69739b bVar = null;
        this.f174191d = null;
        this.f174192e = null;
        this.f174188a = i;
        this.f174189b = i == 0 ? this : bVar;
    }

    /* renamed from: a */
    private C69739b m267672a(Character ch, boolean z) {
        C69739b bVar;
        C69739b bVar2 = this.f174190c.get(ch);
        return (z || bVar2 != null || (bVar = this.f174189b) == null) ? bVar2 : bVar;
    }
}
