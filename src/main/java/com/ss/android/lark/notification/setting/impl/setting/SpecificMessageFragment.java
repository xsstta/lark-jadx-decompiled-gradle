package com.ss.android.lark.notification.setting.impl.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.statistics.NotificationSettingHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;

public class SpecificMessageFragment extends BaseFragment {

    /* renamed from: a */
    private View f122243a;

    /* renamed from: b */
    private Activity f122244b;

    /* renamed from: c */
    private UDCheckBox f122245c;

    /* renamed from: d */
    private UDCheckBox f122246d;
    @BindView(7315)
    LinearLayout mContainer;
    @BindView(7735)
    CommonTitleBar mTitleBar;

    /* renamed from: b */
    private void m191585b() {
        m191583a(UIHelper.getString(R.string.Lark_NewSettings_NotifySelectedTypesOfMessagesBuzz), false, true);
    }

    /* renamed from: c */
    private void m191586c() {
        m191583a(UIHelper.getString(R.string.Lark_NewSettings_NotifySelectedTypesOfMessagesMention), true, false);
    }

    /* renamed from: d */
    private void m191587d() {
        this.f122246d = (UDCheckBox) m191583a(UIHelper.getString(R.string.Lark_NewSettings_PrivateMessages), true, false).findViewById(R.id.option_chx);
    }

    /* renamed from: e */
    private void m191588e() {
        this.f122245c = (UDCheckBox) m191583a(UIHelper.getString(R.string.Lark_NewSettings_MentionAllMessages), true, false).findViewById(R.id.option_chx);
    }

    /* renamed from: f */
    private void m191589f() {
        if (DesktopUtil.m144301a((Context) this.f122244b)) {
            this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.notification.setting.impl.setting.SpecificMessageFragment.View$OnClickListenerC485993 */

                public void onClick(View view) {
                    SpecificMessageFragment.this.finish();
                }
            });
        }
        m191585b();
        m191586c();
        if (C48398a.m190922a().mo169352o().mo169386a("setting_notification_at_all")) {
            m191588e();
        }
        m191587d();
    }

    /* renamed from: a */
    public NotificationSettingV2 mo169715a() {
        ((UDCheckBox) this.mContainer.getChildAt(0).findViewById(R.id.option_chx)).isChecked();
        boolean isChecked = ((UDCheckBox) this.mContainer.getChildAt(1).findViewById(R.id.option_chx)).isChecked();
        boolean isChecked2 = this.f122246d.isChecked();
        NotificationSettingV2 openBuzz = NotificationSettingV2.halfOpenInstance().openBuzz();
        if (isChecked) {
            openBuzz.openMention();
        }
        if (isChecked2) {
            openBuzz.openUserSingleChat();
        }
        UDCheckBox uDCheckBox = this.f122245c;
        if (uDCheckBox != null && uDCheckBox.isChecked()) {
            openBuzz.openMentionAll();
        }
        return openBuzz;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (UIUtils.isActivityRunning(this.f122244b) && !DesktopUtil.m144301a((Context) this.f122244b)) {
            this.f122244b.getWindow().setBackgroundDrawable(null);
        }
    }

    /* renamed from: a */
    private void m191584a(NotificationSettingV2 notificationSettingV2) {
        if (notificationSettingV2 == null) {
            Log.m165397w("SpecificMessageFragment", "NotificationSettingV2 is null!");
            return;
        }
        UDCheckBox uDCheckBox = (UDCheckBox) this.mContainer.getChildAt(0).findViewById(R.id.option_chx);
        uDCheckBox.setChecked(notificationSettingV2.isBuzzOpen());
        uDCheckBox.setTag(0);
        UDCheckBox uDCheckBox2 = (UDCheckBox) this.mContainer.getChildAt(1).findViewById(R.id.option_chx);
        uDCheckBox2.setChecked(notificationSettingV2.isMentionOpen());
        uDCheckBox2.setTag(1);
        this.f122246d.setChecked(notificationSettingV2.isUserSingleChatOpen());
        this.f122246d.setTag(2);
        UDCheckBox uDCheckBox3 = this.f122245c;
        if (uDCheckBox3 != null) {
            uDCheckBox3.setChecked(notificationSettingV2.isMentionAllOpen());
            this.f122245c.setTag(3);
        }
    }

    /* renamed from: a */
    public void mo169716a(int i, boolean z) {
        if (i == 1) {
            if (z) {
                NotificationSettingHitPoint.f122128a.mo169617d();
            } else {
                NotificationSettingHitPoint.f122128a.mo169618e();
            }
            NotificationSettingHitPoint.m191339a("at_me_toggle", z);
        } else if (i == 2) {
            if (z) {
                NotificationSettingHitPoint.f122128a.mo169619f();
            } else {
                NotificationSettingHitPoint.f122128a.mo169620g();
            }
        } else if (i == 3) {
            NotificationSettingHitPoint.m191339a("at_all_toggle", z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.bind(this, this.f122243a);
        m191589f();
        Bundle arguments = getArguments();
        if (arguments != null) {
            m191584a((NotificationSettingV2) arguments.get("options_key_v2"));
        } else {
            Log.m165397w("SpecificMessageFragment", "getArguments() is null!");
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122243a = layoutInflater.inflate(R.layout.activity_setting_option_v2, viewGroup, false);
        this.f122244b = getActivity();
        return this.f122243a;
    }

    /* renamed from: a */
    private View m191583a(String str, final boolean z, boolean z2) {
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(this.f122244b).inflate(R.layout.item_notification_setting_option, (ViewGroup) null);
        TextView textView = (TextView) constraintLayout.findViewById(R.id.option_name);
        final UDCheckBox uDCheckBox = (UDCheckBox) constraintLayout.findViewById(R.id.option_chx);
        textView.setText(str);
        uDCheckBox.setChecked(z2);
        uDCheckBox.setEnabled(z);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.SpecificMessageFragment.View$OnClickListenerC485971 */

            public void onClick(View view) {
                if (z) {
                    UDCheckBox uDCheckBox = uDCheckBox;
                    uDCheckBox.setChecked(!uDCheckBox.isChecked());
                }
            }
        });
        if (z) {
            uDCheckBox.setOnCheckedChangeListener(new UDCheckBox.OnCheckedChangeListener() {
                /* class com.ss.android.lark.notification.setting.impl.setting.SpecificMessageFragment.C485982 */

                @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
                public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                    SpecificMessageFragment.this.setResult(249, new Intent().putExtra("option_result_v2", SpecificMessageFragment.this.mo169715a()));
                    Object tag = uDCheckBox.getTag();
                    if (tag != null) {
                        SpecificMessageFragment.this.mo169716a(((Integer) tag).intValue(), z);
                    }
                }
            });
        }
        if (DesktopUtil.m144301a(this.mContext)) {
            DesktopUtil.m144299a(textView);
            this.mContainer.addView(constraintLayout, -1, UIHelper.dp2px(48.0f));
        } else {
            this.mContainer.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
