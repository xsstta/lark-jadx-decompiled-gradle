package com.bytedance.ee.bear.lark.notification.docfeed;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.lark.p414b.AbstractC8001l;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.DocEntity;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.doc.entity.C36836a;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.doc.entity.DocMessage;
import com.ss.android.lark.doc.entity.DocPermission;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.ThumbnailDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.notification.docfeed.h */
public class C8056h implements AbstractC8055g {

    /* renamed from: com.bytedance.ee.bear.lark.notification.docfeed.h$a */
    private static final class C8059a {

        /* renamed from: a */
        public static final C8056h f21579a = new C8056h();
    }

    /* renamed from: a */
    public static C8056h m32190a() {
        return C8059a.f21579a;
    }

    /* renamed from: a */
    private static DocPermission m32193a(int i) {
        DocPermission docPermission = new DocPermission();
        docPermission.setIsSet(true);
        docPermission.setPermCode(i);
        return docPermission;
    }

    /* renamed from: d */
    private static boolean m32200d(Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C36836a m32195a(C14928Entity entity) {
        C36836a aVar = new C36836a();
        if (entity == null) {
            return aVar;
        }
        Map<String, DocFeed> a = m32196a(entity.doc_feeds);
        Map<String, DocMessage> b = m32198b(entity.doc_messages);
        aVar.mo135952a(a);
        aVar.mo135954b(b);
        return aVar;
    }

    /* renamed from: a */
    public static Map<String, DocFeed> m32196a(Map<String, com.bytedance.lark.pb.basic.v1.DocFeed> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.basic.v1.DocFeed, DocFeed>() {
            /* class com.bytedance.ee.bear.lark.notification.docfeed.C8056h.C80571 */

            /* renamed from: a */
            public DocFeed get(com.bytedance.lark.pb.basic.v1.DocFeed docFeed) {
                return C8056h.m32191a(docFeed);
            }
        });
    }

    /* renamed from: a */
    public static DocFeed m32191a(com.bytedance.lark.pb.basic.v1.DocFeed docFeed) {
        if (docFeed == null) {
            return null;
        }
        DocFeed docFeed2 = new DocFeed();
        docFeed2.setId(docFeed.id);
        docFeed2.setTitle(docFeed.title);
        docFeed2.setType(DocType.forNumber(docFeed.type.getValue()));
        docFeed2.setIconKey(docFeed.icon_key);
        docFeed2.setUrl(docFeed.doc_url);
        docFeed2.setCreateTime(docFeed.create_time.longValue());
        docFeed2.setUpdateTime(docFeed.update_time.longValue());
        docFeed2.setOwnerId(docFeed.owner_id);
        docFeed2.setNewMessageCount(docFeed.new_message_count.intValue());
        docFeed2.setDocMessageIds(new ArrayList(docFeed.doc_message_ids));
        docFeed2.setRemind(docFeed.is_remind.booleanValue());
        docFeed2.setCrossTenant(docFeed.is_cross_tenant.booleanValue());
        return docFeed2;
    }

    /* renamed from: b */
    public static Map<String, DocMessage> m32198b(Map<String, com.bytedance.lark.pb.basic.v1.DocMessage> map) {
        Map<String, Chatter> b;
        Map<String, DocMessage> a = C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.basic.v1.DocMessage, DocMessage>() {
            /* class com.bytedance.ee.bear.lark.notification.docfeed.C8056h.C80582 */

            /* renamed from: a */
            public DocMessage get(com.bytedance.lark.pb.basic.v1.DocMessage docMessage) {
                return C8056h.m32192a(docMessage);
            }
        });
        if (a != null && !a.isEmpty()) {
            Map<String, List<String>> c = m32199c(a);
            if (c.isEmpty()) {
                return a;
            }
            AbstractC8001l lVar = (AbstractC8001l) KoinJavaComponent.m268610a(AbstractC8001l.class);
            m32197a(a, c, lVar.mo31006a(new ArrayList(c.keySet())));
            if (!c.isEmpty() && (b = lVar.mo31013b(new ArrayList(c.keySet()))) != null) {
                m32197a(a, c, b);
            }
        }
        return a;
    }

    /* renamed from: c */
    private static Map<String, List<String>> m32199c(Map<String, DocMessage> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            DocMessage docMessage = map.get(str);
            if (docMessage != null && TextUtils.isEmpty(docMessage.getFromName())) {
                String fromId = docMessage.getFromId();
                List list = (List) hashMap.get(fromId);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(str);
                hashMap.put(fromId, list);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static DocMessage m32192a(com.bytedance.lark.pb.basic.v1.DocMessage docMessage) {
        if (docMessage == null) {
            return null;
        }
        DocMessage docMessage2 = new DocMessage();
        docMessage2.setId(docMessage.id);
        docMessage2.setType(DocMessage.Type.forNumber(docMessage.type.getValue()));
        docMessage2.setCreateTime(docMessage.create_time.longValue());
        docMessage2.setUpdateTime(docMessage.update_time.longValue());
        docMessage2.setContent(docMessage.content);
        docMessage2.setDocFeedId(docMessage.doc_feed_id);
        String str = docMessage.from_id;
        docMessage2.setFromId(str);
        if (TextUtils.isEmpty(str)) {
        }
        return docMessage2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    @Override // com.bytedance.ee.bear.lark.notification.docfeed.AbstractC8055g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.doc.entity.DocResult mo31150a(java.lang.String r17, com.bytedance.lark.pb.basic.v1.C14928Entity r18) {
        /*
        // Method dump skipped, instructions count: 399
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.lark.notification.docfeed.C8056h.mo31150a(java.lang.String, com.bytedance.lark.pb.basic.v1.Entity):com.ss.android.lark.doc.entity.DocResult");
    }

    /* renamed from: a */
    private ThumbnailDetail m32194a(C14928Entity entity, String str, Map<String, com.bytedance.lark.pb.basic.v1.DocPermission> map) {
        HashMap hashMap = new HashMap();
        try {
            for (DocEntity.ElementEntity elementEntity : entity.messages.get(str).content.doc_entity.element_entity_ref.values()) {
                hashMap.put(elementEntity.doc_url, map.get(elementEntity.doc_url));
            }
            map = hashMap;
        } catch (Exception e) {
            C13479a.m54761a("ModelParserDoc", e);
        }
        if (map.size() != 1) {
            C13479a.m54764b("ModelParserDoc", "map.size() ==" + map.size());
            return null;
        }
        com.bytedance.lark.pb.basic.v1.DocPermission next = map.values().iterator().next();
        if (next == null) {
            C13479a.m54758a("ModelParserDoc", "docPermission == null");
            return null;
        }
        String str2 = next.thumbnail_detail;
        if (!TextUtils.isEmpty(str2)) {
            return (ThumbnailDetail) JSON.parseObject(str2, ThumbnailDetail.class);
        }
        C13479a.m54758a("ModelParserDoc", "TextUtils.isEmpty(detail) == true");
        return null;
    }

    /* renamed from: a */
    private static void m32197a(Map<String, DocMessage> map, Map<String, List<String>> map2, Map<String, Chatter> map3) {
        String str;
        if (!(m32200d(map3) || m32200d(map2) || m32200d(map3))) {
            for (String str2 : map3.keySet()) {
                Chatter chatter = map3.get(str2);
                for (String str3 : map2.remove(str2)) {
                    DocMessage docMessage = map.get(str3);
                    if (docMessage != null) {
                        if (chatter == null) {
                            str = "";
                        } else {
                            str = chatter.getLocalizedName();
                        }
                        docMessage.setFromName(str);
                    }
                }
            }
        }
    }
}
