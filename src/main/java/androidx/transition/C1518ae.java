package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.ae */
class C1518ae {

    /* renamed from: a */
    private static boolean f5344a = true;

    /* renamed from: b */
    private static Method f5345b;

    /* renamed from: c */
    private static boolean f5346c;

    /* renamed from: a */
    static AbstractC1517ad m6975a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1516ac(viewGroup);
        }
        return C1515ab.m6965a(viewGroup);
    }

    /* renamed from: b */
    private static void m6977b(ViewGroup viewGroup, boolean z) {
        if (f5344a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f5344a = false;
            }
        }
    }

    /* renamed from: a */
    static void m6976a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (Build.VERSION.SDK_INT >= 18) {
            m6977b(viewGroup, z);
        } else {
            C1519af.m6979a(viewGroup, z);
        }
    }

    /* renamed from: a */
    static int m6974a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f5346c) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", Integer.TYPE, Integer.TYPE);
                f5345b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f5346c = true;
        }
        Method method = f5345b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }
}
