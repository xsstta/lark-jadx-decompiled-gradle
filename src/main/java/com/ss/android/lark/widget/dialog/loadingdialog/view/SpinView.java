package com.ss.android.lark.widget.dialog.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.dialog.loadingdialog.AbstractC58434b;

public class SpinView extends ImageView implements AbstractC58434b {

    /* renamed from: a */
    public float f143857a;

    /* renamed from: b */
    public int f143858b;

    /* renamed from: c */
    public boolean f143859c;

    /* renamed from: d */
    private Runnable f143860d;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f143859c = false;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f143859c = true;
        post(this.f143860d);
    }

    /* renamed from: a */
    private void m226526a() {
        setImageResource(R.drawable.loading_dialog_spinner);
        this.f143858b = 83;
        this.f143860d = new Runnable() {
            /* class com.ss.android.lark.widget.dialog.loadingdialog.view.SpinView.RunnableC584351 */

            public void run() {
                float f;
                SpinView.this.f143857a += 30.0f;
                SpinView spinView = SpinView.this;
                if (spinView.f143857a < 360.0f) {
                    f = SpinView.this.f143857a;
                } else {
                    f = SpinView.this.f143857a - 360.0f;
                }
                spinView.f143857a = f;
                SpinView.this.invalidate();
                if (SpinView.this.f143859c) {
                    SpinView spinView2 = SpinView.this;
                    spinView2.postDelayed(this, (long) spinView2.f143858b);
                }
            }
        };
    }

    public SpinView(Context context) {
        super(context);
        m226526a();
    }

    @Override // com.ss.android.lark.widget.dialog.loadingdialog.AbstractC58434b
    public void setAnimationSpeed(float f) {
        this.f143858b = (int) (83.0f / f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.rotate(this.f143857a, (float) (getWidth() / 2), (float) (getHeight() / 2));
        super.onDraw(canvas);
    }

    public SpinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226526a();
    }
}
