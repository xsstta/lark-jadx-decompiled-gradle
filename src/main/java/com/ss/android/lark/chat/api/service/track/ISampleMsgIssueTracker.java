package com.ss.android.lark.chat.api.service.track;

import com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker;
import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/ISampleMsgIssueTracker;", "Lcom/ss/android/lark/chat/api/service/track/ICommonMsgIssueTracker;", "bindChat", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "fetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessageSourceFetcher;", "syncFetcher", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleIssueTracker$IMessagePipeSyncFetcher;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.track.e */
public interface ISampleMsgIssueTracker extends ICommonMsgIssueTracker {
    /* renamed from: a */
    void mo121422a(Chat chat, MsgSampleIssueTracker.IMessageSourceFetcher cVar, MsgSampleIssueTracker.IMessagePipeSyncFetcher bVar);
}
