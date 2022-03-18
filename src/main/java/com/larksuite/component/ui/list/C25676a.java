package com.larksuite.component.ui.list;

import android.view.View;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.larksuite.component.ui.list.a */
public class C25676a {

    /* renamed from: a */
    private static Map<Class<? extends Object>, Map<C25677a<?, ? extends View>, IComponentBinder<? extends View, ?>>> f62729a = new HashMap();

    /* renamed from: b */
    private Map<C25677a<?, ?>, IComponentBinder<? extends View, ?>> f62730b = new LinkedHashMap();

    /* renamed from: c */
    private Map<C25677a<?, ?>, IComponentBinder<? extends View, ?>> f62731c = new HashMap();

    /* renamed from: d */
    private Map<IComponentBinder, View> f62732d = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.ui.list.a$a */
    public static class C25677a<M, V extends View> {

        /* renamed from: a */
        private final Class<M> f62733a;

        /* renamed from: b */
        private final Class<V> f62734b;

        public int hashCode() {
            return Objects.hash(this.f62733a, this.f62734b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25677a aVar = (C25677a) obj;
            if (!Objects.equals(this.f62733a, aVar.f62733a) || !Objects.equals(this.f62734b, aVar.f62734b)) {
                return false;
            }
            return true;
        }

        public C25677a(Class<M> cls, Class<V> cls2) {
            this.f62733a = cls;
            this.f62734b = cls2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo89820b(Class<?> cls, Class<?> cls2) {
            if (this.f62733a != cls || !this.f62734b.isAssignableFrom(cls2)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo89819a(Class<?> cls, Class<?> cls2) {
            if (!this.f62733a.isAssignableFrom(cls) || !this.f62734b.isAssignableFrom(cls2)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo89815a() {
        for (Map.Entry<IComponentBinder, View> entry : this.f62732d.entrySet()) {
            entry.getKey().mo88913a(entry.getValue());
        }
        this.f62732d.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo89816a(Class<? extends Object> cls, View view, Class<?> cls2) {
        IComponentBinder a = m92062a(cls, (Class<? extends View>) view.getClass(), cls2);
        if (a != null) {
            a.mo88913a(view);
        }
    }

    /* renamed from: a */
    public <M, V extends View> void mo89818a(Class<M> cls, Class<V> cls2, IComponentBinder<? super V, ? super M> bVar) {
        this.f62730b.put(new C25677a<>(cls, cls2), bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private IComponentBinder m92062a(Class<? extends Object> cls, Class<? extends View> cls2, Class<?> cls3) {
        C25677a<?, ?> aVar = new C25677a<>(cls3, cls2);
        IComponentBinder<? extends View, ?> bVar = this.f62731c.get(aVar);
        if (bVar != null) {
            return bVar;
        }
        IComponentBinder<? extends View, ?> a = m92063a((Map<C25677a<?, ? extends View>, IComponentBinder<? extends View, ?>>) this.f62730b, cls3, cls2);
        if (a == null) {
            a = m92063a(f62729a.get(cls), cls3, cls2);
        }
        if (a != null) {
            this.f62731c.put(aVar, a);
        }
        return a;
    }

    /* renamed from: a */
    private IComponentBinder<? extends View, ?> m92063a(Map<C25677a<?, ? extends View>, IComponentBinder<? extends View, ?>> map, Class<?> cls, Class<? extends View> cls2) {
        IComponentBinder<? extends View, ?> bVar = null;
        if (map == null || map.isEmpty()) {
            return null;
        }
        for (Map.Entry<C25677a<?, ? extends View>, IComponentBinder<? extends View, ?>> entry : map.entrySet()) {
            C25677a<?, ? extends View> key = entry.getKey();
            if (key.mo89820b(cls, cls2)) {
                return entry.getValue();
            }
            if (key.mo89819a(cls, cls2) && bVar == null) {
                bVar = entry.getValue();
            }
        }
        return bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo89817a(Class<? extends Object> cls, View view, Object obj) {
        Class<?> cls2 = obj.getClass();
        IComponentBinder a = m92062a(cls, (Class<? extends View>) view.getClass(), cls2);
        if (a != null) {
            a.mo88915a(view, obj);
            this.f62732d.put(a, view);
            return;
        }
        throw new IllegalArgumentException("can not find binder for [" + view.getClass().getSimpleName() + ", " + cls2.getName() + "]");
    }
}
