package com.ss.android.lark.setting.page.v1.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.SwitcherLoadingView;

public class SwitchButtonWithLoading extends ConstraintLayout {

    /* renamed from: a */
    public boolean f134907a;

    /* renamed from: b */
    public AbstractC54589a f134908b;

    /* renamed from: c */
    private boolean f134909c;
    @BindView(7818)
    SwitcherLoadingView mSwitcherLoadingView;
    @BindView(7817)
    LKUISwitchButton mSwitcherView;

    /* renamed from: com.ss.android.lark.setting.page.v1.view.SwitchButtonWithLoading$a */
    public interface AbstractC54589a {
        void onButtonSwitched(boolean z);
    }

    /* renamed from: d */
    private void m211765d() {
        this.mSwitcherView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.setting.page.v1.view.SwitchButtonWithLoading.C545881 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SwitchButtonWithLoading.this.mo186489b();
                if (SwitchButtonWithLoading.this.f134908b != null) {
                    SwitchButtonWithLoading.this.f134908b.onButtonSwitched(z);
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo186488a() {
        return this.mSwitcherView.isChecked();
    }

    /* renamed from: b */
    public void mo186489b() {
        if (this.f134909c) {
            this.f134907a = false;
            this.mSwitcherLoadingView.mo197496a();
        }
    }

    /* renamed from: c */
    private void m211764c() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.view_switch_button_with_loading, this));
        m211765d();
    }

    public void setOnSwitchListener(AbstractC54589a aVar) {
        this.f134908b = aVar;
    }

    public SwitchButtonWithLoading(Context context) {
        super(context);
        m211764c();
    }

    /* renamed from: a */
    public void mo186487a(boolean z) {
        this.mSwitcherView.setCheckedImmediately(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.mSwitcherView.setEnabled(z);
    }

    public SwitchButtonWithLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m211764c();
    }

    public SwitchButtonWithLoading(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m211764c();
    }
}
