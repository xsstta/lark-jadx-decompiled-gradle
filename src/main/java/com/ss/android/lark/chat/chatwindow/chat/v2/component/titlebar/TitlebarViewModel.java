package com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatBadgePushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36504r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020\"H\u0014J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0007H\u0016J\u0018\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010,\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0007H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000f¨\u0006."}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatBadgePushHandler$IBadgeChangeListener;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatChatterPushHandler$IChatterPushListener;", "initChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "p2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/chatter/Chatter;)V", "badgeCountLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getBadgeCountLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setBadgeCountLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "badgePushHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatBadgePushHandler;", "chatterPushHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatChatterPushHandler;", "destroyed", "", "getInitChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setInitChat", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "getP2pChatter", "()Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "setP2pChatter", "(Lcom/ss/android/lark/chat/entity/chatter/Chatter;)V", "p2pChatterLiveData", "getP2pChatterLiveData", "setP2pChatterLiveData", "destroy", "", "onBadgeChange", "badge", "onCleared", "onPushUpdatedChatter", "chatter", "onPushUpdatedNickname", BottomDialog.f17198f, "", "nickname", "onUpdateSelfInfo", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.d */
public final class TitlebarViewModel extends AbstractC1142af implements ChatBadgePushHandler.IBadgeChangeListener, ChatChatterPushHandler.IChatterPushListener {
    public static final Companion Companion = new Companion(null);
    private C1177w<Integer> badgeCountLiveData = new C1177w<>();
    private final ChatBadgePushHandler badgePushHandler;
    private final ChatChatterPushHandler chatterPushHandler;
    private boolean destroyed;
    private Chat initChat;
    private Chatter p2pChatter;
    private C1177w<Chatter> p2pChatterLiveData = new C1177w<>();

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler.IChatterPushListener
    public void onPushUpdatedNickname(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "nickname");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler.IChatterPushListener
    public void onUpdateSelfInfo(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarViewModel$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<Integer> getBadgeCountLiveData() {
        return this.badgeCountLiveData;
    }

    public final Chat getInitChat() {
        return this.initChat;
    }

    public final Chatter getP2pChatter() {
        return this.p2pChatter;
    }

    public final C1177w<Chatter> getP2pChatterLiveData() {
        return this.p2pChatterLiveData;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        destroy();
    }

    public final void destroy() {
        if (!this.destroyed) {
            this.badgePushHandler.mo123056b();
            this.chatterPushHandler.mo123056b();
            this.destroyed = true;
        }
    }

    public final void setP2pChatter(Chatter chatter) {
        this.p2pChatter = chatter;
    }

    public final void setBadgeCountLiveData(C1177w<Integer> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.badgeCountLiveData = wVar;
    }

    public final void setInitChat(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "<set-?>");
        this.initChat = chat;
    }

    public final void setP2pChatterLiveData(C1177w<Chatter> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.p2pChatterLiveData = wVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatBadgePushHandler.IBadgeChangeListener
    public void onBadgeChange(int i) {
        this.badgeCountLiveData.mo5926a(Integer.valueOf(i));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler.IChatterPushListener
    public void onPushUpdatedChatter(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Chatter b = this.p2pChatterLiveData.mo5927b();
        if (b != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "p2pChatterLiveData.value ?: return");
            if (this.initChat.isP2PChat() && Intrinsics.areEqual(chatter.getId(), b.getId())) {
                this.p2pChatterLiveData.mo5926a(chatter);
            }
        }
    }

    public TitlebarViewModel(Chat chat, Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chat, "initChat");
        this.initChat = chat;
        this.p2pChatter = chatter;
        ChatBadgePushHandler bVar = new ChatBadgePushHandler(this);
        this.badgePushHandler = bVar;
        String id = this.initChat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "initChat.getId()");
        ChatChatterPushHandler cVar = new ChatChatterPushHandler(id, this);
        this.chatterPushHandler = cVar;
        C1177w<Integer> wVar = this.badgeCountLiveData;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36504r K = b.mo134512K();
        Intrinsics.checkExpressionValueIsNotNull(K, "ChatModuleInstanceHolder…pendency().feedDependency");
        wVar.mo5926a(Integer.valueOf(K.mo134686a()));
        Chatter chatter2 = this.p2pChatter;
        if (chatter2 != null) {
            this.p2pChatterLiveData.mo5926a(chatter2);
        }
        bVar.mo123055a();
        cVar.mo123055a();
    }
}
