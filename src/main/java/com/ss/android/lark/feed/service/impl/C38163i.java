package com.ss.android.lark.feed.service.impl;

import com.bytedance.lark.pb.basic.v1.Message;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.widget.linked_emojicon.base.C58503b;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.service.impl.i */
public class C38163i {
    /* renamed from: a */
    public static List<Reaction> m150036a(List<Message.Reaction> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<Message.Reaction, Reaction>() {
            /* class com.ss.android.lark.feed.service.impl.C38163i.C381641 */

            /* renamed from: a */
            public Reaction get(Message.Reaction reaction) {
                return C38163i.m150035a(reaction);
            }
        });
    }

    /* renamed from: a */
    public static Reaction m150035a(Message.Reaction reaction) {
        return new Reaction(reaction.type, m150034a(reaction.chatter_count.intValue(), reaction.chatter_ids), reaction.chatter_ids, C58503b.m226968b(reaction.type));
    }

    /* renamed from: a */
    private static int m150034a(int i, List<String> list) {
        if (i > 0) {
            return i;
        }
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return list.size();
    }
}
