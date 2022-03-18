package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator2;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.tab.service.entity.ChatTab;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()*J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH&J\b\u0010\u0012\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u0010H&J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u000eH&J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0016\u0010$\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H&¨\u0006+"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$ITabComponentCallback;", "bindTabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2;", "tabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "getCurrentTabId", "", "lockTab", "", "lock", "onBannerHide", "onBannerShow", "bannerHeight", "", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "registerTabSwitchListener", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabSwitchListener;", "registerTabViewChangeObserver", "observer", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabViewChangeObserver;", "replaceComponentForSecret", "setCurrentTab", "id", "unRegisterTabSwitchListener", "unRegisterTabViewChangeObserver", "updateChatTabs", "chatTabs", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "ITabComponentCallback", "OnTabSwitchListener", "OnTabViewChangeObserver", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.g */
public interface ITabComponent extends IComponent<ITabComponentCallback> {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.g$a */
    public static final class C33696a {
        /* renamed from: a */
        public static void m130676a(ITabComponent gVar, ITabComponentCallback bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
            IComponent.C33505b.m129842a(gVar, bVar);
        }

        /* renamed from: a */
        public static boolean m130677a(ITabComponent gVar) {
            return IComponent.C33505b.m129843a(gVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$ITabComponentCallback;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.g$b */
    public interface ITabComponentCallback extends IComponentCallbacks {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabSwitchListener;", "", "onTabSwitchListener", "", "tabId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.g$c */
    public interface OnTabSwitchListener {
        /* renamed from: a */
        void mo123626a(long j);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabViewChangeObserver;", "", "onTabViewsChanged", "", "chatTabs", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.g$d */
    public interface OnTabViewChangeObserver {
        /* renamed from: a */
        void mo123627a(List<ChatTab> list);
    }

    /* renamed from: a */
    UDTabLayoutCoordinator2 mo123541a(UDTabLayout uDTabLayout);

    /* renamed from: a */
    void mo123542a(long j);

    /* renamed from: a */
    void mo123544a(OnTabSwitchListener cVar);

    /* renamed from: a */
    void mo123545a(OnTabViewChangeObserver dVar);

    /* renamed from: a */
    void mo123546a(List<ChatTab> list);

    /* renamed from: a */
    void mo123547a(boolean z);

    /* renamed from: b */
    void mo123548b(OnTabSwitchListener cVar);

    /* renamed from: b */
    void mo123549b(OnTabViewChangeObserver dVar);
}
