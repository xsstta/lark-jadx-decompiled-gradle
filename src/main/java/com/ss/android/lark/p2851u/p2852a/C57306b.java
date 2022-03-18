package com.ss.android.lark.p2851u.p2852a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.QuasiMessage;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.api.service.AbstractC32901c;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.entity.chatter.AccessInfo;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.lark.u.a.b */
public class C57306b {

    /* renamed from: a */
    private static AbstractC32901c f141164a = C32835d.m126323c();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.u.a.b$a */
    public static class C57307a {

        /* renamed from: a */
        public String f141165a;

        /* renamed from: b */
        public StringBuilder f141166b;

        public int hashCode() {
            return this.f141165a.hashCode();
        }

        public String toString() {
            return "chatterId is:" + this.f141165a + ", fromTag is:" + this.f141166b.toString();
        }

        /* renamed from: a */
        public void mo194433a(String str) {
            StringBuilder sb = this.f141166b;
            sb.append("|");
            sb.append(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C57307a)) {
                return false;
            }
            return Objects.equals(this.f141165a, ((C57307a) obj).f141165a);
        }

        public C57307a(String str, String str2) {
            this.f141165a = str;
            this.f141166b = new StringBuilder(str2);
        }
    }

    /* renamed from: a */
    private static boolean m222064a(Content.SystemType systemType) {
        if (systemType == Content.SystemType.USER_CALL_E2EE_VOICE_DURATION || systemType == Content.SystemType.USER_CALL_E2EE_VOICE_ON_CANCELL || systemType == Content.SystemType.USER_CALL_E2EE_VOICE_ON_MISSING || systemType == Content.SystemType.USER_CALL_E2EE_VOICE_WHEN_OCCUPY || systemType == Content.SystemType.USER_CALL_E2EE_VOICE_WHEN_REFUSED) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Chatter m222065b(String str) {
        Chatter chatter = new Chatter();
        chatter.setId(str);
        chatter.setName(UIHelper.getString(R.string.Lark_Legacy_UserUnknown));
        return chatter;
    }

    /* renamed from: a */
    private static ChatChatter m222057a(String str) {
        Chatter chatter = new Chatter();
        chatter.setAccessInfo(new AccessInfo());
        chatter.setAvatarKey("1a6b000560475123acd0");
        chatter.setCreatorId("6398000646401818882");
        chatter.setEnName("System Message");
        chatter.setId("1");
        chatter.setLocalizedName("System msg");
        chatter.setNamePinyin("xi tong xiao xi");
        chatter.setNamePy("xi tong xiao xi");
        chatter.setTenantId("1");
        chatter.setType(Chatter.ChatterType.BOT);
        chatter.setWithBotTag("bot");
        ChatChatter chatChatter = new ChatChatter(chatter);
        chatChatter.setChatId(str);
        return chatChatter;
    }

    /* renamed from: b */
    private static void m222066b(C33982a aVar, Map<String, Map<String, C57307a>> map) {
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, Map<String, C57307a>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Map<String, C57307a>> next = it.next();
                Map<String, C57307a> value = next.getValue();
                Map<String, ChatChatter> a = f141164a.mo121188a(next.getKey(), new ArrayList(value.keySet()));
                if (a != null) {
                    Iterator<String> it2 = value.keySet().iterator();
                    while (it2.hasNext()) {
                        ChatChatter chatChatter = a.get(it2.next());
                        if (chatChatter != null) {
                            aVar.mo124895a(chatChatter);
                            it2.remove();
                        }
                    }
                    if (value.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static void m222067c(C33982a aVar, Map<String, Map<String, C57307a>> map) {
        if (!CollectionUtils.isEmpty(map)) {
            Iterator<Map.Entry<String, Map<String, C57307a>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map<String, C57307a> value = it.next().getValue();
                Iterator<String> it2 = value.keySet().iterator();
                while (it2.hasNext()) {
                    Chatter b = m222065b(it2.next());
                    if (b != null) {
                        aVar.mo124895a(b);
                        it2.remove();
                    }
                }
                if (value.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m222061a(C33982a aVar, Map<String, Map<String, C57307a>> map) {
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, Map<String, C57307a>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Map<String, C57307a>> next = it.next();
                Map<String, C57307a> value = next.getValue();
                Map<String, ChatChatter> b = f141164a.mo121204b(next.getKey(), new ArrayList(value.keySet()));
                Iterator<String> it2 = value.keySet().iterator();
                while (it2.hasNext()) {
                    ChatChatter chatChatter = b.get(it2.next());
                    if (chatChatter != null) {
                        aVar.mo124895a(chatChatter);
                        it2.remove();
                    }
                }
                if (value.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m222063a(Map<String, Map<String, C57307a>> map, String str) {
        if (CollectionUtils.isNotEmpty(map)) {
            boolean z = false;
            StringBuilder sb = new StringBuilder("missedChatterIdsMap not empty: ");
            for (Map.Entry<String, Map<String, C57307a>> entry : map.entrySet()) {
                sb.append(" chatId: ");
                sb.append(entry.getKey());
                sb.append("[");
                Map<String, C57307a> value = entry.getValue();
                if (CollectionUtils.isNotEmpty(value)) {
                    z = true;
                    for (C57307a aVar : value.values()) {
                        sb.append(" chatterId: ");
                        sb.append(aVar.f141165a);
                        sb.append(" fromTag: ");
                        sb.append((CharSequence) aVar.f141166b);
                    }
                }
                sb.append("]");
            }
            if (z) {
                Log.m165397w("EntityAPI", sb.toString());
                ChatHitPoint.f135648a.mo187362b(str, sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static C33982a m222058a(C14928Entity entity, boolean z, String str) {
        C33982a b = C57314g.m222106b(entity);
        HashMap hashMap = new HashMap(entity.messages);
        if (entity.ephemeral_messages.size() > 0) {
            hashMap.putAll(entity.ephemeral_messages);
        }
        HashMap hashMap2 = new HashMap();
        for (Message message : hashMap.values()) {
            HashMap hashMap3 = new HashMap();
            for (Message.Reaction reaction : message.reactions) {
                m222060a(b, message.chat_id, hashMap3, reaction.chatter_ids, "reaction");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(message.ack_urgent_chatter_ids);
            arrayList.addAll(message.unack_urgent_chatter_ids);
            if (!CollectionUtils.isEmpty(arrayList)) {
                m222060a(b, message.chat_id, hashMap3, arrayList, "ding");
            }
            m222059a(b, message.chat_id, hashMap3, message.from_id, "fromId");
            if (!TextUtils.isEmpty(message.original_sender_id)) {
                m222059a(b, message.chat_id, hashMap3, message.original_sender_id, "forward");
            }
            if (!TextUtils.isEmpty(message.recaller_id)) {
                m222059a(b, message.chat_id, hashMap3, message.recaller_id, "recallerId");
            }
            if (message.type == Message.Type.SYSTEM) {
                Content content = message.content;
                if (content != null && content.system_type == Content.SystemType.USER_CHECK_OTHERS_TELEPHONE) {
                    Map<String, String> map = content.values;
                    String str2 = map.get("caller_id");
                    String str3 = map.get("callee_id");
                    if (!(str2 == null || str3 == null)) {
                        m222059a(b, message.chat_id, hashMap3, str2, "SystemContent.fromChatterId");
                        m222059a(b, message.chat_id, hashMap3, str3, "SystemContent.toChatterId");
                    }
                } else if (content != null && m222064a(content.system_type)) {
                    String str4 = content.e2ee_from_id;
                    String str5 = content.e2ee_to_id;
                    if (!(str4 == null || str5 == null)) {
                        m222059a(b, message.chat_id, hashMap3, str4, "VoipContent.fromChatterId");
                        m222059a(b, message.chat_id, hashMap3, str5, "VoipContent.toChatterId");
                    }
                    String str6 = content.trigger_id;
                    if (str6 != null) {
                        m222059a(b, message.chat_id, hashMap3, str6, "VoipContent.triggerId");
                    }
                } else if (content != null && (content.system_type == Content.SystemType.VC_CALL_DURATION || content.system_type == Content.SystemType.VC_CALL_FINISH_NOTICE || content.system_type == Content.SystemType.VC_CALL_HOST_BUSY || content.system_type == Content.SystemType.VC_CALL_HOST_CANCEL || content.system_type == Content.SystemType.VC_CALL_PARTI_BUSY || content.system_type == Content.SystemType.VC_CALL_PARTI_CANCEL || content.system_type == Content.SystemType.VC_CALL_PARTI_NO_ANSWER)) {
                    String str7 = content.vc_from_id;
                    String str8 = content.vc_to_id;
                    if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                        m222059a(b, message.chat_id, hashMap3, str7, "VcCallDuration.fromChatterId");
                        m222059a(b, message.chat_id, hashMap3, str8, "VcCallDuration.toChatterId");
                    }
                }
            } else if (message.type == Message.Type.AUDIO) {
                Content content2 = message.content;
                if (!TextUtils.isEmpty(content2.origin_sender_id_str)) {
                    m222059a(b, message.chat_id, hashMap3, content2.origin_sender_id_str, "AUDIO.origin_sender_id_str");
                }
            } else if (message.type == Message.Type.SHARE_USER_CARD) {
                Content content3 = message.content;
                if (!TextUtils.isEmpty(content3.share_chatter_id)) {
                    m222059a(b, message.chat_id, hashMap3, content3.share_chatter_id, "SHARE_USER_CARD.share_chatter_id");
                }
            }
            m222062a(hashMap2, b, message.chat_id, hashMap3);
        }
        Map<String, QuasiMessage> map2 = entity.quasi_messages;
        if (!CollectionUtils.isEmpty(map2)) {
            Iterator<QuasiMessage> it = map2.values().iterator();
            if (it.hasNext()) {
                QuasiMessage next = it.next();
                HashMap hashMap4 = new HashMap();
                hashMap4.put(next.from_id, new C57307a(next.from_id, "quasiMessage"));
                m222062a(hashMap2, b, next.chat_id, hashMap4);
            }
        }
        m222063a(hashMap2, str);
        m222061a(b, hashMap2);
        if (z && !CollectionUtils.isEmpty(hashMap2)) {
            m222066b(b, hashMap2);
        }
        m222063a(hashMap2, str);
        if (CollectionUtils.isNotEmpty(hashMap2)) {
            m222067c(b, hashMap2);
        }
        return b;
    }

    /* renamed from: a */
    private static void m222062a(Map<String, Map<String, C57307a>> map, C33982a aVar, String str, Map<String, C57307a> map2) {
        Map<String, C57307a> map3;
        if (!map2.isEmpty()) {
            if (map.containsKey(str)) {
                map3 = map.get(str);
            } else {
                HashMap hashMap = new HashMap();
                map.put(str, hashMap);
                map3 = hashMap;
            }
            for (C57307a aVar2 : map2.values()) {
                m222059a(aVar, str, map3, aVar2.f141165a, aVar2.f141166b.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m222059a(C33982a aVar, String str, Map<String, C57307a> map, String str2, String str3) {
        m222060a(aVar, str, map, Collections.singletonList(str2), str3);
    }

    /* renamed from: a */
    private static void m222060a(C33982a aVar, String str, Map<String, C57307a> map, List<String> list, String str2) {
        for (String str3 : list) {
            if (!aVar.mo124897b(str, str3)) {
                if (Objects.equals(str3, "1")) {
                    aVar.mo124895a(m222057a(str));
                } else {
                    C57307a aVar2 = map.get(str3);
                    if (aVar2 == null) {
                        map.put(str3, new C57307a(str3, str2));
                    } else {
                        aVar2.mo194433a(str2);
                    }
                }
            }
        }
    }
}
