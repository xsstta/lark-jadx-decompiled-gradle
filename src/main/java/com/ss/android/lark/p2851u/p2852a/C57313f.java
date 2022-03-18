package com.ss.android.lark.p2851u.p2852a;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.ChatShareInfo;
import com.ss.android.lark.doc.entity.DocType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.u.a.f */
public class C57313f {
    /* renamed from: a */
    public static List<ChatShareInfo> m222097a(List<com.bytedance.lark.pb.basic.v1.ChatShareInfo> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        Iterator<com.bytedance.lark.pb.basic.v1.ChatShareInfo> it = list.iterator();
        while (it.hasNext()) {
            com.bytedance.lark.pb.basic.v1.ChatShareInfo next = it.next();
            if (next != null) {
                String str = next.id;
                ChatShareInfo.ShareType a = ChatShareInfo.ShareType.Companion.mo124662a(next.type.getValue());
                ChatShareInfo.ShareStatus a2 = ChatShareInfo.ShareStatus.Companion.mo124657a(next.status.getValue());
                ChatShareInfo.ShareTargetType.Companion aVar = ChatShareInfo.ShareTargetType.Companion;
                if (next.target_type != null) {
                    i = next.target_type.getValue();
                } else {
                    i = -1;
                }
                arrayList = arrayList;
                arrayList.add(new ChatShareInfo(str, a, a2, aVar.mo124660a(i), next.share_chat_id, next.token, next.create_time, next.expire_time, new ChatShareInfo.ShareChatterExtra(next.share_chatter_extra.share_chatter_id, next.share_chatter_extra.name, next.share_chatter_extra.avatar_key), new ChatShareInfo.QrCodeExtra(next.qr_code_extra.shared_url), new ChatShareInfo.TargetDocExtra(next.target_doc_extra.doc_url, next.target_doc_extra.doc_name, DocType.forNumber(next.target_doc_extra.doc_type.getValue()), next.target_doc_extra.unauthorized.booleanValue()), new ChatShareInfo.TargetChatExtra(next.target_chat_extra.chat_id, next.target_chat_extra.chat_name), new ChatShareInfo.TargetChatterExtra(next.target_chatter_extra.chatter_id, next.target_chatter_extra.name)));
                it = it;
            }
        }
        return arrayList;
    }
}
