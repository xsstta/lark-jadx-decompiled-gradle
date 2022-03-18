package com.ss.android.lark.notification.setting.impl.zen;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class ZenSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ZenSettingView f122399a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ZenSettingView zenSettingView = this.f122399a;
        if (zenSettingView != null) {
            this.f122399a = null;
            zenSettingView.mTitleBar = null;
            zenSettingView.mTurnOffGroup = null;
            zenSettingView.mTurnOffLoadingView = null;
            zenSettingView.mTurnOffBT = null;
            zenSettingView.mLeftTimeTV = null;
            zenSettingView.mSelectorRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ZenSettingView_ViewBinding(ZenSettingView zenSettingView, View view) {
        this.f122399a = zenSettingView;
        zenSettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        zenSettingView.mTurnOffGroup = (Group) Utils.findRequiredViewAsType(view, R.id.group, "field 'mTurnOffGroup'", Group.class);
        zenSettingView.mTurnOffLoadingView = (ImageView) Utils.findRequiredViewAsType(view, R.id.turn_off_loading, "field 'mTurnOffLoadingView'", ImageView.class);
        zenSettingView.mTurnOffBT = Utils.findRequiredView(view, R.id.turn_off_text, "field 'mTurnOffBT'");
        zenSettingView.mLeftTimeTV = (TextView) Utils.findRequiredViewAsType(view, R.id.zen_left_time, "field 'mLeftTimeTV'", TextView.class);
        zenSettingView.mSelectorRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.pause_time_selector, "field 'mSelectorRV'", RecyclerView.class);
    }
}
