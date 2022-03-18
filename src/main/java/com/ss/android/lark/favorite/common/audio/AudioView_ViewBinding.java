package com.ss.android.lark.favorite.common.audio;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class AudioView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioView f95344a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioView audioView = this.f95344a;
        if (audioView != null) {
            this.f95344a = null;
            audioView.mRootView = null;
            audioView.mPlayZone = null;
            audioView.mVoicePlayIV = null;
            audioView.mDurationTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioView_ViewBinding(AudioView audioView, View view) {
        this.f95344a = audioView;
        audioView.mRootView = Utils.findRequiredView(view, R.id.root, "field 'mRootView'");
        audioView.mPlayZone = Utils.findRequiredView(view, R.id.play_zone, "field 'mPlayZone'");
        audioView.mVoicePlayIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.voice_play, "field 'mVoicePlayIV'", ImageView.class);
        audioView.mDurationTV = (TextView) Utils.findRequiredViewAsType(view, R.id.duration, "field 'mDurationTV'", TextView.class);
    }
}
