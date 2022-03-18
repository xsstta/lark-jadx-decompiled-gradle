package com.scwang.smartrefresh.layout.p1235b;

import android.view.View;
import android.view.ViewGroup;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;

/* renamed from: com.scwang.smartrefresh.layout.b.c */
public class C27135c implements AbstractC27126e {

    /* renamed from: a */
    private View f67458a;

    /* renamed from: b */
    private SpinnerStyle f67459b;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
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

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(AbstractC27129h hVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void b_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public void setPrimaryColors(int... iArr) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this.f67458a;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        SpinnerStyle spinnerStyle = this.f67459b;
        if (spinnerStyle != null) {
            return spinnerStyle;
        }
        ViewGroup.LayoutParams layoutParams = this.f67458a.getLayoutParams();
        if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
            SpinnerStyle spinnerStyle2 = ((SmartRefreshLayout.LayoutParams) layoutParams).f67438b;
            this.f67459b = spinnerStyle2;
            if (spinnerStyle2 != null) {
                return spinnerStyle2;
            }
        }
        if (layoutParams == null || layoutParams.height != -1) {
            SpinnerStyle spinnerStyle3 = SpinnerStyle.Translate;
            this.f67459b = spinnerStyle3;
            return spinnerStyle3;
        }
        SpinnerStyle spinnerStyle4 = SpinnerStyle.Scale;
        this.f67459b = spinnerStyle4;
        return spinnerStyle4;
    }

    public C27135c(View view) {
        this.f67458a = view;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f67458a.getLayoutParams();
        if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
            gVar.mo96456a(((SmartRefreshLayout.LayoutParams) layoutParams).f67437a);
        }
    }
}
