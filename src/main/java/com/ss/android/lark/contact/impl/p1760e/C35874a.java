package com.ss.android.lark.contact.impl.p1760e;

import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.contact.dto.ChatApplication;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.e.a */
public class C35874a {
    /* renamed from: a */
    public static List<ChatApplication> m140581a(List<com.bytedance.lark.pb.basic.v1.ChatApplication> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.basic.v1.ChatApplication, ChatApplication>() {
            /* class com.ss.android.lark.contact.impl.p1760e.C35874a.C358751 */

            /* renamed from: a */
            public ChatApplication get(com.bytedance.lark.pb.basic.v1.ChatApplication chatApplication) {
                return C35874a.m140580a(chatApplication);
            }
        });
    }

    /* renamed from: a */
    public static ChatApplication m140580a(com.bytedance.lark.pb.basic.v1.ChatApplication chatApplication) {
        if (chatApplication == null) {
            return null;
        }
        ChatApplication chatApplication2 = new ChatApplication();
        chatApplication2.setId(chatApplication.id);
        chatApplication2.setApplyTime(chatApplication.apply_time.longValue());
        chatApplication2.setChatId(chatApplication.chat_id);
        if (chatApplication.contact_summary != null) {
            chatApplication2.setExternalContactSummary(C35877c.m140603a(chatApplication.contact_summary));
        }
        chatApplication2.setExtraMessage(chatApplication.extra_message);
        chatApplication2.setProcessedTime(chatApplication.processed_time.longValue());
        chatApplication2.setRead(chatApplication.is_read.booleanValue());
        chatApplication2.setStatus(ChatApplication.Status.forNumber(chatApplication.status.getValue()));
        chatApplication2.setType(ChatApplication.Type.forNumber(chatApplication.type.getValue()));
        return chatApplication2;
    }
}
