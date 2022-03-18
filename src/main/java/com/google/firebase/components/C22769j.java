package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.j */
class C22769j {

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.components.j$a */
    public static class C22771a {

        /* renamed from: a */
        private final Component<?> f56306a;

        /* renamed from: b */
        private final Set<C22771a> f56307b = new HashSet();

        /* renamed from: c */
        private final Set<C22771a> f56308c = new HashSet();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Set<C22771a> mo79183a() {
            return this.f56307b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Component<?> mo79185b() {
            return this.f56306a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo79189d() {
            return this.f56307b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo79188c() {
            return this.f56308c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79184a(C22771a aVar) {
            this.f56307b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo79186b(C22771a aVar) {
            this.f56308c.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo79187c(C22771a aVar) {
            this.f56308c.remove(aVar);
        }

        C22771a(Component<?> component) {
            this.f56306a = component;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.components.j$b */
    public static class C22772b {

        /* renamed from: a */
        public final boolean f56309a;

        /* renamed from: b */
        private final Class<?> f56310b;

        public int hashCode() {
            return ((this.f56310b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f56309a).hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C22772b)) {
                return false;
            }
            C22772b bVar = (C22772b) obj;
            if (!bVar.f56310b.equals(this.f56310b) || bVar.f56309a != this.f56309a) {
                return false;
            }
            return true;
        }

        private C22772b(Class<?> cls, boolean z) {
            this.f56310b = cls;
            this.f56309a = z;
        }
    }

    /* renamed from: a */
    private static Set<C22771a> m82747a(Set<C22771a> set) {
        HashSet hashSet = new HashSet();
        for (C22771a aVar : set) {
            if (aVar.mo79188c()) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    static void m82748a(List<Component<?>> list) {
        Set<C22771a> b = m82749b(list);
        Set<C22771a> a = m82747a(b);
        int i = 0;
        while (!a.isEmpty()) {
            C22771a next = a.iterator().next();
            a.remove(next);
            i++;
            for (C22771a aVar : next.mo79183a()) {
                aVar.mo79187c(next);
                if (aVar.mo79188c()) {
                    a.add(aVar);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C22771a aVar2 : b) {
                if (!aVar2.mo79188c() && !aVar2.mo79189d()) {
                    arrayList.add(aVar2.mo79185b());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C22771a> m82749b(List<Component<?>> list) {
        Set<C22771a> set;
        HashMap hashMap = new HashMap(list.size());
        for (Component<?> component : list) {
            C22771a aVar = new C22771a(component);
            Iterator<Class<? super Object>> it = component.getProvidedInterfaces().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class<? super Object> next = it.next();
                    C22772b bVar = new C22772b(next, !component.isValue());
                    if (!hashMap.containsKey(bVar)) {
                        hashMap.put(bVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(bVar);
                    if (set2.isEmpty() || bVar.f56309a) {
                        set2.add(aVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", next));
                    }
                }
            }
        }
        for (Set<C22771a> set3 : hashMap.values()) {
            for (C22771a aVar2 : set3) {
                for (Dependency dependency : aVar2.mo79185b().getDependencies()) {
                    if (dependency.isDirectInjection() && (set = (Set) hashMap.get(new C22772b(dependency.getInterface(), dependency.isSet()))) != null) {
                        for (C22771a aVar3 : set) {
                            aVar2.mo79184a(aVar3);
                            aVar3.mo79186b(aVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
