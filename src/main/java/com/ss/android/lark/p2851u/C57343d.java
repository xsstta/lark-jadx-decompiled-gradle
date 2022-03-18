package com.ss.android.lark.p2851u;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.p2851u.p2852a.C57322k;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.d */
public class C57343d implements AbstractC32810b {
    @Override // com.ss.android.lark.chat.api.AbstractC32810b
    /* renamed from: b */
    public Map<String, Message> mo120948b(C14928Entity entity) {
        return C57322k.m222132b(entity);
    }

    @Override // com.ss.android.lark.chat.api.AbstractC32810b
    /* renamed from: a */
    public Map<String, MessageInfo> mo120947a(C14928Entity entity) {
        return C57322k.m222126a(entity);
    }

    @Override // com.ss.android.lark.chat.api.AbstractC32810b
    /* renamed from: a */
    public Message mo120945a(C14928Entity entity, String str) {
        return C57322k.m222120a(entity, str);
    }

    @Override // com.ss.android.lark.chat.api.AbstractC32810b
    /* renamed from: a */
    public List<Message> mo120946a(C14928Entity entity, List<String> list) {
        return C57322k.m222131b(entity, list);
    }
}
