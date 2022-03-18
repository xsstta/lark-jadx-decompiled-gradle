package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.ChatKeyboardFgUtil;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.p1662b.AbstractC33975a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.more.vote.IVoteDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.vote.VotePlusItem;
import com.ss.android.lark.statistics.chat.ChatStatisticUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/GadgetPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "callback", "Lcom/ss/android/lark/chat/entity/keyboard/IGetKBPluginCallBack;", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "fetchGadgetKeyboardPlusItems", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onCreate", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "toPlugin", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "VotePlusItemPlugin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.e */
public final class GadgetPlugin extends BaseChatPlugin {

    /* renamed from: a */
    public IKeyboardComponent f86933a;

    /* renamed from: b */
    public AbstractC33975a f86934b = new C33741b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/GadgetPlugin$VotePlusItemPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/GadgetPlugin;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "item", "getItem", "()Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "setItem", "(Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;)V", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.e$a */
    public final class VotePlusItemPlugin implements IKeyboardCreator.IPlugin<IPlusItem> {

        /* renamed from: a */
        final /* synthetic */ GadgetPlugin f86935a;

        /* renamed from: b */
        private final Chat f86936b;

        /* renamed from: c */
        private final Context f86937c;

        /* renamed from: d */
        private IPlusItem f86938d;

        /* renamed from: e */
        private final IKeyboardCreator.PluginContext f86939e;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: a */
        public String mo122012a() {
            return "plus_vote";
        }

        /* renamed from: b */
        public final Chat mo123758b() {
            return this.f86936b;
        }

