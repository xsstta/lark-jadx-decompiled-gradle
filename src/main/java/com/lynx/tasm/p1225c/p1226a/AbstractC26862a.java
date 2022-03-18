package com.lynx.tasm.p1225c.p1226a;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: com.lynx.tasm.c.a.a */
public abstract class AbstractC26862a {

    /* renamed from: a */
    private static boolean f66692a;

    /* renamed from: a */
    public abstract Canvas mo95615a(int i, int i2);

    /* renamed from: a */
    public abstract void mo95616a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract void mo95617a(Canvas canvas);

    /* renamed from: b */
    public abstract void mo95618b(Canvas canvas);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo95619c();

    /* renamed from: d */
    public abstract boolean mo95620d();

    AbstractC26862a() {
    }

    /* renamed from: a */
    public static boolean m97639a() {
        return f66692a;
    }

    /* renamed from: b */
    public static AbstractC26862a m97640b() {
        AbstractC26862a aVar;
        if (Build.VERSION.SDK_INT >= 29) {
            aVar = new C26868g();
        } else if (Build.VERSION.SDK_INT >= 23) {
            aVar = new C26867f();
        } else if (Build.VERSION.SDK_INT >= 21) {
            aVar = new C26866e();
        } else if (Build.VERSION.SDK_INT >= 18) {
            aVar = new C26865d();
        } else if (Build.VERSION.SDK_INT >= 16) {
            aVar = new C26864c();
        } else if (Build.VERSION.SDK_INT >= 14) {
            aVar = new C26863b();
        } else {
            throw new RuntimeException("unsupport version" + Build.VERSION.SDK_INT);
        }
        aVar.mo95619c();
        return aVar;
    }
}
