package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.contact.v2.PushContactApplicationBannerAffectEvent;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.listener.IPushAddFriendListener;
import com.ss.android.lark.p2392o.AbstractC48700g;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0006\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0010\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatOneWayContactPushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatOneWayContactPushHandler$OneWayContactPush;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatOneWayContactPushHandler$OneWayContactPush;)V", "addFriendListener", "com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatOneWayContactPushHandler$addFriendListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatOneWayContactPushHandler$addFriendListener$1;", "externalPushListener", "Lcom/ss/android/lark/listener/IPushContactStateListener;", "refs", "Ljava/lang/ref/WeakReference;", "register", "", "unRegister", "OneWayContactPush", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.f */
public final class ChatOneWayContactPushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public final WeakReference<OneWayContactPush> f86225a;

    /* renamed from: b */
    private C33449b f86226b = new C33449b(this);

    /* renamed from: c */
    private AbstractC48700g f86227c = new C33450c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatOneWayContactPushHandler$OneWayContactPush;", "", "onPushAddFriend", "", BottomDialog.f17198f, "", "onPushExternalContact", "event", "Lcom/bytedance/lark/pb/contact/v2/PushContactApplicationBannerAffectEvent;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.f$a */
    public interface OneWayContactPush {
        /* renamed from: a */
        void mo123081a(PushContactApplicationBannerAffectEvent pushContactApplicationBannerAffectEvent);

        /* renamed from: a */
        void mo123082a(String str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134523V().mo134439a(this.f86226b);
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        b2.mo134584l().mo134444a(this.f86227c);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134523V().mo134441b(this.f86226b);
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        b2.mo134584l().mo134451b(this.f86227c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatOneWayContactPushHandler$addFriendListener$1", "Lcom/ss/android/lark/listener/IPushAddFriendListener;", "onPushAddFriend", "", BottomDialog.f17198f, "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.f$b */
    public static final class C33449b implements IPushAddFriendListener {

        /* renamed from: a */
        final /* synthetic */ ChatOneWayContactPushHandler f86228a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33449b(ChatOneWayContactPushHandler fVar) {
            this.f86228a = fVar;
        }

        @Override // com.ss.android.lark.listener.IPushAddFriendListener
        /* renamed from: a */
        public void mo123083a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            OneWayContactPush aVar = this.f86228a.f86225a.get();
            if (aVar != null) {
                aVar.mo123082a(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "contactState", "Lcom/bytedance/lark/pb/contact/v2/PushContactApplicationBannerAffectEvent;", "kotlin.jvm.PlatformType", "onPushContactStateChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.f$c */
    static final class C33450c implements AbstractC48700g {

        /* renamed from: a */
        final /* synthetic */ ChatOneWayContactPushHandler f86229a;

        C33450c(ChatOneWayContactPushHandler fVar) {
            this.f86229a = fVar;
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48700g
        /* renamed from: a */
        public final void mo123084a(PushContactApplicationBannerAffectEvent pushContactApplicationBannerAffectEvent) {
            OneWayContactPush aVar = this.f86229a.f86225a.get();
            if (aVar != null) {
                aVar.mo123081a(pushContactApplicationBannerAffectEvent);
            }
        }
    }

    public ChatOneWayContactPushHandler(OneWayContactPush aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f86225a = new WeakReference<>(aVar);
    }
}
