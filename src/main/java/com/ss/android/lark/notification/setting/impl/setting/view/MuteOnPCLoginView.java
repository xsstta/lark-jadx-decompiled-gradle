package com.ss.android.lark.notification.setting.impl.setting.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.setting.impl.setting.view.SwitchButtonWithLoading;
import com.ss.android.lark.utils.UIHelper;

public class MuteOnPCLoginView extends ConstraintLayout {

    /* renamed from: a */
    public AbstractC48644a f122321a;
    @BindView(6840)
    View mExtraOption;
    @BindView(6772)
    SwitchButtonWithLoading mMuteDingSwitcher;
    @BindView(7194)
    SwitchButtonWithLoading mMuteMentionSwitcher;
    @BindView(7243)
    View mMuteOptionView;
    @BindView(7245)
    SwitchButtonWithLoading mMuteSwitcher;

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.view.MuteOnPCLoginView$a */
    public interface AbstractC48644a {
        /* renamed from: a */
        void mo169758a(boolean z);

        /* renamed from: b */
        void mo169759b(boolean z);
    }

    /* renamed from: a */
    public void mo169808a() {
        this.mMuteSwitcher.mo169837a();
    }

    /* renamed from: b */
    public void mo169810b() {
        this.mMuteMentionSwitcher.mo169837a();
    }

    /* renamed from: c */
    private void m191744c() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.view_mute_option_notification, this));
        m191745d();
    }

    /* renamed from: d */
    private void m191745d() {
        this.mMuteSwitcher.mo169838a(true);
        this.mMuteMentionSwitcher.mo169838a(true);
        this.mMuteDingSwitcher.mo169839b(true);
        this.mMuteDingSwitcher.setEnabled(false);
        this.mMuteSwitcher.setOnSwitchListener(new SwitchButtonWithLoading.AbstractC48656b() {
            /* class com.ss.android.lark.notification.setting.impl.setting.view.MuteOnPCLoginView.C486421 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.SwitchButtonWithLoading.AbstractC48656b
            /* renamed from: a */
            public void mo169818a(boolean z) {
                if (MuteOnPCLoginView.this.f122321a != null) {
                    MuteOnPCLoginView.this.f122321a.mo169758a(z);
                }
            }
        });
        this.mMuteMentionSwitcher.setOnSwitchListener(new SwitchButtonWithLoading.AbstractC48656b() {
            /* class com.ss.android.lark.notification.setting.impl.setting.view.MuteOnPCLoginView.C486432 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.SwitchButtonWithLoading.AbstractC48656b
            /* renamed from: a */
            public void mo169818a(boolean z) {
                if (MuteOnPCLoginView.this.f122321a != null) {
                    MuteOnPCLoginView.this.f122321a.mo169759b(z);
                }
            }
        });
        TextView textView = (TextView) findViewById(R.id.option_desc);
        textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_NewSettings_TurnOffMobileNotificationDescription));
        if (DesktopUtil.m144301a(getContext())) {
            findViewById(R.id.top_divider).setVisibility(8);
            findViewById(R.id.bottom_divider).setVisibility(8);
            this.mMuteOptionView.setBackgroundResource(R.drawable.settings_item_bg_desktop_selector);
            ((TextView) findViewById(R.id.option_title)).setTextSize(14.0f);
            textView.setTextSize(12.0f);
            ((TextView) findViewById(R.id.ding_option)).setTextSize(14.0f);
            ((TextView) findViewById(R.id.mention_option)).setTextSize(14.0f);
            this.mExtraOption.setBackgroundResource(R.drawable.settings_item_bg_desktop_lower_selector);
        }
    }

    public void setOnMuteOptionSwitchListener(AbstractC48644a aVar) {
        this.f122321a = aVar;
    }

    public MuteOnPCLoginView(Context context) {
        super(context);
        m191744c();
    }

    /* renamed from: d */
    public void mo169813d(boolean z) {
        this.mMuteSwitcher.mo169840c(z);
    }

    /* renamed from: e */
    public void mo169814e(boolean z) {
        this.mMuteMentionSwitcher.mo169840c(z);
    }

    /* renamed from: f */
    public void mo169815f(boolean z) {
        this.mMuteMentionSwitcher.mo169839b(z);
    }

    /* renamed from: g */
    public void mo169816g(boolean z) {
        this.mMuteSwitcher.mo169839b(z);
    }

    /* renamed from: b */
    public void mo169811b(boolean z) {
        this.mMuteMentionSwitcher.mo169839b(z);
    }

    /* renamed from: c */
    public void mo169812c(boolean z) {
        int i;
        View view = this.mExtraOption;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        m191746h(z);
    }

    /* renamed from: a */
    public void mo169809a(boolean z) {
        int i;
        this.mMuteSwitcher.mo169839b(z);
        View view = this.mExtraOption;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        m191746h(z);
    }

    /* renamed from: h */
    private void m191746h(boolean z) {
        if (DesktopUtil.m144301a(getContext())) {
            if (z) {
                this.mMuteOptionView.setBackgroundResource(R.drawable.settings_item_bg_desktop_upper_selector);
            } else {
                this.mMuteOptionView.setBackgroundResource(R.drawable.settings_item_bg_desktop_selector);
            }
        } else if (z) {
            this.mMuteOptionView.setBackgroundResource(R.drawable.bg_setting_group_item_round_top);
        } else {
            this.mMuteOptionView.setBackgroundResource(R.drawable.bg_setting_group_item_round);
        }
    }

    public MuteOnPCLoginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m191744c();
    }

    public MuteOnPCLoginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m191744c();
    }
}
