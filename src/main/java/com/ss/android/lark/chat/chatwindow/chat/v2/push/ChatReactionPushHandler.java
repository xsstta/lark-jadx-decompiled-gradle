package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.service.impl.C34291z;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatReactionPushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "()V", "mPushReactionOrderListener", "Lcom/ss/android/lark/chat/service/impl/ReactionPush$IPushReactionOrderListener;", "register", "", "unRegister", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.h */
public final class ChatReactionPushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    private final C34291z.AbstractC34294b f86235a = C33453a.f86236a;

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        C34291z.m132976a().mo126838a(this.f86235a);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        C34291z.m132976a().mo126839b(this.f86235a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "reactionOrderList", "", "", "kotlin.jvm.PlatformType", "", "onPushReactions"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.h$a */
    static final class C33453a implements C34291z.AbstractC34294b {

        /* renamed from: a */
        public static final C33453a f86236a = new C33453a();

        C33453a() {
        }

        @Override // com.ss.android.lark.chat.service.impl.C34291z.AbstractC34294b
        /* renamed from: a */
        public final void mo123087a(List<String> list) {
            C35234b.m137579e().mo129693a(list);
        }
    }
}
