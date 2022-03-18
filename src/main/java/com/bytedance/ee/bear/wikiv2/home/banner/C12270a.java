package com.bytedance.ee.bear.wikiv2.home.banner;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.banner.a */
public class C12270a {

    /* renamed from: a */
    private float f32956a;

    /* renamed from: b */
    private float f32957b;

    /* renamed from: c */
    private float f32958c;

    /* renamed from: d */
    private float f32959d;

    /* renamed from: e */
    private float f32960e;

    /* renamed from: a */
    public float mo46831a() {
        return this.f32956a;
    }

    /* renamed from: b */
    public float mo46832b() {
        return this.f32957b;
    }

    /* renamed from: c */
    public float mo46833c() {
        return this.f32958c;
    }

    /* renamed from: d */
    public float mo46834d() {
        return this.f32959d;
    }

    /* renamed from: e */
    public float mo46835e() {
        return this.f32960e;
    }

    public C12270a() {
        float a = (float) C13749l.m55736a();
        float f = (0.8613333f * a) / 3.1f;
        this.f32956a = f;
        this.f32957b = (4.0f * f) / 3.0f;
        this.f32958c = 0.042666666f * a;
        float f2 = a * 0.032f;
        this.f32959d = f2;
        this.f32960e = -((f * 0.07f) + f2);
        C13479a.m54764b("BannerContentParams", "BannerContentParams init " + toString());
    }

    public String toString() {
        return "BannerContentParams{width=" + this.f32956a + ", height=" + this.f32957b + ", marginStart=" + this.f32958c + ", marginMid=" + this.f32959d + ", scrollOffset=" + this.f32960e + '}';
    }
}
