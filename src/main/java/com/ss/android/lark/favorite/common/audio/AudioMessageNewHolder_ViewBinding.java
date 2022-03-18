package com.ss.android.lark.favorite.common.audio;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

public class AudioMessageNewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioMessageNewHolder f95339a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioMessageNewHolder audioMessageNewHolder = this.f95339a;
        if (audioMessageNewHolder != null) {
            this.f95339a = null;
            audioMessageNewHolder.mUnreadTipsIv = null;
            audioMessageNewHolder.mEditedTv = null;
            audioMessageNewHolder.mRecognizedTv = null;
            audioMessageNewHolder.mRecognizedFlag = null;
            audioMessageNewHolder.mPlayControlBar = null;
            audioMessageNewHolder.mAudioView = null;
            audioMessageNewHolder.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioMessageNewHolder_ViewBinding(AudioMessageNewHolder audioMessageNewHolder, View view) {
        this.f95339a = audioMessageNewHolder;
        audioMessageNewHolder.mUnreadTipsIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.unread_tip_iv, "field 'mUnreadTipsIv'", ImageView.class);
        audioMessageNewHolder.mEditedTv = (TextView) Utils.findRequiredViewAsType(view, R.id.edited_text_tv, "field 'mEditedTv'", TextView.class);
        audioMessageNewHolder.mRecognizedTv = (TextView) Utils.findRequiredViewAsType(view, R.id.recognized_text_tv, "field 'mRecognizedTv'", TextView.class);
        audioMessageNewHolder.mRecognizedFlag = (TextView) Utils.findRequiredViewAsType(view, R.id.recognized_text_flag, "field 'mRecognizedFlag'", TextView.class);
        audioMessageNewHolder.mPlayControlBar = (PlayControlBar) Utils.findRequiredViewAsType(view, R.id.play_cb, "field 'mPlayControlBar'", PlayControlBar.class);
        audioMessageNewHolder.mAudioView = Utils.findRequiredView(view, R.id.audio_view, "field 'mAudioView'");
        audioMessageNewHolder.mRootView = Utils.findRequiredView(view, R.id.root_view, "field 'mRootView'");
    }
}
