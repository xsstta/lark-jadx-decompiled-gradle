package com.ss.android.lark.sticker.ui.emoticon.detail;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class StickerSetDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerSetDetailView f136150a;

    @Override // butterknife.Unbinder
    public void unbind() {
        StickerSetDetailView stickerSetDetailView = this.f136150a;
        if (stickerSetDetailView != null) {
            this.f136150a = null;
            stickerSetDetailView.mTitleBar = null;
            stickerSetDetailView.mLoadingLayout = null;
            stickerSetDetailView.mIvBg = null;
            stickerSetDetailView.mTvTitle = null;
            stickerSetDetailView.mTvDesc = null;
            stickerSetDetailView.mRcvStickerSet = null;
            stickerSetDetailView.mTvStatus = null;
            stickerSetDetailView.mPbDownload = null;
            stickerSetDetailView.mViewContent = null;
            stickerSetDetailView.mViewEmpty = null;
            stickerSetDetailView.mIvError = null;
            stickerSetDetailView.mTvError = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerSetDetailView_ViewBinding(StickerSetDetailView stickerSetDetailView, View view) {
        this.f136150a = stickerSetDetailView;
        stickerSetDetailView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.sticker_set_view_detail_titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        stickerSetDetailView.mLoadingLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.sticker_set_detail_loading, "field 'mLoadingLayout'", FrameLayout.class);
        stickerSetDetailView.mIvBg = (ImageView) Utils.findRequiredViewAsType(view, R.id.sticker_set_iv_bg, "field 'mIvBg'", ImageView.class);
        stickerSetDetailView.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_tv_title, "field 'mTvTitle'", TextView.class);
        stickerSetDetailView.mTvDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_tv_desc, "field 'mTvDesc'", TextView.class);
        stickerSetDetailView.mRcvStickerSet = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.sticker_set_rv_stickers, "field 'mRcvStickerSet'", RecyclerView.class);
        stickerSetDetailView.mTvStatus = (LKUIButton) Utils.findRequiredViewAsType(view, R.id.sticker_set_tv_status, "field 'mTvStatus'", LKUIButton.class);
        stickerSetDetailView.mPbDownload = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.sticker_set_pb_download, "field 'mPbDownload'", ProgressBar.class);
        stickerSetDetailView.mViewContent = Utils.findRequiredView(view, R.id.sticker_set_scv_content, "field 'mViewContent'");
        stickerSetDetailView.mViewEmpty = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.sticker_set_ll_empty, "field 'mViewEmpty'", LinearLayout.class);
        stickerSetDetailView.mIvError = (ImageView) Utils.findRequiredViewAsType(view, R.id.sticker_set_detail_error_icon, "field 'mIvError'", ImageView.class);
        stickerSetDetailView.mTvError = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_detail_error_text, "field 'mTvError'", TextView.class);
    }
}
