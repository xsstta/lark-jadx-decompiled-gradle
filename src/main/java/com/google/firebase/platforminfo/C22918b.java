package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.firebase.platforminfo.b */
public class C22918b implements AbstractC22923g {

    /* renamed from: a */
    private final String f56657a;

    /* renamed from: b */
    private final C22920d f56658b;

    /* renamed from: b */
    public static Component<AbstractC22923g> m83290b() {
        return Component.builder(AbstractC22923g.class).add(Dependency.setOf(AbstractC22922f.class)).factory(C22919c.m83292a()).build();
    }

    @Override // com.google.firebase.platforminfo.AbstractC22923g
    /* renamed from: a */
    public String mo79557a() {
        if (this.f56658b.mo79558a().isEmpty()) {
            return this.f56657a;
        }
        return this.f56657a + ' ' + m83289a(this.f56658b.mo79558a());
    }

    /* renamed from: a */
    static /* synthetic */ AbstractC22923g m83288a(ComponentContainer componentContainer) {
        return new C22918b(componentContainer.setOf(AbstractC22922f.class), C22920d.m83293b());
    }

    /* renamed from: a */
    private static String m83289a(Set<AbstractC22922f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC22922f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC22922f next = it.next();
            sb.append(next.mo79552a());
            sb.append('/');
            sb.append(next.mo79553b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    C22918b(Set<AbstractC22922f> set, C22920d dVar) {
        this.f56657a = m83289a(set);
        this.f56658b = dVar;
    }
}
