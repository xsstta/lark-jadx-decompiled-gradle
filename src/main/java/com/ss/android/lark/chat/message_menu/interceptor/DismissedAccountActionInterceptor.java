package com.ss.android.lark.chat.message_menu.interceptor;

import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionInterceptor;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/interceptor/DismissedAccountActionInterceptor;", "Lcom/ss/android/lark/biz/im/extension/ActionInterceptor;", "()V", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "needCheckMessage", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "shouldIntercept", "messageAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.b.b */
public final class DismissedAccountActionInterceptor implements ActionInterceptor {
    @Override // com.ss.android.lark.biz.im.extension.ActionInterceptor
    /* renamed from: a */
    public boolean mo106805a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return true;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionInterceptor
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106803a() {
        return CollectionsKt.listOf((Object[]) new ActionContext.PageType[]{ActionContext.PageType.SECRET_SINGLE_CHAT, ActionContext.PageType.NORMAL_SINGLE_CHAT});
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionInterceptor
    /* renamed from: a */
    public boolean mo106804a(MessageAction hVar, ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(hVar, "messageAction");
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        Chatter k = actionContext.mo106791k();
        if (k != null && k.isDimission()) {
            int a = hVar.mo106818a();
            if (a != 7) {
                if (a != 9) {
                    if (!(a == 15 || a == 21)) {
                        switch (a) {
                        }
                    }
                }
                if (actionContext.mo106788h().mo121710r() == Message.Type.AUDIO) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
