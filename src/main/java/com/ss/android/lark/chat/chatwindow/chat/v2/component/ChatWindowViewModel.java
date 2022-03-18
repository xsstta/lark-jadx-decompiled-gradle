package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.ChatKeyboardFgUtil;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.C33201b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33212b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33215e;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardExtendDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.ISideMenuDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabDependeceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.ISpaceDependencyViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.spacelist.ISpaceListDependencyViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitleDependenceViewModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.statistics.PerfLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0001'B\r\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0012¨\u0006("}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatHostViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageDependenceViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitleDependenceViewModel;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardDependenceViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/sidebar/ISideMenuDependenceViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ITabDependeceViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/spacelist/ISpaceListDependencyViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/ISpaceDependencyViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendDependenceViewModel;", "chatBundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "(Lcom/ss/android/lark/biz/im/api/ChatBundle;)V", "chat", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChat", "()Landroidx/lifecycle/MutableLiveData;", "getChatBundle", "()Lcom/ss/android/lark/biz/im/api/ChatBundle;", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "getInitData", "initErrorInfo", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "getInitErrorInfo", "pluginInitData", "getPluginInitData", "loadChatInitData", "", "callback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowViewModel$ISecretComponentReplaceCallback;", "ISecretComponentReplaceCallback", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.b */
public final class ChatWindowViewModel extends AbstractC1142af implements IKeyboardDependenceViewModel, IKeyboardExtendDependenceViewModel, IMessageDependenceViewModel, ISideMenuDependenceViewModel, ISpaceDependencyViewModel, ISpaceListDependencyViewModel, ITabDependeceViewModel, ITitleDependenceViewModel {
    private final C1177w<Chat> chat = new C1177w<>();
    private final ChatBundle chatBundle;
    private String chatId;
    private final C1177w<C35219b> initData = new C1177w<>();
    private final C1177w<ErrorResult> initErrorInfo = new C1177w<>();
    private final C1177w<C35219b> pluginInitData = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowViewModel$ISecretComponentReplaceCallback;", "", "onComponentReplace", "", "needReplace", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.b$a */
    public interface ISecretComponentReplaceCallback {
        /* renamed from: a */
        void mo123162a(boolean z);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardDependenceViewModel, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabDependeceViewModel, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.ISpaceDependencyViewModel, com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitleDependenceViewModel
    public C1177w<Chat> getChat() {
        return this.chat;
    }

    public final ChatBundle getChatBundle() {
        return this.chatBundle;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.spacelist.ISpaceListDependencyViewModel
    public String getChatId() {
        return this.chatId;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardDependenceViewModel, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabDependeceViewModel, com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageDependenceViewModel, com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.ISideMenuDependenceViewModel, com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitleDependenceViewModel, com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardExtendDependenceViewModel
    public C1177w<C35219b> getInitData() {
        return this.initData;
    }

    public final C1177w<ErrorResult> getInitErrorInfo() {
        return this.initErrorInfo;
    }

    public final C1177w<C35219b> getPluginInitData() {
        return this.pluginInitData;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/ChatWindowViewModel$loadChatInitData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/chatwindow/chat/perload/model/PreLoadResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.b$b */
    public static final class C33502b implements IGetDataCallback<C33215e<?>> {

        /* renamed from: a */
        final /* synthetic */ ChatWindowViewModel f86337a;

        /* renamed from: b */
        final /* synthetic */ ISecretComponentReplaceCallback f86338b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.b$b$a */
        public static final class RunnableC33503a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33502b f86339a;

            /* renamed from: b */
            final /* synthetic */ C33215e f86340b;

            RunnableC33503a(C33502b bVar, C33215e eVar) {
                this.f86339a = bVar;
                this.f86340b = eVar;
            }

            public final void run() {
                Object obj;
                ISecretComponentReplaceCallback aVar;
                boolean z;
                C33215e eVar = this.f86340b;
                Chat chat = null;
                if (eVar != null) {
                    obj = eVar.mo122443a();
                } else {
                    obj = null;
                }
                C35219b bVar = (C35219b) obj;
                if (bVar != null) {
                    chat = bVar.f90956f;
                }
                if (ChatKeyboardFgUtil.f85002a.mo122016a() && (aVar = this.f86339a.f86338b) != null) {
                    if (chat != null) {
                        z = chat.isSecret();
                    } else {
                        z = false;
                    }
                    aVar.mo123162a(z);
                }
                PerfLog.end("chat_fetch_init_data", "");
                this.f86339a.f86337a.getPluginInitData().mo5926a(bVar);
                this.f86339a.f86337a.getChat().mo5926a(chat);
                if (bVar == null || !bVar.mo129685a()) {
                    Log.m165383e("ChatWindowLog", "ChatWindowInitData is invalid");
                } else {
                    this.f86339a.f86337a.getInitData().mo5926a(bVar);
                }
            }
        }

        /* renamed from: a */
        public void onSuccess(C33215e<?> eVar) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC33503a(this, eVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            PerfLog.end("chat_fetch_init_data", "");
            this.f86337a.getInitErrorInfo().mo5926a(errorResult);
        }

        C33502b(ChatWindowViewModel bVar, ISecretComponentReplaceCallback aVar) {
            this.f86337a = bVar;
            this.f86338b = aVar;
        }
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public ChatWindowViewModel(ChatBundle chatBundle2) {
        Intrinsics.checkParameterIsNotNull(chatBundle2, "chatBundle");
        this.chatBundle = chatBundle2;
    }

    public final void loadChatInitData(ISecretComponentReplaceCallback aVar) {
        C33212b bVar = new C33212b(this.chatBundle);
        setChatId(bVar.mo122433b());
        PerfLog.start("chat_fetch_init_data", "");
        C33201b.m128282a().mo122418a(bVar, new C33502b(this, aVar));
    }
}
