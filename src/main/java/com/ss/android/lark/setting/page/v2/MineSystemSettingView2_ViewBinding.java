package com.ss.android.lark.setting.page.v2;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class MineSystemSettingView2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MineSystemSettingView2 f134918a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MineSystemSettingView2 mineSystemSettingView2 = this.f134918a;
        if (mineSystemSettingView2 != null) {
            this.f134918a = null;
            mineSystemSettingView2.mTitleBar = null;
            mineSystemSettingView2.mContainer = null;
            mineSystemSettingView2.mScrollView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MineSystemSettingView2_ViewBinding(MineSystemSettingView2 mineSystemSettingView2, View view) {
        this.f134918a = mineSystemSettingView2;
        mineSystemSettingView2.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        mineSystemSettingView2.mContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.container, "field 'mContainer'", LinearLayout.class);
        mineSystemSettingView2.mScrollView = (ScrollView) Utils.findRequiredViewAsType(view, R.id.scrollView, "field 'mScrollView'", ScrollView.class);
    }
}
