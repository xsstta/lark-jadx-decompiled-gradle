package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.graphics.drawable.C0293c;
import androidx.core.graphics.drawable.AbstractC0781g;
import androidx.core.graphics.drawable.C0774a;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.widget.p */
public class C0460p {

    /* renamed from: a */
    public static final Rect f1685a = new Rect();

    /* renamed from: b */
    private static final int[] f1686b = {16842912};

    /* renamed from: c */
    private static final int[] f1687c = new int[0];

    /* renamed from: d */
    private static Class<?> f1688d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1688d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: b */
    static void m2060b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m2062d(drawable);
        }
    }

    /* renamed from: d */
    private static void m2062d(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1686b);
        } else {
            drawable.setState(f1687c);
        }
        drawable.setState(state);
    }

    /* renamed from: c */
    public static boolean m2061c(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m2061c(drawable2)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof AbstractC0781g) {
            return m2061c(((AbstractC0781g) drawable).mo4324a());
        } else {
            if (drawable instanceof C0293c) {
                return m2061c(((C0293c) drawable).mo1105a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m2061c(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: a */
    public static Rect m2059a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1688d != null) {
            try {
                Drawable h = C0774a.m3780h(drawable);
                Object invoke = h.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(h, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    Field[] fields = f1688d.getFields();
                    for (Field field : fields) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1685a;
    }

    /* renamed from: a */
    public static PorterDuff.Mode m2058a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
