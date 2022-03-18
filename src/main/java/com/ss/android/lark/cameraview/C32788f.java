package com.ss.android.lark.cameraview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.cameraview.p1588b.AbstractC32752a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.cameraview.f */
public class C32788f extends View {

    /* renamed from: A */
    private RunnableC32796a f84114A;

    /* renamed from: B */
    private AnimatorSet f84115B;

    /* renamed from: C */
    private ValueAnimator f84116C;

    /* renamed from: D */
    private float f84117D;

    /* renamed from: E */
    private boolean f84118E;

    /* renamed from: a */
    public int f84119a;

    /* renamed from: b */
    public float f84120b;

    /* renamed from: c */
    public int f84121c;

    /* renamed from: d */
    public int f84122d;

    /* renamed from: e */
    public float f84123e;

    /* renamed from: f */
    public float f84124f;

    /* renamed from: g */
    public float f84125g;

    /* renamed from: h */
    public float f84126h;

    /* renamed from: i */
    public float f84127i;

    /* renamed from: j */
    public float f84128j;

    /* renamed from: k */
    public float f84129k;

    /* renamed from: l */
    public int f84130l;

    /* renamed from: m */
    public RectF f84131m;

    /* renamed from: n */
    public AbstractC32752a f84132n;

    /* renamed from: o */
    public boolean f84133o = true;

    /* renamed from: p */
    private int f84134p;

    /* renamed from: q */
    private int f84135q = -1;

    /* renamed from: r */
    private int f84136r = -16776961;

    /* renamed from: s */
    private int f84137s = -7829368;

    /* renamed from: t */
    private int f84138t = -1;

    /* renamed from: u */
    private float f84139u;

    /* renamed from: v */
    private Paint f84140v;

    /* renamed from: w */
    private float f84141w;

    /* renamed from: x */
    private int f84142x;

    /* renamed from: y */
    private int f84143y;

    /* renamed from: z */
    private int f84144z;

    /* renamed from: c */
    public void mo120764c() {
        this.f84119a = 1;
    }

    /* renamed from: g */
    private void m125840g() {
        this.f84119a = 1;
        mo120765d();
    }

    /* renamed from: a */
    public void mo120761a() {
        this.f84119a = 5;
        AbstractC32752a aVar = this.f84132n;
        if (aVar != null) {
            int i = this.f84130l;
            if (i < this.f84144z) {
                aVar.mo120628a((long) i);
            } else {
                aVar.mo120630b((long) i);
            }
        }
        this.f84130l = 0;
        m125840g();
    }

