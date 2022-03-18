package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.filter.MessageTypeFilter;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.StickerStatusUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.p2392o.AbstractC48706p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatStickerPushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "streamProvider", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/IStreamProvider;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/IStreamProvider;)V", "mPushStickerListener", "Lcom/ss/android/lark/listener/IStickerUpdateListener;", "register", "", "unRegister", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.k */
public final class ChatStickerPushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public final IStreamProvider f86250a;

    /* renamed from: b */
    private AbstractC48706p f86251b = new C33461a(this);

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134584l().mo134449a(this.f86251b);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134584l().mo134456b(this.f86251b);
    }

    public ChatStickerPushHandler(IStreamProvider nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "streamProvider");
        this.f86250a = nVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "stickerKeys", "", "", "kotlin.jvm.PlatformType", "", "onUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.k$a */
    static final class C33461a implements AbstractC48706p {

        /* renamed from: a */
        final /* synthetic */ ChatStickerPushHandler f86252a;

        C33461a(ChatStickerPushHandler kVar) {
            this.f86252a = kVar;
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48706p
        /* renamed from: a */
        public final void mo123108a(List<String> list) {
            if (list != null) {
                this.f86252a.f86250a.stream().mo127143a(new MessageTypeFilter(Message.Type.STICKER)).mo127146b(new StickerStatusUpdater(list));
            }
        }
    }
}
