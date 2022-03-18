package com.ss.android.lark.p2851u.p2852a;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.im.v1.GetMessageReadStateResponse;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.dto.chat.MessageReadStateResponse;
import com.ss.android.lark.sdk.C53241h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.a.q */
public class C57328q {
    /* renamed from: a */
    public static MessageReadStateResponse m222184a(GetMessageReadStateResponse getMessageReadStateResponse) {
        C14928Entity entity = getMessageReadStateResponse.entity;
        GetMessageReadStateResponse.ReadState readState = getMessageReadStateResponse.read_state;
        if (entity == null || readState == null) {
            return null;
        }
        Map<String, ChatChatter> c = C57314g.m222106b(entity).mo124898c();
        return new MessageReadStateResponse(m222185a(readState.read_user_ids, c), m222185a(readState.unread_user_ids, c), new HashSet(readState.mention_user_ids), readState.read_count.intValue(), readState.unread_count.intValue(), readState.show_search_box.booleanValue(), readState.show_limited.booleanValue(), readState.column_count.intValue(), getMessageReadStateResponse.read_cursor, getMessageReadStateResponse.unread_cursor);
    }

    /* renamed from: a */
    private static List<ChatChatter> m222185a(List<String> list, Map<String, ChatChatter> map) {
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            ChatChatter chatChatter = map.get(str);
            if (chatChatter == null) {
                C53241h.m205894a("ModelParserReadState", "cannot get chatters, id: " + str);
            } else {
                arrayList.add(chatChatter);
            }
        }
        return arrayList;
    }
}
