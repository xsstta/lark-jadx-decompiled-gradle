package com.ss.android.lark.feed.app.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class DesktopSecondaryTitleView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DesktopSecondaryTitleView f97261a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DesktopSecondaryTitleView desktopSecondaryTitleView = this.f97261a;
        if (desktopSecondaryTitleView != null) {
            this.f97261a = null;
            desktopSecondaryTitleView.mBackBT = null;
            desktopSecondaryTitleView.mRightLabel = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DesktopSecondaryTitleView_ViewBinding(DesktopSecondaryTitleView desktopSecondaryTitleView, View view) {
        this.f97261a = desktopSecondaryTitleView;
        desktopSecondaryTitleView.mBackBT = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.back, "field 'mBackBT'", ViewGroup.class);
        desktopSecondaryTitleView.mRightLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.label, "field 'mRightLabel'", TextView.class);
    }
}
