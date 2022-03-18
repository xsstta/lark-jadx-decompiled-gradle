package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: androidx.transition.h */
public class C1540h implements AbstractC1538f {

    /* renamed from: a */
    private static Class<?> f5402a;

    /* renamed from: b */
    private static boolean f5403b;

    /* renamed from: c */
    private static Method f5404c;

    /* renamed from: d */
    private static boolean f5405d;

    /* renamed from: e */
    private static Method f5406e;

    /* renamed from: f */
    private static boolean f5407f;

    /* renamed from: g */
    private final View f5408g;

    @Override // androidx.transition.AbstractC1538f
    /* renamed from: a */
    public void mo8001a(ViewGroup viewGroup, View view) {
    }

    /* renamed from: a */
    private static void m7088a() {
        if (!f5403b) {
            try {
                f5402a = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            f5403b = true;
        }
    }

    /* renamed from: b */
    private static void m7090b() {
        if (!f5405d) {
            try {
                m7088a();
                Method declaredMethod = f5402a.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f5404c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
            }
            f5405d = true;
        }
    }

    /* renamed from: c */
    private static void m7091c() {
        if (!f5407f) {
            try {
                m7088a();
                Method declaredMethod = f5402a.getDeclaredMethod("removeGhost", View.class);
                f5406e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
            }
            f5407f = true;
        }
    }

    private C1540h(View view) {
        this.f5408g = view;
    }

    @Override // androidx.transition.AbstractC1538f
    public void setVisibility(int i) {
        this.f5408g.setVisibility(i);
    }

    /* renamed from: a */
    static void m7089a(View view) {
        m7091c();
        Method method = f5406e;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    static AbstractC1538f m7087a(View view, ViewGroup viewGroup, Matrix matrix) {
        m7090b();
        Method method = f5404c;
        if (method != null) {
            try {
                return new C1540h((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }
}
