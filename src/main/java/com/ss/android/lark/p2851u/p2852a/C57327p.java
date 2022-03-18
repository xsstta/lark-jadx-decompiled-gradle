package com.ss.android.lark.p2851u.p2852a;

import com.bytedance.lark.pb.basic.v1.MergeForwardContent;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.widget.linked_emojicon.base.C58503b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.a.p */
public class C57327p {
    /* renamed from: a */
    public static List<Reaction> m222182a(List<Message.Reaction> list) {
        return C26249aa.m94984a(list, $$Lambda$lctGWG5QY3WU0uJYg3tJLeXNOX8.INSTANCE);
    }

    /* renamed from: a */
    public static Reaction m222180a(Message.Reaction reaction) {
        return new Reaction(reaction.type, m222179a(reaction.chatter_count.intValue(), reaction.chatter_ids), reaction.chatter_ids, C58503b.m226968b(reaction.type));
    }

    /* renamed from: a */
    public static Reaction m222181a(PushMessageReactions.Reactions.Reaction reaction) {
        return new Reaction(reaction.type, m222179a(reaction.chatter_count.intValue(), reaction.chatter_ids), reaction.chatter_ids, C58503b.m226968b(reaction.type));
    }

    /* renamed from: a */
    public static Map<String, List<Reaction>> m222183a(Map<String, MergeForwardContent.MessageReaction> map) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(map)) {
            return hashMap;
        }
        for (MergeForwardContent.MessageReaction messageReaction : map.values()) {
            ArrayList arrayList = new ArrayList();
            for (MergeForwardContent.Reaction reaction : messageReaction.reactions) {
                arrayList.add(new Reaction(reaction.type, reaction.count.intValue(), reaction.chatter_ids, C58503b.m226968b(reaction.type)));
            }
            hashMap.put(messageReaction.message_id, arrayList);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static int m222179a(int i, List<String> list) {
        if (i > 0) {
            return i;
        }
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return list.size();
    }
}
