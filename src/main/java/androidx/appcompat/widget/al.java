package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class al {

    /* renamed from: a */
    private static Method f1593a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1593a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f1593a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static boolean m1864a(View view) {
        if (ViewCompat.m4082h(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m1865b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            } catch (IllegalAccessException e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m1863a(View view, Rect rect, Rect rect2) {
        Method method = f1593a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }
}
