package com.ss.android.lark.chat.topnoticemessage.message.entity;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMsgType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/message/entity/StickerTopNoticeMessage;", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/GeneralTopNoticeMessage;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", "digest", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "key", "", "(Lcom/ss/android/lark/chat/entity/chatter/Chatter;Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;Ljava/lang/CharSequence;ILcom/ss/android/lark/chat/entity/message/Message;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.message.a.e */
public final class StickerTopNoticeMessage extends GeneralTopNoticeMessage {

    /* renamed from: a */
    private final String f88652a;

    /* renamed from: g */
    public final String mo126904g() {
        return this.f88652a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerTopNoticeMessage(Chatter chatter, TopNoticeMsgType topNoticeMsgType, CharSequence charSequence, int i, Message message, String str) {
        super(chatter, topNoticeMsgType, charSequence, i, message);
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Intrinsics.checkParameterIsNotNull(topNoticeMsgType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(charSequence, "digest");
        Intrinsics.checkParameterIsNotNull(message, "message");
        this.f88652a = str;
    }
}
