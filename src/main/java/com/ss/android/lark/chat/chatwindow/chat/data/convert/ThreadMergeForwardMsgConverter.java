package com.ss.android.lark.chat.chatwindow.chat.data.convert;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.ThreadMergeForwardContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterInfo;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ThreadMergeForwardMsgConverter;", "Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "Lcom/ss/android/lark/chat/base/view/vo/message/ThreadMergeForwardContentVO;", "()V", "convert", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "getInfoContent", "", "getInfoSource", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getInfoTitle", "getReplyDisplayText", "supportType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.r */
public final class ThreadMergeForwardMsgConverter implements IMsgVOConverter<ThreadMergeForwardContentVO> {
    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: a */
    public Message.Type mo122452a() {
        return Message.Type.MERGE_FORWARD;
    }

    /* renamed from: a */
    private final String m128445a(Chat chat) {
        if (chat == null || !chat.isMember()) {
            String string = UIHelper.getString(R.string.Lark_Group_FromTopicGroup);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ark_Group_FromTopicGroup)");
            return string;
        }
        String name = chat.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "chat.getName()");
        return name;
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: c */
    public CharSequence mo122454c(AbstractC34006a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        String d = m128446d(aVar);
        CharSequence e = m128447e(aVar);
        return d + ' ' + e;
    }

    /* renamed from: e */
    private final CharSequence m128447e(AbstractC34006a aVar) {
        String str;
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content content = message.getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<MergeForwardContent>()");
        MergeForwardContent mergeForwardContent = (MergeForwardContent) content;
        List<Message> messages = mergeForwardContent.getMessages();
        String subtitle = mergeForwardContent.getSubtitle();
        if (!TextUtils.isEmpty(subtitle)) {
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) subtitle);
            Intrinsics.checkExpressionValueIsNotNull(append, "SpannableStringBuilder().append(subTitle)");
            return append;
        }
        if (messages != null && (!messages.isEmpty())) {
            str = C34349o.m133200a(UIHelper.getContext(), messages.get(0), 0);
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "if (messageList != null …         \"\"\n            }");
        return str;
    }

    /* renamed from: d */
    private final String m128446d(AbstractC34006a aVar) {
        ChatterInfo chatterInfo;
        ChatterInfo chatterInfo2;
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content content = message.getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<MergeForwardContent>()");
        MergeForwardContent mergeForwardContent = (MergeForwardContent) content;
        List<Message> messages = mergeForwardContent.getMessages();
        String str = "";
        if (messages == null || !(!messages.isEmpty())) {
            return str;
        }
        Message message2 = messages.get(0);
        String fromId = message2.getFromId();
        Map<String, Chatter> reactionChatterMap = mergeForwardContent.getReactionChatterMap();
        Map<String, ChatterInfo> chatters = mergeForwardContent.getChatters();
        if (reactionChatterMap.get(fromId) != null) {
            Chatter chatter = reactionChatterMap.get(fromId);
            if (chatter != null) {
                str = chatter.getLocalizedName();
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Group_NamesTopic, "name", str);
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…pic, \"name\", chatterName)");
                return mustacheFormat;
            }
        } else {
            if (chatters != null) {
                chatterInfo = chatters.get(message2.getFromId());
            } else {
                chatterInfo = null;
            }
            if (chatterInfo != null) {
                if (!(chatters == null || (chatterInfo2 = chatters.get(message2.getFromId())) == null)) {
                    str = chatterInfo2.getName();
                }
            }
            String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.Lark_Group_NamesTopic, "name", str);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "UIHelper.mustacheFormat(…pic, \"name\", chatterName)");
            return mustacheFormat2;
        }
        str = null;
        String mustacheFormat22 = UIHelper.mustacheFormat((int) R.string.Lark_Group_NamesTopic, "name", str);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat22, "UIHelper.mustacheFormat(…pic, \"name\", chatterName)");
        return mustacheFormat22;
    }

    /* renamed from: a */
    public ThreadMergeForwardContentVO mo122453b(AbstractC34006a aVar) {
        String str;
        boolean z;
        String avatarKey;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content content = message.getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<MergeForwardContent>()");
        MergeForwardContent mergeForwardContent = (MergeForwardContent) content;
        Chat originChat = mergeForwardContent.getOriginChat();
        ThreadMergeForwardContentVO nVar = new ThreadMergeForwardContentVO(mergeForwardContent);
        nVar.mo121920b(message.getTranslateDisplayRule());
        nVar.mo121921c(aVar.isTranslating());
        nVar.mo121922d(message.isTranslatedManually());
        nVar.mo121923e(message.getTranslateLanguage());
        TranslateInfo translateInfo = aVar.getTranslateInfo();
        if (translateInfo != null) {
            Content translateContent = translateInfo.getTranslateContent();
            Intrinsics.checkExpressionValueIsNotNull(translateContent, "translateInfo.getTranslateContent()");
            ThreadMergeForwardContentVO nVar2 = new ThreadMergeForwardContentVO((MergeForwardContent) translateContent);
            nVar2.mo121923e(translateInfo.getLanguage());
            nVar.mo121919a((TranslatableContentVO) nVar2);
        }
        nVar.mo121909a(m128446d(aVar));
        nVar.mo121908a(m128447e(aVar));
        nVar.mo121912b(m128445a(originChat));
        String str2 = "";
        if (originChat == null || (str = originChat.getId()) == null) {
            str = str2;
        }
        nVar.mo121914c(str);
        if (!(originChat == null || (avatarKey = originChat.getAvatarKey()) == null)) {
            str2 = avatarKey;
        }
        nVar.mo121916d(str2);
        if (originChat != null) {
            z = originChat.isMember();
        } else {
            z = false;
        }
        nVar.mo121910a(z);
        return nVar;
    }
}
