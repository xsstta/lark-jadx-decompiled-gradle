package com.ss.android.photoeditor.base;

import android.graphics.PointF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.photoeditor.base.j */
public class C59640j {

    /* renamed from: a */
    public PointF f148021a;

    /* renamed from: b */
    public PointF f148022b;

    /* renamed from: c */
    private PointF f148023c;

    /* renamed from: a */
    public PointF mo203163a() {
        return this.f148023c;
    }

    /* renamed from: c */
    private float m231325c() {
        return (float) Math.atan(((double) (this.f148021a.y - this.f148022b.y)) / ((double) (this.f148021a.x - this.f148022b.x)));
    }

    /* renamed from: b */
    private float m231324b() {
        return (float) Math.sqrt((double) (((this.f148022b.y - this.f148021a.y) * (this.f148022b.y - this.f148021a.y)) + ((this.f148022b.x - this.f148021a.x) * (this.f148022b.x - this.f148021a.x))));
    }

    public String toString() {
        return "/n1.  " + this.f148021a.toString() + "/n；2. " + this.f148022b.toString();
    }

    /* renamed from: d */
    public float mo203167d(C59640j jVar) {
        return jVar.m231324b() / m231324b();
    }

    /* renamed from: a */
    public float mo203162a(C59640j jVar) {
        if (m231325c() * jVar.m231325c() < BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return ((jVar.m231325c() - m231325c()) / 3.1415927f) * 180.0f;
    }

    /* renamed from: c */
    public float mo203166c(C59640j jVar) {
        if ((this.f148021a.y - jVar.f148021a.y) * (this.f148022b.y - jVar.f148022b.y) >= BitmapDescriptorFactory.HUE_RED) {
            return ((jVar.f148021a.y - this.f148021a.y) + (jVar.f148022b.y - this.f148022b.y)) / 2.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: e */
    public void mo203168e(C59640j jVar) {
        this.f148021a.x = jVar.f148021a.x;
        this.f148021a.y = jVar.f148021a.y;
        this.f148022b.x = jVar.f148022b.x;
        this.f148022b.y = jVar.f148022b.y;
        this.f148023c.x = (this.f148021a.x + this.f148022b.x) / 2.0f;
        this.f148023c.y = (this.f148021a.y + this.f148022b.y) / 2.0f;
    }

    /* renamed from: b */
    public float mo203165b(C59640j jVar) {
        if ((this.f148021a.x - jVar.f148021a.x) * (this.f148022b.x - jVar.f148022b.x) >= BitmapDescriptorFactory.HUE_RED) {
            return ((jVar.f148021a.x - this.f148021a.x) + (jVar.f148022b.x - this.f148022b.x)) / 2.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public C59640j(float f, float f2, float f3, float f4) {
        this.f148021a = new PointF(f, f2);
        this.f148022b = new PointF(f3, f4);
        this.f148023c = new PointF((f + f3) / 2.0f, (f2 + f4) / 2.0f);
    }

    /* renamed from: a */
    public void mo203164a(float f, float f2, float f3, float f4) {
        this.f148021a.x = f;
        this.f148021a.y = f2;
        this.f148022b.x = f3;
        this.f148022b.y = f4;
        this.f148023c.x = (this.f148021a.x + this.f148022b.x) / 2.0f;
        this.f148023c.y = (this.f148021a.y + this.f148022b.y) / 2.0f;
    }
}
