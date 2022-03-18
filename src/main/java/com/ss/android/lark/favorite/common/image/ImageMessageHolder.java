package com.ss.android.lark.favorite.common.image;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.favorite.common.base.AbstractC37119a;
import pl.droidsonroids.gif.GifImageView;

public class ImageMessageHolder extends AbstractC37119a {
    @BindView(7490)
    public FrameLayout mContentFrame;
    @BindView(7466)
    public SelectableRoundedImageView mImage;
    @BindView(7764)
    public GifImageView mSticker;

    @Override // com.ss.android.lark.favorite.common.base.AbstractC37119a
    /* renamed from: a */
    public void mo136728a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ButterKnife.bind(this, layoutInflater.inflate(R.layout.save_image_message_holder_layout, viewGroup, true));
        this.mSticker.setVisibility(8);
    }
}
