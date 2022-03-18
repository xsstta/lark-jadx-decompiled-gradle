package com.ss.android.lark.mm.widget.onboarding;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MmNewGuideConfig {

    /* renamed from: a */
    private View f118872a;

    /* renamed from: b */
    private String f118873b;

    /* renamed from: c */
    private String f118874c;

    /* renamed from: d */
    private String f118875d;

    /* renamed from: e */
    private int f118876e = 48;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    /* renamed from: a */
    public View mo165787a() {
        return this.f118872a;
    }

    /* renamed from: b */
    public String mo165788b() {
        return this.f118873b;
    }

    /* renamed from: c */
    public String mo165789c() {
        return this.f118874c;
    }

    /* renamed from: d */
    public String mo165791d() {
        return this.f118875d;
    }

    /* renamed from: e */
    public int mo165792e() {
        return this.f118876e;
    }

    /* renamed from: f */
    public MmNewGuideConfig clone() {
        return new MmNewGuideConfig(this.f118872a, this.f118873b, this.f118874c, this.f118875d, this.f118876e);
    }

    public String toString() {
        return "NewGuideConfig{anchorView=" + this.f118872a + ", guideKey='" + this.f118873b + '\'' + ", title='" + this.f118874c + '\'' + ", content='" + this.f118875d + '\'' + ", gravity=" + this.f118876e + '}';
    }

    public MmNewGuideConfig(View view, String str, String str2, String str3, int i) {
        this.f118872a = view;
        this.f118873b = str;
        this.f118874c = str2;
        this.f118875d = str3;
        this.f118876e = i;
    }
}
