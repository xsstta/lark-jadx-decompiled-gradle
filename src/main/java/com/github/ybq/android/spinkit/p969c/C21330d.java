package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import android.os.Build;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.AbstractC21322g;
import com.github.ybq.android.spinkit.p968b.C21308b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;

/* renamed from: com.github.ybq.android.spinkit.c.d */
public class C21330d extends AbstractC21322g {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        return new AbstractC21312f[]{new C21331a(), new C21331a()};
    }

    /* renamed from: com.github.ybq.android.spinkit.c.d$a */
    private class C21331a extends C21308b {
        @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21308b
        /* renamed from: a */
        public ValueAnimator mo72408a() {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
            C21303d dVar = new C21303d(this);
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            return dVar.mo72398a(fArr, valueOf, Float.valueOf(1.0f), valueOf).mo72395a(2000L).mo72397a(fArr).mo72393a();
        }

        C21331a() {
            setAlpha(153);
            mo72422c(BitmapDescriptorFactory.HUE_RED);
        }
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
}
