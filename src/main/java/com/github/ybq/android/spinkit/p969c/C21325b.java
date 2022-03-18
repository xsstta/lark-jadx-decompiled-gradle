package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import android.os.Build;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.AbstractC21307a;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.C21308b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.c.b */
public class C21325b extends AbstractC21307a {

    /* renamed from: com.github.ybq.android.spinkit.c.b$a */
    private class C21326a extends C21308b {
        @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21308b
        /* renamed from: a */
        public ValueAnimator mo72408a() {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
            C21303d dVar = new C21303d(this);
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            return dVar.mo72398a(fArr, valueOf, Float.valueOf(1.0f), valueOf).mo72395a(1200L).mo72397a(fArr).mo72393a();
        }

        C21326a() {
            mo72422c(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        C21326a[] aVarArr = new C21326a[12];
        for (int i = 0; i < 12; i++) {
            aVarArr[i] = new C21326a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i].mo72435g(i * 100);
            } else {
                aVarArr[i].mo72435g((i * 100) - 1200);
            }
        }
        return aVarArr;
    }
}
