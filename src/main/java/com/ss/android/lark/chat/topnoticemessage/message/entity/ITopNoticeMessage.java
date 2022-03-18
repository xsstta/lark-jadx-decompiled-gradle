package com.ss.android.lark.chat.topnoticemessage.message.entity;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMsgType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/IBannerData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Ljava/lang/Object;", "digest", "", "getDigest", "()Ljava/lang/CharSequence;", "fromChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getFromChatter", "()Lcom/ss/android/lark/chat/entity/chatter/Chatter;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", "getType", "()Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "getVersion", "()I", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.message.a.c */
public interface ITopNoticeMessage<T> extends AbstractC33155c {
    /* renamed from: a */
    Chatter mo126895a();

    /* renamed from: b */
    TopNoticeMsgType mo126896b();

    /* renamed from: d */
    CharSequence mo126898d();

    /* renamed from: e */
    int mo126899e();

    /* renamed from: f */
    T mo126900f();
}
