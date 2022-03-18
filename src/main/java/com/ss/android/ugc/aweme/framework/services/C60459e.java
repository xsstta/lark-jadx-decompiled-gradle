package com.ss.android.ugc.aweme.framework.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.framework.services.e */
public final class C60459e {

    /* renamed from: a */
    final ConcurrentHashMap<Class<?>, Set<AbstractC60462f<?>>> f151065a;

    /* renamed from: b */
    final Map<Class<?>, Map<String, AbstractC60462f<?>>> f151066b;

    /* renamed from: c */
    public volatile boolean f151067c;

    /* renamed from: d */
    final Set<Class<?>> f151068d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ugc.aweme.framework.services.e$a */
    public static final class C60461a {

        /* renamed from: a */
        public static final C60459e f151069a = new C60459e();
    }

    /* renamed from: a */
    public static C60459e m234895a() {
        return C60461a.f151069a;
    }

    private C60459e() {
        this.f151065a = new ConcurrentHashMap<>();
        this.f151066b = Collections.synchronizedMap(new HashMap());
        this.f151067c = true;
        this.f151068d = Collections.synchronizedSet(new HashSet());
    }

    /* renamed from: b */
    private void m234896b(Class cls) {
        this.f151068d.add(cls);
    }

    /* renamed from: a */
    public <T> T mo206957a(Class<T> cls) {
        return (T) mo206958a(cls, false);
    }

    /* renamed from: c */
    private <T> T m234897c(Class<T> cls) {
        Iterator a = C60451a.m234881a(cls);
        if (a.hasNext()) {
            return (T) a.next();
        }
        return null;
    }

    /* renamed from: a */
    public <T> T mo206958a(Class<T> cls, boolean z) {
        return (T) mo206959a(cls, z, this.f151067c);
    }

    /* renamed from: a */
    public <T> T mo206959a(Class<T> cls, boolean z, boolean z2) {
        boolean z3;
        T t;
        if (C60455c.m234890a().mo206955b(cls)) {
            t = (T) C60455c.m234890a().mo206954a(cls);
            if (t != null) {
                return t;
            }
            z3 = true;
        } else {
            t = null;
            z3 = false;
        }
        Set<AbstractC60462f<?>> set = this.f151065a.get(cls);
        if (set != null && !set.isEmpty() && !z) {
            t = (T) ((AbstractC60462f) set.toArray()[0]).mo206960a();
        }
        if (t != null) {
            m234896b(cls);
            return t;
        }
        T t2 = (T) C60463g.m234902a().mo206961a(cls);
        if (t2 != null) {
            m234896b(cls);
            return t2;
        }
        T t3 = (T) m234897c(cls);
        if (t3 != null) {
            m234896b(cls);
            return t3;
        }
        if (!z3) {
            t3 = (T) C60455c.m234890a().mo206954a(cls);
        }
        if (t3 != null || !z2) {
            return t3;
        }
        new C60457d();
        return (T) C60457d.m234894a(cls);
    }
}
