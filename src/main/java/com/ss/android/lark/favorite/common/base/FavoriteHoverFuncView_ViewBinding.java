package com.ss.android.lark.favorite.common.base;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class FavoriteHoverFuncView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FavoriteHoverFuncView f95377a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FavoriteHoverFuncView favoriteHoverFuncView = this.f95377a;
        if (favoriteHoverFuncView != null) {
            this.f95377a = null;
            favoriteHoverFuncView.mForwardIcon = null;
            favoriteHoverFuncView.mDeleteIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FavoriteHoverFuncView_ViewBinding(FavoriteHoverFuncView favoriteHoverFuncView, View view) {
        this.f95377a = favoriteHoverFuncView;
        favoriteHoverFuncView.mForwardIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.forward_icon, "field 'mForwardIcon'", ImageView.class);
        favoriteHoverFuncView.mDeleteIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.delete_icon, "field 'mDeleteIcon'", ImageView.class);
    }
}
