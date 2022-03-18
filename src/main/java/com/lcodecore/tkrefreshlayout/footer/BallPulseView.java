package com.lcodecore.tkrefreshlayout.footer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lcodecore.tkrefreshlayout.AbstractC26376a;
import com.lcodecore.tkrefreshlayout.p1213b.C26395a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BallPulseView extends View implements AbstractC26376a {

    /* renamed from: a */
    public float[] f65138a;

    /* renamed from: b */
    private float f65139b;

    /* renamed from: c */
    private ArrayList<ValueAnimator> f65140c;

    /* renamed from: d */
    private Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f65141d;

    /* renamed from: e */
    private Paint f65142e;

    /* renamed from: f */
    private int f65143f;

    /* renamed from: g */
    private int f65144g;

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    public View getView() {
        return this;
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: a */
    public void mo93621a() {
        mo93675d();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: b */
    public void mo93624b() {
        mo93675d();
    }

    /* renamed from: e */
    private boolean m95630e() {
        Iterator<ValueAnimator> it = this.f65140c.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f65140c != null) {
            for (int i = 0; i < this.f65140c.size(); i++) {
                this.f65140c.get(i).cancel();
            }
        }
    }

    /* renamed from: c */
    public void mo93674c() {
        if (this.f65140c == null) {
            m95631f();
        }
        if (this.f65140c != null && !m95630e()) {
            for (int i = 0; i < this.f65140c.size(); i++) {
                ValueAnimator valueAnimator = this.f65140c.get(i);
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f65141d.get(valueAnimator);
                if (animatorUpdateListener != null) {
                    valueAnimator.addUpdateListener(animatorUpdateListener);
                }
                valueAnimator.start();
            }
            setIndicatorColor(this.f65144g);
        }
    }

    /* renamed from: d */
    public void mo93675d() {
        ArrayList<ValueAnimator> arrayList = this.f65140c;
        if (arrayList != null) {
            Iterator<ValueAnimator> it = arrayList.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                if (next != null && next.isStarted()) {
                    next.removeAllUpdateListeners();
                    next.end();
                }
            }
        }
        setIndicatorColor(this.f65143f);
    }

    /* renamed from: f */
    private void m95631f() {
        this.f65140c = new ArrayList<>();
        int[] iArr = {SmEvents.EVENT_NW, 240, 360};
        for (final int i = 0; i < 3; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            ofFloat.setDuration(750L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay((long) iArr[i]);
            this.f65141d.put(ofFloat, new ValueAnimator.AnimatorUpdateListener() {
                /* class com.lcodecore.tkrefreshlayout.footer.BallPulseView.C264021 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallPulseView.this.f65138a[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallPulseView.this.postInvalidate();
                }
            });
            this.f65140c.add(ofFloat);
        }
    }

    public void setAnimatingColor(int i) {
        this.f65144g = i;
    }

    public void setNormalColor(int i) {
        this.f65143f = i;
    }

    public BallPulseView(Context context) {
        this(context, null);
    }

    public void setIndicatorColor(int i) {
        this.f65142e.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float min = (((float) Math.min(getWidth(), getHeight())) - (this.f65139b * 2.0f)) / 6.0f;
        float f = 2.0f * min;
        float width = ((float) (getWidth() / 2)) - (this.f65139b + f);
        float height = (float) (getHeight() / 2);
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f2 = (float) i;
            canvas.translate((f * f2) + width + (this.f65139b * f2), height);
            float[] fArr = this.f65138a;
            canvas.scale(fArr[i], fArr[i]);
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, min, this.f65142e);
            canvas.restore();
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: a */
    public void mo93622a(float f, float f2) {
        mo93674c();
    }

    public BallPulseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: b */
    public void mo93625b(float f, float f2, float f3) {
        mo93675d();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: a */
    public void mo93623a(float f, float f2, float f3) {
        mo93675d();
    }

    public BallPulseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f65138a = new float[]{1.0f, 1.0f, 1.0f};
        this.f65141d = new HashMap();
        this.f65143f = -1118482;
        this.f65144g = -1615546;
        int a = C26395a.m95593a(context, 50.0f);
        setLayoutParams(new FrameLayout.LayoutParams(a, a, 17));
        this.f65139b = (float) C26395a.m95593a(context, 4.0f);
        Paint paint = new Paint();
        this.f65142e = paint;
        paint.setColor(-1);
        this.f65142e.setStyle(Paint.Style.FILL);
        this.f65142e.setAntiAlias(true);
    }
}
