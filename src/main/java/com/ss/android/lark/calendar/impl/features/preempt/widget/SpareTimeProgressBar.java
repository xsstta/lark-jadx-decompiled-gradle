package com.ss.android.lark.calendar.impl.features.preempt.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnSpareTimeFinishListener;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010(\u001a\u00020$J\u0010\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J\u0018\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0014J\u001e\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u000201R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/widget/SpareTimeProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "alphaAngle", "", "circleCenter", "circlePaint", "Landroid/graphics/Paint;", "circleRadius", "circleWidth", "colorArray", "", "currentValue", "", "emptyColor", "endCirlcePaint", "mAnimator", "Landroid/animation/ValueAnimator;", "maxValue", "reminderMarginTop", "reminderTextColor", "reminderTextSize", "textBounds", "Landroid/graphics/Rect;", "textPaint", "timeTextMarginTop", "timeTextSize", "drawCircle", "", "canvas", "Landroid/graphics/Canvas;", "drawText", "init", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setDuration", "duration", "spareTime", "listener", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnSpareTimeFinishListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SpareTimeProgressBar extends View {

    /* renamed from: a */
    public long f82508a;

    /* renamed from: b */
    public long f82509b;

    /* renamed from: c */
    private float f82510c;

    /* renamed from: d */
    private int f82511d;

    /* renamed from: e */
    private int f82512e;

    /* renamed from: f */
    private int f82513f;

    /* renamed from: g */
    private int f82514g;

    /* renamed from: h */
    private int f82515h;

    /* renamed from: i */
    private int f82516i;

    /* renamed from: j */
    private int f82517j;

    /* renamed from: k */
    private int f82518k;

    /* renamed from: l */
    private int f82519l;

    /* renamed from: m */
    private Paint f82520m;

    /* renamed from: n */
    private Paint f82521n;

    /* renamed from: o */
    private Paint f82522o;

    /* renamed from: p */
    private Rect f82523p;

    /* renamed from: q */
    private ValueAnimator f82524q = new ValueAnimator();

    /* renamed from: r */
    private final int[] f82525r = {C32634ae.m125178a(R.color.ud_I400), C32634ae.m125178a(R.color.ud_B400)};

    /* renamed from: a */
    public final void mo117909a() {
        this.f82517j = UIUtils.dp2px(getContext(), 10.0f);
        this.f82512e = UIUtils.dp2px(getContext(), 59.5f);
        this.f82513f = UIUtils.dp2px(getContext(), 131.5f);
        this.f82511d = C32634ae.m125178a(R.color.ud_N50);
        this.f82515h = UIUtils.dp2px(getContext(), 50.0f);
        this.f82516i = UIUtils.dp2px(getContext(), 16.0f);
        this.f82514g = C32634ae.m125178a(R.color.text_caption);
        this.f82523p = new Rect();
        Paint paint = new Paint();
        this.f82520m = paint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endCirlcePaint");
        }
        paint.setAntiAlias(true);
        Paint paint2 = this.f82520m;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endCirlcePaint");
        }
        paint2.setDither(true);
        Paint paint3 = new Paint();
        this.f82521n = paint3;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = this.f82521n;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
        }
        paint4.setDither(true);
        Paint paint5 = this.f82521n;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
        }
        paint5.setStrokeWidth((float) this.f82517j);
        Paint paint6 = new Paint();
        this.f82522o = paint6;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        paint6.setAntiAlias(true);
        Paint paint7 = this.f82522o;
        if (paint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        paint7.setDither(true);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        int width = getWidth() / 2;
        this.f82518k = width;
        this.f82519l = width - (this.f82517j / 2);
        m123021a(canvas);
        m123022b(canvas);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.widget.SpareTimeProgressBar$a */
    static final class C32258a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ SpareTimeProgressBar f82526a;

        /* renamed from: b */
        final /* synthetic */ OnSpareTimeFinishListener f82527b;

        C32258a(SpareTimeProgressBar spareTimeProgressBar, OnSpareTimeFinishListener eVar) {
            this.f82526a = spareTimeProgressBar;
            this.f82527b = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SpareTimeProgressBar spareTimeProgressBar = this.f82526a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                spareTimeProgressBar.f82509b = (long) (((Integer) animatedValue).intValue() * 1000);
                this.f82526a.invalidate();
                if (this.f82526a.f82508a == this.f82526a.f82509b) {
                    this.f82527b.mo117853a();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpareTimeProgressBar(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo117909a();
    }

    /* renamed from: a */
    private final void m123021a(Canvas canvas) {
        if (this.f82508a != 0) {
            Paint paint = this.f82521n;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
            }
            paint.setShader(null);
            Paint paint2 = this.f82521n;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
            }
            paint2.setColor(this.f82511d);
            Paint paint3 = this.f82521n;
            if (paint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
            }
            paint3.setStyle(Paint.Style.STROKE);
            int i = this.f82518k;
            float f = (float) i;
            float f2 = (float) i;
            float f3 = (float) this.f82519l;
            Paint paint4 = this.f82521n;
            if (paint4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
            }
            canvas.drawCircle(f, f2, f3, paint4);
            int i2 = this.f82518k;
            int i3 = this.f82519l;
            RectF rectF = new RectF((float) (i2 - i3), (float) (i2 - i3), (float) (i2 + i3), (float) (i2 + i3));
            float f4 = (float) 2;
            LinearGradient linearGradient = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, ((float) getHeight()) / f4, (float) getWidth(), ((float) getHeight()) / f4, this.f82525r, (float[]) null, Shader.TileMode.MIRROR);
            Paint paint5 = this.f82521n;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
            }
            LinearGradient linearGradient2 = linearGradient;
            paint5.setShader(linearGradient2);
            Paint paint6 = this.f82521n;
            if (paint6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
            }
            paint6.setStrokeCap(Paint.Cap.BUTT);
            float f5 = ((((float) this.f82509b) * 360.0f) / ((float) this.f82508a)) * 1.0f;
            this.f82510c = f5;
            float f6 = (float) -90;
            float f7 = f6 + f5;
            float f8 = ((float) 360) - f5;
            Paint paint7 = this.f82521n;
            if (paint7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("circlePaint");
            }
            canvas.drawArc(rectF, f7, f8, false, paint7);
            if (this.f82509b != this.f82508a) {
                double d = (double) 180;
                float cos = ((float) this.f82518k) + (((float) this.f82519l) * ((float) Math.cos(((((double) (this.f82510c + f6)) + 0.1d) * 3.141592653589793d) / d)));
                float sin = ((float) this.f82518k) + (((float) this.f82519l) * ((float) Math.sin(((((double) (f6 + this.f82510c)) + 0.1d) * 3.141592653589793d) / d)));
                int i4 = this.f82517j;
                RectF rectF2 = new RectF(cos - (((float) i4) / f4), sin - (((float) i4) / f4), (((float) i4) / f4) + cos, sin + (((float) i4) / f4));
                Paint paint8 = this.f82520m;
                if (paint8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("endCirlcePaint");
                }
                paint8.setShader(linearGradient2);
                float f9 = this.f82510c - 270.0f;
                Paint paint9 = this.f82520m;
                if (paint9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("endCirlcePaint");
                }
                canvas.drawArc(rectF2, f9, 180.0f, true, paint9);
            }
        }
    }

    /* renamed from: b */
    private final void m123022b(Canvas canvas) {
        Object obj;
        Object obj2;
        String str;
        int i = (int) ((this.f82508a - this.f82509b) / ((long) 1000));
        Paint paint = this.f82522o;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        paint.setTextSize((float) this.f82515h);
        Paint paint2 = this.f82522o;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        paint2.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/DINPro-Bold.ttf"));
        StringBuilder sb = new StringBuilder();
        int i2 = i / 60;
        if (i2 < 10) {
            obj = "0" + i2;
        } else {
            obj = Integer.valueOf(i2);
        }
        sb.append(obj.toString());
        sb.append(":");
        int i3 = i % 60;
        if (i3 < 10) {
            obj2 = "0" + i3;
        } else {
            obj2 = Integer.valueOf(i3);
        }
        sb.append(obj2);
        String sb2 = sb.toString();
        if (i == 0) {
            Paint paint3 = this.f82522o;
            if (paint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textPaint");
            }
            paint3.setColor(Color.rgb(230, 232, 235));
        } else {
            Paint paint4 = this.f82522o;
            if (paint4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textPaint");
            }
            paint4.setColor(Color.rgb(33, 33, 33));
        }
        Paint paint5 = this.f82522o;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        paint5.setTextAlign(Paint.Align.CENTER);
        Paint paint6 = this.f82522o;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        paint6.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        Paint paint7 = this.f82522o;
        if (paint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        int length = sb2.length();
        Rect rect = this.f82523p;
        if (rect == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBounds");
        }
        paint7.getTextBounds(sb2, 0, length, rect);
        Paint paint8 = this.f82522o;
        if (paint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        int i4 = ((this.f82518k - this.f82519l) + this.f82512e) - paint8.getFontMetricsInt().top;
        float f = (float) this.f82518k;
        float f2 = (float) i4;
        Paint paint9 = this.f82522o;
        if (paint9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        canvas.drawText(sb2, f, f2, paint9);
        Paint paint10 = this.f82522o;
        if (paint10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        paint10.setTextSize((float) this.f82516i);
        Paint paint11 = this.f82522o;
        if (paint11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        paint11.setColor(this.f82514g);
        Paint paint12 = this.f82522o;
        if (paint12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        paint12.setTypeface(Typeface.DEFAULT);
        if (i == 0) {
            str = C32634ae.m125182b(R.string.Calendar_Takeover_TipsToTakeTwo);
            Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getString(R.stri…r_Takeover_TipsToTakeTwo)");
        } else {
            str = C32634ae.m125182b(R.string.Calendar_Takeover_TipsToTake);
            Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getString(R.stri…ndar_Takeover_TipsToTake)");
        }
        Paint paint13 = this.f82522o;
        if (paint13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        int length2 = str.length();
        Rect rect2 = this.f82523p;
        if (rect2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBounds");
        }
        paint13.getTextBounds(str, 0, length2, rect2);
        Paint paint14 = this.f82522o;
        if (paint14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        int i5 = ((this.f82518k - this.f82519l) + this.f82513f) - paint14.getFontMetricsInt().top;
        float f3 = (float) this.f82518k;
        float f4 = (float) i5;
        Paint paint15 = this.f82522o;
        if (paint15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        canvas.drawText(str, f3, f4, paint15);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int dp2px = UIUtils.dp2px(getContext(), 240.0f);
        setMeasuredDimension(dp2px, dp2px);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpareTimeProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        mo117909a();
    }

    /* renamed from: a */
    public final void mo117910a(long j, long j2, OnSpareTimeFinishListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        if (j2 != 0) {
            eVar.mo117854b();
        }
        this.f82508a = j;
        long j3 = j - j2;
        ValueAnimator valueAnimator = this.f82524q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f82524q.pause();
        }
        long j4 = (long) 1000;
        ValueAnimator ofInt = ValueAnimator.ofInt((int) (j3 / j4), (int) (this.f82508a / j4));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "ValueAnimator.ofInt((cur…maxValue / 1000).toInt())");
        this.f82524q = ofInt;
        ofInt.addUpdateListener(new C32258a(this, eVar));
        this.f82524q.setInterpolator(new LinearInterpolator());
        this.f82524q.setDuration(j2);
        this.f82524q.start();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpareTimeProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        mo117909a();
    }
}
