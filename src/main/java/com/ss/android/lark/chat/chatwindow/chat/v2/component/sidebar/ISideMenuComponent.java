package com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar;

import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/sidebar/ISideMenuComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "onFragmentBringToFront", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.a */
public interface ISideMenuComponent extends IComponent<IComponentCallbacks> {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.a$a */
    public static final class C33651a {
        /* renamed from: a */
        public static void m130419a(ISideMenuComponent aVar, IComponentCallbacks gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "callback");
            IComponent.C33505b.m129842a(aVar, gVar);
        }

        /* renamed from: a */
        public static boolean m130420a(ISideMenuComponent aVar) {
            return IComponent.C33505b.m129843a(aVar);
        }
    }
}
