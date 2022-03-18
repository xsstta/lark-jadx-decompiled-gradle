package com.ss.android.lark.location.dto;

import android.graphics.Color;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.location.dto.a */
public class C41579a {

    /* renamed from: a */
    private double f105659a;

    /* renamed from: b */
    private double f105660b;

    /* renamed from: c */
    private String f105661c;

    /* renamed from: d */
    private String f105662d;

    /* renamed from: e */
    private int f105663e;

    /* renamed from: f */
    private int f105664f;

    /* renamed from: a */
    public int mo149675a() {
        return this.f105664f;
    }

    /* renamed from: b */
    public int mo149679b() {
        return this.f105663e;
    }

    /* renamed from: e */
    public double mo149685e() {
        return this.f105660b;
    }

    /* renamed from: f */
    public double mo149686f() {
        return this.f105659a;
    }

    /* renamed from: c */
    public int mo149683c() {
        if (TextUtils.isEmpty(this.f105662d)) {
            return 0;
        }
        try {
            return Color.parseColor(this.f105662d);
        } catch (IllegalArgumentException unused) {
            Log.m165383e("CircleOptionsWrapper", "parse color fail:" + this.f105662d);
            return 0;
        }
    }

    /* renamed from: d */
    public int mo149684d() {
        if (TextUtils.isEmpty(this.f105661c)) {
            return -16777216;
        }
        try {
            return Color.parseColor(this.f105661c);
        } catch (IllegalArgumentException unused) {
            Log.m165383e("CircleOptionsWrapper", "parse color fail:" + this.f105661c);
            return -16777216;
        }
    }

    /* renamed from: a */
    public C41579a mo149676a(double d) {
        this.f105660b = d;
        return this;
    }

    /* renamed from: b */
    public C41579a mo149680b(double d) {
        this.f105659a = d;
        return this;
    }

    /* renamed from: a */
    public C41579a mo149677a(int i) {
        this.f105664f = i;
        return this;
    }

    /* renamed from: b */
    public C41579a mo149681b(int i) {
        this.f105663e = i;
        return this;
    }

    /* renamed from: a */
    public C41579a mo149678a(String str) {
        this.f105662d = str;
        return this;
    }

    /* renamed from: b */
    public C41579a mo149682b(String str) {
        this.f105661c = str;
        return this;
    }
}
