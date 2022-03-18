package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J$\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardHideJudge;", "", "()V", "isBotUnchatable", "", "openApp", "Lcom/ss/android/lark/biz/im/api/OpenApp;", "isChatKeyboardHide", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "isOtherDismission", "isUnChatable", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.h */
public final class KeyboardHideJudge {

    /* renamed from: a */
    public static final KeyboardHideJudge f85065a = new KeyboardHideJudge();

    private KeyboardHideJudge() {
    }

    /* renamed from: a */
    private final boolean m127774a(OpenApp openApp) {
        if (openApp == null || openApp.getChatable() != OpenApp.Chatable.UNCHATABLE) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m127775a(Chat chat) {
        if (chat == null || !chat.isChatable()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m127776a(Chatter chatter) {
        if (chatter == null || !chatter.isDimission()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo122099a(Chat chat, Chatter chatter, OpenApp openApp) {
        if (m127776a(chatter) || m127775a(chat) || m127774a(openApp)) {
            return true;
        }
        return false;
    }
}
