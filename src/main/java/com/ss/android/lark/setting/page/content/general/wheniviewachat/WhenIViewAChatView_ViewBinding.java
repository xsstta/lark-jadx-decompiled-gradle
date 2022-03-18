package com.ss.android.lark.setting.page.content.general.wheniviewachat;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;

public final class WhenIViewAChatView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private WhenIViewAChatView f134815a;

    @Override // butterknife.Unbinder
    public void unbind() {
        WhenIViewAChatView whenIViewAChatView = this.f134815a;
        if (whenIViewAChatView != null) {
            this.f134815a = null;
            whenIViewAChatView.recentLeftLayout = null;
            whenIViewAChatView.newestUnreadLayout = null;
            whenIViewAChatView.recentLeftCb = null;
            whenIViewAChatView.newestUnreadCb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public WhenIViewAChatView_ViewBinding(WhenIViewAChatView whenIViewAChatView, View view) {
        this.f134815a = whenIViewAChatView;
        whenIViewAChatView.recentLeftLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.recent_left_layout, "field 'recentLeftLayout'", ViewGroup.class);
        whenIViewAChatView.newestUnreadLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.newest_unread_layout, "field 'newestUnreadLayout'", ViewGroup.class);
        whenIViewAChatView.recentLeftCb = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.recent_left_cb, "field 'recentLeftCb'", UDCheckBox.class);
        whenIViewAChatView.newestUnreadCb = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.newest_unread_cb, "field 'newestUnreadCb'", UDCheckBox.class);
    }
}
