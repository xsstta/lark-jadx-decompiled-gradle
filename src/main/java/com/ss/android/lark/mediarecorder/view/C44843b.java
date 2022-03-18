package com.ss.android.lark.mediarecorder.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mediarecorder.p2243a.AbstractC44772a;
import com.ss.android.lark.mediarecorder.p2245c.C44790c;
import com.ss.android.lark.mediarecorder.p2245c.C44796g;
import com.ss.android.lark.mediarecorder.p2245c.C44801j;

/* renamed from: com.ss.android.lark.mediarecorder.view.b */
public class C44843b extends View {

    /* renamed from: A */
    private float f113570A;

    /* renamed from: B */
    private boolean f113571B;

    /* renamed from: a */
    public int f113572a;

    /* renamed from: b */
    public float f113573b;

    /* renamed from: c */
    public int f113574c;

    /* renamed from: d */
    public int f113575d;

    /* renamed from: e */
    public float f113576e;

    /* renamed from: f */
    public float f113577f;

    /* renamed from: g */
    public float f113578g;

    /* renamed from: h */
    public float f113579h;

    /* renamed from: i */
    public RectF f113580i;

    /* renamed from: j */
    public AbstractC44772a f113581j;

    /* renamed from: k */
    public CountDownTimerC44850b f113582k;

    /* renamed from: l */
    public boolean f113583l = true;

    /* renamed from: m */
    private int f113584m;

    /* renamed from: n */
    private int f113585n = -1;

    /* renamed from: o */
    private int f113586o = -16776961;

    /* renamed from: p */
    private int f113587p = -7829368;

    /* renamed from: q */
    private int f113588q = -1;

    /* renamed from: r */
    private float f113589r;

    /* renamed from: s */
    private Paint f113590s;

    /* renamed from: t */
    private float f113591t;

    /* renamed from: u */
    private int f113592u;

    /* renamed from: v */
    private float f113593v;

    /* renamed from: w */
    private int f113594w;

    /* renamed from: x */
    private int f113595x;

    /* renamed from: y */
    private int f113596y;

    /* renamed from: z */
    private RunnableC44849a f113597z;

