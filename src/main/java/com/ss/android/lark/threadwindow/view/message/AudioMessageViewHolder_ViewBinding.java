package com.ss.android.lark.threadwindow.view.message;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

public class AudioMessageViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AudioMessageViewHolder f138959a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AudioMessageViewHolder audioMessageViewHolder = this.f138959a;
        if (audioMessageViewHolder != null) {
            this.f138959a = null;
            audioMessageViewHolder.mUnreadTipsIv = null;
            audioMessageViewHolder.mEditedTv = null;
            audioMessageViewHolder.mRecognizedTv = null;
            audioMessageViewHolder.mRecognizedFlag = null;
            audioMessageViewHolder.mPlayControlBar = null;
            audioMessageViewHolder.mAudioView = null;
            audioMessageViewHolder.mTranslateStub = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AudioMessageViewHolder_ViewBinding(AudioMessageViewHolder audioMessageViewHolder, View view) {
        this.f138959a = audioMessageViewHolder;
        audioMessageViewHolder.mUnreadTipsIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.unread_tip_iv, "field 'mUnreadTipsIv'", ImageView.class);
        audioMessageViewHolder.mEditedTv = (TextView) Utils.findRequiredViewAsType(view, R.id.edited_text_tv, "field 'mEditedTv'", TextView.class);
        audioMessageViewHolder.mRecognizedTv = (TextView) Utils.findRequiredViewAsType(view, R.id.recognized_text_tv, "field 'mRecognizedTv'", TextView.class);
        audioMessageViewHolder.mRecognizedFlag = (TextView) Utils.findRequiredViewAsType(view, R.id.recognized_text_flag, "field 'mRecognizedFlag'", TextView.class);
        audioMessageViewHolder.mPlayControlBar = (PlayControlBar) Utils.findRequiredViewAsType(view, R.id.play_cb, "field 'mPlayControlBar'", PlayControlBar.class);
        audioMessageViewHolder.mAudioView = Utils.findRequiredView(view, R.id.audio_view, "field 'mAudioView'");
        audioMessageViewHolder.mTranslateStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.text_translate_content, "field 'mTranslateStub'", ViewStub.class);
    }
}
