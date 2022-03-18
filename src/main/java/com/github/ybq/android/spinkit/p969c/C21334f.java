package com.github.ybq.android.spinkit.p969c;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import com.github.ybq.android.spinkit.p966a.C21303d;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.AbstractC21322g;
import com.github.ybq.android.spinkit.p968b.C21309c;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.c.f */
public class C21334f extends AbstractC21322g {

    /* renamed from: m */
    private boolean f51893m;

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        C21335a[] aVarArr = new C21335a[4];
        for (int i = 0; i < 4; i++) {
            aVarArr[i] = new C21335a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i].mo72435g(i * LocationRequest.PRIORITY_INDOOR);
            } else {
                aVarArr[i].mo72435g((i * LocationRequest.PRIORITY_INDOOR) - 1200);
            }
        }
        return aVarArr;
    }

    /* renamed from: com.github.ybq.android.spinkit.c.f$a */
    private class C21335a extends C21309c {
        @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f, com.github.ybq.android.spinkit.p968b.C21309c
        /* renamed from: a */
        public ValueAnimator mo72408a() {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            return new C21303d(this).mo72399a(fArr, 0, 0, 255, 255, 0, 0).mo72401b(fArr, -180, -180, 0, 0, 0, 0).mo72403c(fArr, 0, 0, 0, 0, 180, 180).mo72395a(2400L).mo72396a(new LinearInterpolator()).mo72393a();
        }

        C21335a() {
            setAlpha(0);
            mo72430e(-180);
        }
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: a */
    public void mo72406a(Canvas canvas) {
        Rect b = mo72418b(getBounds());
        for (int i = 0; i < mo72491r(); i++) {
            int save = canvas.save();
            canvas.rotate((float) ((i * 90) + 45), (float) b.centerX(), (float) b.centerY());
            mo72490h(i).draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g, com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect b = mo72418b(rect);
        int min = Math.min(b.width(), b.height());
        if (this.f51893m) {
            min = (int) Math.sqrt((double) ((min * min) / 2));
            int width = (b.width() - min) / 2;
            int height = (b.height() - min) / 2;
            b = new Rect(b.left + width, b.top + height, b.right - width, b.bottom - height);
        }
        int i = min / 2;
        int i2 = b.left + i + 1;
        int i3 = b.top + i + 1;
        for (int i4 = 0; i4 < mo72491r(); i4++) {
            AbstractC21312f h = mo72490h(i4);
            h.mo72416a(b.left, b.top, i2, i3);
            h.mo72432f((float) h.mo72451q().right);
            h.mo72436g((float) h.mo72451q().bottom);
        }
    }
}
