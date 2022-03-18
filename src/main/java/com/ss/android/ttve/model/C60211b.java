package com.ss.android.ttve.model;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.ttve.model.b */
public class C60211b {

    /* renamed from: a */
    private String f150291a;

    /* renamed from: b */
    private float f150292b;

    /* renamed from: c */
    private float f150293c;

    /* renamed from: d */
    private float f150294d;

    /* renamed from: e */
    private float f150295e;

    /* renamed from: a */
    public String mo205672a() {
        return this.f150291a;
    }

    /* renamed from: b */
    public float mo205675b() {
        return this.f150292b;
    }

    /* renamed from: c */
    public float mo205677c() {
        return this.f150293c;
    }

    /* renamed from: d */
    public float mo205679d() {
        return this.f150294d;
    }

    /* renamed from: e */
    public float mo205681e() {
        return this.f150295e;
    }

    public C60211b() {
        this("", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    public void mo205673a(float f) {
        this.f150292b = f;
    }

    /* renamed from: b */
    public void mo205676b(float f) {
        this.f150293c = f;
    }

    /* renamed from: c */
    public void mo205678c(float f) {
        this.f150294d = f;
    }

    /* renamed from: d */
    public void mo205680d(float f) {
        this.f150295e = f;
    }

    /* renamed from: a */
    public void mo205674a(String str) {
        this.f150291a = str;
    }

    public C60211b(String str, float f, float f2) {
        this.f150291a = str;
        this.f150292b = f;
        this.f150293c = f2;
    }

    public C60211b(String str, float f, float f2, float f3, float f4) {
        this(str, f, f2);
        this.f150294d = f3;
        this.f150295e = f4;
    }
}
