package com.ss.android.vc.meeting.p3104c;

import android.graphics.PointF;

/* renamed from: com.ss.android.vc.meeting.c.f */
public class C61262f {

    /* renamed from: a */
    private PointF f153476a = new PointF();

    /* renamed from: b */
    private PointF f153477b = new PointF();

    /* renamed from: c */
    private PointF f153478c = new PointF();

    /* renamed from: d */
    private float f153479d;

    /* renamed from: e */
    private float f153480e;

    /* renamed from: a */
    public PointF mo211877a() {
        return this.f153478c;
    }

    /* renamed from: b */
    public float mo211880b() {
        return this.f153479d;
    }

    /* renamed from: c */
    public float mo211881c() {
        return this.f153480e;
    }

    public String toString() {
        return "ScaleContext{firstPoint=" + this.f153476a + ", secondPoint=" + this.f153477b + ", centerPoint=" + this.f153478c + ", initialDistance=" + this.f153479d + ", lastScale=" + this.f153480e + '}';
    }

    /* renamed from: a */
    public void mo211878a(float f) {
        this.f153480e = f;
    }

    /* renamed from: a */
    public void mo211879a(float f, float f2, float f3, float f4) {
        this.f153476a.x = f;
        this.f153476a.y = f2;
        this.f153477b.x = f3;
        this.f153477b.y = f4;
        this.f153478c.x = (f + f3) / 2.0f;
        this.f153478c.y = (f2 + f4) / 2.0f;
        this.f153479d = C61260d.m238317a(f, f2, f3, f4);
    }
}
