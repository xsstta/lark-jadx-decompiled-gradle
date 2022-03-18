package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IDependencyViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J%\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH&¢\u0006\u0002\u0010\tJ/\u0010\n\u001a\u0004\u0018\u0001H\u0005\"\u0010\b\u0000\u0010\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH&¢\u0006\u0002\u0010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "", "closePage", "", "getChatWindowViewModel", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "getComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.d */
public interface CommonTabDependency {
    /* renamed from: a */
    <T extends IComponent<? extends IComponentCallbacks>> T mo123568a(Class<T> cls);

    /* renamed from: a */
    void mo123569a();

    /* renamed from: b */
    <T extends IDependencyViewModel> T mo123570b(Class<T> cls);
}
