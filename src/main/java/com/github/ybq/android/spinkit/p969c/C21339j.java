package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p966a.p967a.animationInterpolatorC21296b;
import com.github.ybq.android.spinkit.p968b.C21310d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.c.j */
public class C21339j extends C21310d {
    public C21339j() {
        mo72422c(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21310d
    /* renamed from: a */
    public ValueAnimator mo72408a() {
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.7f, 1.0f};
        C21303d dVar = new C21303d(this);
        Float valueOf = Float.valueOf(1.0f);
        return dVar.mo72398a(fArr, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), valueOf, valueOf).mo72399a(fArr, 255, 178, 0).mo72395a(1000L).mo72396a(animationInterpolatorC21296b.m77139a(0.21f, 0.53f, 0.56f, 0.8f, fArr)).mo72393a();
    }
}
