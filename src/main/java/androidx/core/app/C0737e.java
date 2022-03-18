package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.e */
public final class C0737e {
    /* renamed from: a */
    public static IBinder m3594a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0738a.m3596a(bundle, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.e$a */
    public static class C0738a {

        /* renamed from: a */
        private static Method f3086a;

        /* renamed from: b */
        private static boolean f3087b;

        /* renamed from: c */
        private static Method f3088c;

        /* renamed from: d */
        private static boolean f3089d;

        /* renamed from: a */
        public static IBinder m3596a(Bundle bundle, String str) {
            if (!f3087b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f3086a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f3087b = true;
            }
            Method method2 = f3086a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f3086a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m3597a(Bundle bundle, String str, IBinder iBinder) {
            if (!f3089d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f3088c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f3089d = true;
            }
            Method method2 = f3088c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f3088c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3595a(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0738a.m3597a(bundle, str, iBinder);
        }
    }
}
