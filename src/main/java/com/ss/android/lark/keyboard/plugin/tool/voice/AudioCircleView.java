package com.ss.android.lark.keyboard.plugin.tool.voice;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class AudioCircleView extends View {

    /* renamed from: a */
    private Paint f104383a;

    /* renamed from: b */
    private Paint f104384b;

    /* renamed from: c */
    private Paint f104385c;

    /* renamed from: d */
    private float f104386d;

    /* renamed from: e */
    private float f104387e;

    /* renamed from: f */
    private float f104388f;

    /* renamed from: g */
    private float f104389g;

    /* renamed from: h */
    private float f104390h;

    /* renamed from: i */
    private Drawable f104391i;

    /* renamed from: j */
    private float f104392j;

    /* renamed from: k */
    private int f104393k;

    /* renamed from: l */
    private int f104394l;

    /* renamed from: m */
    private RectF f104395m;

    /* renamed from: n */
    private int f104396n;

    /* renamed from: o */
    private int f104397o;

    /* renamed from: p */
    private float f104398p;

    /* renamed from: q */
    private ValueAnimator f104399q;

    public RectF getInnerBound() {
        return this.f104395m;
    }

    public float getScale() {
        return this.f104392j;
    }

    public AudioCircleView(Context context) {
        this(context, null);
    }

    public void setRadius(int i) {
        this.f104386d = (float) i;
        invalidate();
    }

    public void setScale(float f) {
        this.f104392j = f;
        invalidate();
    }

    public void setAmplitudeAnimate(int i) {
        post(new Runnable(i) {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.$$Lambda$AudioCircleView$MUmhZfFZzTlNMR5Iqz0vo1B9ok */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AudioCircleView.m270674lambda$MUmhZfFZzTlNMR5Iqz0vo1B9ok(AudioCircleView.this, this.f$1);
            }
        });
    }

    public void setPressed(boolean z) {
        int i;
        Paint paint = this.f104383a;
        Resources resources = getResources();
        if (z) {
            i = R.color.function_info_50;
        } else {
            i = R.color.lkui_transparent;
        }
        paint.setColorFilter(new PorterDuffColorFilter(resources.getColor(i), PorterDuff.Mode.SRC_ATOP));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m162603a(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f104398p = floatValue;
        float f = (floatValue / 100.0f) * this.f104389g;
        float f2 = this.f104386d;
        this.f104387e = f + f2;
        this.f104388f = ((floatValue / 100.0f) * this.f104390h) + f2;
        invalidate();
    }

    public void setIcon(int i) {
        Drawable drawable = UIUtils.getDrawable(getContext(), i);
        this.f104391i = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.static_white), PorterDuff.Mode.SRC_ATOP));
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m162601a(int i) {
        ValueAnimator valueAnimator = this.f104399q;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f104398p, (float) i);
            this.f104399q = ofFloat;
            ofFloat.setInterpolator(new AccelerateInterpolator());
            this.f104399q.setDuration(100L).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.$$Lambda$AudioCircleView$E001JEMJnM59GwmJebQ7dZ_qs */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AudioCircleView.m270673lambda$E001JEMJnM59GwmJebQ7dZ_qs(AudioCircleView.this, valueAnimator);
                }
            });
            this.f104399q.start();
            return;
        }
        valueAnimator.cancel();
        this.f104399q.setFloatValues(this.f104398p, (float) i);
        this.f104399q.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() - measuredWidth;
        float f = this.f104388f;
        if (f > this.f104386d) {
            canvas.drawCircle((float) measuredWidth, (float) measuredHeight, f, this.f104385c);
        }
        float f2 = this.f104387e;
        if (f2 > this.f104386d) {
            canvas.drawCircle((float) measuredWidth, (float) measuredHeight, f2, this.f104384b);
        }
        float f3 = (float) measuredWidth;
        float f4 = (float) measuredHeight;
        canvas.drawCircle(f3, f4, this.f104386d * this.f104392j, this.f104383a);
        Drawable drawable = this.f104391i;
        drawable.setBounds(measuredWidth - (drawable.getIntrinsicWidth() / 2), measuredHeight - (this.f104391i.getIntrinsicHeight() / 2), measuredWidth + (this.f104391i.getIntrinsicWidth() / 2), measuredHeight + (this.f104391i.getIntrinsicHeight() / 2));
        this.f104391i.draw(canvas);
        RectF rectF = this.f104395m;
        float f5 = this.f104386d;
        rectF.set(f3 - f5, f4 - f5, f3 + f5, f4 + f5);
    }

    public AudioCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo147862a(int i, int i2) {
        this.f104396n = i;
        this.f104397o = i2;
        m162602a(this.f104393k, this.f104394l, i, i2);
        invalidate();
    }

    public AudioCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104383a = new Paint(1);
        this.f104384b = new Paint(1);
        this.f104385c = new Paint(1);
        this.f104386d = (float) UIHelper.dp2px(65.0f);
        this.f104387e = BitmapDescriptorFactory.HUE_RED;
        this.f104388f = BitmapDescriptorFactory.HUE_RED;
        this.f104389g = (float) UIHelper.dp2px(40.0f);
        this.f104390h = (float) UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED);
        this.f104392j = 1.0f;
        this.f104395m = new RectF();
        this.f104396n = Color.rgb(51, 119, 255);
        this.f104397o = Color.rgb(82, 139, 255);
        this.f104398p = BitmapDescriptorFactory.HUE_RED;
        Drawable drawable = UIUtils.getDrawable(getContext(), R.drawable.ud_icon_voice_outlined);
        this.f104391i = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.static_white), PorterDuff.Mode.SRC_ATOP));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i / 2;
        this.f104393k = i5;
        int i6 = i2 - i5;
        this.f104394l = i6;
        m162602a(i5, i6, this.f104396n, this.f104397o);
    }

    /* renamed from: a */
    private void m162602a(int i, int i2, int i3, int i4) {
        float f = (float) i;
        float f2 = this.f104386d;
        float f3 = (float) i2;
        this.f104383a.setShader(new LinearGradient(f - f2, f3 + f2, f + f2, f3 - f2, i3, i4, Shader.TileMode.CLAMP));
        float f4 = this.f104387e;
        float f5 = this.f104389g;
        this.f104384b.setShader(new LinearGradient((f - f4) - f5, f3 + f4 + f5, f + f4 + f5, (f3 - f4) - f5, i3, i4, Shader.TileMode.CLAMP));
        this.f104384b.setAlpha(25);
        float f6 = this.f104388f;
        float f7 = this.f104390h;
        this.f104385c.setShader(new LinearGradient((f - f6) - f7, f3 + f6 + f7, f + f6 + f7, (f3 - f6) - f7, i3, i4, Shader.TileMode.CLAMP));
        this.f104385c.setAlpha(51);
    }
}
