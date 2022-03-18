package com.bytedance.ee.bear.bizwidget.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.bizwidget.banner.config.IndicatorConfig;
import com.bytedance.ee.util.C13655e;
import com.larksuite.suite.R;

public class BaseIndicator extends View implements AbstractC4874a {

    /* renamed from: a */
    protected IndicatorConfig f14345a;

    /* renamed from: b */
    protected Paint f14346b;

    /* renamed from: c */
    protected float f14347c;

    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
    /* renamed from: b */
    public void mo18472b(int i) {
    }

    @Override // com.bytedance.ee.bear.bizwidget.banner.indicator.AbstractC4874a
    public IndicatorConfig getIndicatorConfig() {
        return this.f14345a;
    }

    @Override // com.bytedance.ee.bear.bizwidget.banner.indicator.AbstractC4874a
    public View getIndicatorView() {
        if (!this.f14345a.mo19115j()) {
            return this;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C13655e.m55411a(8));
        int i = this.f14345a.mo19112i();
        if (i == 0) {
            layoutParams.gravity = 8388691;
        } else if (i == 1) {
            layoutParams.gravity = 81;
        } else if (i == 2) {
            layoutParams.gravity = 8388693;
        }
        layoutParams.leftMargin = this.f14345a.mo19094a().f14335a;
        layoutParams.rightMargin = this.f14345a.mo19094a().f14337c;
        layoutParams.topMargin = this.f14345a.mo19094a().f14336b;
        layoutParams.bottomMargin = this.f14345a.mo19094a().f14338d;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        setLayoutParams(layoutParams2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setPadding(C13655e.m55411a(3), 0, C13655e.m55411a(3), 0);
        frameLayout.setBackground(getContext().getDrawable(R.drawable.indicator_bg));
        frameLayout.addView(this, layoutParams2);
        return frameLayout;
    }

    public BaseIndicator(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
    /* renamed from: a */
    public void mo18470a(int i) {
        this.f14345a.mo19105e(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!(getParent() instanceof FrameLayout)) {
            return;
        }
        if (this.f14345a.mo19098b() <= 1) {
            ((View) getParent()).setBackground(null);
        } else {
            ((View) getParent()).setBackground(getContext().getDrawable(R.drawable.indicator_bg));
        }
    }

    public BaseIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.bytedance.ee.bear.bizwidget.banner.indicator.AbstractC4874a
    /* renamed from: a */
    public void mo19118a(int i, int i2) {
        this.f14345a.mo19095a(i);
        this.f14345a.mo19105e(i2);
        requestLayout();
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
    /* renamed from: a */
    public void mo18471a(int i, float f, int i2) {
        this.f14347c = f;
        invalidate();
    }

    public BaseIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14345a = new IndicatorConfig();
        Paint paint = new Paint();
        this.f14346b = paint;
        paint.setAntiAlias(true);
        this.f14346b.setColor(this.f14345a.mo19100c());
    }
}
