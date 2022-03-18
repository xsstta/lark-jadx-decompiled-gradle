package com.ss.android.lark.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class EllipsizeFrameLayout extends FrameLayout {

    /* renamed from: a */
    private int f143377a;

    /* renamed from: b */
    private boolean f143378b;

    /* renamed from: c */
    private AbstractC58303a f143379c;

    /* renamed from: d */
    private double f143380d;

    /* renamed from: e */
    private int f143381e;

    /* renamed from: f */
    private int f143382f;

    /* renamed from: g */
    private int f143383g;

    /* renamed from: h */
    private int f143384h;

    /* renamed from: com.ss.android.lark.widget.EllipsizeFrameLayout$a */
    public interface AbstractC58303a {
        void onEllipsize(boolean z);
    }

    /* renamed from: a */
    private void m226071a() {
        boolean z = false;
        if (this.f143378b) {
            int measuredHeight = getMeasuredHeight();
            if (measuredHeight >= this.f143377a) {
                z = true;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(measuredHeight, this.f143377a));
        }
        AbstractC58303a aVar = this.f143379c;
        if (aVar != null) {
            aVar.onEllipsize(z);
        }
    }

    public void setEllipsizeListener(AbstractC58303a aVar) {
        this.f143379c = aVar;
    }

    public EllipsizeFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m226070a(double d) {
        return (int) (((double) (((this.f143381e - this.f143382f) - this.f143383g) - this.f143384h)) * d);
    }

    public void setEnableEllipsize(boolean z) {
        if (this.f143378b != z) {
            this.f143378b = z;
            requestLayout();
        }
    }

    public void setMaxHeightFactor(double d) {
        this.f143380d = d;
        this.f143377a = m226070a(d);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m226071a();
    }

    public EllipsizeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m226072a(Context context, AttributeSet attributeSet) {
        this.f143381e = DeviceUtils.getScreenHeight(getContext());
        this.f143383g = DeviceUtils.getStatusHeight(getContext());
        int a = m226070a(this.f143380d);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ellipsizeHeight, R.attr.enableEllipsize});
        this.f143377a = obtainStyledAttributes.getDimensionPixelSize(0, a);
        this.f143378b = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    public EllipsizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f143380d = 0.9d;
        this.f143382f = UIHelper.dp2px(44.0f);
        this.f143384h = UIHelper.dp2px(60.0f);
        m226072a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
