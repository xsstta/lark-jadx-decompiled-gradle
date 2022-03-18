package com.ss.android.lark.threadwindow.p2760a;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.response.C34021b;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34427a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.threadwindow.p2760a.p2763c.C56029a;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.a.d */
public class C56030d extends AbstractC34427a<ThreadInfo, C56029a> {

    /* renamed from: f */
    private final AbstractC34230k f138546f = C32881i.m126556a();

    /* renamed from: g */
    private final Chat f138547g;

    /* renamed from: h */
    private AbstractC56031a f138548h;

    /* renamed from: com.ss.android.lark.threadwindow.a.d$a */
    public interface AbstractC56031a {
        /* renamed from: a */
        void mo191070a();

        /* renamed from: a */
        void mo191071a(boolean z);
    }

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
        return "thread_chat";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: e */
    public String mo122915e() {
        return "ThreadFirstScreenLoader";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: c */
    public void mo122913c() {
        int i;
        if (C34339g.m133171e(this.f138547g) == Chat.MessagePosition.NEWEST_UNREAD) {
            i = this.f138547g.getReadThreadPosition();
        } else {
            i = this.f138547g.getLastThreadPosition();
        }
        if (!mo127137a(i)) {
            m217975b(i);
        }
    }

    /* renamed from: a */
    public void mo191069a(AbstractC56031a aVar) {
        this.f138548h = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m217977c(int i) {
        this.f138546f.mo121346a(this.f138547g.getId(), MessageFetchScene.SPECIFIED_POSITION, i, 15, 5, ChannelDataFetcherStrategy.SYNC_SERVER_DATA, 0, false, false);
    }

    /* renamed from: b */
    private void m217975b(int i) {
        Log.m165389i("ThreadFirstScreenLoader", "preLoadMessage: position:" + i);
        this.f88893d.execute(new Runnable(i) {
            /* class com.ss.android.lark.threadwindow.p2760a.$$Lambda$d$Pe03lZQw02WM82jxdIi8ikwQfA */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C56030d.m271031lambda$Pe03lZQw02WM82jxdIi8ikwQfA(C56030d.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: a */
    public void mo122910a(List<Integer> list, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f88893d.execute(new Runnable(list, iGetDataCallback) {
            /* class com.ss.android.lark.threadwindow.p2760a.$$Lambda$d$aIjDqC6NtOeYl5o_WjdUyFAC7g */
            public final /* synthetic */ List f$1;
            public final /* synthetic */ IGetDataCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C56030d.m271032lambda$aIjDqC6NtOeYl5o_WjdUyFAC7g(C56030d.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m217976b(List list, IGetDataCallback iGetDataCallback) {
        boolean z;
        C34021b a = this.f138546f.mo121347a(this.f138547g.getId(), list);
        if (a == null || !CollectionUtils.isNotEmpty(a.f87914a)) {
            MessageHitPoint.f135779d.mo187535a("thread_chat", true, false, false, false);
        } else {
            this.f88891b.mo122936a((C33952a) new C56029a(a.f87914a, a.f87915b, a.f87916c));
        }
        if (iGetDataCallback != null) {
            if (a != null) {
                z = true;
            } else {
                z = false;
            }
            iGetDataCallback.onSuccess(Boolean.valueOf(z));
        }
        AbstractC56031a aVar = this.f138548h;
        if (aVar != null) {
            aVar.mo191070a();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.chat.core.model.a, com.ss.android.lark.chat.core.model.i, java.util.List, com.larksuite.framework.callback.IGetDataCallback] */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo127136a(C56029a aVar, AbstractC33964i<ThreadInfo> iVar, List list, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback) {
        mo191068a(aVar, iVar, (List<Integer>) list, iGetDataCallback);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo191068a(C56029a aVar, AbstractC33964i<ThreadInfo> iVar, List<Integer> list, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback) {
        if (this.f138548h != null) {
            this.f138548h.mo191071a(CollectionUtils.isNotEmpty(list));
        }
        super.mo127136a((C33952a) aVar, (AbstractC33964i) iVar, list, (IGetDataCallback) iGetDataCallback);
    }

    public C56030d(AbstractC33953b<ThreadInfo, C56029a> bVar, AbstractC34417b<ThreadInfo, C56029a> bVar2, C33958d dVar, C33958d dVar2, CallbackManager callbackManager, Chat chat) {
        super(bVar, bVar2, dVar, dVar2, callbackManager);
        this.f138547g = chat;
    }
}
