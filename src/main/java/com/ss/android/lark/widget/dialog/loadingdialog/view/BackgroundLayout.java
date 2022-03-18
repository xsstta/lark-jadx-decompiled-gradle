package com.ss.android.lark.widget.dialog.loadingdialog.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class BackgroundLayout extends LinearLayout {

    /* renamed from: a */
    private float f143843a;

    /* renamed from: b */
    private int f143844b;

    /* renamed from: a */
    private void m226522a() {
        m226523a(C25653b.m91893a(getContext().getResources().getColor(R.color.lkui_N900), 0.7f), this.f143843a);
    }

    public BackgroundLayout(Context context) {
        super(context);
        m226522a();
    }

    public void setBaseColor(int i) {
        this.f143844b = i;
        m226523a(i, this.f143843a);
    }

    public void setCornerRadius(float f) {
        float dp2px = (float) UIUtils.dp2px(getContext(), f);
        this.f143843a = dp2px;
        m226523a(this.f143844b, dp2px);
    }

    public BackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226522a();
    }

    /* renamed from: a */
    private void m226523a(int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        setBackground(gradientDrawable);
    }

    public BackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226522a();
    }
}
