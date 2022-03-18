package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space;

import android.view.KeyEvent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.spacelist.SpaceListFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/ISpaceChatWindow;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ISubChatWindow;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/spacelist/SpaceListFragment;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.a */
public interface ISpaceChatWindow extends ISubChatWindow<SpaceListFragment> {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.a$a */
    public static final class C33687a {
        /* renamed from: a */
        public static boolean m130584a(ISpaceChatWindow aVar, KeyEvent keyEvent) {
            Intrinsics.checkParameterIsNotNull(keyEvent, "event");
            return ISubChatWindow.C33695a.m130667a(aVar, keyEvent);
        }
    }
}
