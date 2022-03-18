package com.ss.android.lark.sticker.ui.emoticon.preview;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import pl.droidsonroids.gif.GifImageView;

public class StickerPreviewView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerPreviewView f136226a;

    @Override // butterknife.Unbinder
    public void unbind() {
        StickerPreviewView stickerPreviewView = this.f136226a;
        if (stickerPreviewView != null) {
            this.f136226a = null;
            stickerPreviewView.mTitleBar = null;
            stickerPreviewView.mIvContent = null;
            stickerPreviewView.mTvStickerDesc = null;
            stickerPreviewView.mViewLine = null;
            stickerPreviewView.mLayoutBottom = null;
            stickerPreviewView.mTvTitle = null;
            stickerPreviewView.mTvDesc = null;
            stickerPreviewView.mTvAdd = null;
            stickerPreviewView.mPbDownloadProgress = null;
            stickerPreviewView.mIvCover = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerPreviewView_ViewBinding(StickerPreviewView stickerPreviewView, View view) {
        this.f136226a = stickerPreviewView;
        stickerPreviewView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.sticker_set_view_preview_titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        stickerPreviewView.mIvContent = (GifImageView) Utils.findRequiredViewAsType(view, R.id.sticker_set_iv_content, "field 'mIvContent'", GifImageView.class);
        stickerPreviewView.mTvStickerDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_tv_sticker_desc, "field 'mTvStickerDesc'", TextView.class);
        stickerPreviewView.mViewLine = Utils.findRequiredView(view, R.id.sticker_set_view_line, "field 'mViewLine'");
        stickerPreviewView.mLayoutBottom = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.sticker_set_rl_preview_bottom, "field 'mLayoutBottom'", RelativeLayout.class);
        stickerPreviewView.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_tv_title, "field 'mTvTitle'", TextView.class);
        stickerPreviewView.mTvDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_set_tv_desc, "field 'mTvDesc'", TextView.class);
        stickerPreviewView.mTvAdd = (TextView) Utils.findRequiredViewAsType(view, R.id.sticker_tv_add, "field 'mTvAdd'", TextView.class);
        stickerPreviewView.mPbDownloadProgress = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.sticker_set_pb_download, "field 'mPbDownloadProgress'", ProgressBar.class);
        stickerPreviewView.mIvCover = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.sticker_set_iv_cover, "field 'mIvCover'", SelectableRoundedImageView.class);
    }
}
