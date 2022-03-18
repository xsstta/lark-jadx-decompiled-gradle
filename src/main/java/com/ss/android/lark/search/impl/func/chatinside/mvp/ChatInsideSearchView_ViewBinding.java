package com.ss.android.lark.search.impl.func.chatinside.mvp;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class ChatInsideSearchView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChatInsideSearchView f132239a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatInsideSearchView chatInsideSearchView = this.f132239a;
        if (chatInsideSearchView != null) {
            this.f132239a = null;
            chatInsideSearchView.mTitleBar = null;
            chatInsideSearchView.mViewPager = null;
            chatInsideSearchView.mTabLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChatInsideSearchView_ViewBinding(ChatInsideSearchView chatInsideSearchView, View view) {
        this.f132239a = chatInsideSearchView;
        chatInsideSearchView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        chatInsideSearchView.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
        chatInsideSearchView.mTabLayout = (UDTabLayout) Utils.findRequiredViewAsType(view, R.id.tab_layout, "field 'mTabLayout'", UDTabLayout.class);
    }
}
