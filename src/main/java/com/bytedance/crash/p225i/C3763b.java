package com.bytedance.crash.p225i;

import org.json.JSONArray;

/* renamed from: com.bytedance.crash.i.b */
public class C3763b {

    /* renamed from: a */
    static AbstractC3764a f11602a;

    /* renamed from: b */
    private static AbstractC3766c f11603b;

    /* renamed from: c */
    private static boolean f11604c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.i.b$a */
    public interface AbstractC3764a {
        /* renamed from: a */
        void mo15292a(C3765b bVar);
    }

    /* renamed from: com.bytedance.crash.i.b$b */
    public static class C3765b {
    }

    /* renamed from: com.bytedance.crash.i.b$c */
    public interface AbstractC3766c {
        /* renamed from: a */
        JSONArray mo15293a();
    }

    /* renamed from: c */
    public static void m15572c() {
        f11604c = true;
    }

    /* renamed from: b */
    public static boolean m15571b() {
        return f11604c;
    }

    /* renamed from: a */
    public static JSONArray m15569a() {
        try {
            AbstractC3766c cVar = f11603b;
            if (cVar == null) {
                return null;
            }
            return cVar.mo15293a();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m15570a(C3765b bVar) {
        AbstractC3764a aVar = f11602a;
        if (aVar != null) {
            try {
                aVar.mo15292a(bVar);
            } catch (Throwable unused) {
            }
        }
    }
}
