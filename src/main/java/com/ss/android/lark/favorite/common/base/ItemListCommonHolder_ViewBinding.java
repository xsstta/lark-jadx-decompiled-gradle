package com.ss.android.lark.favorite.common.base;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatwindow.view.hover.HoverEventDisallowConstraintLayout;

public class ItemListCommonHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ItemListCommonHolder f95395a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ItemListCommonHolder itemListCommonHolder = this.f95395a;
        if (itemListCommonHolder != null) {
            this.f95395a = null;
            itemListCommonHolder.rootView = null;
            itemListCommonHolder.mFromTv = null;
            itemListCommonHolder.mTimeTv = null;
            itemListCommonHolder.mContentViewGroup = null;
            itemListCommonHolder.mBottomInfoViewGroup = null;
            itemListCommonHolder.mBottomInfoDivider = null;
            itemListCommonHolder.mHoverFuncZone = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ItemListCommonHolder_ViewBinding(ItemListCommonHolder itemListCommonHolder, View view) {
        this.f95395a = itemListCommonHolder;
        itemListCommonHolder.rootView = (HoverEventDisallowConstraintLayout) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'rootView'", HoverEventDisallowConstraintLayout.class);
        itemListCommonHolder.mFromTv = (TextView) Utils.findRequiredViewAsType(view, R.id.from_tv, "field 'mFromTv'", TextView.class);
        itemListCommonHolder.mTimeTv = (TextView) Utils.findRequiredViewAsType(view, R.id.time_tv, "field 'mTimeTv'", TextView.class);
        itemListCommonHolder.mContentViewGroup = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.content_layout, "field 'mContentViewGroup'", FrameLayout.class);
        itemListCommonHolder.mBottomInfoViewGroup = Utils.findRequiredView(view, R.id.bottom_info_wrapper, "field 'mBottomInfoViewGroup'");
        itemListCommonHolder.mBottomInfoDivider = Utils.findRequiredView(view, R.id.bottom_info_divider, "field 'mBottomInfoDivider'");
        itemListCommonHolder.mHoverFuncZone = (FavoriteHoverFuncView) Utils.findRequiredViewAsType(view, R.id.hover_func, "field 'mHoverFuncZone'", FavoriteHoverFuncView.class);
    }
}
