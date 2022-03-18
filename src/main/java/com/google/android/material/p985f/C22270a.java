package com.google.android.material.p985f;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0768a;
import com.google.android.material.p982c.C22197a;
import com.google.android.material.p988i.C22312b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.f.a */
public class C22270a {

    /* renamed from: a */
    private final boolean f54449a;

    /* renamed from: b */
    private final int f54450b;

    /* renamed from: c */
    private final int f54451c;

    /* renamed from: d */
    private final float f54452d;

    /* renamed from: a */
    public boolean mo77447a() {
        return this.f54449a;
    }

    /* renamed from: a */
    private boolean m80567a(int i) {
        if (C0768a.m3716c(i, 255) == this.f54451c) {
            return true;
        }
        return false;
    }

    public C22270a(Context context) {
        this.f54449a = C22312b.m80792a(context, (int) R.attr.elevationOverlayEnabled, false);
        this.f54450b = C22197a.m80100a(context, (int) R.attr.elevationOverlayColor, 0);
        this.f54451c = C22197a.m80100a(context, (int) R.attr.colorSurface, 0);
        this.f54452d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public float mo77445a(float f) {
        float f2 = this.f54452d;
        if (f2 <= BitmapDescriptorFactory.HUE_RED || f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: a */
    public int mo77446a(int i, float f) {
        if (!this.f54449a || !m80567a(i)) {
            return i;
        }
        return mo77448b(i, f);
    }

    /* renamed from: b */
    public int mo77448b(int i, float f) {
        float a = mo77445a(f);
        return C0768a.m3716c(C22197a.m80099a(C0768a.m3716c(i, 255), this.f54450b, a), Color.alpha(i));
    }
}
