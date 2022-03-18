package com.ss.android.lark.keyboard.plugin.tool.voice.legacy;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;

public class LarkRecorderCircle extends View {

    /* renamed from: a */
    public static final float f104539a = ((float) UIHelper.dp2px(13.5f));

    /* renamed from: d */
    private static final float f104540d = ((float) UIHelper.dp2px(28.5f));

    /* renamed from: e */
    private static final float f104541e = ((float) UIHelper.dp2px(2.0f));

    /* renamed from: b */
    public float f104542b;

    /* renamed from: c */
    public float f104543c;

    /* renamed from: f */
    private int f104544f;

    /* renamed from: g */
    private int f104545g;

    /* renamed from: h */
    private int f104546h;

    /* renamed from: i */
    private Paint f104547i;

    /* renamed from: j */
    private float f104548j;

    /* renamed from: k */
    private ValueAnimator f104549k;

    /* renamed from: l */
    private ValueAnimator f104550l;

    /* renamed from: c */
    private void m162792c() {
        this.f104544f = C57582a.m223616d(getContext(), R.color.function_info_400);
        this.f104542b = BitmapDescriptorFactory.HUE_RED;
        float f = f104539a;
        this.f104543c = f;
        this.f104548j = f + f104540d;
        Paint paint = new Paint();
        this.f104547i = paint;
        paint.setAntiAlias(true);
        this.f104547i.setStyle(Paint.Style.FILL);
        setLayerType(1, this.f104547i);
    }

    /* renamed from: b */
    public void mo147993b() {
        ValueAnimator valueAnimator = this.f104549k;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f104549k.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f104543c, f104539a);
        this.f104550l = ofFloat;
        ofFloat.setDuration(500L);
        this.f104550l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderCircle.C410542 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LarkRecorderCircle.this.f104542b += floatValue - LarkRecorderCircle.this.f104543c;
                LarkRecorderCircle.this.f104543c = floatValue;
                if (LarkRecorderCircle.this.f104542b < BitmapDescriptorFactory.HUE_RED) {
                    LarkRecorderCircle.this.f104542b = BitmapDescriptorFactory.HUE_RED;
                }
                LarkRecorderCircle.this.postInvalidate();
            }
        });
        this.f104550l.start();
    }

    /* renamed from: a */
    public void mo147992a() {
        ValueAnimator valueAnimator = this.f104550l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f104550l.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f104543c, this.f104548j);
        this.f104549k = ofFloat;
        ofFloat.setDuration(500L);
        this.f104549k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderCircle.C410531 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LarkRecorderCircle.this.f104542b += floatValue - LarkRecorderCircle.this.f104543c;
                LarkRecorderCircle.this.f104543c = floatValue;
                if (LarkRecorderCircle.this.f104542b > LarkRecorderCircle.f104539a) {
                    LarkRecorderCircle.this.f104542b = LarkRecorderCircle.f104539a;
                }
                LarkRecorderCircle.this.postInvalidate();
            }
        });
        this.f104549k.start();
    }

    public LarkRecorderCircle(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate((float) (this.f104545g / 2), (float) (this.f104546h / 2));
        this.f104547i.setShadowLayer(10.0f, 2.0f, 2.0f, C25653b.m91893a(UIHelper.getColor(R.color.lkui_N900), 0.07f));
        this.f104547i.setColor(-1);
        canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f104548j, this.f104547i);
        this.f104547i.setColor(this.f104544f);
        canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f104543c, this.f104547i);
        this.f104547i.setColor(-1);
        canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f104542b, this.f104547i);
        canvas.restore();
    }

    public LarkRecorderCircle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            size = (int) ((this.f104548j + f104541e) * 2.0f);
            size2 = size;
        }
        setMeasuredDimension(size, size2);
    }

    public LarkRecorderCircle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m162792c();
        m162791a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m162791a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inside_color, R.attr.inside_radius, R.attr.outside_color, R.attr.stroke_width}, i, 0);
        if (obtainStyledAttributes != null) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                obtainStyledAttributes.getIndex(i2);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f104545g = i;
        this.f104546h = i2;
    }
}
