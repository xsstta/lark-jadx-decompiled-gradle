package com.ss.android.videoshop.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.videoshop.widget.a */
public class C64192a {

    /* renamed from: a */
    private final RectF f162273a = new RectF();

    /* renamed from: b */
    private float f162274b;

    /* renamed from: c */
    private final Paint f162275c;

    /* renamed from: d */
    private final Paint f162276d;

    public C64192a() {
        Paint paint = new Paint();
        this.f162275c = paint;
        Paint paint2 = new Paint();
        this.f162276d = paint2;
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
    }

    /* renamed from: a */
    public void mo222574a(float f) {
        this.f162274b = f;
    }

    /* renamed from: a */
    public void mo222576a(Canvas canvas) {
        canvas.saveLayer(this.f162273a, this.f162276d, 31);
        RectF rectF = this.f162273a;
        float f = this.f162274b;
        canvas.drawRoundRect(rectF, f, f, this.f162276d);
        canvas.saveLayer(this.f162273a, this.f162275c, 31);
    }

    /* renamed from: a */
    public void mo222575a(int i, int i2) {
        this.f162273a.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
    }
}
