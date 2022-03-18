package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.b */
public final class C0823b {

    /* renamed from: a */
    private static Method f3282a;

    /* renamed from: b */
    private static Method f3283b;

    static {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f3282a = cls.getMethod("getScript", String.class);
                    f3283b = cls.getMethod("addLikelySubtags", String.class);
                }
            } catch (Exception e) {
                f3282a = null;
                f3283b = null;
                Log.w("ICUCompat", e);
            }
        } else if (Build.VERSION.SDK_INT < 24) {
            try {
                f3283b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m3956a(String str) {
        try {
            Method method = f3282a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: b */
    private static String m3958b(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f3283b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    /* renamed from: a */
    public static String m3957a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f3283b.invoke(null, locale)).getScript();
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        } else {
            String b = m3958b(locale);
            if (b != null) {
                return m3956a(b);
            }
            return null;
        }
    }
}
