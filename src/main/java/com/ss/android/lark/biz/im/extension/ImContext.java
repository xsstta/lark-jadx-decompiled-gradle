package com.ss.android.lark.biz.im.extension;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u001c\u0010\n\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/biz/im/extension/ImContext;", "", "addChatWindowObserverFactory", "", "factory", "Lcom/ss/android/lark/biz/im/extension/ExtensionFactory;", "Lcom/ss/android/lark/biz/im/extension/ChatContext;", "Lcom/ss/android/lark/biz/im/extension/ChatWindowObserver;", "addMessageActionFactory", "Lcom/ss/android/lark/biz/im/extension/MessageActionFactory;", "removeChatWindowObserverFactory", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.extension.f */
public interface ImContext {
    /* renamed from: a */
    void mo106815a(ExtensionFactory<ChatContext, ChatWindowObserver> eVar);

    /* renamed from: a */
    void mo106816a(MessageActionFactory iVar);
}
