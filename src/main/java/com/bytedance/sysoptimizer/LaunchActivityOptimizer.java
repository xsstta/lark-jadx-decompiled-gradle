package com.bytedance.sysoptimizer;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchActivityOptimizer {
    private static boolean initialized;
    public static Activity mActivity;
    public static CopyOnWriteArrayList<ExceptionCatcher> sExceptionCatchers = new CopyOnWriteArrayList<>();

    public static void unRegisterExceptionCatcher(ExceptionCatcher exceptionCatcher) {
        if (exceptionCatcher != null) {
            sExceptionCatchers.remove(exceptionCatcher);
        }
    }

    public static class DeadException implements ExceptionCatcher {
        @Override // com.bytedance.sysoptimizer.ExceptionCatcher
        public boolean registerCondition() {
            return true;
        }

        @Override // com.bytedance.sysoptimizer.ExceptionCatcher
        public boolean analysis(Throwable th) {
            if (!(th instanceof InvocationTargetException)) {
                return false;
            }
            InvocationTargetException invocationTargetException = (InvocationTargetException) th;
            if ((invocationTargetException.getTargetException() instanceof DeadObjectException) || (invocationTargetException.getTargetException() instanceof DeadSystemException)) {
                return true;
            }
            return false;
        }
    }

    public static class LaunchActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT <= 28) {
                LaunchActivityOptimizer.mActivity = null;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT <= 28) {
                LaunchActivityOptimizer.mActivity = null;
            }
        }

        public void onActivityResumed(Activity activity) {
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT <= 28) {
                LaunchActivityOptimizer.mActivity = activity;
                LaunchActivityOptimizer.setStartedActivity(activity);
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT <= 28) {
                LaunchActivityOptimizer.mActivity = activity;
                LaunchActivityOptimizer.hookAMS(true);
            }
        }
    }

    public static void registerExceptionCatcher(ExceptionCatcher exceptionCatcher) {
        if (exceptionCatcher != null && exceptionCatcher.registerCondition() && !sExceptionCatchers.contains(exceptionCatcher)) {
            sExceptionCatchers.add(exceptionCatcher);
        }
    }

    public static void setStartedActivity(Activity activity) {
        Field declaredField = getDeclaredField(activity, "mStartedActivity");
        if (declaredField != null) {
            try {
                declaredField.setAccessible(true);
                declaredField.set(activity, true);
            } catch (Exception unused) {
            }
        }
    }

    public static void hookAMS(boolean z) {
        Field field;
        if (!initialized) {
            initialized = true;
            HackHelper.init();
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
                                    /* class com.bytedance.sysoptimizer.LaunchActivityOptimizer.C207061 */

                                    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006c */
                                    @Override // java.lang.reflect.InvocationHandler
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public java.lang.Object invoke(java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) throws java.lang.Throwable {
                                        /*
                                        // Method dump skipped, instructions count: 146
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sysoptimizer.LaunchActivityOptimizer.C207061.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
                                    }
                                }));
                                return;
                            }
                            return;
                        }
                        declaredField.set(obj, obj);
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A[Catch:{ all -> 0x0099 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083 A[Catch:{ all -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Throwable getSafeThrowable(java.lang.Throwable r7) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sysoptimizer.LaunchActivityOptimizer.getSafeThrowable(java.lang.Throwable):java.lang.Throwable");
    }

    public static Field getDeclaredField(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                Field field = HackHelper.getField(cls, str);
                if (field != null) {
                    return field;
                }
            }
        }
        return null;
    }
}
