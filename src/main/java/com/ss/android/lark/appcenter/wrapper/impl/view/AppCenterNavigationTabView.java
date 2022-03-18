package com.ss.android.lark.appcenter.wrapper.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.NavigationTabItemView;

public class AppCenterNavigationTabView extends NavigationTabItemView {
    /* renamed from: a */
    private void m107232a() {
        setTabIcon(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_tab_app_filled, UIHelper.getColor(R.color.ud_T500)));
        setTabTitle(getContext().getString(R.string.Lark_Legacy_AppCenter));
        if (!DesktopUtil.m144301a(getContext())) {
            setRedDotView(new AppCenterBadgeRedDotView(getContext()));
        }
    }

    public AppCenterNavigationTabView(Context context) {
        this(context, null);
    }

    public AppCenterNavigationTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCenterNavigationTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m107232a();
    }
}
