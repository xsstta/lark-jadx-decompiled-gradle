package com.ss.android.lark.notification.setting.impl.setting.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.SwitcherLoadingView;

public class SwitchButtonWithLoading extends ConstraintLayout {

    /* renamed from: a */
    public boolean f122344a;

    /* renamed from: b */
    public Drawable f122345b;

    /* renamed from: c */
    public Drawable f122346c;

    /* renamed from: d */
    public Drawable f122347d;

    /* renamed from: e */
    public Drawable f122348e;

    /* renamed from: f */
    public AbstractC48656b f122349f;

    /* renamed from: g */
    private boolean f122350g;
    @BindView(7660)
    SwitcherLoadingView mSwitcherLoadingView;
    @BindView(7659)
    LKUISwitchButton mSwitcherView;

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.SwitchButtonWithLoading$b */
    public interface AbstractC48656b {
        /* renamed from: a */
        void mo169818a(boolean z);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.SwitchButtonWithLoading$a */
    public class RunnableC48655a implements Runnable {

        /* renamed from: b */
        private final boolean f122353b;

        public void run() {
            m191791a();
        }

        /* renamed from: a */
        private void m191791a() {
            if (SwitchButtonWithLoading.this.f122344a && this.f122353b == SwitchButtonWithLoading.this.mSwitcherView.isChecked()) {
                m191792a(SwitchButtonWithLoading.this.mSwitcherLoadingView, this.f122353b);
            }
        }

        /* renamed from: b */
        private void m191793b() {
            if (SwitchButtonWithLoading.this.f122345b == null) {
                SwitchButtonWithLoading.this.f122345b = m191790a(R.drawable.switch_on_loading_background);
                SwitchButtonWithLoading.this.f122346c = m191790a(R.drawable.switch_on_loading_forground);
            }
            if (SwitchButtonWithLoading.this.f122347d == null) {
                SwitchButtonWithLoading.this.f122347d = m191790a(R.drawable.switch_off_loading_background);
                SwitchButtonWithLoading.this.f122348e = m191790a(R.drawable.switch_off_loading_forground);
            }
        }

        /* renamed from: a */
        private Drawable m191790a(int i) {
            return UIHelper.getResources().getDrawable(i);
        }

        RunnableC48655a(boolean z) {
            this.f122353b = z;
        }

        /* renamed from: a */
        private void m191792a(SwitcherLoadingView switcherLoadingView, boolean z) {
            m191793b();
            if (z) {
                switcherLoadingView.setSpinDrawable(SwitchButtonWithLoading.this.f122345b);
                switcherLoadingView.setForgroundDrawable(SwitchButtonWithLoading.this.f122346c);
            } else {
                switcherLoadingView.setSpinDrawable(SwitchButtonWithLoading.this.f122347d);
                switcherLoadingView.setForgroundDrawable(SwitchButtonWithLoading.this.f122348e);
            }
            switcherLoadingView.mo197497a(z);
        }
    }

    /* renamed from: c */
    private void m191785c() {
        this.mSwitcherView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.view.SwitchButtonWithLoading.C486541 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SwitchButtonWithLoading.this.mo169837a();
                if (SwitchButtonWithLoading.this.f122349f != null) {
                    SwitchButtonWithLoading.this.f122349f.mo169818a(z);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo169837a() {
        if (this.f122350g) {
            this.f122344a = false;
            this.mSwitcherLoadingView.mo197496a();
        }
    }

    /* renamed from: b */
    private void m191784b() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.view_switch_button_with_loading_notification, this));
        m191785c();
    }

    public void setOnSwitchListener(AbstractC48656b bVar) {
        this.f122349f = bVar;
    }

    public SwitchButtonWithLoading(Context context) {
        super(context);
        m191784b();
    }

    /* renamed from: b */
    public void mo169839b(boolean z) {
        this.mSwitcherView.setCheckedImmediately(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.mSwitcherView.setEnabled(z);
    }

    /* renamed from: a */
    public void mo169838a(boolean z) {
        int i;
        this.f122350g = z;
        SwitcherLoadingView switcherLoadingView = this.mSwitcherLoadingView;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        switcherLoadingView.setVisibility(i);
    }

    /* renamed from: c */
    public void mo169840c(boolean z) {
        if (this.f122350g) {
            this.f122344a = true;
            SwitcherLoadingView switcherLoadingView = this.mSwitcherLoadingView;
            if (switcherLoadingView != null) {
                switcherLoadingView.postDelayed(new RunnableC48655a(z), 250);
            }
        }
    }

    public SwitchButtonWithLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m191784b();
    }

    public SwitchButtonWithLoading(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m191784b();
    }
}
