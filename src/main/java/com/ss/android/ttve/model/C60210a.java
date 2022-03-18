package com.ss.android.ttve.model;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.ttve.model.a */
public class C60210a {

    /* renamed from: a */
    private int f150287a;

    /* renamed from: b */
    private String f150288b;

    /* renamed from: c */
    private float f150289c;

    /* renamed from: d */
    private float f150290d;

    /* renamed from: a */
    public String mo205664a() {
        return this.f150288b;
    }

    /* renamed from: b */
    public float mo205668b() {
        return this.f150289c;
    }

    /* renamed from: c */
    public float mo205670c() {
        return this.f150290d;
    }

    /* renamed from: d */
    public int mo205671d() {
        return this.f150287a;
    }

    public C60210a() {
        this(0, "", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    public void mo205665a(float f) {
        this.f150289c = f;
    }

    /* renamed from: b */
    public void mo205669b(float f) {
        this.f150290d = f;
    }

    /* renamed from: a */
    public void mo205666a(int i) {
        this.f150287a = i;
    }

    /* renamed from: a */
    public void mo205667a(String str) {
        this.f150288b = str;
    }

    public C60210a(int i, String str, float f, float f2) {
        this.f150287a = i;
        this.f150288b = str;
        this.f150289c = f;
        this.f150290d = f2;
    }
}
