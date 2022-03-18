package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator2;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tab.service.entity.ChatTab;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0018H\u0016J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0016H\u0016J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0016J\u0016\u0010/\u001a\u00020\u00182\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0016R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u00063"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/MockTabComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent;", "()V", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$ITabComponentCallback;", "getCallbacks", "()Ljava/util/List;", "callbacks$delegate", "Lkotlin/Lazy;", "bindTabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2;", "tabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "getCurrentTabId", "", "lockTab", "", "lock", "logMock", "msg", "", "onBannerHide", "onBannerShow", "bannerHeight", "", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "registerTabSwitchListener", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabSwitchListener;", "registerTabViewChangeObserver", "observer", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$OnTabViewChangeObserver;", "replaceComponentForSecret", "setCurrentTab", "id", "unRegisterTabSwitchListener", "unRegisterTabViewChangeObserver", "updateChatTabs", "chatTabs", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MockTabComponent extends Widget implements ITabComponent {

    /* renamed from: a */
    private final Lazy f86686a = LazyKt.lazy(C33652a.INSTANCE);

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public List<ITabComponent.ITabComponentCallback> mo121968a() {
        return (List) this.f86686a.getValue();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123544a(ITabComponent.OnTabSwitchListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123545a(ITabComponent.OnTabViewChangeObserver dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "observer");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: b */
    public void mo123548b(ITabComponent.OnTabSwitchListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: b */
    public void mo123549b(ITabComponent.OnTabViewChangeObserver dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "observer");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123547a(boolean z) {
        m130421a("lockTab");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: h */
    public boolean mo121990h() {
        return ITabComponent.C33696a.m130677a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabComponent$ITabComponentCallback;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.MockTabComponent$a */
    static final class C33652a extends Lambda implements Function0<ArrayList<ITabComponent.ITabComponentCallback>> {
        public static final C33652a INSTANCE = new C33652a();

        C33652a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<ITabComponent.ITabComponentCallback> invoke() {
            return new ArrayList<>();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123542a(long j) {
        m130421a("setCurrentTab");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public UDTabLayoutCoordinator2 mo123541a(UDTabLayout uDTabLayout) {
        Intrinsics.checkParameterIsNotNull(uDTabLayout, "tabLayout");
        m130421a("bindTabLayout");
        return null;
    }

    /* renamed from: a */
    private final void m130421a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("into tab component mock ");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        Log.m165383e("ChatWindowLog", sb.toString());
    }

    /* renamed from: a */
    public void mo121971a(ITabComponent.ITabComponentCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        ITabComponent.C33696a.m130676a(this, bVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent
    /* renamed from: a */
    public void mo123546a(List<ChatTab> list) {
        Intrinsics.checkParameterIsNotNull(list, "chatTabs");
        m130421a("updateChatTabs");
    }
}
