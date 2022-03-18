package com.ss.android.lark.main.app.fragment.phone;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.main.app.tab.MainTab;
import com.ss.android.lark.main.app.title.MainTitle;
import com.ss.android.lark.main.app.widgets.MainViewContainer;
import com.ss.android.lark.main.app.widgets.MainViewPager;

public class MainFragmentView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MainFragmentView f112344a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MainFragmentView mainFragmentView = this.f112344a;
        if (mainFragmentView != null) {
            this.f112344a = null;
            mainFragmentView.mMainLayout = null;
            mainFragmentView.mMainTab = null;
            mainFragmentView.mShadow = null;
            mainFragmentView.mMainViewPager = null;
            mainFragmentView.mDrawerContainer = null;
            mainFragmentView.mDingDialogContainer = null;
            mainFragmentView.mMainTitle = null;
            mainFragmentView.mNavLine = null;
            mainFragmentView.mStatusBarBackground = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MainFragmentView_ViewBinding(MainFragmentView mainFragmentView, View view) {
        this.f112344a = mainFragmentView;
        mainFragmentView.mMainLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.main_layout, "field 'mMainLayout'", ViewGroup.class);
        mainFragmentView.mMainTab = (MainTab) Utils.findRequiredViewAsType(view, R.id.main_tab, "field 'mMainTab'", MainTab.class);
        mainFragmentView.mShadow = Utils.findRequiredView(view, R.id.window_shadow, "field 'mShadow'");
        mainFragmentView.mMainViewPager = (MainViewPager) Utils.findRequiredViewAsType(view, R.id.main_vp, "field 'mMainViewPager'", MainViewPager.class);
        mainFragmentView.mDrawerContainer = (MainViewContainer) Utils.findRequiredViewAsType(view, R.id.drawer_container, "field 'mDrawerContainer'", MainViewContainer.class);
        mainFragmentView.mDingDialogContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ding_dialog_container, "field 'mDingDialogContainer'", FrameLayout.class);
        mainFragmentView.mMainTitle = (MainTitle) Utils.findRequiredViewAsType(view, R.id.main_title, "field 'mMainTitle'", MainTitle.class);
        mainFragmentView.mNavLine = Utils.findRequiredView(view, R.id.navigation_tab_line, "field 'mNavLine'");
        mainFragmentView.mStatusBarBackground = Utils.findRequiredView(view, R.id.status_bar_background, "field 'mStatusBarBackground'");
    }
}
