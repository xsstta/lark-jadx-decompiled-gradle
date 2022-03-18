package com.airbnb.lottie.p067a;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: com.airbnb.lottie.a.a */
public class C1734a extends Paint {
    public void setTextLocales(LocaleList localeList) {
    }

    public C1734a() {
    }

    public C1734a(int i) {
        super(i);
    }

    public C1734a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C1734a(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
