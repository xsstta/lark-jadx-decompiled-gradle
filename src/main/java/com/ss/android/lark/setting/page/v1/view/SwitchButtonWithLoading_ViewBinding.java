package com.ss.android.lark.setting.page.v1.view;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.SwitcherLoadingView;

public class SwitchButtonWithLoading_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SwitchButtonWithLoading f134911a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SwitchButtonWithLoading switchButtonWithLoading = this.f134911a;
        if (switchButtonWithLoading != null) {
            this.f134911a = null;
            switchButtonWithLoading.mSwitcherView = null;
            switchButtonWithLoading.mSwitcherLoadingView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SwitchButtonWithLoading_ViewBinding(SwitchButtonWithLoading switchButtonWithLoading, View view) {
        this.f134911a = switchButtonWithLoading;
        switchButtonWithLoading.mSwitcherView = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.switcher_button, "field 'mSwitcherView'", LKUISwitchButton.class);
        switchButtonWithLoading.mSwitcherLoadingView = (SwitcherLoadingView) Utils.findRequiredViewAsType(view, R.id.switcher_loading, "field 'mSwitcherLoadingView'", SwitcherLoadingView.class);
    }
}
