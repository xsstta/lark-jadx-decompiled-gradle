package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28621d;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.extension.ChatContext;
import com.ss.android.lark.biz.im.extension.ChatWindowObserver;
import com.ss.android.lark.biz.im.extension.ExtensionCallback;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.ComponentCreator;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency;
import com.ss.android.lark.chat.chatwindow.chat.C33247j;
import com.ss.android.lark.chat.chatwindow.chat.C33255l;
import com.ss.android.lark.chat.chatwindow.chat.data.content.ChatMessageContentResolver;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IDependencyViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.ExtendType;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardExtendDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardExtendsManager;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ITabDependeceViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatbase.view.LarkPlayModeTip;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.chatwindow.view.firsttip.ChatTipController;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threadwindow.p2760a.p2764d.C56035f;
import com.ss.android.lark.tour.block.ActionBlockManager;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.ILifeCycleEventObserve;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002\u000f\u001c\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001WB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001aH\u0016J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020'H\u0002J/\u0010-\u001a\u0004\u0018\u0001H.\"\u0010\b\u0000\u0010.*\n\u0012\u0006\b\u0001\u0012\u0002000/2\f\u00101\u001a\b\u0012\u0004\u0012\u0002H.02H\u0016¢\u0006\u0002\u00103J\u001a\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020+H\u0016J\b\u0010=\u001a\u00020'H\u0002J\b\u0010>\u001a\u00020'H\u0002J\b\u0010?\u001a\u00020'H\u0002J\b\u0010@\u001a\u00020'H\u0002J\"\u0010A\u001a\u00020'2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010G\u001a\u00020'H\u0016J\u0010\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020CH\u0016J\b\u0010J\u001a\u00020'H\u0016J\b\u0010K\u001a\u00020'H\u0014J\b\u0010L\u001a\u00020'H\u0014J\b\u0010M\u001a\u00020'H\u0016J\u001a\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u0002052\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u0010\u0010R\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0007H\u0016J\u0010\u0010S\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001aH\u0016J\b\u0010T\u001a\u00020'H\u0016J\u0012\u0010U\u001a\u00020'2\b\u0010V\u001a\u0004\u0018\u00010%H\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0006j\b\u0012\u0004\u0012\u00020\u001a`\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ChatTabFragment;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$MessageListDependency;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/IMessageListChatWindow;", "()V", "activityResultHandlers", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IActivityResultHandler;", "Lkotlin/collections/ArrayList;", "chatWindowObserverList", "", "Lcom/ss/android/lark/biz/im/extension/ChatWindowObserver;", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "keyboardComponentDependency", "com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$keyboardComponentDependency$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$keyboardComponentDependency$1;", "keyboardExtendComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardTopExtendComponent;", "keyboardStatusListener", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$OnKeyboardControlStatusChangeListener;", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageListComponent;", "messageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;", "smartReplyShowHandlers", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IShowSmartReplyHandler;", "statusListener", "com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$statusListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$statusListener$1;", "titleBarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "getTitleBarComponent", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "titleBarComponent$delegate", "Lkotlin/Lazy;", "titleStateScrollListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "addActivityResultHandler", "", "handle", "addShowSmartReplyHandler", "canHideTitleBar", "", "createComponents", "getComponent", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getContentView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "handleBack", "initApp", "initChatWindowObserver", "initComponentDependency", "initMessageSender", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBannerHide", "onBannerShow", "bannerHeight", "onDestroyView", "onPageHide", "onPageShow", "onStop", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "removeActivityResultHandler", "removeShowSmartReplyHandler", "replaceComponentForSecret", "setTitleStateChangeListener", "listener", "MessageListDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b */
public final class MessageListFragment extends ChatTabFragment<MessageListDependency> implements IMessageListChatWindow {

    /* renamed from: b */
    public IKeyboardComponent f86727b;

    /* renamed from: c */
    public MessageListComponent f86728c;

    /* renamed from: d */
    public KeyboardTopExtendComponent f86729d;

    /* renamed from: e */
    public final ArrayList<IChatWindowApp.IShowSmartReplyHandler> f86730e = new ArrayList<>();

