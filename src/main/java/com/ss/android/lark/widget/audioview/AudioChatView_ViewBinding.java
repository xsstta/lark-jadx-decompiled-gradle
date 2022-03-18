package com.ss.android.lark.widget.audioview;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class AudioChatView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioChatView f143482a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioChatView audioChatView = this.f143482a;
        if (audioChatView != null) {
            this.f143482a = null;
            audioChatView.mAudioContentView = null;
            audioChatView.mProgressBar = null;
            audioChatView.mVoicePlay = null;
            audioChatView.mDurationText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioChatView_ViewBinding(AudioChatView audioChatView, View view) {
        this.f143482a = audioChatView;
        audioChatView.mAudioContentView = Utils.findRequiredView(view, R.id.layout_audio_content, "field 'mAudioContentView'");
        audioChatView.mProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progressbar, "field 'mProgressBar'", ProgressBar.class);
        audioChatView.mVoicePlay = (ImageView) Utils.findRequiredViewAsType(view, R.id.voice_play, "field 'mVoicePlay'", ImageView.class);
        audioChatView.mDurationText = (TextView) Utils.findRequiredViewAsType(view, R.id.duration_text, "field 'mDurationText'", TextView.class);
    }
}
