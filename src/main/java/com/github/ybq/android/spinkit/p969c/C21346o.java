package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.AbstractC21322g;
import com.github.ybq.android.spinkit.p968b.C21309c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.c.o */
public class C21346o extends AbstractC21322g {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        C21347a[] aVarArr = new C21347a[5];
        for (int i = 0; i < 5; i++) {
            aVarArr[i] = new C21347a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i].mo72435g((i * 100) + 600);
            } else {
                aVarArr[i].mo72435g((i * 100) - 1200);
            }
        }
        return aVarArr;
    }

    /* renamed from: com.github.ybq.android.spinkit.c.o$a */
    private class C21347a extends C21309c {
        @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21309c
        /* renamed from: a */
        public ValueAnimator mo72408a() {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.2f, 0.4f, 1.0f};
            C21303d dVar = new C21303d(this);
            Float valueOf = Float.valueOf(0.4f);
            return dVar.mo72400b(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).mo72395a(1200L).mo72397a(fArr).mo72393a();
        }

        C21347a() {
            mo72429e(0.4f);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g, com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect b = mo72418b(rect);
        int width = b.width() / mo72491r();
        int width2 = ((b.width() / 5) * 3) / 5;
        for (int i = 0; i < mo72491r(); i++) {
            AbstractC21312f h = mo72490h(i);
            int i2 = b.left + (i * width) + (width / 5);
            h.mo72416a(i2, b.top, i2 + width2, b.bottom);
        }
    }
}
