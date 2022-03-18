package com.ss.android.appcenter.common.shadow;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0768a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.appcenter.common.shadow.g */
public class C28153g {

    /* renamed from: a */
    private final boolean f70587a;

    /* renamed from: b */
    private final int f70588b;

    /* renamed from: c */
    private final int f70589c;

    /* renamed from: d */
    private final float f70590d;

    /* renamed from: a */
    private boolean m103108a(int i) {
        if (C0768a.m3716c(i, 255) == this.f70589c) {
            return true;
        }
        return false;
    }

    public C28153g(Context context) {
        this.f70587a = C28154h.m103113a(context, R.attr.wkElevationOverlayEnabled, false);
        this.f70588b = C28155i.m103116a(context, (int) R.attr.wkElevationOverlayColor, 0);
        this.f70589c = C28155i.m103116a(context, (int) R.attr.wkColorSurface, 0);
        this.f70590d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public float mo100324a(float f) {
        float f2 = this.f70590d;
        if (f2 <= BitmapDescriptorFactory.HUE_RED || f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: a */
    public int mo100325a(int i, float f) {
        if (!this.f70587a || !m103108a(i)) {
            return i;
        }
        return mo100326b(i, f);
    }

    /* renamed from: b */
    public int mo100326b(int i, float f) {
        float a = mo100324a(f);
        return C0768a.m3716c(C28155i.m103115a(C0768a.m3716c(i, 255), this.f70588b, a), Color.alpha(i));
    }
}
