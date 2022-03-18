package com.ss.android.lark.chat.export.ui.message.style;

import android.graphics.drawable.Drawable;

/* renamed from: com.ss.android.lark.chat.export.ui.message.style.c */
public class C34035c {

    /* renamed from: a */
    private static final C34035c f88001a = new C34035c();

    /* renamed from: b */
    private int f88002b;

    /* renamed from: c */
    private int f88003c;

    /* renamed from: d */
    private Drawable f88004d;

    /* renamed from: e */
    private int[] f88005e;

    private C34035c() {
    }

    /* renamed from: a */
    public int mo126159a() {
        return this.f88002b;
    }

    /* renamed from: b */
    public int mo126163b() {
        return this.f88003c;
    }

    /* renamed from: c */
    public Drawable mo126165c() {
        return this.f88004d;
    }

    /* renamed from: d */
    public int[] mo126167d() {
        return this.f88005e;
    }

    /* renamed from: e */
    private void m131994e() {
        this.f88003c = 0;
        this.f88002b = 0;
        this.f88004d = null;
        mo126166c(0);
    }

    /* renamed from: b */
    public void mo126164b(int i) {
        this.f88003c = i;
    }

    /* renamed from: c */
    public void mo126166c(int i) {
        this.f88005e = new int[]{i, i, i, i};
    }

    /* renamed from: a */
    public void mo126160a(int i) {
        this.f88002b = i;
    }

    /* renamed from: a */
    public void mo126161a(Drawable drawable) {
        this.f88004d = drawable;
    }

    /* renamed from: a */
    public void mo126162a(int[] iArr) {
        if (iArr == null || iArr.length != 4) {
            mo126166c(0);
        } else {
            this.f88005e = iArr;
        }
    }

    /* renamed from: a */
    public static C34035c m131993a(int i, Drawable drawable) {
        return m131991a(i, i, drawable);
    }

    /* renamed from: a */
    public static C34035c m131991a(int i, int i2, Drawable drawable) {
        return m131992a(i, i2, drawable, null);
    }

    /* renamed from: a */
    public static C34035c m131992a(int i, int i2, Drawable drawable, int[] iArr) {
        C34035c cVar = f88001a;
        cVar.m131994e();
        cVar.mo126160a(i);
        cVar.mo126164b(i2);
        cVar.mo126161a(drawable);
        cVar.mo126162a(iArr);
        return cVar;
    }
}
