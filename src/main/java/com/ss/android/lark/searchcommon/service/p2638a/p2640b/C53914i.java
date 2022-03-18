package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.bytedance.lark.pb.search.v1.SearchMessageMeta;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.i */
public class C53914i extends AbstractC53906a<SearchMessageInfo, SearchMessageMeta> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchMessageInfo mo184290a() {
        return new SearchMessageInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchMessageInfo searchMessageInfo, SearchMessageMeta searchMessageMeta) {
        searchMessageInfo.setMsgType(Message.Type.forNumber(searchMessageMeta.type.getValue()));
        searchMessageInfo.setUpdateTime(searchMessageMeta.update_time.longValue());
        searchMessageInfo.setPosition(searchMessageMeta.position.intValue());
        searchMessageInfo.setFromId(searchMessageMeta.from_id);
        searchMessageInfo.setFromName(searchMessageMeta.from_name);
        searchMessageInfo.setFromAvatarKey(searchMessageMeta.from_avatar_key);
        searchMessageInfo.setChatId(searchMessageMeta.chat_id);
        searchMessageInfo.setThreadId(searchMessageMeta.thread_id);
        searchMessageInfo.setMessageThreadPosition(searchMessageMeta.thread_position.intValue());
        searchMessageInfo.setThreadChatPosition(searchMessageMeta.thread_chat_position.intValue());
        searchMessageInfo.setP2pBotId(searchMessageMeta.p2p_bot_id);
        if (!CollectionUtils.isEmpty(searchMessageMeta.doc_extra_infos)) {
            ArrayList arrayList = new ArrayList();
            for (SearchMessageMeta.DocExtraInfo docExtraInfo : searchMessageMeta.doc_extra_infos) {
                Doc doc = new Doc();
                doc.setName(docExtraInfo.name);
                doc.setUrl(docExtraInfo.url);
                doc.setDocType(DocType.forNumber(docExtraInfo.type.getValue()));
                arrayList.add(doc);
            }
            searchMessageInfo.setMessageDocInfoList(arrayList);
        }
        searchMessageInfo.setP2pChat(searchMessageMeta.is_p2p_chat.booleanValue());
        searchMessageInfo.setP2pChatterId(searchMessageMeta.p2p_chatter_id.longValue());
    }
}
