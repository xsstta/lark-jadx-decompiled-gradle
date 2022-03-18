package com.ss.android.vc.meeting.module.record;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.framework.thread.HandlerC26164r;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;

public class RecordingAniView extends View {

    /* renamed from: a */
    public long f158414a;

    /* renamed from: b */
    private ValueAnimator f158415b;

    /* renamed from: c */
    private ArgbEvaluator f158416c;

    /* renamed from: d */
    private int f158417d;

    /* renamed from: e */
    private int f158418e;

    /* renamed from: f */
    private Paint f158419f;

    /* renamed from: g */
    private int f158420g;

    /* renamed from: h */
    private Handler f158421h;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo217346b();
        super.onDetachedFromWindow();
    }

    /* renamed from: b */
    public void mo217346b() {
        ValueAnimator valueAnimator = this.f158415b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f158415b = null;
        int i = this.f158417d;
        this.f158420g = i;
        this.f158419f.setColor(i);
        this.f158421h.removeMessages(16);
    }

    /* renamed from: a */
    public void mo217344a() {
        this.f158414a = 0;
        mo217346b();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
        this.f158415b = ofInt;
        ofInt.setRepeatCount(-1);
        this.f158415b.setDuration(700L);
        this.f158415b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.vc.meeting.module.record.$$Lambda$RecordingAniView$a4te_WLiT54Wr4M1SxmtJCexiak */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RecordingAniView.this.m246203a((RecordingAniView) valueAnimator);
            }
        });
        this.f158415b.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.vc.meeting.module.record.RecordingAniView.C628932 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
                RecordingAniView.this.f158414a++;
            }
        });
        this.f158415b.start();
    }

    public RecordingAniView(Context context) {
        this(context, null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            mo217344a();
        } else {
            mo217346b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246203a(ValueAnimator valueAnimator) {
        Message obtainMessage = this.f158421h.obtainMessage(16);
        obtainMessage.obj = Float.valueOf(valueAnimator.getAnimatedFraction());
        obtainMessage.sendToTarget();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        this.f158419f.setColor(this.f158420g);
        canvas.drawCircle(width, width, width, this.f158419f);
    }

    /* renamed from: a */
    public void mo217345a(float f) {
        if (this.f158414a % 2 == 0) {
            f = 1.0f - f;
        }
        this.f158420g = ((Integer) this.f158416c.evaluate(f, Integer.valueOf(this.f158417d), Integer.valueOf(this.f158418e))).intValue();
        postInvalidate();
    }

    public RecordingAniView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecordingAniView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f158421h = new HandlerC26164r(C60735ab.m236015d().getLooper(), new Handler.Callback() {
            /* class com.ss.android.vc.meeting.module.record.RecordingAniView.C628921 */

            public boolean handleMessage(Message message) {
                if (16 != message.what || !RecordingAniView.this.isAttachedToWindow()) {
                    return false;
                }
                RecordingAniView.this.mo217345a(((Float) message.obj).floatValue());
                return true;
            }
        });
        this.f158416c = new ArgbEvaluator();
        this.f158417d = C60773o.m236126d(R.color.function_danger_400);
        this.f158418e = C60773o.m236126d(R.color.function_danger_600);
        this.f158420g = this.f158417d;
        Paint paint = new Paint();
        this.f158419f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f158419f.setAntiAlias(true);
        this.f158419f.setColor(this.f158417d);
    }
}
