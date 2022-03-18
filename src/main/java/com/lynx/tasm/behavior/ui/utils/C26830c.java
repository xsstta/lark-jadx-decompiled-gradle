package com.lynx.tasm.behavior.ui.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.ui.utils.BorderRadius;
import com.lynx.tasm.utils.ColorUtils;

/* renamed from: com.lynx.tasm.behavior.ui.utils.c */
public class C26830c {

    /* renamed from: a */
    protected final AbstractC26684l f66633a;

    /* renamed from: b */
    protected float f66634b;

    /* renamed from: c */
    private BackgroundDrawable f66635c;

    /* renamed from: d */
    private Drawable.Callback f66636d;

    /* renamed from: e */
    private int f66637e;

    /* renamed from: c */
    public BackgroundDrawable mo95533c() {
        return this.f66635c;
    }

    /* renamed from: d */
    public int mo95536d() {
        return this.f66637e;
    }

    /* renamed from: a */
    public void mo95530a(ReadableArray readableArray) {
        mo95520b().mo95481a(readableArray);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public BackgroundDrawable mo95516a() {
        return new BackgroundDrawable(this.f66633a, this.f66634b);
    }

    /* renamed from: e */
    public BorderRadius mo95538e() {
        BackgroundDrawable backgroundDrawable = this.f66635c;
        if (backgroundDrawable == null) {
            return null;
        }
        return backgroundDrawable.mo95473a();
    }

    /* renamed from: f */
    public void mo95540f() {
        BackgroundDrawable backgroundDrawable = this.f66635c;
        if (backgroundDrawable != null) {
            backgroundDrawable.mo95489d();
        }
    }

    /* renamed from: g */
    public void mo95541g() {
        BackgroundDrawable backgroundDrawable = this.f66635c;
        if (backgroundDrawable != null) {
            backgroundDrawable.mo95492e();
        }
    }

    /* renamed from: b */
    private BackgroundDrawable mo95520b() {
        if (this.f66635c == null) {
            BackgroundDrawable a = mo95516a();
            this.f66635c = a;
            a.setCallback(this.f66636d);
        }
        return this.f66635c;
    }

    /* renamed from: a */
    public void mo95521a(float f) {
        this.f66634b = f;
    }

    public C26830c(AbstractC26684l lVar) {
        this.f66633a = lVar;
    }

    /* renamed from: b */
    public void mo95531b(ReadableArray readableArray) {
        mo95520b().mo95485b(readableArray);
    }

    /* renamed from: c */
    public void mo95534c(ReadableArray readableArray) {
        mo95520b().mo95488c(readableArray);
    }

    /* renamed from: d */
    public void mo95537d(ReadableArray readableArray) {
        mo95520b().mo95490d(readableArray);
    }

    /* renamed from: e */
    public void mo95539e(ReadableArray readableArray) {
        mo95520b().mo95493e(readableArray);
    }

    /* renamed from: b */
    public void mo95532b(String str) {
        mo95520b().mo95482a(str);
    }

    /* renamed from: a */
    public void mo95523a(int i) {
        this.f66637e = i;
        if (i != 0 || this.f66635c != null) {
            mo95520b().mo95474a(i);
        }
    }

    /* renamed from: c */
    public void mo95535c(String str) {
        int i;
        String str2;
        if (TextUtils.isEmpty(str)) {
            this.f66637e = 0;
        } else {
            str = str.trim();
            if (str.startsWith("rgb(") || str.startsWith("rgba(")) {
                i = str.indexOf(")");
            } else {
                i = str.indexOf(" ");
            }
            if (i > 0) {
                str2 = str.substring(0, i + 1);
            } else {
                str2 = str;
            }
            String trim = str2.trim();
            if (ColorUtils.m97897b(trim)) {
                this.f66637e = ColorUtils.m97896a(trim);
                if (i > 0) {
                    str = str.substring(i + 1).trim();
                } else {
                    str = null;
                }
            }
        }
        mo95520b().mo95474a(this.f66637e);
        mo95520b().mo95486b(str);
    }

    /* renamed from: a */
    public void mo95528a(Bitmap.Config config) {
        mo95520b().mo95479a(config);
    }

    /* renamed from: a */
    public void mo95529a(Drawable.Callback callback) {
        this.f66636d = callback;
    }

    /* renamed from: a */
    public void mo95524a(int i, float f) {
        mo95520b().mo95475a(i, f);
    }

    /* renamed from: a */
    public void mo95526a(int i, int i2) {
        mo95520b().mo95477a(i, i2);
    }

    /* renamed from: a */
    public void mo95527a(int i, BorderRadius.C26826a aVar) {
        mo95520b().mo95478a(i, aVar);
    }

    /* renamed from: a */
    public void mo95525a(int i, float f, float f2) {
        mo95520b().mo95476a(i, f, f2);
    }

    /* renamed from: a */
    public void mo95522a(float f, float f2, float f3, float f4) {
        BackgroundDrawable backgroundDrawable = this.f66635c;
        if (backgroundDrawable != null) {
            backgroundDrawable.mo95484b(1, f);
            backgroundDrawable.mo95484b(2, f2);
            backgroundDrawable.mo95484b(3, f3);
            backgroundDrawable.mo95484b(0, f4);
        }
    }
}
