package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.C21308b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.c.k */
public class C21340k extends C21308b {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21308b
    /* renamed from: a */
    public ValueAnimator mo72408a() {
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        return new C21303d(this).mo72401b(fArr, 0, -180, -180).mo72403c(fArr, 0, 0, -180).mo72395a(1200L).mo72397a(fArr).mo72393a();
    }
}
