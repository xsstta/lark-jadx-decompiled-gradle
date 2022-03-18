package com.tt.miniapp.video.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RotateImageView extends ImageView {

    /* renamed from: a */
    private boolean f169238a;

    /* renamed from: b */
    private long f169239b = -1;

    /* renamed from: c */
    private long f169240c = 1000;

    /* renamed from: d */
    private final Runnable f169241d = new Runnable() {
        /* class com.tt.miniapp.video.view.widget.RotateImageView.RunnableC671311 */

        public void run() {
            RotateImageView.this.invalidate();
        }
    };

    /* renamed from: a */
    public void mo233407a() {
        if (!this.f169238a) {
            this.f169238a = true;
            this.f169239b = -1;
            invalidate();
        }
    }

    /* renamed from: b */
    public void mo233408b() {
        this.f169238a = false;
        this.f169239b = -1;
        invalidate();
    }

    public void setDuration(long j) {
        this.f169240c = j;
        mo233408b();
        mo233407a();
    }

    public RotateImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f169238a || this.f169240c <= 0) {
            super.onDraw(canvas);
            return;
        }
        if (this.f169239b <= 0) {
            this.f169239b = System.currentTimeMillis();
        }
        canvas.save();
        canvas.rotate((((float) (System.currentTimeMillis() - this.f169239b)) / ((float) this.f169240c)) * 360.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
        postDelayed(this.f169241d, 20);
    }

    public RotateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
