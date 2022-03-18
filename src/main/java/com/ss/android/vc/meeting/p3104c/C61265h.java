package com.ss.android.vc.meeting.p3104c;

import android.graphics.PointF;

/* renamed from: com.ss.android.vc.meeting.c.h */
public class C61265h {

    /* renamed from: a */
    private PointF f153489a = new PointF();

    /* renamed from: b */
    private PointF f153490b = new PointF();

    /* renamed from: a */
    public PointF mo211884a() {
        return this.f153489a;
    }

    /* renamed from: b */
    public PointF mo211886b() {
        return this.f153490b;
    }

    public String toString() {
        return "TranslateContext{downPoint=" + this.f153489a + ", lastPoint=" + this.f153490b + '}';
    }

    /* renamed from: b */
    public void mo211887b(float f, float f2) {
        this.f153490b.x = f;
        this.f153490b.y = f2;
    }

    /* renamed from: a */
    public void mo211885a(float f, float f2) {
        this.f153489a.x = f;
        this.f153489a.y = f2;
        this.f153490b.x = f;
        this.f153490b.y = f2;
    }
}
