package com.ss.android.lark.integrator.im.container;

import com.ss.android.lark.biz.im.extension.ActionInterceptor;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.ChatContext;
import com.ss.android.lark.biz.im.extension.ChatWindowObserver;
import com.ss.android.lark.biz.im.extension.ExtensionFactory;
import com.ss.android.lark.biz.im.extension.ImContext;
import com.ss.android.lark.biz.im.extension.MessageActionFactory;
import com.ss.android.lark.chat.message_menu.MessageActionManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J)\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0004H\u0002¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016R#\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/integrator/im/container/ImContextImpl;", "Lcom/ss/android/lark/biz/im/extension/ImContext;", "()V", "chatWindowObserverFactoryList", "", "Lcom/ss/android/lark/biz/im/extension/ExtensionFactory;", "Lcom/ss/android/lark/biz/im/extension/ChatContext;", "Lcom/ss/android/lark/biz/im/extension/ChatWindowObserver;", "getChatWindowObserverFactoryList", "()Ljava/util/List;", "addChatWindowObserverFactory", "", "factory", "addIfNotExists", "T", "item", "list", "(Ljava/lang/Object;Ljava/util/List;)V", "addMessageActionFactory", "Lcom/ss/android/lark/biz/im/extension/MessageActionFactory;", "removeChatWindowObserverFactory", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.d.b */
public final class ImContextImpl implements ImContext {

    /* renamed from: a */
    private final List<ExtensionFactory<ChatContext, ChatWindowObserver>> f101033a = new ArrayList();

    /* renamed from: a */
    public final List<ExtensionFactory<ChatContext, ChatWindowObserver>> mo143623a() {
        return this.f101033a;
    }

    @Override // com.ss.android.lark.biz.im.extension.ImContext
    /* renamed from: a */
    public void mo106815a(ExtensionFactory<ChatContext, ChatWindowObserver> eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "factory");
        m156644a(eVar, this.f101033a);
    }

    @Override // com.ss.android.lark.biz.im.extension.ImContext
    /* renamed from: a */
    public void mo106816a(MessageActionFactory iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "factory");
        Iterator<T> it = iVar.mo106827a().iterator();
        while (it.hasNext()) {
            MessageActionManager.f84892a.mo121933a((ActionProvider) it.next());
        }
        Iterator<T> it2 = iVar.mo106828b().iterator();
        while (it2.hasNext()) {
            MessageActionManager.f84892a.mo121932a((ActionInterceptor) it2.next());
        }
    }

    /* renamed from: a */
    private final <T> void m156644a(T t, List<T> list) {
        if (!list.contains(t)) {
            list.add(t);
        }
    }
}
