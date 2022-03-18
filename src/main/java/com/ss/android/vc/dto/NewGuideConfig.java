package com.ss.android.vc.dto;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class NewGuideConfig {

    /* renamed from: a */
    private View f152403a;

    /* renamed from: b */
    private String f152404b;

    /* renamed from: c */
    private String f152405c;

    /* renamed from: d */
    private String f152406d;

    /* renamed from: e */
    private int f152407e = 48;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    /* renamed from: a */
    public View mo208761a() {
        return this.f152403a;
    }

    /* renamed from: b */
    public String mo208762b() {
        return this.f152404b;
    }

    /* renamed from: c */
    public String mo208763c() {
        return this.f152405c;
    }

    /* renamed from: d */
    public String mo208765d() {
        return this.f152406d;
    }

    /* renamed from: e */
    public int mo208766e() {
        return this.f152407e;
    }

    /* renamed from: f */
    public NewGuideConfig clone() {
        return new NewGuideConfig(this.f152403a, this.f152404b, this.f152405c, this.f152406d, this.f152407e);
    }

    public String toString() {
        return "NewGuideConfig{anchorView=" + this.f152403a + ", guideKey='" + this.f152404b + '\'' + ", title='" + this.f152405c + '\'' + ", content='" + this.f152406d + '\'' + ", gravity=" + this.f152407e + '}';
    }

    public NewGuideConfig(View view, String str, String str2, String str3) {
        this.f152403a = view;
        this.f152404b = str;
        this.f152405c = str2;
        this.f152406d = str3;
    }

    public NewGuideConfig(View view, String str, String str2, String str3, int i) {
        this.f152403a = view;
        this.f152404b = str;
        this.f152405c = str2;
        this.f152406d = str3;
        this.f152407e = i;
    }
}
