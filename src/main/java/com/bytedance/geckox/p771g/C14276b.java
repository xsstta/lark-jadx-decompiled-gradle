package com.bytedance.geckox.p771g;

/* renamed from: com.bytedance.geckox.g.b */
public class C14276b {

    /* renamed from: a */
    private static boolean f37534a;

    /* renamed from: b */
    private static AbstractC14277c f37535b = new C14275a();

    /* renamed from: a */
    public static void m57601a() {
        f37534a = true;
    }

    /* renamed from: a */
    public static void m57602a(AbstractC14277c cVar) {
        f37535b = cVar;
    }

    /* renamed from: a */
    public static void m57604a(String str, Object... objArr) {
        AbstractC14277c cVar;
        if (f37534a && (cVar = f37535b) != null) {
            cVar.mo21904a(str, objArr);
        }
    }

    /* renamed from: a */
    public static void m57603a(String str, String str2, Throwable th) {
        AbstractC14277c cVar;
        if (f37534a && (cVar = f37535b) != null) {
            cVar.mo21903a(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m57605b(String str, String str2, Throwable th) {
        AbstractC14277c cVar;
        if (f37534a && (cVar = f37535b) != null) {
            cVar.mo21905b(str, str2, th);
        }
    }
}
