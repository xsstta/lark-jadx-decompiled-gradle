package com.ss.android.lark.searchcommon.service.p2645c;

import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.search.v1.SearchMessageMeta;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.searchcommon.service.entity.p2646a.C53946a;
import com.ss.android.lark.searchcommon.service.entity.p2646a.C53947b;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53907b;
import com.ss.android.lark.searchcommon.service.p2645c.AbstractC53928d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.lark.searchcommon.service.c.i */
public class C53934i extends AbstractC53928d {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.searchcommon.service.p2645c.AbstractC53928d
    /* renamed from: a */
    public int mo184362a(int i) {
        return 10000001;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.searchcommon.service.p2645c.AbstractC53928d
    /* renamed from: a */
    public Map<Integer, AbstractC53928d.C53929a> mo184361a(C53947b bVar) {
        HashMap hashMap = new HashMap();
        Map a = mo184366a(bVar.mo184468c());
        HashMap hashMap2 = new HashMap();
        Iterator it = a.values().iterator();
        while (it.hasNext()) {
            SearchMessageMeta searchMessageMeta = (SearchMessageMeta) it.next();
            if (searchMessageMeta.type == Message.Type.FILE) {
                FileContent fileContent = null;
                if (searchMessageMeta.file_meta != null) {
                    fileContent = C53907b.m208922a(searchMessageMeta.file_meta);
                }
                hashMap2.put(searchMessageMeta.id, new C53946a(searchMessageMeta.update_time.longValue(), searchMessageMeta.position.intValue(), searchMessageMeta.chat_id, searchMessageMeta.from_id, fileContent, searchMessageMeta.is_p2p_chat.booleanValue(), searchMessageMeta.p2p_chatter_id.longValue(), searchMessageMeta.thread_id, searchMessageMeta.thread_position.intValue()));
                it = it;
            }
        }
        hashMap.put(10000001, new AbstractC53928d.C53929a(hashMap2));
        return hashMap;
    }
}
