package com.ss.android.ugc.aweme.framework.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.framework.services.g */
public class C60463g {

    /* renamed from: a */
    final Set<String> f151070a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    final Set<String> f151071b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    private Map<String, Object> f151072c = new HashMap();

    /* renamed from: d */
    private Map<String, Set<Object>> f151073d = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ugc.aweme.framework.services.g$a */
    public static class C60464a {

        /* renamed from: a */
        public static final C60463g f151074a = new C60463g();
    }

    /* renamed from: a */
    public static C60463g m234902a() {
        return C60464a.f151074a;
    }

    /* renamed from: b */
    private <T> T m234903b(Class<T> cls) {
        this.f151070a.add(cls.getName());
        return null;
    }

    /* renamed from: a */
    public <T> T mo206961a(Class<T> cls) {
        String name = cls.getName();
        T t = (T) this.f151072c.get(name);
        return (t != null || this.f151070a.contains(name)) ? t : (T) m234903b(cls);
    }
}
