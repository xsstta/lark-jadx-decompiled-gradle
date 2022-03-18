package com.ss.android.lark.chat.service;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/service/IChatRelationPushSubscriber;", "", "registerPush", "", "chatId", "", "listener", "Lcom/ss/android/lark/chat/service/IPushChatRelationListener;", "unRegisterPush", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.service.a */
public interface IChatRelationPushSubscriber {
    /* renamed from: a */
    void mo126541a(String str);

    /* renamed from: a */
    void mo126542a(String str, IPushChatRelationListener hVar);
}
