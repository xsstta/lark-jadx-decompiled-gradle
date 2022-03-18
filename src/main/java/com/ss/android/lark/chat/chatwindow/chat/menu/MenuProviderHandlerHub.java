package com.ss.android.lark.chat.chatwindow.chat.menu;

import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/menu/MenuProviderHandlerHub;", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/IMenuProviderHandler;", "()V", "target", "tempProviders", "Ljava/util/LinkedList;", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/IMessageMenuProvider;", "addMessageMenuProvider", "", "menuProvider", "setTarget", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.e */
public final class MenuProviderHandlerHub implements IMenuProviderHandler {

    /* renamed from: a */
    private final LinkedList<IMessageMenuProvider> f85281a = new LinkedList<>();

    /* renamed from: b */
    private IMenuProviderHandler f85282b;

    /* renamed from: a */
    public final void mo122328a(IMenuProviderHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "target");
        this.f85282b = bVar;
        while (!this.f85281a.isEmpty()) {
            IMessageMenuProvider poll = this.f85281a.poll();
            if (poll != null) {
                bVar.mo122257a(poll);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.menu.IMenuProviderHandler
    /* renamed from: a */
    public void mo122257a(IMessageMenuProvider cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "menuProvider");
        IMenuProviderHandler bVar = this.f85282b;
        if (bVar == null) {
            this.f85281a.add(cVar);
        } else {
            bVar.mo122257a(cVar);
        }
    }
}
