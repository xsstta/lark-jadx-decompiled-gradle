package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class RoundProgressView extends View {

    /* renamed from: a */
    public int f65187a;

    /* renamed from: b */
    ValueAnimator f65188b;

    /* renamed from: c */
    private Paint f65189c;

    /* renamed from: d */
    private Paint f65190d;

    /* renamed from: e */
    private float f65191e;

    /* renamed from: f */
    private int f65192f;

    /* renamed from: g */
    private int f65193g;

    /* renamed from: h */
    private int f65194h;

    /* renamed from: i */
    private int f65195i;

    /* renamed from: j */
    private RectF f65196j;

    /* renamed from: k */
    private RectF f65197k;

    /* renamed from: a */
    public void mo93713a() {
        ValueAnimator valueAnimator = this.f65188b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* renamed from: b */
    public void mo93714b() {
        ValueAnimator valueAnimator = this.f65188b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f65188b.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f65188b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: c */
    private void m95669c() {
        this.f65189c = new Paint();
        Paint paint = new Paint();
        this.f65190d = paint;
        paint.setColor(-1);
        this.f65190d.setAntiAlias(true);
        this.f65189c.setAntiAlias(true);
        this.f65189c.setColor(Color.rgb((int) SmEvents.EVENT_TO, (int) SmEvents.EVENT_TO, (int) SmEvents.EVENT_TO));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        this.f65188b = ofInt;
        ofInt.setDuration(720L);
        this.f65188b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.lcodecore.tkrefreshlayout.header.bezierlayout.RoundProgressView.C264131 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RoundProgressView.this.f65187a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RoundProgressView.this.postInvalidate();
            }
        });
        this.f65188b.setRepeatCount(-1);
        this.f65188b.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public void setCir_x(int i) {
        this.f65195i = i;
    }

    public RoundProgressView(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / this.f65192f;
        this.f65189c.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.f65191e, this.f65189c);
        canvas.save();
        this.f65189c.setStyle(Paint.Style.STROKE);
        this.f65189c.setStrokeWidth(6.0f);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.f65191e + 15.0f, this.f65189c);
        canvas.restore();
        this.f65190d.setStyle(Paint.Style.FILL);
        if (this.f65196j == null) {
            this.f65196j = new RectF();
        }
        this.f65196j.set(((float) (getMeasuredWidth() / 2)) - this.f65191e, ((float) (getMeasuredHeight() / 2)) - this.f65191e, ((float) (getMeasuredWidth() / 2)) + this.f65191e, ((float) (getMeasuredHeight() / 2)) + this.f65191e);
        canvas.drawArc(this.f65196j, (float) this.f65193g, (float) this.f65187a, true, this.f65190d);
        canvas.save();
        this.f65190d.setStrokeWidth(6.0f);
        this.f65190d.setStyle(Paint.Style.STROKE);
        if (this.f65197k == null) {
            this.f65197k = new RectF();
        }
        this.f65197k.set((((float) (getMeasuredWidth() / 2)) - this.f65191e) - ((float) this.f65194h), (((float) (getMeasuredHeight() / 2)) - this.f65191e) - ((float) this.f65194h), ((float) (getMeasuredWidth() / 2)) + this.f65191e + ((float) this.f65194h), ((float) (getMeasuredHeight() / 2)) + this.f65191e + ((float) this.f65194h));
        canvas.drawArc(this.f65197k, (float) this.f65193g, (float) this.f65187a, false, this.f65190d);
        canvas.restore();
    }

    public RoundProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f65191e = 40.0f;
        this.f65192f = 7;
        this.f65193g = 270;
        this.f65194h = 15;
        m95669c();
    }
}
