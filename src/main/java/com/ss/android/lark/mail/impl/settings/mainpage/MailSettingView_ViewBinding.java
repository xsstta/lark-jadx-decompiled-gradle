package com.ss.android.lark.mail.impl.settings.mainpage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class MailSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MailSettingView f110350a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MailSettingView mailSettingView = this.f110350a;
        if (mailSettingView != null) {
            this.f110350a = null;
            mailSettingView.mTitleBar = null;
            mailSettingView.mSettingListView = null;
            mailSettingView.mLoadingView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MailSettingView_ViewBinding(MailSettingView mailSettingView, View view) {
        this.f110350a = mailSettingView;
        mailSettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        mailSettingView.mSettingListView = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.mail_setting_list, "field 'mSettingListView'", LinearLayout.class);
        mailSettingView.mLoadingView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.mail_setting_loading, "field 'mLoadingView'", ViewGroup.class);
    }
}
