package com.bytedance.platform.godzilla.p860a.p861a;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.common.C20324d;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.platform.godzilla.a.a.a */
public class C20255a extends AbstractC20329a {

    /* renamed from: a */
    public static Activity f49538a;

    /* renamed from: b */
    private static boolean f49539b;

    /* renamed from: c */
    private Application f49540c;

    /* renamed from: d */
    private Application.ActivityLifecycleCallbacks f49541d;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "ServerSideCrashesPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
        C20257a aVar = new C20257a();
        this.f49541d = aVar;
        Application application = this.f49540c;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(aVar);
        }
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        super.mo68531a(application);
        this.f49540c = application;
    }

    /* renamed from: com.bytedance.platform.godzilla.a.a.a$a */
    public static class C20257a implements Application.ActivityLifecycleCallbacks {
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT <= 28) {
                C20255a.f49538a = null;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT <= 28) {
                C20255a.f49538a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT <= 28) {
                C20255a.f49538a = activity;
                C20255a.m73948a(activity);
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT <= 28) {
                C20255a.f49538a = activity;
                C20255a.m73949a(true);
            }
        }
    }

    /* renamed from: a */
    public static void m73948a(Activity activity) {
        Field a = m73947a(activity, "mStartedActivity");
        if (a != null) {
            try {
                a.setAccessible(true);
                a.set(activity, true);
            } catch (Exception e) {
                Logger.m74099c("ServerBugFixer", "setStartedActivity fail " + e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A[Catch:{ all -> 0x0099 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083 A[Catch:{ all -> 0x0099 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Throwable m73946a(java.lang.Throwable r7) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.godzilla.p860a.p861a.C20255a.m73946a(java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: a */
    public static void m73949a(boolean z) {
        Field field;
        if (!f49539b) {
            f49539b = true;
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT <= 28) {
                try {
                    if (Build.VERSION.SDK_INT < 26) {
                        field = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
                    } else {
                        field = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
                    }
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    Field declaredField = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
                    declaredField.setAccessible(true);
                    final Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        if (z) {
                            Class<?> cls = Class.forName("android.app.IActivityManager");
                            if (cls != null) {
                                declaredField.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new InvocationHandler() {
                                    /* class com.bytedance.platform.godzilla.p860a.p861a.C20255a.C202561 */

                                    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006c */
                                    @Override // java.lang.reflect.InvocationHandler
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public java.lang.Object invoke(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) throws java.lang.Throwable {
                                        /*
                                        // Method dump skipped, instructions count: 121
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.godzilla.p860a.p861a.C20255a.C202561.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
                                    }
                                }));
                                return;
                            }
                            return;
                        }
                        declaredField.set(obj, obj);
                    }
                } catch (ClassNotFoundException e) {
                    Logger.m74099c("ServerBugFixer", "Fix fail " + e);
                } catch (NoSuchFieldException e2) {
                    Logger.m74099c("ServerBugFixer", "Fix fail " + e2);
                } catch (IllegalAccessException e3) {
                    Logger.m74099c("ServerBugFixer", "Fix fail " + e3);
                }
            }
        }
    }

    /* renamed from: a */
    public static Field m73947a(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                Field a = C20324d.m74109a(cls, str);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
