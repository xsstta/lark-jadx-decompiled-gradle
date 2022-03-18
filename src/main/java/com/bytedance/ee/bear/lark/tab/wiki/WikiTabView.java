package com.bytedance.ee.bear.lark.tab.wiki;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.tab.MainTabItemView;

public class WikiTabView extends MainTabItemView {
    /* renamed from: c */
    private void m32449c() {
        setId(R.id.wiki_tab);
        mo201235a(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_tab_wiki_filled, getResources().getColor(R.color.ud_N500)), new MainTabItemView.AbstractC59196a() {
            /* class com.bytedance.ee.bear.lark.tab.wiki.WikiTabView.C81311 */

            @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
            public Drawable getDrawable() {
                return WikiTabView.this.getResources().getDrawable(R.drawable.ud_icon_tab_wiki_colorful);
            }
        });
        setTabTitle(getResources().getString(R.string.Lark_Legacy_WikiTab));
    }

    public WikiTabView(Context context) {
        this(context, null);
    }

    public WikiTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WikiTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m32449c();
    }
}
