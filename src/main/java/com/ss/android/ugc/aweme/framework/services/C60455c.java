package com.ss.android.ugc.aweme.framework.services;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.framework.services.c */
public class C60455c {

    /* renamed from: a */
    final Map<String, String> f151059a = new HashMap();

    /* renamed from: b */
    final Set<String> f151060b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    final Set<String> f151061c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    private Map<String, AbstractC60462f> f151062d = new HashMap();

    /* renamed from: e */
    private Map<String, Object> f151063e = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ugc.aweme.framework.services.c$a */
    public static class C60456a {

        /* renamed from: a */
        public static final C60455c f151064a = new C60455c();
    }

    /* renamed from: a */
    public static C60455c m234890a() {
        return C60456a.f151064a;
    }

    /* renamed from: c */
    private <T> T m234891c(Class<T> cls) {
        this.f151061c.add(cls.getName());
        return null;
    }

    /* renamed from: b */
    public boolean mo206955b(Class cls) {
        String str = this.f151059a.get(cls.getName());
        if (!TextUtils.isEmpty(str)) {
            return this.f151060b.contains(str);
        }
        return false;
    }

    /* renamed from: a */
    public <T> T mo206954a(Class<T> cls) {
        String name = cls.getName();
        AbstractC60462f fVar = this.f151062d.get(name);
        if (fVar != null) {
            return (T) fVar.mo206960a();
        }
        T t = (T) this.f151063e.get(name);
        return (t != null || this.f151061c.contains(name)) ? t : (T) m234891c(cls);
    }
}
