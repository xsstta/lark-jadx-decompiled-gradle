package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.listener.OnBadgeChangeListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatBadgePushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatBadgePushHandler$IBadgeChangeListener;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatBadgePushHandler$IBadgeChangeListener;)V", "badgeChangeListener", "Lcom/ss/android/lark/listener/OnBadgeChangeListener;", "mRefs", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "register", "", "unRegister", "IBadgeChangeListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.b */
public final class ChatBadgePushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public WeakReference<IBadgeChangeListener> f86194a;

    /* renamed from: b */
    private OnBadgeChangeListener f86195b = new C33438b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatBadgePushHandler$IBadgeChangeListener;", "", "onBadgeChange", "", "badge", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.b$a */
    public interface IBadgeChangeListener {
        void onBadgeChange(int i);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134512K().mo134690a(this.f86195b);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134512K().mo134693b(this.f86195b);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatBadgePushHandler$badgeChangeListener$1", "Lcom/ss/android/lark/listener/OnBadgeChangeListener;", "onBadgeChange", "", "badge", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.b$b */
    public static final class C33438b implements OnBadgeChangeListener {

        /* renamed from: a */
        final /* synthetic */ ChatBadgePushHandler f86196a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33438b(ChatBadgePushHandler bVar) {
            this.f86196a = bVar;
        }

        @Override // com.ss.android.lark.listener.OnBadgeChangeListener
        /* renamed from: a */
        public void mo123062a(int i) {
            IBadgeChangeListener aVar = this.f86196a.f86194a.get();
            if (aVar != null) {
                aVar.onBadgeChange(i);
            }
        }
    }

    public ChatBadgePushHandler(IBadgeChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f86194a = new WeakReference<>(aVar);
    }
}
