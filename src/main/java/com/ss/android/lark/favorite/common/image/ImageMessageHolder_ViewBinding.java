package com.ss.android.lark.favorite.common.image;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import pl.droidsonroids.gif.GifImageView;

public class ImageMessageHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ImageMessageHolder f95440a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ImageMessageHolder imageMessageHolder = this.f95440a;
        if (imageMessageHolder != null) {
            this.f95440a = null;
            imageMessageHolder.mContentFrame = null;
            imageMessageHolder.mImage = null;
            imageMessageHolder.mSticker = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ImageMessageHolder_ViewBinding(ImageMessageHolder imageMessageHolder, View view) {
        this.f95440a = imageMessageHolder;
        imageMessageHolder.mContentFrame = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.content_view, "field 'mContentFrame'", FrameLayout.class);
        imageMessageHolder.mImage = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.common_iv, "field 'mImage'", SelectableRoundedImageView.class);
        imageMessageHolder.mSticker = (GifImageView) Utils.findRequiredViewAsType(view, R.id.gif_iv, "field 'mSticker'", GifImageView.class);
    }
}
