package com.ss.android.lark.chat.message_menu.context;

import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/context/ChatThreadActionContext;", "Lcom/ss/android/lark/chat/message_menu/context/ChatActionContext;", "hiveGroupCell", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;", "hiveGroupHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;", "pageType", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "menuHandlerHub", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;", "(Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.a.b */
public abstract class ChatThreadActionContext extends AbstractC33010a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThreadActionContext(AbstractView$OnClickListenerC59005c<?, ?> cVar, C59008d dVar, ActionContext.PageType pageType, AbstractC33342d dVar2, AbstractC33120i iVar) {
        super(cVar, dVar, pageType, dVar2, iVar);
        Intrinsics.checkParameterIsNotNull(cVar, "hiveGroupCell");
        Intrinsics.checkParameterIsNotNull(dVar, "hiveGroupHolder");
        Intrinsics.checkParameterIsNotNull(pageType, "pageType");
        Intrinsics.checkParameterIsNotNull(dVar2, "chatContext");
        Intrinsics.checkParameterIsNotNull(iVar, "menuHandlerHub");
    }
}
