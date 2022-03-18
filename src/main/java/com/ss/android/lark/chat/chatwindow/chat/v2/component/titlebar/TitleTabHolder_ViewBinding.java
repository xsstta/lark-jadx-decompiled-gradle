package com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;

public final class TitleTabHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TitleTabHolder f86835a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TitleTabHolder titleTabHolder = this.f86835a;
        if (titleTabHolder != null) {
            this.f86835a = null;
            titleTabHolder.mTitleBarTabContent = null;
            titleTabHolder.mTabLayout = null;
            titleTabHolder.mTabAddIcon = null;
            titleTabHolder.mTabMoreIcon = null;
            titleTabHolder.mTabAddIconFloat = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TitleTabHolder_ViewBinding(TitleTabHolder titleTabHolder, View view) {
        this.f86835a = titleTabHolder;
        titleTabHolder.mTitleBarTabContent = Utils.findRequiredView(view, R.id.tab_content, "field 'mTitleBarTabContent'");
        titleTabHolder.mTabLayout = (UDTabLayout) Utils.findRequiredViewAsType(view, R.id.tab_layout, "field 'mTabLayout'", UDTabLayout.class);
        titleTabHolder.mTabAddIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.tab_add, "field 'mTabAddIcon'", ImageView.class);
        titleTabHolder.mTabMoreIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.tab_more, "field 'mTabMoreIcon'", ImageView.class);
        titleTabHolder.mTabAddIconFloat = (ImageView) Utils.findRequiredViewAsType(view, R.id.tab_add_float, "field 'mTabAddIconFloat'", ImageView.class);
    }
}
