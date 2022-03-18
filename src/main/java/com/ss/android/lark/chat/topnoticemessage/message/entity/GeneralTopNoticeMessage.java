package com.ss.android.lark.chat.topnoticemessage.message.entity;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMsgType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0002\u0010\fR\u0014\u0010\u000b\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/message/entity/GeneralTopNoticeMessage;", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "Lcom/ss/android/lark/chat/entity/message/Message;", "fromChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", "digest", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/ss/android/lark/chat/entity/chatter/Chatter;Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;Ljava/lang/CharSequence;ILcom/ss/android/lark/chat/entity/message/Message;)V", "getData", "()Lcom/ss/android/lark/chat/entity/message/Message;", "getDigest", "()Ljava/lang/CharSequence;", "getFromChatter", "()Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getType", "()Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", "getVersion", "()I", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.message.a.b */
public class GeneralTopNoticeMessage implements ITopNoticeMessage<Message> {

    /* renamed from: a */
    private final Chatter f88646a;

    /* renamed from: b */
    private final TopNoticeMsgType f88647b;

    /* renamed from: c */
    private final CharSequence f88648c;

    /* renamed from: d */
    private final int f88649d;

    /* renamed from: e */
    private final Message f88650e;

    @Override // com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage
    /* renamed from: a */
    public Chatter mo126895a() {
        return this.f88646a;
    }

    @Override // com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage
    /* renamed from: b */
    public TopNoticeMsgType mo126896b() {
        return this.f88647b;
    }

    /* renamed from: c */
    public Message mo126900f() {
        return this.f88650e;
    }

    @Override // com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage
    /* renamed from: d */
    public CharSequence mo126898d() {
        return this.f88648c;
    }

    @Override // com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage
    /* renamed from: e */
    public int mo126899e() {
        return this.f88649d;
    }

    public GeneralTopNoticeMessage(Chatter chatter, TopNoticeMsgType topNoticeMsgType, CharSequence charSequence, int i, Message message) {
        Intrinsics.checkParameterIsNotNull(chatter, "fromChatter");
        Intrinsics.checkParameterIsNotNull(topNoticeMsgType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(charSequence, "digest");
        Intrinsics.checkParameterIsNotNull(message, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f88646a = chatter;
        this.f88647b = topNoticeMsgType;
        this.f88648c = charSequence;
        this.f88649d = i;
        this.f88650e = message;
    }
}
