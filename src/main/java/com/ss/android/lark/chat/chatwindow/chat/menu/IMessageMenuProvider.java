package com.ss.android.lark.chat.chatwindow.chat.menu;

import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H&J(\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\b\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/menu/IMessageMenuProvider;", "", "getMenuFilter", "Lcom/ss/android/lark/chat/base/view/menu/IMenuFilter;", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "getMenuItem", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "menuHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "item", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "isEnabled", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.c */
public interface IMessageMenuProvider {
    /* renamed from: a */
    C34029b<?> mo122161a(AbstractC33120i iVar, AbstractC59010e eVar, ChatMessageVO<?> cVar);

    /* renamed from: f */
    AbstractC32928b<AbsMessageVO<?>> mo122171f();

    /* renamed from: g */
    boolean mo122172g();
}
