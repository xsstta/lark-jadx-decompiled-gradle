package com.ss.android.lark.chat.utils;

import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.listener.IReadStateCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.lark.chat.utils.p */
public class C34350p {

    /* renamed from: a */
    static al f88695a = C29990c.m110930b().mo134596x();

    /* renamed from: a */
    public static boolean m133218a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str.equals(str2)) {
            return true;
        }
        Log.m165383e("MessageInfoUtils", "chat id is not match: current chat id is: " + str + ", push chat id is: " + str2);
        return false;
    }

    /* renamed from: b */
    public static boolean m133219b(Message message) {
        if (message.getTranslateDisplayRule() == 1 || message.getTranslateDisplayRule() == 0 || TextUtils.isEmpty(message.getTranslateLanguage())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Message m133211a(MessageInfo messageInfo) {
        TranslateInfo translateInfo;
        Message clone;
        Message message = messageInfo.getMessage();
        if (message == null || (translateInfo = messageInfo.getTranslateInfo()) == null || !Objects.equals(message.getTranslateLanguage(), translateInfo.getLanguage()) || translateInfo.getTranslateContent() == null || (clone = message.clone()) == null) {
            return message;
        }
        clone.setMessageContent(translateInfo.getTranslateContent());
        return clone;
    }

    /* renamed from: a */
    public static String m133213a(Message message) {
        ShareGroupChatContent shareGroupChatContent;
        if (message == null || message.getType() != Message.Type.SHARE_GROUP_CHAT || (shareGroupChatContent = (ShareGroupChatContent) message.getContent()) == null || shareGroupChatContent.getChat() == null) {
            return "";
        }
        return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ShareGroupChatForwardFormat, "chat_name", shareGroupChatContent.getChat().getName());
    }

    /* renamed from: a */
    public static boolean m133216a(AbsMessageVO aVar) {
        if (aVar == null || !(aVar.mo121699g() instanceof TranslatableContentVO)) {
            return true;
        }
        TranslatableContentVO oVar = (TranslatableContentVO) aVar.mo121699g();
        String t = oVar.mo121925t();
        TranslatableContentVO y = oVar.mo121930y();
        if (TextUtils.isEmpty(t) || y == null || !TextUtils.equals(t, y.mo121925t()) || aVar.mo121713u()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m133217a(AbstractC34006a aVar) {
        return m133215a(aVar.getMessage().getTranslateDisplayRule(), aVar.getMessage().getTranslateLanguage(), aVar.getTranslateInfo());
    }

    /* renamed from: a */
    public static int m133210a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return R.string.Lark_Legacy_TranslateChat;
        }
        if (i == 2) {
            return R.string.Lark_Chat_ViewOriginalMessage;
        }
        if (i != 3) {
            return R.string.Lark_Legacy_ChatViewOriginalInfo;
        }
        return R.string.Lark_Chat_HideTranslation;
    }

    /* renamed from: a */
    public static String m133212a(Chatter chatter, boolean z) {
        if (chatter == null) {
            return UIHelper.getString(R.string.Lark_Legacy_MessageIsrecalled);
        }
        String str = "@" + C34340h.m133174a(chatter, ChatterNameDisplayRule.NICKNAME_NAME);
        if (z) {
            return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupAdminRecalledMsg, "GroupAdministrator", str);
        }
        return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MessageGroupRecallMessage, "recaller", str);
    }

    /* renamed from: a */
    public static boolean m133215a(int i, String str, Object obj) {
        if (i == 1 || i == 0 || TextUtils.isEmpty(str) || obj == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m133214a(String str, PushMessageReadStates pushMessageReadStates, IReadStateCallback nVar) {
        int i;
        if (m133218a(str, pushMessageReadStates.chat_id)) {
            Map<String, PushMessageReadStates.ReadStates> map = pushMessageReadStates.read_states;
            Map<String, PushMessageReadStates.ReadStatesExtra> map2 = pushMessageReadStates.read_states_extra;
            HashSet hashSet = new HashSet();
            if (CollectionUtils.isNotEmpty(map)) {
                hashSet.addAll(map.keySet());
            }
            if (CollectionUtils.isNotEmpty(map2)) {
                hashSet.addAll(map2.keySet());
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                Log.m165389i("MessageInfoUtils", "onPushReadStateMessage: " + str2);
                MessageInfo a = nVar.mo123095a(str2);
                if (a != null) {
                    if (!(map == null || map.get(str2) == null)) {
                        PushMessageReadStates.ReadStates readStates = map.get(str2);
                        a.getMessage().setReadCount(readStates.read_count.intValue());
                        a.getMessage().setUnReadCount(readStates.unread_count.intValue());
                        a.getMessage().setReadAtChatterIds(readStates.read_at_chatter_ids);
                        Log.m165389i("MessageInfoUtils", "onPushReadStateMessage, ReadStates, " + str2);
                    }
                    if (!(map2 == null || map2.get(str2) == null)) {
                        Message message = a.getMessage();
                        if (map2.get(str2).me_read.booleanValue()) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        message.setMeReadType(i);
                        Log.m165389i("MessageInfoUtils", "onPushReadStateMessage, ReadStatesExtra, " + str2);
                    }
                    nVar.mo123096a(a);
                } else {
                    Log.m165389i("MessageInfoUtils", "onPushReadStateMessage: message not found!");
                }
            }
        }
    }
}
