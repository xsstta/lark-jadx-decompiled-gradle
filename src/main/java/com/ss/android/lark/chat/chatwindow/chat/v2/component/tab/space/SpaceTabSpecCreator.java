package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space;

import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.SpaceFragment;
import com.ss.android.lark.tab.service.entity.ChatTab;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J0\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceTabSpecCreator;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$IChatTabPageSpecCreator;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;", "dependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;)V", "getDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;", "provideChatTabPageSpec", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "chatId", "", "chatTab", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "contentViewCreatedCallback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.e */
public final class SpaceTabSpecCreator implements IChatTabPageSpec.IChatTabPageSpecCreator<SpaceFragment, SpaceFragment.SpaceDependency> {

    /* renamed from: a */
    private final SpaceFragment.SpaceDependency f86787a;

    public SpaceTabSpecCreator(SpaceFragment.SpaceDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f86787a = bVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec.IChatTabPageSpecCreator
    /* renamed from: a */
    public IChatTabPageSpec<SpaceFragment, SpaceFragment.SpaceDependency> mo123600a(String str, ChatTab chatTab, IChatTabPageSpec.ContentViewCreatedCallback aVar) {
        Intrinsics.checkParameterIsNotNull(chatTab, "chatTab");
        return new SpaceTabSpec(str, chatTab, aVar, this.f86787a);
    }
}
