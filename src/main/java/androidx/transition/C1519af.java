package androidx.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: androidx.transition.af */
public class C1519af {

    /* renamed from: a */
    private static LayoutTransition f5347a;

    /* renamed from: b */
    private static Field f5348b;

    /* renamed from: c */
    private static boolean f5349c;

    /* renamed from: d */
    private static Method f5350d;

    /* renamed from: e */
    private static boolean f5351e;

    /* renamed from: a */
    private static void m6978a(LayoutTransition layoutTransition) {
        if (!f5351e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f5350d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f5351e = true;
        }
        Method method = f5350d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m6979a(android.view.ViewGroup r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1519af.m6979a(android.view.ViewGroup, boolean):void");
    }
}
