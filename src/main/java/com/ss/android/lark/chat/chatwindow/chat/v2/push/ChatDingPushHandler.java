package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.listener.IPushDingConfirmListener;
import com.ss.android.lark.listener.IPushDingListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0004\n\u0002\u0010\fR\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u00050\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "mChatId", "", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler$IDingPushListener;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler$IDingPushListener;)V", "mPushDingConfirmListener", "com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler$mPushDingConfirmListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler$mPushDingConfirmListener$1;", "mPushDingListener", "com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler$mPushDingListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler$mPushDingListener$1;", "mRefs", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "register", "", "unRegister", "IDingPushListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.d */
public final class ChatDingPushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public WeakReference<IDingPushListener> f86205a;

    /* renamed from: b */
    public String f86206b;

    /* renamed from: c */
    private C33443c f86207c = new C33443c(this);

    /* renamed from: d */
    private C33442b f86208d = new C33442b(this);

    /* renamed from: e */
    private final IDingPushListener f86209e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler$IDingPushListener;", "", "onPushDingMessage", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.d$a */
    public interface IDingPushListener {
        void onPushDingMessage(MessageInfo messageInfo);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134584l().mo134446a(this.f86207c);
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        b2.mo134584l().mo134445a(this.f86208d);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134584l().mo134453b(this.f86207c);
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        b2.mo134584l().mo134452b(this.f86208d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler$mPushDingConfirmListener$1", "Lcom/ss/android/lark/listener/IPushDingConfirmListener;", "onPushDingConfirm", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.d$b */
    public static final class C33442b implements IPushDingConfirmListener {

        /* renamed from: a */
        final /* synthetic */ ChatDingPushHandler f86210a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33442b(ChatDingPushHandler dVar) {
            this.f86210a = dVar;
        }

        @Override // com.ss.android.lark.listener.IPushDingConfirmListener
        /* renamed from: a */
        public void mo123068a(MessageInfo messageInfo) {
            IDingPushListener aVar;
            Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            if (Intrinsics.areEqual(message.getChatId(), this.f86210a.f86206b) && (aVar = this.f86210a.f86205a.get()) != null) {
                aVar.onPushDingMessage(messageInfo);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/push/ChatDingPushHandler$mPushDingListener$1", "Lcom/ss/android/lark/listener/IPushDingListener;", "onPushDing", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.d$c */
    public static final class C33443c implements IPushDingListener {

        /* renamed from: a */
        final /* synthetic */ ChatDingPushHandler f86211a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33443c(ChatDingPushHandler dVar) {
            this.f86211a = dVar;
        }

        @Override // com.ss.android.lark.listener.IPushDingListener
        /* renamed from: a */
        public void mo123069a(MessageInfo messageInfo) {
            IDingPushListener aVar;
            Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            if (Intrinsics.areEqual(message.getChatId(), this.f86211a.f86206b) && (aVar = this.f86211a.f86205a.get()) != null) {
                aVar.onPushDingMessage(messageInfo);
            }
        }
    }

    public ChatDingPushHandler(String str, IDingPushListener aVar) {
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f86206b = str;
        this.f86209e = aVar;
        this.f86205a = new WeakReference<>(aVar);
    }
}
