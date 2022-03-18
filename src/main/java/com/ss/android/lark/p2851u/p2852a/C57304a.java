package com.ss.android.lark.p2851u.p2852a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Message;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.Pin;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.a.a */
public class C57304a {
    /* renamed from: a */
    public static void m222050a(Message message, C14928Entity entity, C33982a aVar, MessageInfo messageInfo, Map<String, MessageInfo> map) {
        String parentId = message.getParentId();
        message.getChatId();
        if (!TextUtils.isEmpty(parentId)) {
            if (map == null || !map.containsKey(parentId)) {
                messageInfo.setParentMessageInfo(m222046a(parentId, entity, aVar));
            } else {
                messageInfo.setParentMessageInfo(map.get(parentId));
            }
        }
        String rootId = message.getRootId();
        if (TextUtils.isEmpty(rootId)) {
            return;
        }
        if (map == null || !map.containsKey(rootId)) {
            messageInfo.setRootMessageInfo(m222046a(rootId, entity, aVar));
        } else {
            messageInfo.setRootMessageInfo(map.get(rootId));
        }
    }

    /* renamed from: a */
    public static void m222051a(Message message, C33982a aVar) {
        ChatChatter a;
        if (message != null && message.getType() == Message.Type.SHARE_USER_CARD) {
            String chatId = message.getChatId();
            ProfileContent profileContent = (ProfileContent) message.getContent();
            if (profileContent != null && !TextUtils.isEmpty(profileContent.getId()) && TextUtils.isEmpty(profileContent.getDisplayName()) && (a = aVar.mo124892a(chatId, profileContent.getId())) != null) {
                profileContent.setAvatarKey(a.getAvatarKey());
                profileContent.setDisplayName(a.getLocalizedName());
                profileContent.setChatterType(a.getType());
                profileContent.setTenantId(a.getTenantId());
            }
        }
    }

    /* renamed from: c */
    public static ChatChatter m222054c(Message message, C33982a aVar) {
        if (message == null || message.getOriginalSenderId() == null || message.getOriginalSenderId().isEmpty() || message.getOriginalSenderId().equals(message.getFromId())) {
            return null;
        }
        return aVar.mo124892a(message.getChatId(), message.getOriginalSenderId());
    }

