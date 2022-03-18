package com.ss.android.lark.p2851u;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.ChatMailSetting;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.p2851u.p2852a.C57310e;
import com.ss.android.lark.p2851u.p2852a.C57314g;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.b */
public class C57341b implements IChatParser {
    @Override // com.ss.android.lark.chat.api.IChatParser
    public Chat getChat(com.bytedance.lark.pb.basic.v1.Chat chat) {
        return C57310e.m222078a(chat);
    }

    @Override // com.ss.android.lark.chat.api.IChatParser
    public List<Chat> getChatList(List<com.bytedance.lark.pb.basic.v1.Chat> list) {
        return C57310e.m222087a(list);
    }

    @Override // com.ss.android.lark.chat.api.IChatParser
    public Map<String, Chat> getChatMap(Map<String, com.bytedance.lark.pb.basic.v1.Chat> map) {
        return C57310e.m222093b(map);
    }

    @Override // com.ss.android.lark.chat.api.IChatParser
    public Chatter getChatter(com.bytedance.lark.pb.basic.v1.Chatter chatter) {
        return C57314g.m222098a(chatter);
    }

    @Override // com.ss.android.lark.chat.api.IChatParser
    public Map<String, Chatter> parseChatterMapFromEntity(C14928Entity entity) {
        return C57314g.m222104a(entity);
    }

    @Override // com.ss.android.lark.chat.api.IChatParser
    public Chat getChat(com.bytedance.lark.pb.basic.v1.Chat chat, Map<String, ChatMailSetting> map) {
        return C57310e.m222079a(chat, map);
    }
}
