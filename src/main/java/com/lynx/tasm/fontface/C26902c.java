package com.lynx.tasm.fontface;

import android.graphics.Typeface;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.fontface.c */
public class C26902c {

    /* renamed from: a */
    private Typeface f66794a;

    /* renamed from: b */
    private Typeface[] f66795b;

    C26902c(Typeface typeface) {
        Typeface[] typefaceArr = new Typeface[4];
        this.f66795b = typefaceArr;
        this.f66794a = typeface;
        typefaceArr[0] = typeface;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Typeface mo95709a(int i) {
        if (i < 0 || i > 3) {
            i = 0;
        }
        Typeface[] typefaceArr = this.f66795b;
        if (typefaceArr[i] == null) {
            typefaceArr[i] = Typeface.create(this.f66794a, i);
        }
        return this.f66795b[i];
    }
}
