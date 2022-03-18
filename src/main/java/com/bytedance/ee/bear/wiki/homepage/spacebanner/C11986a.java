package com.bytedance.ee.bear.wiki.homepage.spacebanner;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.spacebanner.a */
public class C11986a {

    /* renamed from: a */
    private float f32370a;

    /* renamed from: b */
    private float f32371b;

    /* renamed from: c */
    private float f32372c;

    /* renamed from: d */
    private float f32373d;

    /* renamed from: e */
    private float f32374e;

    /* renamed from: a */
    public float mo45922a() {
        return this.f32370a;
    }

    /* renamed from: b */
    public float mo45923b() {
        return this.f32371b;
    }

    /* renamed from: c */
    public float mo45924c() {
        return this.f32372c;
    }

    /* renamed from: d */
    public float mo45925d() {
        return this.f32373d;
    }

    /* renamed from: e */
    public float mo45926e() {
        return this.f32374e;
    }

    public C11986a() {
        float a = (float) C13749l.m55736a();
        float f = (0.8613333f * a) / 3.1f;
        this.f32370a = f;
        this.f32371b = (4.0f * f) / 3.0f;
        this.f32372c = 0.042666666f * a;
        float f2 = a * 0.032f;
        this.f32373d = f2;
        this.f32374e = -((f * 0.07f) + f2);
        C13479a.m54764b("BannerContentParams", "BannerContentParams init " + toString());
    }

    public String toString() {
        return "BannerContentParams{width=" + this.f32370a + ", height=" + this.f32371b + ", marginStart=" + this.f32372c + ", marginMid=" + this.f32373d + ", scrollOffset=" + this.f32374e + '}';
    }
}
