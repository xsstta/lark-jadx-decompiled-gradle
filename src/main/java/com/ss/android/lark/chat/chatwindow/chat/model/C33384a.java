package com.ss.android.lark.chat.chatwindow.chat.model;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.AbstractExecutorC33962g;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.core.model.entity.ChatMessageResponse;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34427a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.a */
public class C33384a extends AbstractC34427a<MessageInfo, ChatPageData> {

    /* renamed from: f */
    private final IInnerMessageService f86003f = C32848e.m126401b();

    /* renamed from: g */
    private final Chat f86004g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: a */
    public boolean mo122911a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: b */
    public boolean mo122912b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: d */
    public String mo122914d() {
        return "normal_chat";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: e */
    public String mo122915e() {
        return "ChatFirstScreenLoader";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: c */
    public void mo122913c() {
        int i;
        if (C34339g.m133171e(this.f86004g) == Chat.MessagePosition.NEWEST_UNREAD) {
            i = this.f86004g.getReadPosition() + 1;
        } else {
            i = this.f86004g.getLastMessagePosition();
        }
        if (!mo127137a(i)) {
            m129347b(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m129349c(int i) {
        this.f86003f.mo121079a(this.f86004g.getId(), MessageFetchScene.SPECIFIED_POSITION, i, 15, 5, 0, false, ChannelDataFetcherStrategy.SYNC_SERVER_DATA, "");
    }

    /* renamed from: b */
    private void m129347b(int i) {
        Log.m165389i("ChatFirstScreenLoader", "preLoadMessage: position:" + i);
        this.f88893d.execute(new Runnable(i) {
            /* class com.ss.android.lark.chat.chatwindow.chat.model.$$Lambda$a$onrkxxR6gRGxUylrfQ3vZmKk3Q */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C33384a.m270390lambda$onrkxxR6gRGxUylrfQ3vZmKk3Q(C33384a.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: a */
    public void mo122910a(List<Integer> list, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f88893d.execute(new Runnable(list, iGetDataCallback) {
            /* class com.ss.android.lark.chat.chatwindow.chat.model.$$Lambda$a$GmP17fDLZlZLunCzag5QYElhm48 */
            public final /* synthetic */ List f$1;
            public final /* synthetic */ IGetDataCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C33384a.lambda$GmP17fDLZlZLunCzag5QYElhm48(C33384a.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m129348b(List list, IGetDataCallback iGetDataCallback) {
        ChatMessageResponse chatMessageResponse;
        int i;
        Log.m165389i("ChatFirstScreenLoader", "loadMissingMessage:" + list);
        if (this.f86004g.isSecret()) {
            chatMessageResponse = this.f86003f.mo121079a(this.f86004g.getId(), MessageFetchScene.FIRST_SCREEN, 0, 15, 0, 30, true, ChannelDataFetcherStrategy.SYNC_SERVER_DATA, C53234a.m205877a());
        } else {
            chatMessageResponse = this.f86003f.mo121247a(this.f86004g.getId(), list);
        }
        boolean z = false;
        if (chatMessageResponse != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("loadMissingMessage, messageListSize is:");
            if (CollectionUtils.isEmpty(chatMessageResponse.messageInfoList)) {
                i = 0;
            } else {
                i = chatMessageResponse.messageInfoList.size();
            }
            sb.append(i);
            sb.append(", invisible position:");
            sb.append(chatMessageResponse.invisiblePositions);
            Log.m165389i("ChatFirstScreenLoader", sb.toString());
            this.f88891b.mo122936a((C33952a) new ChatPageData(chatMessageResponse.messageInfoList, chatMessageResponse.invisiblePositions, chatMessageResponse.missingPositions, chatMessageResponse.messagesSyncPipeFinished));
        } else {
            MessageHitPoint.f135779d.mo187535a("normal_chat", true, false, false, false);
            Log.m165389i("ChatFirstScreenLoader", "Failed to load missing msg");
        }
        if (iGetDataCallback != null) {
            if (chatMessageResponse != null) {
                z = true;
            }
            iGetDataCallback.onSuccess(Boolean.valueOf(z));
        }
    }

    public C33384a(AbstractC33953b<MessageInfo, ChatPageData> bVar, AbstractC34417b<MessageInfo, ChatPageData> bVar2, AbstractExecutorC33962g gVar, AbstractExecutorC33962g gVar2, CallbackManager callbackManager, Chat chat) {
        super(bVar, bVar2, gVar, gVar2, callbackManager);
        this.f86004g = chat;
    }
}
