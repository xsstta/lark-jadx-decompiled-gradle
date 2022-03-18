package com.ss.android.lark.main.app.fragment.desktop;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.main.app.tab.MainTab;
import com.ss.android.lark.main.app.widgets.MainDropRelativeLayout;
import com.ss.android.lark.main.app.widgets.MainViewContainer;
import com.ss.android.lark.main.app.widgets.desktop.avatar.MainAvatar;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcher;

public class DesktopMainFragmentView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DesktopMainFragmentView f112284a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DesktopMainFragmentView desktopMainFragmentView = this.f112284a;
        if (desktopMainFragmentView != null) {
            this.f112284a = null;
            desktopMainFragmentView.mLeftDrawer = null;
            desktopMainFragmentView.mDingDialogContainer = null;
            desktopMainFragmentView.mMainTab = null;
            desktopMainFragmentView.mMainAvatar = null;
            desktopMainFragmentView.mTenantSwitcher = null;
            desktopMainFragmentView.mRootView = null;
            desktopMainFragmentView.mLeftContainer = null;
            desktopMainFragmentView.mRightContainer = null;
            desktopMainFragmentView.mDrawerContainer = null;
            desktopMainFragmentView.mALLContainer = null;
            desktopMainFragmentView.mFloatContainer = null;
            desktopMainFragmentView.mDrawerLayout = null;
            desktopMainFragmentView.mSideMenuContainer = null;
            desktopMainFragmentView.mNetWorkStatusView = null;
            desktopMainFragmentView.mNetworkTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DesktopMainFragmentView_ViewBinding(DesktopMainFragmentView desktopMainFragmentView, View view) {
        this.f112284a = desktopMainFragmentView;
        desktopMainFragmentView.mLeftDrawer = (MainViewContainer) Utils.findRequiredViewAsType(view, R.id.left_drawer, "field 'mLeftDrawer'", MainViewContainer.class);
        desktopMainFragmentView.mDingDialogContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ding_dialog_container, "field 'mDingDialogContainer'", FrameLayout.class);
        desktopMainFragmentView.mMainTab = (MainTab) Utils.findRequiredViewAsType(view, R.id.main_tab, "field 'mMainTab'", MainTab.class);
        desktopMainFragmentView.mMainAvatar = (MainAvatar) Utils.findRequiredViewAsType(view, R.id.main_avatar, "field 'mMainAvatar'", MainAvatar.class);
        desktopMainFragmentView.mTenantSwitcher = (MainTenantSwitcher) Utils.findRequiredViewAsType(view, R.id.tenant_switcher, "field 'mTenantSwitcher'", MainTenantSwitcher.class);
        desktopMainFragmentView.mRootView = (MainDropRelativeLayout) Utils.findRequiredViewAsType(view, R.id.root, "field 'mRootView'", MainDropRelativeLayout.class);
        desktopMainFragmentView.mLeftContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.left_container, "field 'mLeftContainer'", FrameLayout.class);
        desktopMainFragmentView.mRightContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.right_container, "field 'mRightContainer'", FrameLayout.class);
        desktopMainFragmentView.mDrawerContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.drawer_container, "field 'mDrawerContainer'", FrameLayout.class);
        desktopMainFragmentView.mALLContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.all_container, "field 'mALLContainer'", FrameLayout.class);
        desktopMainFragmentView.mFloatContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.float_container, "field 'mFloatContainer'", FrameLayout.class);
        desktopMainFragmentView.mDrawerLayout = (DrawerLayout) Utils.findRequiredViewAsType(view, R.id.root_layout, "field 'mDrawerLayout'", DrawerLayout.class);
        desktopMainFragmentView.mSideMenuContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.side_menu_container, "field 'mSideMenuContainer'", FrameLayout.class);
        desktopMainFragmentView.mNetWorkStatusView = Utils.findRequiredView(view, R.id.network_status, "field 'mNetWorkStatusView'");
        desktopMainFragmentView.mNetworkTV = (TextView) Utils.findRequiredViewAsType(view, R.id.network_hint, "field 'mNetworkTV'", TextView.class);
    }
}
