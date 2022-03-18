package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout;

public class AudioRecordPanel_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioRecordPanel f104683a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioRecordPanel audioRecordPanel = this.f104683a;
        if (audioRecordPanel != null) {
            this.f104683a = null;
            audioRecordPanel.mViewPager = null;
            audioRecordPanel.mSmartTabLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioRecordPanel_ViewBinding(AudioRecordPanel audioRecordPanel, View view) {
        this.f104683a = audioRecordPanel;
        audioRecordPanel.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.audio_viewpager, "field 'mViewPager'", ViewPager.class);
        audioRecordPanel.mSmartTabLayout = (SmartTabLayout) Utils.findRequiredViewAsType(view, R.id.viewpager_indicator, "field 'mSmartTabLayout'", SmartTabLayout.class);
    }
}
