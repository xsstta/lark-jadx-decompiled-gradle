package com.ss.android.lark.chat.topnoticemessage.p1685c;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.service.impl.C34232o;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0000\u001a\u0013\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000e\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000f"}, d2 = {"digest", "", "Lcom/bytedance/lark/pb/basic/v1/Chat$Announcement;", "getDigest", "(Lcom/bytedance/lark/pb/basic/v1/Chat$Announcement;)Ljava/lang/CharSequence;", "Lcom/ss/android/lark/chat/entity/message/Message;", "(Lcom/ss/android/lark/chat/entity/message/Message;)Ljava/lang/CharSequence;", "getAnnounceUrl", "", "announcement", "chatId", "isNotEmpty", "", "", "(Ljava/lang/Long;)Z", "im_chat_chat_productionUsRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.c.a */
public final class C34320a {
    /* renamed from: a */
    public static final boolean m133055a(Long l) {
        if (l == null || l.longValue() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final CharSequence m133052a(Chat.Announcement announcement) {
        Intrinsics.checkParameterIsNotNull(announcement, "$this$digest");
        String str = announcement.content;
        Intrinsics.checkExpressionValueIsNotNull(str, "content");
        int coerceAtMost = RangesKt.coerceAtMost(100, announcement.content.length());
        if (str != null) {
            String substring = str.substring(0, coerceAtMost);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return UIHelper.getString(R.string.Lark_IMChatPin_PreviewGroupAnnouncement_Text) + " " + substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static final CharSequence m133053a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "$this$digest");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        Context a = b.mo134528a();
        CharSequence a2 = C34349o.m133202a(a, message, true, true, true);
        if (message.getType() == Message.Type.MERGE_FORWARD) {
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "getContent<MergeForwardContent>()");
            C29597a a3 = C34232o.m132851a().mo121388a((MergeForwardContent) content);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder append = spannableStringBuilder.append(a2);
            append.append((CharSequence) (' ' + a3.f74159a));
            return new SpannedString(spannableStringBuilder);
        } else if (message.getType() == Message.Type.SHARE_USER_CARD) {
            String a4 = C57582a.m223604a(a, (int) R.string.Lark_IMChatPin_PreviewContactCard_Text);
            Intrinsics.checkExpressionValueIsNotNull(a4, "UiUtils.getString(contex…_PreviewContactCard_Text)");
            return a4;
        } else if (message.getType() == Message.Type.SHARE_GROUP_CHAT) {
            String a5 = C57582a.m223604a(a, (int) R.string.Lark_IMChatPin_PreviewGroupCard_Text);
            Intrinsics.checkExpressionValueIsNotNull(a5, "UiUtils.getString(contex…in_PreviewGroupCard_Text)");
            return a5;
        } else {
            Intrinsics.checkExpressionValueIsNotNull(a2, "result");
            return a2;
        }
    }

    /* renamed from: a */
    public static final String m133054a(Chat.Announcement announcement, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(announcement, "announcement");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        String str2 = announcement.doc_url;
        Intrinsics.checkExpressionValueIsNotNull(str2, "docUrl");
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "";
        }
        return announcement.doc_url + "?open_type=announce&chat_id=" + str + "&from=group_announcement";
    }
}
