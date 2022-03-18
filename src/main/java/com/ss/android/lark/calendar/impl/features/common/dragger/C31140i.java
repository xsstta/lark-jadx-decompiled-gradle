package com.ss.android.lark.calendar.impl.features.common.dragger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.i */
public class C31140i extends View {

    /* renamed from: a */
    private Bitmap f78654a;

    /* renamed from: b */
    private ViewGroup f78655b;

    /* renamed from: c */
    private Paint f78656c = new Paint(2);

    /* renamed from: d */
    private int f78657d;

    /* renamed from: e */
    private int f78658e;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public int getOffsetX() {
        return this.f78657d;
    }

    public int getOffsetY() {
        return this.f78658e;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public void mo112771a() {
        Bitmap bitmap = this.f78654a;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f78654a.recycle();
        }
    }

    private void setColorFilter(ColorMatrix colorMatrix) {
        ColorMatrixColorFilter colorMatrixColorFilter;
        Paint paint = this.f78656c;
        if (colorMatrix != null) {
            colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        } else {
            colorMatrixColorFilter = null;
        }
        paint.setColorFilter(colorMatrixColorFilter);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f78654a.isRecycled()) {
            canvas.drawBitmap(this.f78654a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f78656c);
        }
    }

    public void setColor(int i) {
        if (i != 0) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(BitmapDescriptorFactory.HUE_RED);
            ColorMatrix colorMatrix2 = new ColorMatrix();
            m116249a(i, colorMatrix2);
            colorMatrix.postConcat(colorMatrix2);
            setColorFilter(colorMatrix);
            return;
        }
        setColorFilter(null);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f78654a.getWidth(), this.f78654a.getHeight());
    }

    /* renamed from: a */
    private void m116249a(int i, ColorMatrix colorMatrix) {
        colorMatrix.setScale(((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f, ((float) Color.alpha(i)) / 255.0f);
    }

    /* renamed from: a */
    public void mo112772a(float f, float f2) {
        this.f78655b.addView(this);
        setLayoutParams(new FrameLayout.LayoutParams(this.f78654a.getWidth(), this.f78654a.getHeight()));
        setTranslationX(f - ((float) this.f78657d));
        setTranslationY(f2 - ((float) this.f78658e));
    }

    /* renamed from: a */
    public void mo112773a(int i, int i2) {
        setTranslationX((float) (i - this.f78657d));
        setTranslationY((float) (i2 - this.f78658e));
    }

    public C31140i(ViewGroup viewGroup, Bitmap bitmap, int i, int i2) {
        super(viewGroup.getContext());
        this.f78655b = viewGroup;
        this.f78654a = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f78657d = i;
        this.f78658e = i2;
    }
}
