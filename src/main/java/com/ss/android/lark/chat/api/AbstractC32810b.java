package com.ss.android.lark.chat.api;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.api.b */
public interface AbstractC32810b {
    /* renamed from: a */
    Message mo120945a(C14928Entity entity, String str);

    /* renamed from: a */
    List<Message> mo120946a(C14928Entity entity, List<String> list);

    /* renamed from: a */
    Map<String, MessageInfo> mo120947a(C14928Entity entity);

    /* renamed from: b */
    Map<String, Message> mo120948b(C14928Entity entity);
}
