package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

public class AudioViewNewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioViewNewHolder f128415a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioViewNewHolder audioViewNewHolder = this.f128415a;
        if (audioViewNewHolder != null) {
            this.f128415a = null;
            audioViewNewHolder.mUnreadTipsIv = null;
            audioViewNewHolder.mRecognizedTv = null;
            audioViewNewHolder.mPlayControlBar = null;
            audioViewNewHolder.mAudioView = null;
            audioViewNewHolder.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioViewNewHolder_ViewBinding(AudioViewNewHolder audioViewNewHolder, View view) {
        this.f128415a = audioViewNewHolder;
        audioViewNewHolder.mUnreadTipsIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.unread_tip_iv, "field 'mUnreadTipsIv'", ImageView.class);
        audioViewNewHolder.mRecognizedTv = (TextView) Utils.findRequiredViewAsType(view, R.id.recognized_text_rt, "field 'mRecognizedTv'", TextView.class);
        audioViewNewHolder.mPlayControlBar = (PlayControlBar) Utils.findRequiredViewAsType(view, R.id.play_cb, "field 'mPlayControlBar'", PlayControlBar.class);
        audioViewNewHolder.mAudioView = Utils.findRequiredView(view, R.id.audio_view, "field 'mAudioView'");
        audioViewNewHolder.mRootView = Utils.findRequiredView(view, R.id.root_view, "field 'mRootView'");
    }
}
