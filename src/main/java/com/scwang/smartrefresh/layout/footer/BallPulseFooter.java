package com.scwang.smartrefresh.layout.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.C0768a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1237d.C27144b;

public class BallPulseFooter extends ViewGroup implements AbstractC27125d {

    /* renamed from: a */
    private BallPulseView f67468a;

    /* renamed from: b */
    private SpinnerStyle f67469b = SpinnerStyle.Translate;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: a */
    public void mo30336a(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: a */
    public void mo30337a(AbstractC27129h hVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: a */
    public boolean mo30338a(boolean z) {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: b */
    public void mo30339b(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        return this.f67469b;
    }

    public BallPulseFooter(Context context) {
        super(context);
        m98690a(context, (AttributeSet) null, 0);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public void setPrimaryColors(int... iArr) {
        if (iArr.length > 1) {
            this.f67468a.setNormalColor(iArr[1]);
            this.f67468a.setAnimatingColor(iArr[0]);
        } else if (iArr.length > 0) {
            this.f67468a.setNormalColor(C0768a.m3706a(-1711276033, iArr[0]));
            this.f67468a.setAnimatingColor(iArr[0]);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        this.f67468a.mo96517b();
        return 0;
    }

    public BallPulseFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m98690a(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f67468a.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE));
        setMeasuredDimension(resolveSize(this.f67468a.getMeasuredWidth(), i), resolveSize(this.f67468a.getMeasuredHeight(), i2));
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
        this.f67468a.mo96516a();
    }

    public BallPulseFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m98690a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m98690a(Context context, AttributeSet attributeSet, int i) {
        BallPulseView ballPulseView = new BallPulseView(context);
        this.f67468a = ballPulseView;
        addView(ballPulseView, -2, -2);
        setMinimumHeight(C27144b.m98678a(60.0f));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.srlAccentColor, R.attr.srlClassicsSpinnerStyle, R.attr.srlPrimaryColor});
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            this.f67468a.setNormalColor(color);
        }
        if (color2 != 0) {
            this.f67468a.setAnimatingColor(color2);
        }
        this.f67469b = SpinnerStyle.values()[obtainStyledAttributes.getInt(1, this.f67469b.ordinal())];
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f67468a.getMeasuredWidth();
        int measuredHeight2 = this.f67468a.getMeasuredHeight();
        int i5 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i6 = (measuredHeight / 2) - (measuredHeight2 / 2);
        this.f67468a.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
    }
}
