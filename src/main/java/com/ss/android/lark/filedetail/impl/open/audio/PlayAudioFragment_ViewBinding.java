package com.ss.android.lark.filedetail.impl.open.audio;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class PlayAudioFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PlayAudioFragment f98328a;

    @Override // butterknife.Unbinder
    public void unbind() {
        PlayAudioFragment playAudioFragment = this.f98328a;
        if (playAudioFragment != null) {
            this.f98328a = null;
            playAudioFragment.mCommonTitleBar = null;
            playAudioFragment.mFileNameTv = null;
            playAudioFragment.mAudioPlayBtn = null;
            playAudioFragment.mCurrentPlayTime = null;
            playAudioFragment.mAudioDuration = null;
            playAudioFragment.mSeekBar = null;
            playAudioFragment.mAudioPanelIv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PlayAudioFragment_ViewBinding(PlayAudioFragment playAudioFragment, View view) {
        this.f98328a = playAudioFragment;
        playAudioFragment.mCommonTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mCommonTitleBar'", CommonTitleBar.class);
        playAudioFragment.mFileNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.fileNameTv, "field 'mFileNameTv'", TextView.class);
        playAudioFragment.mAudioPlayBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.audio_operator, "field 'mAudioPlayBtn'", ImageView.class);
        playAudioFragment.mCurrentPlayTime = (TextView) Utils.findRequiredViewAsType(view, R.id.current_play_time, "field 'mCurrentPlayTime'", TextView.class);
        playAudioFragment.mAudioDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.audio_duration, "field 'mAudioDuration'", TextView.class);
        playAudioFragment.mSeekBar = (SeekBar) Utils.findRequiredViewAsType(view, R.id.audio_seek, "field 'mSeekBar'", SeekBar.class);
        playAudioFragment.mAudioPanelIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.audio_panel_iv, "field 'mAudioPanelIv'", ImageView.class);
    }
}
