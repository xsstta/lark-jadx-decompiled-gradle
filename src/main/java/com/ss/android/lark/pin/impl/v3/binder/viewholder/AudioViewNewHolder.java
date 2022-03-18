package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

public class AudioViewNewHolder extends AbstractC51540b.C51541a {
    @BindView(6390)
    public View mAudioView;
    @BindView(7122)
    public PlayControlBar mPlayControlBar;
    @BindView(7172)
    public TextView mRecognizedTv;
    @BindView(7219)
    public View mRootView;
    @BindView(7590)
    public ImageView mUnreadTipsIv;

    private AudioViewNewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.AudioViewNewHolder$a */
    public static class C51596a {
        /* renamed from: a */
        public static AudioViewNewHolder m200235a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new AudioViewNewHolder(layoutInflater.inflate(R.layout.chatpin_item_audio_new2, viewGroup, false));
        }
    }
}
