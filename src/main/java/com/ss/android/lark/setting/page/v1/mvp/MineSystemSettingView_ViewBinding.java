package com.ss.android.lark.setting.page.v1.mvp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.setting.page.v1.view.NotificationEntranceView;
import com.ss.android.lark.ui.CommonTitleBar;

public class MineSystemSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MineSystemSettingView f134876a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MineSystemSettingView mineSystemSettingView = this.f134876a;
        if (mineSystemSettingView != null) {
            this.f134876a = null;
            mineSystemSettingView.mLogoutBtn = null;
            mineSystemSettingView.mTitleBar = null;
            mineSystemSettingView.mAccountAndSecurityLayout = null;
            mineSystemSettingView.mTvAccountAndSecurity = null;
            mineSystemSettingView.mSettingWrittenLanguageLayout = null;
            mineSystemSettingView.mSettingCalendar = null;
            mineSystemSettingView.mSettingTodo = null;
            mineSystemSettingView.mSettingMoments = null;
            mineSystemSettingView.mSettingMomentsTitle = null;
            mineSystemSettingView.mSettingVideoChat = null;
            mineSystemSettingView.mSettingGeneral = null;
            mineSystemSettingView.mSettingEmail = null;
            mineSystemSettingView.mNotificationEntrance = null;
            mineSystemSettingView.mInternalSettings = null;
            mineSystemSettingView.mAboutLarkTV = null;
            mineSystemSettingView.mAboutLarkRL = null;
            mineSystemSettingView.mNewVersionTipIV = null;
            mineSystemSettingView.mPrivateSetting = null;
            mineSystemSettingView.mAppVersionSettingTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MineSystemSettingView_ViewBinding(MineSystemSettingView mineSystemSettingView, View view) {
        this.f134876a = mineSystemSettingView;
        mineSystemSettingView.mLogoutBtn = Utils.findRequiredView(view, R.id.logout, "field 'mLogoutBtn'");
        mineSystemSettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        mineSystemSettingView.mAccountAndSecurityLayout = Utils.findRequiredView(view, R.id.account_and_security_settinng, "field 'mAccountAndSecurityLayout'");
        mineSystemSettingView.mTvAccountAndSecurity = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_account_and_security, "field 'mTvAccountAndSecurity'", TextView.class);
        mineSystemSettingView.mSettingWrittenLanguageLayout = Utils.findRequiredView(view, R.id.setting_written_language_layout, "field 'mSettingWrittenLanguageLayout'");
        mineSystemSettingView.mSettingCalendar = Utils.findRequiredView(view, R.id.setting_calendar, "field 'mSettingCalendar'");
        mineSystemSettingView.mSettingTodo = Utils.findRequiredView(view, R.id.setting_todo, "field 'mSettingTodo'");
        mineSystemSettingView.mSettingMoments = Utils.findRequiredView(view, R.id.setting_moments, "field 'mSettingMoments'");
        mineSystemSettingView.mSettingMomentsTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.setting_moments_title, "field 'mSettingMomentsTitle'", TextView.class);
        mineSystemSettingView.mSettingVideoChat = Utils.findRequiredView(view, R.id.setting_video_chat, "field 'mSettingVideoChat'");
        mineSystemSettingView.mSettingGeneral = Utils.findRequiredView(view, R.id.setting_general, "field 'mSettingGeneral'");
        mineSystemSettingView.mSettingEmail = Utils.findRequiredView(view, R.id.setting_email, "field 'mSettingEmail'");
        mineSystemSettingView.mNotificationEntrance = (NotificationEntranceView) Utils.findRequiredViewAsType(view, R.id.notification_setting_entrance, "field 'mNotificationEntrance'", NotificationEntranceView.class);
        mineSystemSettingView.mInternalSettings = Utils.findRequiredView(view, R.id.internal_settings, "field 'mInternalSettings'");
        mineSystemSettingView.mAboutLarkTV = (TextView) Utils.findRequiredViewAsType(view, R.id.about_lark_text, "field 'mAboutLarkTV'", TextView.class);
        mineSystemSettingView.mAboutLarkRL = Utils.findRequiredView(view, R.id.about_lark, "field 'mAboutLarkRL'");
        mineSystemSettingView.mNewVersionTipIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.image_version_tip, "field 'mNewVersionTipIV'", ImageView.class);
        mineSystemSettingView.mPrivateSetting = Utils.findRequiredView(view, R.id.setting_private, "field 'mPrivateSetting'");
        mineSystemSettingView.mAppVersionSettingTV = (TextView) Utils.findRequiredViewAsType(view, R.id.setting_app_version_tv, "field 'mAppVersionSettingTV'", TextView.class);
    }
}
