package com.ss.android.lark.chatsetting.impl.group.share;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class GroupShareView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupShareView f90309a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupShareView groupShareView = this.f90309a;
        if (groupShareView != null) {
            this.f90309a = null;
            groupShareView.mTitleBar = null;
            groupShareView.mViewPager = null;
            groupShareView.mTabLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupShareView_ViewBinding(GroupShareView groupShareView, View view) {
        this.f90309a = groupShareView;
        groupShareView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        groupShareView.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.content_view_pager, "field 'mViewPager'", ViewPager.class);
        groupShareView.mTabLayout = (UDTabLayout) Utils.findRequiredViewAsType(view, R.id.share_tab_layout, "field 'mTabLayout'", UDTabLayout.class);
    }
}
