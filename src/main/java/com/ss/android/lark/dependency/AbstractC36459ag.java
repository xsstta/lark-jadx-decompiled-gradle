package com.ss.android.lark.dependency;

import android.app.Activity;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;

/* renamed from: com.ss.android.lark.dependency.ag */
public interface AbstractC36459ag {

    /* renamed from: com.ss.android.lark.dependency.ag$a */
    public interface AbstractC36460a {
        void onPin(boolean z);
    }

    /* renamed from: a */
    void mo134431a(Activity activity, MessageInfo messageInfo, Chat chat, Chatter chatter, AbstractC36460a aVar);
}
