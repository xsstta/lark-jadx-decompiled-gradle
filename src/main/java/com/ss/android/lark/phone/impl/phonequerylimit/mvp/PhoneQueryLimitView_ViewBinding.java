package com.ss.android.lark.phone.impl.phonequerylimit.mvp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class PhoneQueryLimitView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhoneQueryLimitView f127935a;

    @Override // butterknife.Unbinder
    public void unbind() {
        PhoneQueryLimitView phoneQueryLimitView = this.f127935a;
        if (phoneQueryLimitView != null) {
            this.f127935a = null;
            phoneQueryLimitView.mTitleBar = null;
            phoneQueryLimitView.mPhoneQueryLimitHintTitleTV = null;
            phoneQueryLimitView.mPhoneQueryLimitHintContentTV = null;
            phoneQueryLimitView.mVoiceUrgentCallHintLL = null;
            phoneQueryLimitView.mVoiceUrgentCallTipsLL = null;
            phoneQueryLimitView.mVoiceUrgentCallActionRL = null;
            phoneQueryLimitView.mUnderStandPhoneControlDetailTV = null;
            phoneQueryLimitView.mPhoneCallContinueLL = null;
            phoneQueryLimitView.mPhoneCallContinueTV = null;
            phoneQueryLimitView.mApplyForPhoneCallAmountTV = null;
            phoneQueryLimitView.mPhoneQueryLimitBtnTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhoneQueryLimitView_ViewBinding(PhoneQueryLimitView phoneQueryLimitView, View view) {
        this.f127935a = phoneQueryLimitView;
        phoneQueryLimitView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        phoneQueryLimitView.mPhoneQueryLimitHintTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.phone_query_limit_hint_title, "field 'mPhoneQueryLimitHintTitleTV'", TextView.class);
        phoneQueryLimitView.mPhoneQueryLimitHintContentTV = (TextView) Utils.findRequiredViewAsType(view, R.id.phone_query_limit_hint_content, "field 'mPhoneQueryLimitHintContentTV'", TextView.class);
        phoneQueryLimitView.mVoiceUrgentCallHintLL = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.voice_urgent_call_hint_ll, "field 'mVoiceUrgentCallHintLL'", LinearLayout.class);
        phoneQueryLimitView.mVoiceUrgentCallTipsLL = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.voice_urgent_call_tips_ll, "field 'mVoiceUrgentCallTipsLL'", LinearLayout.class);
        phoneQueryLimitView.mVoiceUrgentCallActionRL = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.voice_urgent_call_action_rl, "field 'mVoiceUrgentCallActionRL'", RelativeLayout.class);
        phoneQueryLimitView.mUnderStandPhoneControlDetailTV = (TextView) Utils.findRequiredViewAsType(view, R.id.understand_phone_control_detail_tv, "field 'mUnderStandPhoneControlDetailTV'", TextView.class);
        phoneQueryLimitView.mPhoneCallContinueLL = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.phone_call_continue_ll, "field 'mPhoneCallContinueLL'", LinearLayout.class);
        phoneQueryLimitView.mPhoneCallContinueTV = (TextView) Utils.findRequiredViewAsType(view, R.id.phone_call_continue_tv, "field 'mPhoneCallContinueTV'", TextView.class);
        phoneQueryLimitView.mApplyForPhoneCallAmountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.apply_for_phone_call_amount_tv, "field 'mApplyForPhoneCallAmountTV'", TextView.class);
        phoneQueryLimitView.mPhoneQueryLimitBtnTV = (TextView) Utils.findRequiredViewAsType(view, R.id.phone_query_limit_button_tv, "field 'mPhoneQueryLimitBtnTV'", TextView.class);
    }
}
