package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.AbstractC21322g;
import com.github.ybq.android.spinkit.p968b.C21309c;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.github.ybq.android.spinkit.c.c */
public class C21327c extends AbstractC21322g {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        int[] iArr = {LocationRequest.PRIORITY_HD_ACCURACY, LocationRequest.PRIORITY_INDOOR, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 100, LocationRequest.PRIORITY_HD_ACCURACY, LocationRequest.PRIORITY_INDOOR, 0, 100, LocationRequest.PRIORITY_HD_ACCURACY};
        C21329a[] aVarArr = new C21329a[9];
        for (int i = 0; i < 9; i++) {
            aVarArr[i] = new C21329a();
            aVarArr[i].mo72435g(iArr[i]);
        }
        return aVarArr;
    }

    /* renamed from: com.github.ybq.android.spinkit.c.c$a */
    private class C21329a extends C21309c {
        @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21309c
        /* renamed from: a */
        public ValueAnimator mo72408a() {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.35f, 0.7f, 1.0f};
            C21303d dVar = new C21303d(this);
            Float valueOf = Float.valueOf(1.0f);
            return dVar.mo72398a(fArr, valueOf, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), valueOf, valueOf).mo72395a(1300L).mo72397a(fArr).mo72393a();
        }

        private C21329a() {
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g, com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect b = mo72418b(rect);
        int width = (int) (((float) b.width()) * 0.33f);
        int height = (int) (((float) b.height()) * 0.33f);
        for (int i = 0; i < mo72491r(); i++) {
            int i2 = b.left + ((i % 3) * width);
            int i3 = b.top + ((i / 3) * height);
            mo72490h(i).mo72416a(i2, i3, i2 + width, i3 + height);
        }
    }
}
