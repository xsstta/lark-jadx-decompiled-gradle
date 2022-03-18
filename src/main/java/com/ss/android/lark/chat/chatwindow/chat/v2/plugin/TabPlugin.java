package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator2;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.ChatTabFgUtil;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.InputPluginController;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.tab.service.ChatTabProcessor;
import com.ss.android.lark.tab.service.entity.ChatTab;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0003\u0004\u0014\u0019\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\fH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020\u001e2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0002J\b\u0010)\u001a\u00020\u001eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "keyboardInputStateChangeListener", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$keyboardInputStateChangeListener$2$1", "getKeyboardInputStateChangeListener", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$keyboardInputStateChangeListener$2$1;", "keyboardInputStateChangeListener$delegate", "Lkotlin/Lazy;", "mChatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "mInitData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "mTabRefresh", "", "mTargetId", "", "mUDTabLayoutCoordinator2", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2;", "observer", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$observer$2$1", "getObserver", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$observer$2$1;", "observer$delegate", "viewsObserver", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$viewsObserver$2$1", "getViewsObserver", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$viewsObserver$2$1;", "viewsObserver$delegate", "onCreate", "", "chatApp", "initData", "onDestroy", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "reportChatBasicTabHitPoint", "tabs", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "showTabAfterRefresh", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.r */
public final class TabPlugin extends BaseChatPlugin {

    /* renamed from: a */
    public IChatWindowApp f87185a;

    /* renamed from: b */
    public C35219b f87186b;

    /* renamed from: c */
    public UDTabLayoutCoordinator2 f87187c;

    /* renamed from: d */
    public boolean f87188d;

    /* renamed from: e */
    private long f87189e = 100001;

    /* renamed from: f */
    private final Lazy f87190f = LazyKt.lazy(new C33841b(this));

    /* renamed from: g */
    private final Lazy f87191g = LazyKt.lazy(new C33844c(this));

    /* renamed from: h */
    private final Lazy f87192h = LazyKt.lazy(new C33839a(this));

    /* renamed from: b */
    public final C33841b.C338421 mo123863b() {
        return (C33841b.C338421) this.f87190f.getValue();
    }

    /* renamed from: d */
    public final C33844c.C338451 mo123865d() {
        return (C33844c.C338451) this.f87191g.getValue();
    }

