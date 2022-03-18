package com.ss.android.lark.favorite.common.media.image;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;

public class MediaMessageHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MediaMessageHolder f95451a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MediaMessageHolder mediaMessageHolder = this.f95451a;
        if (mediaMessageHolder != null) {
            this.f95451a = null;
            mediaMessageHolder.mContentFrame = null;
            mediaMessageHolder.mImage = null;
            mediaMessageHolder.mPlayLabel = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MediaMessageHolder_ViewBinding(MediaMessageHolder mediaMessageHolder, View view) {
        this.f95451a = mediaMessageHolder;
        mediaMessageHolder.mContentFrame = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.content_view, "field 'mContentFrame'", FrameLayout.class);
        mediaMessageHolder.mImage = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.common_iv, "field 'mImage'", SelectableRoundedImageView.class);
        mediaMessageHolder.mPlayLabel = (ImageView) Utils.findRequiredViewAsType(view, R.id.play_label, "field 'mPlayLabel'", ImageView.class);
    }
}
