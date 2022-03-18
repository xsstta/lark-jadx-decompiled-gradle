package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space;

import android.content.Intent;
import android.view.KeyEvent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.space.SpaceFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.space.tab.entity.DocTabPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00019B+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J/\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\u0010\b\u0000\u0010\u001c*\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001c0 H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\u0007H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\b\u0010*\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u0018H\u0016J\b\u00104\u001a\u00020\u0018H\u0016J\b\u00105\u001a\u00020\u0018H\u0016J\b\u00106\u001a\u00020\u0018H\u0016J\u0012\u00107\u001a\u00020\u00182\b\u00108\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceTabSpec;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;", "tabChatId", "", "chatTab", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "contentViewCreatedCallback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "specDependency", "(Ljava/lang/String;Lcom/ss/android/lark/tab/service/entity/ChatTab;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;)V", "getContentViewCreatedCallback", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;", "setContentViewCreatedCallback", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$ContentViewCreatedCallback;)V", "mFragment", "onTitleStateChangeListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "getSpecDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;", "setSpecDependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceFragment$SpaceDependency;)V", "destroy", "", "getChatTabType", "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "getComponent", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getPageContent", "getTabData", "getTabId", "", "getTabName", "handleBack", "", "loadTabData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onActivityResult", "requestCode", "", "resultCode", "Landroid/content/Intent;", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "onPageDisSelect", "onPageSelect", "onStop", "preloadPage", "setTitleStateChangeListener", "listener", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.d */
public final class SpaceTabSpec implements IChatTabPageSpec<SpaceFragment, SpaceFragment.SpaceDependency> {

    /* renamed from: a */
    public static final Companion f86780a = new Companion(null);

    /* renamed from: b */
    private SpaceFragment f86781b;

    /* renamed from: c */
    private IChatTabPageSpec.OnTitleStateChangeListener f86782c;

    /* renamed from: d */
    private final String f86783d;

    /* renamed from: e */
    private final ChatTab f86784e;

    /* renamed from: f */
    private IChatTabPageSpec.ContentViewCreatedCallback f86785f;

    /* renamed from: g */
    private SpaceFragment.SpaceDependency f86786g;

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public <T extends IComponent<? extends IComponentCallbacks>> T mo123550a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/space/SpaceTabSpec$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.b.d$a */
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
        return this.f86784e;
    }

    /* renamed from: i */
    public IChatTabPageSpec.ContentViewCreatedCallback mo123615i() {
        return this.f86785f;
    }

    /* renamed from: j */
    public SpaceFragment.SpaceDependency mo123616j() {
        return this.f86786g;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec
    /* renamed from: a */
    public long mo123591a() {
        return this.f86784e.getId();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec
    /* renamed from: b */
    public String mo123592b() {
        return this.f86784e.getName();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec
    /* renamed from: f */
    public void mo123596f() {
        SpaceFragment cVar = this.f86781b;
        if (cVar != null) {
            cVar.mo123554a((IChatTabPageSpec.OnTitleStateChangeListener) null);
        }
        SpaceFragment cVar2 = this.f86781b;
        if (cVar2 != null) {
            cVar2.mo123608e();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: h */
    public boolean mo121990h() {
        SpaceFragment cVar = this.f86781b;
        if (cVar != null) {
            return cVar.mo121990h();
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec
    /* renamed from: e */
    public void mo123595e() {
        SpaceFragment cVar = this.f86781b;
        if (cVar != null) {
            cVar.mo123554a(this.f86782c);
        }
        SpaceFragment cVar2 = this.f86781b;
        if (cVar2 != null) {
            cVar2.mo123607d();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    public void onStop() {
        SpaceFragment cVar = this.f86781b;
        if (cVar == null || !cVar.isActive()) {
            Log.m165383e("SpaceTabSpec", "onStop Result to SpaceTab failed for fragment is null or fragment is inActive");
            return;
        }
        SpaceFragment cVar2 = this.f86781b;
        if (cVar2 != null) {
            cVar2.onStop();
        }
    }

    /* renamed from: g */
    public SpaceFragment mo123593c() {
        if (this.f86781b == null) {
            SpaceFragment cVar = new SpaceFragment();
            cVar.mo123603a(mo123615i());
            cVar.mo123602a(mo123616j());
            cVar.mo123604a(this.f86783d);
            this.f86781b = cVar;
            mo123613a(this.f86784e.getPayloadString());
        }
        SpaceFragment cVar2 = this.f86781b;
        if (cVar2 == null) {
            Intrinsics.throwNpe();
        }
        return cVar2;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.ISubChatWindow
    /* renamed from: a */
    public void mo123554a(IChatTabPageSpec.OnTitleStateChangeListener dVar) {
        this.f86782c = dVar;
    }

    /* renamed from: a */
    public void mo123613a(String str) {
        String str2;
        if (str != null) {
            DocTabPayload a = DocTabPayload.Companion.mo188718a(str);
            SpaceFragment cVar = this.f86781b;
            if (cVar != null) {
                if (a != null) {
                    str2 = a.getUrl();
                } else {
                    str2 = null;
                }
                cVar.mo123610b(str2);
            }
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
        SpaceFragment cVar = this.f86781b;
        if (cVar == null || !cVar.isActive()) {
            Log.m165383e("SpaceTabSpec", "onActivity Result to SpaceTab failed for fragment is null or fragment is inActive");
            return;
        }
        SpaceFragment cVar2 = this.f86781b;
        if (cVar2 != null) {
            cVar2.onActivityResult(i, i2, intent);
        }
    }

    public SpaceTabSpec(String str, ChatTab chatTab, IChatTabPageSpec.ContentViewCreatedCallback aVar, SpaceFragment.SpaceDependency bVar) {
        Intrinsics.checkParameterIsNotNull(chatTab, "chatTab");
        this.f86783d = str;
        this.f86784e = chatTab;
        this.f86785f = aVar;
        this.f86786g = bVar;
    }
}
