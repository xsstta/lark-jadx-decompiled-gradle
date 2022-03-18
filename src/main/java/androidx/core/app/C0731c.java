package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.app.c */
public final class C0731c {

    /* renamed from: a */
    protected static final Class<?> f3068a;

    /* renamed from: b */
    protected static final Field f3069b = m3587b();

    /* renamed from: c */
    protected static final Field f3070c = m3589c();

    /* renamed from: d */
    protected static final Method f3071d;

    /* renamed from: e */
    protected static final Method f3072e;

    /* renamed from: f */
    protected static final Method f3073f;

    /* renamed from: g */
    private static final Handler f3074g = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static Field m3587b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Field m3589c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m3591d() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m3584a() {
        if (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) {
            return true;
        }
        return false;
    }

    static {
        Class<?> d = m3591d();
        f3068a = d;
        f3071d = m3583a(d);
        f3072e = m3588b(d);
        f3073f = m3590c(d);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.app.c$a */
    public static final class C0735a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f3081a;

        /* renamed from: b */
        private Activity f3082b;

        /* renamed from: c */
        private boolean f3083c;

        /* renamed from: d */
        private boolean f3084d;

        /* renamed from: e */
        private boolean f3085e;

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }

        C0735a(Activity activity) {
            this.f3082b = activity;
        }

        public void onActivityStarted(Activity activity) {
            if (this.f3082b == activity) {
                this.f3083c = true;
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f3082b == activity) {
                this.f3082b = null;
                this.f3084d = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f3084d && !this.f3085e && !this.f3083c && C0731c.m3586a(this.f3081a, activity)) {
                this.f3085e = true;
                this.f3081a = null;
            }
        }
    }

    /* renamed from: b */
    private static Method m3588b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m3583a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m3590c(Class<?> cls) {
        if (m3584a() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static boolean m3585a(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m3584a() && f3073f == null) {
            return false;
        } else {
            if (f3072e == null && f3071d == null) {
                return false;
            }
            try {
                final Object obj2 = f3070c.get(activity);
                if (obj2 == null || (obj = f3069b.get(activity)) == null) {
                    return false;
                }
                final Application application = activity.getApplication();
                final C0735a aVar = new C0735a(activity);
                application.registerActivityLifecycleCallbacks(aVar);
                Handler handler = f3074g;
                handler.post(new Runnable() {
                    /* class androidx.core.app.C0731c.RunnableC07321 */

                    public void run() {
                        C0735a.this.f3081a = obj2;
                    }
                });
                try {
                    if (m3584a()) {
                        f3073f.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                    } else {
                        activity.recreate();
                    }
                    handler.post(new Runnable() {
                        /* class androidx.core.app.C0731c.RunnableC07332 */

                        public void run() {
                            application.unregisterActivityLifecycleCallbacks(aVar);
                        }
                    });
                    return true;
                } catch (Throwable th) {
                    f3074g.post(new Runnable() {
                        /* class androidx.core.app.C0731c.RunnableC07332 */

                        public void run() {
                            application.unregisterActivityLifecycleCallbacks(aVar);
                        }
                    });
                    throw th;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    protected static boolean m3586a(Object obj, Activity activity) {
        try {
            final Object obj2 = f3070c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            final Object obj3 = f3069b.get(activity);
            f3074g.postAtFrontOfQueue(new Runnable() {
                /* class androidx.core.app.C0731c.RunnableC07343 */

                public void run() {
                    try {
                        if (C0731c.f3071d != null) {
                            C0731c.f3071d.invoke(obj3, obj2, false, "AppCompat recreation");
                            return;
                        }
                        C0731c.f3072e.invoke(obj3, obj2, false);
                    } catch (RuntimeException e) {
                        if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }
}
