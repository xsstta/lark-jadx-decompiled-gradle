package com.bytedance.ee.bear.lark.tab.wiki;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.tab.NavigationTabItemView;

public class WikiNavigationTabView extends NavigationTabItemView {
    /* renamed from: a */
    private void m32448a() {
        setTabIcon(C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_tab_wiki_filled, (int) R.color.ud_C500));
        setTabTitle(getResources().getString(R.string.Lark_Legacy_WikiTab));
    }

    public WikiNavigationTabView(Context context) {
        super(context);
        m32448a();
    }

    public WikiNavigationTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m32448a();
    }

    public WikiNavigationTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m32448a();
    }
}
