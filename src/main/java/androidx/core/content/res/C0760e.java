package androidx.core.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.util.C0845f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.content.res.e */
public final class C0760e {

    /* renamed from: androidx.core.content.res.e$b */
    public static final class C0764b {

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.res.e$b$b */
        public static class C0766b {
            /* renamed from: a */
            static void m3691a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m3689a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0766b.m3691a(theme);
            } else if (Build.VERSION.SDK_INT >= 23) {
                C0765a.m3690a(theme);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.res.e$b$a */
        public static class C0765a {

            /* renamed from: a */
            private static final Object f3126a = new Object();

            /* renamed from: b */
            private static Method f3127b;

            /* renamed from: c */
            private static boolean f3128c;

            /* renamed from: a */
            static void m3690a(Resources.Theme theme) {
                synchronized (f3126a) {
                    if (!f3128c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f3127b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f3128c = true;
                    }
                    Method method = f3127b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f3127b = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.core.content.res.e$a */
    public static abstract class AbstractC0761a {
        /* renamed from: a */
        public abstract void mo2634a(int i);

        /* renamed from: a */
        public abstract void mo2635a(Typeface typeface);

        /* renamed from: a */
        public final void mo4286a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                /* class androidx.core.content.res.C0760e.AbstractC0761a.RunnableC07632 */

                public void run() {
                    AbstractC0761a.this.mo2634a(i);
                }
            });
        }

        /* renamed from: a */
        public final void mo4287a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                /* class androidx.core.content.res.C0760e.AbstractC0761a.RunnableC07621 */

                public void run() {
                    AbstractC0761a.this.mo2635a(typeface);
                }
            });
        }
    }

    /* renamed from: a */
    public static Typeface m3678a(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3680a(context, i, new TypedValue(), 0, null, null, false);
    }

    /* renamed from: a */
    public static Drawable m3682a(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: b */
    public static int m3684b(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    /* renamed from: a */
    public static void m3683a(Context context, int i, AbstractC0761a aVar, Handler handler) throws Resources.NotFoundException {
        C0845f.m3991a(aVar);
        if (context.isRestricted()) {
            aVar.mo4286a(-4, handler);
        } else {
            m3680a(context, i, new TypedValue(), 0, aVar, handler, false);
        }
    }

    /* renamed from: a */
    public static Typeface m3679a(Context context, int i, TypedValue typedValue, int i2, AbstractC0761a aVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3680a(context, i, typedValue, i2, aVar, null, true);
    }

    /* renamed from: a */
    private static Typeface m3680a(Context context, int i, TypedValue typedValue, int i2, AbstractC0761a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m3681a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m3681a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.res.C0760e.AbstractC0761a r20, android.os.Handler r21, boolean r22) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0760e.m3681a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.e$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
