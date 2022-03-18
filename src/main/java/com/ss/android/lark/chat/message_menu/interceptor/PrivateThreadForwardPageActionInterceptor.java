package com.ss.android.lark.chat.message_menu.interceptor;

import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionInterceptor;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/interceptor/PrivateThreadForwardPageActionInterceptor;", "Lcom/ss/android/lark/biz/im/extension/ActionInterceptor;", "()V", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "needCheckMessage", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "shouldIntercept", "messageAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.b.d */
public final class PrivateThreadForwardPageActionInterceptor implements ActionInterceptor {

    /* renamed from: a */
    public static final Companion f84913a = new Companion(null);

    /* renamed from: b */
    private static final List<Integer> f84914b = CollectionsKt.listOf((Object[]) new Integer[]{8, 9, 11, 12, 26});

    @Override // com.ss.android.lark.biz.im.extension.ActionInterceptor
    /* renamed from: a */
    public boolean mo106805a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/interceptor/PrivateThreadForwardPageActionInterceptor$Companion;", "", "()V", "allowedMenuIdList", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.c.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionInterceptor
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106803a() {
        return CollectionsKt.listOf(ActionContext.PageType.PRIVATE_THREAD_FORWARD);
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionInterceptor
    /* renamed from: a */
    public boolean mo106804a(MessageAction hVar, ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(hVar, "messageAction");
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        return !f84914b.contains(Integer.valueOf(hVar.mo106818a()));
    }
}
