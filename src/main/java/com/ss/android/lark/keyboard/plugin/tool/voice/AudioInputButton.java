package com.ss.android.lark.keyboard.plugin.tool.voice;

import android.animation.ValueAnimator;
import android.content.Context;
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
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public class AudioInputButton extends View {

    /* renamed from: A */
    private int f104408A;

    /* renamed from: B */
    private int f104409B;

    /* renamed from: C */
    private ValueAnimator f104410C;

    /* renamed from: a */
    public float f104411a;

    /* renamed from: b */
    public float f104412b;

    /* renamed from: c */
    public float f104413c;

    /* renamed from: d */
    public float f104414d;

    /* renamed from: e */
    public float f104415e;

    /* renamed from: f */
    public float f104416f;

    /* renamed from: g */
    public float f104417g;

    /* renamed from: h */
    private Paint f104418h;

    /* renamed from: i */
    private Paint f104419i;

    /* renamed from: j */
    private Paint f104420j;

    /* renamed from: k */
    private Paint f104421k;

    /* renamed from: l */
    private float f104422l;

    /* renamed from: m */
    private int f104423m;

    /* renamed from: n */
    private int f104424n;

    /* renamed from: o */
    private int f104425o;

    /* renamed from: p */
    private int f104426p;

    /* renamed from: q */
    private int f104427q;

    /* renamed from: r */
    private int f104428r;

    /* renamed from: s */
    private float f104429s;

    /* renamed from: t */
    private float f104430t;

    /* renamed from: u */
    private Drawable f104431u;

    /* renamed from: v */
    private Drawable f104432v;

    /* renamed from: w */
    private float f104433w;

    /* renamed from: x */
    private RectF f104434x;

    /* renamed from: y */
    private float f104435y;

    /* renamed from: z */
    private float f104436z;

    public float getDeleteScale() {
        return this.f104436z;
    }

    public RectF getInnerBound() {
        return this.f104434x;
    }

    public float getScale() {
        return this.f104435y;
    }

    public AudioInputButton(Context context) {
        this(context, null);
    }

    public void setDeleteScale(float f) {
        this.f104436z = f;
        invalidate();
    }

    public void setScale(float f) {
        this.f104435y = f;
        invalidate();
    }

    public void setAmplitudeAnimate(int i) {
        post(new Runnable(i) {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.$$Lambda$AudioInputButton$REPMfzYPHbfNQdNdHleItbgXs */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AudioInputButton.m270675lambda$REPMfzYPHbfNQdNdHleItbgXs(AudioInputButton.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m162607a(int i) {
        ValueAnimator valueAnimator = this.f104410C;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f104417g, (float) i);
            this.f104410C = ofFloat;
            ofFloat.setInterpolator(new AccelerateInterpolator());
            this.f104410C.setDuration(300L).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.AudioInputButton.C410241 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AudioInputButton.this.f104417g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    AudioInputButton audioInputButton = AudioInputButton.this;
                    audioInputButton.f104411a = ((audioInputButton.f104417g / 100.0f) * AudioInputButton.this.f104415e) + AudioInputButton.this.f104413c;
                    AudioInputButton audioInputButton2 = AudioInputButton.this;
                    audioInputButton2.f104412b = ((audioInputButton2.f104417g / 100.0f) * AudioInputButton.this.f104416f) + AudioInputButton.this.f104414d;
                    AudioInputButton.this.invalidate();
                }
            });
            this.f104410C.start();
            return;
        }
        valueAnimator.cancel();
        this.f104410C.setFloatValues(this.f104417g, (float) i);
        this.f104410C.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() - measuredWidth;
        float f = this.f104412b;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawCircle((float) measuredWidth, (float) measuredHeight, f, this.f104420j);
        }
        float f2 = this.f104411a;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawCircle((float) measuredWidth, (float) measuredHeight, f2, this.f104419i);
        }
        float f3 = (float) measuredWidth;
        float f4 = (float) measuredHeight;
        canvas.drawCircle(f3, f4, this.f104422l * this.f104435y, this.f104418h);
        RectF rectF = this.f104434x;
        float f5 = this.f104422l;
        rectF.set(f3 - f5, f4 - f5, f3 + f5, f5 + f4);
        Drawable drawable = this.f104431u;
        drawable.setBounds(measuredWidth - (drawable.getIntrinsicWidth() / 2), measuredHeight - (this.f104431u.getIntrinsicHeight() / 2), measuredWidth + (this.f104431u.getIntrinsicWidth() / 2), measuredHeight + (this.f104431u.getIntrinsicHeight() / 2));
        this.f104431u.draw(canvas);
        int i = (int) (f4 - this.f104429s);
        int i2 = (int) (f3 + this.f104430t);
        canvas.drawCircle((float) i2, (float) i, ((float) UIHelper.dp2px(22.5f)) * this.f104436z, this.f104421k);
        int intrinsicWidth = ((int) (((float) this.f104432v.getIntrinsicWidth()) * this.f104436z)) / 2;
        int intrinsicHeight = ((int) (((float) this.f104432v.getIntrinsicHeight()) * this.f104436z)) / 2;
        this.f104432v.setBounds(i2 - intrinsicWidth, i - intrinsicHeight, i2 + intrinsicWidth, i + intrinsicHeight);
        this.f104432v.draw(canvas);
    }

    public AudioInputButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo147885a(int i, int i2) {
        m162608a(this.f104408A, this.f104409B, i, i2);
        invalidate();
    }

    /* renamed from: a */
    public void mo147886a(boolean z, int i) {
        int i2;
        int i3;
        int i4;
        if (z) {
            Drawable drawable = this.f104432v;
            if (i == 1) {
                i2 = this.f104425o;
            } else {
                i2 = this.f104427q;
            }
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
            if (i == 1) {
                i3 = this.f104425o;
            } else {
                i3 = this.f104427q;
            }
            if (i == 1) {
                i4 = this.f104426p;
            } else {
                i4 = this.f104428r;
            }
            mo147885a(i3, i4);
            return;
        }
        this.f104432v.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.lkui_B500), PorterDuff.Mode.SRC_ATOP));
        mo147885a(this.f104423m, this.f104424n);
    }

    public AudioInputButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104418h = new Paint(1);
        this.f104419i = new Paint(1);
        this.f104420j = new Paint(1);
        this.f104421k = new Paint(1);
        float dp2px = (float) UIHelper.dp2px(60.0f);
        this.f104422l = dp2px;
        this.f104411a = BitmapDescriptorFactory.HUE_RED;
        this.f104412b = BitmapDescriptorFactory.HUE_RED;
        this.f104413c = dp2px + ((float) UIHelper.dp2px(25.0f));
        this.f104414d = this.f104422l + ((float) UIHelper.dp2px(50.0f));
        this.f104415e = (float) UIHelper.dp2px(50.0f);
        this.f104416f = (float) UIHelper.dp2px(100.0f);
        this.f104423m = Color.rgb(96, 207, 245);
        this.f104424n = Color.rgb(79, 172, 248);
        this.f104425o = Color.rgb(238, 136, (int) SmActions.ACTION_RINGING_EXIT);
        this.f104426p = Color.rgb(229, 99, 87);
        this.f104427q = Color.rgb(138, 236, (int) SmActions.ACTION_RINGING_EXIT);
        this.f104428r = Color.rgb(129, 199, 87);
        this.f104429s = (float) UIHelper.dp2px(200.5f);
        this.f104430t = BitmapDescriptorFactory.HUE_RED;
        this.f104433w = BitmapDescriptorFactory.HUE_RED;
        this.f104417g = BitmapDescriptorFactory.HUE_RED;
        this.f104434x = new RectF();
        this.f104435y = BitmapDescriptorFactory.HUE_RED;
        this.f104436z = BitmapDescriptorFactory.HUE_RED;
        this.f104421k.setColor(-1);
        this.f104421k.setShadowLayer(20.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, C25653b.m91893a(getResources().getColor(R.color.lkui_N900), 0.4f));
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_voice_outlined);
        this.f104431u = iconDrawable;
        iconDrawable.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.lkui_N00), PorterDuff.Mode.SRC_ATOP));
        Drawable iconDrawable2 = UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_delete_trash_outlined);
        this.f104432v = iconDrawable2;
        iconDrawable2.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.lkui_B500), PorterDuff.Mode.SRC_ATOP));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i / 2;
        this.f104408A = i5;
        int i6 = i2 - i5;
        this.f104409B = i6;
        m162608a(i5, i6, this.f104423m, this.f104424n);
    }

    /* renamed from: a */
    private void m162608a(int i, int i2, int i3, int i4) {
        float f = (float) i;
        float f2 = this.f104422l;
        float f3 = (float) i2;
        this.f104418h.setShader(new LinearGradient(f - f2, f3 + f2, f + f2, f3 - f2, i3, i4, Shader.TileMode.CLAMP));
        float f4 = this.f104411a;
        float f5 = this.f104415e;
        this.f104419i.setShader(new LinearGradient((f - f4) - f5, f3 + f4 + f5, f + f4 + f5, (f3 - f4) - f5, i3, i4, Shader.TileMode.CLAMP));
        this.f104419i.setAlpha(102);
        float f6 = this.f104412b;
        float f7 = this.f104416f;
        this.f104420j.setShader(new LinearGradient((f - f6) - f7, f3 + f6 + f7, f + f6 + f7, (f3 - f6) - f7, i3, i4, Shader.TileMode.CLAMP));
        this.f104420j.setAlpha(51);
    }
}
