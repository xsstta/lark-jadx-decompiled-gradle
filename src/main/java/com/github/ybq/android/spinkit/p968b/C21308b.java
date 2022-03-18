package com.github.ybq.android.spinkit.p968b;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.github.ybq.android.spinkit.b.b */
public class C21308b extends AbstractC21311e {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    /* renamed from: a */
    public ValueAnimator mo72408a() {
        return null;
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21311e
    /* renamed from: a */
    public void mo72409a(Canvas canvas, Paint paint) {
        if (mo72451q() != null) {
            canvas.drawCircle((float) mo72451q().centerX(), (float) mo72451q().centerY(), (float) (Math.min(mo72451q().width(), mo72451q().height()) / 2), paint);
        }
    }
}
