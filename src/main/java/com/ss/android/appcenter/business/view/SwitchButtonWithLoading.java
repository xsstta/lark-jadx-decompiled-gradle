package com.ss.android.appcenter.business.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.SwitcherLoadingView;

public class SwitchButtonWithLoading extends ConstraintLayout {

    /* renamed from: a */
    public LKUISwitchButton f70394a;

    /* renamed from: b */
    public SwitcherLoadingView f70395b;

    /* renamed from: c */
    public boolean f70396c;

    /* renamed from: d */
    public AbstractC28107a f70397d;

    /* renamed from: e */
    private boolean f70398e;

    /* renamed from: com.ss.android.appcenter.business.view.SwitchButtonWithLoading$a */
    public interface AbstractC28107a {
        /* renamed from: a */
        void mo100050a(boolean z);
    }

    /* renamed from: a */
    public void mo100045a() {
        if (this.f70398e) {
            this.f70396c = false;
            this.f70395b.mo197496a();
        }
    }

    /* renamed from: b */
    private void m102783b() {
        LayoutInflater.from(getContext()).inflate(R.layout.appcenter_switchbutton_with_loading, this);
        m102784c();
    }

    /* renamed from: c */
    private void m102784c() {
        this.f70394a = (LKUISwitchButton) findViewById(R.id.switcher_button);
        this.f70395b = (SwitcherLoadingView) findViewById(R.id.switcher_loading);
        this.f70394a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.appcenter.business.view.SwitchButtonWithLoading.C281061 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SwitchButtonWithLoading.this.mo100045a();
                if (SwitchButtonWithLoading.this.f70397d != null) {
                    SwitchButtonWithLoading.this.f70397d.mo100050a(z);
                }
            }
        });
    }

    public void setOnSwitchListener(AbstractC28107a aVar) {
        this.f70397d = aVar;
    }

    public SwitchButtonWithLoading(Context context) {
        super(context);
        m102783b();
    }

    public void setChecked(boolean z) {
        this.f70394a.setChecked(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f70394a.setEnabled(z);
    }

    public SwitchButtonWithLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m102783b();
    }

    public SwitchButtonWithLoading(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m102783b();
    }
}
