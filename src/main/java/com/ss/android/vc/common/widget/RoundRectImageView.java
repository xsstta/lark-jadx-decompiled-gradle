package com.ss.android.vc.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class RoundRectImageView extends View {

    /* renamed from: a */
    private Bitmap f152086a;

    /* renamed from: b */
    private int f152087b;

    /* renamed from: c */
    private Paint f152088c;

    /* renamed from: d */
    private final RectF f152089d = new RectF();

    public void setBitmap(Bitmap bitmap) {
        this.f152086a = bitmap;
        invalidate();
    }

    public RoundRectImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m236361a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.rectCornerSize});
        this.f152087b = (int) obtainStyledAttributes.getDimension(0, 5.0f);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f152088c = new Paint();
        if (this.f152086a != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            float f = (float) width;
            float f2 = (float) height;
            int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2, null, 31);
            this.f152086a = m236360a(this.f152086a, width, height);
            this.f152088c.setShader(new BitmapShader(this.f152086a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            this.f152089d.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2);
            RectF rectF = this.f152089d;
            int i = this.f152087b;
            canvas.drawRoundRect(rectF, (float) i, (float) i, this.f152088c);
            canvas.restoreToCount(saveLayer);
        }
    }

    public RoundRectImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236361a(attributeSet);
    }

    public RoundRectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236361a(attributeSet);
    }

    /* renamed from: a */
    private Bitmap m236360a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
