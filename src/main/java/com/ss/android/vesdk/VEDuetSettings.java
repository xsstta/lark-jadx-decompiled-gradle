package com.ss.android.vesdk;

public final class VEDuetSettings {

    /* renamed from: a */
    private String f161128a;

    /* renamed from: b */
    private String f161129b;

    /* renamed from: c */
    private float f161130c;

    /* renamed from: d */
    private float f161131d;

    /* renamed from: e */
    private float f161132e;

    /* renamed from: f */
    private boolean f161133f;

    /* renamed from: g */
    private boolean f161134g;

    /* renamed from: h */
    private kPlayMode f161135h;

    public enum kPlayMode {
        ATTACH,
        DETACH
    }

    /* renamed from: a */
    public String mo220678a() {
        return this.f161128a;
    }

    /* renamed from: b */
    public String mo220679b() {
        return this.f161129b;
    }

    /* renamed from: c */
    public float mo220680c() {
        return this.f161130c;
    }

    /* renamed from: d */
    public float mo220681d() {
        return this.f161131d;
    }

    /* renamed from: e */
    public float mo220682e() {
        return this.f161132e;
    }

    /* renamed from: f */
    public boolean mo220683f() {
        return this.f161133f;
    }

    /* renamed from: g */
    public boolean mo220684g() {
        return this.f161134g;
    }

    /* renamed from: h */
    public kPlayMode mo220685h() {
        return this.f161135h;
    }

    public String toString() {
        return "{" + "\"mDuetVideoPath\":\"" + this.f161128a + '\"' + ",\"mDuetAudioPath\":\"" + this.f161129b + '\"' + ",\"mXInPercent\":" + this.f161130c + ",\"mYInPercent\":" + this.f161131d + ",\"mAlpha\":" + this.f161132e + ",\"mIsFitMode\":" + this.f161133f + ",\"enableV2\":" + this.f161134g + '}';
    }
}
