package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.p2392o.AbstractC48697c;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00050\u00050\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatSettingPushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "mChatId", "", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatSettingPushHandler$ISettingPushListener;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatSettingPushHandler$ISettingPushListener;)V", "mChatSettingChangeListener", "com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatSettingPushHandler$mChatSettingChangeListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatSettingPushHandler$mChatSettingChangeListener$1;", "mRefs", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "register", "", "unRegister", "ISettingPushListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.j */
public final class ChatSettingPushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public WeakReference<ISettingPushListener> f86246a;

    /* renamed from: b */
    public String f86247b;

    /* renamed from: c */
    private final C33460b f86248c = new C33460b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatSettingPushHandler$ISettingPushListener;", "", "onQuitGroup", "", "byMySelf", "", "onSendChatAnnouncement", "content", "", "updateDissolveGroupLocalFlag", "localFlag", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.j$a */
    public interface ISettingPushListener {
        void onQuitGroup(boolean z);

        void onSendChatAnnouncement(String str);

        void updateDissolveGroupLocalFlag(boolean z);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134595w().mo134359a(this.f86248c);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134595w().mo134362b(this.f86248c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatSettingPushHandler$mChatSettingChangeListener$1", "Lcom/ss/android/lark/listener/IChatSettingChangeListener;", "onChatAnnouncementChanged", "", "announcement", "Lcom/ss/android/lark/chat/entity/chat/ChatAnnouncement;", "onDissolveGroupByLocal", "chatId", "", "localFlag", "", "onQuitGroup", "byMySelf", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.j$b */
    public static final class C33460b implements AbstractC48697c {

        /* renamed from: a */
        final /* synthetic */ ChatSettingPushHandler f86249a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33460b(ChatSettingPushHandler jVar) {
            this.f86249a = jVar;
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48697c
        /* renamed from: a */
        public void mo123105a(ChatAnnouncement chatAnnouncement) {
            ISettingPushListener aVar;
            if (chatAnnouncement != null && Intrinsics.areEqual(this.f86249a.f86247b, chatAnnouncement.getChatId()) && (aVar = this.f86249a.f86246a.get()) != null) {
                String content = chatAnnouncement.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "announcement.content");
                aVar.onSendChatAnnouncement(content);
            }
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48697c
        /* renamed from: a */
        public void mo123106a(String str, boolean z) {
            ISettingPushListener aVar;
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            if (Intrinsics.areEqual(this.f86249a.f86247b, str) && (aVar = this.f86249a.f86246a.get()) != null) {
                aVar.updateDissolveGroupLocalFlag(z);
            }
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48697c
        /* renamed from: b */
        public void mo123107b(String str, boolean z) {
            ISettingPushListener aVar;
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            if (Intrinsics.areEqual(this.f86249a.f86247b, str) && (aVar = this.f86249a.f86246a.get()) != null) {
                aVar.onQuitGroup(z);
            }
        }
    }

    public ChatSettingPushHandler(String str, ISettingPushListener aVar) {
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f86247b = str;
        this.f86246a = new WeakReference<>(aVar);
    }
}
