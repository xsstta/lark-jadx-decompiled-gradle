package com.ss.android.lark.chat.chatwindow.biz.plugin;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.p1612a.C33084a;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.service.C34298m;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.chatwindow.view.tip.AbstractC35310a;
import com.ss.android.lark.chatwindow.view.tip.C35324c;
import com.ss.android.lark.chatwindow.view.tip.NewMessageTip;
import com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35320b;
import com.ss.android.lark.chatwindow.view.tip.p1729b.C35317a;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.C36443k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u000eH\u0002J\u0018\u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "bannerContainerHeight", "", "keyboardListComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "mBadgeProvider", "Lcom/ss/android/lark/chat/chatwindow/chat/badge/ChatBadgeProvider;", "mCancelableUIExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "mCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mEnableShowTips", "", "mNewMessageBottomTip", "Lcom/ss/android/lark/chatwindow/view/tip/NewMessageTip;", "mNewMessageTipController", "Lcom/ss/android/lark/chatwindow/view/tip/NewMessageTipController;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "mNewMessageTopTip", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "titleBarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "viewStateLifecycle", "Lcom/ss/android/lark/dependency/IChatModuleDependency$IdlePositionController;", "initMessageTips", "", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initTipsView", "rootLayout", "Landroid/widget/RelativeLayout;", "messageCountAtBottomExceedsThreshold", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "needShowBackToBottom", "onCreate", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "pullUnReadAtMessage", "chatId", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b */
public final class MessageTipsPlugin extends BaseChatPlugin {

    /* renamed from: h */
    public static final Companion f85117h = new Companion(null);

    /* renamed from: a */
    public Chat f85118a;

    /* renamed from: b */
    public C35324c<ChatMessageVO<?>> f85119b;

    /* renamed from: c */
    public final C33084a f85120c = new C33084a();

    /* renamed from: d */
    public boolean f85121d;

    /* renamed from: e */
    public C25969c f85122e = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: f */
    public IMessageListComponent f85123f;

    /* renamed from: g */
    public int f85124g;

    /* renamed from: l */
    private NewMessageTip f85125l;

    /* renamed from: m */
    private NewMessageTip f85126m;

    /* renamed from: n */
    private IKeyboardComponent f85127n;

    /* renamed from: o */
    private ITitlebarComponent f85128o;

    /* renamed from: p */
    private AbstractC36474h.AbstractC36491q f85129p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$Companion;", "", "()V", "DISPLAY_MESSAGE_MAX_WEIGHT", "", "SHOW_BACK_TO_BOTTOM_THRESHOLD", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "get", "com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$initMessageTips$1$dataStrategy$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$b */
    public static final class C33053b<T> implements AbstractC35320b<Chat> {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85130a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f85131b;

        /* renamed from: c */
        final /* synthetic */ IMessageListComponent f85132c;

        C33053b(MessageTipsPlugin bVar, IChatWindowApp dVar, IMessageListComponent iMessageListComponent) {
            this.f85130a = bVar;
            this.f85131b = dVar;
            this.f85132c = iMessageListComponent;
        }

