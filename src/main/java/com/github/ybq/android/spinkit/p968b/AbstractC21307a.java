package com.github.ybq.android.spinkit.p968b;

import android.graphics.Canvas;
import android.graphics.Rect;

/* renamed from: com.github.ybq.android.spinkit.b.a */
public abstract class AbstractC21307a extends AbstractC21322g {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: a */
    public void mo72406a(Canvas canvas) {
        for (int i = 0; i < mo72491r(); i++) {
            AbstractC21312f h = mo72490h(i);
            int save = canvas.save();
            canvas.rotate((float) ((i * 360) / mo72491r()), (float) getBounds().centerX(), (float) getBounds().centerY());
            h.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g, com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect b = mo72418b(rect);
        int width = (int) (((((double) b.width()) * 3.141592653589793d) / 3.5999999046325684d) / ((double) mo72491r()));
        int centerX = b.centerX() - width;
        int centerX2 = b.centerX() + width;
        for (int i = 0; i < mo72491r(); i++) {
            mo72490h(i).mo72416a(centerX, b.top, centerX2, b.top + (width * 2));
        }
    }
}
