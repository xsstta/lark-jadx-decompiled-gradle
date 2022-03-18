package com.google.firebase.components;

import com.google.firebase.events.AbstractC22792a;
import com.google.firebase.events.Subscriber;
import com.google.firebase.p995a.AbstractC22752a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.f */
public class C22765f extends AbstractC22757a {

    /* renamed from: a */
    private static final AbstractC22752a<Set<Object>> f56297a = C22768i.m82745b();

    /* renamed from: b */
    private final Map<Component<?>, C22775m<?>> f56298b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C22775m<?>> f56299c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C22775m<Set<?>>> f56300d = new HashMap();

    /* renamed from: e */
    private final C22773k f56301e;

    /* renamed from: a */
    private void m82737a() {
        for (Map.Entry<Component<?>, C22775m<?>> entry : this.f56298b.entrySet()) {
            Component<?> key = entry.getKey();
            if (key.isValue()) {
                C22775m<?> value = entry.getValue();
                for (Class<? super Object> cls : key.getProvidedInterfaces()) {
                    this.f56299c.put(cls, value);
                }
            }
        }
        m82739c();
    }

    /* renamed from: c */
    private void m82739c() {
        for (Component<?> component : this.f56298b.keySet()) {
            Iterator<Dependency> it = component.getDependencies().iterator();
            while (true) {
                if (it.hasNext()) {
                    Dependency next = it.next();
                    if (next.isRequired() && !this.f56299c.containsKey(next.getInterface())) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, next.getInterface()));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m82738b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Component<?>, C22775m<?>> entry : this.f56298b.entrySet()) {
            Component<?> key = entry.getKey();
            if (!key.isValue()) {
                C22775m<?> value = entry.getValue();
                for (Class<? super Object> cls : key.getProvidedInterfaces()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f56300d.put((Class) entry2.getKey(), new C22775m<>(C22767h.m82743a((Set) entry2.getValue())));
        }
    }

    @Override // com.google.firebase.components.AbstractC22757a, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    @Override // com.google.firebase.components.AbstractC22757a, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ Set setOf(Class cls) {
        return super.setOf(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> AbstractC22752a<T> getProvider(Class<T> cls) {
        C22776n.m82764a(cls, "Null interface requested.");
        return this.f56299c.get(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> AbstractC22752a<Set<T>> setOfProvider(Class<T> cls) {
        C22775m<Set<?>> mVar = this.f56300d.get(cls);
        return mVar != null ? mVar : (AbstractC22752a<Set<T>>) f56297a;
    }

    /* renamed from: a */
    static /* synthetic */ Set m82736a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((C22775m) it.next()).mo79125a());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public void mo79182a(boolean z) {
        for (Map.Entry<Component<?>, C22775m<?>> entry : this.f56298b.entrySet()) {
            Component<?> key = entry.getKey();
            C22775m<?> value = entry.getValue();
            if (key.isAlwaysEager() || (key.isEagerInDefaultApp() && z)) {
                value.mo79125a();
            }
        }
        this.f56301e.mo79192a();
    }

    public C22765f(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        C22773k kVar = new C22773k(executor);
        this.f56301e = kVar;
        ArrayList<Component<?>> arrayList = new ArrayList();
        arrayList.add(Component.of(kVar, C22773k.class, Subscriber.class, AbstractC22792a.class));
        for (ComponentRegistrar componentRegistrar : iterable) {
            arrayList.addAll(componentRegistrar.getComponents());
        }
        for (Component<?> component : componentArr) {
            if (component != null) {
                arrayList.add(component);
            }
        }
        C22769j.m82748a(arrayList);
        for (Component<?> component2 : arrayList) {
            this.f56298b.put(component2, new C22775m<>(C22766g.m82741a(this, component2)));
        }
        m82737a();
        m82738b();
    }
}
