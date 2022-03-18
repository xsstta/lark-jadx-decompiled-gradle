package com.ss.android.appcenter.common.view.biz;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public class WorkplaceLoadingView extends FrameLayout {

    /* renamed from: a */
    private LKUILottieAnimationView f70760a;

    /* renamed from: b */
    private Guideline f70761b;

    public LottieAnimationView getLottieAnimationView() {
        return this.f70760a;
    }

    public WorkplaceLoadingView(Context context) {
        this(context, null);
    }

    public WorkplaceLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m103334a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.workplace_common_loading_view, (ViewGroup) this, true);
        this.f70760a = (LKUILottieAnimationView) inflate.findViewById(R.id.lottie);
        this.f70761b = (Guideline) inflate.findViewById(R.id.start_line);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.workplaceLoadingResource, R.attr.workplaceStatusSize, R.attr.workplaceTopMarginPercent});
        this.f70761b.setGuidelinePercent(obtainStyledAttributes.getFloat(2, 0.3f));
        int a = C28209p.m103293a(context, (float) obtainStyledAttributes.getResourceId(1, SmActions.ACTION_RINGING_ENTRY));
        C28209p.m103300a(this.f70760a, a, a);
        obtainStyledAttributes.recycle();
    }

    public WorkplaceLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103334a(context, attributeSet);
    }
}
