package com.ss.android.lark.keyboard.plugin.tool.voice;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class AudioInputBar_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioInputBar f104407a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioInputBar audioInputBar = this.f104407a;
        if (audioInputBar != null) {
            this.f104407a = null;
            audioInputBar.mRootView = null;
            audioInputBar.mAudioIconIV = null;
            audioInputBar.mAudioHintTV = null;
            audioInputBar.mAudioDurationTV = null;
            audioInputBar.mAudioWaveView = null;
            audioInputBar.mAudioCountDownTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioInputBar_ViewBinding(AudioInputBar audioInputBar, View view) {
        this.f104407a = audioInputBar;
        audioInputBar.mRootView = Utils.findRequiredView(view, R.id.root_view, "field 'mRootView'");
        audioInputBar.mAudioIconIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.audio_input_icon, "field 'mAudioIconIV'", ImageView.class);
        audioInputBar.mAudioHintTV = (TextView) Utils.findRequiredViewAsType(view, R.id.audio_input_hint, "field 'mAudioHintTV'", TextView.class);
        audioInputBar.mAudioDurationTV = (TextView) Utils.findRequiredViewAsType(view, R.id.audio_input_duration, "field 'mAudioDurationTV'", TextView.class);
        audioInputBar.mAudioWaveView = (AudioWaveLineView) Utils.findRequiredViewAsType(view, R.id.audio_wave_view, "field 'mAudioWaveView'", AudioWaveLineView.class);
        audioInputBar.mAudioCountDownTV = (TextView) Utils.findRequiredViewAsType(view, R.id.audio_input_countdown, "field 'mAudioCountDownTV'", TextView.class);
    }
}
