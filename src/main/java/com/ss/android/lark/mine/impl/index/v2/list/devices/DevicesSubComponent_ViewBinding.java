package com.ss.android.lark.mine.impl.index.v2.list.devices;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class DevicesSubComponent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DevicesSubComponent f115395a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DevicesSubComponent devicesSubComponent = this.f115395a;
        if (devicesSubComponent != null) {
            this.f115395a = null;
            devicesSubComponent.mDeviceInfo = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DevicesSubComponent_ViewBinding(DevicesSubComponent devicesSubComponent, View view) {
        this.f115395a = devicesSubComponent;
        devicesSubComponent.mDeviceInfo = (TextView) Utils.findRequiredViewAsType(view, R.id.device_info, "field 'mDeviceInfo'", TextView.class);
    }
}