        /* renamed from: a */
        public final Chat get() {
            return MessageTipsPlugin.m127836b(this.f85130a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "needShowBackToBottom", "com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$initMessageTips$1$dataStrategy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$c */
    public static final class C33054c implements C35317a.AbstractC35318a {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85133a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f85134b;

        /* renamed from: c */
        final /* synthetic */ IMessageListComponent f85135c;

        C33054c(MessageTipsPlugin bVar, IChatWindowApp dVar, IMessageListComponent iMessageListComponent) {
            this.f85133a = bVar;
            this.f85134b = dVar;
            this.f85135c = iMessageListComponent;
        }

        @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.C35317a.AbstractC35318a
        /* renamed from: a */
        public final boolean mo122140a() {
            return this.f85133a.mo122137b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "getBannerHeight", "com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$initMessageTips$1$dataStrategy$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$d */
    public static final class C33055d implements C35317a.AbstractC35319b {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85136a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f85137b;

        /* renamed from: c */
        final /* synthetic */ IMessageListComponent f85138c;

        C33055d(MessageTipsPlugin bVar, IChatWindowApp dVar, IMessageListComponent iMessageListComponent) {
            this.f85136a = bVar;
            this.f85137b = dVar;
            this.f85138c = iMessageListComponent;
        }

        @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.C35317a.AbstractC35319b
        /* renamed from: a */
        public final int mo122141a() {
            return this.f85136a.f85124g;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$onCreate$2", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onTextInputAreaResume", "", "onTextInputAreaStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$j */
    public static final class C33064j implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85158a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$j$a */
        static final class RunnableC33065a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33064j f85159a;

            RunnableC33065a(C33064j jVar) {
                this.f85159a = jVar;
            }

            public final void run() {
                MessageTipsPlugin.m127837c(this.f85159a.f85158a).mo129991j();
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            MessageTipsPlugin.m127837c(this.f85158a).mo129990i();
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            UICallbackExecutor.executeDelayed(new RunnableC33065a(this), 200);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33064j(MessageTipsPlugin bVar) {
            this.f85158a = bVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127735a(this, fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$initMessageTips$1$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDetectListener;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "onItemDetected", "", "itemList", "", "onReachToBottom", "onScrollPassed", "scrolled", "", "scrolledStartIndex", "", "scrolledEndIndex", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$f */
    public static final class C33059f implements RecyclerViewItemDetector.ItemDetectListener<ChatMessageVO<?>> {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85144a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f85145b;

        /* renamed from: c */
        final /* synthetic */ IMessageListComponent f85146c;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122148a(boolean z, int i, int i2) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122146a() {
            MessageTipsPlugin.m127837c(this.f85144a).mo129986e();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122147a(List<? extends ChatMessageVO<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "itemList");
            if (this.f85144a.f85121d) {
                MessageTipsPlugin.m127837c(this.f85144a).mo129977a(list, this.f85144a.f85120c);
                return;
            }
            Log.m165389i("ChatWindowLog", "enable show message tips");
            MessageTipsPlugin.m127837c(this.f85144a).mo129983c();
            this.f85144a.f85121d = true;
            MessageTipsPlugin.m127837c(this.f85144a).mo129977a(list, this.f85144a.f85120c);
        }

        C33059f(MessageTipsPlugin bVar, IChatWindowApp dVar, IMessageListComponent iMessageListComponent) {
            this.f85144a = bVar;
            this.f85145b = dVar;
            this.f85146c = iMessageListComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "onChatUpdate", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onMessageListReady", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$i */
    public static final class C33063i implements IMessageListComponent.IListComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85156a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f85157b;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122152a() {
            IMessageListComponent.IListComponentCallbacks.C33556a.m130094a(this);
            MessageTipsPlugin bVar = this.f85156a;
            bVar.mo122136a(MessageTipsPlugin.m127832a(bVar), this.f85157b);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122153a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            IMessageListComponent.IListComponentCallbacks.C33556a.m130095a(this, chat);
            this.f85156a.f85118a = chat;
            MessageTipsPlugin.m127837c(this.f85156a).mo129986e();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122154a(ChatChatter chatChatter) {
            Intrinsics.checkParameterIsNotNull(chatChatter, "chatChatter");
            IMessageListComponent.IListComponentCallbacks.C33556a.m130096a(this, chatChatter);
        }

        C33063i(MessageTipsPlugin bVar, IChatWindowApp dVar) {
            this.f85156a = bVar;
            this.f85157b = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$onCreate$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$IBannerVisibilityListener;", "onBannerHide", "", "onBannerShow", "bannerHeight", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$k */
    public static final class C33066k implements ITitlebarComponent.IBannerVisibilityListener {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85160a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent.IBannerVisibilityListener
        /* renamed from: a */
        public void mo122156a() {
            this.f85160a.f85124g = 0;
            MessageTipsPlugin.m127837c(this.f85160a).mo129992k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33066k(MessageTipsPlugin bVar) {
            this.f85160a = bVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent.IBannerVisibilityListener
        /* renamed from: a */
        public void mo122157a(int i) {
            this.f85160a.f85124g = i;
            MessageTipsPlugin.m127837c(this.f85160a).mo129992k();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        this.f85122e.mo92349b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$l */
    public static final class RunnableC33067l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85161a;

        /* renamed from: b */
        final /* synthetic */ String f85162b;

        /* renamed from: c */
        final /* synthetic */ UIGetDataCallback f85163c;

        RunnableC33067l(MessageTipsPlugin bVar, String str, UIGetDataCallback uIGetDataCallback) {
            this.f85161a = bVar;
            this.f85162b = str;
            this.f85163c = uIGetDataCallback;
        }

        public final void run() {
            C32848e.m126401b().mo121091a(this.f85162b, (IGetDataCallback) this.f85161a.mo122129j().wrapAndAddCallback(this.f85163c));
        }
    }

    /* renamed from: b */
    public final boolean mo122137b() {
        long currentTimeMillis = System.currentTimeMillis();
        IKeyboardComponent cVar = this.f85127n;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardListComponent");
        }
        if (cVar.an_()) {
            return false;
        }
        IMessageListComponent iMessageListComponent = this.f85123f;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        if (iMessageListComponent.mo123324g()) {
            return true;
        }
        IMessageListComponent iMessageListComponent2 = this.f85123f;
        if (iMessageListComponent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        RecyclerView c = iMessageListComponent2.mo123322c();
        if (c != null) {
            if (m127835a(c)) {
                return true;
            }
            RecyclerView.LayoutManager layoutManager = c.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                float f = BitmapDescriptorFactory.HUE_RED;
                C34298m a = C34298m.m132985a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MessageDisplayWeightService.inst()");
                float coerceAtLeast = RangesKt.coerceAtLeast(((float) (a.mo126844d() - 1)) / 4.0f, 6.0f);
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                Log.m165379d("ChatWindowLog", "lastVisibleItemPosition is " + findLastVisibleItemPosition + ", maxWeight is " + coerceAtLeast);
                ArrayList arrayList = new ArrayList();
                IMessageListComponent iMessageListComponent3 = this.f85123f;
                if (iMessageListComponent3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
                }
                arrayList.addAll(iMessageListComponent3.mo123327k());
                Log.m165379d("ChatWindowLog", "size of message list is " + arrayList.size());
                int size = arrayList.size();
                if (findLastVisibleItemPosition >= 0 && size > findLastVisibleItemPosition) {
                    int lastIndex = CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex >= findLastVisibleItemPosition) {
                        while (true) {
                            f += (float) C34298m.m132985a().mo126841a(((ChatMessageVO) arrayList.get(lastIndex)).mo121710r().getNumber());
                            Log.m165379d("ChatWindowLog", lastIndex + '/' + CollectionsKt.getLastIndex(arrayList) + ", current total weight is " + f);
                            if (f <= coerceAtLeast) {
                                if (lastIndex == findLastVisibleItemPosition) {
                                    break;
                                }
                                lastIndex--;
                            } else {
                                Log.m165379d("ChatWindowLog", "show bottom tip, total weight is " + f + ", costs " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                                return true;
                            }
                        }
                    }
                    Log.m165379d("ChatWindowLog", "no bottom tip, total weight is " + f + ", costs " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$pullUnReadAtMessage$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$m */
    public static final class C33068m implements IGetDataCallback<List<? extends MessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85164a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33068m(MessageTipsPlugin bVar) {
            this.f85164a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(List<? extends MessageInfo> list) {
            MessageTipsPlugin.m127837c(this.f85164a).mo129976a((List<MessageInfo>) list);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            MessageTipsPlugin.m127837c(this.f85164a).mo129976a(new ArrayList());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IMessageListComponent m127832a(MessageTipsPlugin bVar) {
        IMessageListComponent iMessageListComponent = bVar.f85123f;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return iMessageListComponent;
    }

    /* renamed from: b */
    public static final /* synthetic */ Chat m127836b(MessageTipsPlugin bVar) {
        Chat chat = bVar.f85118a;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentChat");
        }
        return chat;
    }

    /* renamed from: c */
    public static final /* synthetic */ C35324c m127837c(MessageTipsPlugin bVar) {
        C35324c<ChatMessageVO<?>> cVar = bVar.f85119b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewMessageTipController");
        }
        return cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$initMessageTips$1$1", "Lcom/ss/android/lark/chatwindow/view/tip/BaseNewMessageTip$OnTipClickListener;", "onAtClick", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "onNewMessageClick", "newMessagePosition", "", "toBottom", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$e */
    public static final class C33056e implements AbstractC35310a.AbstractC35313c {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85139a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f85140b;

        /* renamed from: c */
        final /* synthetic */ IMessageListComponent f85141c;

        @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a.AbstractC35313c
        /* renamed from: a */
        public void mo122143a(Message message) {
            if (message != null) {
                this.f85141c.mo123305a(message.getPosition(), true, false, new IMessageListComponent.OnLoadMessageStatusListener(this) {
                    /* class com.ss.android.lark.chat.chatwindow.biz.plugin.MessageTipsPlugin.C33056e.C330571 */

                    /* renamed from: a */
                    final /* synthetic */ C33056e f85142a;

                    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.OnLoadMessageStatusListener
                    /* renamed from: a */
                    public void mo122144a() {
                        MessageTipsPlugin.m127837c(this.f85142a.f85139a).mo129988g();
                    }

                    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.OnLoadMessageStatusListener
                    /* renamed from: b */
                    public void mo122145b() {
                        MessageTipsPlugin.m127837c(this.f85142a.f85139a).mo129989h();
                    }

                    {
                        this.f85142a = r1;
                    }
                });
            }
        }

        @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a.AbstractC35313c
        /* renamed from: a */
        public void mo122142a(int i, boolean z) {
            this.f85141c.mo123305a(i, false, z, new IMessageListComponent.OnLoadMessageStatusListener(this) {
                /* class com.ss.android.lark.chat.chatwindow.biz.plugin.MessageTipsPlugin.C33056e.C330582 */

                /* renamed from: a */
                final /* synthetic */ C33056e f85143a;

                @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.OnLoadMessageStatusListener
                /* renamed from: a */
                public void mo122144a() {
                    MessageTipsPlugin.m127837c(this.f85143a.f85139a).mo129988g();
                }

                @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.OnLoadMessageStatusListener
                /* renamed from: b */
                public void mo122145b() {
                    MessageTipsPlugin.m127837c(this.f85143a.f85139a).mo129989h();
                }

                {
                    this.f85143a = r1;
                }
            });
        }

        C33056e(MessageTipsPlugin bVar, IChatWindowApp dVar, IMessageListComponent iMessageListComponent) {
            this.f85139a = bVar;
            this.f85140b = dVar;
            this.f85141c = iMessageListComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$initMessageTips$1$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$INewMessageArrivedListener;", "onNewMessageArrived", "", "messageList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$g */
    public static final class C33060g implements IMessageListComponent.INewMessageArrivedListener {

        /* renamed from: a */
        final /* synthetic */ IMessageListComponent f85147a;

        /* renamed from: b */
        final /* synthetic */ MessageTipsPlugin f85148b;

        /* renamed from: c */
        final /* synthetic */ IChatWindowApp f85149c;

        /* renamed from: d */
        final /* synthetic */ IMessageListComponent f85150d;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.INewMessageArrivedListener
        /* renamed from: a */
        public void mo122149a(final List<? extends MessageInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "messageList");
            this.f85148b.f85122e.mo92346a(new Runnable(this) {
                /* class com.ss.android.lark.chat.chatwindow.biz.plugin.MessageTipsPlugin.C33060g.RunnableC330611 */

                /* renamed from: a */
                final /* synthetic */ C33060g f85151a;

                {
                    this.f85151a = r1;
                }

                public final void run() {
                    MessageTipsPlugin.m127837c(this.f85151a.f85148b).mo129978a(list, !this.f85151a.f85147a.mo123323f());
                }
            }, 500);
        }

        C33060g(IMessageListComponent iMessageListComponent, MessageTipsPlugin bVar, IChatWindowApp dVar, IMessageListComponent iMessageListComponent2) {
            this.f85147a = iMessageListComponent;
            this.f85148b = bVar;
            this.f85149c = dVar;
            this.f85150d = iMessageListComponent2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTipsPlugin$initMessageTips$1$4", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IMessageTipChangeListener;", "onMessageSelectModeChange", "", "isMultiSelect", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.b$h */
    public static final class C33062h implements IMessageListComponent.IMessageTipChangeListener {

        /* renamed from: a */
        final /* synthetic */ MessageTipsPlugin f85153a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f85154b;

        /* renamed from: c */
        final /* synthetic */ IMessageListComponent f85155c;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IMessageTipChangeListener
        /* renamed from: a */
        public void mo122151a(boolean z) {
            if (z) {
                MessageTipsPlugin.m127837c(this.f85153a).mo129982b((Boolean) true);
            } else {
                MessageTipsPlugin.m127837c(this.f85153a).mo129984c(true);
            }
        }

        C33062h(MessageTipsPlugin bVar, IChatWindowApp dVar, IMessageListComponent iMessageListComponent) {
            this.f85153a = bVar;
            this.f85154b = dVar;
            this.f85155c = iMessageListComponent;
        }
    }

    /* renamed from: a */
    private final void m127834a(String str) {
        UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new C33068m(this));
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC33067l(this, str, uIGetDataCallback));
    }

    /* renamed from: a */
    private final boolean m127835a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                Intrinsics.checkExpressionValueIsNotNull(adapter, "rv.adapter ?: return false");
                if (findLastVisibleItemPosition >= adapter.getItemCount() - 10) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m127833a(RelativeLayout relativeLayout) {
        Context context;
        Context context2;
        Context context3;
        Log.m165389i("ChatWindowLog", "init message tips view");
        Context context4 = null;
        if (relativeLayout != null) {
            context = relativeLayout.getContext();
        } else {
            context = null;
        }
        View a = C36443k.m143597a(context, Reflection.getOrCreateKotlinClass(NewMessageTip.class).getQualifiedName());
        if (a == null) {
            if (relativeLayout != null) {
                context3 = relativeLayout.getContext();
            } else {
                context3 = null;
            }
            this.f85125l = new NewMessageTip(context3);
        } else {
            this.f85125l = (NewMessageTip) a;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21);
        layoutParams.addRule(10);
        if (relativeLayout != null) {
            NewMessageTip newMessageTip = this.f85125l;
            if (newMessageTip == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNewMessageTopTip");
            }
            relativeLayout.addView(newMessageTip, layoutParams);
        }
        NewMessageTip newMessageTip2 = this.f85125l;
        if (newMessageTip2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewMessageTopTip");
        }
        newMessageTip2.setVisibility(8);
        if (relativeLayout != null) {
            context2 = relativeLayout.getContext();
        } else {
            context2 = null;
        }
        View a2 = C36443k.m143597a(context2, Reflection.getOrCreateKotlinClass(NewMessageTip.class).getQualifiedName());
        if (a2 == null) {
            if (relativeLayout != null) {
                context4 = relativeLayout.getContext();
            }
            this.f85126m = new NewMessageTip(context4);
        } else {
            this.f85126m = (NewMessageTip) a2;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(21);
        layoutParams2.addRule(8, R.id.chat_ptr_layout);
        if (relativeLayout != null) {
            NewMessageTip newMessageTip3 = this.f85126m;
            if (newMessageTip3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNewMessageBottomTip");
            }
            relativeLayout.addView(newMessageTip3, layoutParams2);
        }
        NewMessageTip newMessageTip4 = this.f85126m;
        if (newMessageTip4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewMessageBottomTip");
        }
        newMessageTip4.setVisibility(8);
        AbstractC36474h.AbstractC36491q qVar = this.f85129p;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewStateLifecycle");
        }
        NewMessageTip newMessageTip5 = this.f85126m;
        if (newMessageTip5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewMessageBottomTip");
        }
        qVar.mo134644a(newMessageTip5);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
        this.f85118a = chat;
        this.f85119b = new C35324c<>();
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36474h.AbstractC36491q a = b.av().mo134628a(mo122130k());
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…nController(hostFragment)");
        this.f85129p = a;
        this.f85123f = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
        this.f85127n = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
        this.f85128o = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
        IMessageListComponent iMessageListComponent = this.f85123f;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent.mo121971a(new C33063i(this, dVar));
        IKeyboardComponent cVar = this.f85127n;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardListComponent");
        }
        cVar.mo121971a(new C33064j(this));
        ITitlebarComponent bVar2 = this.f85128o;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBarComponent");
        }
        bVar2.mo123670a(new C33066k(this));
    }

    /* renamed from: a */
    public final void mo122136a(IMessageListComponent iMessageListComponent, IChatWindowApp dVar) {
        C35324c<ChatMessageVO<?>> cVar = this.f85119b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewMessageTipController");
        }
        if (cVar.mo129979a()) {
            Log.m165383e("ChatWindowLog", "message tip is valid when init");
        } else if (iMessageListComponent != null) {
            m127833a(iMessageListComponent.mo123319b());
            C35317a aVar = new C35317a(new C33053b(this, dVar, iMessageListComponent), new C33054c(this, dVar, iMessageListComponent), new C33055d(this, dVar, iMessageListComponent));
            Context f = dVar.mo123135f();
            C35317a aVar2 = aVar;
            NewMessageTip newMessageTip = this.f85125l;
            if (newMessageTip == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNewMessageTopTip");
            }
            NewMessageTip newMessageTip2 = this.f85126m;
            if (newMessageTip2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNewMessageBottomTip");
            }
            C35324c<ChatMessageVO<?>> cVar2 = new C35324c<>(f, aVar2, newMessageTip, newMessageTip2, true);
            this.f85119b = cVar2;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNewMessageTipController");
            }
            cVar2.mo129973a(new C33056e(this, dVar, iMessageListComponent));
            iMessageListComponent.mo123313a(new C33059f(this, dVar, iMessageListComponent));
            iMessageListComponent.mo123310a(new C33060g(iMessageListComponent, this, dVar, iMessageListComponent));
            iMessageListComponent.mo123309a(new C33062h(this, dVar, iMessageListComponent));
            C35324c<ChatMessageVO<?>> cVar3 = this.f85119b;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNewMessageTipController");
            }
            cVar3.mo129981b(0);
            C35324c<ChatMessageVO<?>> cVar4 = this.f85119b;
            if (cVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNewMessageTipController");
            }
            cVar4.mo129980b();
            Chat chat = this.f85118a;
            if (chat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCurrentChat");
            }
            String id = chat.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "mCurrentChat.getId()");
            m127834a(id);
        }
    }
}
