package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import android.os.Build;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.AbstractC21307a;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.C21308b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.c.e */
public class C21332e extends AbstractC21307a {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        C21333a[] aVarArr = new C21333a[12];
        for (int i = 0; i < 12; i++) {
            aVarArr[i] = new C21333a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i].mo72435g(i * 100);
            } else {
                aVarArr[i].mo72435g((i * 100) - 1200);
            }
        }
        return aVarArr;
    }

    /* renamed from: com.github.ybq.android.spinkit.c.e$a */
    private class C21333a extends C21308b {
        @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21308b
        /* renamed from: a */
        public ValueAnimator mo72408a() {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.39f, 0.4f, 1.0f};
            return new C21303d(this).mo72399a(fArr, 0, 0, 255, 0).mo72395a(1200L).mo72397a(fArr).mo72393a();
        }

        C21333a() {
            setAlpha(0);
        }
    }
}
