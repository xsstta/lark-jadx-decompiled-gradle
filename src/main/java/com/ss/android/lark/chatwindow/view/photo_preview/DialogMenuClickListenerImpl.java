package com.ss.android.lark.chatwindow.view.photo_preview;

import android.app.Activity;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;

public class DialogMenuClickListenerImpl implements OnDialogMenuClickListener {
    private String mChatId;

    public DialogMenuClickListenerImpl(String str) {
        this.mChatId = str;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener
    public void onJumpToChatClicked(String str) {
        C35228b.m137564a().mo121114a(C29990c.m110930b().mo134528a(), ChatBundle.m109259a().mo105927a(this.mChatId).mo105923a(ChatBundle.SourceType.SEARCH).mo105937e(str).mo105933c("gallery").mo105929a());
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener
    public void onDecodeQRCodeClicked(String str, Activity activity) {
        C29990c.m110930b().mo134545a(str, activity);
    }
}
