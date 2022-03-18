package com.bumptech.glide.load.engine.p087a;

import android.util.Log;
import com.bumptech.glide.util.C2567j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.a.j */
public final class C2289j implements AbstractC2278b {

    /* renamed from: a */
    private final C2286h<C2290a, Object> f7634a;

    /* renamed from: b */
    private final C2291b f7635b;

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f7636c;

    /* renamed from: d */
    private final Map<Class<?>, AbstractC2277a<?>> f7637d;

    /* renamed from: e */
    private final int f7638e;

    /* renamed from: f */
    private int f7639f;

    /* renamed from: com.bumptech.glide.load.engine.a.j$b */
    private static final class C2291b extends AbstractC2282d<C2290a> {
        C2291b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2290a mo10687b() {
            return new C2290a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2290a mo10711a(int i, Class<?> cls) {
            C2290a aVar = (C2290a) mo10689c();
            aVar.mo10706a(i, cls);
            return aVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.a.j$a */
    public static final class C2290a implements AbstractC2296m {

        /* renamed from: a */
        int f7640a;

        /* renamed from: b */
        private final C2291b f7641b;

        /* renamed from: c */
        private Class<?> f7642c;

        @Override // com.bumptech.glide.load.engine.p087a.AbstractC2296m
        /* renamed from: a */
        public void mo10680a() {
            this.f7641b.mo10688a(this);
        }

        public int hashCode() {
            int i;
            int i2 = this.f7640a * 31;
            Class<?> cls = this.f7642c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.f7640a + "array=" + this.f7642c + '}';
        }

        C2290a(C2291b bVar) {
            this.f7641b = bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2290a)) {
                return false;
            }
            C2290a aVar = (C2290a) obj;
            if (this.f7640a == aVar.f7640a && this.f7642c == aVar.f7642c) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10706a(int i, Class<?> cls) {
            this.f7640a = i;
            this.f7642c = cls;
        }
    }

    /* renamed from: c */
    private void m9793c() {
        m9794c(this.f7638e);
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2278b
    /* renamed from: a */
    public synchronized void mo10669a() {
        m9794c(0);
    }

    /* renamed from: b */
    private boolean m9791b() {
        int i = this.f7639f;
        if (i == 0 || this.f7638e / i >= 2) {
            return true;
        }
        return false;
    }

    public C2289j() {
        this.f7634a = new C2286h<>();
        this.f7635b = new C2291b();
        this.f7636c = new HashMap();
        this.f7637d = new HashMap();
        this.f7638e = 4194304;
    }

    /* renamed from: a */
    private <T> T m9785a(C2290a aVar) {
        return (T) this.f7634a.mo10698a(aVar);
    }

    /* renamed from: b */
    private <T> AbstractC2277a<T> m9790b(T t) {
        return m9789b((Class) t.getClass());
    }

    /* renamed from: a */
    private NavigableMap<Integer, Integer> m9787a(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f7636c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f7636c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: b */
    private boolean m9792b(int i) {
        if (i <= this.f7638e / 2) {
            return true;
        }
        return false;
    }

    public C2289j(int i) {
        this.f7634a = new C2286h<>();
        this.f7635b = new C2291b();
        this.f7636c = new HashMap();
        this.f7637d = new HashMap();
        this.f7638e = i;
    }

    /* renamed from: b */
    private <T> AbstractC2277a<T> m9789b(Class<T> cls) {
        C2285g gVar = (AbstractC2277a<T>) this.f7637d.get(cls);
        if (gVar == null) {
            if (cls.equals(int[].class)) {
                gVar = new C2288i();
            } else if (cls.equals(byte[].class)) {
                gVar = new C2285g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f7637d.put(cls, gVar);
        }
        return gVar;
    }

    /* renamed from: c */
    private void m9794c(int i) {
        while (this.f7639f > i) {
            Object a = this.f7634a.mo10697a();
            C2567j.m10894a(a);
            AbstractC2277a b = m9790b(a);
            this.f7639f -= b.mo10664a(a) * b.mo10667b();
            m9795c(b.mo10664a(a), a.getClass());
            if (Log.isLoggable(b.mo10666a(), 2)) {
                Log.v(b.mo10666a(), "evicted: " + b.mo10664a(a));
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2278b
    /* renamed from: a */
    public synchronized void mo10670a(int i) {
        if (i >= 40) {
            try {
                mo10669a();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m9794c(this.f7638e / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2278b
    /* renamed from: a */
    public synchronized <T> void mo10671a(T t) {
        Class<?> cls = t.getClass();
        AbstractC2277a<T> b = m9789b((Class) cls);
        int a = b.mo10664a(t);
        int b2 = b.mo10667b() * a;
        if (m9792b(b2)) {
            C2290a a2 = this.f7635b.mo10711a(a, cls);
            this.f7634a.mo10699a(a2, t);
            NavigableMap<Integer, Integer> a3 = m9787a(cls);
            Integer num = (Integer) a3.get(Integer.valueOf(a2.f7640a));
            Integer valueOf = Integer.valueOf(a2.f7640a);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            a3.put(valueOf, Integer.valueOf(i));
            this.f7639f += b2;
            m9793c();
        }
    }

    /* renamed from: a */
    private boolean m9788a(int i, Integer num) {
        if (num == null || (!m9791b() && num.intValue() > i * 8)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private <T> T m9786a(C2290a aVar, Class<T> cls) {
        AbstractC2277a<T> b = m9789b((Class) cls);
        T t = (T) m9785a(aVar);
        if (t != null) {
            this.f7639f -= b.mo10664a(t) * b.mo10667b();
            m9795c(b.mo10664a(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(b.mo10666a(), 2)) {
            Log.v(b.mo10666a(), "Allocated " + aVar.f7640a + " bytes");
        }
        return b.mo10665a(aVar.f7640a);
    }

    /* renamed from: c */
    private void m9795c(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> a = m9787a(cls);
        Integer num = (Integer) a.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            a.remove(Integer.valueOf(i));
        } else {
            a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2278b
    /* renamed from: a */
    public synchronized <T> T mo10668a(int i, Class<T> cls) {
        C2290a aVar;
        Integer ceilingKey = m9787a((Class<?>) cls).ceilingKey(Integer.valueOf(i));
        if (m9788a(i, ceilingKey)) {
            aVar = this.f7635b.mo10711a(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f7635b.mo10711a(i, cls);
        }
        return (T) m9786a(aVar, cls);
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2278b
    /* renamed from: b */
    public synchronized <T> T mo10672b(int i, Class<T> cls) {
        return (T) m9786a(this.f7635b.mo10711a(i, cls), cls);
    }
}
