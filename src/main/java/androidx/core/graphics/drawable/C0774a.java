package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
public final class C0774a {

    /* renamed from: a */
    private static Method f3151a;

    /* renamed from: b */
    private static boolean f3152b;

    /* renamed from: c */
    private static Method f3153c;

    /* renamed from: d */
    private static boolean f3154d;

    /* renamed from: a */
    public static void m3764a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: b */
    public static boolean m3773b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: c */
    public static int m3775c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m3776d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: e */
    public static ColorFilter m3777e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static <T extends Drawable> T m3780h(Drawable drawable) {
        return drawable instanceof AbstractC0781g ? (T) ((AbstractC0781g) drawable).mo4324a() : drawable;
    }

    /* renamed from: g */
    public static Drawable m3779g(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!(drawable instanceof AbstractC0780f)) {
                return new C0783i(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof AbstractC0780f)) {
            return new C0782h(drawable);
        } else {
            return drawable;
        }
    }

    /* renamed from: f */
    public static void m3778f(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
        } else if (Build.VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m3778f(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof AbstractC0781g) {
                m3778f(((AbstractC0781g) drawable).mo4324a());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Drawable child = drawableContainerState.getChild(i);
                    if (child != null) {
                        m3778f(child);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: i */
    public static int m3781i(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (!f3154d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f3153c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                f3154d = true;
            }
            Method method = f3153c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f3153c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m3766a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof AbstractC0780f) {
            ((AbstractC0780f) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m3768a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof AbstractC0780f) {
            ((AbstractC0780f) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: b */
    public static boolean m3774b(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (!f3152b) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f3151a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f3152b = true;
            }
            Method method = f3151a;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f3151a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m3769a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m3771a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof AbstractC0780f) {
            ((AbstractC0780f) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m3772a(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: a */
    public static void m3765a(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m3767a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m3770a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }
}
