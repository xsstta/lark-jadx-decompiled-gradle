package com.larksuite.framework.ui.dragger;

import android.view.View;

/* renamed from: com.larksuite.framework.ui.dragger.c */
public abstract class AbstractC26202c {

    /* renamed from: a */
    private float f64693a;

    /* renamed from: b */
    private float f64694b;

    /* renamed from: c */
    private float f64695c;

    /* renamed from: d */
    private float f64696d;

    /* renamed from: e */
    private int f64697e;

    /* renamed from: f */
    private int f64698f;

    /* renamed from: g */
    private Object f64699g;

    /* renamed from: h */
    private View f64700h;

    /* renamed from: i */
    private C26208i f64701i;

    /* renamed from: a */
    public abstract String mo93193a();

    /* renamed from: c */
    public float mo93196c() {
        return this.f64693a;
    }

    /* renamed from: d */
    public float mo93197d() {
        return this.f64694b;
    }

    /* renamed from: e */
    public float mo93198e() {
        return this.f64695c;
    }

    /* renamed from: f */
    public float mo93199f() {
        return this.f64696d;
    }

    /* renamed from: g */
    public int mo93200g() {
        return this.f64697e;
    }

    /* renamed from: h */
    public int mo93201h() {
        return this.f64698f;
    }

    /* renamed from: i */
    public View mo93202i() {
        return this.f64700h;
    }

    /* renamed from: j */
    public C26208i mo93203j() {
        return this.f64701i;
    }

    /* renamed from: k */
    public Object mo93204k() {
        return this.f64699g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(mo93193a());
        sb.append("]");
        sb.append(" X:" + this.f64693a);
        sb.append(" Y:" + this.f64694b);
        sb.append(" RawX:" + this.f64695c);
        sb.append(" RawY:" + this.f64696d);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo93195a(Object obj) {
        this.f64699g = obj;
    }

    public AbstractC26202c(float f, float f2, float f3, float f4, int i, int i2, View view, C26208i iVar) {
        this.f64693a = f;
        this.f64694b = f2;
        this.f64695c = f3;
        this.f64696d = f4;
        this.f64697e = i;
        this.f64698f = i2;
        this.f64700h = view;
        this.f64701i = iVar;
    }
}
