package com.ss.android.ttve.model;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.ttve.model.c */
public class C60212c {

    /* renamed from: a */
    private String f150296a;

    /* renamed from: b */
    private String f150297b;

    /* renamed from: c */
    private float f150298c;

    /* renamed from: d */
    private float f150299d;

    /* renamed from: e */
    private float f150300e;

    /* renamed from: f */
    private boolean f150301f;

    /* renamed from: g */
    private boolean f150302g;

    /* renamed from: a */
    public String mo205682a() {
        return this.f150296a;
    }

    /* renamed from: b */
    public String mo205686b() {
        return this.f150297b;
    }

    /* renamed from: c */
    public float mo205690c() {
        return this.f150298c;
    }

    /* renamed from: d */
    public float mo205692d() {
        return this.f150299d;
    }

    /* renamed from: e */
    public float mo205693e() {
        return this.f150300e;
    }

    /* renamed from: f */
    public boolean mo205694f() {
        return this.f150301f;
    }

    /* renamed from: g */
    public boolean mo205695g() {
        return this.f150302g;
    }

    public C60212c() {
        this("", BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    public void mo205683a(float f) {
        this.f150298c = f;
    }

    /* renamed from: b */
    public void mo205687b(float f) {
        this.f150299d = f;
    }

    /* renamed from: c */
    public void mo205691c(float f) {
        this.f150300e = f;
    }

    /* renamed from: a */
    public void mo205684a(String str) {
        this.f150296a = str;
    }

    /* renamed from: b */
    public void mo205688b(String str) {
        this.f150297b = str;
    }

    /* renamed from: a */
    public void mo205685a(boolean z) {
        this.f150301f = z;
    }

    /* renamed from: b */
    public void mo205689b(boolean z) {
        this.f150302g = z;
    }

    public C60212c(String str, float f) {
        this(str, str, BitmapDescriptorFactory.HUE_RED, f);
    }

    public C60212c(String str, String str2, float f, float f2) {
        this.f150299d = f2;
        this.f150300e = f2;
        this.f150296a = str;
        this.f150297b = str2;
        this.f150298c = f;
    }
}
