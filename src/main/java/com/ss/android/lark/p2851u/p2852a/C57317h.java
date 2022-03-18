package com.ss.android.lark.p2851u.p2852a;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.MergeForwardContent;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterInfo;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.a.h */
public class C57317h {
    /* renamed from: a */
    public static Map<String, ChatterInfo> m222110a(Map<String, MergeForwardContent.ChatterInfo> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<MergeForwardContent.ChatterInfo, ChatterInfo>() {
            /* class com.ss.android.lark.p2851u.p2852a.C57317h.C573181 */

            /* renamed from: a */
            public ChatterInfo get(MergeForwardContent.ChatterInfo chatterInfo) {
                return C57317h.m222109a(chatterInfo);
            }
        });
    }

    /* renamed from: a */
    public static ChatterInfo m222109a(MergeForwardContent.ChatterInfo chatterInfo) {
        ChatterInfo chatterInfo2 = new ChatterInfo();
        chatterInfo2.setId(chatterInfo.id);
        chatterInfo2.setName(chatterInfo.name);
        chatterInfo2.setAvatarKey(chatterInfo.avatar_key);
        chatterInfo2.setAnonymous(chatterInfo.is_anonymous.booleanValue());
        if (chatterInfo.type == Chatter.Type.USER) {
            chatterInfo2.setType(Chatter.ChatterType.USER);
        } else {
            chatterInfo2.setType(Chatter.ChatterType.BOT);
        }
        return chatterInfo2;
    }
}
