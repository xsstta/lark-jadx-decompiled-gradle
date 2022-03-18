package com.ss.android.ad.splash.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import com.ss.android.ad.splash.core.C27287e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.utils.c */
public final class C27473c {

    /* renamed from: a */
    private static Boolean f68686a;

    /* renamed from: b */
    private static List<String> f68687b;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static boolean m100299a() {
        char c;
        String lowerCase = Build.BRAND.toLowerCase();
        switch (lowerCase.hashCode()) {
            case -1206476313:
                if (lowerCase.equals("huawei")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -759499589:
                if (lowerCase.equals("xiaomi")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3418016:
                if (lowerCase.equals("oppo")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3620012:
                if (lowerCase.equals("vivo")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 97536331:
                if (lowerCase.equals("flyme")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            return false;
        }
        if (f68687b == null) {
            f68687b = Arrays.asList("GLK-AL00");
        }
        return f68687b.contains(Build.MODEL);
    }

    /* renamed from: i */
    private static boolean m100308i(View view) {
        if (view != null && Build.VERSION.SDK_INT >= 28) {
            return m100309j(view);
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m100304e(View view) {
        if (view == null) {
            return false;
        }
        return view.getContext().getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* renamed from: a */
    private static boolean m100300a(String str) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.isEmpty(lowerCase)) {
            return lowerCase.equals(str);
        }
        return false;
    }

    /* renamed from: j */
    private static boolean m100309j(View view) {
        if (view == null || !view.isAttachedToWindow()) {
            return false;
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            C27477g.m100330d("SplashAdSdk", "View#getRootWindowInsets() returned null");
            return false;
        }
        DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
        if (displayCutout == null) {
            C27477g.m100329c("SplashAdSdk", "WindowInsets#getDisplayCutout() returned null");
            return false;
        } else if (displayCutout.getSafeInsetTop() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m100310k(View view) {
        Activity m;
        boolean z = false;
        if (view == null || (m = m100312m(view)) == null) {
            return false;
        }
        Window window = m.getWindow();
        if ((window.getAttributes().flags & 1024) == 1024) {
            z = true;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if ((systemUiVisibility & 4) == 4 && (systemUiVisibility & 1024) == 1024) {
            return true;
        }
        return z;
    }

    /* renamed from: m */
    private static Activity m100312m(View view) {
        if (view == null) {
            return null;
        }
        while (view != null) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        C27477g.m100330d("SplashAdSdk", "failed to find activity for view");
        return null;
    }

    /* renamed from: b */
    public static boolean m100301b(View view) {
        if (m100299a()) {
            return true;
        }
        if (m100300a("huawei")) {
            return m100303d(view);
        }
        if (m100300a("oppo")) {
            return m100304e(view);
        }
        if (m100300a("vivo")) {
            return m100305f(view);
        }
        if (m100300a("xiaomi")) {
            return m100306g(view);
        }
        if (m100300a("flyme")) {
            return m100307h(view);
        }
        return m100308i(view);
    }

    /* renamed from: c */
    private static int m100302c(View view) {
        DisplayCutout displayCutout;
        if (view == null) {
            return 0;
        }
        Context context = view.getContext();
        if (context.getResources().getConfiguration().orientation != 1) {
            return 0;
        }
        if (m100300a("oppo")) {
            return C27484l.m100399b(context);
        }
        if (Build.VERSION.SDK_INT < 28 || !(context instanceof Activity) || !view.isAttachedToWindow() || (displayCutout = view.getRootWindowInsets().getDisplayCutout()) == null) {
            return C27484l.m100399b(context);
        }
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: d */
    private static boolean m100303d(View view) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m100309j(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            } catch (ClassNotFoundException e) {
                C27477g.m100327a("SplashAdSdk", "hasNotchHuawei", e);
                return false;
            } catch (NoSuchMethodException e2) {
                C27477g.m100327a("SplashAdSdk", "hasNotchHuawei", e2);
                return false;
            } catch (Exception e3) {
                C27477g.m100327a("SplashAdSdk", "hasNotchHuawei", e3);
                return false;
            }
        } else {
            cls = Class.forName("com.huawei.android.util.HwNotchSizeUtil");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getMethod("hasNotchInScreen", new Class[0]).invoke(cls, new Object[0])).booleanValue();
    }

    /* renamed from: f */
    private static boolean m100305f(View view) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m100309j(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("android.util.FtFeature");
            } catch (ClassNotFoundException e) {
                C27477g.m100327a("SplashAdSdk", "hasNotchVivo", e);
                return false;
            } catch (NoSuchMethodException e2) {
                C27477g.m100327a("SplashAdSdk", "hasNotchVivo", e2);
                return false;
            } catch (IllegalAccessException e3) {
                C27477g.m100327a("SplashAdSdk", "hasNotchVivo", e3);
                return false;
            } catch (InvocationTargetException e4) {
                C27477g.m100327a("SplashAdSdk", "hasNotchVivo", e4);
                return false;
            } catch (Exception e5) {
                C27477g.m100327a("SplashAdSdk", "hasNotchVivo", e5);
                return false;
            }
        } else {
            cls = Class.forName("android.util.FtFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
    }

    /* renamed from: g */
    private static boolean m100306g(View view) {
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m100309j(view);
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("getInt", String.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            if (((Integer) declaredMethod.invoke(cls, "ro.miui.notch", 0)).intValue() == 1) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e) {
            C27477g.m100327a("SplashAdSdk", e.getMessage(), e);
            return false;
        } catch (NoSuchMethodException e2) {
            C27477g.m100327a("SplashAdSdk", e2.getMessage(), e2);
            return false;
        } catch (IllegalAccessException e3) {
            C27477g.m100327a("SplashAdSdk", e3.getMessage(), e3);
            return false;
        } catch (InvocationTargetException e4) {
            C27477g.m100327a("SplashAdSdk", e4.getMessage(), e4);
            return false;
        } catch (Throwable th) {
            C27477g.m100327a("SplashAdSdk", th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: h */
    private static boolean m100307h(View view) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m100309j(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("flyme.config.FlymeFeature");
            } catch (IllegalAccessException e) {
                C27477g.m100327a("SplashAdSdk", "hasNotchFlyme", e);
                return false;
            } catch (NoSuchFieldException e2) {
                C27477g.m100327a("SplashAdSdk", "hasNotchFlyme", e2);
                return false;
            } catch (ClassNotFoundException e3) {
                C27477g.m100327a("SplashAdSdk", "hasNotchFlyme", e3);
                return false;
            } catch (Exception e4) {
                C27477g.m100327a("SplashAdSdk", "hasNotchFlyme", e4);
                return false;
            }
        } else {
            cls = Class.forName("flyme.config.FlymeFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredField("IS_FRINGE_DEVICE").get(false)).booleanValue();
    }

    /* renamed from: l */
    private static boolean m100311l(View view) {
        Activity m;
        if (view == null || (m = m100312m(view)) == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int systemUiVisibility = m.getWindow().getDecorView().getSystemUiVisibility();
            int i = m.getWindow().getAttributes().flags;
            if (!((systemUiVisibility & 1024) != 0 && (systemUiVisibility & 4) == 0 && (i & 1024) == 0)) {
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 19) {
            int i2 = m.getWindow().getAttributes().flags;
            if ((67108864 & i2) == 0 || (i2 & 1024) != 0) {
                return false;
            }
        } else {
            C27477g.m100326a("SplashAdSdk", "immersive status bar not supported on older android version");
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m100297a(View view) {
        if (view == null) {
            return 0;
        }
        Boolean valueOf = Boolean.valueOf(m100301b(view));
        f68686a = valueOf;
        if (valueOf.booleanValue()) {
            C27477g.m100326a("SplashAdSdk", "has notch");
            if (Build.VERSION.SDK_INT >= 28) {
                Activity m = m100312m(view);
                if (m == null) {
                    C27477g.m100326a("SplashAdSdk", "failed to get activity");
                    return 0;
                }
                int i = m.getWindow().getAttributes().layoutInDisplayCutoutMode;
                if (i == 2) {
                    C27477g.m100326a("SplashAdSdk", "layout mode never");
                    return 0;
                } else if (i == 1) {
                    C27477g.m100326a("SplashAdSdk", "layout mode short edges");
                    if (m100310k(view) || m100311l(view)) {
                        return m100302c(view);
                    }
                } else {
                    C27477g.m100326a("SplashAdSdk", "layout mode default");
                    if (m100311l(view)) {
                        return m100302c(view);
                    }
                }
            } else if (m100310k(view) || m100311l(view)) {
                return m100302c(view);
            }
        } else {
            C27477g.m100326a("SplashAdSdk", "no notch");
            if (!C27287e.m99259e().mo97698c() && m100311l(view)) {
                return m100302c(view);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m100298a(View view, int i) {
        Context context;
        if (view == null || (context = view.getContext()) == null) {
            return 0;
        }
        int a = m100297a(view);
        if (f68686a.booleanValue() && a == 0 && i == 0) {
            return C27484l.m100399b(context);
        }
        return a;
    }
}
