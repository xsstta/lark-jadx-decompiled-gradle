package com.ss.android.lark.chat.chatwindow.chat.data.reply;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.service.impl.C34232o;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chat.utils.C34343i;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/ChatReplyDigestCreator;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/BaseReplyMsgDigestCreator;", "()V", "getReplyMsgDigest", "", "replyChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "replyMsgInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "showPostReplyPrefix", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.b */
public final class ChatReplyDigestCreator extends BaseReplyMsgDigestCreator {
    @Override // com.ss.android.lark.chat.chatwindow.chat.data.reply.BaseReplyMsgDigestCreator
    /* renamed from: b */
    public CharSequence mo122509b(Chatter chatter, MessageInfo messageInfo, boolean z) {
        String str;
        String str2;
        boolean z2;
        String str3;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(messageInfo, "replyMsgInfo");
        if (chatter == null) {
            return null;
        }
        String str4 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ReplySomebody, "name", C34340h.m133174a(chatter, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME)).toString() + " ：";
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "replyMsgInfo.getMessage()");
        Message.Type type = message.getType();
        boolean z4 = false;
        if (type == Message.Type.TEXT) {
            boolean z5 = !messageInfo.isShowMessageOriginContent();
            if (messageInfo.getMessage().getTranslateDisplayRule() == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z5 || z3) {
                z4 = true;
            }
            TextContent textContent = (TextContent) messageInfo.getTranslateContent(z4);
            if (!z4) {
                str4 = str4 + UIHelper.getString(R.string.Lark_Legacy_TranslateInChat);
            }
            if (textContent != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                CharSequence d = C59035h.m229213d(textContent.getRichText());
                if (d != null) {
                    return spannableStringBuilder.append(d);
                }
            }
            str = "";
        } else if (type == Message.Type.IMAGE) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            sb.append(UIUtils.getString(b.mo134528a(), R.string.Lark_Legacy_ImageSummarize));
            str = sb.toString();
        } else if (type == Message.Type.MEDIA) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            sb2.append(UIUtils.getString(b2.mo134528a(), R.string.Lark_Legacy_MessagePoVideo));
            str = sb2.toString();
        } else if (type == Message.Type.STICKER) {
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "rootMsg.getContent<StickerContent>()");
            str = str4 + C34343i.m133180a((StickerContent) content);
        } else if (type == Message.Type.POST) {
            boolean z6 = !messageInfo.isShowMessageOriginContent();
            if (messageInfo.getMessage().getTranslateDisplayRule() == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z6 || z2) {
                z4 = true;
            }
            if (!z4) {
                str4 = str4 + UIHelper.getString(R.string.Lark_Legacy_TranslateInChat);
            }
            PostContent postContent = (PostContent) messageInfo.getTranslateContent(z4);
            if (postContent == null) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
            AbstractC36474h b3 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
            Context a = b3.mo134528a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder.getDependency().context");
            if (TextUtils.isEmpty(postContent.getTitleWithFilter(a))) {
                str3 = C59035h.m229213d(postContent.getRichText());
            } else {
                AbstractC36474h b4 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
                Context a2 = b4.mo134528a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder.getDependency().context");
                str3 = postContent.getTitleWithFilter(a2);
            }
            if (z) {
                AbstractC36474h b5 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b5, "ChatModuleInstanceHolder.getDependency()");
                spannableStringBuilder2.append((CharSequence) UIUtils.getString(b5.mo134528a(), R.string.Lark_Legacy_PostHolder));
                spannableStringBuilder2.append((CharSequence) " ");
            }
            if (str3 != null) {
                spannableStringBuilder2.append(str3);
            }
            return spannableStringBuilder2;
        } else if (type == Message.Type.FILE) {
            Content content2 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content2, "rootMsg.getContent<FileContent>()");
            FileContent fileContent = (FileContent) content2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            if (fileContent == null) {
                return null;
            }
            StringBuilder sb4 = new StringBuilder();
            AbstractC36474h b6 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b6, "ChatModuleInstanceHolder.getDependency()");
            sb4.append(UIUtils.getString(b6.mo134528a(), R.string.Lark_Legacy_FileHolder).toString());
            sb4.append(" ");
            sb4.append(fileContent.getName());
            sb3.append(sb4.toString());
            str = sb3.toString();
        } else if (type == Message.Type.AUDIO) {
            Content content3 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content3, "rootMsg.getContent<AudioContent>()");
            AudioContent audioContent = (AudioContent) content3;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str4);
            if (audioContent == null) {
                return null;
            }
            AbstractC36474h b7 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b7, "ChatModuleInstanceHolder.getDependency()");
            sb5.append(UIUtils.getString(b7.mo134528a(), R.string.Lark_Legacy_AudioHolder));
            str = sb5.toString();
        } else if (type == Message.Type.SHARE_GROUP_CHAT) {
            Content content4 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content4, "rootMsg.getContent<ShareGroupChatContent>()");
            ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) content4;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str4);
            if (shareGroupChatContent == null) {
                return null;
            }
            sb6.append(C34350p.m133213a(message));
            str = sb6.toString();
        } else if (type == Message.Type.MERGE_FORWARD) {
            Content content5 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content5, "rootMsg.getContent<MergeForwardContent>()");
            MergeForwardContent mergeForwardContent = (MergeForwardContent) content5;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str4);
            if (mergeForwardContent == null) {
                return null;
            }
            if (mergeForwardContent.isFromPrivateTopic()) {
                str2 = mergeForwardContent.getSubtitle();
            } else {
                str2 = C34232o.m132851a().mo121388a(mergeForwardContent).f74159a;
            }
            sb7.append(str2);
            str = sb7.toString();
        } else if (type == Message.Type.CARD) {
            Content content6 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content6, "rootMsg.getContent<CardContent>()");
            AbstractC36474h b8 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b8, "ChatModuleInstanceHolder.getDependency()");
            String a3 = C34349o.m133208a(b8.mo134528a(), (CardContent) content6);
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str4);
            if (TextUtils.isEmpty(a3)) {
                return null;
            }
            sb8.append(a3);
            str = sb8.toString();
        } else if (type == Message.Type.LOCATION) {
            Content content7 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content7, "rootMsg.getContent<LocationContent>()");
            LocationContent locationContent = (LocationContent) content7;
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str4);
            if (locationContent == null) {
                return null;
            }
            sb9.append(UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", locationContent.getName()));
            str = sb9.toString();
        } else if (type == Message.Type.RED_PACKET) {
            str = str4 + UIHelper.getString(R.string.Lark_Hongbao_ReplyHongbao);
        } else if (type == Message.Type.GENERAL_CALENDAR) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str4);
            AbstractC36474h b9 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b9, "ChatModuleInstanceHolder.getDependency()");
            if (!b9.mo134517P().mo134341a(message)) {
                return null;
            }
            AbstractC36474h b10 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b10, "ChatModuleInstanceHolder.getDependency()");
            sb10.append(b10.mo134517P().mo134343b(message));
            str = sb10.toString();
        } else if (type == Message.Type.SHARE_CALENDAR_EVENT) {
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str4);
            AbstractC36474h b11 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b11, "ChatModuleInstanceHolder.getDependency()");
            sb11.append(b11.mo134517P().mo134344c(message));
            str = sb11.toString();
        } else if (type == Message.Type.VIDEO_CHAT) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append(str4);
            AbstractC36474h b12 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b12, "ChatModuleInstanceHolder.getDependency()");
            sb12.append(b12.mo134516O().mo134476a(message));
            str = sb12.toString();
        } else if (type == Message.Type.SHARE_USER_CARD) {
            Content content8 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content8, "rootMsg.getContent<ProfileContent>()");
            String displayName = ((ProfileContent) content8).getDisplayName();
            str = str4 + UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PreviewUserCard, "user_name", displayName);
        } else if (type == Message.Type.TODO) {
            str = str4 + UIHelper.getString(R.string.Todo_Task_MsgTypeTask);
        } else {
            if (type == Message.Type.FOLDER) {
                Content content9 = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content9, "rootMsg.getContent<FolderContent>()");
                FolderContent folderContent = (FolderContent) content9;
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str4);
                if (folderContent != null) {
                    StringBuilder sb14 = new StringBuilder();
                    AbstractC36474h b13 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b13, "ChatModuleInstanceHolder.getDependency()");
                    sb14.append(UIUtils.getString(b13.mo134528a(), R.string.Lark_Legacy_FileHolder).toString());
                    sb14.append(" ");
                    sb14.append(folderContent.getName());
                    sb13.append(sb14.toString());
                    str = sb13.toString();
                }
            }
            return null;
        }
        return str;
    }
}
