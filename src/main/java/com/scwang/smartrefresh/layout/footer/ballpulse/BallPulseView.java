package com.scwang.smartrefresh.layout.footer.ballpulse;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.scwang.smartrefresh.layout.p1237d.C27144b;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BallPulseView extends View {

    /* renamed from: a */
    public float[] f67490a;

    /* renamed from: b */
    private Paint f67491b;

    /* renamed from: c */
    private int f67492c;

    /* renamed from: d */
    private int f67493d;

    /* renamed from: e */
    private float f67494e;

    /* renamed from: f */
    private boolean f67495f;

    /* renamed from: g */
    private ArrayList<ValueAnimator> f67496g;

    /* renamed from: h */
    private Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f67497h;

    /* renamed from: c */
    private boolean m98719c() {
        return this.f67495f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f67496g != null) {
            for (int i = 0; i < this.f67496g.size(); i++) {
                this.f67496g.get(i).cancel();
            }
        }
    }

    /* renamed from: a */
    public void mo96516a() {
        if (this.f67496g == null) {
            m98720d();
        }
        if (this.f67496g != null && !m98719c()) {
            for (int i = 0; i < this.f67496g.size(); i++) {
                ValueAnimator valueAnimator = this.f67496g.get(i);
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f67497h.get(valueAnimator);
                if (animatorUpdateListener != null) {
                    valueAnimator.addUpdateListener(animatorUpdateListener);
                }
                valueAnimator.start();
            }
            this.f67495f = true;
            setIndicatorColor(this.f67493d);
        }
    }

    /* renamed from: b */
    public void mo96517b() {
        ArrayList<ValueAnimator> arrayList = this.f67496g;
        if (arrayList != null && this.f67495f) {
            this.f67495f = false;
            Iterator<ValueAnimator> it = arrayList.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                if (next != null) {
                    next.removeAllUpdateListeners();
                    next.end();
                }
            }
            this.f67490a = new float[]{1.0f, 1.0f, 1.0f};
        }
        setIndicatorColor(this.f67492c);
    }

    /* renamed from: d */
    private void m98720d() {
        this.f67496g = new ArrayList<>();
        int[] iArr = {SmEvents.EVENT_NW, 240, 360};
        for (final int i = 0; i < 3; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            ofFloat.setDuration(750L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay((long) iArr[i]);
            this.f67497h.put(ofFloat, new ValueAnimator.AnimatorUpdateListener() {
                /* class com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView.C271481 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallPulseView.this.f67490a[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallPulseView.this.postInvalidate();
                }
            });
            this.f67496g.add(ofFloat);
        }
    }

    public void setAnimatingColor(int i) {
        this.f67493d = i;
    }

    public void setNormalColor(int i) {
        this.f67492c = i;
    }

    public BallPulseView(Context context) {
        this(context, null);
    }

    public void setIndicatorColor(int i) {
        this.f67491b.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float min = (((float) Math.min(getWidth(), getHeight())) - (this.f67494e * 2.0f)) / 6.0f;
        float f = 2.0f * min;
        float width = ((float) (getWidth() / 2)) - (this.f67494e + f);
        float height = (float) (getHeight() / 2);
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f2 = (float) i;
            canvas.translate((f * f2) + width + (this.f67494e * f2), height);
            float[] fArr = this.f67490a;
            canvas.scale(fArr[i], fArr[i]);
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, min, this.f67491b);
            canvas.restore();
        }
    }

    public BallPulseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int a = C27144b.m98678a(50.0f);
        setMeasuredDimension(resolveSize(a, i), resolveSize(a, i2));
    }

    public BallPulseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67492c = -1118482;
        this.f67493d = -1615546;
        this.f67490a = new float[]{1.0f, 1.0f, 1.0f};
        this.f67497h = new HashMap();
        this.f67494e = (float) C27144b.m98678a(4.0f);
        Paint paint = new Paint();
        this.f67491b = paint;
        paint.setColor(-1);
        this.f67491b.setStyle(Paint.Style.FILL);
        this.f67491b.setAntiAlias(true);
    }
}
