package com.ss.android.lark.chat.service.impl;

import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.ss.android.lark.biz.im.api.AbstractC29626r;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.service.IChatRelationPushSubscriber;
import com.ss.android.lark.chat.service.IPushChatRelationListener;
import com.ss.android.lark.chat.service.impl.C34186c;
import com.ss.android.lark.log.Log;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f*\u0001\u001c\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001f2\u0006\u0010'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002J\b\u0010,\u001a\u00020%H\u0002J\u0010\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001fH\u0002J\u0012\u0010.\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061"}, d2 = {"Lcom/ss/android/lark/chat/service/impl/ChatRelationPushSubscriber;", "Lcom/ss/android/lark/chat/service/IChatRelationPushSubscriber;", "()V", "mPushChatAddUsersListener", "Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatAddUsersListener;", "getMPushChatAddUsersListener", "()Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatAddUsersListener;", "setMPushChatAddUsersListener", "(Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatAddUsersListener;)V", "mPushChatListener", "Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatListener;", "getMPushChatListener", "()Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatListener;", "setMPushChatListener", "(Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatListener;)V", "mPushChatRelationListener", "Lcom/ss/android/lark/chat/service/IPushChatRelationListener;", "getMPushChatRelationListener", "()Lcom/ss/android/lark/chat/service/IPushChatRelationListener;", "setMPushChatRelationListener", "(Lcom/ss/android/lark/chat/service/IPushChatRelationListener;)V", "mPushChatRemoveUsersListener", "Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatRemoveUsersListener;", "getMPushChatRemoveUsersListener", "()Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatRemoveUsersListener;", "setMPushChatRemoveUsersListener", "(Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatRemoveUsersListener;)V", "mPushMessageListener", "com/ss/android/lark/chat/service/impl/ChatRelationPushSubscriber$mPushMessageListener$1", "Lcom/ss/android/lark/chat/service/impl/ChatRelationPushSubscriber$mPushMessageListener$1;", "mSubscribedChatId", "", "getMSubscribedChatId", "()Ljava/lang/String;", "setMSubscribedChatId", "(Ljava/lang/String;)V", "registerPush", "", "chatId", "listener", "registerPushAddChatChatter", "registerPushChat", "registerPushMessage", "registerPushOfflineChat", "registerPushRemoveChatChatter", "subscribeChat", "unRegisterPush", "unSubscribeChat", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.service.impl.d */
public final class ChatRelationPushSubscriber implements IChatRelationPushSubscriber {

    /* renamed from: a */
    public static final Companion f88488a = new Companion(null);

    /* renamed from: b */
    private String f88489b;

    /* renamed from: c */
    private IPushChatRelationListener f88490c;

    /* renamed from: d */
    private final C34202e f88491d = new C34202e(this);

    /* renamed from: e */
    private C34186c.AbstractC34196c f88492e = new C34200c(this);

    /* renamed from: f */
    private C34186c.AbstractC34197d f88493f = new C34201d(this);

    /* renamed from: g */
    private C34186c.AbstractC34195b f88494g = new C34199b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/service/impl/ChatRelationPushSubscriber$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final IPushChatRelationListener mo126750a() {
        return this.f88490c;
    }

    /* renamed from: b */
    private final void m132744b() {
        C34186c.m132703a().mo126731b(this.f88494g);
        C34186c.m132703a().mo126725a(this.f88494g);
    }

    /* renamed from: c */
    private final void m132746c() {
        C34186c.m132703a().mo126733b(this.f88493f);
        C34186c.m132703a().mo126727a(this.f88493f);
    }

    /* renamed from: d */
    private final void m132748d() {
        C34253r.m132890a().mo126805b((AbstractC29626r) this.f88491d);
        C34253r.m132890a().mo126802a((AbstractC29626r) this.f88491d);
    }

    /* renamed from: e */
    private final void m132749e() {
        C34186c.m132703a().mo126732b(this.f88492e);
        C34186c.m132703a().mo126726a(this.f88492e);
    }

