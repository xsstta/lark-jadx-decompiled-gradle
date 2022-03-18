package com.lynx.tasm.p1225c.p1226a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DisplayList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.c.a.b */
public class C26863b extends AbstractC26862a {

    /* renamed from: i */
    private static Method f66693i;

    /* renamed from: j */
    private static Method f66694j;

    /* renamed from: k */
    private static Method f66695k;

    /* renamed from: l */
    private static Method f66696l;

    /* renamed from: m */
    private static Method f66697m;

    /* renamed from: n */
    private static Method f66698n;

    /* renamed from: o */
    private static Method f66699o;

    /* renamed from: a */
    int f66700a;

    /* renamed from: b */
    int f66701b;

    /* renamed from: c */
    int f66702c;

    /* renamed from: d */
    int f66703d;

    /* renamed from: e */
    int f66704e;

    /* renamed from: f */
    int f66705f;

    /* renamed from: g */
    DisplayList f66706g;

    /* renamed from: h */
    Constructor<?> f66707h;

    C26863b() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: c */
    public void mo95619c() {
        try {
            if (this.f66707h == null) {
                Constructor<?> constructor = Class.forName("android.view.GLES20DisplayList").getConstructor(new Class[0]);
                this.f66707h = constructor;
                constructor.setAccessible(true);
            }
            this.f66706g = (DisplayList) this.f66707h.newInstance(new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: d */
    public boolean mo95620d() {
        try {
            if (f66693i == null) {
                Method declaredMethod = DisplayList.class.getDeclaredMethod("isValid", new Class[0]);
                f66693i = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return ((Boolean) f66693i.invoke(this.f66706g, new Object[0])).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: b */
    public void mo95618b(Canvas canvas) {
        try {
            if (f66696l == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("onPostDraw", new Class[0]);
                f66696l = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f66696l.invoke(canvas, new Object[0]);
            try {
                if (f66699o == null) {
                    Method declaredMethod2 = DisplayList.class.getDeclaredMethod("end", new Class[0]);
                    f66699o = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f66699o.invoke(this.f66706g, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public void mo95617a(Canvas canvas) {
        try {
            if (f66698n == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("drawDisplayList", DisplayList.class, Integer.TYPE, Integer.TYPE, Rect.class);
                f66698n = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f66698n.invoke(canvas, this.f66706g, Integer.valueOf(this.f66704e), Integer.valueOf(this.f66705f), null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public Canvas mo95615a(int i, int i2) {
        this.f66704e = i;
        this.f66705f = i2;
        try {
            if (f66694j == null) {
                Method declaredMethod = DisplayList.class.getDeclaredMethod("start", new Class[0]);
                f66694j = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Canvas canvas = (Canvas) f66694j.invoke(this.f66706g, new Object[0]);
            mo95621a(i, i2, canvas);
            try {
                if (f66695k == null) {
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("onPreDraw", Rect.class);
                    f66695k = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f66695k.invoke(canvas, null);
                return canvas;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95621a(int i, int i2, Canvas canvas) {
        try {
            if (f66697m == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("setViewport", Integer.TYPE, Integer.TYPE);
                f66697m = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f66697m.invoke(canvas, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public void mo95616a(int i, int i2, int i3, int i4) {
        this.f66700a = i;
        this.f66701b = i2;
        this.f66702c = i3;
        this.f66703d = i4;
    }
}
