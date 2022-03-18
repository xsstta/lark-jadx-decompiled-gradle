package com.ss.android.lark.p2851u.p2852a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.MessageSource;
import com.bytedance.lark.pb.basic.v1.MessageSourceType;
import com.bytedance.lark.pb.basic.v1.SubTranslateInfo;
import com.bytedance.lark.pb.im.v1.PushTranslateState;
import com.bytedance.lark.pb.im.v1.TranslateError;
import com.bytedance.lark.pb.im.v1.TranslateMessagesV3Response;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.sdk.C53241h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.u.a.y */
public class C57336y {
    /* renamed from: a */
    private static void m222240a(Message message) {
        List<Message> messages = ((MergeForwardContent) message.getContent()).getMessages();
        if (messages != null) {
            String translateLanguage = message.getTranslateLanguage();
            int translateDisplayRule = message.getTranslateDisplayRule();
            boolean z = false;
            Iterator<Message> it = messages.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Message next = it.next();
                if ((next.getType() == Message.Type.POST || next.getType() == Message.Type.IMAGE || next.getType() == Message.Type.TEXT) && (translateDisplayRule = next.getTranslateDisplayRule()) != 0 && translateDisplayRule != 1) {
                    translateLanguage = next.getTranslateLanguage();
                    z = next.isTranslatedManually();
                    break;
                }
            }
            if (translateDisplayRule == 3) {
                translateDisplayRule = 2;
            }
            message.setTranslateLanguage(translateLanguage);
            message.setTranslateDisplayRule(translateDisplayRule);
            message.setTranslatedManually(z);
            C53241h.m205899c("ModelParserTranslate", "completeMergeForwardTranslateState：" + translateLanguage + "/" + translateDisplayRule + "/" + z);
        }
    }

    /* renamed from: a */
    public static TranslateInfo m222236a(Message message, C14928Entity entity) {
        return m222237a(message, entity, true);
    }

    /* renamed from: a */
    public static C36874a m222238a(AbstractC32810b bVar, PushTranslateState pushTranslateState) {
        if (pushTranslateState == null) {
            return null;
        }
        C36874a aVar = new C36874a();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C14928Entity entity = pushTranslateState.entities;
        for (String str : pushTranslateState.message_id) {
            TranslateState translateState = new TranslateState(str);
            Message a = bVar.mo120945a(entity, str);
            if (a != null) {
                translateState.setMessage(a);
                translateState.setTranslateInfo(m222237a(a, entity, false));
            }
            hashMap.put(str, translateState);
        }
        aVar.mo136145a(hashMap);
        for (TranslateError translateError : pushTranslateState.translate_errors) {
            if (translateError.message_source.source_type == MessageSourceType.MERGE_FORWARD_MESSAGE && !TextUtils.isEmpty(translateError.message_source.source_id)) {
                TranslateState translateState2 = new TranslateState(translateError.message_source.source_id);
                translateState2.setErrorCode(translateError.error_code.intValue());
                translateState2.setMessageSource(new MessageSource(MessageSourceType.COMMON_MESSAGE, ""));
                hashMap2.put(translateState2.getMessageId(), translateState2);
            }
            TranslateState translateState3 = new TranslateState(translateError.message_id);
            translateState3.setErrorCode(translateError.error_code.intValue());
            translateState3.setMessageSource(translateError.message_source);
            hashMap2.put(translateState3.getMessageId(), translateState3);
        }
        aVar.mo136148b(hashMap2);
        aVar.mo136146a(pushTranslateState.is_user_manual_translate.booleanValue());
        return aVar;
    }

    /* renamed from: a */
    public static C36874a m222239a(AbstractC32810b bVar, TranslateMessagesV3Response translateMessagesV3Response) {
        if (translateMessagesV3Response == null) {
            return null;
        }
        C36874a aVar = new C36874a();
        ArrayList arrayList = new ArrayList(translateMessagesV3Response.message_ids);
        if (!CollectionUtils.isEmpty(translateMessagesV3Response.message_sources)) {
            for (MessageSource messageSource : translateMessagesV3Response.message_sources) {
                if (messageSource.source_type == MessageSourceType.MERGE_FORWARD_MESSAGE && !TextUtils.isEmpty(messageSource.source_id)) {
                    arrayList.add(messageSource.source_id);
                }
            }
        }
        aVar.mo136144a(arrayList);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C14928Entity entity = translateMessagesV3Response.entities;
        for (String str : translateMessagesV3Response.translated_message_ids) {
            TranslateState translateState = new TranslateState(str);
            Message a = bVar.mo120945a(entity, str);
            if (a != null) {
                translateState.setMessage(a);
                translateState.setTranslateInfo(m222237a(a, entity, false));
            }
            hashMap.put(str, translateState);
        }
        aVar.mo136145a(hashMap);
        for (TranslateError translateError : translateMessagesV3Response.translate_errors) {
            if (translateError.message_source.source_type == MessageSourceType.MERGE_FORWARD_MESSAGE && !TextUtils.isEmpty(translateError.message_source.source_id)) {
                TranslateState translateState2 = new TranslateState(translateError.message_source.source_id);
                translateState2.setErrorCode(translateError.error_code.intValue());
                translateState2.setMessageSource(new MessageSource(MessageSourceType.COMMON_MESSAGE, ""));
                hashMap2.put(translateState2.getMessageId(), translateState2);
            }
            TranslateState translateState3 = new TranslateState(translateError.message_id);
            translateState3.setErrorCode(translateError.error_code.intValue());
            translateState3.setMessageSource(translateError.message_source);
            hashMap2.put(translateState3.getMessageId(), translateState3);
        }
        aVar.mo136148b(hashMap2);
        return aVar;
    }

    /* renamed from: a */
    public static TranslateInfo m222237a(Message message, C14928Entity entity, boolean z) {
        String id = message.getId();
        boolean a = C29990c.m110930b().mo134586n().mo134685a("translate.asr-message.android");
        if (message.getType() == Message.Type.TEXT || message.getType() == Message.Type.POST || message.getType() == Message.Type.IMAGE || (message.getType() == Message.Type.AUDIO && a)) {
            com.bytedance.lark.pb.basic.v1.TranslateInfo translateInfo = entity.translate_messages.get(id);
            if (translateInfo != null) {
                return new TranslateInfo(translateInfo.message_id, translateInfo.language, C57322k.m222123a(entity, message, translateInfo.content, translateInfo));
            }
        } else if (message.getType() == Message.Type.MERGE_FORWARD) {
            SubTranslateInfo subTranslateInfo = entity.merge_forward_translate_messages.get(id);
            MergeForwardContent clone = ((MergeForwardContent) message.getContent()).clone();
            if (subTranslateInfo == null || clone.getMessages() == null) {
                return null;
            }
            m222240a(message);
            ArrayList arrayList = new ArrayList();
            for (Message message2 : clone.getMessages()) {
                String id2 = message2.getId();
                Message clone2 = message2.clone();
                com.bytedance.lark.pb.basic.v1.TranslateInfo translateInfo2 = subTranslateInfo.sub_translate_messages.get(id2);
                if (translateInfo2 != null) {
                    clone2.setMessageContent(C57322k.m222123a(entity, clone2, translateInfo2.content, translateInfo2));
                    arrayList.add(clone2);
                } else if (z) {
                    clone2.setTranslateDisplayRule(1);
                    arrayList.add(clone2);
                }
            }
            clone.setMessages(arrayList);
            clone.setTranslated(true);
            return new TranslateInfo(id, message.getTranslateLanguage(), clone);
        }
        return null;
    }
}