    /* renamed from: f */
    private final void m132750f() {
        C34186c.m132703a().mo126738d(this.f88492e);
        C34186c.m132703a().mo126737c(this.f88492e);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/service/impl/ChatRelationPushSubscriber$mPushChatAddUsersListener$1", "Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatAddUsersListener;", "onPushChatAddUsers", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatterMap", "", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.d$b */
    public static final class C34199b implements C34186c.AbstractC34195b {

        /* renamed from: a */
        final /* synthetic */ ChatRelationPushSubscriber f88495a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34199b(ChatRelationPushSubscriber dVar) {
            this.f88495a = dVar;
        }

        @Override // com.ss.android.lark.chat.service.impl.C34186c.AbstractC34195b
        /* renamed from: a */
        public void mo126746a(Chat chat, Map<String, ChatChatter> map) {
            IPushChatRelationListener a;
            if (chat != null && map != null && (a = this.f88495a.mo126750a()) != null) {
                a.mo126576b(chat, map);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/service/impl/ChatRelationPushSubscriber$mPushChatListener$1", "Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatListener;", "onPushChat", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onPushThreadTopic", "threadTopic", "Lcom/ss/android/lark/biz/im/api/ThreadTopic;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.d$c */
    public static final class C34200c implements C34186c.AbstractC34196c {

        /* renamed from: a */
        final /* synthetic */ ChatRelationPushSubscriber f88496a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34200c(ChatRelationPushSubscriber dVar) {
            this.f88496a = dVar;
        }

        @Override // com.ss.android.lark.chat.service.impl.C34186c.AbstractC34196c
        /* renamed from: a */
        public void mo126747a(ThreadTopic threadTopic) {
            IPushChatRelationListener a;
            if (threadTopic != null && (a = this.f88496a.mo126750a()) != null) {
                a.mo126572a(threadTopic);
            }
        }

        @Override // com.ss.android.lark.chat.service.impl.C34186c.AbstractC34196c
        /* renamed from: a */
        public void mo126748a(Chat chat) {
            IPushChatRelationListener a;
            if (chat != null && (a = this.f88496a.mo126750a()) != null) {
                a.mo126574a(chat);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/service/impl/ChatRelationPushSubscriber$mPushChatRemoveUsersListener$1", "Lcom/ss/android/lark/chat/service/impl/ChatPush$IPushChatRemoveUsersListener;", "onPushChatRemoveUsers", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatterMap", "", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.d$d */
    public static final class C34201d implements C34186c.AbstractC34197d {

        /* renamed from: a */
        final /* synthetic */ ChatRelationPushSubscriber f88497a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34201d(ChatRelationPushSubscriber dVar) {
            this.f88497a = dVar;
        }

        @Override // com.ss.android.lark.chat.service.impl.C34186c.AbstractC34197d
        /* renamed from: a */
        public void mo126749a(Chat chat, Map<String, ChatChatter> map) {
            IPushChatRelationListener a;
            if (chat != null && map != null && (a = this.f88497a.mo126750a()) != null) {
                a.mo126575a(chat, map);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chat/service/impl/ChatRelationPushSubscriber$mPushMessageListener$1", "Lcom/ss/android/lark/biz/im/api/IPushMessageListener;", "onPushMessage", "", "pushMessageDTO", "Lcom/ss/android/lark/biz/im/api/PushMessageDTO;", "onPushReactionMessage", "reactions", "Lcom/bytedance/lark/pb/im/v1/PushMessageReactions;", "onPushReadStateMessage", "readStates", "Lcom/bytedance/lark/pb/im/v1/PushMessageReadStates;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.impl.d$e */
    public static final class C34202e implements AbstractC29626r {

        /* renamed from: a */
        final /* synthetic */ ChatRelationPushSubscriber f88498a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34202e(ChatRelationPushSubscriber dVar) {
            this.f88498a = dVar;
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29626r
        /* renamed from: a */
        public void mo106748a(PushMessageReactions pushMessageReactions) {
            Intrinsics.checkParameterIsNotNull(pushMessageReactions, "reactions");
            IPushChatRelationListener a = this.f88498a.mo126750a();
            if (a != null) {
                a.mo126570a(pushMessageReactions);
            }
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29626r
        /* renamed from: a */
        public void mo106749a(PushMessageReadStates pushMessageReadStates) {
            Intrinsics.checkParameterIsNotNull(pushMessageReadStates, "readStates");
            IPushChatRelationListener a = this.f88498a.mo126750a();
            if (a != null) {
                a.mo126571a(pushMessageReadStates);
            }
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29626r
        /* renamed from: a */
        public void mo106750a(C29598aa aaVar) {
            Intrinsics.checkParameterIsNotNull(aaVar, "pushMessageDTO");
            IPushChatRelationListener a = this.f88498a.mo126750a();
            if (a != null) {
                a.mo126573a(aaVar);
            }
        }
    }

    @Override // com.ss.android.lark.chat.service.IChatRelationPushSubscriber
    /* renamed from: a */
    public void mo126541a(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            m132747c(str);
        }
        C34186c.m132703a().mo126732b(this.f88492e);
        C34186c.m132703a().mo126738d(this.f88492e);
        C34253r.m132890a().mo126805b((AbstractC29626r) this.f88491d);
        C34186c.m132703a().mo126733b(this.f88493f);
        C34186c.m132703a().mo126731b(this.f88494g);
    }

    /* renamed from: b */
    private final void m132745b(String str) {
        Log.m165389i("ChatRelationPushSubscriber", "subscribeChat old chat id: " + this.f88489b + " new chat id: " + str);
        if (TextUtils.isEmpty(this.f88489b) || !Intrinsics.areEqual(this.f88489b, str)) {
            if (!TextUtils.isEmpty(this.f88489b) && (!Intrinsics.areEqual(this.f88489b, str))) {
                C34203e.m132761a().mo126752b(this.f88489b);
            }
            if (!TextUtils.isEmpty(str)) {
                C34203e.m132761a().mo126751a(str);
                this.f88489b = str;
            }
        }
    }

    /* renamed from: c */
    private final void m132747c(String str) {
        Log.m165389i("ChatRelationPushSubscriber", "unSubscribeChat cur chat id: " + this.f88489b + " new unSubscribeC hat id: " + str);
        if (TextUtils.isEmpty(this.f88489b) || !Intrinsics.areEqual(this.f88489b, str)) {
            Log.m165383e("ChatRelationPushSubscriber", "unSubscribeChat : mSubscribedChatId = " + this.f88489b + " and getChatId = " + str);
            return;
        }
        C34203e.m132761a().mo126752b(this.f88489b);
        this.f88489b = null;
    }

    @Override // com.ss.android.lark.chat.service.IChatRelationPushSubscriber
    /* renamed from: a */
    public void mo126542a(String str, IPushChatRelationListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "listener");
        if (str != null && !TextUtils.isEmpty(str)) {
            m132745b(str);
        }
        this.f88490c = hVar;
        m132749e();
        m132750f();
        m132748d();
        m132746c();
        m132744b();
    }
}
