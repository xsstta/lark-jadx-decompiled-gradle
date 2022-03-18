package com.ss.android.lark.favorite.common.text;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57876d;

/* renamed from: com.ss.android.lark.favorite.common.text.a */
public class C37169a {
    /* renamed from: a */
    public static void m146446a(Chatter chatter, Message message) {
        String str;
        if (chatter != null) {
            return;
        }
        if (message == null || message.getType() != Message.Type.SYSTEM) {
            if (message != null) {
                str = "MessageInfo->setMessageSender messageSender is empty " + "and messageId = " + message.getId();
            } else {
                str = "MessageInfo->setMessageSender messageSender is empty " + "and message is null";
            }
            C57876d.m224587b(new RuntimeException(str));
            return;
        }
        Log.m165378d("system message no messageSender, just return !!! ");
    }
}
