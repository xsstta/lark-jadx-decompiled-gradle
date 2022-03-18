package com.ss.android.lark.threaddetail.p2750b;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.response.C34020a;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34427a;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.b.b */
public class C55779b extends AbstractC34427a<MessageInfo, C55781c> {

    /* renamed from: f */
    private ThreadTopic f137609f;

    /* renamed from: g */
    private AbstractC34230k f137610g = C32881i.m126556a();

    /* renamed from: h */
    private AbstractC55780a f137611h;

    /* renamed from: com.ss.android.lark.threaddetail.b.b$a */
    public interface AbstractC55780a {
        /* renamed from: a */
        void mo190301a(C55781c cVar);

        /* renamed from: a */
        void mo190302a(List<MessageInfo> list, List<Integer> list2);
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
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: d */
    public String mo122914d() {
        return "thread";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: e */
    public String mo122915e() {
        return "ThreadDetailFirstScreenLoader";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: c */
    public void mo122913c() {
        int lastMsgPos = this.f137609f.getLastMsgPos();
        if (!mo127137a(lastMsgPos)) {
            m216282b(lastMsgPos);
        }
    }

    /* renamed from: a */
    public void mo190299a(AbstractC55780a aVar) {
        this.f137611h = aVar;
    }

    /* renamed from: b */
    private void m216282b(int i) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(i) {
            /* class com.ss.android.lark.threaddetail.p2750b.$$Lambda$b$IoKmuBznXhLJrLFpymlsUsCMo */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C55779b.m270995lambda$IoKmuBznXhLJrLFpymlsUsCMo(C55779b.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m216284c(int i) {
        this.f137610g.mo121345a(((C55777a) this.f88891b).mo122940b(), MessageFetchScene.SPECIFIED_POSITION, i, 15, 5, ChannelDataFetcherStrategy.SYNC_SERVER_DATA, 30, false);
    }

    /* renamed from: a */
    private void m216281a(List<MessageInfo> list, List<Integer> list2) {
        AbstractC55780a aVar = this.f137611h;
        if (aVar != null) {
            aVar.mo190302a(list, list2);
        }
    }

    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: a */
    public void mo122910a(List<Integer> list, IGetDataCallback<Boolean> iGetDataCallback) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(list, iGetDataCallback) {
            /* class com.ss.android.lark.threaddetail.p2750b.$$Lambda$b$xfx8scylgCLrpeuPQxb6TDFwBgQ */
            public final /* synthetic */ List f$1;
            public final /* synthetic */ IGetDataCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C55779b.lambda$xfx8scylgCLrpeuPQxb6TDFwBgQ(C55779b.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m216283b(List list, IGetDataCallback iGetDataCallback) {
        boolean z;
        C34020a b = this.f137610g.mo121354b(this.f137609f.getId(), list);
        if (b == null || !CollectionUtils.isNotEmpty(b.f87907a)) {
            MessageHitPoint.f135779d.mo187535a("thread", true, false, false, false);
        } else {
            m216281a(b.f87907a, b.f87909c);
            this.f88891b.mo122936a((C33952a) new C55781c(b.f87907a, b.f87909c, new ArrayList()));
        }
        if (iGetDataCallback != null) {
            if (b != null) {
                z = true;
            } else {
                z = false;
            }
            iGetDataCallback.onSuccess(Boolean.valueOf(z));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.chat.core.model.a, com.ss.android.lark.chat.core.model.i, java.util.List, com.larksuite.framework.callback.IGetDataCallback] */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34427a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo127136a(C55781c cVar, AbstractC33964i<MessageInfo> iVar, List list, IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        mo190300a(cVar, iVar, (List<Integer>) list, iGetDataCallback);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo190300a(C55781c cVar, AbstractC33964i<MessageInfo> iVar, List<Integer> list, IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        super.mo127136a((C33952a) cVar, (AbstractC33964i) iVar, list, (IGetDataCallback) iGetDataCallback);
        AbstractC55780a aVar = this.f137611h;
        if (aVar != null) {
            aVar.mo190301a(cVar);
        }
    }

    public C55779b(AbstractC33953b<MessageInfo, C55781c> bVar, AbstractC34417b<MessageInfo, C55781c> bVar2, C33958d dVar, C33958d dVar2, CallbackManager callbackManager, ThreadTopic threadTopic) {
        super(bVar, bVar2, dVar, dVar2, callbackManager);
        this.f137609f = threadTopic;
    }
}
