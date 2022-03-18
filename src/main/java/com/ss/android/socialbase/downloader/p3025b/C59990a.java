package com.ss.android.socialbase.downloader.p3025b;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.ss.android.socialbase.downloader.b.a */
public class C59990a {

    /* renamed from: a */
    private static int f149573a = 4;

    /* renamed from: b */
    private static AbstractC59991a f149574b;

    /* renamed from: com.ss.android.socialbase.downloader.b.a$a */
    public static abstract class AbstractC59991a {
        /* renamed from: a */
        public void mo204279a(String str, String str2) {
        }

        /* renamed from: a */
        public void mo204280a(String str, String str2, Throwable th) {
        }

        /* renamed from: b */
        public void mo204281b(String str, String str2) {
        }

        /* renamed from: c */
        public void mo204282c(String str, String str2) {
        }
    }

    /* renamed from: a */
    public static boolean m232836a() {
        if (f149573a <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m232832a(int i) {
        f149573a = i;
    }

    /* renamed from: a */
    public static void m232833a(String str) {
        m232838b("DownloaderLogger", str);
    }

    /* renamed from: b */
    public static String m232837b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "DownloaderLogger";
        }
        return "Downloader-" + str;
    }

    /* renamed from: a */
    public static void m232834a(String str, String str2) {
        if (str2 != null && f149573a <= 2) {
            Log.v(str, str2);
        }
    }

    /* renamed from: b */
    public static void m232838b(String str, String str2) {
        if (str2 != null && f149573a <= 3) {
            Log.d(m232837b(str), str2);
        }
    }

    /* renamed from: c */
    public static void m232839c(String str, String str2) {
        if (str2 != null) {
            if (f149573a <= 4) {
                Log.i(m232837b(str), str2);
            }
            AbstractC59991a aVar = f149574b;
            if (aVar != null) {
                aVar.mo204279a(m232837b(str), str2);
            }
        }
    }

    /* renamed from: d */
    public static void m232840d(String str, String str2) {
        if (str2 != null) {
            if (f149573a <= 5) {
                Log.w(m232837b(str), str2);
            }
            AbstractC59991a aVar = f149574b;
            if (aVar != null) {
                aVar.mo204282c(m232837b(str), str2);
            }
        }
    }

    /* renamed from: e */
    public static void m232841e(String str, String str2) {
        if (str2 != null) {
            if (f149573a <= 6) {
                Log.e(m232837b(str), str2);
            }
            AbstractC59991a aVar = f149574b;
            if (aVar != null) {
                aVar.mo204281b(m232837b(str), str2);
            }
        }
    }

    /* renamed from: a */
    public static void m232835a(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            if (f149573a <= 6) {
                Log.e(m232837b(str), str2, th);
            }
            AbstractC59991a aVar = f149574b;
            if (aVar != null) {
                aVar.mo204280a(m232837b(str), str2, th);
            }
        }
    }
}
