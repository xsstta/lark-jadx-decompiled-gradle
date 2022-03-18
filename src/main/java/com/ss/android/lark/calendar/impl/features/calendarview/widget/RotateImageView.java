package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class RotateImageView extends View {

    /* renamed from: a */
    private PaintFlagsDrawFilter f78463a;

    /* renamed from: b */
    private Paint f78464b;

    /* renamed from: c */
    private Matrix f78465c;

    /* renamed from: d */
    private Bitmap f78466d;

    /* renamed from: e */
    private Bitmap f78467e;

    /* renamed from: f */
    private float f78468f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112597a() {
        this.f78463a = new PaintFlagsDrawFilter(0, 3);
        Paint paint = new Paint();
        this.f78464b = paint;
        paint.setAntiAlias(true);
        this.f78465c = new Matrix();
        this.f78468f = BitmapDescriptorFactory.HUE_RED;
    }

    public RotateImageView(Context context) {
        super(context);
        mo112597a();
    }

    public void setAngle(float f) {
        this.f78468f = f;
        setBitmap(this.f78467e);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f78464b.reset();
        this.f78464b.setAntiAlias(true);
        this.f78464b.setFlags(1);
        canvas.setDrawFilter(this.f78463a);
        canvas.drawBitmap(this.f78466d, (((float) getWidth()) - ((float) this.f78466d.getWidth())) / 2.0f, (((float) getHeight()) - ((float) this.f78466d.getHeight())) / 2.0f, this.f78464b);
    }

    public void setBitmap(Bitmap bitmap) {
        this.f78467e = bitmap;
        this.f78465c.reset();
        this.f78465c.setTranslate(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        this.f78465c.preRotate(this.f78468f, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        this.f78466d = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.f78465c, true);
        postInvalidate();
    }

    public RotateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo112597a();
    }
}
