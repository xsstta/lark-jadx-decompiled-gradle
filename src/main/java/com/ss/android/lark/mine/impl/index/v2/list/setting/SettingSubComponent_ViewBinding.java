package com.ss.android.lark.mine.impl.index.v2.list.setting;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class SettingSubComponent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SettingSubComponent f115431a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SettingSubComponent settingSubComponent = this.f115431a;
        if (settingSubComponent != null) {
            this.f115431a = null;
            settingSubComponent.mNewVersionTipIV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SettingSubComponent_ViewBinding(SettingSubComponent settingSubComponent, View view) {
        this.f115431a = settingSubComponent;
        settingSubComponent.mNewVersionTipIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.image_version_tip, "field 'mNewVersionTipIV'", ImageView.class);
    }
}
