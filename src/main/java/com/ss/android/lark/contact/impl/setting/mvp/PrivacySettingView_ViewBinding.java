package com.ss.android.lark.contact.impl.setting.mvp;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.setting.widget.FindMeSettingView;
import com.ss.android.lark.contact.impl.setting.widget.SwitchSettingView;
import com.ss.android.lark.ui.CommonTitleBar;

public class PrivacySettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PrivacySettingView f93074a;

    @Override // butterknife.Unbinder
    public void unbind() {
        PrivacySettingView privacySettingView = this.f93074a;
        if (privacySettingView != null) {
            this.f93074a = null;
            privacySettingView.mFindMeZone = null;
            privacySettingView.mAddMeZone = null;
            privacySettingView.mAddMeSceneZone = null;
            privacySettingView.mTitleBar = null;
            privacySettingView.mDesktopTitleBar = null;
            privacySettingView.mSwitchSettingDing = null;
            privacySettingView.mFindMeSetting = null;
            privacySettingView.mFindMeSettingMore = null;
            privacySettingView.mTvFindMeSetting = null;
            privacySettingView.mSwitchSettingNameCard = null;
            privacySettingView.mSwitchSettingToken = null;
            privacySettingView.mSwitchSettingChat = null;
            privacySettingView.mSwitchSettingSchedule = null;
            privacySettingView.mSwitchSettingDocument = null;
            privacySettingView.mSwitchSettingMeeting = null;
            privacySettingView.mSwitchSettingMail = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PrivacySettingView_ViewBinding(PrivacySettingView privacySettingView, View view) {
        this.f93074a = privacySettingView;
        privacySettingView.mFindMeZone = Utils.findRequiredView(view, R.id.layout_find_me, "field 'mFindMeZone'");
        privacySettingView.mAddMeZone = Utils.findRequiredView(view, R.id.layout_add_me, "field 'mAddMeZone'");
        privacySettingView.mAddMeSceneZone = Utils.findRequiredView(view, R.id.layout_add_me_scene, "field 'mAddMeSceneZone'");
        privacySettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        privacySettingView.mDesktopTitleBar = (TextView) Utils.findRequiredViewAsType(view, R.id.desktop_mine_title, "field 'mDesktopTitleBar'", TextView.class);
        privacySettingView.mSwitchSettingDing = (SwitchSettingView) Utils.findRequiredViewAsType(view, R.id.view_setting_ding, "field 'mSwitchSettingDing'", SwitchSettingView.class);
        privacySettingView.mFindMeSetting = (FindMeSettingView) Utils.findRequiredViewAsType(view, R.id.view_find_me, "field 'mFindMeSetting'", FindMeSettingView.class);
        privacySettingView.mFindMeSettingMore = Utils.findRequiredView(view, R.id.view_find_me_more, "field 'mFindMeSettingMore'");
        privacySettingView.mTvFindMeSetting = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_find_me_more, "field 'mTvFindMeSetting'", TextView.class);
        privacySettingView.mSwitchSettingNameCard = (SwitchSettingView) Utils.findRequiredViewAsType(view, R.id.view_setting_name_card, "field 'mSwitchSettingNameCard'", SwitchSettingView.class);
        privacySettingView.mSwitchSettingToken = (SwitchSettingView) Utils.findRequiredViewAsType(view, R.id.view_setting_token, "field 'mSwitchSettingToken'", SwitchSettingView.class);
        privacySettingView.mSwitchSettingChat = (SwitchSettingView) Utils.findRequiredViewAsType(view, R.id.view_setting_chat, "field 'mSwitchSettingChat'", SwitchSettingView.class);
        privacySettingView.mSwitchSettingSchedule = (SwitchSettingView) Utils.findRequiredViewAsType(view, R.id.view_setting_schedule, "field 'mSwitchSettingSchedule'", SwitchSettingView.class);
        privacySettingView.mSwitchSettingDocument = (SwitchSettingView) Utils.findRequiredViewAsType(view, R.id.view_setting_document, "field 'mSwitchSettingDocument'", SwitchSettingView.class);
        privacySettingView.mSwitchSettingMeeting = (SwitchSettingView) Utils.findRequiredViewAsType(view, R.id.view_setting_meeting, "field 'mSwitchSettingMeeting'", SwitchSettingView.class);
        privacySettingView.mSwitchSettingMail = (SwitchSettingView) Utils.findRequiredViewAsType(view, R.id.view_setting_mail, "field 'mSwitchSettingMail'", SwitchSettingView.class);
    }
}
