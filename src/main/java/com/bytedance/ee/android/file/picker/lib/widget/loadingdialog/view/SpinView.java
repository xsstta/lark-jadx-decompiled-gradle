package com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.AbstractC4140b;
import com.larksuite.suite.R;

public class SpinView extends ImageView implements AbstractC4140b {

    /* renamed from: a */
    public float f12583a;

    /* renamed from: b */
    public int f12584b;

    /* renamed from: c */
    public boolean f12585c;

    /* renamed from: d */
    private Runnable f12586d;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f12585c = false;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12585c = true;
        post(this.f12586d);
    }

    /* renamed from: a */
    private void m17240a() {
        setImageResource(R.drawable.file_picker_loading_dialog_spinner);
        this.f12584b = 83;
        this.f12586d = new Runnable() {
            /* class com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view.SpinView.RunnableC41411 */

            public void run() {
                float f;
                SpinView.this.f12583a += 30.0f;
                SpinView spinView = SpinView.this;
                if (spinView.f12583a < 360.0f) {
                    f = SpinView.this.f12583a;
                } else {
                    f = SpinView.this.f12583a - 360.0f;
                }
                spinView.f12583a = f;
                SpinView.this.invalidate();
                if (SpinView.this.f12585c) {
                    SpinView spinView2 = SpinView.this;
                    spinView2.postDelayed(this, (long) spinView2.f12584b);
                }
            }
        };
    }

    public SpinView(Context context) {
        super(context);
        m17240a();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.AbstractC4140b
    public void setAnimationSpeed(float f) {
        this.f12584b = (int) (83.0f / f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.rotate(this.f12583a, (float) (getWidth() / 2), (float) (getHeight() / 2));
        super.onDraw(canvas);
    }

    public SpinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17240a();
    }
}
