package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.view.ViewPager2FixLayout;

public final class TabComponent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TabComponent f86719a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TabComponent tabComponent = this.f86719a;
        if (tabComponent != null) {
            this.f86719a = null;
            tabComponent.mViewPager = null;
            tabComponent.mRoot = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TabComponent_ViewBinding(TabComponent tabComponent, View view) {
        this.f86719a = tabComponent;
        tabComponent.mViewPager = (ViewPager2) Utils.findRequiredViewAsType(view, R.id.view_pager, "field 'mViewPager'", ViewPager2.class);
        tabComponent.mRoot = (ViewPager2FixLayout) Utils.findRequiredViewAsType(view, R.id.root, "field 'mRoot'", ViewPager2FixLayout.class);
    }
}