    /* renamed from: e */
    public final C33839a.C338401 mo123866e() {
        return (C33839a.C338401) this.f87192h.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$keyboardInputStateChangeListener$2$1", "invoke", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$keyboardInputStateChangeListener$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.r$a */
    static final class C33839a extends Lambda implements Function0<C338401> {
        final /* synthetic */ TabPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33839a(TabPlugin rVar) {
            super(0);
            this.this$0 = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C338401 invoke() {
            return new InputPluginController.InputSupportPluginChangeListener(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.TabPlugin.C33839a.C338401 */

                /* renamed from: a */
                final /* synthetic */ C33839a f87193a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f87193a = r1;
                }

                @Override // com.ss.android.lark.keyboard.plugin.input.InputPluginController.InputSupportPluginChangeListener
                /* renamed from: a */
                public void mo123867a(IOutInputSupport.InputSupportType inputSupportType) {
                    Intrinsics.checkParameterIsNotNull(inputSupportType, ShareHitPoint.f121869d);
                    ITitlebarComponent bVar = (ITitlebarComponent) TabPlugin.m131074b(this.f87193a.this$0).mo123122a(ITitlebarComponent.class);
                    ITabComponent gVar = (ITabComponent) TabPlugin.m131074b(this.f87193a.this$0).mo123122a(ITabComponent.class);
                    int i = C33846s.f87198a[inputSupportType.ordinal()];
                    if (i == 1) {
                        bVar.mo123683k();
                        gVar.mo123547a(false);
                    } else if (i == 2) {
                        bVar.mo123682j();
                        gVar.mo123547a(true);
                    }
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$observer$2$1", "invoke", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$observer$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.r$b */
    static final class C33841b extends Lambda implements Function0<C338421> {
        final /* synthetic */ TabPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33841b(TabPlugin rVar) {
            super(0);
            this.this$0 = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C338421 invoke() {
            return new ChatTabProcessor.ChatTabDataChangeObserver(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.TabPlugin.C33841b.C338421 */

                /* renamed from: a */
                final /* synthetic */ C33841b f87194a;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.r$b$1$a */
                static final class RunnableC33843a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C338421 f87195a;

                    /* renamed from: b */
                    final /* synthetic */ List f87196b;

                    RunnableC33843a(C338421 r1, List list) {
                        this.f87195a = r1;
                        this.f87196b = list;
                    }

                    public final void run() {
                        ((ITabComponent) TabPlugin.m131074b(this.f87195a.f87194a.this$0).mo123122a(ITabComponent.class)).mo123546a(this.f87196b);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f87194a = r1;
                }

                @Override // com.ss.android.lark.tab.service.ChatTabProcessor.ChatTabDataChangeObserver
                /* renamed from: a */
                public void mo123868a(String str, List<ChatTab> list, long j) {
                    Intrinsics.checkParameterIsNotNull(str, "chatId");
                    Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                    Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                    coreThreadPool.getUIExecutor().execute(new RunnableC33843a(this, list));
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$viewsObserver$2$1", "invoke", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TabPlugin$viewsObserver$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.r$c */
    static final class C33844c extends Lambda implements Function0<C338451> {
        final /* synthetic */ TabPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33844c(TabPlugin rVar) {
            super(0);
            this.this$0 = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C338451 invoke() {
            return new ITabComponent.OnTabViewChangeObserver(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.TabPlugin.C33844c.C338451 */

                /* renamed from: a */
                final /* synthetic */ C33844c f87197a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f87197a = r1;
                }

                @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabComponent.OnTabViewChangeObserver
                /* renamed from: a */
                public void mo123627a(List<ChatTab> list) {
                    Chat chat = TabPlugin.m131073a(this.f87197a.this$0).f90956f;
                    Intrinsics.checkExpressionValueIsNotNull(chat, "mInitData.chat");
                    ((ITitlebarComponent) TabPlugin.m131074b(this.f87197a.this$0).mo123122a(ITitlebarComponent.class)).mo123676a(chat, ChatTab.Companion.mo188424a(list));
                    if (this.f87197a.this$0.f87188d) {
                        this.f87197a.this$0.mo123864c();
                        this.f87197a.this$0.f87188d = false;
                    }
                }
            };
        }
    }

    /* renamed from: c */
    public final void mo123864c() {
        IChatWindowApp dVar = this.f87185a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
        }
        ((ITabComponent) dVar.mo123122a(ITabComponent.class)).mo123542a(this.f87189e);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        ChatTabFgUtil aVar = ChatTabFgUtil.f86815a;
        C35219b bVar = this.f87186b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInitData");
        }
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "mInitData.chat");
        if (aVar.mo123637a(chat)) {
            ChatTabProcessor.Companion bVar2 = ChatTabProcessor.f136407e;
            C35219b bVar3 = this.f87186b;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInitData");
            }
            String str = bVar3.f90955e;
            Intrinsics.checkExpressionValueIsNotNull(str, "mInitData.chatId");
            bVar2.mo188387a(str).mo188385b(mo123863b());
            super.as_();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C35219b m131073a(TabPlugin rVar) {
        C35219b bVar = rVar.f87186b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInitData");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IChatWindowApp m131074b(TabPlugin rVar) {
        IChatWindowApp dVar = rVar.f87185a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
        }
        return dVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122127a(ChatBundle chatBundle) {
        Intrinsics.checkParameterIsNotNull(chatBundle, "bundle");
        ChatTabFgUtil aVar = ChatTabFgUtil.f86815a;
        C35219b bVar = this.f87186b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInitData");
        }
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "mInitData.chat");
        if (aVar.mo123637a(chat)) {
            this.f87189e = chatBundle.f74049w;
            boolean z = chatBundle.f74050x;
            this.f87188d = z;
            if (!z) {
                IChatWindowApp dVar = this.f87185a;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
                }
                ((ITabComponent) dVar.mo123122a(ITabComponent.class)).mo123542a(this.f87189e);
            }
        }
    }

    /* renamed from: a */
    public final void mo123862a(List<ChatTab> list) {
        String str;
        ChatHitPointNew.Companion aVar = ChatHitPointNew.f135660c;
        C35219b bVar = this.f87186b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInitData");
        }
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "mInitData.chat");
        C35219b bVar2 = this.f87186b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInitData");
        }
        OpenApp openApp = bVar2.f90960j;
        if (openApp != null) {
            str = openApp.getBotId();
        } else {
            str = null;
        }
        C35219b bVar3 = this.f87186b;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInitData");
        }
        aVar.mo187383a(chat, str, bVar3.f90957g, list);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f87185a = dVar;
        this.f87186b = bVar;
        ITabComponent gVar = (ITabComponent) dVar.mo123122a(ITabComponent.class);
        ITitlebarComponent bVar2 = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
        bVar2.getLifecycle().addObserver(new TabPlugin$onCreate$1(this, (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class)));
        ChatTabFgUtil aVar = ChatTabFgUtil.f86815a;
        C35219b bVar3 = this.f87186b;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInitData");
        }
        Chat chat = bVar3.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "mInitData.chat");
        if (aVar.mo123637a(chat)) {
            gVar.mo123547a(true);
            gVar.getLifecycle().addObserver(new TabPlugin$onCreate$2(this, bVar));
            bVar2.getLifecycle().addObserver(new TabPlugin$onCreate$3(this, bVar2, gVar));
        }
    }
}
