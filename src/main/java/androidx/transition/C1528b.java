package androidx.transition;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.b */
class C1528b {

    /* renamed from: a */
    private static Method f5377a;

    /* renamed from: b */
    private static Method f5378b;

    /* renamed from: c */
    private static boolean f5379c;

    /* renamed from: a */
    static void m7042a(Canvas canvas, boolean z) {
        Method method;
        if (Build.VERSION.SDK_INT >= 21) {
            if (Build.VERSION.SDK_INT >= 29) {
                if (z) {
                    canvas.enableZ();
                } else {
                    canvas.disableZ();
                }
            } else if (Build.VERSION.SDK_INT != 28) {
                if (!f5379c) {
                    try {
                        Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                        f5377a = declaredMethod;
                        declaredMethod.setAccessible(true);
                        Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                        f5378b = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    f5379c = true;
                }
                if (z) {
                    try {
                        Method method2 = f5377a;
                        if (method2 != null) {
                            method2.invoke(canvas, new Object[0]);
                        }
                    } catch (IllegalAccessException unused2) {
                        return;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getCause());
                    }
                }
                if (!z && (method = f5378b) != null) {
                    method.invoke(canvas, new Object[0]);
                }
            } else {
                throw new IllegalStateException("This method doesn't work on Pie!");
            }
        }
    }
}
