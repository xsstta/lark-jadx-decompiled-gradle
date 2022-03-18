package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist;

import android.content.Intent;
import android.view.KeyEvent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.MessageListFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tab.service.entity.ChatTab;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001FB+\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J/\u0010!\u001a\u0004\u0018\u0001H\"\"\u0010\b\u0000\u0010\"*\n\u0012\u0006\b\u0001\u0012\u00020$0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\"0&H\u0016¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016J\b\u0010/\u001a\u000200H\u0016J\"\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020\u0019H\u0016J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u000203H\u0016J\u0010\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u0019H\u0016J\b\u0010>\u001a\u00020\u0019H\u0016J\b\u0010?\u001a\u00020\u0019H\u0016J\b\u0010@\u001a\u00020\u0019H\u0016J\u0010\u0010A\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010B\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001dH\u0016J\b\u0010C\u001a\u00020\u0019H\u0016J\u0012\u0010D\u001a\u00020\u00192\b\u0010E\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListTabSpec;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$MessageListDependency;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/IMessageListChatWindow;", "tabChatId", "", "chatTab", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "contentViewCreatedCallback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "specDependency", "(Ljava/lang/String;Lcom/ss/android/lark/tab/service/entity/ChatTab;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$MessageListDependency;)V", "getContentViewCreatedCallback", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "setContentViewCreatedCallback", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;)V", "mFragment", "onTitleStateChangeListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "getSpecDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$MessageListDependency;", "setSpecDependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListFragment$MessageListDependency;)V", "addActivityResultHandler", "", "handle", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IActivityResultHandler;", "addShowSmartReplyHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IShowSmartReplyHandler;", "destroy", "getChatTabType", "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "getComponent", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "getPageContent", "getTabData", "getTabId", "", "getTabName", "handleBack", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBannerHide", "onBannerShow", "bannerHeight", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "onPageDisSelect", "onPageSelect", "onStop", "preloadPage", "removeActivityResultHandler", "removeShowSmartReplyHandler", "replaceComponentForSecret", "setTitleStateChangeListener", "listener", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.c */
public final class MessageListTabSpec implements IMessageListChatWindow, IChatTabPageSpec<MessageListFragment, MessageListFragment.MessageListDependency> {

    /* renamed from: a */
    public static final Companion f86757a = new Companion(null);

    /* renamed from: b */
    private MessageListFragment f86758b;

    /* renamed from: c */
    private IChatTabPageSpec.OnTitleStateChangeListener f86759c;

    /* renamed from: d */
    private final String f86760d;

    /* renamed from: e */
    private final ChatTab f86761e;

    /* renamed from: f */
    private IChatTabPageSpec.ContentViewCreatedCallback f86762f;

    /* renamed from: g */
    private MessageListFragment.MessageListDependency f86763g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/messagelist/MessageListTabSpec$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec
    /* renamed from: d */
    public ChatTab mo123594d() {
        return this.f86761e;
    }

    /* renamed from: i */
    public IChatTabPageSpec.ContentViewCreatedCallback mo123598i() {
        return this.f86762f;
    }

    /* renamed from: m */
    public MessageListFragment.MessageListDependency mo123599m() {
        return this.f86763g;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec
    /* renamed from: a */
    public long mo123591a() {
        return this.f86761e.getId();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec
    /* renamed from: b */
    public String mo123592b() {
        return this.f86761e.getName();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: j */
    public void mo123562j() {
        MessageListFragment bVar = this.f86758b;
        if (bVar != null) {
            bVar.mo123562j();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: l */
    public void mo123564l() {
        MessageListFragment bVar = this.f86758b;
        if (bVar != null) {
            bVar.mo123564l();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec
    /* renamed from: f */
    public void mo123596f() {
        MessageListFragment bVar = this.f86758b;
        if (bVar != null) {
            bVar.mo123554a((IChatTabPageSpec.OnTitleStateChangeListener) null);
        }
        MessageListFragment bVar2 = this.f86758b;
        if (bVar2 != null) {
            bVar2.mo123607d();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: h */
    public boolean mo121990h() {
        MessageListFragment bVar = this.f86758b;
        if (bVar != null) {
            return bVar.mo121990h();
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: k */
    public IMessageSender mo123563k() {
        return mo123593c().mo123563k();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec
    /* renamed from: e */
    public void mo123595e() {
        MessageListFragment bVar = this.f86758b;
        if (bVar != null) {
            bVar.mo123554a(this.f86759c);
        }
        MessageListFragment bVar2 = this.f86758b;
        if (bVar2 != null) {
            bVar2.mo123607d();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    public void onStop() {
        MessageListFragment bVar = this.f86758b;
        if (bVar == null || !bVar.isActive()) {
            Log.m165383e("MessageListTabSpec", "onStop Result to MessageList failed for fragment is null or fragment is inActive");
            return;
        }
        MessageListFragment bVar2 = this.f86758b;
        if (bVar2 != null) {
            bVar2.onStop();
        }
    }

    /* renamed from: g */
    public MessageListFragment mo123593c() {
        if (this.f86758b == null) {
            MessageListFragment bVar = new MessageListFragment();
            bVar.mo123603a(mo123598i());
            bVar.mo123602a(mo123599m());
            bVar.mo123604a(this.f86760d);
            this.f86758b = bVar;
        }
        MessageListFragment bVar2 = this.f86758b;
        if (bVar2 == null) {
            Intrinsics.throwNpe();
        }
        return bVar2;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public void mo123554a(IChatTabPageSpec.OnTitleStateChangeListener dVar) {
        this.f86759c = dVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public <T extends IComponent<? extends IComponentCallbacks>> T mo123550a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        MessageListFragment bVar = this.f86758b;
        if (bVar != null) {
            return (T) bVar.mo123550a((Class<MessageListFragment>) cls);
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: a */
    public void mo123551a(int i) {
        MessageListFragment bVar = this.f86758b;
        if (bVar != null) {
            bVar.mo123551a(i);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: a */
    public void mo123552a(IChatWindowApp.IActivityResultHandler aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handle");
        MessageListFragment bVar = this.f86758b;
        if (bVar != null) {
            bVar.mo123552a(aVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.messagelist.IMessageListChatWindow
    /* renamed from: a */
    public void mo123553a(IChatWindowApp.IShowSmartReplyHandler dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "handle");
        MessageListFragment bVar = this.f86758b;
        if (bVar != null) {
            bVar.mo123553a(dVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public boolean mo123557a(KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        return IChatTabPageSpec.C33694b.m130660a(this, keyEvent);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    public void onActivityResult(int i, int i2, Intent intent) {
        MessageListFragment bVar = this.f86758b;
        if (bVar == null || !bVar.isActive()) {
            Log.m165383e("MessageListTabSpec", "onActivity Result to MessageList failed for fragment is null or fragment is inActive");
            return;
        }
        MessageListFragment bVar2 = this.f86758b;
        if (bVar2 != null) {
            bVar2.onActivityResult(i, i2, intent);
        }
    }

    public MessageListTabSpec(String str, ChatTab chatTab, IChatTabPageSpec.ContentViewCreatedCallback aVar, MessageListFragment.MessageListDependency aVar2) {
        Intrinsics.checkParameterIsNotNull(chatTab, "chatTab");
        this.f86760d = str;
        this.f86761e = chatTab;
        this.f86762f = aVar;
        this.f86763g = aVar2;
    }
}
