package com.ss.android.lark.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.ObservedScrollView;
import com.larksuite.framework.utils.DeviceUtils;

public class ZoomInScrollView extends ObservedScrollView {

    /* renamed from: a */
    public static int f143447a;

    /* renamed from: b */
    public static float f143448b;

    /* renamed from: c */
    public View f143449c;

    /* renamed from: d */
    public View f143450d;

    /* renamed from: e */
    private int f143451e;

    /* renamed from: f */
    private int f143452f;

    /* renamed from: g */
    private boolean f143453g;

    /* renamed from: h */
    private int f143454h;

    /* renamed from: i */
    private float f143455i;

    /* renamed from: j */
    private float f143456j;

    /* renamed from: k */
    private float f143457k;

    /* renamed from: l */
    private Context f143458l;

    /* renamed from: m */
    private AbstractC58313a f143459m;

    /* renamed from: com.ss.android.lark.widget.ZoomInScrollView$a */
    public interface AbstractC58313a {
    }

    /* renamed from: a */
    private void m226102a() {
        View view = this.f143449c;
        if (view != null && this.f143450d != null) {
            view.post(new Runnable() {
                /* class com.ss.android.lark.widget.ZoomInScrollView.RunnableC583111 */

                public void run() {
                    ZoomInScrollView.this.f143450d.setMinimumHeight(Math.round(((float) ((ZoomInScrollView.f143447a - ZoomInScrollView.this.f143449c.getMeasuredHeight()) - ((LinearLayout.LayoutParams) ZoomInScrollView.this.f143450d.getLayoutParams()).topMargin)) + (ZoomInScrollView.f143448b * 80.0f)));
                }
            });
        }
    }

    /* renamed from: b */
    private void m226103b() {
        float measuredWidth = (float) (this.f143449c.getMeasuredWidth() - this.f143451e);
        ValueAnimator duration = ObjectAnimator.ofFloat(measuredWidth, 0.0f).setDuration((long) (measuredWidth * this.f143457k));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.widget.ZoomInScrollView.C583122 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ZoomInScrollView.this.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        duration.start();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        setOverScrollMode(2);
        View childAt = getChildAt(0);
        if (childAt != null && (childAt instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) childAt;
            this.f143449c = viewGroup.getChildAt(0);
            this.f143450d = viewGroup.getChildAt(1);
            m226102a();
        }
    }

    public void setOnScrollListener(AbstractC58313a aVar) {
        this.f143459m = aVar;
    }

    public ZoomInScrollView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f143449c == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            this.f143453g = false;
            m226103b();
        } else if (action == 2) {
            if (!this.f143453g) {
                if (getScrollY() == 0) {
                    this.f143454h = (int) motionEvent.getY();
                }
            }
            if (motionEvent.getY() - ((float) this.f143454h) < BitmapDescriptorFactory.HUE_RED) {
                return super.onTouchEvent(motionEvent);
            }
            this.f143453g = true;
            setZoom((float) ((int) ((motionEvent.getY() - ((float) this.f143454h)) * this.f143455i)));
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setZoom(float f) {
        int i = this.f143451e;
        if (((float) (((double) (((float) i) + f)) / (((double) i) * 1.0d))) <= this.f143456j) {
            ViewGroup.LayoutParams layoutParams = this.f143449c.getLayoutParams();
            layoutParams.width = (int) (((float) this.f143451e) + f);
            int i2 = this.f143451e;
            layoutParams.height = (int) (((float) this.f143452f) * ((((float) i2) + f) / ((float) i2)));
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((-(layoutParams.width - this.f143451e)) / 2, 0, 0, 0);
            this.f143449c.setLayoutParams(layoutParams);
        }
    }

    public ZoomInScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZoomInScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f143455i = 0.4f;
        this.f143456j = 2.0f;
        this.f143457k = 0.4f;
        this.f143458l = context;
        if (f143448b <= BitmapDescriptorFactory.HUE_RED || f143447a <= 0) {
            f143447a = DeviceUtils.getScreenHeight(context);
            f143448b = DeviceUtils.getScreenDensity(this.f143458l);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View view = this.f143449c;
        if (view != null && this.f143450d != null) {
            this.f143451e = view.getMeasuredWidth();
            this.f143452f = this.f143449c.getMeasuredHeight();
        }
    }
}
