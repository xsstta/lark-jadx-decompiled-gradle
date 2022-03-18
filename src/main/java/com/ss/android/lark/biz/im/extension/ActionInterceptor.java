package com.ss.android.lark.biz.im.extension;

import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/biz/im/extension/ActionInterceptor;", "", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "needCheckMessage", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "shouldIntercept", "messageAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.extension.a */
public interface ActionInterceptor {
    /* renamed from: a */
    Collection<ActionContext.PageType> mo106803a();

    /* renamed from: a */
    boolean mo106804a(MessageAction hVar, ActionContext actionContext);

    /* renamed from: a */
    boolean mo106805a(Message.Type type);
}
