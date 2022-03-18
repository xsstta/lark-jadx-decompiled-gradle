package com.ss.android.lark.chat.utils;

import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59029c;

/* renamed from: com.ss.android.lark.chat.utils.g */
public class C34339g {
    /* renamed from: d */
    public static String m133170d(Chat chat) {
        if (chat != null) {
            return chat.getName();
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m133167a(Chat chat) {
        if (m133168b(chat) || (chat != null && chat.isAdmin())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m133168b(Chat chat) {
        if (chat == null || chat.isP2PChat() || !chat.getOwnerId().equals(C29990c.m110930b().mo134515N().mo134394a())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m133169c(Chat chat) {
        String p2pChatterId;
        if (chat != null && chat.getType() == Chat.Type.P2P && (p2pChatterId = chat.getP2pChatterId()) != null && p2pChatterId.equals(C29990c.m110930b().mo134515N().mo134394a())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Chat.MessagePosition m133171e(Chat chat) {
        if (chat == null) {
            return Chat.MessagePosition.UNKNOWN;
        }
        if (!C37239a.m146648b().mo136955b("im.chat.start.from.which.message", false)) {
            return chat.getMessagePosition();
        }
        Long l = C29990c.m110930b().ab().mo134603c("GLOBALLY_ENTER_CHAT_POSITION").int_value;
        if (l != null) {
            return Chat.MessagePosition.forNumber(l.intValue());
        }
        return Chat.MessagePosition.RECENT_LEFT;
    }

    /* renamed from: a */
    public static void m133166a(MessageInfo messageInfo) {
        String str;
        TextContent textContent = new TextContent();
        ChatChatter recallUser = messageInfo.getRecallUser();
        if (recallUser != null) {
            String b = C57814c.m224350b(recallUser.getId(), C34340h.m133174a(recallUser, ChatterNameDisplayRule.NICKNAME_NAME));
            if (messageInfo.getMessage().getRecallerIdentity() == Message.RecallerIdentity.GROUP_ADMIN) {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupAdminRecalledMsg, "GroupAdministrator", b);
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MessageGroupRecallMessage, "recaller", b);
            }
            textContent.setRichText(C59029c.m229161b(str));
        } else {
            textContent.setRichText(C59029c.m229161b(UIHelper.getString(R.string.Lark_Legacy_MessageIsrecalled)));
        }
        messageInfo.getMessage().setStatus(Message.Status.DELETED);
        messageInfo.getMessage().setType(Message.Type.TEXT);
        messageInfo.getMessage().setMessageContent(textContent);
    }

    /* renamed from: a */
    public static ChatBundle.ChatType m133165a(Chat chat, ChatChatter chatChatter) {
        ChatBundle.ChatType chatType;
        if (chat == null) {
            return null;
        }
        if (chatChatter != null && chatChatter.isBot()) {
            return ChatBundle.ChatType.SINGLE_BOT;
        }
        if (chat.isP2PChat()) {
            if (chat.isSecret()) {
                chatType = ChatBundle.ChatType.SECRET_SINGLE;
            } else {
                chatType = ChatBundle.ChatType.SINGLE;
            }
        } else if (chat.isMeeting()) {
            return ChatBundle.ChatType.MEETING;
        } else {
            if (chat.isEdu()) {
                return ChatBundle.ChatType.EDU_CHAT;
            }
            if (chat.getType() == Chat.Type.GROUP) {
                if (chat.isSecret()) {
                    chatType = ChatBundle.ChatType.SECRET_GROUP;
                } else {
                    chatType = ChatBundle.ChatType.GROUP;
                }
            } else if (chat.getType() != Chat.Type.TOPIC_GROUP) {
                return null;
            } else {
                ChatBundle.ChatType chatType2 = ChatBundle.ChatType.THREAD;
                Log.m165382e("unknow chat type for statitics chatName = " + chat.getName());
                return chatType2;
            }
        }
        return chatType;
    }
}
