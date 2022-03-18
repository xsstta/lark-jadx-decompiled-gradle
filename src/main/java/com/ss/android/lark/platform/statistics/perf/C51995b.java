package com.ss.android.lark.platform.statistics.perf;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.platform.statistics.perf.b */
public class C51995b {

    /* renamed from: a */
    private static final Object f129119a = new Object();

    /* renamed from: b */
    private static ConcurrentHashMap<AbstractC51996a, Object> f129120b = new ConcurrentHashMap<>();

    /* renamed from: com.ss.android.lark.platform.statistics.perf.b$a */
    public interface AbstractC51996a {
        /* renamed from: a */
        void mo178166a();

        /* renamed from: a */
        void mo178167a(String str);

        /* renamed from: a */
        void mo178168a(String str, String str2);

        /* renamed from: a */
        void mo178169a(String str, String str2, int i);

        /* renamed from: a */
        void mo178170a(boolean z);

        /* renamed from: a */
        void mo178171a(boolean z, boolean z2);

        /* renamed from: b */
        void mo178172b();

        /* renamed from: b */
        void mo178173b(String str, String str2, int i);
    }

    /* renamed from: a */
    public static void m201714a() {
        for (AbstractC51996a aVar : f129120b.keySet()) {
            aVar.mo178166a();
        }
    }

    /* renamed from: b */
    public static void m201721b() {
        for (AbstractC51996a aVar : f129120b.keySet()) {
            aVar.mo178172b();
        }
    }

    /* renamed from: a */
    public static void m201715a(AbstractC51996a aVar) {
        f129120b.put(aVar, f129119a);
    }

    /* renamed from: b */
    public static void m201722b(AbstractC51996a aVar) {
        f129120b.remove(aVar);
    }

    /* renamed from: a */
    public static void m201716a(String str) {
        m201717a(str, (String) null);
    }

    /* renamed from: b */
    public static void m201723b(String str) {
        for (AbstractC51996a aVar : f129120b.keySet()) {
            aVar.mo178167a(str);
        }
    }

    /* renamed from: a */
    public static void m201719a(boolean z) {
        for (AbstractC51996a aVar : f129120b.keySet()) {
            aVar.mo178170a(z);
        }
    }

    /* renamed from: b */
    public static void m201724b(String str, String str2) {
        m201725b(str, str2, 3);
    }

    /* renamed from: c */
    public static void m201726c(String str, String str2) {
        for (AbstractC51996a aVar : f129120b.keySet()) {
            aVar.mo178168a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m201717a(String str, String str2) {
        m201718a(str, str2, 3);
    }

    /* renamed from: a */
    public static void m201720a(boolean z, boolean z2) {
        for (AbstractC51996a aVar : f129120b.keySet()) {
            aVar.mo178171a(z, z2);
        }
    }

    /* renamed from: a */
    public static void m201718a(String str, String str2, int i) {
        for (AbstractC51996a aVar : f129120b.keySet()) {
            aVar.mo178169a(str, str2, i);
        }
    }

    /* renamed from: b */
    public static void m201725b(String str, String str2, int i) {
        for (AbstractC51996a aVar : f129120b.keySet()) {
            aVar.mo178173b(str, str2, i);
        }
    }
}
