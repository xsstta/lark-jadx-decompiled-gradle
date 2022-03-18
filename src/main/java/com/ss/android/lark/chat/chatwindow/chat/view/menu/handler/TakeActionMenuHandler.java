package com.ss.android.lark.chat.chatwindow.chat.view.menu.handler;

import android.content.Context;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33131t;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/view/menu/handler/TakeActionMenuHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/ITakeActionMenuHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onTakeActionClick", "", "chatId", "", "messageId", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.a.a.c */
public final class TakeActionMenuHandler implements AbstractC33131t {

    /* renamed from: a */
    private final Context f87358a;

    public TakeActionMenuHandler(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f87358a = context;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33131t
    /* renamed from: a */
    public void mo122320a(String str, String str2, Message.Type type) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "messageId");
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.ai().mo134636a(this.f87358a, str, CollectionsKt.listOf(str2), CollectionsKt.listOf(Integer.valueOf(type.getNumber())));
    }
}
