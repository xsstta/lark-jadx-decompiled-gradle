package com.ss.android.lark.chatsetting.impl.chat_function;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.SideBarButton;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.chat_function.item.AdditionalItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.FindTimeItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.GroupAnnouncementItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.PinItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.TodoListItem;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004H\u0002J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionItemFactory;", "", "()V", "buildAdditionalItem", "", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "sideBarButtons", "Lcom/ss/android/lark/chat/entity/chat/SideBarButton;", "createChatFunctionItemList", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "selfChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "currChatter", "showPin", "", "createDefaultGroupItemList", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.c */
public final class ChatFunctionItemFactory {

    /* renamed from: a */
    public static final ChatFunctionItemFactory f89092a = new ChatFunctionItemFactory();

    private ChatFunctionItemFactory() {
    }

    /* renamed from: a */
    private final List<IChatFunctionItem> m134054a(List<SideBarButton> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (SideBarButton sideBarButton : list) {
            arrayList.add(new AdditionalItem(sideBarButton.getLabelName(), sideBarButton.getIconKey(), sideBarButton.getUrl()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<IChatFunctionItem> mo127583a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        ArrayList arrayList = new ArrayList();
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        boolean a2 = a.mo127284n().mo127297a("pin.sidebar");
        AbstractC34461c a3 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "ChatSettingModule.getDependency()");
        if (a3.mo127290t().mo127421a(chat, (Message) null) && a2) {
            arrayList.add(new PinItem(chat));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<IChatFunctionItem> mo127584a(Chat chat, ChatChatter chatChatter, ChatChatter chatChatter2) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        return mo127585a(chat, chatChatter, chatChatter2, true);
    }

    /* renamed from: a */
    public final List<IChatFunctionItem> mo127585a(Chat chat, ChatChatter chatChatter, ChatChatter chatChatter2, boolean z) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        ArrayList arrayList = new ArrayList();
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        if (a.mo127284n().mo127297a("leanMode")) {
            return arrayList;
        }
        if (!DesktopUtil.m144307b()) {
            arrayList.addAll(m134054a(chat.getSideBarButtons()));
        }
        AbstractC34461c a2 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ChatSettingModule.getDependency()");
        boolean a3 = a2.mo127284n().mo127297a("chat.groupNotice");
        if (!chat.isP2PChat() && !chat.isSecret() && !chat.isOnCall() && a3) {
            arrayList.add(new GroupAnnouncementItem(chat));
        }
        AbstractC34461c a4 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34485x u = a4.mo127291u();
        Intrinsics.checkExpressionValueIsNotNull(u, "ChatSettingModule.getDependency().todoDependency");
        if (u.mo127452a() && !chat.isSecret() && !DesktopUtil.m144307b() && !chat.isSuper() && !chat.isCrossWithKa()) {
            arrayList.add(new TodoListItem(chat));
        }
        AbstractC34461c a5 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a5, "ChatSettingModule.getDependency()");
        boolean a6 = a5.mo127284n().mo127297a("pin.sidebar");
        AbstractC34461c a7 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a7, "ChatSettingModule.getDependency()");
        if (a7.mo127290t().mo127421a(chat, (Message) null) && z && a6) {
            arrayList.add(new PinItem(chat));
        }
        if (!chat.isEdu()) {
            AbstractC34461c a8 = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a8, "ChatSettingModule.getDependency()");
            if (a8.mo127282l().mo127310a(chat, chatChatter2) && !chat.isSuper()) {
                arrayList.add(new FindTimeItem(chat, chatChatter2));
            }
        }
        return arrayList;
    }
}
