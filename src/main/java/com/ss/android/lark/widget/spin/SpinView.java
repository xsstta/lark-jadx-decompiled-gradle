package com.ss.android.lark.widget.spin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.larksuite.suite.R;

public class SpinView extends ImageView {

    /* renamed from: a */
    public float f146909a;

    /* renamed from: b */
    public int f146910b;

    /* renamed from: c */
    public boolean f146911c;

    /* renamed from: d */
    private Runnable f146912d;

    /* renamed from: e */
    private Drawable f146913e;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f146911c = false;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f146911c = true;
        post(this.f146912d);
    }

    public SpinView(Context context) {
        super(context);
        m229881a(context, (AttributeSet) null);
    }

    public void setAnimationSpeed(float f) {
        this.f146910b = (int) (83.0f / f);
    }

    public void setSpinDrawable(Drawable drawable) {
        if (drawable != null) {
            this.f146913e = drawable;
            setImageDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.rotate(this.f146909a, (float) (getWidth() / 2), (float) (getHeight() / 2));
        super.onDraw(canvas);
    }

    public SpinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m229881a(context, attributeSet);
    }

    /* renamed from: a */
    private void m229880a(int i, TypedArray typedArray) {
        if (i == 0) {
            this.f146913e = typedArray.getDrawable(i);
        }
    }

    /* renamed from: a */
    private void m229881a(Context context, AttributeSet attributeSet) {
        this.f146913e = context.getResources().getDrawable(R.drawable.progress_spinner);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.spinDrawable});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                m229880a(obtainStyledAttributes.getIndex(i), obtainStyledAttributes);
            }
            obtainStyledAttributes.recycle();
        }
        setImageDrawable(this.f146913e);
        this.f146910b = 83;
        this.f146912d = new Runnable() {
            /* class com.ss.android.lark.widget.spin.SpinView.RunnableC591881 */

            public void run() {
                float f;
                SpinView.this.f146909a += 30.0f;
                SpinView spinView = SpinView.this;
                if (spinView.f146909a < 360.0f) {
                    f = SpinView.this.f146909a;
                } else {
                    f = SpinView.this.f146909a - 360.0f;
                }
                spinView.f146909a = f;
                SpinView.this.invalidate();
                if (SpinView.this.f146911c) {
                    SpinView spinView2 = SpinView.this;
                    spinView2.postDelayed(this, (long) spinView2.f146910b);
                }
            }
        };
    }

    public SpinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m229881a(context, attributeSet);
    }
}
