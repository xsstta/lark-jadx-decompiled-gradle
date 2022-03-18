package com.ss.android.lark.chat.api;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.p1670a.AbstractC34024a;
import java.util.List;
import java.util.Map;

public interface IChatterParser extends AbstractC34024a {
    C33982a getChatChatters(C14928Entity entity, String str);

    Chatter getChatter(com.bytedance.lark.pb.basic.v1.Chatter chatter);

    List<Chatter> getChatterList(List<com.bytedance.lark.pb.basic.v1.Chatter> list);

    Map<String, Chatter> getChatterMap(Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map);

    Map<String, Chatter> getChatterMapFromEntity(C14928Entity entity);
}
