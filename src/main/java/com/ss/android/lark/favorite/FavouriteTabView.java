package com.ss.android.lark.favorite;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.tab.MainTabItemView;

public class FavouriteTabView extends MainTabItemView {
    /* renamed from: c */
    private void m146248c() {
        setTabTitle(getResources().getString(R.string.Lark_Legacy_SaveFavorite));
        setId(R.id.favourite_tab);
        mo201235a(getResources().getDrawable(R.drawable.ic_tab_favourite_normal_desktop), new MainTabItemView.AbstractC59196a(R.drawable.ic_tab_favourite_checked_desktop) {
            /* class com.ss.android.lark.favorite.FavouriteTabView.C370751 */

            @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
            public Drawable getDrawable() {
                return FavouriteTabView.this.getResources().getDrawable(R.drawable.ic_tab_favourite_checked_desktop);
            }
        });
    }

    public FavouriteTabView(Context context) {
        this(context, null);
    }

    public FavouriteTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FavouriteTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m146248c();
    }
}
