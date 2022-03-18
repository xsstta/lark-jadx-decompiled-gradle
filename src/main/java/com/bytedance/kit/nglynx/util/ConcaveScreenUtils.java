package com.bytedance.kit.nglynx.util;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0015\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0016\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/kit/nglynx/util/ConcaveScreenUtils;", "", "()V", "HW_TOP_MARGIN", "", "OV_TOP_MARGIN", "isVivoConcaveScreen", "", "()Z", "sHWConcaveScreenHeight", "sIsHwConcaveScreen", "sIsOppoConcaveScreen", "sIsVivoConcaveScreen", "getHWConcaveScreenHeight", "context", "Landroid/content/Context;", "getHWConcaveScreenWidht", "getNotchSize", "", "getRealHeight", "isHWConcaveScreen", "isOVConcaveScreen", "isOppoConcaveScreen", "isVertical", "preload", "", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.g.a */
public final class ConcaveScreenUtils {

    /* renamed from: a */
    public static final ConcaveScreenUtils f38610a = new ConcaveScreenUtils();

    /* renamed from: b */
    private static int f38611b = -1;

    /* renamed from: c */
    private static int f38612c = -1;

    /* renamed from: d */
    private static int f38613d = -1;

    /* renamed from: e */
    private static int f38614e = -1;

    private ConcaveScreenUtils() {
    }

    /* renamed from: a */
    public final boolean mo53813a() {
        int i = f38611b;
        boolean z = false;
        if (i == -1) {
            try {
                Class<?> cls = Class.forName("android.util.FtFeature");
                Intrinsics.checkExpressionValueIsNotNull(cls, "Class.forName(\"android.util.FtFeature\")");
                Method declaredMethod = cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE);
                Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "clazz.getDeclaredMethod(…      )\n                )");
                Object invoke = declaredMethod.invoke(cls, 32);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i2 = z ? 1 : 0;
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    f38611b = i2;
                    return z;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
            } catch (Exception unused) {
            }
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo53814a(Context context) {
        if (mo53813a() || mo53816b(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo53816b(Context context) {
        int i = f38612c;
        if (i == -1) {
            boolean a = mo53815a(context, true);
            f38612c = a ? 1 : 0;
            return a;
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private final int m59023e(Context context) {
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return UIUtils.f38617a.mo53828a(context);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: f */
    private final int[] m59024f(Context context) {
        int[] iArr = {0, 0};
        if (context == null) {
            return iArr;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Method method = loadClass.getMethod("getNotchSize", new Class[0]);
            Intrinsics.checkExpressionValueIsNotNull(method, "HwNotchSizeUtil.getMethod(\"getNotchSize\")");
            Object invoke = method.invoke(loadClass, new Object[0]);
            if (invoke != null) {
                return (int[]) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.IntArray");
        } catch (Exception unused) {
            return iArr;
        }
    }

    /* renamed from: d */
    public final int mo53818d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int i = f38614e;
        if (i != -1) {
            return i;
        }
        int i2 = m59024f(context)[1];
        if (i2 <= 0) {
            i2 = (int) UIUtils.f38617a.mo53827a(context, (float) 28);
        }
        f38614e = i2;
        return i2;
    }

    /* renamed from: c */
    public final boolean mo53817c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int i = f38613d;
        boolean z = false;
        if (i == -1) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                Method method = loadClass.getMethod("hasNotchInScreen", new Class[0]);
                Intrinsics.checkExpressionValueIsNotNull(method, "HwNotchSizeUtil.getMethod(\"hasNotchInScreen\")");
                Object invoke = method.invoke(loadClass, new Object[0]);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i2 = z ? 1 : 0;
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    f38613d = i2;
                    return z;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
            } catch (Exception unused) {
            }
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53815a(android.content.Context r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "Build.BRAND"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "oppo"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ all -> 0x0034 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0034 }
            boolean r1 = android.text.TextUtils.equals(r2, r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0034
            if (r5 == 0) goto L_0x0034
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "com.oppo.feature.screen.heteromorphism"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0035
        L_0x002c:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)     // Catch:{ all -> 0x0034 }
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r1 == 0) goto L_0x004a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0049
            if (r6 == 0) goto L_0x0049
            int r5 = r4.m59023e(r5)
            r6 = 2280(0x8e8, float:3.195E-42)
            if (r5 < r6) goto L_0x004a
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = r1
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.kit.nglynx.util.ConcaveScreenUtils.mo53815a(android.content.Context, boolean):boolean");
    }
}
