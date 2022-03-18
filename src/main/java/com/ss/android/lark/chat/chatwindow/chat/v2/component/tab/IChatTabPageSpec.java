package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import android.view.KeyEvent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow;
import com.ss.android.lark.tab.service.entity.ChatTab;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005:\u0003\"#$J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\r\u0010\u0015\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\u0012\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0012H&J\b\u0010 \u001a\u00020\u0012H&J\b\u0010!\u001a\u00020\u0012H&R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0004\u0018\u00018\u0001X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabFragment;", "S", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ISubChatWindow;", "contentViewCreatedCallback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "getContentViewCreatedCallback", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "setContentViewCreatedCallback", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;)V", "specDependency", "getSpecDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "setSpecDependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;)V", "destroy", "", "getChatTabType", "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "getPageContent", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabFragment;", "getTabData", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "getTabId", "", "getTabName", "", "loadTabData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onPageDisSelect", "onPageSelect", "preloadPage", "ContentViewCreatedCallback", "IChatTabPageSpecCreator", "OnTitleStateChangeListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.e */
public interface IChatTabPageSpec<T extends ChatTabFragment<S>, S extends CommonTabDependency> extends ISubChatWindow<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "", "onContentViewCreated", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.e$a */
    public interface ContentViewCreatedCallback {
        /* renamed from: a */
        void mo123178a();
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.e$b */
    public static final class C33694b {
        /* renamed from: a */
        public static <T extends ChatTabFragment<S>, S extends CommonTabDependency> boolean m130660a(IChatTabPageSpec<T, S> eVar, KeyEvent keyEvent) {
            Intrinsics.checkParameterIsNotNull(keyEvent, "event");
            return ISubChatWindow.C33695a.m130667a(eVar, keyEvent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0003\u0010\u0003*\u00020\u00042\u00020\u0005J0\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$IChatTabPageSpecCreator;", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabFragment;", "S", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "", "provideChatTabPageSpec", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "chatId", "", "chatTab", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "contentViewCreatedCallback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.e$c */
    public interface IChatTabPageSpecCreator<T extends ChatTabFragment<S>, S extends CommonTabDependency> {
        /* renamed from: a */
        IChatTabPageSpec<T, S> mo123600a(String str, ChatTab chatTab, ContentViewCreatedCallback aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "", "onPageTitleChangeState", "", "hide", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.e$d */
    public interface OnTitleStateChangeListener {
        /* renamed from: a */
        void mo123179a(boolean z);
    }

    /* renamed from: a */
    long mo123591a();

    /* renamed from: b */
    String mo123592b();

    /* renamed from: c */
    T mo123593c();

    /* renamed from: d */
    ChatTab mo123594d();

    /* renamed from: e */
    void mo123595e();

    /* renamed from: f */
    void mo123596f();
}
