package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.AbstractC21322g;
import com.github.ybq.android.spinkit.p968b.C21309c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.c.n */
public class C21344n extends AbstractC21322g {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        return new AbstractC21312f[]{new C21345a(0), new C21345a(3)};
    }

    /* renamed from: com.github.ybq.android.spinkit.c.n$a */
    private class C21345a extends C21309c {

        /* renamed from: m */
        int f51896m;

        @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21309c
        /* renamed from: a */
        public ValueAnimator mo72408a() {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            C21303d d = new C21303d(this).mo72405d(fArr, 0, -90, -179, -180, -270, -360);
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            Float valueOf2 = Float.valueOf(0.75f);
            C21303d d2 = d.mo72402c(fArr, valueOf, valueOf2, valueOf2, valueOf2, valueOf, valueOf).mo72404d(fArr, valueOf, valueOf, valueOf2, valueOf2, valueOf2, valueOf);
            Float valueOf3 = Float.valueOf(1.0f);
            Float valueOf4 = Float.valueOf(0.5f);
            C21303d a = d2.mo72398a(fArr, valueOf3, valueOf4, valueOf3, valueOf3, valueOf4, valueOf3).mo72395a(1800L).mo72397a(fArr);
            if (Build.VERSION.SDK_INT >= 24) {
                a.mo72394a(this.f51896m);
            }
            return a.mo72393a();
        }

        public C21345a(int i) {
            this.f51896m = i;
        }
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: a */
    public void mo72489a(AbstractC21312f... fVarArr) {
        super.mo72489a(fVarArr);
        if (Build.VERSION.SDK_INT < 24) {
            fVarArr[1].mo72435g(-900);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g, com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void onBoundsChange(Rect rect) {
        Rect b = mo72418b(rect);
        super.onBoundsChange(b);
        for (int i = 0; i < mo72491r(); i++) {
            mo72490h(i).mo72416a(b.left, b.top, b.left + (b.width() / 4), b.top + (b.height() / 4));
        }
    }
}
