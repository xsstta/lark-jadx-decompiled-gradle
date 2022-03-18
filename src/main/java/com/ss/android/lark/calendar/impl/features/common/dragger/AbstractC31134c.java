package com.ss.android.lark.calendar.impl.features.common.dragger;

import android.view.View;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.c */
public abstract class AbstractC31134c {

    /* renamed from: a */
    private float f78637a;

    /* renamed from: b */
    private float f78638b;

    /* renamed from: c */
    private float f78639c;

    /* renamed from: d */
    private float f78640d;

    /* renamed from: e */
    private int f78641e;

    /* renamed from: f */
    private int f78642f;

    /* renamed from: g */
    private Object f78643g;

    /* renamed from: h */
    private View f78644h;

    /* renamed from: i */
    private C31140i f78645i;

    /* renamed from: c */
    public abstract String mo112750c();

    /* renamed from: e */
    public float mo112753e() {
        return this.f78637a;
    }

    /* renamed from: f */
    public float mo112754f() {
        return this.f78638b;
    }

    /* renamed from: g */
    public float mo112755g() {
        return this.f78639c;
    }

    /* renamed from: h */
    public float mo112756h() {
        return this.f78640d;
    }

    /* renamed from: i */
    public int mo112757i() {
        return this.f78641e;
    }

    /* renamed from: j */
    public int mo112758j() {
        return this.f78642f;
    }

    /* renamed from: k */
    public View mo112759k() {
        return this.f78644h;
    }

    /* renamed from: l */
    public Object mo112760l() {
        return this.f78643g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(mo112750c());
        sb.append("]");
        sb.append(" X:" + this.f78637a);
        sb.append(" Y:" + this.f78638b);
        sb.append(" RawX:" + this.f78639c);
        sb.append(" RawY:" + this.f78640d);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo112752a(Object obj) {
        this.f78643g = obj;
    }

    public AbstractC31134c(float f, float f2, float f3, float f4, int i, int i2, View view, C31140i iVar) {
        this.f78637a = f;
        this.f78638b = f2;
        this.f78639c = f3;
        this.f78640d = f4;
        this.f78641e = i;
        this.f78642f = i2;
        this.f78644h = view;
        this.f78645i = iVar;
    }
}
