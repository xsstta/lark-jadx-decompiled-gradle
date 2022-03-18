package com.ss.android.lark.favorite.common.audio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.favorite.common.base.AbstractC37119a;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

public class AudioMessageNewHolder extends AbstractC37119a {
    @BindView(7232)
    public View mAudioView;
    @BindView(7634)
    public TextView mEditedTv;
    @BindView(8418)
    public PlayControlBar mPlayControlBar;
    @BindView(8506)
    public TextView mRecognizedFlag;
    @BindView(8507)
    public TextView mRecognizedTv;
    @BindView(8599)
    public View mRootView;
    @BindView(9214)
    public ImageView mUnreadTipsIv;

    @Override // com.ss.android.lark.favorite.common.base.AbstractC37119a
    /* renamed from: a */
    public void mo136728a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ButterKnife.bind(this, layoutInflater.inflate(R.layout.audio_content_item_layout, viewGroup, true));
    }

    /* renamed from: a */
    public TextView mo136733a(boolean z, boolean z2) {
        int i;
        int i2;
        int i3 = 8;
        if (!z) {
            this.mEditedTv.setVisibility(8);
            this.mRecognizedTv.setVisibility(8);
            this.mRecognizedFlag.setVisibility(8);
        } else {
            TextView textView = this.mEditedTv;
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            TextView textView2 = this.mRecognizedTv;
            if (z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            TextView textView3 = this.mRecognizedFlag;
            if (!z2) {
                i3 = 0;
            }
            textView3.setVisibility(i3);
        }
        if (z2) {
            return this.mEditedTv;
        }
        return this.mRecognizedTv;
    }
}