    /* renamed from: f */
    public IChatTabPageSpec.OnTitleStateChangeListener f86731f;

    /* renamed from: g */
    public MessageSender f86732g;

    /* renamed from: h */
    private final ArrayList<IChatWindowApp.IActivityResultHandler> f86733h = new ArrayList<>();

    /* renamed from: i */
    private IKeyboardComponent.OnKeyboardControlStatusChangeListener f86734i = new C33683k(this);

    /* renamed from: j */
    private final C33682j f86735j = new C33682j(this);

    /* renamed from: k */
    private final C33684l f86736k = new C33684l(this);

    /* renamed from: l */
    private final Lazy f86737l = LazyKt.lazy(new C33685m(this));

    /* renamed from: m */
    private List<? extends ChatWindowObserver> f86738m;

    /* renamed from: n */
    private HashMap f86739n;

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: f */
    public void mo123585f() {
        HashMap hashMap = this.f86739n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: p */
    public final ITitlebarComponent mo123588p() {
        return (ITitlebarComponent) this.f86737l.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$createComponents$1$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardTopExtendComponent$KeyboardExtendComponentDependency;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$c */
    public static final class C33672c implements KeyboardTopExtendComponent.KeyboardExtendComponentDependency {
        C33672c() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$initComponentDependency$1$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "onChatUpdate", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onP2pChatterUpdate", "chatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$f */
    public static final class C33676f implements IMessageListComponent.IListComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ MessageListDependency f86746a;

        /* renamed from: b */
        final /* synthetic */ MessageListFragment f86747b;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122152a() {
            IMessageListComponent.IListComponentCallbacks.C33556a.m130094a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122154a(ChatChatter chatChatter) {
            Intrinsics.checkParameterIsNotNull(chatChatter, "chatChatter");
            MessageListFragment.m130498a(this.f86747b).mo123024a(chatChatter);
            ChatParamUtils.m133140a(chatChatter);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122153a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            MessageListFragment.m130498a(this.f86747b).mo123023a(chat);
            ((IKeyboardDependenceViewModel) this.f86746a.mo123570b(IKeyboardDependenceViewModel.class)).getChat().mo5926a(chat);
            ChatParamUtils.m133138a(chat);
        }

        C33676f(MessageListDependency aVar, MessageListFragment bVar) {
            this.f86746a = aVar;
            this.f86747b = bVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: m */
    public void mo123586m() {
        super.mo123586m();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: n */
    public void mo123587n() {
        super.mo123587n();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$initChatWindowObserver$chatContext$1", "Lcom/ss/android/lark/biz/im/extension/ChatContext;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContext", "Landroid/content/Context;", "showTodoSmartReply", "", "drawable", "Landroid/graphics/drawable/Drawable;", "label", "", "callback", "Lcom/ss/android/lark/biz/im/extension/ExtensionCallback;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$d */
    public static final class C33673d implements ChatContext {

        /* renamed from: a */
        final /* synthetic */ MessageListFragment f86743a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAlertClicked"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$d$a */
        static final class C33674a implements AbstractC28621d.AbstractC28622a {

            /* renamed from: a */
            final /* synthetic */ ExtensionCallback f86744a;

            C33674a(ExtensionCallback dVar) {
                this.f86744a = dVar;
            }

            @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28621d.AbstractC28622a
            /* renamed from: a */
            public final void mo101869a() {
                this.f86744a.mo106813a(Unit.INSTANCE);
            }
        }

        @Override // com.ss.android.lark.biz.im.extension.ChatContext
        /* renamed from: a */
        public Context mo106810a() {
            Context requireContext = this.f86743a.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            return requireContext;
        }

        @Override // com.ss.android.lark.biz.im.extension.ChatContext
        /* renamed from: b */
        public Chat mo106812b() {
            ITabDependeceViewModel hVar;
            C1177w<Chat> chat;
            MessageListDependency aVar = (MessageListDependency) this.f86743a.mo123605b();
            if (aVar == null || (hVar = (ITabDependeceViewModel) aVar.mo123570b(ITabDependeceViewModel.class)) == null || (chat = hVar.getChat()) == null) {
                return null;
            }
            return chat.mo5927b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33673d(MessageListFragment bVar) {
            this.f86743a = bVar;
        }

        @Override // com.ss.android.lark.biz.im.extension.ChatContext
        /* renamed from: a */
        public void mo106811a(Drawable drawable, String str, ExtensionCallback<Unit> dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "callback");
            if (str == null) {
                str = "";
            }
            SmartReplyItem smartReplyItem = new SmartReplyItem(str, SmartReplyItem.Type.TODO);
            smartReplyItem.mo101839a(drawable);
            smartReplyItem.mo101840a(new SmartReplyItem.C28615c(new C33674a(dVar)));
            Iterator<T> it = this.f86743a.f86730e.iterator();
            while (it.hasNext()) {
                it.next().mo123197a(CollectionsKt.mutableListOf(smartReplyItem));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J%\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\u0004\u0018\u0001H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000fJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$MessageListDependency;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;", "commonTabDependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/CommonTabDependency;)V", "closePage", "", "getChatWindowViewModel", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "getComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$a */
    public static abstract class MessageListDependency implements CommonTabDependency {

        /* renamed from: a */
        private final CommonTabDependency f86740a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: a */
        public void mo123569a() {
            this.f86740a.mo123569a();
        }

        public MessageListDependency(CommonTabDependency dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "commonTabDependency");
            this.f86740a = dVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: a */
        public <T extends IComponent<? extends IComponentCallbacks>> T mo123568a(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86740a.mo123568a(cls);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.CommonTabDependency
        /* renamed from: b */
        public <T extends IDependencyViewModel> T mo123570b(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) this.f86740a.mo123570b(cls);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000u\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¨\u0006 ¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$createComponents$1$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$MessageListComponentDependency;", "appendText", "", "text", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "", "postText", "closePage", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "getGuideAnchorView", "Landroid/view/View;", "getKeyboardInfo", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "insertAtInfoInEditor", "", BottomDialog.f17198f, "name", "isOutChat", "onEnterReplyMode", "replyInfo", "isReEdit", "resetOnStart", "toggleKeyboardTipShown", "shown", "triggerEventChanged", "eventName", "Lcom/ss/android/lark/widget/ILifeCycleEventObserve$Event;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$b */
    public static final class C33671b implements IMessageListComponent.MessageListComponentDependency {

        /* renamed from: a */
        final /* synthetic */ MessageListDependency f86741a;

        /* renamed from: b */
        final /* synthetic */ MessageListFragment f86742b;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: d */
        public void mo123155d() {
            this.f86741a.mo123569a();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: e */
        public Fragment mo123156e() {
            return this.f86742b;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: b */
        public View mo123153b() {
            ITitlebarComponent p = this.f86742b.mo123588p();
            if (p != null) {
                return p.ar_();
            }
            return null;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: c */
        public IMessageSender mo123154c() {
            return MessageListFragment.m130498a(this.f86742b);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public C35221d mo123147a() {
            String str;
            C35221d dVar = new C35221d();
            IKeyboardComponent cVar = this.f86742b.f86727b;
            String str2 = null;
            if (cVar != null) {
                str = cVar.mo121994l();
            } else {
                str = null;
            }
            dVar.f90970b = str;
            IKeyboardComponent cVar2 = this.f86742b.f86727b;
            if (cVar2 != null) {
                str2 = cVar2.mo121993k();
            }
            dVar.f90969a = str2;
            return dVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public void mo123149a(ILifeCycleEventObserve.Event event) {
            Intrinsics.checkParameterIsNotNull(event, "eventName");
            FragmentActivity activity = this.f86742b.getActivity();
            if (activity instanceof ILifeCycleEventObserve.AbstractC58308a) {
                ((ILifeCycleEventObserve.AbstractC58308a) activity).mo103142a(event);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public void mo123151a(boolean z) {
            IKeyboardComponent cVar = this.f86742b.f86727b;
            if (cVar != null) {
                cVar.mo121980a(z);
            }
        }

        C33671b(MessageListDependency aVar, MessageListFragment bVar) {
            this.f86741a = aVar;
            this.f86742b = bVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public void mo123148a(C35221d dVar, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(dVar, "replyInfo");
            IKeyboardComponent cVar = this.f86742b.f86727b;
            if (cVar != null) {
                cVar.mo122063a(dVar, z, z2);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public void mo123150a(RichText richText, String str, RichText richText2) {
            IKeyboardComponent cVar = this.f86742b.f86727b;
            if (cVar != null) {
                cVar.mo122064a(richText, str, richText2);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.MessageListComponentDependency
        /* renamed from: a */
        public boolean mo123152a(String str, String str2, boolean z) {
            AtKBPlugin aVar;
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            Intrinsics.checkParameterIsNotNull(str2, "name");
            IKeyboardComponent cVar = this.f86742b.f86727b;
            if (cVar == null || (aVar = (AtKBPlugin) cVar.mo121967a("at")) == null) {
                return false;
            }
            return aVar.mo147384a(str, str2, z, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\f\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$keyboardComponentDependency$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "attachNestRoot", "", "nestScrollFrameLayout", "Lcom/ss/android/lark/keyboard/base/NestScrollFrameLayout;", "getBaseFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getListScroller", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageListScroller;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "getRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$j */
    public static final class C33682j implements KeyboardComponentDependency {

        /* renamed from: a */
        final /* synthetic */ MessageListFragment f86754a;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency
        /* renamed from: b */
        public BaseFragment mo122092b() {
            return this.f86754a;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency
        /* renamed from: a */
        public FragmentManager mo122090a() {
            FragmentManager childFragmentManager = this.f86754a.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "this@MessageListFragment.childFragmentManager");
            return childFragmentManager;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency
        /* renamed from: c */
        public IMessageSender mo122093c() {
            return MessageListFragment.m130498a(this.f86754a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33682j(MessageListFragment bVar) {
            this.f86754a = bVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency
        /* renamed from: a */
        public void mo122091a(NestScrollFrameLayout nestScrollFrameLayout) {
            Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
            ViewGroup i = this.f86754a.mo123630i();
            if (i != null) {
                nestScrollFrameLayout.mo146855a(i);
            }
        }
    }

    /* renamed from: t */
    private final void m130501t() {
        m130502u();
        m130503v();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: l */
    public void mo123564l() {
        MessageListComponent messageListComponent = this.f86728c;
        if (messageListComponent != null) {
            messageListComponent.mo123335C();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$initMessageSender$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$IMessageSendListener;", "onAuditedFailed", "", "msg", "", "onMsgUpdate", "key", "Lcom/ss/android/lark/chatbase/BasePageStore$ItemTwoKey;", "updater", "Lcom/ss/android/lark/chatbase/model/PageStore$IItemPatch;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "onPendingSendMsg", "onSendMsgFailed", "preMsg", "Lcom/ss/android/lark/chat/entity/message/Message;", "onSendMsgSuccess", "messageId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$i */
    public static final class C33679i implements MessageSender.IMessageSendListener {

        /* renamed from: a */
        final /* synthetic */ MessageListFragment f86750a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$i$a */
        public static final class RunnableC33680a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33679i f86751a;

            /* renamed from: b */
            final /* synthetic */ String f86752b;

            /* renamed from: c */
            final /* synthetic */ Message f86753c;

            RunnableC33680a(C33679i iVar, String str, Message message) {
                this.f86751a = iVar;
                this.f86752b = str;
                this.f86753c = message;
            }

            public final void run() {
                ActionBlockManager.f141152c.mo194392a(new Function0<Unit>(this) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.MessageListFragment.C33679i.RunnableC33680a.C336811 */
                    final /* synthetic */ RunnableC33680a this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        MessageListComponent messageListComponent = this.this$0.f86751a.f86750a.f86728c;
                        if (messageListComponent != null) {
                            AbstractC34006a t = messageListComponent.mo123331t(this.this$0.f86752b);
                            if (t == null) {
                                String str = this.this$0.f86753c.getcId();
                                Intrinsics.checkExpressionValueIsNotNull(str, "preMsg.getcId()");
                                t = messageListComponent.mo123331t(str);
                            }
                            if (t != null) {
                                ChatTipController.f91138a.mo129832a(messageListComponent.mo123358p(), (MessageInfo) t, ChatMessageContentResolver.f85521a);
                            }
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123028a() {
            MessageListComponent messageListComponent = this.f86750a.f86728c;
            if (messageListComponent != null) {
                messageListComponent.mo123334B();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33679i(MessageListFragment bVar) {
            this.f86750a = bVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123029a(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "preMsg");
            MessageListComponent messageListComponent = this.f86750a.f86728c;
            if (messageListComponent != null) {
                messageListComponent.mo123314a(new AbstractC34417b.C34425g(message.getcId()), new C56035f(SendStatus.FAIL));
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123032a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            MessageListComponent messageListComponent = this.f86750a.f86728c;
            if (messageListComponent != null) {
                messageListComponent.mo123368x(str);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123031a(AbstractC34417b.AbstractC34421c<String> cVar, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "key");
            Intrinsics.checkParameterIsNotNull(bVar, "updater");
            MessageListComponent messageListComponent = this.f86750a.f86728c;
            if (messageListComponent != null) {
                messageListComponent.mo123314a(cVar, bVar);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.IMessageSendListener
        /* renamed from: a */
        public void mo123030a(Message message, String str) {
            Intrinsics.checkParameterIsNotNull(message, "preMsg");
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Log.m165389i("ChatWindowLog", "send msg success:" + str + ", " + message);
            MessageListComponent messageListComponent = this.f86750a.f86728c;
            if (messageListComponent != null) {
                messageListComponent.mo123314a(new AbstractC34417b.C34425g(message.getcId()), new C56035f(SendStatus.SUCCESS));
            }
            UICallbackExecutor.execute(new RunnableC33680a(this, str, message));
        }
    }

    /* renamed from: u */
    private final void m130502u() {
        this.f86732g = new MessageSender(new C33679i(this));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: h */
    public boolean mo121990h() {
        IKeyboardComponent cVar = this.f86727b;
        if (cVar == null || !cVar.mo121990h()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: k */
    public IMessageSender mo123563k() {
        MessageSender bVar = this.f86732g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageSender");
        }
        return bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$m */
    static final class C33685m extends Lambda implements Function0<ITitlebarComponent> {
        final /* synthetic */ MessageListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33685m(MessageListFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ITitlebarComponent invoke() {
            MessageListDependency aVar = (MessageListDependency) this.this$0.mo123605b();
            if (aVar != null) {
                return (ITitlebarComponent) aVar.mo123568a(ITitlebarComponent.class);
            }
            return null;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ChatTabFragment, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IKeyboardComponent cVar;
        super.onDestroyView();
        IKeyboardComponent.OnKeyboardControlStatusChangeListener cVar2 = this.f86734i;
        if (!(cVar2 == null || (cVar = this.f86727b) == null)) {
            cVar.mo121983b(cVar2);
        }
        mo123585f();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Widget widget = (Widget) this.f86727b;
        if (widget != null) {
            widget.onStop();
        }
        KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86729d;
        if (keyboardTopExtendComponent != null) {
            keyboardTopExtendComponent.onStop();
        }
        MessageListComponent messageListComponent = this.f86728c;
        if (messageListComponent != null) {
            messageListComponent.onStop();
        }
    }

    public MessageListFragment() {
        mo123628a(false);
    }

    /* renamed from: r */
    private final void m130499r() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        List<ChatWindowObserver> a = b.ap().mo134656a(new C33673d(this));
        this.f86738m = a;
        if (a != null) {
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                getLifecycle().addObserver(it.next());
            }
        }
    }

    /* renamed from: q */
    public final boolean mo123589q() {
        MessageListComponent messageListComponent = this.f86728c;
        if (messageListComponent == null) {
            Intrinsics.throwNpe();
        }
        if (messageListComponent.mo123327k().size() > 15) {
            MessageListComponent messageListComponent2 = this.f86728c;
            if (messageListComponent2 == null) {
                Intrinsics.throwNpe();
            }
            if (!messageListComponent2.mo123323f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    private final void m130503v() {
        MessageListDependency aVar = (MessageListDependency) mo123605b();
        if (aVar != null) {
            MessageListComponent messageListComponent = this.f86728c;
            if (messageListComponent != null) {
                messageListComponent.mo123345a(new C33675e(this));
            }
            MessageListComponent messageListComponent2 = this.f86728c;
            if (messageListComponent2 != null) {
                messageListComponent2.mo121971a((IMessageListComponent.IListComponentCallbacks) new C33676f(aVar, this));
            }
            MessageListComponent messageListComponent3 = this.f86728c;
            if (messageListComponent3 != null) {
                messageListComponent3.mo123347a(new C33677g(this));
            }
        }
        KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86729d;
        if (keyboardTopExtendComponent != null) {
            keyboardTopExtendComponent.mo123273a(new C33678h(this));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: j */
    public void mo123562j() {
        IKeyboardDependenceViewModel eVar;
        ComponentCreator bVar = ComponentCreator.f85048a;
        ComponentCreator bVar2 = ComponentCreator.f85048a;
        ComponentCreator bVar3 = ComponentCreator.f85048a;
        Context context = getContext();
        if (context != null) {
            Activity activity = (Activity) context;
            MessageListDependency aVar = (MessageListDependency) mo123605b();
            if (aVar != null) {
                eVar = (IKeyboardDependenceViewModel) aVar.mo123570b(IKeyboardDependenceViewModel.class);
            } else {
                eVar = null;
            }
            if (eVar == null) {
                Intrinsics.throwNpe();
            }
            IKeyboardComponent a = bVar.mo122060a(bVar2.mo122061a(bVar3.mo122062a(true, activity, eVar, this.f86735j), this.f86736k), this.f86734i);
            WidgetManager a2 = WidgetManager.Companion.m151976a(WidgetManager.f99047e, this, null, 2, null);
            IKeyboardComponent cVar = this.f86727b;
            if (cVar != null) {
                Widget widget = (Widget) cVar;
                if (a != null) {
                    a2.mo141215a(widget, (Widget) a);
                    this.f86727b = a;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: s */
    private final void m130500s() {
        MessageListDependency aVar = (MessageListDependency) mo123605b();
        if (aVar != null) {
            ComponentCreator bVar = ComponentCreator.f85048a;
            ComponentCreator bVar2 = ComponentCreator.f85048a;
            ComponentCreator bVar3 = ComponentCreator.f85048a;
            Context context = getContext();
            if (context != null) {
                this.f86727b = bVar.mo122060a(bVar2.mo122061a(bVar3.mo122062a(false, (Activity) context, (IKeyboardDependenceViewModel) aVar.mo123570b(IKeyboardDependenceViewModel.class), this.f86735j), this.f86736k), this.f86734i);
                Context context2 = getContext();
                if (context2 != null) {
                    this.f86728c = new MessageListComponent((FragmentActivity) context2, (IMessageDependenceViewModel) aVar.mo123570b(IMessageDependenceViewModel.class), new C33671b(aVar, this));
                    Context context3 = getContext();
                    if (context3 != null) {
                        this.f86729d = new KeyboardTopExtendComponent((FragmentActivity) context3, (IKeyboardExtendDependenceViewModel) aVar.mo123570b(IKeyboardExtendDependenceViewModel.class), new C33672c());
                        try {
                            PerfLog.start("message_list_component", "");
                            WidgetManager a = WidgetManager.f99047e.mo141218a(this, mo123630i());
                            MessageListComponent messageListComponent = this.f86728c;
                            if (messageListComponent == null) {
                                Intrinsics.throwNpe();
                            }
                            WidgetManager a2 = a.mo141213a(R.id.chat_message_list_container, (Widget) messageListComponent, false);
                            IKeyboardComponent cVar = this.f86727b;
                            if (cVar != null) {
                                WidgetManager a3 = a2.mo141213a(R.id.chat_keyboard_container, (Widget) cVar, false);
                                KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86729d;
                                if (keyboardTopExtendComponent == null) {
                                    Intrinsics.throwNpe();
                                }
                                a3.mo141213a(R.id.chat_keyboard_extend_container, (Widget) keyboardTopExtendComponent, false);
                                PerfLog.end("message_list_component", "");
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
                        } catch (IllegalArgumentException e) {
                            Log.m165387e("current fragment:" + this + ", current fragment active:" + isActive() + ", widget is destroy:" + C26254af.m95008b(this, "isDestroyed"), (Throwable) e, true);
                            aVar.mo123569a();
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public void mo123554a(IChatTabPageSpec.OnTitleStateChangeListener dVar) {
        this.f86731f = dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$initComponentDependency$1$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$e */
    public static final class C33675e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MessageListFragment f86745a;

        C33675e(MessageListFragment bVar) {
            this.f86745a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IChatTabPageSpec.OnTitleStateChangeListener dVar;
            IKeyboardComponent cVar;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 1 && (cVar = this.f86745a.f86727b) != null) {
                cVar.mo121999p();
            }
            if (i == 0) {
                IChatTabPageSpec.OnTitleStateChangeListener dVar2 = this.f86745a.f86731f;
                if (dVar2 != null) {
                    dVar2.mo123179a(false);
                }
            } else if (this.f86745a.mo123589q() && (dVar = this.f86745a.f86731f) != null) {
                dVar.mo123179a(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$initComponentDependency$1$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$OnAudioPlayerModeListener;", "onAudioPlayerModeChanged", "", "isSpeakerMode", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$g */
    public static final class C33677g implements IMessageListComponent.OnAudioPlayerModeListener {

        /* renamed from: a */
        final /* synthetic */ MessageListFragment f86748a;

        C33677g(MessageListFragment bVar) {
            this.f86748a = bVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.OnAudioPlayerModeListener
        /* renamed from: a */
        public void mo123159a(boolean z) {
            ITitlebarComponent p = this.f86748a.mo123588p();
            if (p == null) {
                return;
            }
            if (z) {
                LarkPlayModeTip.f88953b.mo127188a().mo127186a(p.mo123681i());
            } else {
                LarkPlayModeTip.f88953b.mo127188a().mo127187b(p.mo123681i());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$initComponentDependency$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$OnExtendStatusChangeListener;", "onExtendHide", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "onExtendShow", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$h */
    public static final class C33678h implements KeyboardExtendsManager.OnExtendStatusChangeListener {

        /* renamed from: a */
        final /* synthetic */ MessageListFragment f86749a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33678h(MessageListFragment bVar) {
            this.f86749a = bVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardExtendsManager.OnExtendStatusChangeListener
        /* renamed from: a */
        public void mo123160a(ExtendType extendType) {
            Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
            MessageListComponent messageListComponent = this.f86749a.f86728c;
            if (messageListComponent != null) {
                messageListComponent.mo123365w();
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardExtendsManager.OnExtendStatusChangeListener
        /* renamed from: b */
        public void mo123161b(ExtendType extendType) {
            Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
            MessageListComponent messageListComponent = this.f86749a.f86728c;
            if (messageListComponent != null) {
                messageListComponent.mo123365w();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$keyboardStatusListener$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$OnKeyboardControlStatusChangeListener;", "onKeyboardControlStatusChange", "", "show", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$k */
    public static final class C33683k implements IKeyboardComponent.OnKeyboardControlStatusChangeListener {

        /* renamed from: a */
        final /* synthetic */ MessageListFragment f86755a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33683k(MessageListFragment bVar) {
            this.f86755a = bVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.OnKeyboardControlStatusChangeListener
        /* renamed from: a */
        public void mo122068a(boolean z) {
            if (z) {
                KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86755a.f86729d;
                if (keyboardTopExtendComponent != null) {
                    keyboardTopExtendComponent.mo123275f();
                    return;
                }
                return;
            }
            KeyboardTopExtendComponent keyboardTopExtendComponent2 = this.f86755a.f86729d;
            if (keyboardTopExtendComponent2 != null) {
                keyboardTopExtendComponent2.mo123276g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$statusListener$1", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "onHeightChanged", "", "toolBoxHeight", "", "onStateChanged", "isShow", "", "replyMsgId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.b$l */
    public static final class C33684l implements IKeyBoardStatusListener {

        /* renamed from: a */
        final /* synthetic */ MessageListFragment f86756a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33684l(MessageListFragment bVar) {
            this.f86756a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122008a(int i) {
            KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86756a.f86729d;
            if (keyboardTopExtendComponent != null) {
                keyboardTopExtendComponent.mo123268a(i);
            }
            MessageListComponent messageListComponent = this.f86756a.f86728c;
            if (messageListComponent != null) {
                messageListComponent.mo123340H();
            }
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122009a(boolean z, int i, String str) {
            MessageListComponent messageListComponent;
            C33247j<?> i2;
            KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86756a.f86729d;
            if (keyboardTopExtendComponent != null) {
                keyboardTopExtendComponent.mo123268a(i);
            }
            MessageListComponent messageListComponent2 = this.f86756a.f86728c;
            if (messageListComponent2 != null) {
                messageListComponent2.mo123340H();
            }
            if (z && (messageListComponent = this.f86756a.f86728c) != null && (i2 = messageListComponent.mo123325i()) != null) {
                if (TextUtils.isEmpty(str)) {
                    i2.mo122593a(100, false);
                } else {
                    i2.mo122596a(new C33247j.C33250b().mo122605a(new C33255l(str)).mo122604a(80).mo122607a(true).mo122609b(LocationRequest.PRIORITY_INDOOR).mo122608a());
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: a */
    public void mo123551a(int i) {
        MessageListComponent messageListComponent = this.f86728c;
        if (messageListComponent != null) {
            messageListComponent.mo123356e(i);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MessageSender m130498a(MessageListFragment bVar) {
        MessageSender bVar2 = bVar.f86732g;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageSender");
        }
        return bVar2;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: a */
    public void mo123552a(IChatWindowApp.IActivityResultHandler aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handle");
        this.f86733h.add(aVar);
    }

    /* Return type fixed from 'T extends com.ss.android.lark.chat.chatwindow.chat.v2.component.f<? extends com.ss.android.lark.chat.chatwindow.chat.v2.component.g>' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Class<T extends com.ss.android.lark.chat.chatwindow.chat.v2.component.f<? extends com.ss.android.lark.chat.chatwindow.chat.v2.component.g>>] */
    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public <T extends IComponent<? extends IComponentCallbacks>> MessageListFragment mo123550a(Class<MessageListFragment> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        if (Intrinsics.areEqual(cls, IKeyboardComponent.class)) {
            IKeyboardComponent cVar = this.f86727b;
            if (cVar != null) {
                return cVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual(cls, IMessageListComponent.class)) {
            MessageListComponent messageListComponent = this.f86728c;
            if (messageListComponent != null) {
                return messageListComponent;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (!Intrinsics.areEqual(cls, IKeyboardTopExtendComponent.class)) {
            return null;
        } else {
            KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86729d;
            if (keyboardTopExtendComponent != null) {
                return keyboardTopExtendComponent;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: a */
    public void mo123553a(IChatWindowApp.IShowSmartReplyHandler dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "handle");
        this.f86730e.add(dVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public boolean mo123557a(KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        return IMessageListChatWindow.C33670a.m130497a(this, keyEvent);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.TabLazyLoadFragment
    /* renamed from: a */
    public View mo123584a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_window_message_list, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…        container, false)");
        ButterKnife.bind(this, inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (mo123605b() != null) {
            m130499r();
            m130500s();
            m130501t();
            IChatTabPageSpec.ContentViewCreatedCallback a = mo123601a();
            if (a != null) {
                a.mo123178a();
                return;
            }
            return;
        }
        throw new IllegalStateException("fatal: message list fragment dependency is null");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<IChatWindowApp.IActivityResultHandler> it = this.f86733h.iterator();
        while (it.hasNext()) {
            if (it.next().mo123194a(i, i2, intent)) {
                return;
            }
        }
        List<? extends ChatWindowObserver> list = this.f86738m;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().mo106795a(i, i2, intent)) {
                    return;
                }
            }
        }
        Widget widget = (Widget) this.f86727b;
        if (widget != null) {
            widget.onActivityResult(i, i2, intent);
        }
        MessageListComponent messageListComponent = this.f86728c;
        if (messageListComponent != null) {
            messageListComponent.onActivityResult(i, i2, intent);
        }
    }
}
