package com.ss.android.lark.favorite.detail;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class FavoriteDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FavoriteDetailView f95558a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FavoriteDetailView favoriteDetailView = this.f95558a;
        if (favoriteDetailView != null) {
            this.f95558a = null;
            favoriteDetailView.mTitleBar = null;
            favoriteDetailView.mSaveBoxContentRV = null;
            favoriteDetailView.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FavoriteDetailView_ViewBinding(FavoriteDetailView favoriteDetailView, View view) {
        this.f95558a = favoriteDetailView;
        favoriteDetailView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        favoriteDetailView.mSaveBoxContentRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.savebox_detail_rv, "field 'mSaveBoxContentRV'", RecyclerView.class);
        favoriteDetailView.mRootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", ViewGroup.class);
    }
}