    /* renamed from: b */
    public static void m222053b(Message message, C33982a aVar) {
        SystemContent systemContent;
        if (message != null && message.getType() == Message.Type.SYSTEM && (systemContent = (SystemContent) message.getContent()) != null) {
            if (systemContent.getType() == SystemMessageType.USER_CHECK_OTHERS_TELEPHONE || systemContent.getType() == SystemMessageType.SystemContent_CHECK_USER_PHONE_NUMBER || systemContent.isVoIPSystemMessage() || systemContent.isVCSystemMessage()) {
                String fromChatterId = systemContent.getFromChatterId();
                String toChatterId = systemContent.getToChatterId();
                if (!TextUtils.isEmpty(toChatterId) && !TextUtils.isEmpty(fromChatterId)) {
                    String chatId = message.getChatId();
                    ChatChatter a = aVar.mo124892a(chatId, fromChatterId);
                    if (a != null) {
                        systemContent.setFromChatter(a);
                    }
                    ChatChatter a2 = aVar.mo124892a(chatId, toChatterId);
                    if (a2 != null) {
                        systemContent.setToChatter(a2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m222052a(Message message, MessageInfo messageInfo, C33982a aVar) {
        String recallerId = message.getRecallerId();
        if (!TextUtils.isEmpty(recallerId)) {
            messageInfo.setRecallUser(aVar.mo124892a(message.getChatId(), recallerId));
        }
    }

    /* renamed from: a */
    private static MessageInfo m222046a(String str, C14928Entity entity, C33982a aVar) {
        Message a = C57322k.m222120a(entity, str);
        if (a == null) {
            Log.m165378d("parseMessageInfo message not found == " + str);
            return null;
        }
        String chatId = a.getChatId();
        ChatChatter a2 = aVar.mo124892a(chatId, a.getFromId());
        if (a2 == null) {
            Log.m165378d("parseMessageInfo chatter not found == " + a.getFromId());
            return null;
        }
        MessageInfo messageInfo = new MessageInfo(a, a2);
        String recallerId = a.getRecallerId();
        if (!TextUtils.isEmpty(recallerId)) {
            messageInfo.setRecallUser(aVar.mo124892a(chatId, recallerId));
        }
        messageInfo.setTranslateInfo(C57336y.m222236a(a, entity));
        return messageInfo;
    }

    /* renamed from: a */
    public static Pin m222047a(Message.Pin pin, String str, C33982a aVar) {
        if (pin == null) {
            return null;
        }
        ChatChatter a = aVar.mo124892a(str, pin.operator_id);
        if (a != null) {
            String nickName = a.getNickName();
            a.setNickName("");
            String a2 = C34340h.m133174a(a, ChatterNameDisplayRule.NICKNAME_NAME);
            a.setNickName(nickName);
            return new Pin(pin.id, a.getId(), C34340h.m133174a(a, ChatterNameDisplayRule.NICKNAME_NAME), a2, pin.timestamp.longValue());
        }
        Log.m165382e("parsePinFromPb chatChatter == null ,chatId=" + str + " ; chatterId=" + pin.operator_id);
        return null;
    }

    /* renamed from: a */
    public static List<ReactionInfo> m222048a(C33982a aVar, String str, List<Reaction> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Reaction reaction : list) {
            List<String> chatterIds = reaction.getChatterIds();
            HashMap hashMap = new HashMap();
            for (String str2 : chatterIds) {
                ChatChatter a = aVar.mo124892a(str, str2);
                if (a != null) {
                    hashMap.put(str2, a);
                }
            }
            arrayList.add(new ReactionInfo(reaction, hashMap));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m222049a(com.bytedance.lark.pb.basic.v1.Message message, MessageInfo messageInfo, C33982a aVar) {
        if (message.is_urgent.booleanValue()) {
            DingStatus dingStatus = new DingStatus();
            dingStatus.setMessageId(messageInfo.getMessage().getId());
            if (messageInfo.getMessage().isFromMe()) {
                LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                dingStatus.setConfirmedChatterIds(message.ack_urgent_chatter_ids);
                dingStatus.setUnconfirmedChatterIds(message.unack_urgent_chatter_ids);
                linkedHashSet.addAll(message.unack_urgent_chatter_ids);
                linkedHashSet.addAll(message.ack_urgent_chatter_ids);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : linkedHashSet) {
                    linkedHashMap.put(str, C34340h.m133174a(aVar.mo124892a(messageInfo.getMessage().getChatId(), str), ChatterNameDisplayRule.ALIAS_NICKNAME_NAME));
                }
                dingStatus.setChatterNameMap(linkedHashMap);
            }
            messageInfo.setDingStatus(dingStatus);
        }
    }

    /* renamed from: a */
    public static MessageInfo m222044a(com.ss.android.lark.chat.entity.message.Message message, com.bytedance.lark.pb.basic.v1.Message message2, C14928Entity entity, C33982a aVar) {
        return m222045a(message, message2, entity, aVar, (Map<String, MessageInfo>) null);
    }

    /* renamed from: a */
    public static MessageInfo m222045a(com.ss.android.lark.chat.entity.message.Message message, com.bytedance.lark.pb.basic.v1.Message message2, C14928Entity entity, C33982a aVar, Map<String, MessageInfo> map) {
        ChatChatter a = aVar.mo124892a(message.getChatId(), message.getFromId());
        message.getId();
        String chatId = message.getChatId();
        MessageInfo messageInfo = new MessageInfo(message, a);
        List<ReactionInfo> a2 = m222048a(aVar, chatId, C57327p.m222182a(message2.reactions));
        messageInfo.setPin(m222047a(message2.pin, chatId, aVar));
        messageInfo.setReactionInfoList(a2);
        m222049a(message2, messageInfo, aVar);
        m222052a(message, messageInfo, aVar);
        messageInfo.setTranslateInfo(C57336y.m222236a(message, entity));
        m222053b(message, aVar);
        m222051a(message, aVar);
        messageInfo.setOriginalSender(m222054c(message, aVar));
        m222050a(message, entity, aVar, messageInfo, map);
        return messageInfo;
    }
}
