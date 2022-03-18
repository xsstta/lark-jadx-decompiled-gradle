package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.C0904f;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.h */
public final class C0945h {

    /* renamed from: a */
    private static Method f3566a;

    /* renamed from: b */
    private static boolean f3567b;

    /* renamed from: c */
    private static Field f3568c;

    /* renamed from: d */
    private static boolean f3569d;

    /* renamed from: a */
    public static void m4559a(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f3567b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f3566a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3567b = true;
        }
        Method method = f3566a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m4561a(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (Build.VERSION.SDK_INT >= 21) {
            if (!f3569d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f3568c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f3569d = true;
            }
            Field field = f3568c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4560a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0904f.m4351a(i3, ViewCompat.m4082h(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }
}
