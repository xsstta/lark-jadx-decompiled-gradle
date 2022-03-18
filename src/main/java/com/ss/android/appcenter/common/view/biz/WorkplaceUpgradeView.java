package com.ss.android.appcenter.common.view.biz;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import com.larksuite.suite.R;

public class WorkplaceUpgradeView extends FrameLayout {

    /* renamed from: a */
    private Guideline f70762a;

    public WorkplaceUpgradeView(Context context) {
        this(context, null);
    }

    public WorkplaceUpgradeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m103335a(Context context, AttributeSet attributeSet) {
        this.f70762a = (Guideline) LayoutInflater.from(context).inflate(R.layout.workplace_common_upgrade_view, (ViewGroup) this, true).findViewById(R.id.start_line);
        this.f70762a.setGuidelinePercent(context.obtainStyledAttributes(attributeSet, new int[]{R.attr.workplaceTopMarginPercent}).getFloat(0, 0.3f));
    }

    public WorkplaceUpgradeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103335a(context, attributeSet);
    }
}
