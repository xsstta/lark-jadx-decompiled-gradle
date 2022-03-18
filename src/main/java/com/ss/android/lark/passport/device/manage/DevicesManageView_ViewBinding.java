package com.ss.android.lark.passport.device.manage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class DevicesManageView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DevicesManageView f122971a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DevicesManageView devicesManageView = this.f122971a;
        if (devicesManageView != null) {
            this.f122971a = null;
            devicesManageView.mScrollView = null;
            devicesManageView.mDevicesView = null;
            devicesManageView.mTitleBar = null;
            devicesManageView.mDeviceContainer = null;
            devicesManageView.mTvSubTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DevicesManageView_ViewBinding(DevicesManageView devicesManageView, View view) {
        this.f122971a = devicesManageView;
        devicesManageView.mScrollView = (ScrollView) Utils.findRequiredViewAsType(view, R.id.scroller, "field 'mScrollView'", ScrollView.class);
        devicesManageView.mDevicesView = Utils.findRequiredView(view, R.id.devices, "field 'mDevicesView'");
        devicesManageView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        devicesManageView.mDeviceContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.device_container, "field 'mDeviceContainer'", LinearLayout.class);
        devicesManageView.mTvSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.subTitle, "field 'mTvSubTitle'", TextView.class);
    }
}
