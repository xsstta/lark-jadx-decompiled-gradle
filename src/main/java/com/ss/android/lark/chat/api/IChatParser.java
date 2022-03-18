package com.ss.android.lark.chat.api;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.ChatMailSetting;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.util.List;
import java.util.Map;

public interface IChatParser {
    Chat getChat(com.bytedance.lark.pb.basic.v1.Chat chat);

    Chat getChat(com.bytedance.lark.pb.basic.v1.Chat chat, Map<String, ChatMailSetting> map);

    List<Chat> getChatList(List<com.bytedance.lark.pb.basic.v1.Chat> list);

    Map<String, Chat> getChatMap(Map<String, com.bytedance.lark.pb.basic.v1.Chat> map);

    Chatter getChatter(com.bytedance.lark.pb.basic.v1.Chatter chatter);

    Map<String, Chatter> parseChatterMapFromEntity(C14928Entity entity);
}
