package com.ss.android.lark.calendar.impl.features.settings.widget;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class ChooseEventColorView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChooseEventColorView f83254a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChooseEventColorView chooseEventColorView = this.f83254a;
        if (chooseEventColorView != null) {
            this.f83254a = null;
            chooseEventColorView.mContentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChooseEventColorView_ViewBinding(ChooseEventColorView chooseEventColorView, View view) {
        this.f83254a = chooseEventColorView;
        chooseEventColorView.mContentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_root_container, "field 'mContentContainer'", ViewGroup.class);
    }
}
