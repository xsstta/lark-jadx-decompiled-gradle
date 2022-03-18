package com.bytedance.ee.bear.lark.tab;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.tab.NavigationTabItemView;

public class DocNavigationTabView extends NavigationTabItemView {
    /* renamed from: a */
    private void m32425a() {
        setTabIcon(C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_tab_drive_filled, (int) R.color.ud_B500));
        setTabTitle(getResources().getString(R.string.Lark_Legacy_Docs));
    }

    public DocNavigationTabView(Context context) {
        this(context, null);
    }

    public DocNavigationTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DocNavigationTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m32425a();
    }
}
