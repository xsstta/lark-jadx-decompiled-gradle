package com.ss.android.lark.chatwindow.view.viewholder;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

public class AudioMessageContentNewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioMessageContentNewHolder f91304a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioMessageContentNewHolder audioMessageContentNewHolder = this.f91304a;
        if (audioMessageContentNewHolder != null) {
            this.f91304a = null;
            audioMessageContentNewHolder.mUnreadTipsIv = null;
            audioMessageContentNewHolder.mEditedTv = null;
            audioMessageContentNewHolder.mRecognizedTv = null;
            audioMessageContentNewHolder.mRecognizedFlag = null;
            audioMessageContentNewHolder.mPlayControlBar = null;
            audioMessageContentNewHolder.mAudioView = null;
            audioMessageContentNewHolder.mTranslateStub = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioMessageContentNewHolder_ViewBinding(AudioMessageContentNewHolder audioMessageContentNewHolder, View view) {
        this.f91304a = audioMessageContentNewHolder;
        audioMessageContentNewHolder.mUnreadTipsIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.unread_tip_iv, "field 'mUnreadTipsIv'", ImageView.class);
        audioMessageContentNewHolder.mEditedTv = (TextView) Utils.findRequiredViewAsType(view, R.id.edited_text_tv, "field 'mEditedTv'", TextView.class);
        audioMessageContentNewHolder.mRecognizedTv = (TextView) Utils.findRequiredViewAsType(view, R.id.recognized_text_tv, "field 'mRecognizedTv'", TextView.class);
        audioMessageContentNewHolder.mRecognizedFlag = (TextView) Utils.findRequiredViewAsType(view, R.id.recognized_text_flag, "field 'mRecognizedFlag'", TextView.class);
        audioMessageContentNewHolder.mPlayControlBar = (PlayControlBar) Utils.findRequiredViewAsType(view, R.id.play_cb, "field 'mPlayControlBar'", PlayControlBar.class);
        audioMessageContentNewHolder.mAudioView = Utils.findRequiredView(view, R.id.audio_view, "field 'mAudioView'");
        audioMessageContentNewHolder.mTranslateStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.text_translate_content, "field 'mTranslateStub'", ViewStub.class);
    }
}
