package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Component<T> {
    private final Set<Dependency> dependencies;
    private final ComponentFactory<T> factory;
    private final int instantiation;
    private final Set<Class<? super T>> providedInterfaces;
    private final Set<Class<?>> publishedEvents;
    private final int type;

    static /* synthetic */ Object lambda$intoSet$2(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ Object lambda$of$0(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ Object lambda$of$1(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public Set<Dependency> getDependencies() {
        return this.dependencies;
    }

    public ComponentFactory<T> getFactory() {
        return this.factory;
    }

    public Set<Class<? super T>> getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.publishedEvents;
    }

    public static class Builder<T> {
        private final Set<Dependency> dependencies;
        private ComponentFactory<T> factory;
        private int instantiation;
        private final Set<Class<? super T>> providedInterfaces;
        private Set<Class<?>> publishedEvents;
        private int type;

        public Builder<T> intoSet() {
            this.type = 1;
            return this;
        }

        public Builder<T> alwaysEager() {
            return setInstantiation(1);
        }

        public Builder<T> eagerInDefaultApp() {
            return setInstantiation(2);
        }

        public Component<T> build() {
            boolean z;
            if (this.factory != null) {
                z = true;
            } else {
                z = false;
            }
            C22776n.m82766b(z, "Missing required property: factory.");
            return new Component<>(new HashSet(this.providedInterfaces), new HashSet(this.dependencies), this.instantiation, this.type, this.factory, this.publishedEvents);
        }

        public Builder<T> publishes(Class<?> cls) {
            this.publishedEvents.add(cls);
            return this;
        }

        private Builder<T> setInstantiation(int i) {
            boolean z;
            if (this.instantiation == 0) {
                z = true;
            } else {
                z = false;
            }
            C22776n.m82766b(z, "Instantiation type has already been set.");
            this.instantiation = i;
            return this;
        }

        private void validateInterface(Class<?> cls) {
            C22776n.m82765a(!this.providedInterfaces.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.factory = (ComponentFactory) C22776n.m82764a(componentFactory, "Null factory");
            return this;
        }

        public Builder<T> add(Dependency dependency) {
            C22776n.m82764a(dependency, "Null dependency");
            validateInterface(dependency.getInterface());
            this.dependencies.add(dependency);
            return this;
        }

        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new HashSet();
            C22776n.m82764a(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C22776n.m82764a(cls2, "Null interface");
            }
            Collections.addAll(this.providedInterfaces, clsArr);
        }
    }

    public boolean isAlwaysEager() {
        if (this.instantiation == 1) {
            return true;
        }
        return false;
    }

    public boolean isLazy() {
        if (this.instantiation == 0) {
            return true;
        }
        return false;
    }

    public boolean isValue() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public boolean isEagerInDefaultApp() {
        if (this.instantiation == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.providedInterfaces.toArray()) + ">{" + this.instantiation + ", type=" + this.type + ", deps=" + Arrays.toString(this.dependencies.toArray()) + "}";
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).intoSet();
    }

    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    public static <T> Component<T> intoSet(T t, Class<T> cls) {
        return intoSetBuilder(cls).factory(C22760d.m82727a(t)).build();
    }

    public static <T> Component<T> of(Class<T> cls, T t) {
        return builder(cls).factory(C22758b.m82725a(t)).build();
    }

    public static <T> Component<T> of(T t, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(C22759c.m82726a(t)).build();
    }

    private Component(Set<Class<? super T>> set, Set<Dependency> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.providedInterfaces = Collections.unmodifiableSet(set);
        this.dependencies = Collections.unmodifiableSet(set2);
        this.instantiation = i;
        this.type = i2;
        this.factory = componentFactory;
        this.publishedEvents = Collections.unmodifiableSet(set3);
    }
}
