package com.bytedance.crash;

/* renamed from: com.bytedance.crash.k */
public class C3771k {

    /* renamed from: a */
    private static C3771k f11608a;

    /* renamed from: b */
    private static AbstractC3772a f11609b;

    /* renamed from: com.bytedance.crash.k$a */
    public interface AbstractC3772a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15085a() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15086a(String str, String str2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15087b(String str, String str2) {
    }

    C3771k() {
        f11608a = this;
    }

    /* renamed from: b */
    public static String m15584b() {
        C3771k kVar = f11608a;
        if (kVar == null) {
            return "";
        }
        return kVar.mo15085a();
    }

    /* renamed from: a */
    public static void m15583a(AbstractC3772a aVar) {
        f11609b = aVar;
    }

    /* renamed from: c */
    public static void m15585c(String str, String str2) {
        C3771k kVar = f11608a;
        if (kVar != null) {
            kVar.mo15087b(str, str2);
        }
    }

    /* renamed from: d */
    public static void m15586d(String str, String str2) {
        C3771k kVar = f11608a;
        if (kVar != null) {
            kVar.mo15086a(str, str2);
        }
    }
}
