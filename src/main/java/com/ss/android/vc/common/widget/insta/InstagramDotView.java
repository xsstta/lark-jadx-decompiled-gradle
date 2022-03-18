package com.ss.android.vc.common.widget.insta;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.widget.insta.DotView;
import java.util.LinkedList;
import java.util.List;

public class InstagramDotView extends HorizontalScrollView {

    /* renamed from: a */
    private int f152379a;

    /* renamed from: b */
    private int f152380b;

    /* renamed from: c */
    private int f152381c;

    /* renamed from: d */
    private int f152382d;

    /* renamed from: e */
    private Paint f152383e = new Paint(1);

    /* renamed from: f */
    private Paint f152384f = new Paint(1);

    /* renamed from: g */
    private int f152385g = 0;

    /* renamed from: h */
    private List<DotView> f152386h = new LinkedList();

    /* renamed from: i */
    private LinearLayout f152387i;

    /* renamed from: j */
    private int f152388j = 0;

    /* renamed from: k */
    private int f152389k = 7;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    private int getDotWidth() {
        return this.f152379a + this.f152382d;
    }

    /* renamed from: f */
    private boolean m236589f() {
        if (this.f152388j < this.f152389k - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m236588e() {
        if (CollectionUtils.isEmpty(this.f152386h) || this.f152386h.get(0).getState() != DotView.EnumC60866a.PLACEHOLDER) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m236587d() {
        DotView dotView = null;
        int i = -1;
        for (int i2 = 0; i2 < this.f152386h.size(); i2++) {
            DotView dotView2 = this.f152386h.get(i2);
            if (dotView2.getState() != DotView.EnumC60866a.PLACEHOLDER) {
                i++;
                if (i == this.f152385g) {
                    dotView2.setState(DotView.EnumC60866a.ACTIVE);
                    dotView2.mo208699a(this.f152383e, -1);
                    dotView = dotView2;
                } else {
                    dotView2.setState(DotView.EnumC60866a.INACTIVE);
                    dotView2.mo208699a(this.f152384f, -1);
                }
            }
        }
        m236584a(dotView);
    }

    /* renamed from: c */
    private void m236586c() {
        this.f152385g = 0;
        m236585b();
        requestLayout();
        C60700b.m235851b("InstagramDotView", "[recreate]", "width = " + getWidth() + ", height = " + getHeight());
        if (!m236588e() || getWidth() != 0) {
            m236590g();
        } else {
            post(new Runnable() {
                /* class com.ss.android.vc.common.widget.insta.$$Lambda$InstagramDotView$bdHFc_e_aBPkVjwKaj0wqVg6hC4 */

                public final void run() {
                    InstagramDotView.lambda$bdHFc_e_aBPkVjwKaj0wqVg6hC4(InstagramDotView.this);
                }
            });
        }
    }

    /* renamed from: b */
    private void m236585b() {
        this.f152386h.clear();
        int i = 0;
        if (m236589f()) {
            while (i < this.f152388j) {
                DotView dotView = new DotView(getContext());
                dotView.setState(DotView.EnumC60866a.ACTIVE);
                this.f152386h.add(dotView);
                i++;
            }
        } else {
            for (int i2 = 0; i2 < 2; i2++) {
                DotView dotView2 = new DotView(getContext());
                dotView2.setState(DotView.EnumC60866a.PLACEHOLDER);
                this.f152386h.add(dotView2);
            }
            for (int i3 = 0; i3 < this.f152388j; i3++) {
                DotView dotView3 = new DotView(getContext());
                dotView3.setState(DotView.EnumC60866a.ACTIVE);
                this.f152386h.add(dotView3);
            }
            while (i < 2) {
                DotView dotView4 = new DotView(getContext());
                dotView4.setState(DotView.EnumC60866a.PLACEHOLDER);
                this.f152386h.add(dotView4);
                i++;
            }
        }
        this.f152387i.removeAllViews();
        for (DotView dotView5 : this.f152386h) {
            int i4 = this.f152379a;
            this.f152387i.addView(dotView5, new LinearLayout.LayoutParams(this.f152382d + i4, i4));
            dotView5.mo208699a(this.f152383e, this.f152379a / 2);
        }
        m236587d();
    }

    /* renamed from: a */
    public void m236590g() {
        Paint paint;
        if (m236588e()) {
            for (int i = 0; i < this.f152386h.size(); i++) {
                DotView dotView = this.f152386h.get(i);
                if (dotView.getState() != DotView.EnumC60866a.PLACEHOLDER) {
                    if (dotView.getState() == DotView.EnumC60866a.ACTIVE) {
                        paint = this.f152383e;
                    } else {
                        paint = this.f152384f;
                    }
                    int i2 = i + 1;
                    if (getDotWidth() * i2 < getScrollX()) {
                        dotView.mo208699a(paint, 0);
                    }
                    if (getDotWidth() * i > getScrollX() + (this.f152389k * getDotWidth())) {
                        dotView.mo208699a(paint, 0);
                    }
                    float dotWidth = (float) getDotWidth();
                    float dotWidth2 = (float) ((i2 * getDotWidth()) - getScrollX());
                    if (dotWidth2 <= ((float) getDotWidth())) {
                        dotView.mo208699a(paint, (((int) (dotWidth2 / dotWidth)) * this.f152381c) / 2);
                    } else if (dotWidth2 <= ((float) (getDotWidth() * 2))) {
                        dotView.mo208699a(paint, ((int) ((((dotWidth2 - ((float) getDotWidth())) / ((float) getDotWidth())) * ((float) (this.f152380b - this.f152381c))) + ((float) this.f152381c))) / 2);
                    } else if (dotWidth2 <= ((float) (getDotWidth() * 3))) {
                        dotView.mo208699a(paint, ((int) ((((dotWidth2 - ((float) (getDotWidth() * 2))) / ((float) getDotWidth())) * ((float) (this.f152379a - this.f152380b))) + ((float) this.f152380b))) / 2);
                    } else if (dotWidth2 > ((float) (getDotWidth() * 3)) && dotWidth2 < ((float) (getDotWidth() * 5))) {
                        dotView.mo208699a(paint, this.f152379a / 2);
                    } else if (dotWidth2 >= ((float) (getDotWidth() * 5)) && dotWidth2 < ((float) (getDotWidth() * 6))) {
                        dotView.mo208699a(paint, ((int) ((((dotWidth2 - ((float) (getDotWidth() * 5))) / ((float) getDotWidth())) * ((float) (this.f152380b - this.f152379a))) + ((float) this.f152379a))) / 2);
                    } else if (dotWidth2 < ((float) (getDotWidth() * 6)) || dotWidth2 >= ((float) (getDotWidth() * 7))) {
                        dotView.mo208699a(paint, ((int) (((float) this.f152381c) - (((dotWidth2 - ((float) (getDotWidth() * 7))) / ((float) getDotWidth())) * ((float) this.f152381c)))) / 2);
                    } else {
                        dotView.mo208699a(paint, ((int) ((((dotWidth2 - ((float) (getDotWidth() * 6))) / ((float) getDotWidth())) * ((float) (this.f152381c - this.f152380b))) + ((float) this.f152380b))) / 2);
                    }
                }
            }
        }
    }

    public void setActiveDotSize(int i) {
        this.f152379a = i;
        m236586c();
    }

    public void setVisibleDotCounts(int i) {
        this.f152389k = i;
        if (this.f152388j != 0) {
            m236586c();
        }
    }

    /* renamed from: a */
    public boolean mo208704a(int i) {
        int i2 = 0;
        if (i == this.f152388j) {
            return false;
        }
        if (i <= 1) {
            i2 = 8;
        }
        setVisibility(i2);
        this.f152388j = i;
        m236586c();
        return true;
    }

    public InstagramDotView(Context context) {
        super(context);
        m236583a(context, null);
    }

    /* renamed from: b */
    public void mo208705b(int i) {
        if (i != this.f152385g && i >= 0 && i <= this.f152388j - 1) {
            C60700b.m235851b("InstagramDotView", "[onPageChange]", "New Page: " + i);
            this.f152385g = i;
            m236587d();
        }
    }

    /* renamed from: a */
    private void m236584a(DotView dotView) {
        if (dotView != null && m236588e()) {
            int indexOf = this.f152386h.indexOf(dotView);
            int right = dotView.getRight() - getScrollX();
            int dotWidth = getDotWidth();
            int i = this.f152389k;
            if (right > dotWidth * (i - 2)) {
                smoothScrollTo(((indexOf + 1) - (i - 2)) * getDotWidth(), 0);
            } else if (dotView.getLeft() - getScrollX() < getDotWidth() * 2) {
                smoothScrollTo((indexOf - 2) * getDotWidth(), 0);
            }
        }
    }

    public InstagramDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236583a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (m236589f()) {
            i4 = getDotWidth();
            i3 = this.f152388j;
        } else {
            i4 = getDotWidth();
            i3 = this.f152389k;
        }
        int i5 = i4 * i3;
        int i6 = this.f152379a;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i5 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i5 = Math.min(i5, size);
        }
        if (mode2 == 1073741824) {
            i6 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            i6 = Math.min(i6, size2);
        }
        setMeasuredDimension(i5, i6);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, mode), View.MeasureSpec.makeMeasureSpec(i6, mode2));
    }

    /* renamed from: a */
    private void m236583a(Context context, AttributeSet attributeSet) {
        Resources resources = getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f152387i = linearLayout;
        linearLayout.setOrientation(0);
        new FrameLayout.LayoutParams(-2, -2);
        addView(this.f152387i);
        setHorizontalScrollBarEnabled(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.dot_activeColor, R.attr.dot_activeSize, R.attr.dot_inactiveColor, R.attr.dot_margin, R.attr.dot_mediumSize, R.attr.dot_smallSize, R.attr.dots_visible});
            this.f152383e.setStyle(Paint.Style.FILL);
            this.f152383e.setColor(obtainStyledAttributes.getColor(0, resources.getColor(R.color.ud_R700)));
            this.f152384f.setStyle(Paint.Style.FILL);
            this.f152384f.setColor(obtainStyledAttributes.getColor(2, resources.getColor(R.color.vc_static_black_30)));
            this.f152379a = obtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(R.dimen.dot_active_size));
            this.f152380b = obtainStyledAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.dot_medium_size));
            this.f152381c = obtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.dot_small_size));
            this.f152382d = obtainStyledAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(R.dimen.dot_margin));
            setVisibleDotCounts(obtainStyledAttributes.getInteger(6, 7));
            obtainStyledAttributes.recycle();
        }
        m236585b();
    }

    public InstagramDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236583a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m236590g();
    }
}
