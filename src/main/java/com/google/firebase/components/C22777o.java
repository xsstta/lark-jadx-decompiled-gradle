package com.google.firebase.components;

import com.google.firebase.events.AbstractC22792a;
import com.google.firebase.events.Event;
import com.google.firebase.p995a.AbstractC22752a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.o */
public final class C22777o extends AbstractC22757a {

    /* renamed from: a */
    private final Set<Class<?>> f56319a;

    /* renamed from: b */
    private final Set<Class<?>> f56320b;

    /* renamed from: c */
    private final Set<Class<?>> f56321c;

    /* renamed from: d */
    private final Set<Class<?>> f56322d;

    /* renamed from: e */
    private final Set<Class<?>> f56323e;

    /* renamed from: f */
    private final ComponentContainer f56324f;

    /* renamed from: com.google.firebase.components.o$a */
    private static class C22778a implements AbstractC22792a {

        /* renamed from: a */
        private final Set<Class<?>> f56325a;

        /* renamed from: b */
        private final AbstractC22792a f56326b;

        @Override // com.google.firebase.events.AbstractC22792a
        /* renamed from: a */
        public void mo79193a(Event<?> event) {
            if (this.f56325a.contains(event.getType())) {
                this.f56326b.mo79193a(event);
            } else {
                throw new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", event));
            }
        }

        public C22778a(Set<Class<?>> set, AbstractC22792a aVar) {
            this.f56325a = set;
            this.f56326b = aVar;
        }
    }

    @Override // com.google.firebase.components.AbstractC22757a, com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        if (this.f56319a.contains(cls)) {
            T t = (T) this.f56324f.get(cls);
            return !cls.equals(AbstractC22792a.class) ? t : (T) new C22778a(this.f56323e, t);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> AbstractC22752a<T> getProvider(Class<T> cls) {
        if (this.f56320b.contains(cls)) {
            return this.f56324f.getProvider(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.AbstractC22757a, com.google.firebase.components.ComponentContainer
    public <T> Set<T> setOf(Class<T> cls) {
        if (this.f56321c.contains(cls)) {
            return this.f56324f.setOf(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> AbstractC22752a<Set<T>> setOfProvider(Class<T> cls) {
        if (this.f56322d.contains(cls)) {
            return this.f56324f.setOfProvider(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    C22777o(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    hashSet3.add(dependency.getInterface());
                } else {
                    hashSet.add(dependency.getInterface());
                }
            } else if (dependency.isSet()) {
                hashSet4.add(dependency.getInterface());
            } else {
                hashSet2.add(dependency.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(AbstractC22792a.class);
        }
        this.f56319a = Collections.unmodifiableSet(hashSet);
        this.f56320b = Collections.unmodifiableSet(hashSet2);
        this.f56321c = Collections.unmodifiableSet(hashSet3);
        this.f56322d = Collections.unmodifiableSet(hashSet4);
        this.f56323e = component.getPublishedEvents();
        this.f56324f = componentContainer;
    }
}
