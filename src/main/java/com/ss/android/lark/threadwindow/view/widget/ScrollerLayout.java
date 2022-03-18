package com.ss.android.lark.threadwindow.view.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.utils.UIHelper;

public class ScrollerLayout extends LinearLayout {

    /* renamed from: a */
    protected byte f139114a;

    /* renamed from: b */
    protected float f139115b;

    /* renamed from: c */
    public float f139116c;

    /* renamed from: d */
    public AbstractC56218a f139117d;

    /* renamed from: e */
    private int f139118e;

    /* renamed from: f */
    private int f139119f;

    /* renamed from: g */
    private View f139120g;

    /* renamed from: h */
    private View f139121h;

    /* renamed from: i */
    private float f139122i;

    /* renamed from: j */
    private float f139123j = 2.0f;

    /* renamed from: k */
    private AbstractC56220c f139124k;

    /* renamed from: l */
    private AbstractC56219b f139125l;

    /* renamed from: m */
    private boolean f139126m;

    /* renamed from: n */
    private ValueAnimator.AnimatorUpdateListener f139127n = new ValueAnimator.AnimatorUpdateListener() {
        /* class com.ss.android.lark.threadwindow.view.widget.ScrollerLayout.C562151 */

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollerLayout.this.f139116c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ScrollerLayout.this.mo191564a();
            if (ScrollerLayout.this.f139116c > BitmapDescriptorFactory.HUE_RED) {
                if (ScrollerLayout.this.f139117d != null) {
                    ScrollerLayout.this.f139117d.mo191583b(ScrollerLayout.this.f139116c);
                }
            } else if (ScrollerLayout.this.f139117d != null) {
                ScrollerLayout.this.f139117d.mo191582a(ScrollerLayout.this.f139116c);
            }
        }
    };

    /* renamed from: o */
    private Animator.AnimatorListener f139128o = new Animator.AnimatorListener() {
        /* class com.ss.android.lark.threadwindow.view.widget.ScrollerLayout.C562162 */

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ScrollerLayout.this.post(new Runnable() {
                /* class com.ss.android.lark.threadwindow.view.widget.ScrollerLayout.C562162.RunnableC562171 */

                public void run() {
                    ScrollerLayout.this.mo191566b();
                }
            });
        }
    };

    /* renamed from: com.ss.android.lark.threadwindow.view.widget.ScrollerLayout$a */
    public interface AbstractC56218a {
        /* renamed from: a */
        void mo191581a(byte b);

        /* renamed from: a */
        void mo191582a(float f);

        /* renamed from: b */
        void mo191583b(float f);
    }

    /* renamed from: com.ss.android.lark.threadwindow.view.widget.ScrollerLayout$b */
    public interface AbstractC56219b {
        /* renamed from: a */
        boolean mo191584a(float f);

        /* renamed from: b */
        boolean mo191585b(float f);
    }

    /* renamed from: com.ss.android.lark.threadwindow.view.widget.ScrollerLayout$c */
    public interface AbstractC56220c {
        /* renamed from: a */
        boolean mo191586a();

        /* renamed from: b */
        boolean mo191587b();
    }

    public byte getCurrentState() {
        return this.f139114a;
    }

    /* renamed from: d */
    private boolean m219228d() {
        AbstractC56220c cVar = this.f139124k;
        if (cVar == null) {
            return false;
        }
        return cVar.mo191587b();
    }

    /* renamed from: e */
    private boolean m219229e() {
        AbstractC56220c cVar = this.f139124k;
        if (cVar == null) {
            return false;
        }
        return cVar.mo191586a();
    }

    /* renamed from: a */
    public void mo191564a() {
        scrollTo(0, -((int) (this.f139116c - ((float) this.f139119f))));
    }

    /* renamed from: b */
    public void mo191566b() {
        float f = this.f139116c;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            mo191565a((byte) 0);
        } else if (f > BitmapDescriptorFactory.HUE_RED) {
            mo191565a((byte) 4);
        } else if (f < BitmapDescriptorFactory.HUE_RED) {
            mo191565a((byte) 3);
        }
    }

    /* renamed from: c */
    public void mo191567c() {
        float f = this.f139116c;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
            mo191565a((byte) 5);
            ofFloat.addUpdateListener(this.f139127n);
            ofFloat.addListener(this.f139128o);
            ofFloat.setDuration((long) UIHelper.px2dp((float) (((long) Math.abs(this.f139116c)) * 2)));
            ofFloat.start();
        }
    }

    public void setOnPullListener(AbstractC56218a aVar) {
        this.f139117d = aVar;
    }

    public void setPullStateProvider(AbstractC56219b bVar) {
        this.f139125l = bVar;
    }

    public void setScrollStateProvider(AbstractC56220c cVar) {
        this.f139124k = cVar;
    }

    /* renamed from: a */
    public void mo191565a(byte b) {
        if (this.f139114a != b) {
            this.f139114a = b;
            AbstractC56218a aVar = this.f139117d;
            if (aVar != null) {
                aVar.mo191581a(b);
            }
        }
    }

    /* renamed from: a */
    private void m219227a(int i) {
        if (this.f139116c < ((float) (DeviceUtils.getScreenHeight(getContext()) / 4))) {
            this.f139116c += (((float) i) - this.f139115b) / this.f139123j;
        } else {
            float f = (float) i;
            float f2 = this.f139115b;
            if (f - f2 < BitmapDescriptorFactory.HUE_RED) {
                this.f139116c += (f - f2) / this.f139123j;
            }
        }
        this.f139123j = (float) ((Math.tan((1.5707963267948966d / ((double) getMeasuredHeight())) * ((double) Math.abs(this.f139116c))) * 2.0d) + 2.0d);
        float f3 = this.f139116c;
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            AbstractC56218a aVar = this.f139117d;
            if (aVar != null) {
                aVar.mo191583b(f3);
            }
        } else {
            AbstractC56218a aVar2 = this.f139117d;
            if (aVar2 != null) {
                aVar2.mo191582a(f3);
            }
        }
        mo191564a();
        this.f139115b = (float) i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r1 != 7) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 440
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threadwindow.view.widget.ScrollerLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public ScrollerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f139118e = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            measureChild(childAt, i, i2);
            if (!(childAt == this.f139120g || childAt == this.f139121h)) {
                i3 += childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size, i3);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            childAt.layout(i, paddingTop, i3, childAt.getMeasuredHeight() + paddingTop);
            paddingTop += childAt.getMeasuredHeight();
        }
        View view = this.f139120g;
        if (view == null) {
            i5 = getPaddingTop();
        } else {
            i5 = view.getHeight() + getPaddingTop();
        }
        this.f139119f = i5;
        mo191564a();
    }
}
