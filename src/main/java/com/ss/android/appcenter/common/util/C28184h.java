package com.ss.android.appcenter.common.util;

import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.appcenter.common.util.h */
public class C28184h {

    /* renamed from: a */
    public static boolean f70684a;

    /* renamed from: b */
    private static AbstractC28185a f70685b;

    /* renamed from: com.ss.android.appcenter.common.util.h$a */
    public interface AbstractC28185a {
        /* renamed from: a */
        void mo100395a(String str, String str2);

        /* renamed from: a */
        void mo100396a(String str, String str2, Throwable th);

        /* renamed from: b */
        void mo100397b(String str, String str2);

        /* renamed from: c */
        void mo100398c(String str, String str2);

        /* renamed from: d */
        void mo100399d(String str, String str2);
    }

    /* renamed from: a */
    public static void m103245a(AbstractC28185a aVar) {
        if (aVar != null) {
            f70685b = aVar;
        }
    }

    /* renamed from: a */
    public static void m103246a(String str, String str2) {
        if (f70684a) {
            Log.m165379d(str, str2);
        }
        AbstractC28185a aVar = f70685b;
        if (aVar != null) {
            aVar.mo100395a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m103248b(String str, String str2) {
        if (f70684a) {
            Log.m165383e(str, str2);
        }
        AbstractC28185a aVar = f70685b;
        if (aVar != null) {
            aVar.mo100399d(str, str2);
        }
    }

    /* renamed from: c */
    public static void m103249c(String str, String str2) {
        if (f70684a) {
            Log.m165397w(str, str2);
        }
        AbstractC28185a aVar = f70685b;
        if (aVar != null) {
            aVar.mo100398c(str, str2);
        }
    }

    /* renamed from: d */
    public static void m103250d(String str, String str2) {
        if (f70684a) {
            Log.m165389i(str, str2);
        }
        AbstractC28185a aVar = f70685b;
        if (aVar != null) {
            aVar.mo100397b(str, str2);
        }
    }

    /* renamed from: a */
    public static void m103247a(String str, String str2, Throwable th) {
        if (f70684a) {
            Log.m165384e(str, str2, th);
        }
        AbstractC28185a aVar = f70685b;
        if (aVar != null) {
            aVar.mo100396a(str, str2, th);
        }
    }
}