    /* renamed from: b */
    public void mo158680b() {
        this.f113572a = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mediarecorder.view.b$b */
    public class CountDownTimerC44850b extends CountDownTimer {
        public void onFinish() {
            C44843b.this.mo158679a(0L);
            C44843b.this.mo158677a();
        }

        public void onTick(long j) {
            C44843b.this.mo158679a(j);
        }

        CountDownTimerC44850b(long j, long j2) {
            super(j, j2);
        }
    }

    /* renamed from: e */
    private void m177772e() {
        this.f113572a = 5;
        this.f113593v = BitmapDescriptorFactory.HUE_RED;
        invalidate();
        mo158678a(this.f113578g, this.f113591t, this.f113579h, (float) this.f113575d);
    }

    /* renamed from: a */
    public void mo158677a() {
        AbstractC44772a aVar = this.f113581j;
        if (aVar != null) {
            int i = this.f113596y;
            if (i < this.f113595x) {
                aVar.mo158512a((long) i);
            } else {
                aVar.mo158514b((long) i);
            }
        }
        m177772e();
    }

    /* renamed from: c */
    private void m177770c() {
        this.f113585n = C44801j.m177653a(getContext(), R.color.recorder_white_c1);
        this.f113586o = C44801j.m177653a(getContext(), R.color.recorder_blue_c1);
        this.f113587p = C44801j.m177653a(getContext(), R.color.recorder_white_c1);
        this.f113588q = C44801j.m177653a(getContext(), R.color.recorder_gray_c6);
    }

    /* renamed from: d */
    private void m177771d() {
        int i;
        this.f113583l = false;
        removeCallbacks(this.f113597z);
        int i2 = this.f113572a;
        if (i2 != 2) {
            if (i2 != 4) {
                m177772e();
                this.f113572a = 1;
                return;
            }
            this.f113582k.cancel();
            mo158677a();
        } else if (this.f113581j == null || !((i = this.f113584m) == 257 || i == 259)) {
            this.f113572a = 1;
        } else {
            m177769a(this.f113579h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mediarecorder.view.b$a */
    public class RunnableC44849a implements Runnable {
        public void run() {
            if (C44843b.this.f113583l) {
                C44843b.this.f113572a = 3;
                if (C44790c.m177624a() != 1) {
                    C44843b.this.f113572a = 1;
                    if (C44843b.this.f113581j != null) {
                        C44843b.this.f113581j.mo158515c();
                        return;
                    }
                }
                C44843b bVar = C44843b.this;
                bVar.mo158678a(bVar.f113578g, C44843b.this.f113578g + ((float) C44843b.this.f113574c), C44843b.this.f113579h, C44843b.this.f113579h - ((float) C44843b.this.f113575d));
            }
        }

        private RunnableC44849a() {
        }
    }

    public void setButtonFeatures(int i) {
        this.f113584m = i;
    }

    public void setCaptureLisenter(AbstractC44772a aVar) {
        this.f113581j = aVar;
    }

    public void setMinDuration(int i) {
        this.f113595x = i;
    }

    public void setDuration(int i) {
        this.f113594w = i;
        this.f113582k = new CountDownTimerC44850b((long) i, (long) (i / 360));
    }

    public C44843b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m177769a(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.5f * f, f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.mediarecorder.view.C44843b.C448441 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C44843b.this.f113579h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C44843b.this.invalidate();
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.mediarecorder.view.C44843b.C448452 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C44843b.this.f113581j.mo158510a();
                C44843b.this.f113572a = 5;
            }
        });
        ofFloat.setDuration(100L);
        ofFloat.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f113590s.setStrokeWidth(this.f113570A);
        this.f113590s.setStyle(Paint.Style.FILL);
        this.f113590s.setColor(this.f113587p);
        canvas.drawCircle(this.f113576e, this.f113577f, this.f113578g, this.f113590s);
        this.f113590s.setColor(this.f113588q);
        canvas.drawCircle(this.f113576e, this.f113577f, this.f113579h, this.f113590s);
        if (this.f113571B || this.f113572a == 4) {
            this.f113590s.setColor(this.f113585n);
            this.f113590s.setStyle(Paint.Style.STROKE);
            this.f113590s.setStrokeWidth(this.f113573b);
            canvas.drawArc(this.f113580i, BitmapDescriptorFactory.HUE_RED, 360.0f, false, this.f113590s);
            this.f113590s.setColor(this.f113586o);
            this.f113590s.setStyle(Paint.Style.STROKE);
            this.f113590s.setStrokeWidth(this.f113573b);
            canvas.drawArc(this.f113580i, -90.0f, this.f113593v, false, this.f113590s);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (action == 0) {
            C44796g.m177638d("state = " + this.f113572a);
            if (motionEvent.getPointerCount() <= 1 && this.f113572a == 1) {
                this.f113589r = motionEvent.getY();
                this.f113572a = 2;
                int i2 = this.f113584m;
                if (i2 == 258 || i2 == 259) {
                    this.f113583l = true;
                    postDelayed(this.f113597z, 100);
                }
            }
        } else if (action == 1) {
            m177771d();
        } else if (action == 2 && this.f113581j != null && this.f113572a == 4 && ((i = this.f113584m) == 258 || i == 259)) {
            this.f113581j.mo158511a(this.f113589r - motionEvent.getY());
        }
        return true;
    }

    /* renamed from: a */
    public void mo158679a(long j) {
        int i = this.f113594w;
        this.f113596y = (int) (((long) i) - j);
        this.f113593v = 360.0f - ((((float) j) / ((float) i)) * 360.0f);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f113592u;
        int i4 = this.f113574c;
        setMeasuredDimension((i4 * 2) + i3, i3 + (i4 * 2));
    }

    public C44843b(Context context, int i) {
        super(context);
        m177770c();
        Paint paint = new Paint(1);
        this.f113590s = paint;
        this.f113570A = paint.getStrokeWidth();
        this.f113592u = i;
        float f = ((float) i) / 2.0f;
        this.f113591t = f;
        this.f113578g = f;
        this.f113579h = f - ((float) C44801j.m177654b(getContext(), 6));
        this.f113573b = (float) C44801j.m177654b(getContext(), 9);
        this.f113574c = (int) ((this.f113591t / 3.0f) * 2.0f);
        this.f113575d = (int) this.f113579h;
        this.f113593v = BitmapDescriptorFactory.HUE_RED;
        this.f113597z = new RunnableC44849a();
        this.f113572a = 1;
        this.f113584m = 259;
        this.f113594w = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        this.f113595x = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        int i2 = this.f113592u;
        int i3 = this.f113574c;
        this.f113576e = (float) (((i3 * 2) + i2) / 2);
        this.f113577f = (float) ((i2 + (i3 * 2)) / 2);
        float f2 = (this.f113591t + ((float) i3)) - (this.f113573b / 2.0f);
        float f3 = this.f113576e;
        float f4 = this.f113577f;
        this.f113580i = new RectF(f3 - f2, f4 - f2, f3 + f2, f4 + f2);
        int i4 = this.f113594w;
        this.f113582k = new CountDownTimerC44850b((long) i4, (long) (i4 / 360));
    }

    /* renamed from: a */
    public void mo158678a(float f, float f2, float f3, float f4) {
        if (f2 > f) {
            this.f113571B = true;
            this.f113587p = C44801j.m177653a(getContext(), R.color.recorder_gray_c6_alpha_50);
        } else {
            this.f113571B = false;
            this.f113587p = C44801j.m177653a(getContext(), R.color.recorder_white_c1);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f3, f4);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.mediarecorder.view.C44843b.C448463 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C44843b.this.f113578g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = C44843b.this.f113578g - (C44843b.this.f113573b / 2.0f);
                C44843b.this.f113580i.set(C44843b.this.f113576e - f, C44843b.this.f113577f - f, C44843b.this.f113576e + f, C44843b.this.f113577f + f);
                C44843b.this.invalidate();
            }
        });
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.mediarecorder.view.C44843b.C448474 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C44843b.this.f113579h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C44843b.this.invalidate();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.mediarecorder.view.C44843b.C448485 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (C44843b.this.f113572a == 3) {
                    if (C44843b.this.f113581j != null) {
                        C44843b.this.f113581j.mo158513b();
                    }
                    C44843b.this.f113572a = 4;
                    C44843b.this.f113582k.start();
                }
            }
        });
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(100L);
        animatorSet.start();
    }
}
