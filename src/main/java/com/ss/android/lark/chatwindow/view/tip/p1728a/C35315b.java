package com.ss.android.lark.chatwindow.view.tip.p1728a;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatwindow.view.tip.AbstractC35310a;
import java.util.Objects;

/* renamed from: com.ss.android.lark.chatwindow.view.tip.a.b */
public class C35315b implements AbstractC35310a.AbstractC35312b<MessageInfo> {
    /* renamed from: a */
    public int mo122236a(MessageInfo messageInfo) {
        Message message = messageInfo.getMessage();
        if (message.isPreMessage()) {
            return -1;
        }
        return message.getThreadBadgeCount();
    }

    /* renamed from: a */
    public boolean mo122238a(String str, MessageInfo messageInfo) {
        return Objects.equals(str, messageInfo.getMessage().getId());
    }
}
