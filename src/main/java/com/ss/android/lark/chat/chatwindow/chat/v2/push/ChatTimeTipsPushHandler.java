package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.entity.timetip.PushChatTimeTipNotify;
import com.ss.android.lark.chat.service.impl.C34186c;
import com.ss.android.lark.p2392o.AbstractC48699f;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTimeTipsPushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTimeTipsPushHandler$ITimeTipsPushListener;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTimeTipsPushHandler$ITimeTipsPushListener;)V", "mPushChatTimeTipNotifyListener", "Lcom/ss/android/lark/listener/IPushChatTimeTipNotifyListener;", "mRefs", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "register", "", "unRegister", "ITimeTipsPushListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.l */
public final class ChatTimeTipsPushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public WeakReference<ITimeTipsPushListener> f86253a;

    /* renamed from: b */
    private final AbstractC48699f f86254b = new C33462b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTimeTipsPushHandler$ITimeTipsPushListener;", "", "onPushChatTimeTipNotice", "", "timeTipNotify", "Lcom/ss/android/lark/chat/entity/timetip/PushChatTimeTipNotify;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.l$a */
    public interface ITimeTipsPushListener {
        /* renamed from: a */
        void mo123109a(PushChatTimeTipNotify pushChatTimeTipNotify);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        C34186c.m132703a().mo126729a(this.f86254b);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        C34186c.m132703a().mo126735b(this.f86254b);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chatTimeTipNotify", "Lcom/ss/android/lark/chat/entity/timetip/PushChatTimeTipNotify;", "kotlin.jvm.PlatformType", "onPushChatTimeTipNotify"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.l$b */
    static final class C33462b implements AbstractC48699f {

        /* renamed from: a */
        final /* synthetic */ ChatTimeTipsPushHandler f86255a;

        C33462b(ChatTimeTipsPushHandler lVar) {
            this.f86255a = lVar;
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48699f
        /* renamed from: a */
        public final void mo123110a(PushChatTimeTipNotify pushChatTimeTipNotify) {
            ITimeTipsPushListener aVar = this.f86255a.f86253a.get();
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(pushChatTimeTipNotify, "chatTimeTipNotify");
                aVar.mo123109a(pushChatTimeTipNotify);
            }
        }
    }

    public ChatTimeTipsPushHandler(ITimeTipsPushListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f86253a = new WeakReference<>(aVar);
    }
}
