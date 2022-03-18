package com.larksuite.framework.ui.dragger;

import android.animation.FloatArrayEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: com.larksuite.framework.ui.dragger.i */
public class C26208i extends View {

    /* renamed from: d */
    private static int f64710d = 50;

    /* renamed from: a */
    public Paint f64711a = new Paint(2);

    /* renamed from: b */
    public float[] f64712b;

    /* renamed from: c */
    public ValueAnimator f64713c;

    /* renamed from: e */
    private Bitmap f64714e;

    /* renamed from: f */
    private ViewGroup f64715f;

    /* renamed from: g */
    private int f64716g;

    /* renamed from: h */
    private int f64717h;

    /* renamed from: i */
    private ValueAnimator f64718i;

    /* renamed from: j */
    private boolean f64719j;

    public int getOffsetX() {
        return this.f64716g;
    }

    public int getOffsetY() {
        return this.f64717h;
    }

    /* renamed from: a */
    public void mo93218a() {
        Bitmap bitmap = this.f64714e;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f64714e.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f64713c.cancel();
    }

    private void setColorFilter(ColorMatrix colorMatrix) {
        ColorMatrixColorFilter colorMatrixColorFilter;
        Paint paint = this.f64711a;
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
        if (!this.f64714e.isRecycled()) {
            canvas.drawBitmap(this.f64714e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f64711a);
        }
    }

    /* renamed from: a */
    private void m94803a(float[] fArr) {
        float[] fArr2 = this.f64712b;
        if (fArr2 == null) {
            fArr2 = new ColorMatrix().getArray();
        }
        this.f64712b = Arrays.copyOf(fArr2, fArr2.length);
        ValueAnimator valueAnimator = this.f64718i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new FloatArrayEvaluator(this.f64712b), fArr2, fArr);
        this.f64718i = ofObject;
        ofObject.setDuration((long) f64710d);
        this.f64718i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.larksuite.framework.ui.dragger.C26208i.C262113 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C26208i.this.f64711a.setColorFilter(new ColorMatrixColorFilter(C26208i.this.f64712b));
                C26208i.this.invalidate();
            }
        });
        this.f64718i.start();
    }

    public void setColor(int i) {
        if (i != 0) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(BitmapDescriptorFactory.HUE_RED);
            ColorMatrix colorMatrix2 = new ColorMatrix();
            m94802a(i, colorMatrix2);
            colorMatrix.postConcat(colorMatrix2);
            if (!this.f64719j) {
                setColorFilter(colorMatrix);
            } else if (C26222m.m94836a()) {
                m94803a(colorMatrix.getArray());
            } else {
                setColorFilter(colorMatrix);
            }
        } else if (!this.f64719j) {
            setColorFilter(null);
        } else if (!C26222m.m94836a() || this.f64712b == null) {
            setColorFilter(null);
        } else {
            m94803a(new ColorMatrix().getArray());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f64714e.getWidth(), this.f64714e.getHeight());
    }

    /* renamed from: a */
    public static int m94801a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    private void m94802a(int i, ColorMatrix colorMatrix) {
        colorMatrix.setScale(((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f, ((float) Color.alpha(i)) / 255.0f);
    }

    /* renamed from: a */
    public void mo93219a(float f, float f2) {
        this.f64715f.addView(this);
        setLayoutParams(new FrameLayout.LayoutParams(this.f64714e.getWidth(), this.f64714e.getHeight()));
        setTranslationX(f - ((float) this.f64716g));
        setTranslationY(f2 - ((float) this.f64717h));
        post(new Runnable() {
            /* class com.larksuite.framework.ui.dragger.C26208i.RunnableC262102 */

            public void run() {
                C26208i.this.f64713c.start();
            }
        });
    }

    /* renamed from: a */
    public void mo93220a(int i, int i2) {
        setTranslationX((float) (i - this.f64716g));
        setTranslationY((float) (i2 - this.f64717h));
    }

    public C26208i(ViewGroup viewGroup, Bitmap bitmap, int i, int i2) {
        super(viewGroup.getContext());
        this.f64715f = viewGroup;
        this.f64714e = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        measure(makeMeasureSpec, makeMeasureSpec);
        this.f64716g = i;
        this.f64717h = i2;
        int width = this.f64714e.getWidth();
        final float a = (float) ((m94801a(getContext(), 12.0f) + width) / width);
        this.f64719j = false;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f64713c = valueAnimator;
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f64713c.setDuration(150L);
        this.f64713c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.larksuite.framework.ui.dragger.C26208i.C262091 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * (a - 1.0f)) + 1.0f;
                C26208i.this.setScaleX(floatValue);
                C26208i.this.setScaleY(floatValue);
            }
        });
    }
}
