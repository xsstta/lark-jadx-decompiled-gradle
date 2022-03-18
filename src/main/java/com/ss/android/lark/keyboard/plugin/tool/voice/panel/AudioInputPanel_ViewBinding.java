package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.voice.AudioInputButton;

public class AudioInputPanel_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioInputPanel f104619a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioInputPanel audioInputPanel = this.f104619a;
        if (audioInputPanel != null) {
            this.f104619a = null;
            audioInputPanel.mRootView = null;
            audioInputPanel.mPanelView = null;
            audioInputPanel.mAudioInputBtn = null;
            audioInputPanel.mSwipeRightHintTv = null;
            audioInputPanel.mRecordTimeHintTv = null;
            audioInputPanel.mNoSwipeRightHintTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioInputPanel_ViewBinding(AudioInputPanel audioInputPanel, View view) {
        this.f104619a = audioInputPanel;
        audioInputPanel.mRootView = Utils.findRequiredView(view, R.id.root_view, "field 'mRootView'");
        audioInputPanel.mPanelView = Utils.findRequiredView(view, R.id.audio_input_panel, "field 'mPanelView'");
        audioInputPanel.mAudioInputBtn = (AudioInputButton) Utils.findRequiredViewAsType(view, R.id.audio_input_btn, "field 'mAudioInputBtn'", AudioInputButton.class);
        audioInputPanel.mSwipeRightHintTv = (TextView) Utils.findRequiredViewAsType(view, R.id.swipe_right_hint_tv, "field 'mSwipeRightHintTv'", TextView.class);
        audioInputPanel.mRecordTimeHintTv = (TextView) Utils.findRequiredViewAsType(view, R.id.record_time_hint_tv, "field 'mRecordTimeHintTv'", TextView.class);
        audioInputPanel.mNoSwipeRightHintTv = (TextView) Utils.findRequiredViewAsType(view, R.id.no_swipe_right_hint_tv, "field 'mNoSwipeRightHintTv'", TextView.class);
    }
}
