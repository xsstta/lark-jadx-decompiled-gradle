package com.ss.android.lark.p2851u.p2852a;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.QuasiMessage;
import com.bytedance.lark.pb.basic.v1.TranslateInfo;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.PreMessageSendingStatus;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36455ad;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.ChatFGUtils;
import com.ss.android.lark.dependency.ICalendarDependency;
import com.ss.android.lark.dependency.ao;
import com.ss.android.lark.dependency.ap;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.a.k */
public class C57322k {

    /* renamed from: a */
    private static final AbstractC36474h f141168a;

    /* renamed from: b */
    private static final AbstractC36450aa f141169b;

    /* renamed from: c */
    private static final ap f141170c;

    /* renamed from: d */
    private static final ICalendarDependency f141171d;

    /* renamed from: e */
    private static final ao f141172e;

    /* renamed from: f */
    private static final AbstractC36455ad f141173f;

    /* renamed from: g */
    private static final AbstractC36503q f141174g;

    /* renamed from: a */
    private static void m222129a(Message message, C14928Entity entity, com.bytedance.lark.pb.basic.v1.Message message2) {
        if (Message.Type.SHARE_GROUP_CHAT == message.getType()) {
            ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) message.getContent();
            Chat chat = entity.chats.get(message2.content.share_chat_id);
            if (chat != null) {
                shareGroupChatContent.setChat(C57310e.m222078a(chat));
            }
        }
    }

    /* renamed from: a */
    private static void m222128a(Message message) {
        Content content = message.getContent();
        if (content == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("error when decoding message pb, msgId: ");
            sb.append(message.getId());
            sb.append(", type: ");
            sb.append(message.getType());
            sb.append(",isSecret: ");
            sb.append(message.getBurnLife() > 0);
            Log.m165382e(sb.toString());
        }
        try {
            if ((content instanceof TextContent) && message.getType() != Message.Type.TEXT && ((TextContent) content).equals(C57326l.m222147a())) {
                message.setType(Message.Type.UNKNOWN);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Map<String, Message> m222127a(final C14928Entity entity, Map<String, QuasiMessage> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<QuasiMessage, Message>() {
            /* class com.ss.android.lark.p2851u.p2852a.C57322k.C573242 */

            /* renamed from: a */
            public Message get(QuasiMessage quasiMessage) {
                return C57322k.m222119a(entity, quasiMessage);
            }
        });
    }

    static {
        AbstractC36474h b = C29990c.m110930b();
        f141168a = b;
        f141169b = b.mo134515N();
        f141170c = b.mo134516O();
        f141171d = b.mo134517P();
        f141172e = b.mo134519R();
        f141173f = b.mo134589q();
        f141174g = b.mo134586n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.u.a.k$3 */
    public static /* synthetic */ class C573253 {

        /* renamed from: a */
        static final /* synthetic */ int[] f141177a;

        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 265
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.p2851u.p2852a.C57322k.C573253.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Map<String, MessageInfo> m222126a(C14928Entity entity) {
        C33982a a = C57306b.m222058a(entity, true, "ModelParserMessage::getMessageInfoMap");
        HashMap hashMap = new HashMap(entity.messages.size());
        Map<String, com.bytedance.lark.pb.basic.v1.Message> map = entity.messages;
        for (Map.Entry entry : new HashMap(m222132b(entity)).entrySet()) {
            hashMap.put(entry.getKey(), C57304a.m222044a((Message) entry.getValue(), map.get(entry.getKey()), entity, a));
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Map<String, Message> m222132b(C14928Entity entity) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (entity != null) {
            for (com.bytedance.lark.pb.basic.v1.Message message : entity.messages.values()) {
                Message a = m222120a(entity, message.id);
                if (a != null) {
                    linkedHashMap.put(a.getId(), a);
                    C34438a.m133577a("get burned pb message ", a);
                }
            }
            if (entity.ephemeral_messages != null && entity.ephemeral_messages.size() > 0) {
                for (com.bytedance.lark.pb.basic.v1.Message message2 : entity.ephemeral_messages.values()) {
                    Message b = m222130b(entity, message2.id);
                    if (b != null) {
                        linkedHashMap.put(b.getId(), b);
                        C34438a.m133577a("get burned pb message ", b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static List<Message> m222125a(final C14928Entity entity, List<com.bytedance.lark.pb.basic.v1.Message> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.basic.v1.Message, Message>() {
            /* class com.ss.android.lark.p2851u.p2852a.C57322k.C573231 */

            /* renamed from: a */
            public Message get(com.bytedance.lark.pb.basic.v1.Message message) {
                return C57322k.m222118a(entity, message);
            }
        });
    }

    /* renamed from: a */
    public static Message m222120a(C14928Entity entity, String str) {
        com.bytedance.lark.pb.basic.v1.Message message = entity.messages.get(str);
        if (message == null) {
            return null;
        }
        return m222118a(entity, message);
    }

    /* renamed from: b */
    public static Message m222130b(C14928Entity entity, String str) {
        com.bytedance.lark.pb.basic.v1.Message message = entity.ephemeral_messages.get(str);
        if (message == null) {
            return null;
        }
        return m222118a(entity, message);
    }

    /* renamed from: b */
    public static List<Message> m222131b(C14928Entity entity, List<String> list) {
        Message a;
        ArrayList arrayList = new ArrayList();
        Map<String, com.bytedance.lark.pb.basic.v1.Message> map = entity.messages;
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                com.bytedance.lark.pb.basic.v1.Message message = map.get(str);
                if (!(message == null || (a = m222120a(entity, message.id)) == null)) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Message m222119a(C14928Entity entity, QuasiMessage quasiMessage) {
        Message message = new Message();
        message.setId(quasiMessage.id);
        message.setcId(quasiMessage.cid);
        message.setType(Message.Type.valueOf(quasiMessage.type.getValue()));
        message.setIsFromMe(true);
        message.setFromId(quasiMessage.from_id);
        message.setCreateTime(quasiMessage.create_time.longValue());
        message.setMessageContent(m222123a(entity, message, quasiMessage.content, (TranslateInfo) null));
        message.setRootId(quasiMessage.root_id);
        message.setParentId(quasiMessage.parent_id);
        message.setChatId(quasiMessage.chat_id);
        message.setPosition(quasiMessage.position.intValue());
        message.setThreadPosition(quasiMessage.thread_position.intValue());
        message.setUpdateTime(quasiMessage.create_time.longValue());
        message.setNotified(quasiMessage.should_notify.booleanValue());
        PreMessageSendingStatus forNumber = PreMessageSendingStatus.forNumber(quasiMessage.status.getValue());
        if (forNumber == PreMessageSendingStatus.FAILED) {
            message.setSendStatus(SendStatus.FAIL);
        } else if (forNumber == PreMessageSendingStatus.PENDING) {
            message.setSendStatus(SendStatus.SENDING);
        }
        if (message.getType() == Message.Type.MEDIA) {
            if (forNumber == PreMessageSendingStatus.FAILED) {
                ((MediaContent) message.getContent()).setFileState(FileState.PAUSE);
            } else if (forNumber == PreMessageSendingStatus.PENDING) {
                ((MediaContent) message.getContent()).setFileState(FileState.COMPRESSING);
            }
        }
        message.setCryptoToken(quasiMessage.crypto_token);
        message.setChannel(C57309d.m222073a(quasiMessage.channel));
        message.setAtBotIds(m222124a(entity, message));
        return message;
    }

    /* renamed from: a */
    public static Message m222118a(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Message message) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        Message message2 = new Message();
        message2.setId(message.id);
        message2.setType(Message.Type.valueOf(message.type.getValue()));
        message2.setFromId(message.from_id);
        boolean z4 = true;
        if (message.from_id.equals(f141169b.mo134394a()) || (message.anonymous_info != null && message.anonymous_info.is_anonymous.booleanValue() && message.anonymous_info.is_sender.booleanValue())) {
            z = true;
        } else {
            z = false;
        }
        message2.setIsFromMe(z);
        message2.setCreateTime(message.create_time.longValue());
        message2.setChatId(message.chat_id);
        message2.setImageTranslationAbility(message.image_translation_ability);
        message2.setMessageContent(m222123a(entity, message2, message.content, (TranslateInfo) null));
        m222128a(message2);
        boolean booleanValue = message.is_deleted.booleanValue();
        boolean booleanValue2 = message.is_edited.booleanValue();
        boolean booleanValue3 = message.is_recalled.booleanValue();
        Message.Status status = Message.Status.NORMAL;
        if (booleanValue3) {
            status = Message.Status.DELETED;
            message2.setReEditable(message.is_reeditable.booleanValue());
        } else if (booleanValue2) {
            status = Message.Status.MODIFIED;
        }
        message2.setRemoved(booleanValue);
        message2.setStatus(status);
        message2.setRootId(message.root_id);
        message2.setParentId(message.parent_id);
        message2.setChatId(message.chat_id);
        message2.setcId(message.cid);
        message2.setPosition(message.position.intValue());
        message2.setBadgeCount(message.badge_count.intValue());
        message2.setBadged(message.is_badged.booleanValue());
        message2.setUpdateTime(message.update_time.longValue());
        message2.setNotified(message.should_notify.booleanValue());
        message2.setReplyCount(message.reply_count.intValue());
        message2.setDing(message.is_urgent.booleanValue());
        if (message.file_deleted_status == Message.FileDeletedStatus.RECALLED) {
            z2 = true;
        } else {
            z2 = false;
        }
        message2.setSourceFileDelete(z2);
        message2.setFileDeletedStatus(Message.FileDeletedStatus.fromValue(message.file_deleted_status.getValue()));
        if (!message.is_at_me.booleanValue() || message2.isFromMe()) {
            z3 = false;
        } else {
            z3 = true;
        }
        message2.setOtherAtMe(z3);
        if (message.me_read.booleanValue()) {
            i = 2;
        } else {
            i = 0;
        }
        message2.setMeReadType(i);
        message2.setIsUnTranslatable(message.is_untranslateable.booleanValue());
        message2.setReadAtChatterIds(message.read_at_chatter_ids);
        message2.setTextDraftId(message.text_draft_id);
        message2.setPostDraftId(message.post_draft_id);
        m222129a(message2, entity, message);
        message2.setChannel(C57309d.m222073a(message.channel));
        message2.setReadCount(message.read_count.intValue());
        message2.setUnReadCount(message.unread_count.intValue());
        message2.setSourceId(message.source_id);
        message2.setParentSourceId(message.parent_source_id);
        message2.setSourceType(Message.SourceType.valueOf(message.source_type.getValue()));
        message2.setRecallerId(message.recaller_id);
        message2.setRecallerIdentity(Message.RecallerIdentity.valueOf(message.recaller_identity.getValue()));
        message2.setAtAll(message.is_at_all.booleanValue());
        message2.setAtMe(message.is_at_me.booleanValue());
        message2.setVisible(message.is_visible.booleanValue());
        message2.setThreadId(message.thread_id);
        message2.setThreadBadgeCount(message.thread_badge_count.intValue());
        message2.setThreadPosition(message.thread_position.intValue());
        message2.setNoTraceDelete(message.is_no_trace_deleted.booleanValue());
        message2.setOriginBadgeCount(message.origin_badge_count.intValue());
        message2.setBurnLife(message.burn_life.intValue());
        message2.setBurnTime(message.burn_time.longValue());
        message2.setBurned(message.is_burned.booleanValue());
        message2.setTranslateLanguage(message.translate_language);
        message2.setMessageLanguage(message.message_language);
        if (message.translate_message_display_rule != null) {
            i2 = message.translate_message_display_rule.rule.getValue();
        } else {
            i2 = 0;
        }
        message2.setTranslateDisplayRule(i2);
        message2.setAutoTranslatedForReceiver(message.is_auto_translated_by_receiver.booleanValue());
        message2.setAtBotIds(m222124a(entity, message2));
        message2.setTranslatedManually(message.is_manual_translated.booleanValue());
        if (!message.content.origin_sender_id_str.isEmpty()) {
            message2.setOriginalSenderId(message.content.origin_sender_id_str);
        } else {
            message2.setOriginalSenderId(message.original_sender_id);
        }
        if (!message.forward_from_friend.booleanValue() && !message.content.is_friend.booleanValue()) {
            z4 = false;
        }
        message2.setForwardFromFriend(z4);
        message2.setIsCryptoIntermediate(message.is_crypto_intermediate.booleanValue());
        message2.setIsSyncMsgDep(message.sync_dependency.booleanValue());
        message2.setCryptoToken(message.crypto_token);
        return message2;
    }

    /* renamed from: a */
    private static List<String> m222124a(C14928Entity entity, com.ss.android.lark.chat.entity.message.Message message) {
        C14928Entity.ChatChatter chatChatter;
        ArrayList arrayList = new ArrayList();
        if (!(message.getType() == Message.Type.TEXT || message.getType() == Message.Type.POST) || entity == null || CollectionUtils.isEmpty(entity.chat_chatters) || (chatChatter = entity.chat_chatters.get(message.getChatId())) == null) {
            return arrayList;
        }
        RichText richText = null;
        if (message.getType() == Message.Type.TEXT) {
            richText = ((TextContent) message.getContent()).getRichText();
        } else if (message.getType() == Message.Type.POST) {
            richText = ((PostContent) message.getContent()).getRichText();
        }
        if (richText == null) {
            return arrayList;
        }
        ArrayList<String> a = C59031e.m229178a(richText, false);
        Map<String, Chatter> map = chatChatter.chatters;
        for (String str : a) {
            if (map.containsKey(str) && map.get(str).type == Chatter.Type.BOT) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static MessageInfo m222121a(com.ss.android.lark.chat.entity.message.Message message, C14928Entity entity, C33982a aVar) {
        return m222122a(message, entity, aVar, (Map<String, MessageInfo>) null);
    }

    /* renamed from: a */
    public static MessageInfo m222122a(com.ss.android.lark.chat.entity.message.Message message, C14928Entity entity, C33982a aVar, Map<String, MessageInfo> map) {
        ChatChatter a = aVar.mo124892a(message.getChatId(), message.getFromId());
        if (a == null) {
            return null;
        }
        MessageInfo messageInfo = new MessageInfo(message, a);
        C57304a.m222050a(message, entity, aVar, messageInfo, map);
        return messageInfo;
    }

    /* renamed from: a */
    public static Content m222123a(C14928Entity entity, com.ss.android.lark.chat.entity.message.Message message, com.bytedance.lark.pb.basic.v1.Content content, TranslateInfo translateInfo) {
        try {
            String id = message.getId();
            String chatId = message.getChatId();
            switch (C573253.f141177a[message.getType().ordinal()]) {
                case 1:
                    return C57326l.m222148a(message.isFromMe(), message.getChatId(), id, content, entity);
                case 2:
                    ImageContent a = C57326l.m222141a(entity, content, message, translateInfo);
                    if (message.isPreMessage()) {
                        a.setProgress(0);
                    }
                    return a;
                case 3:
                    return C57326l.m222164b(entity, content, message, translateInfo);
                case 4:
                    CardContent a2 = f141173f.mo134421a(entity, content);
                    if (a2.getType() == CardContent.Type.UNKNOWN) {
                        return C57326l.m222147a();
                    }
                    return a2;
                case 5:
                    return C57326l.m222139a(content, message.isFromMe());
                case 6:
                    return C57326l.m222138a(message, content, translateInfo);
                case 7:
                    return C57326l.m222146a(entity, content);
                case 8:
                    return C57326l.m222168c(content);
                case 9:
                    return C57326l.m222165b(content);
                case 10:
                    return f141171d.mo134337a(entity, content);
                case 11:
                    return C57326l.m222163b(entity, content);
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return C57326l.m222143a(content, id);
                case 13:
                    return f141171d.mo134336a(content);
                case 14:
                case 15:
                    return C57326l.m222150a(content);
                case 16:
                    Content b = f141171d.mo134342b(entity, content);
                    if (b == null) {
                        return C57326l.m222147a();
                    }
                    return b;
                case 17:
                    return f141170c.mo134475a(content);
                case 18:
                    return C29990c.m110930b().mo134508G().mo120950a(content);
                case 19:
                    return C57326l.m222145a(entity, chatId, content);
                case 20:
                    Content a3 = f141172e.mo134471a(entity, content);
                    if (a3 == null) {
                        return C57326l.m222147a();
                    }
                    return a3;
                case 21:
                    FolderContent b2 = C57326l.m222162b(content, message.isFromMe());
                    if (b2 != null) {
                        if (ChatFGUtils.m143689a()) {
                            return b2;
                        }
                    }
                    return C57326l.m222147a();
                case 22:
                    return C57326l.m222147a();
                default:
                    throw new Exception(": param is not a valid content type");
            }
        } catch (Exception e) {
            Log.m165387e("error when decoding pb" + e.getMessage(), (Throwable) e, true);
            return null;
        }
    }
}
