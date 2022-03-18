package com.ss.android.lark.setting.page.content.general;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.setting.page.v1.view.SwitchButtonWithLoading;
import com.ss.android.lark.ui.CommonTitleBar;

public class GeneralSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GeneralSettingView f134620a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GeneralSettingView generalSettingView = this.f134620a;
        if (generalSettingView != null) {
            this.f134620a = null;
            generalSettingView.mAutoAudio2TextView = null;
            generalSettingView.mAutoAudio2TextSwitcher = null;
            generalSettingView.mWorkoutLeaveView = null;
            generalSettingView.mWorkoutLeaveSwitcher = null;
            generalSettingView.mPersonalStatusContainer = null;
            generalSettingView.mUrgentDetectContainer = null;
            generalSettingView.mUrgentNumberSaveSwitcher = null;
            generalSettingView.mSmartReplyBoxSwitcher = null;
            generalSettingView.mSmartReplyContainer = null;
            generalSettingView.mSmartComposeBoxSwitcher = null;
            generalSettingView.mSmartActionContainer = null;
            generalSettingView.mSmartActionCb = null;
            generalSettingView.mSmartComposeContainer = null;
            generalSettingView.mSmartComposeDocCb = null;
            generalSettingView.mSmartComposeMailCb = null;
            generalSettingView.mSmartComposeMessageCb = null;
            generalSettingView.mTitleBar = null;
            generalSettingView.mDesktopTitleBar = null;
            generalSettingView.mMessagesFilterContainer = null;
            generalSettingView.mMessagesFilterCl = null;
            generalSettingView.mWhenIViewAChatContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GeneralSettingView_ViewBinding(GeneralSettingView generalSettingView, View view) {
        this.f134620a = generalSettingView;
        generalSettingView.mAutoAudio2TextView = Utils.findRequiredView(view, R.id.audio_2_text_container, "field 'mAutoAudio2TextView'");
        generalSettingView.mAutoAudio2TextSwitcher = (SwitchButtonWithLoading) Utils.findRequiredViewAsType(view, R.id.auto_audio_2_text_switch, "field 'mAutoAudio2TextSwitcher'", SwitchButtonWithLoading.class);
        generalSettingView.mWorkoutLeaveView = Utils.findRequiredView(view, R.id.workout_leave_container, "field 'mWorkoutLeaveView'");
        generalSettingView.mWorkoutLeaveSwitcher = (SwitchButtonWithLoading) Utils.findRequiredViewAsType(view, R.id.auto_leave_switcher, "field 'mWorkoutLeaveSwitcher'", SwitchButtonWithLoading.class);
        generalSettingView.mPersonalStatusContainer = Utils.findRequiredView(view, R.id.custom_status_container, "field 'mPersonalStatusContainer'");
        generalSettingView.mUrgentDetectContainer = Utils.findRequiredView(view, R.id.urgent_detect_container, "field 'mUrgentDetectContainer'");
        generalSettingView.mUrgentNumberSaveSwitcher = (SwitchButtonWithLoading) Utils.findRequiredViewAsType(view, R.id.urgent_detect_switcher, "field 'mUrgentNumberSaveSwitcher'", SwitchButtonWithLoading.class);
        generalSettingView.mSmartReplyBoxSwitcher = (SwitchButtonWithLoading) Utils.findRequiredViewAsType(view, R.id.smart_reply_box_switch, "field 'mSmartReplyBoxSwitcher'", SwitchButtonWithLoading.class);
        generalSettingView.mSmartReplyContainer = Utils.findRequiredView(view, R.id.smart_reply_box_container, "field 'mSmartReplyContainer'");
        generalSettingView.mSmartComposeBoxSwitcher = (SwitchButtonWithLoading) Utils.findRequiredViewAsType(view, R.id.smart_compose_box_switch, "field 'mSmartComposeBoxSwitcher'", SwitchButtonWithLoading.class);
        generalSettingView.mSmartActionContainer = Utils.findRequiredView(view, R.id.smart_action_container, "field 'mSmartActionContainer'");
        generalSettingView.mSmartActionCb = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.smart_action_cb, "field 'mSmartActionCb'", UDCheckBox.class);
        generalSettingView.mSmartComposeContainer = Utils.findRequiredView(view, R.id.smart_compose_box_container, "field 'mSmartComposeContainer'");
        generalSettingView.mSmartComposeDocCb = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.smart_compose_doc_cb, "field 'mSmartComposeDocCb'", UDCheckBox.class);
        generalSettingView.mSmartComposeMailCb = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.smart_compose_mail_cb, "field 'mSmartComposeMailCb'", UDCheckBox.class);
        generalSettingView.mSmartComposeMessageCb = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.smart_compose_message_cb, "field 'mSmartComposeMessageCb'", UDCheckBox.class);
        generalSettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        generalSettingView.mDesktopTitleBar = (TextView) Utils.findRequiredViewAsType(view, R.id.desktop_mine_title, "field 'mDesktopTitleBar'", TextView.class);
        generalSettingView.mMessagesFilterContainer = Utils.findRequiredView(view, R.id.filter_messages_container, "field 'mMessagesFilterContainer'");
        generalSettingView.mMessagesFilterCl = Utils.findRequiredView(view, R.id.messages_filter_cl, "field 'mMessagesFilterCl'");
        generalSettingView.mWhenIViewAChatContainer = Utils.findRequiredView(view, R.id.when_i_view_a_chat_container, "field 'mWhenIViewAChatContainer'");
    }
}
