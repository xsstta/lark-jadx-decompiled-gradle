package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.biz.plugin.SkeletonPlugin;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.ChatPluginManager;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardExtendDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabDependeceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.ISpaceDependencyViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.spacelist.ISpaceListDependencyViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitleDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1638a.C33427a;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020'2\u0006\u0010(\u001a\u00020\nH\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000fH\u0016J\u0010\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001fH\u0016J\b\u0010/\u001a\u00020'H\u0002J\u0012\u00100\u001a\u00020!2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002042\u0006\u00105\u001a\u000208H\u0016J\b\u00109\u001a\u00020'H\u0016J-\u0010:\u001a\u0002H;\"\u0010\b\u0000\u0010;*\n\u0012\u0006\b\u0001\u0012\u00020=0<2\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H;0?H\u0016¢\u0006\u0002\u0010@J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020\u0004H\u0016J\b\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020GH\u0016J%\u0010H\u001a\u0002H;\"\b\b\u0000\u0010;*\u00020I2\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H;0?H\u0016¢\u0006\u0002\u0010JJ\b\u0010K\u001a\u000204H\u0016J\u0012\u0010L\u001a\u00020'2\b\u0010M\u001a\u0004\u0018\u00010NH\u0002J\b\u0010O\u001a\u00020'H\u0002J\b\u0010P\u001a\u00020'H\u0002J\b\u0010Q\u001a\u00020'H\u0002J\b\u0010R\u001a\u00020'H\u0002J\"\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u00112\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010X\u001a\u00020'H\u0016J\b\u0010Y\u001a\u00020'H\u0016J\b\u0010Z\u001a\u00020'H\u0016J\u0010\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020\u0004H\u0016J,\u0010]\u001a\u00020'2\u0006\u0010M\u001a\u00020N2\u001a\u0010^\u001a\u0016\u0012\u0004\u0012\u00020_\u0018\u00010\tj\n\u0012\u0004\u0012\u00020_\u0018\u0001`\u000bH\u0016J\u0012\u0010`\u001a\u00020\u00112\b\u0010a\u001a\u0004\u0018\u00010WH\u0016J\u0010\u0010b\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010c\u001a\u00020'2\u0006\u0010(\u001a\u00020\nH\u0016J\u0010\u0010d\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000fH\u0016J\u0010\u0010e\u001a\u00020'2\u0006\u0010(\u001a\u00020-H\u0016J\u0010\u0010f\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001fH\u0016J\u0010\u0010g\u001a\u00020'2\u0006\u0010h\u001a\u00020iH\u0002J\u0010\u0010j\u001a\u00020'2\u0006\u0010k\u001a\u00020lH\u0002R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\tj\b\u0012\u0004\u0012\u00020\u000f`\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\tj\b\u0012\u0004\u0012\u00020\u001f`\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000¨\u0006m"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowAppV2;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowAppExtend;", "chatBundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "viewDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$IViewDependence;", "(Lcom/ss/android/lark/biz/im/api/ChatBundle;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$IViewDependence;)V", "backPressHandlers", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IBackPressHandler;", "Lkotlin/collections/ArrayList;", "getChatBundle", "()Lcom/ss/android/lark/biz/im/api/ChatBundle;", "closeChatHandlers", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$ICloseChatHandler;", "layoutId", "", "getLayoutId", "()I", "mRootView", "Landroid/widget/FrameLayout;", "getMRootView", "()Landroid/widget/FrameLayout;", "setMRootView", "(Landroid/widget/FrameLayout;)V", "pluginManager", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/ChatPluginManager;", "tabComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent;", "titleStateChangeHandles", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "titlebarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent;", "getViewDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowApp$IViewDependence;", "viewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowViewModel;", "addActivityResultHandler", "", "handle", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IActivityResultHandler;", "addBackPressHandler", "addCloseHandler", "addShowSmartReplyHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IShowSmartReplyHandler;", "addTitleStateChangeHandler", "createComponents", "createTitleBarComponent", "titleBarDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "exitChat", "getComponent", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getContext", "Landroid/content/Context;", "getExtras", "getHostRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "getViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "handleBack", "hideFeedCard", "chatId", "", "initComponentDependency", "initPlugin", "initSkeleton", "initViewModel", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "onDestroy", "onFragmentBringToFront", "onNewIntent", "bundle", "openNewChat", "contactsToApply", "Lcom/ss/android/lark/contact/entity/Contact;", "parseNewIntentPurpose", "intent", "removeActivityResultHandler", "removeBackPressHandler", "removeCloseHandler", "removeShowSmartReplyHandler", "removeTitleStateChangeHandler", "reportEnterChatHitPoint", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "showOpenChatError", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatWindowAppV2 extends Widget implements IChatWindowAppExtend {

    /* renamed from: a */
    public ChatWindowViewModel f86311a;

    /* renamed from: b */
    public ChatPluginManager f86312b;

    /* renamed from: c */
    public TitlebarComponent f86313c;

    /* renamed from: d */
    public TabComponent f86314d;

    /* renamed from: e */
    public final ArrayList<IChatTabPageSpec.OnTitleStateChangeListener> f86315e = new ArrayList<>();

    /* renamed from: f */
    private final ArrayList<IChatWindowApp.IBackPressHandler> f86316f = new ArrayList<>();

    /* renamed from: g */
    private final ArrayList<IChatWindowApp.ICloseChatHandler> f86317g = new ArrayList<>();

    /* renamed from: h */
    private final ChatBundle f86318h;

    /* renamed from: i */
    private final ChatWindowApp.IViewDependence f86319i;
    @BindView(8599)
    public FrameLayout mRootView;

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return R.layout.activity_chat_window_tab;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: l */
    public void mo123141l() {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: b */
    public ChatBundle mo123134b() {
        return this.f86318h;
    }

    /* renamed from: c */
    public final ChatWindowApp.IViewDependence mo121985c() {
        return this.f86319i;
    }

    /* renamed from: a */
    public final void mo123171a(C35219b bVar) {
        CoreThreadPool.getSerialTaskHandler().post(new RunnableC33499h(bVar));
    }

    /* renamed from: a */
    public final void mo123172a(String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134512K().mo134688a(new Channel(Channel.Type.CHAT, str));
        }
        Log.m165379d("ChatWindowLog", "hideFeedCard:" + str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123127a(IChatWindowApp.ICloseChatHandler cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "handle");
        this.f86317g.add(cVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123128a(IChatWindowApp.IShowSmartReplyHandler dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "handle");
        TabComponent tabComponent = this.f86314d;
        if (tabComponent != null) {
            tabComponent.mo123553a(dVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123129a(IChatTabPageSpec.OnTitleStateChangeListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "handle");
        this.f86315e.add(dVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: a */
    public boolean mo123132a(KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        TabComponent tabComponent = this.f86314d;
        if (tabComponent != null) {
            return tabComponent.mo123557a(keyEvent);
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: a */
    public boolean mo123133a(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return IChatWindowAppExtend.C33504a.m129838a(this, motionEvent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowAppV2$createTitleBarComponent$listener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "onLeftClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$d */
    public static final class C33495d implements TitlebarComponent.OnTitlebarListener {

        /* renamed from: a */
        final /* synthetic */ ChatWindowAppV2 f86324a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.OnTitlebarListener
        /* renamed from: a */
        public void mo123157a() {
            this.f86324a.mo123138i();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33495d(ChatWindowAppV2 chatWindowAppV2) {
            this.f86324a = chatWindowAppV2;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: i */
    public void mo123138i() {
        this.f86319i.mo123002c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowAppV2$createComponents$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;", "getFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "onBannerHide", "", "onBannerShow", "bannerHeight", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$a */
    public static final class C33491a implements TitlebarComponent.ITitleBarComponentDependency {

        /* renamed from: a */
        final /* synthetic */ ChatWindowAppV2 f86320a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.ITitleBarComponentDependency
        /* renamed from: a */
        public void mo123144a() {
            TabComponent tabComponent = this.f86320a.f86314d;
            if (tabComponent != null) {
                tabComponent.mo123564l();
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.ITitleBarComponentDependency
        /* renamed from: b */
        public BaseFragment mo123146b() {
            return this.f86320a.mo121985c().mo123001b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33491a(ChatWindowAppV2 chatWindowAppV2) {
            this.f86320a = chatWindowAppV2;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent.ITitleBarComponentDependency
        /* renamed from: a */
        public void mo123145a(int i) {
            TabComponent tabComponent = this.f86320a.f86314d;
            if (tabComponent != null) {
                tabComponent.mo123551a(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J%\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\u0004\u0018\u0001H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowAppV2$createComponents$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabComponent$ITabComponentDependency;", "closePage", "", "getBaseFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getChatWindowViewModel", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "getComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$b */
    public static final class C33492b implements TabComponent.ITabComponentDependency {

        /* renamed from: a */
        final /* synthetic */ ChatWindowAppV2 f86321a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent.ITabComponentDependency
        /* renamed from: a */
        public BaseFragment mo123174a() {
            return this.f86321a.mo121985c().mo123001b();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent.ITabComponentDependency
        /* renamed from: b */
        public void mo123177b() {
            this.f86321a.mo121985c().mo123002c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33492b(ChatWindowAppV2 chatWindowAppV2) {
            this.f86321a = chatWindowAppV2;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent.ITabComponentDependency
        /* renamed from: b */
        public <T extends IDependencyViewModel> T mo123176b(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86321a.mo123173b(cls);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabComponent.ITabComponentDependency
        /* renamed from: a */
        public <T extends IComponent<? extends IComponentCallbacks>> T mo123175a(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86321a.mo123122a(cls);
        }
    }

    /* renamed from: p */
    private final void m129769p() {
        TabComponent tabComponent = this.f86314d;
        if (tabComponent != null) {
            tabComponent.mo123554a(new C33496e(this));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: g */
    public IMessageSender mo123136g() {
        TabComponent tabComponent = this.f86314d;
        if (tabComponent == null) {
            Intrinsics.throwNpe();
        }
        return tabComponent.mo123563k();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget, com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        ChatPluginManager bVar = this.f86312b;
        if (bVar != null) {
            bVar.mo122132a();
        }
        ChatParamUtils.m133150c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowAppV2$createComponents$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "onContentViewCreated", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$c */
    public static final class C33493c implements IChatTabPageSpec.ContentViewCreatedCallback {

        /* renamed from: a */
        final /* synthetic */ ChatWindowAppV2 f86322a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec.ContentViewCreatedCallback
        /* renamed from: a */
        public void mo123178a() {
            ChatWindowViewModel bVar = this.f86322a.f86311a;
            if (bVar != null) {
                bVar.loadChatInitData(new C33494a(this));
            }
            this.f86322a.mo123169a();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowAppV2$createComponents$3$onContentViewCreated$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowViewModel$ISecretComponentReplaceCallback;", "onComponentReplace", "", "needReplace", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$c$a */
        public static final class C33494a implements ChatWindowViewModel.ISecretComponentReplaceCallback {

            /* renamed from: a */
            final /* synthetic */ C33493c f86323a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33494a(C33493c cVar) {
                this.f86323a = cVar;
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowViewModel.ISecretComponentReplaceCallback
            /* renamed from: a */
            public void mo123162a(boolean z) {
                TabComponent tabComponent;
                if (z && (tabComponent = this.f86323a.f86322a.f86314d) != null) {
                    tabComponent.mo123562j();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33493c(ChatWindowAppV2 chatWindowAppV2) {
            this.f86322a = chatWindowAppV2;
        }
    }

    /* renamed from: a */
    public final void mo123169a() {
        SkeletonPlugin gVar;
        ChatPluginManager bVar = this.f86312b;
        if (bVar != null && (gVar = (SkeletonPlugin) bVar.mo122131a(SkeletonPlugin.class)) != null) {
            gVar.mo122201a(this, this.f86318h.f74037k);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: f */
    public Context mo123135f() {
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        Context context = K.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "contentView!!.context");
        return context;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: k */
    public ILKUILayout mo123140k() {
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        if (frameLayout != null) {
            return (ILKUILayout) frameLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ui.layout.ILKUILayout");
    }

    /* renamed from: m */
    private final void m129767m() {
        ChatWindowViewModel bVar = this.f86311a;
        if (bVar != null) {
            ChatWindowAppV2 chatWindowAppV2 = this;
            C33427a.m129533a(bVar.getPluginInitData(), chatWindowAppV2, new C33497f(this));
            bVar.getInitErrorInfo().mo5923a(chatWindowAppV2, new C33498g(this));
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        View K = mo141184K();
        if (K != null) {
            ButterKnife.bind(this, K);
            m129766h();
            m129767m();
            m129768n();
            m129769p();
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp, com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: j */
    public boolean mo123139j() {
        Iterator<IChatWindowApp.IBackPressHandler> it = this.f86316f.iterator();
        while (it.hasNext()) {
            if (it.next().mo123195a()) {
                return true;
            }
        }
        TabComponent tabComponent = this.f86314d;
        if (tabComponent != null && tabComponent.mo121990h()) {
            return true;
        }
        Iterator<IChatWindowApp.ICloseChatHandler> it2 = this.f86317g.iterator();
        while (it2.hasNext()) {
            it2.next().mo123196a();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$h */
    public static final class RunnableC33499h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35219b f86328a;

        RunnableC33499h(C35219b bVar) {
            this.f86328a = bVar;
        }

        public final void run() {
            boolean z;
            Chat chat = this.f86328a.f90956f;
            ChatChatter chatChatter = this.f86328a.f90957g;
            ChatTypeStateKeeper.Companion aVar = ChatTypeStateKeeper.f135671f;
            ChatTypeStateKeeper.EnterChatParams.Builder b = new ChatTypeStateKeeper.EnterChatParams.Builder().mo187428a(chat.getId()).mo187431b(this.f86328a.f90952b);
            Intrinsics.checkExpressionValueIsNotNull(chat, "chat");
            ChatTypeStateKeeper.EnterChatParams.Builder a = b.mo187429a(chat.isRemind());
            boolean z2 = true;
            if (chat.getMessagePosition() == Chat.MessagePosition.RECENT_LEFT) {
                z = true;
            } else {
                z = false;
            }
            ChatTypeStateKeeper.EnterChatParams.Builder g = a.mo187441f(z).mo187437d(chat.isGroup()).mo187443g(chat.isSecret());
            if (chatChatter == null || !chatChatter.isBot()) {
                z2 = false;
            }
            aVar.mo187406a(g.mo187439e(z2).mo187432b(chat.isMeeting()).mo187451n());
            ChatTypeStateKeeper.f135671f.mo187412c("main");
        }
    }

    /* renamed from: h */
    private final void m129766h() {
        ChatWindowViewModelFactory cVar = new ChatWindowViewModelFactory(this.f86318h);
        Object o = mo141195o();
        if (o != null) {
            this.f86311a = (ChatWindowViewModel) new C1144ai((Fragment) o, cVar).mo6006a(WidgetViewModelKeyManager.f86344a.mo123198a(ChatWindowViewModel.class), ChatWindowViewModel.class);
            String str = this.f86318h.f74027a;
            if (str != null) {
                Intrinsics.checkExpressionValueIsNotNull(str, "it");
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36450aa N = b.mo134515N();
                Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                String a = N.mo134394a();
                Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…().loginDependency.userId");
                ChatParamUtils.m133144a(str, a, (Chat) null, 4, (Object) null);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$i */
    public static final class RunnableC33500i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatWindowAppV2 f86329a;

        /* renamed from: b */
        final /* synthetic */ ErrorResult f86330b;

        RunnableC33500i(ChatWindowAppV2 chatWindowAppV2, ErrorResult errorResult) {
            this.f86329a = chatWindowAppV2;
            this.f86330b = errorResult;
        }

        public final void run() {
            Chat chat;
            ChatChatter chatChatter;
            boolean z;
            C1177w<Chat> chat2;
            Chat b;
            C1177w<C35219b> initData;
            C35219b b2;
            C1177w<Chat> chat3;
            if (!ChatErrorInterceptor.m129809a(this.f86330b.getErrorCode())) {
                this.f86329a.mo123138i();
                return;
            }
            C35212a.m137528a(this.f86329a.mo123135f(), this.f86330b, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2.RunnableC33500i.DialogInterface$OnClickListenerC335011 */

                /* renamed from: a */
                final /* synthetic */ RunnableC33500i f86331a;

                {
                    this.f86331a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f86331a.f86329a.mo123138i();
                }
            });
            ChatWindowViewModel bVar = this.f86329a.f86311a;
            String str = null;
            if (bVar == null || (chat3 = bVar.getChat()) == null) {
                chat = null;
            } else {
                chat = chat3.mo5927b();
            }
            ChatWindowViewModel bVar2 = this.f86329a.f86311a;
            if (bVar2 == null || (initData = bVar2.getInitData()) == null || (b2 = initData.mo5927b()) == null) {
                chatChatter = null;
            } else {
                chatChatter = b2.f90957g;
            }
            ChatBundle.ChatType a = C34339g.m133165a(chat, chatChatter);
            ChatWindowViewModel bVar3 = this.f86329a.f86311a;
            if (bVar3 == null || (chat2 = bVar3.getChat()) == null || (b = chat2.mo5927b()) == null) {
                z = false;
            } else {
                z = b.isCrossTenant();
            }
            C35212a.m137538a(a, z, this.f86330b);
            if (ChatErrorInterceptor.m129810b(this.f86330b.getErrorCode())) {
                ChatWindowAppV2 chatWindowAppV2 = this.f86329a;
                ChatWindowViewModel bVar4 = chatWindowAppV2.f86311a;
                if (bVar4 != null) {
                    str = bVar4.getChatId();
                }
                chatWindowAppV2.mo123172a(str);
            }
        }
    }

    /* renamed from: n */
    private final void m129768n() {
        this.f86313c = m129765a(new C33491a(this));
        Context f = mo123135f();
        ChatWindowViewModel bVar = this.f86311a;
        if (bVar != null) {
            this.f86314d = new TabComponent(f, bVar, new C33492b(this), new C33493c(this));
            try {
                PerfLog.start("chat_app_load_component", "");
                WidgetManager a = WidgetManager.f99047e.mo141220a(this);
                TitlebarComponent titlebarComponent = this.f86313c;
                if (titlebarComponent != null) {
                    WidgetManager a2 = a.mo141213a(R.id.chat_titlebar_container, (Widget) titlebarComponent, false);
                    TabComponent tabComponent = this.f86314d;
                    if (tabComponent != null) {
                        a2.mo141213a(R.id.chat_tab_container, (Widget) tabComponent, false);
                        PerfLog.end("chat_app_load_component", "");
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            } catch (IllegalArgumentException e) {
                Log.m165387e("current fragment:" + this.f86319i.mo123001b() + ", current fragment active:" + this.f86319i.mo123001b().isActive() + ", widget is destroy:" + C26254af.m95008b(this, "isDestroyed"), (Throwable) e, true);
                mo123138i();
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowAppV2$initComponentDependency$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "onPageTitleChangeState", "", "hide", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$e */
    public static final class C33496e implements IChatTabPageSpec.OnTitleStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ ChatWindowAppV2 f86325a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33496e(ChatWindowAppV2 chatWindowAppV2) {
            this.f86325a = chatWindowAppV2;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec.OnTitleStateChangeListener
        /* renamed from: a */
        public void mo123179a(boolean z) {
            if (z) {
                TitlebarComponent titlebarComponent = this.f86325a.f86313c;
                if (titlebarComponent != null) {
                    titlebarComponent.mo123647g();
                }
                Iterator<T> it = this.f86325a.f86315e.iterator();
                while (it.hasNext()) {
                    it.next().mo123179a(true);
                }
                return;
            }
            TitlebarComponent titlebarComponent2 = this.f86325a.f86313c;
            if (titlebarComponent2 != null) {
                titlebarComponent2.mo123646f();
            }
            Iterator<T> it2 = this.f86325a.f86315e.iterator();
            while (it2.hasNext()) {
                it2.next().mo123179a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo123170a(ErrorResult errorResult) {
        UICallbackExecutor.execute(new RunnableC33500i(this, errorResult));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowAppV2$initPlugin$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$g */
    public static final class C33498g<T> implements AbstractC1178x<ErrorResult> {

        /* renamed from: a */
        final /* synthetic */ ChatWindowAppV2 f86327a;

        C33498g(ChatWindowAppV2 chatWindowAppV2) {
            this.f86327a = chatWindowAppV2;
        }

        /* renamed from: a */
        public final void onChanged(ErrorResult errorResult) {
            Log.m165386e("ChatWindowLog", errorResult);
            ChatWindowAppV2 chatWindowAppV2 = this.f86327a;
            Intrinsics.checkExpressionValueIsNotNull(errorResult, "it");
            chatWindowAppV2.mo123170a(errorResult);
        }
    }

    /* renamed from: a */
    private final TitlebarComponent m129765a(TitlebarComponent.ITitleBarComponentDependency cVar) {
        C33495d dVar = new C33495d(this);
        ChatWindowViewModel bVar = this.f86311a;
        if (bVar != null) {
            return new TitlebarComponent(dVar, bVar, cVar);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowAppV2$initPlugin$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.ChatWindowAppV2$f */
    public static final class C33497f<T> implements AbstractC1178x<C35219b> {

        /* renamed from: a */
        final /* synthetic */ ChatWindowAppV2 f86326a;

        C33497f(ChatWindowAppV2 chatWindowAppV2) {
            this.f86326a = chatWindowAppV2;
        }

        /* renamed from: a */
        public final void onChanged(C35219b bVar) {
            Intrinsics.checkExpressionValueIsNotNull(bVar, "it");
            if (bVar.mo129685a()) {
                ChatWindowAppV2 chatWindowAppV2 = this.f86326a;
                ChatPluginManager bVar2 = new ChatPluginManager();
                ChatWindowAppV2 chatWindowAppV22 = this.f86326a;
                ChatWindowAppV2 chatWindowAppV23 = chatWindowAppV22;
                Object o = chatWindowAppV22.mo141195o();
                if (o != null) {
                    FragmentActivity requireActivity = ((Fragment) o).requireActivity();
                    Intrinsics.checkExpressionValueIsNotNull(requireActivity, "(getHost() as Fragment).requireActivity()");
                    bVar2.mo122134a(chatWindowAppV23, bVar, requireActivity);
                    chatWindowAppV2.f86312b = bVar2;
                    this.f86326a.mo123171a(bVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
            }
            Log.m165383e("ChatWindowLog", "ChatWindowInitData is invalid");
            this.f86326a.mo123170a(new ErrorResult(1, "ChatWindowInitData is invalid"));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: a */
    public int mo123120a(Intent intent) {
        Bundle extras;
        String str;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return 1;
        }
        ChatBundle a = ChatBundle.m109260a(extras);
        long j = a.f74049w;
        String str2 = a.f74027a;
        ChatWindowViewModel bVar = this.f86311a;
        Long l = null;
        if (bVar != null) {
            str = bVar.getChatId();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str2, str)) {
            return 2;
        }
        if (j == 100001) {
            Log.m165389i("ChatWindowLog", "switch tab to chatTab and reload");
            return 2;
        }
        TabComponent tabComponent = this.f86314d;
        if (tabComponent != null && j == tabComponent.mo123565m()) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("switch tab to ");
        sb.append(j);
        sb.append(" current tab is ");
        TabComponent tabComponent2 = this.f86314d;
        if (tabComponent2 != null) {
            l = Long.valueOf(tabComponent2.mo123565m());
        }
        sb.append(l);
        Log.m165389i("ChatWindowLog", sb.toString());
        return 3;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public <T extends IComponent<? extends IComponentCallbacks>> T mo123122a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        if (Intrinsics.areEqual(cls, ITitlebarComponent.class)) {
            TitlebarComponent titlebarComponent = this.f86313c;
            if (titlebarComponent != null) {
                return titlebarComponent;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, ITabComponent.class)) {
            TabComponent tabComponent = this.f86314d;
            if (tabComponent != null) {
                return tabComponent;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else {
            IComponent fVar = null;
            if (Intrinsics.areEqual(cls, IMessageListComponent.class)) {
                TabComponent tabComponent2 = this.f86314d;
                if (tabComponent2 != null) {
                    fVar = (IMessageListComponent) tabComponent2.mo123550a(IMessageListComponent.class);
                }
                if (fVar != null) {
                    return (T) fVar;
                }
                throw new IllegalStateException("component not found");
            } else if (Intrinsics.areEqual(cls, IKeyboardComponent.class)) {
                TabComponent tabComponent3 = this.f86314d;
                if (tabComponent3 != null) {
                    fVar = (IKeyboardComponent) tabComponent3.mo123550a(IKeyboardComponent.class);
                }
                if (fVar != null) {
                    return (T) fVar;
                }
                throw new IllegalStateException("component not found");
            } else if (Intrinsics.areEqual(cls, IKeyboardTopExtendComponent.class)) {
                TabComponent tabComponent4 = this.f86314d;
                if (tabComponent4 != null) {
                    fVar = (IKeyboardTopExtendComponent) tabComponent4.mo123550a(IKeyboardTopExtendComponent.class);
                }
                if (fVar != null) {
                    return (T) fVar;
                }
                throw new IllegalStateException("component not found");
            } else {
                throw new IllegalAccessException("component not found");
            }
        }
    }

    /* renamed from: b */
    public <T extends IDependencyViewModel> T mo123173b(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        if (Intrinsics.areEqual(cls, IKeyboardDependenceViewModel.class)) {
            ChatWindowViewModel bVar = this.f86311a;
            if (bVar != null) {
                return bVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, IMessageDependenceViewModel.class)) {
            ChatWindowViewModel bVar2 = this.f86311a;
            if (bVar2 != null) {
                return bVar2;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, ITitleDependenceViewModel.class)) {
            ChatWindowViewModel bVar3 = this.f86311a;
            if (bVar3 != null) {
                return bVar3;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, ITabDependeceViewModel.class)) {
            ChatWindowViewModel bVar4 = this.f86311a;
            if (bVar4 != null) {
                return bVar4;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, ISpaceListDependencyViewModel.class)) {
            ChatWindowViewModel bVar5 = this.f86311a;
            if (bVar5 != null) {
                return bVar5;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, ISpaceDependencyViewModel.class)) {
            ChatWindowViewModel bVar6 = this.f86311a;
            if (bVar6 != null) {
                return bVar6;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, IKeyboardExtendDependenceViewModel.class)) {
            ChatWindowViewModel bVar7 = this.f86311a;
            if (bVar7 != null) {
                return bVar7;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else {
            throw new IllegalStateException("view model not found");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    /* renamed from: a */
    public void mo123124a(ChatBundle chatBundle) {
        Intrinsics.checkParameterIsNotNull(chatBundle, "bundle");
        ChatPluginManager bVar = this.f86312b;
        if (bVar != null) {
            bVar.mo122133a(chatBundle);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123125a(IChatWindowApp.IActivityResultHandler aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handle");
        TabComponent tabComponent = this.f86314d;
        if (tabComponent != null) {
            tabComponent.mo123552a(aVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: a */
    public void mo123126a(IChatWindowApp.IBackPressHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "handle");
        this.f86316f.add(bVar);
    }

    public ChatWindowAppV2(ChatBundle chatBundle, ChatWindowApp.IViewDependence bVar) {
        Intrinsics.checkParameterIsNotNull(chatBundle, "chatBundle");
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f86318h = chatBundle;
        this.f86319i = bVar;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget, com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowAppExtend
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        TabComponent tabComponent = this.f86314d;
        if (tabComponent != null) {
            tabComponent.onActivityResult(i, i2, intent);
        }
    }
}
