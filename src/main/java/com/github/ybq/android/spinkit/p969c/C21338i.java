package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.C21308b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.c.i */
public class C21338i extends C21308b {
    public C21338i() {
        mo72422c(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21308b
    /* renamed from: a */
    public ValueAnimator mo72408a() {
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f};
        return new C21303d(this).mo72398a(fArr, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), Float.valueOf(1.0f)).mo72399a(fArr, 255, 0).mo72395a(1000L).mo72397a(fArr).mo72393a();
    }
}
