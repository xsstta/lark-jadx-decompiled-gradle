package com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar;

import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f;
import com.ss.android.lark.chat.chatwindow.chat.banner.BannerController;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.ui.IActionTitlebar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003?@AJ\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u001a\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\nH&J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0015\u001a\u00020\nH&J\b\u0010\u0016\u001a\u00020\nH&J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0014\u0010\u001c\u001a\u00020\n2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH&J\b\u0010\u001f\u001a\u00020\nH&J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H&J\b\u0010\"\u001a\u00020\nH&J\b\u0010#\u001a\u00020\nH&J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H&J\u0010\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020+H&J$\u0010,\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0.H&J\b\u00100\u001a\u00020\nH&J\b\u00101\u001a\u00020\nH&J&\u00102\u001a\u00020\n2\b\b\u0001\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u001b2\n\b\u0002\u00105\u001a\u0004\u0018\u000106H&J\u0012\u00107\u001a\u00020\n2\b\b\u0001\u00108\u001a\u00020\u0006H&J$\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u001b2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H&¨\u0006B"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "addAction", "Landroid/view/View;", "index", "", "titleBarViewAction", "Lcom/ss/android/lark/ui/IActionTitlebar$BaseAction;", "addBannerControllerListener", "", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$OnBannerControllerInitListener;", "addBannerView", ShareHitPoint.f121869d, "view", "addBannerVisibilityListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$IBannerVisibilityListener;", "changeToDarkMode", "getRootView", "getTitleMenuView", "hideAllTitleBar", "hideTitle", "locateTabIcon", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "showManagerTab", "", "registerBanner", "bannerView", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/IBannerView;", "removeAllActions", "removeBannerControllerListener", "removeBannerVisibilityListener", "restore", "save", "selectTab", "tabId", "", "setMeetingRoleProvider", "provider", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$MeetingRoleProvider;", "setTitleBarListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "setupTitleTabs", "binder", "Lkotlin/Function1;", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "showAllTitleBar", "showTitle", "toggleBanner", "bannerType", "visible", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/chatwindow/chat/banner/IBannerData;", "unregisterBanner", "key", "updateUserStatus", "show", "description", "", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "IBannerVisibilityListener", "MeetingRoleProvider", "OnBannerControllerInitListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.b */
public interface ITitlebarComponent extends IComponent<IComponentCallbacks> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$IBannerVisibilityListener;", "", "onBannerHide", "", "onBannerShow", "bannerHeight", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.b$b */
    public interface IBannerVisibilityListener {
        /* renamed from: a */
        void mo122156a();

        /* renamed from: a */
        void mo122157a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$MeetingRoleProvider;", "", "getMeetingRole", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.b$c */
    public interface MeetingRoleProvider {
        /* renamed from: a */
        int mo123717a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$OnBannerControllerInitListener;", "", "init", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.b$d */
    public interface OnBannerControllerInitListener {
        /* renamed from: a */
        void mo123718a();
    }

    /* renamed from: a */
    View mo123663a(int i, IActionTitlebar.BaseAction baseAction);

    /* renamed from: a */
    void mo123664a(@BannerController.BannerType int i);

    /* renamed from: a */
    void mo123665a(@BannerController.BannerType int i, View view);

    /* renamed from: a */
    void mo123667a(@BannerController.BannerType int i, boolean z, AbstractC33155c cVar);

    /* renamed from: a */
    void mo123668a(AbstractC33187f<?> fVar);

    /* renamed from: a */
    void mo123669a(TitlebarComponent.OnTitlebarListener eVar);

    /* renamed from: a */
    void mo123670a(IBannerVisibilityListener bVar);

    /* renamed from: a */
    void mo123671a(MeetingRoleProvider cVar);

    /* renamed from: a */
    void mo123672a(OnBannerControllerInitListener dVar);

    /* renamed from: a */
    void mo123675a(Chat chat, Function1<? super UDTabLayout, Unit> function1);

    /* renamed from: a */
    void mo123676a(Chat chat, boolean z);

    View ar_();

    /* renamed from: c */
    void mo121985c();

    /* renamed from: i */
    View mo123681i();

    /* renamed from: j */
    void mo123682j();

    /* renamed from: k */
    void mo123683k();

    /* renamed from: l */
    void mo123684l();

    /* renamed from: m */
    void mo123685m();

    /* renamed from: n */
    void mo123686n();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.b$a */
    public static final class C33731a {
        /* renamed from: a */
        public static void m130811a(ITitlebarComponent bVar, IComponentCallbacks gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "callback");
            IComponent.C33505b.m129842a(bVar, gVar);
        }

        /* renamed from: a */
        public static boolean m130812a(ITitlebarComponent bVar) {
            return IComponent.C33505b.m129843a(bVar);
        }

        /* renamed from: a */
        public static /* synthetic */ void m130810a(ITitlebarComponent bVar, int i, boolean z, AbstractC33155c cVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    cVar = null;
                }
                bVar.mo123667a(i, z, cVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleBanner");
        }
    }
}
