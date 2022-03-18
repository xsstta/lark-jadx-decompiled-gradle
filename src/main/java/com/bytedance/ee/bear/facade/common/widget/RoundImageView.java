package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.util.p718t.C13736c;

public class RoundImageView extends AppCompatImageView {

    /* renamed from: a */
    private Paint f20886a;

    /* renamed from: b */
    private int f20887b;

    /* renamed from: c */
    private float f20888c;

    public RoundImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        this.f20886a = paint;
        paint.setDither(true);
        this.f20886a.setAntiAlias(true);
        if (getDrawable() != null) {
            Bitmap a = C13736c.m55690a(getDrawable());
            BitmapShader bitmapShader = new BitmapShader(a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.f20888c = (((float) this.f20887b) * 2.0f) / ((float) Math.min(a.getHeight(), a.getWidth()));
            Matrix matrix = new Matrix();
            float f = this.f20888c;
            matrix.setScale(f, f);
            bitmapShader.setLocalMatrix(matrix);
            this.f20886a.setShader(bitmapShader);
            int i = this.f20887b;
            canvas.drawCircle((float) i, (float) i, (float) i, this.f20886a);
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f20887b = Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2;
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
