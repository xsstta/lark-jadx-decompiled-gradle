package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.p3510a.C70015a;

/* renamed from: androidx.webkit.internal.f */
public class C1625f {

    /* access modifiers changed from: private */
    /* renamed from: androidx.webkit.internal.f$a */
    public static class C1626a {

        /* renamed from: a */
        static final C1630i f5607a = new C1630i(C1625f.m7335a().mo8384a());
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.webkit.internal.f$b */
    public static class C1627b {

        /* renamed from: a */
        static final AbstractC1628g f5608a = C1625f.m7337c();
    }

    /* renamed from: a */
    public static AbstractC1628g m7335a() {
        return C1627b.f5608a;
    }

    /* renamed from: b */
    public static C1630i m7336b() {
        return C1626a.f5607a;
    }

    /* renamed from: d */
    public static ClassLoader m7338d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        return m7340f().getClass().getClassLoader();
    }

    /* renamed from: e */
    private static InvocationHandler m7339e() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m7338d()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    static AbstractC1628g m7337c() {
        if (Build.VERSION.SDK_INT < 21) {
            return new C1621b();
        }
        try {
            return new C1629h((WebViewProviderFactoryBoundaryInterface) C70015a.m268593a(WebViewProviderFactoryBoundaryInterface.class, m7339e()));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (ClassNotFoundException unused) {
            return new C1621b();
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: f */
    private static Object m7340f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }
}
