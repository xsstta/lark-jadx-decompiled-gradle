package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.AbstractC21322g;
import com.github.ybq.android.spinkit.p968b.C21308b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.c.m */
public class C21342m extends AbstractC21322g {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        return new AbstractC21312f[]{new C21343a(), new C21343a(), new C21343a()};
    }

    /* renamed from: com.github.ybq.android.spinkit.c.m$a */
    private class C21343a extends C21308b {
        @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21308b
        /* renamed from: a */
        public ValueAnimator mo72408a() {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.4f, 0.8f, 1.0f};
            C21303d dVar = new C21303d(this);
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            return dVar.mo72398a(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).mo72395a(1400L).mo72397a(fArr).mo72393a();
        }

        C21343a() {
            mo72422c(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: a */
    public void mo72489a(AbstractC21312f... fVarArr) {
        super.mo72489a(fVarArr);
        fVarArr[1].mo72435g(160);
        fVarArr[2].mo72435g(320);
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g, com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect b = mo72418b(rect);
        int width = b.width() / 8;
        int centerY = b.centerY() - width;
        int centerY2 = b.centerY() + width;
        for (int i = 0; i < mo72491r(); i++) {
            int width2 = ((b.width() * i) / 3) + b.left;
            mo72490h(i).mo72416a(width2, centerY, (width * 2) + width2, centerY2);
        }
    }
}
