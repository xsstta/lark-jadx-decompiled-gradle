package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist;

import android.view.KeyEvent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\b\u0010\u0011\u001a\u00020\u0004H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/IMessageListChatWindow;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ISubChatWindow;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment;", "addActivityResultHandler", "", "handle", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IActivityResultHandler;", "addShowSmartReplyHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IShowSmartReplyHandler;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "onBannerHide", "onBannerShow", "bannerHeight", "", "removeActivityResultHandler", "removeShowSmartReplyHandler", "replaceComponentForSecret", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.a */
public interface IMessageListChatWindow extends ISubChatWindow<MessageListFragment> {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.a$a */
    public static final class C33670a {
        /* renamed from: a */
        public static boolean m130497a(IMessageListChatWindow aVar, KeyEvent keyEvent) {
            Intrinsics.checkParameterIsNotNull(keyEvent, "event");
            return ISubChatWindow.C33695a.m130667a(aVar, keyEvent);
        }
    }

    /* renamed from: a */
    void mo123551a(int i);

    /* renamed from: a */
    void mo123552a(IChatWindowApp.IActivityResultHandler aVar);

    /* renamed from: a */
    void mo123553a(IChatWindowApp.IShowSmartReplyHandler dVar);

    /* renamed from: j */
    void mo123562j();

    /* renamed from: k */
    IMessageSender mo123563k();

    /* renamed from: l */
    void mo123564l();
}
