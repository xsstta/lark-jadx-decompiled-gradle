package com.ss.android.lark.widget.lark_chat_keyboard.widget;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class AudioWaveBar_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioWaveBar f144018a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioWaveBar audioWaveBar = this.f144018a;
        if (audioWaveBar != null) {
            this.f144018a = null;
            audioWaveBar.mWaveView = null;
            audioWaveBar.mDurationTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioWaveBar_ViewBinding(AudioWaveBar audioWaveBar, View view) {
        this.f144018a = audioWaveBar;
        audioWaveBar.mWaveView = (AudioWaveView) Utils.findRequiredViewAsType(view, R.id.wave_view, "field 'mWaveView'", AudioWaveView.class);
        audioWaveBar.mDurationTv = (TextView) Utils.findRequiredViewAsType(view, R.id.duration_tv, "field 'mDurationTv'", TextView.class);
    }
}
