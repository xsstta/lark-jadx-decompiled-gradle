package com.tt.miniapp.util;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.util.g */
public class C67033g {

    /* renamed from: com.tt.miniapp.util.g$a */
    public static class C67034a {

        /* renamed from: a */
        public int f169000a = -1;

        /* renamed from: b */
        public int f169001b = -1;

        /* renamed from: c */
        public int f169002c = -1;

        /* renamed from: d */
        public int f169003d = -1;
    }

    /* renamed from: a */
    public static boolean m261251a() {
        C67034a aVar = ContextSingletonInstance.getInstance().concaveScreenInstance;
        boolean z = false;
        if (aVar.f169000a == -1) {
            try {
                Class<?> cls = Class.forName("android.util.FtFeature");
                z = ((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
            } catch (Exception unused) {
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            aVar.f169000a = i;
            return z;
        } else if (aVar.f169000a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static void m261250a(Context context) {
        m261251a();
        m261254c(context);
        m261255d(context);
        m261256e(context);
    }

    /* renamed from: b */
    public static boolean m261253b(Context context) {
        if (m261251a() || m261254c(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m261254c(Context context) {
        C67034a aVar = ContextSingletonInstance.getInstance().concaveScreenInstance;
        if (aVar.f169001b == -1) {
            boolean a = m261252a(context, true);
            aVar.f169001b = a ? 1 : 0;
            return a;
        } else if (aVar.f169001b == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m261255d(Context context) {
        C67034a aVar = ContextSingletonInstance.getInstance().concaveScreenInstance;
        boolean z = false;
        if (aVar.f169002c == -1) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                z = ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            aVar.f169002c = i;
            return z;
        } else if (aVar.f169002c == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    public static int m261256e(Context context) {
        C67034a aVar = ContextSingletonInstance.getInstance().concaveScreenInstance;
        if (aVar.f169003d != -1) {
            return aVar.f169003d;
        }
        int i = m261258g(context)[1];
        if (i <= 0) {
            i = (int) C67590h.m263065a(context, 28.0f);
        }
        aVar.f169003d = i;
        return i;
    }

    /* renamed from: f */
    private static int m261257f(Context context) {
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return C67590h.m263080b(context);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: g */
    private static int[] m261258g(Context context) {
        int[] iArr = {0, 0};
        if (context == null) {
            return iArr;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return (int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
        } catch (Exception unused) {
            return iArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m261252a(android.content.Context r4, boolean r5) {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x001c }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "oppo"
            boolean r1 = android.text.TextUtils.equals(r2, r1)     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x001c
            if (r4 == 0) goto L_0x001c
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "com.oppo.feature.screen.heteromorphism"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch:{ all -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x0032
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0031
            if (r5 == 0) goto L_0x0031
            int r4 = m261257f(r4)
            r5 = 2280(0x8e8, float:3.195E-42)
            if (r4 < r5) goto L_0x0030
            r0 = 1
        L_0x0030:
            return r0
        L_0x0031:
            return r1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.C67033g.m261252a(android.content.Context, boolean):boolean");
    }
}
