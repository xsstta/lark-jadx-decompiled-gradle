package com.ss.android.lark.sticker.ui.emoticon.manager;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class StickerSetManagerView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerSetManagerView f136195a;

    @Override // butterknife.Unbinder
    public void unbind() {
        StickerSetManagerView stickerSetManagerView = this.f136195a;
        if (stickerSetManagerView != null) {
            this.f136195a = null;
            stickerSetManagerView.mRootView = null;
            stickerSetManagerView.mTitleBar = null;
            stickerSetManagerView.mLayoutCustomAddedSticker = null;
            stickerSetManagerView.mTvStickerSetTitle = null;
            stickerSetManagerView.mRvStickerSet = null;
            stickerSetManagerView.mRecvTopLine = null;
            stickerSetManagerView.mRecvBottomLine = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerSetManagerView_ViewBinding(StickerSetManagerView stickerSetManagerView, View view) {
        this.f136195a = stickerSetManagerView;
        stickerSetManagerView.mRootView = Utils.findRequiredView(view, R.id.sticker_set_root_view, "field 'mRootView'");
        stickerSetManagerView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.sticker_set_view_manager_titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        stickerSetManagerView.mLayoutCustomAddedSticker = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.sticker_set_rl_single, "field 'mLayoutCustomAddedSticker'", RelativeLayout.class);
        stickerSetManagerView.mTvStickerSetTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_tv_chat_panel, "field 'mTvStickerSetTitle'", TextView.class);
        stickerSetManagerView.mRvStickerSet = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.sticker_set_recv_stickers, "field 'mRvStickerSet'", RecyclerView.class);
        stickerSetManagerView.mRecvTopLine = Utils.findRequiredView(view, R.id.sticker_set_manager_recv_top, "field 'mRecvTopLine'");
        stickerSetManagerView.mRecvBottomLine = Utils.findRequiredView(view, R.id.sticker_set_manager_recv_bottom, "field 'mRecvBottomLine'");
    }
}
