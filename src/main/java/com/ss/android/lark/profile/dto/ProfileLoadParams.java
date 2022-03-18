package com.ss.android.lark.profile.dto;

import android.graphics.drawable.Drawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ProfileLoadParams {

    /* renamed from: a */
    private int f129599a;

    /* renamed from: b */
    private int f129600b;

    /* renamed from: c */
    private String f129601c;

    /* renamed from: d */
    private Drawable f129602d;

    /* renamed from: e */
    private Drawable f129603e;

    /* renamed from: f */
    private boolean f129604f;

    /* renamed from: g */
    private boolean f129605g;

    /* renamed from: h */
    private boolean f129606h;

    /* renamed from: i */
    private String f129607i = "png";

    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageFormat {
    }

    /* renamed from: a */
    public int mo178888a() {
        return this.f129599a;
    }

    /* renamed from: b */
    public int mo178893b() {
        return this.f129600b;
    }

    /* renamed from: d */
    public Drawable mo178900d() {
        return this.f129602d;
    }

    /* renamed from: e */
    public Drawable mo178901e() {
        return this.f129603e;
    }

    /* renamed from: f */
    public boolean mo178902f() {
        return this.f129604f;
    }

    /* renamed from: g */
    public boolean mo178903g() {
        return this.f129605g;
    }

    /* renamed from: h */
    public boolean mo178904h() {
        return this.f129606h;
    }

    /* renamed from: i */
    public String mo178905i() {
        return this.f129607i;
    }

    /* renamed from: c */
    public String mo178899c() {
        return this.f129601c;
    }

    /* renamed from: c */
    public ProfileLoadParams mo178898c(boolean z) {
        this.f129605g = z;
        return this;
    }

    /* renamed from: a */
    public ProfileLoadParams mo178889a(int i) {
        this.f129599a = i;
        return this;
    }

    /* renamed from: b */
    public ProfileLoadParams mo178894b(int i) {
        this.f129600b = i;
        return this;
    }

    /* renamed from: a */
    public ProfileLoadParams mo178890a(Drawable drawable) {
        this.f129602d = drawable;
        return this;
    }

    /* renamed from: b */
    public ProfileLoadParams mo178895b(Drawable drawable) {
        this.f129603e = drawable;
        return this;
    }

    /* renamed from: a */
    public ProfileLoadParams mo178891a(String str) {
        this.f129601c = str;
        return this;
    }

    /* renamed from: b */
    public ProfileLoadParams mo178896b(String str) {
        this.f129607i = str;
        return this;
    }

    /* renamed from: a */
    public ProfileLoadParams mo178892a(boolean z) {
        this.f129606h = z;
        return this;
    }

    /* renamed from: b */
    public ProfileLoadParams mo178897b(boolean z) {
        this.f129604f = z;
        return this;
    }
}
