package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: androidx.core.view.g */
public final class C0905g {

    /* renamed from: a */
    private static Field f3456a;

    /* renamed from: b */
    private static boolean f3457b;

    /* renamed from: a */
    public static void m4353a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m4354b(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m4354b(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: b */
    private static void m4354b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f3457b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f3456a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f3457b = true;
        }
        Field field = f3456a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }
}
