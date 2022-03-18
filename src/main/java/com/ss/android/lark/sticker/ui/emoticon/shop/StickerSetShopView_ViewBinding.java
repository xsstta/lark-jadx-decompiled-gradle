package com.ss.android.lark.sticker.ui.emoticon.shop;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class StickerSetShopView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerSetShopView f136267a;

    @Override // butterknife.Unbinder
    public void unbind() {
        StickerSetShopView stickerSetShopView = this.f136267a;
        if (stickerSetShopView != null) {
            this.f136267a = null;
            stickerSetShopView.mTitleBar = null;
            stickerSetShopView.mRvStickerSet = null;
            stickerSetShopView.mLayoutEmpty = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerSetShopView_ViewBinding(StickerSetShopView stickerSetShopView, View view) {
        this.f136267a = stickerSetShopView;
        stickerSetShopView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.sticker_view_sticker_set_shop_titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        stickerSetShopView.mRvStickerSet = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.sticker_rv_sticker_set_shop, "field 'mRvStickerSet'", RecyclerView.class);
        stickerSetShopView.mLayoutEmpty = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.sticker_ll_sticker_set_empty, "field 'mLayoutEmpty'", LinearLayout.class);
    }
}
