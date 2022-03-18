package com.ss.android.lark.p2851u;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.p2851u.p2852a.C57314g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.c */
public class C57342c implements IChatterParser {
    @Override // com.ss.android.lark.chat.api.IChatterParser
    public Chatter getChatter(com.bytedance.lark.pb.basic.v1.Chatter chatter) {
        return C57314g.m222098a(chatter);
    }

    @Override // com.ss.android.lark.chat.api.IChatterParser
    public List<Chatter> getChatterList(List<com.bytedance.lark.pb.basic.v1.Chatter> list) {
        return C57314g.m222103a(list);
    }

    @Override // com.ss.android.lark.chat.api.IChatterParser
    public Map<String, Chatter> getChatterMap(Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map) {
        return C57314g.m222105a(map);
    }

    @Override // com.ss.android.lark.chat.api.IChatterParser
    public Map<String, Chatter> getChatterMapFromEntity(C14928Entity entity) {
        return C57314g.m222104a(entity);
    }

    @Override // com.ss.android.lark.chat.export.p1670a.AbstractC34024a
    /* renamed from: a */
    public Map<String, OpenChatter> mo126082a(Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(getChatterMap(map));
        return hashMap;
    }

    @Override // com.ss.android.lark.chat.api.IChatterParser
    public C33982a getChatChatters(C14928Entity entity, String str) {
        return C57314g.m222100a(entity, str);
    }
}