        /* renamed from: e */
        public final Context mo123759e() {
            return this.f86937c;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/GadgetPlugin$VotePlusItemPlugin$getPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/more/vote/IVoteDependency;", "getContext", "Landroid/content/Context;", "startVote", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.e$a$a */
        public static final class C33740a implements IVoteDependency {

            /* renamed from: a */
            final /* synthetic */ VotePlusItemPlugin f86940a;

            /* renamed from: a */
            public Context mo123761a() {
                return this.f86940a.mo123759e();
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.more.vote.IVoteDependency
            /* renamed from: b */
            public void mo122121b() {
                ChatStatisticUtil.m213143d(this.f86940a.mo123758b());
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134588p().mo134748a(mo123761a(), this.f86940a.mo123758b().getId());
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33740a(VotePlusItemPlugin aVar) {
                this.f86940a = aVar;
            }
        }

        /* renamed from: f */
        public IPlusItem mo122014c() {
            if (this.f86938d == null) {
                this.f86938d = new VotePlusItem(new C33740a(this));
            }
            return this.f86938d;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: d */
        public boolean mo122015d() {
            if (this.f86936b.isCrossWithKa() || this.f86936b.isP2PChat() || this.f86936b.isCustomerService() || this.f86936b.isSuper()) {
                return false;
            }
            return true;
        }

        public VotePlusItemPlugin(GadgetPlugin eVar, IKeyboardCreator.PluginContext cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
            this.f86935a = eVar;
            this.f86939e = cVar;
            this.f86936b = cVar.mo122078c();
            Context requireContext = cVar.mo122076a().requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
            this.f86937c = requireContext;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/GadgetPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.e$d */
    public static final class C33745d implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ GadgetPlugin f86948a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f86949b;

        /* renamed from: c */
        final /* synthetic */ C35219b f86950c;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127734a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127736b(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127735a(this, fVar);
            Object o = this.f86949b.mo123193o();
            if (o != null) {
                Chat chat = this.f86950c.f90956f;
                Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
                VotePlusItemPlugin aVar = new VotePlusItemPlugin(this.f86948a, new IKeyboardCreator.PluginContext((Fragment) o, fVar, chat, this.f86950c.f90957g, null));
                GadgetPlugin.m130854a(this.f86948a).mo121977a(aVar.mo122012a(), aVar);
                GadgetPlugin eVar = this.f86948a;
                Chat chat2 = this.f86950c.f90956f;
                Intrinsics.checkExpressionValueIsNotNull(chat2, "initData.chat");
                eVar.mo123757a(chat2, this.f86948a.f86934b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        C33745d(GadgetPlugin eVar, IChatWindowApp dVar, C35219b bVar) {
            this.f86948a = eVar;
            this.f86949b = dVar;
            this.f86950c = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/GadgetPlugin$toPlugin$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "getName", "", "getPlugin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.e$e */
    public static final class C33746e implements IKeyboardCreator.IPlugin<IPlusItem> {

        /* renamed from: a */
        final /* synthetic */ IPlusItem f86951a;

        /* renamed from: b */
        public IPlusItem mo122014c() {
            return this.f86951a;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: a */
        public String mo122012a() {
            return this.f86951a.mo31055c();
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: d */
        public boolean mo122015d() {
            return IKeyboardCreator.IPlugin.C33037a.m127748a(this);
        }

        C33746e(IPlusItem bVar) {
            this.f86951a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J(\u0010\n\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/GadgetPlugin$fetchGadgetKeyboardPlusItems$1", "Lcom/ss/android/lark/chat/entity/keyboard/IGetKBPluginCallBack;", "onFailed", "", "e", "", "onSuccess", "plusItems", "", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "replace", "oldPlusItems", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.e$c */
    public static final class C33742c implements AbstractC33975a {

        /* renamed from: a */
        final /* synthetic */ AbstractC33975a f86942a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.e$c$a */
        static final class RunnableC33743a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33742c f86943a;

            /* renamed from: b */
            final /* synthetic */ List f86944b;

            RunnableC33743a(C33742c cVar, List list) {
                this.f86943a = cVar;
                this.f86944b = list;
            }

            public final void run() {
                AbstractC33975a aVar = this.f86943a.f86942a;
                if (aVar != null) {
                    aVar.mo123762a(this.f86944b);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.e$c$b */
        static final class RunnableC33744b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33742c f86945a;

            /* renamed from: b */
            final /* synthetic */ List f86946b;

            /* renamed from: c */
            final /* synthetic */ List f86947c;

            RunnableC33744b(C33742c cVar, List list, List list2) {
                this.f86945a = cVar;
                this.f86946b = list;
                this.f86947c = list2;
            }

            public final void run() {
                AbstractC33975a aVar = this.f86945a.f86942a;
                if (aVar != null) {
                    aVar.mo123763a(this.f86946b, this.f86947c);
                }
            }
        }

        C33742c(AbstractC33975a aVar) {
            this.f86942a = aVar;
        }

        @Override // com.ss.android.lark.chat.entity.p1662b.AbstractC33975a
        /* renamed from: a */
        public void mo123762a(List<IPlusItem> list) {
            UICallbackExecutor.execute(new RunnableC33743a(this, list));
        }

        @Override // com.ss.android.lark.chat.entity.p1662b.AbstractC33975a
        /* renamed from: a */
        public void mo123763a(List<IPlusItem> list, List<IPlusItem> list2) {
            UICallbackExecutor.execute(new RunnableC33744b(this, list, list2));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        this.f86934b = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J$\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/GadgetPlugin$callback$1", "Lcom/ss/android/lark/chat/entity/keyboard/IGetKBPluginCallBack;", "onFailed", "", "e", "", "onSuccess", "plusItems", "", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "replace", "oldPlusItems", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.e$b */
    public static final class C33741b implements AbstractC33975a {

        /* renamed from: a */
        final /* synthetic */ GadgetPlugin f86941a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33741b(GadgetPlugin eVar) {
            this.f86941a = eVar;
        }

        @Override // com.ss.android.lark.chat.entity.p1662b.AbstractC33975a
        /* renamed from: a */
        public void mo123762a(List<IPlusItem> list) {
            Intrinsics.checkParameterIsNotNull(list, "plusItems");
            IKeyboardComponent a = GadgetPlugin.m130854a(this.f86941a);
            ArrayList arrayList = new ArrayList();
            List<IPlusItem> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.f86941a.mo123756a((IPlusItem) it.next()));
            }
            a.mo121979a(arrayList, arrayList2);
        }

        @Override // com.ss.android.lark.chat.entity.p1662b.AbstractC33975a
        /* renamed from: a */
        public void mo123763a(List<IPlusItem> list, List<IPlusItem> list2) {
            Intrinsics.checkParameterIsNotNull(list, "oldPlusItems");
            Intrinsics.checkParameterIsNotNull(list2, "plusItems");
            IKeyboardComponent a = GadgetPlugin.m130854a(this.f86941a);
            List<IPlusItem> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f86941a.mo123756a((IPlusItem) it.next()));
            }
            ArrayList arrayList2 = arrayList;
            List<IPlusItem> list4 = list2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(this.f86941a.mo123756a((IPlusItem) it2.next()));
            }
            a.mo121979a(arrayList2, arrayList3);
        }
    }

    /* renamed from: a */
    public final IKeyboardCreator.IPlugin<IPlusItem> mo123756a(IPlusItem bVar) {
        return new C33746e(bVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyboardComponent m130854a(GadgetPlugin eVar) {
        IKeyboardComponent cVar = eVar.f86933a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo123757a(Chat chat, AbstractC33975a aVar) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.ai().mo134638a(chat, new C33742c(aVar));
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        if (ChatKeyboardFgUtil.f85002a.mo122016a()) {
            IKeyboardComponent cVar = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
            this.f86933a = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
            }
            cVar.mo121971a(new C33745d(this, dVar, bVar));
        }
    }
}
