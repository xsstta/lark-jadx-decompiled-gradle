package com.lcodecore.tkrefreshlayout.header;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26394b;
import com.lcodecore.tkrefreshlayout.AbstractC26398c;
import com.lcodecore.tkrefreshlayout.p1213b.C26395a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class GoogleDotView extends View implements AbstractC26394b {

    /* renamed from: a */
    float f65147a;

    /* renamed from: b */
    float f65148b;

    /* renamed from: c */
    boolean f65149c;

    /* renamed from: d */
    ValueAnimator f65150d;

    /* renamed from: e */
    ValueAnimator f65151e;

    /* renamed from: f */
    private Paint f65152f;

    /* renamed from: g */
    private float f65153g;

    /* renamed from: h */
    private int f65154h;

    /* renamed from: i */
    private int f65155i;

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f65150d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f65151e;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93668a() {
        this.f65149c = false;
        if (this.f65150d.isRunning()) {
            this.f65150d.cancel();
        }
        if (this.f65151e.isRunning()) {
            this.f65151e.cancel();
        }
        invalidate();
    }

    /* renamed from: b */
    private void m95644b() {
        this.f65153g = (float) C26395a.m95593a(getContext(), 4.0f);
        Paint paint = new Paint();
        this.f65152f = paint;
        paint.setAntiAlias(true);
        this.f65152f.setColor(Color.rgb((int) SmEvents.EVENT_TO, (int) SmEvents.EVENT_TO, (int) SmEvents.EVENT_TO));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f, 0.8f);
        this.f65150d = ofFloat;
        ofFloat.setDuration(800L);
        this.f65150d.setInterpolator(new DecelerateInterpolator());
        this.f65150d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.lcodecore.tkrefreshlayout.header.GoogleDotView.C264031 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                GoogleDotView.this.f65147a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                GoogleDotView.this.invalidate();
            }
        });
        this.f65150d.setRepeatCount(-1);
        this.f65150d.setRepeatMode(2);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f, 1.2f);
        this.f65151e = ofFloat2;
        ofFloat2.setDuration(800L);
        this.f65151e.setInterpolator(new DecelerateInterpolator());
        this.f65151e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.lcodecore.tkrefreshlayout.header.GoogleDotView.C264042 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                GoogleDotView.this.f65148b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        this.f65151e.setRepeatCount(-1);
        this.f65151e.setRepeatMode(2);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93671a(AbstractC26398c cVar) {
        cVar.mo93557a();
    }

    public void setCir_x(int i) {
        this.f65155i = i;
    }

    public GoogleDotView(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = (getMeasuredWidth() / this.f65154h) - 10;
        for (int i = 0; i < this.f65154h; i++) {
            if (this.f65149c) {
                if (i == 0) {
                    this.f65152f.setAlpha(LocationRequest.PRIORITY_NO_POWER);
                    this.f65152f.setColor(getResources().getColor(R.color.Yellow));
                    canvas.drawCircle((float) (((getMeasuredWidth() / 2) - (this.f65155i * 2)) - (((measuredWidth * 2) / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65153g * this.f65148b, this.f65152f);
                } else if (i == 1) {
                    this.f65152f.setAlpha(SmEvents.EVENT_UA_ERROR);
                    this.f65152f.setColor(getResources().getColor(R.color.Green));
                    canvas.drawCircle((float) (((getMeasuredWidth() / 2) - (this.f65155i * 1)) - ((measuredWidth / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65153g * this.f65148b, this.f65152f);
                } else if (i == 2) {
                    this.f65152f.setAlpha(255);
                    this.f65152f.setColor(getResources().getColor(R.color.Blue));
                    canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.f65153g * this.f65147a, this.f65152f);
                } else if (i == 3) {
                    this.f65152f.setAlpha(SmEvents.EVENT_UA_ERROR);
                    this.f65152f.setColor(getResources().getColor(R.color.Orange));
                    canvas.drawCircle((float) ((getMeasuredWidth() / 2) + (this.f65155i * 1) + ((measuredWidth / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65153g * this.f65148b, this.f65152f);
                } else if (i == 4) {
                    this.f65152f.setAlpha(LocationRequest.PRIORITY_NO_POWER);
                    this.f65152f.setColor(getResources().getColor(R.color.Yellow));
                    canvas.drawCircle((float) ((getMeasuredWidth() / 2) + (this.f65155i * 2) + (((measuredWidth * 2) / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65153g * this.f65148b, this.f65152f);
                }
            } else if (i == 0) {
                this.f65152f.setAlpha(LocationRequest.PRIORITY_NO_POWER);
                this.f65152f.setColor(getResources().getColor(R.color.Yellow));
                canvas.drawCircle((float) (((getMeasuredWidth() / 2) - (this.f65155i * 2)) - (((measuredWidth * 2) / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65153g, this.f65152f);
            } else if (i == 1) {
                this.f65152f.setAlpha(SmEvents.EVENT_UA_ERROR);
                this.f65152f.setColor(getResources().getColor(R.color.Green));
                canvas.drawCircle((float) (((getMeasuredWidth() / 2) - (this.f65155i * 1)) - ((measuredWidth / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65153g, this.f65152f);
            } else if (i == 2) {
                this.f65152f.setAlpha(255);
                this.f65152f.setColor(getResources().getColor(R.color.Blue));
                canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.f65153g, this.f65152f);
            } else if (i == 3) {
                this.f65152f.setAlpha(SmEvents.EVENT_UA_ERROR);
                this.f65152f.setColor(getResources().getColor(R.color.Orange));
                canvas.drawCircle((float) ((getMeasuredWidth() / 2) + (this.f65155i * 1) + ((measuredWidth / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65153g, this.f65152f);
            } else if (i == 4) {
                this.f65152f.setAlpha(LocationRequest.PRIORITY_NO_POWER);
                this.f65152f.setColor(getResources().getColor(R.color.Yellow));
                canvas.drawCircle((float) ((getMeasuredWidth() / 2) + (this.f65155i * 2) + (((measuredWidth * 2) / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65153g, this.f65152f);
            }
        }
    }

    public GoogleDotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93669a(float f, float f2) {
        this.f65149c = true;
        this.f65150d.start();
        this.f65151e.start();
    }

    public GoogleDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f65154h = 5;
        m95644b();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: b */
    public void mo93672b(float f, float f2, float f3) {
        float f4 = (f / 2.0f) + 1.0f;
        setScaleX(f4);
        setScaleY(f4);
        if (f < 1.0f) {
            this.f65149c = false;
            if (this.f65150d.isRunning()) {
                this.f65150d.cancel();
                invalidate();
            }
            if (this.f65151e.isRunning()) {
                this.f65151e.cancel();
            }
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93670a(float f, float f2, float f3) {
        float f4 = (f / 2.0f) + 1.0f;
        setScaleX(f4);
        setScaleY(f4);
        this.f65149c = false;
        if (this.f65150d.isRunning()) {
            this.f65150d.cancel();
            invalidate();
        }
        if (this.f65151e.isRunning()) {
            this.f65151e.cancel();
        }
    }
}
