package com.ss.android.lark.chat.chatwindow.secretchat.data.reply;

import android.text.SpannableStringBuilder;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.BaseReplyMsgDigestCreator;
import com.ss.android.lark.chat.chatwindow.secretchat.data.decrypt.SecretContentResolver;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/reply/SecretChatReplyDigestCreator;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/BaseReplyMsgDigestCreator;", "()V", "getReplyMsgDigest", "", "replyChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "replyMsgInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "showPostReplyPrefix", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.d.a */
public final class SecretChatReplyDigestCreator extends BaseReplyMsgDigestCreator {
    @Override // com.ss.android.lark.chat.chatwindow.chat.data.reply.BaseReplyMsgDigestCreator
    /* renamed from: b */
    public CharSequence mo122509b(Chatter chatter, MessageInfo messageInfo, boolean z) {
        String str;
        Intrinsics.checkParameterIsNotNull(messageInfo, "replyMsgInfo");
        if (chatter == null) {
            return null;
        }
        String str2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ReplySomebody, "name", C34340h.m133174a(chatter, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME)).toString() + " ：";
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "replyMsgInfo.getMessage()");
        Message.Type type = message.getType();
        if (type == Message.Type.TEXT) {
            TextContent textContent = (TextContent) SecretContentResolver.f87392a.mo123956a().mo123955b(message);
            if (textContent != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                CharSequence d = C59035h.m229213d(textContent.getRichText());
                if (d != null) {
                    return spannableStringBuilder.append(d);
                }
            }
            str = "";
        } else if (type == Message.Type.IMAGE) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            sb.append(UIUtils.getString(b.mo134528a(), R.string.Lark_Legacy_ImageSummarize));
            str = sb.toString();
        } else if (type == Message.Type.FILE) {
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "rootMsg.getContent<FileContent>()");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            sb2.append(UIUtils.getString(b2.mo134528a(), R.string.Lark_Legacy_FileHolder).toString());
            sb2.append(" ");
            sb2.append(((FileContent) content).getName());
            str = sb2.toString();
        } else if (type == Message.Type.AUDIO) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            AbstractC36474h b3 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
            sb3.append(UIUtils.getString(b3.mo134528a(), R.string.Lark_Legacy_AudioHolder));
            str = sb3.toString();
        } else if (type == Message.Type.LOCATION) {
            Content content2 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content2, "rootMsg.getContent<LocationContent>()");
            str = str2 + UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", ((LocationContent) content2).getName());
        } else if (type != Message.Type.SHARE_USER_CARD) {
            return null;
        } else {
            Content content3 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content3, "rootMsg.getContent<ProfileContent>()");
            String displayName = ((ProfileContent) content3).getDisplayName();
            str = str2 + UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PreviewUserCard, "user_name", displayName);
        }
        return str;
    }
}
