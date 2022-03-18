package com.ss.android.lark.favorite.common.sticker;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import pl.droidsonroids.gif.GifImageView;

public class StickerMessageHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerMessageHolder f95514a;

    @Override // butterknife.Unbinder
    public void unbind() {
        StickerMessageHolder stickerMessageHolder = this.f95514a;
        if (stickerMessageHolder != null) {
            this.f95514a = null;
            stickerMessageHolder.mContentFrame = null;
            stickerMessageHolder.mImage = null;
            stickerMessageHolder.mSticker = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerMessageHolder_ViewBinding(StickerMessageHolder stickerMessageHolder, View view) {
        this.f95514a = stickerMessageHolder;
        stickerMessageHolder.mContentFrame = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.content_view, "field 'mContentFrame'", FrameLayout.class);
        stickerMessageHolder.mImage = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.common_iv, "field 'mImage'", SelectableRoundedImageView.class);
        stickerMessageHolder.mSticker = (GifImageView) Utils.findRequiredViewAsType(view, R.id.gif_iv, "field 'mSticker'", GifImageView.class);
    }
}
