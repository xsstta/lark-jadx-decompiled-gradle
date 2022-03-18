package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.AbstractC21322g;
import com.github.ybq.android.spinkit.p968b.C21308b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;

/* renamed from: com.github.ybq.android.spinkit.c.a */
public class C21323a extends AbstractC21322g {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        return new AbstractC21312f[]{new C21324a(), new C21324a()};
    }

    /* renamed from: com.github.ybq.android.spinkit.c.a$a */
    private class C21324a extends C21308b {
        @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21308b
        /* renamed from: a */
        public ValueAnimator mo72408a() {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
            C21303d dVar = new C21303d(this);
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            return dVar.mo72398a(fArr, valueOf, Float.valueOf(1.0f), valueOf).mo72395a(2000L).mo72397a(fArr).mo72393a();
        }

        C21324a() {
            mo72422c(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g, com.github.ybq.android.spinkit.p968b.AbstractC21312f
    /* renamed from: a */
    public ValueAnimator mo72408a() {
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f};
        return new C21303d(this).mo72405d(fArr, 0, 360).mo72395a(2000L).mo72396a(new LinearInterpolator()).mo72393a();
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: a */
    public void mo72489a(AbstractC21312f... fVarArr) {
        super.mo72489a(fVarArr);
        if (Build.VERSION.SDK_INT >= 24) {
            fVarArr[1].mo72435g(1000);
        } else {
            fVarArr[1].mo72435g(IByteRtcError.BRERR_INVALID_TOKEN);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g, com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect b = mo72418b(rect);
        int width = (int) (((float) b.width()) * 0.6f);
        mo72490h(0).mo72416a(b.right - width, b.top, b.right, b.top + width);
        mo72490h(1).mo72416a(b.right - width, b.bottom - width, b.right, b.bottom);
    }
}
