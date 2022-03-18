package com.google.android.material.p980a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.p031d.p032a.p033a.C0965a;
import androidx.p031d.p032a.p033a.C0966b;
import androidx.p031d.p032a.p033a.C0967c;

/* renamed from: com.google.android.material.a.a */
public class C22116a {

    /* renamed from: a */
    public static final TimeInterpolator f53779a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f53780b = new C0966b();

    /* renamed from: c */
    public static final TimeInterpolator f53781c = new C0965a();

    /* renamed from: d */
    public static final TimeInterpolator f53782d = new C0967c();

    /* renamed from: e */
    public static final TimeInterpolator f53783e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m79705a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m79706a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
