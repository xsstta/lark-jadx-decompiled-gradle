package com.ss.videoarch.liveplayer.p3252c;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.videoarch.liveplayer.c.b */
public class C65621b {

    /* renamed from: a */
    private static int f165179a = -1;

    /* renamed from: b */
    private static String f165180b;

    /* renamed from: c */
    private static C65621b f165181c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C65622a> f165182d = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.liveplayer.c.b$a */
    public static class C65622a {

        /* renamed from: a */
        public String f165183a;

        /* renamed from: b */
        public long f165184b;

        /* renamed from: c */
        public boolean f165185c;

        C65622a() {
        }
    }

    /* renamed from: c */
    public int mo229638c() {
        return f165179a;
    }

    /* renamed from: d */
    public String mo229640d() {
        return f165180b;
    }

    /* renamed from: b */
    public void mo229636b() {
        ConcurrentHashMap<String, C65622a> concurrentHashMap = this.f165182d;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    private C65621b() {
    }

    /* renamed from: a */
    public static C65621b m257243a() {
        if (f165181c == null) {
            synchronized (C65621b.class) {
                if (f165181c == null) {
                    f165181c = new C65621b();
                }
            }
        }
        return f165181c;
    }

    /* renamed from: a */
    public void mo229634a(int i) {
        f165179a = i;
    }

    /* renamed from: c */
    public void mo229639c(String str) {
        f165180b = str;
    }

    /* renamed from: a */
    public C65622a mo229633a(String str) {
        ConcurrentHashMap<String, C65622a> concurrentHashMap = this.f165182d;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public void mo229637b(String str) {
        if (str != null) {
            C65622a aVar = null;
            ConcurrentHashMap<String, C65622a> concurrentHashMap = this.f165182d;
            if (concurrentHashMap != null) {
                aVar = concurrentHashMap.get(str);
            }
            if (aVar != null) {
                aVar.f165185c = true;
            }
        }
    }

    /* renamed from: a */
    public void mo229635a(String str, C65622a aVar) {
        ConcurrentHashMap<String, C65622a> concurrentHashMap = this.f165182d;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, aVar);
        }
    }
}
