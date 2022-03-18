package com.ss.android.lark.feed.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.view.C37961a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.MainTabItemView;

public class FeedTabView extends MainTabItemView {
    /* renamed from: c */
    public void mo137108c() {
        C37961a aVar = (C37961a) getRedDotView();
        if (aVar != null) {
            aVar.mo139017a();
        }
    }

    /* renamed from: d */
    private void m146893d() {
        final int i;
        int i2;
        setId(R.id.feed_tab);
        if (DesktopUtil.m144301a(getContext())) {
            i2 = R.drawable.ic_tab_inbox_normal_desktop;
            i = R.drawable.ic_tab_inbox_checked_desktop;
        } else {
            i2 = R.drawable.ud_icon_tab_chat_filled;
            i = R.drawable.ud_icon_tab_chat_colorful;
        }
        mo201235a(UDIconUtils.getIconDrawable(getContext(), i2, getResources().getColor(R.color.ud_N500)), new MainTabItemView.AbstractC59196a() {
            /* class com.ss.android.lark.feed.app.FeedTabView.C372831 */

            @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
            public Drawable getDrawable() {
                return UDIconUtils.getIconDrawable(FeedTabView.this.getContext(), i);
            }
        });
        setRedDotView(new C37961a(getContext()));
        setTabTitle(UIHelper.getString(R.string.Lark_Legacy_MessengerTab));
    }

    public FeedTabView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo137107a(boolean z) {
        C37961a aVar = (C37961a) getRedDotView();
        if (aVar != null) {
            aVar.mo139019a(z);
            aVar.mo139017a();
        }
    }

    public FeedTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m146893d();
    }
}
