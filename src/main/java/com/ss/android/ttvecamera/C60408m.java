package com.ss.android.ttvecamera;

/* renamed from: com.ss.android.ttvecamera.m */
public class C60408m {

    /* renamed from: a */
    private static volatile AbstractC60409a f150976a;

    /* renamed from: com.ss.android.ttvecamera.m$a */
    public interface AbstractC60409a {
        /* renamed from: a */
        void mo206871a(String str, double d);

        /* renamed from: a */
        void mo206872a(String str, long j);

        /* renamed from: a */
        void mo206873a(String str, String str2);
    }

    /* renamed from: a */
    public static void m234767a(AbstractC60409a aVar) {
        f150976a = aVar;
    }

    /* renamed from: a */
    public static void m234768a(String str, double d) {
        if (f150976a != null) {
            f150976a.mo206871a(str, d);
        }
    }

    /* renamed from: a */
    public static void m234769a(String str, long j) {
        if (f150976a != null) {
            f150976a.mo206872a(str, j);
        }
    }

    /* renamed from: a */
    public static void m234770a(String str, String str2) {
        if (f150976a != null) {
            f150976a.mo206873a(str, str2);
        }
    }
}
