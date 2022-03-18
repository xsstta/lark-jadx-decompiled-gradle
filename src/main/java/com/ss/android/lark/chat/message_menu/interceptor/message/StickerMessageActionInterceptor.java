package com.ss.android.lark.chat.message_menu.interceptor.message;

import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionInterceptor;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/interceptor/message/StickerMessageActionInterceptor;", "Lcom/ss/android/lark/biz/im/extension/ActionInterceptor;", "()V", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "needCheckMessage", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "shouldIntercept", "messageAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.b.a.h */
public final class StickerMessageActionInterceptor implements ActionInterceptor {
    @Override // com.ss.android.lark.biz.im.extension.ActionInterceptor
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106803a() {
        return CollectionsKt.listOf((Object[]) new ActionContext.PageType[]{ActionContext.PageType.NORMAL_SINGLE_CHAT, ActionContext.PageType.SECRET_SINGLE_CHAT, ActionContext.PageType.NORMAL_GROUP_CHAT, ActionContext.PageType.SECRET_GROUP_CHAT, ActionContext.PageType.CHAT_THREAD});
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionInterceptor
    /* renamed from: a */
    public boolean mo106805a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (type == Message.Type.STICKER) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionInterceptor
    /* renamed from: a */
    public boolean mo106804a(MessageAction hVar, ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(hVar, "messageAction");
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        if (hVar.mo106818a() == 25) {
            return true;
        }
        return false;
    }
}
