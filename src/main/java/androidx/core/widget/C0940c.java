package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
public final class C0940c {

    /* renamed from: a */
    private static Field f3563a;

    /* renamed from: b */
    private static boolean f3564b;

    /* renamed from: a */
    public static ColorStateList m4545a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof AbstractC0948k) {
            return ((AbstractC0948k) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static Drawable m4548b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f3564b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3563a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f3564b = true;
        }
        Field field = f3563a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f3563a = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m4546a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof AbstractC0948k) {
            ((AbstractC0948k) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m4547a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof AbstractC0948k) {
            ((AbstractC0948k) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
