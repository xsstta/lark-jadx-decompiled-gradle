package com.ss.android.lark.widget.photo_picker.animation.p2944a;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.lark.widget.photo_picker.animation.p2944a.p2945a.C58580c;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.a.b */
public class C58582b {

    /* renamed from: a */
    private final Activity f144646a;

    /* renamed from: b */
    private float f144647b;

    /* renamed from: c */
    private float f144648c = 1.0f;

    /* renamed from: a */
    public Bundle mo198583a() {
        return C58580c.m227216a(this.f144646a, this.f144647b, this.f144648c);
    }

    /* renamed from: a */
    public C58582b mo198584a(float f) {
        this.f144647b = f;
        return this;
    }

    /* renamed from: b */
    public C58582b mo198585b(float f) {
        this.f144648c = f;
        return this;
    }

    /* renamed from: a */
    public static C58582b m227217a(Activity activity) {
        return new C58582b(activity);
    }

    private C58582b(Activity activity) {
        this.f144646a = activity;
    }
}
