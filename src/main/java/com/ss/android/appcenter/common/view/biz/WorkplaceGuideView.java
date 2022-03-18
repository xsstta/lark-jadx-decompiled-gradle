package com.ss.android.appcenter.common.view.biz;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appaddv2.AddAppActivity;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a;

public class WorkplaceGuideView extends FrameLayout {

    /* renamed from: a */
    private Guideline f70757a;

    /* renamed from: b */
    private TextView f70758b;

    /* renamed from: a */
    public void mo100452a() {
        View findViewById = findViewById(R.id.add_app);
        ((TextView) findViewById(R.id.text)).setTextColor(UDColorUtils.getColor(getContext(), R.color.text_title));
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new AbstractView$OnClickListenerC28143a() {
            /* class com.ss.android.appcenter.common.view.biz.WorkplaceGuideView.C282181 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a
            /* renamed from: a */
            public void mo98319a(View view) {
                AddAppActivity.m100674a(WorkplaceGuideView.this.getContext());
                C27710b.m101298g();
            }
        });
    }

    public WorkplaceGuideView(Context context) {
        this(context, null);
    }

    public void setText(int i) {
        this.f70758b.setText(i);
    }

    public void setText(CharSequence charSequence) {
        this.f70758b.setText(charSequence);
    }

    public WorkplaceGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m103331a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.workplace_common_guide_view, (ViewGroup) this, true);
        this.f70757a = (Guideline) inflate.findViewById(R.id.start_line);
        this.f70758b = (TextView) inflate.findViewById(R.id.text);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.workplaceTopMarginPercent});
        this.f70757a.setGuidelinePercent(obtainStyledAttributes.getFloat(0, 0.3f));
        obtainStyledAttributes.recycle();
    }

    public WorkplaceGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103331a(context, attributeSet);
    }
}
