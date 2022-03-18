package com.ss.android.lark.mail.impl.settings.subsetting.accountdetail;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.widget.MailDefaultAvatarView;
import com.ss.android.lark.ui.CommonTitleBar;

public class AccountDetailSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AccountDetailSettingView f110391a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AccountDetailSettingView accountDetailSettingView = this.f110391a;
        if (accountDetailSettingView != null) {
            this.f110391a = null;
            accountDetailSettingView.mTitleBar = null;
            accountDetailSettingView.mAccountTipBanner = null;
            accountDetailSettingView.mAccountPanel = null;
            accountDetailSettingView.mDefaultAvatarIv = null;
            accountDetailSettingView.mAccountNameTv = null;
            accountDetailSettingView.mAccountAddressTv = null;
            accountDetailSettingView.mDelinkTipsTv = null;
            accountDetailSettingView.mSettingListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AccountDetailSettingView_ViewBinding(AccountDetailSettingView accountDetailSettingView, View view) {
        this.f110391a = accountDetailSettingView;
        accountDetailSettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        accountDetailSettingView.mAccountTipBanner = (UDNotice) Utils.findRequiredViewAsType(view, R.id.account_tip_banner, "field 'mAccountTipBanner'", UDNotice.class);
        accountDetailSettingView.mAccountPanel = Utils.findRequiredView(view, R.id.mail_account_panel, "field 'mAccountPanel'");
        accountDetailSettingView.mDefaultAvatarIv = (MailDefaultAvatarView) Utils.findRequiredViewAsType(view, R.id.mail_account_default_avatar_tv, "field 'mDefaultAvatarIv'", MailDefaultAvatarView.class);
        accountDetailSettingView.mAccountNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.account_name_tv, "field 'mAccountNameTv'", TextView.class);
        accountDetailSettingView.mAccountAddressTv = (TextView) Utils.findRequiredViewAsType(view, R.id.account_address_tv, "field 'mAccountAddressTv'", TextView.class);
        accountDetailSettingView.mDelinkTipsTv = (TextView) Utils.findRequiredViewAsType(view, R.id.account_delink_tips_tv, "field 'mDelinkTipsTv'", TextView.class);
        accountDetailSettingView.mSettingListView = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.mail_setting_list, "field 'mSettingListView'", LinearLayout.class);
    }
}