    /* renamed from: d */
    public void mo120765d() {
        this.f84125g = this.f84127i;
        this.f84126h = this.f84128j;
        this.f84118E = false;
        this.f84129k = BitmapDescriptorFactory.HUE_RED;
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.cameraview.f$a */
    public class RunnableC32796a implements Runnable {
        public void run() {
            if (C32788f.this.f84133o) {
                C32788f.this.f84119a = 3;
                C32788f.this.mo120765d();
                C32788f fVar = C32788f.this;
                fVar.mo120762a(fVar.f84127i, C32788f.this.f84127i + ((float) C32788f.this.f84121c), C32788f.this.f84128j, C32788f.this.f84128j - ((float) C32788f.this.f84122d));
            }
        }

        private RunnableC32796a() {
        }
    }

    /* renamed from: e */
    private void m125838e() {
        this.f84135q = UIUtils.getColor(getContext(), R.color.lkui_N00);
        this.f84136r = UIUtils.getColor(getContext(), R.color.lkui_B500);
        this.f84137s = UIUtils.getColor(getContext(), R.color.lkui_N00);
        this.f84138t = UIUtils.getColor(getContext(), R.color.lkui_N200);
    }

    /* renamed from: b */
    public void mo120763b() {
        if (this.f84119a == 4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 360.0f);
            this.f84116C = ofFloat;
            ofFloat.setDuration((long) this.f84143y);
            this.f84116C.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.cameraview.C32788f.C327946 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C32788f.this.f84130l = (int) valueAnimator.getCurrentPlayTime();
                    C32788f.this.f84129k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    C32788f.this.invalidate();
                }
            });
            this.f84116C.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.lark.cameraview.C32788f.C327957 */

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    C32788f.this.mo120761a();
                }
            });
            this.f84116C.start();
        }
    }

    /* renamed from: f */
    private void m125839f() {
        int i;
        this.f84133o = false;
        int i2 = this.f84119a;
        if (i2 == 2 || i2 == 3) {
            if (i2 == 2) {
                removeCallbacks(this.f84114A);
            } else {
                AnimatorSet animatorSet = this.f84115B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.f84115B.cancel();
                }
            }
            if (this.f84132n == null || !((i = this.f84134p) == 257 || i == 259)) {
                this.f84119a = 1;
                return;
            }
            setEnabled(false);
            mo120765d();
            m125837a(this.f84126h);
        } else if (i2 != 4) {
            m125840g();
            this.f84119a = 1;
        } else {
            setEnabled(false);
            this.f84116C.cancel();
            this.f84116C.removeAllListeners();
        }
    }

    public void setButtonFeatures(int i) {
        this.f84134p = i;
    }

    public void setCaptureLisenter(AbstractC32752a aVar) {
        this.f84132n = aVar;
    }

    public void setDuration(int i) {
        this.f84143y = i;
    }

    public void setMinDuration(int i) {
        this.f84144z = i;
    }

    public C32788f(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m125837a(float f) {
        Log.m165379d("startCaptureAnimation", "startCaptureAnimation func");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.5f * f, f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.cameraview.C32788f.C327891 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32788f.this.f84126h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C32788f.this.invalidate();
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.cameraview.C32788f.C327902 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                Log.m165379d("startCaptureAnimation", "state = " + C32788f.this.f84119a);
                C32788f.this.f84119a = 5;
                C32788f.this.f84132n.mo120627a();
                C32788f.this.f84119a = 1;
            }
        });
        ofFloat.setDuration(100L);
        ofFloat.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f84140v.setStrokeWidth(this.f84117D);
        this.f84140v.setStyle(Paint.Style.FILL);
        this.f84140v.setColor(this.f84137s);
        canvas.drawCircle(this.f84123e, this.f84124f, this.f84125g, this.f84140v);
        this.f84140v.setColor(this.f84138t);
        canvas.drawCircle(this.f84123e, this.f84124f, this.f84126h, this.f84140v);
        if (this.f84118E || this.f84119a == 4) {
            this.f84140v.setColor(this.f84135q);
            this.f84140v.setStyle(Paint.Style.STROKE);
            this.f84140v.setStrokeWidth(this.f84120b);
            canvas.drawArc(this.f84131m, BitmapDescriptorFactory.HUE_RED, 360.0f, false, this.f84140v);
            this.f84140v.setColor(this.f84136r);
            this.f84140v.setStyle(Paint.Style.STROKE);
            this.f84140v.setStrokeWidth(this.f84120b);
            canvas.drawArc(this.f84131m, -90.0f, this.f84129k, false, this.f84140v);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            Log.m165379d("CaptureButton", "state = " + this.f84119a);
            if (motionEvent.getPointerCount() <= 1 && this.f84119a == 1) {
                this.f84139u = motionEvent.getY();
                this.f84119a = 2;
                int i2 = this.f84134p;
                if (i2 == 258 || i2 == 259) {
                    this.f84133o = true;
                    postDelayed(this.f84114A, 100);
                }
            }
        } else if (action == 1) {
            m125839f();
        } else if (action == 2 && this.f84132n != null && this.f84119a == 4 && ((i = this.f84134p) == 258 || i == 259)) {
            motionEvent.getY();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f84142x;
        int i4 = this.f84121c;
        setMeasuredDimension((i4 * 2) + i3, i3 + (i4 * 2));
    }

    public C32788f(Context context, int i) {
        super(context);
        m125838e();
        Paint paint = new Paint(1);
        this.f84140v = paint;
        this.f84117D = paint.getStrokeWidth();
        this.f84142x = i;
        float f = ((float) i) / 2.0f;
        this.f84141w = f;
        this.f84125g = f;
        this.f84127i = f;
        float dp2px = f - ((float) UIUtils.dp2px(getContext(), 6.0f));
        this.f84126h = dp2px;
        this.f84128j = dp2px;
        this.f84120b = (float) UIUtils.dp2px(getContext(), 9.0f);
        this.f84121c = (int) ((this.f84141w / 3.0f) * 2.0f);
        this.f84122d = (int) this.f84126h;
        this.f84129k = BitmapDescriptorFactory.HUE_RED;
        this.f84114A = new RunnableC32796a();
        this.f84119a = 1;
        this.f84134p = 259;
        this.f84143y = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        this.f84144z = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        int i2 = this.f84142x;
        int i3 = this.f84121c;
        this.f84123e = (float) (((i3 * 2) + i2) / 2);
        this.f84124f = (float) ((i2 + (i3 * 2)) / 2);
        float f2 = (this.f84141w + ((float) i3)) - (this.f84120b / 2.0f);
        float f3 = this.f84123e;
        float f4 = this.f84124f;
        this.f84131m = new RectF(f3 - f2, f4 - f2, f3 + f2, f4 + f2);
    }

    /* renamed from: a */
    public void mo120762a(float f, float f2, float f3, float f4) {
        if (f2 > f) {
            this.f84118E = true;
            this.f84137s = C25653b.m91894a(getContext(), R.color.lkui_N200, 0.5f);
        } else {
            this.f84118E = false;
            this.f84137s = UIUtils.getColor(getContext(), R.color.lkui_N00);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f3, f4);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.cameraview.C32788f.C327913 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32788f.this.f84125g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = C32788f.this.f84125g - (C32788f.this.f84120b / 2.0f);
                C32788f.this.f84131m.set(C32788f.this.f84123e - f, C32788f.this.f84124f - f, C32788f.this.f84123e + f, C32788f.this.f84124f + f);
                C32788f.this.invalidate();
            }
        });
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.cameraview.C32788f.C327924 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32788f.this.f84126h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C32788f.this.invalidate();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f84115B = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.cameraview.C32788f.C327935 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (C32788f.this.f84119a == 3) {
                    if (C32788f.this.f84132n != null) {
                        C32788f.this.f84132n.mo120629b();
                    }
                    C32788f.this.f84119a = 4;
                    C32788f.this.mo120763b();
                }
            }
        });
        this.f84115B.playTogether(ofFloat, ofFloat2);
        this.f84115B.setDuration(200L);
        this.f84115B.start();
    }
}
