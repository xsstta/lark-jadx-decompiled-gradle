package com.bytedance.lynx.tasm.ui.imageloader;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.lynx.tasm.ui.imageloader.a */
public class C19897a extends Drawable {

    /* renamed from: a */
    private Drawable f48623a;

    /* renamed from: b */
    private String f48624b;

    /* renamed from: c */
    private int f48625c;

    /* renamed from: d */
    private int f48626d;

    /* renamed from: e */
    private Matrix f48627e;

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    private void m72612a() {
        if (this.f48623a != null) {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f48627e = C19908e.m72632a(this.f48623a, this.f48625c, this.f48626d, rectF, rectF, this.f48624b);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo67422a(String str) {
        this.f48624b = str;
        m72612a();
    }

    /* renamed from: a */
    public void mo67421a(Drawable drawable) {
        this.f48623a = drawable;
        if (drawable != null) {
            drawable.setCallback(getCallback());
        }
        m72612a();
    }

    public void draw(Canvas canvas) {
        if (this.f48623a != null) {
            canvas.concat(this.f48627e);
            this.f48623a.draw(canvas);
        }
    }

    public C19897a(int i, int i2) {
        this.f48625c = i;
        this.f48626d = i2;
    }
}
