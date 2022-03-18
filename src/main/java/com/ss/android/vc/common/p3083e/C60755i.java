package com.ss.android.vc.common.p3083e;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.common.p3077b.C60700b;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* renamed from: com.ss.android.vc.common.e.i */
public final class C60755i {

    /* renamed from: com.ss.android.vc.common.e.i$b */
    private static class C60757b {
        /* renamed from: a */
        public static boolean m236091a(Context context) {
            try {
                return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            } catch (Exception unused) {
                C60700b.m235864f("NotchScreenUtil", "[hasNotchInScreen2]", "get property error.");
                return false;
            }
        }

        /* renamed from: a */
        public static void m236090a(Window window) {
            if (window != null) {
                try {
                    Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(window, 65536);
                } catch (NoSuchMethodException e) {
                    C60700b.m235864f("NotchScreenUtil", "[setFullScreenWindowLayoutInDisplayCutout4]", "error:" + e);
                } catch (IllegalAccessException e2) {
                    C60700b.m235864f("NotchScreenUtil", "[setFullScreenWindowLayoutInDisplayCutout5]", "error:" + e2);
                } catch (InvocationTargetException e3) {
                    C60700b.m235864f("NotchScreenUtil", "[setFullScreenWindowLayoutInDisplayCutout6]", "error:" + e3);
                }
            }
        }
    }

    /* renamed from: com.ss.android.vc.common.e.i$e */
    private static class C60760e {
        /* renamed from: a */
        public static boolean m236096a(Context context) {
            try {
                if (Integer.parseInt(C60758c.m236092a("ro.miui.notch")) == 1) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                C60700b.m235864f("NotchScreenUtil", "[hasNotchInScreen]", "parse property error.");
                return false;
            }
        }

        /* renamed from: a */
        public static void m236095a(Window window) {
            if (window != null) {
                try {
                    Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(window, Integer.valueOf((int) DynamicModule.f58006b));
                } catch (NoSuchMethodException e) {
                    C60700b.m235864f("NotchScreenUtil", "[setFullScreenWindowLayoutInDisplayCutout]", "error:" + e);
                } catch (IllegalAccessException e2) {
                    C60700b.m235864f("NotchScreenUtil", "[setFullScreenWindowLayoutInDisplayCutout2]", "error:" + e2);
                } catch (InvocationTargetException e3) {
                    C60700b.m235864f("NotchScreenUtil", "[setFullScreenWindowLayoutInDisplayCutout3]", "error:" + e3);
                }
            }
        }
    }

    /* renamed from: com.ss.android.vc.common.e.i$a */
    private static class C60756a {
        /* renamed from: a */
        public static boolean m236089a(Context context) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
            } catch (ClassNotFoundException unused) {
                C60700b.m235864f("NotchScreenUtil", "[HuaweiNotchScreenUtil_hasNotchInScreen]", "ClassNotFoundException");
                return false;
            } catch (NoSuchMethodException unused2) {
                C60700b.m235864f("NotchScreenUtil", "[HuaweiNotchScreenUtil_hasNotchInScreen2]", "NoSuchMethodException");
                return false;
            } catch (Throwable unused3) {
                return false;
            }
        }

        /* renamed from: a */
        public static void m236088a(Window window) {
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                try {
                    Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
                    Object newInstance = cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes);
                    cls.getMethod("addHwFlags", Integer.TYPE).invoke(newInstance, 65536);
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                    C60700b.m235864f("NotchScreenUtil", "[HuaweiNotchScreenUtil_setFullScreenWindowLayoutInDisplayCutout]", "hw add notch screen flag api error");
                }
            }
        }
    }

    /* renamed from: com.ss.android.vc.common.e.i$d */
    private static class C60759d {
        /* renamed from: a */
        public static boolean m236094a(Context context) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
                return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
            } catch (ClassNotFoundException unused) {
                C60700b.m235864f("NotchScreenUtil", "[hasNotchInScreen]", "ClassNotFoundException");
                return false;
            } catch (NoSuchMethodException unused2) {
                C60700b.m235864f("NotchScreenUtil", "[hasNotchInScreen2]", "NoSuchMethodException");
                return false;
            } catch (Throwable unused3) {
                return false;
            }
        }

        /* renamed from: a */
        public static void m236093a(Window window) {
            if (window != null) {
                try {
                    Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(window, 65536);
                } catch (NoSuchMethodException e) {
                    C60700b.m235864f("NotchScreenUtil", "[setFullScreenWindowLayoutInDisplayCutout]", "error:" + e);
                } catch (IllegalAccessException e2) {
                    C60700b.m235864f("NotchScreenUtil", "[setFullScreenWindowLayoutInDisplayCutout2]", "error:" + e2);
                } catch (InvocationTargetException e3) {
                    C60700b.m235864f("NotchScreenUtil", "[setFullScreenWindowLayoutInDisplayCutout3]", "error:" + e3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.e.i$c */
    public static class C60758c {
        /* renamed from: a */
        public static String m236092a(String str) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class).invoke(cls.newInstance(), str);
            } catch (ClassNotFoundException e) {
                C60700b.m235864f("NotchScreenUtil", "[getError]", e.toString());
            } catch (NoSuchMethodException e2) {
                C60700b.m235864f("NotchScreenUtil", "[getError2]", e2.toString());
            } catch (InstantiationException e3) {
                C60700b.m235864f("NotchScreenUtil", "[getError3]", e3.toString());
            } catch (IllegalAccessException e4) {
                C60700b.m235864f("NotchScreenUtil", "[getError4]", e4.toString());
            } catch (IllegalArgumentException e5) {
                C60700b.m235864f("NotchScreenUtil", "[getError5]", e5.toString());
            } catch (InvocationTargetException e6) {
                C60700b.m235864f("NotchScreenUtil", "[getError6]", e6.toString());
            }
            return "";
        }
    }

    /* renamed from: a */
    public static void m236087a(Activity activity) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                View decorView = activity.getWindow().getDecorView();
                WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                activity.getWindow().setAttributes(attributes);
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1028);
            } else if (Build.BRAND.toLowerCase(Locale.getDefault()).equals("huawei")) {
                if (C60756a.m236089a(activity)) {
                    C60700b.m235851b("NotchScreenUtil", "[tryApply]", "try to apply notch screen for huawei");
                    C60756a.m236088a(activity.getWindow());
                }
            } else if (Build.BRAND.toLowerCase(Locale.getDefault()).equals("xiaomi")) {
                if (C60760e.m236096a(activity)) {
                    C60700b.m235851b("NotchScreenUtil", "[tryApply2]", "try to apply notch screen for xiaomi");
                    C60760e.m236095a(activity.getWindow());
                }
            } else if (Build.BRAND.toLowerCase(Locale.getDefault()).equals("oppo")) {
                if (C60757b.m236091a(activity)) {
                    C60700b.m235851b("NotchScreenUtil", "[tryApply3]", "try to apply notch screen for oppo");
                    C60757b.m236090a(activity.getWindow());
                }
            } else if (Build.BRAND.toLowerCase(Locale.getDefault()).equals("vivo") && C60759d.m236094a(activity)) {
                C60700b.m235851b("NotchScreenUtil", "[tryApply4]", "try to apply notch screen for vivo");
                C60759d.m236093a(activity.getWindow());
            }
        }
    }
}
