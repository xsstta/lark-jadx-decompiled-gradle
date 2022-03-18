package com.ss.android.lark.p2851u.p2852a;

import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.dto.draft.Draft;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.a.i */
public class C57319i {
    /* renamed from: a */
    public static Map<String, Draft> m222113a(Map<String, com.bytedance.lark.pb.basic.v1.Draft> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.basic.v1.Draft, Draft>() {
            /* class com.ss.android.lark.p2851u.p2852a.C57319i.C573201 */

            /* renamed from: a */
            public Draft get(com.bytedance.lark.pb.basic.v1.Draft draft) {
                return C57319i.m222112a(draft);
            }
        });
    }

    /* renamed from: a */
    public static Draft m222112a(com.bytedance.lark.pb.basic.v1.Draft draft) {
        if (draft == null) {
            return null;
        }
        Draft draft2 = new Draft();
        draft2.id = draft.id;
        draft2.chatId = draft.chat_id;
        draft2.messageId = draft.message_id;
        try {
            Draft draft3 = (Draft) JSONObject.parseObject(draft.content, Draft.class);
            draft2.title = draft3.title;
            draft2.contentRichText = draft3.contentRichText;
            draft2.postRichText = draft3.postRichText;
            draft2.createTime = draft3.createTime;
            draft2.type = draft3.type;
            draft2.topicGroupId = draft3.topicGroupId;
            return draft2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
