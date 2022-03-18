package com.ss.android.lark.favorite.common.media.image;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.favorite.common.base.AbstractC37119a;

public class MediaMessageHolder extends AbstractC37119a {
    @BindView(7490)
    public FrameLayout mContentFrame;
    @BindView(7466)
    public SelectableRoundedImageView mImage;
    @BindView(8419)
    public ImageView mPlayLabel;

    @Override // com.ss.android.lark.favorite.common.base.AbstractC37119a
    /* renamed from: a */
    public void mo136728a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ButterKnife.bind(this, layoutInflater.inflate(R.layout.save_media_message_holder_layout, viewGroup, true));
    }
}
