package com.bytedance.ug.sdk.share.impl.p928j;

import android.util.Log;
import com.huawei.hms.common.util.Logger;

/* renamed from: com.bytedance.ug.sdk.share.impl.j.e */
public class C20854e {

    /* renamed from: a */
    private static int f51033a = 4;

    /* renamed from: b */
    private static AbstractC20856a f51034b = C20857b.m75919a();

    /* renamed from: com.bytedance.ug.sdk.share.impl.j.e$b */
    private static class C20857b extends AbstractC20856a {

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ug.sdk.share.impl.j.e$b$a */
        public static class C20858a {

            /* renamed from: a */
            public static final C20857b f51035a = new C20857b();
        }

        private C20857b() {
        }

        /* renamed from: a */
        static C20857b m75919a() {
            return C20858a.f51035a;
        }

        @Override // com.bytedance.ug.sdk.share.impl.p928j.C20854e.AbstractC20856a
        /* renamed from: b */
        public void mo70334b(String str, String str2) {
            Log.e(str, str2);
        }

        @Override // com.bytedance.ug.sdk.share.impl.p928j.C20854e.AbstractC20856a
        /* renamed from: a */
        public void mo70332a(String str, String str2) {
            Log.i(str, str2);
        }
    }

    /* renamed from: a */
    public static int m75911a() {
        return f51033a;
    }

    /* renamed from: a */
    public static void m75912a(String str) {
        m75913a(Logger.f57967b, str);
    }

    /* renamed from: b */
    public static void m75914b(String str) {
        m75915b(Logger.f57967b, str);
    }

    /* renamed from: com.bytedance.ug.sdk.share.impl.j.e$a */
    public static abstract class AbstractC20856a {
        /* renamed from: a */
        public void mo70332a(String str, String str2) {
        }

        /* renamed from: b */
        public void mo70334b(String str, String str2) {
        }

        /* renamed from: a */
        public boolean mo70333a(int i) {
            if (C20854e.m75911a() < i) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m75913a(String str, String str2) {
        if (str2 != null && f51034b.mo70333a(4)) {
            f51034b.mo70332a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m75915b(String str, String str2) {
        if (str2 != null && f51034b.mo70333a(6)) {
            f51034b.mo70334b(str, str2);
        }
    }
}
