package com.bytedance.apm6.util.p195b;

import android.util.Log;
import com.bytedance.apm6.util.C3345a;

/* renamed from: com.bytedance.apm6.util.b.b */
public class C3350b {

    /* renamed from: a */
    private static AbstractC3349a f10641a = new C3351a();

    /* renamed from: a */
    public static void m13931a(AbstractC3349a aVar) {
        f10641a = aVar;
    }

    /* renamed from: a */
    public static void m13932a(String str, String str2) {
        AbstractC3349a aVar = f10641a;
        if (aVar != null) {
            aVar.mo13578b(str, str2);
        }
    }

    /* renamed from: b */
    public static void m13934b(String str, String str2) {
        AbstractC3349a aVar = f10641a;
        if (aVar != null) {
            aVar.mo13580c(str, str2);
        }
    }

    /* renamed from: c */
    public static void m13936c(String str, String str2) {
        AbstractC3349a aVar = f10641a;
        if (aVar != null) {
            aVar.mo13581d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m13937d(String str, String str2) {
        AbstractC3349a aVar = f10641a;
        if (aVar != null) {
            aVar.mo13560a(str, str2);
        }
    }

    /* renamed from: com.bytedance.apm6.util.b.b$a */
    public static class C3351a implements AbstractC3349a {
        @Override // com.bytedance.apm6.util.p195b.AbstractC3349a
        /* renamed from: a */
        public void mo13560a(String str, String str2) {
            if (C3345a.m13915u()) {
                Log.e(str, str2);
            }
        }

        @Override // com.bytedance.apm6.util.p195b.AbstractC3349a
        /* renamed from: b */
        public void mo13578b(String str, String str2) {
            if (C3345a.m13915u()) {
                Log.d(str, str2);
            }
        }

        @Override // com.bytedance.apm6.util.p195b.AbstractC3349a
        /* renamed from: c */
        public void mo13580c(String str, String str2) {
            if (C3345a.m13915u()) {
                Log.i(str, str2);
            }
        }

        @Override // com.bytedance.apm6.util.p195b.AbstractC3349a
        /* renamed from: d */
        public void mo13581d(String str, String str2) {
            if (C3345a.m13915u()) {
                Log.w(str, str2);
            }
        }

        @Override // com.bytedance.apm6.util.p195b.AbstractC3349a
        /* renamed from: a */
        public void mo13561a(String str, String str2, Throwable th) {
            if (C3345a.m13915u()) {
                Log.e(str, str2, th);
            }
        }

        @Override // com.bytedance.apm6.util.p195b.AbstractC3349a
        /* renamed from: b */
        public void mo13579b(String str, String str2, Throwable th) {
            if (C3345a.m13915u()) {
                Log.w(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static void m13933a(String str, String str2, Throwable th) {
        AbstractC3349a aVar = f10641a;
        if (aVar != null) {
            aVar.mo13579b(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m13935b(String str, String str2, Throwable th) {
        AbstractC3349a aVar = f10641a;
        if (aVar != null) {
            aVar.mo13561a(str, str2, th);
        }
    }
}
