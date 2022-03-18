package com.ss.android.lark.favorite;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.tab.NavigationTabItemView;

public class FavouriteNavTabView extends NavigationTabItemView {
    /* renamed from: a */
    private void m146247a() {
        setTabIcon(getContext().getDrawable(R.drawable.icon_nav_tab_favourite));
        setTabTitle(getResources().getString(R.string.Lark_Legacy_SaveFavorite));
        setId(R.id.favourite_tab);
    }

    public FavouriteNavTabView(Context context) {
        this(context, null);
    }

    public FavouriteNavTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FavouriteNavTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m146247a();
    }
}
