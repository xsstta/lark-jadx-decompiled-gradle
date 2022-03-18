package com.ss.android.appcenter.common.view.biz;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.util.C28209p;

public class WorkplaceErrorView extends FrameLayout {

    /* renamed from: a */
    private Guideline f70756a;

    /* renamed from: a */
    public void mo100450a() {
        findViewById(R.id.common_error_wrapper).setVisibility(8);
        findViewById(R.id.specific_error_wrapper).setVisibility(0);
    }

    /* renamed from: b */
    public void mo100451b() {
        View findViewById = findViewById(R.id.common_error_wrapper);
        View findViewById2 = findViewById(R.id.specific_error_wrapper);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) findViewById2.getLayoutParams();
        layoutParams.f2817i = -1;
        layoutParams.f2816h = 0;
        layoutParams.f2819k = 0;
        layoutParams2.f2817i = -1;
        layoutParams2.f2816h = 0;
        layoutParams2.f2819k = 0;
    }

    public WorkplaceErrorView(Context context) {
        this(context, null);
    }

    public WorkplaceErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m103328a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.workplace_common_error_view, (ViewGroup) this, true);
        this.f70756a = (Guideline) inflate.findViewById(R.id.start_line);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.workplaceStatusSize, R.attr.workplaceStatusTextSize, R.attr.workplaceTopMarginPercent});
        this.f70756a.setGuidelinePercent(obtainStyledAttributes.getFloat(2, 0.3f));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, C28209p.m103293a(context, 100.0f));
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(1, C28209p.m103293a(context, 16.0f));
        ((TextView) inflate.findViewById(R.id.tv_common_error_desc)).setTextSize(0, dimensionPixelSize2);
        ((TextView) inflate.findViewById(R.id.tv_common_error_link)).setTextSize(0, dimensionPixelSize2);
        C28209p.m103300a(inflate.findViewById(R.id.img_common_error), dimensionPixelSize, dimensionPixelSize);
        C28209p.m103300a(inflate.findViewById(R.id.img_specific_error), dimensionPixelSize, dimensionPixelSize);
        obtainStyledAttributes.recycle();
    }

    public WorkplaceErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103328a(context, attributeSet);
    }
}
