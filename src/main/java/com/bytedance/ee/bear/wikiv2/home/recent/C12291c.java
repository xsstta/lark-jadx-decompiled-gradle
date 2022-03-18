package com.bytedance.ee.bear.wikiv2.home.recent;

import android.content.Context;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8542h;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.recent.c */
public final class C12291c implements AbstractC8542h {

    /* renamed from: a */
    private C7718l f32997a;

    /* renamed from: b */
    private Context f32998b;

    /* renamed from: c */
    private C10917c f32999c;

    /* renamed from: d */
    private C68289a f33000d = new C68289a();

    /* renamed from: e */
    private C12290b f33001e;

    /* renamed from: f */
    private int f33002f;

    /* renamed from: g */
    private NetService.AbstractC5075d<DocumentListInfo> f33003g;

    /* renamed from: h */
    private DocumentListInfo f33004h;

    /* renamed from: i */
    private AbstractC8542h.AbstractC8543a f33005i;

    /* renamed from: d */
    private void m51204d() {
        this.f33002f = 0;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: p */
    public void mo33360p() {
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: q */
    public void mo33361q() {
        mo46881a(false);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31645l(), $$Lambda$pDt3mvsNj4Wcr0q5xBEwuBZx0.INSTANCE);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.create. ");
        m51203c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.destroy. ");
        this.f33000d.mo237935a();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: s */
    public boolean mo33363s() {
        DocumentListInfo documentListInfo = this.f33004h;
        if (documentListInfo == null || !documentListInfo.isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private NetService.C5076e m51199b() {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/wiki/v2/search/get_recent/");
        fVar.mo20143a(2);
        fVar.mo20145a("offset", String.valueOf(this.f33002f));
        fVar.mo20145a("size", "20");
        return fVar;
    }

    /* renamed from: c */
    private void m51203c() {
        this.f33003g = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new RecentWikiListParser());
        this.f33001e = new C12290b();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: o */
    public void mo33359o() {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.loadMoreFromNet(). offset: " + this.f33002f);
        this.f33000d.mo237937a(this.f33003g.mo20141a(m51199b()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$c$flEmKYjZumtK2PMUBPIMzm_GuU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12291c.this.m51200b((DocumentListInfo) obj);
            }
        }).mo238020d($$Lambda$UM87tD8wdWXJXLuqoMRtIDktY.INSTANCE).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$c$6QJbYTV7z923CMZMHsh_OdEm78 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12291c.this.m51202b((C12291c) ((ArrayList) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$c$lTGA_LS00LNP1xHTlFiULAzbUoE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12291c.this.m51201b((C12291c) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ DocumentListInfo m51195a(DocumentListInfo documentListInfo) throws Exception {
        this.f33004h = documentListInfo;
        return documentListInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ DocumentListInfo m51200b(DocumentListInfo documentListInfo) throws Exception {
        this.f33004h = documentListInfo;
        return documentListInfo;
    }

    /* renamed from: a */
    private void m51196a(int i) {
        this.f33002f += i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51197a(Throwable th) throws Exception {
        C13479a.m54759a("Wiki_RecentWikiListModel", "RecentWikiListModel.refreshFromNet, pull error. ", th);
        this.f33004h = null;
        AbstractC8542h.AbstractC8543a aVar = this.f33005i;
        if (aVar != null) {
            aVar.mo32655a(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51198a(ArrayList arrayList) throws Exception {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.refreshFromNet, pull success, size= " + C13657b.m55424c(arrayList));
        m51196a(Integer.valueOf("20").intValue());
        this.f33001e.mo32620a(arrayList);
        AbstractC8542h.AbstractC8543a aVar = this.f33005i;
        if (aVar != null) {
            aVar.mo32648a(this.f33004h.getTotal(), this.f33004h.isHasMore());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m51201b(Throwable th) throws Exception {
        C13479a.m54759a("Wiki_RecentWikiListModel", "RecentWikiListModel.loadMoreFromNet, pull error. ", th);
        this.f33004h = null;
        AbstractC8542h.AbstractC8543a aVar = this.f33005i;
        if (aVar != null) {
            aVar.mo33303b(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m51202b(ArrayList arrayList) throws Exception {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.loadMoreFromNet, pull success, size = " + C13657b.m55424c(arrayList));
        m51196a(Integer.valueOf("20").intValue());
        this.f33001e.mo32621b(arrayList);
        AbstractC8542h.AbstractC8543a aVar = this.f33005i;
        if (aVar != null) {
            aVar.mo33304b(this.f33004h.isHasMore());
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public void mo33357a(AbstractC8542h.AbstractC8543a aVar) {
        this.f33005i = aVar;
    }

    /* renamed from: a */
    public void mo46881a(boolean z) {
        m51204d();
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.refreshFromNet. offset: " + this.f33002f);
        this.f33000d.mo237937a(this.f33003g.mo20141a(m51199b()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$c$cUHERRKPz6GyK8WUmFTyI_PLN7g */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12291c.this.m51195a((DocumentListInfo) obj);
            }
        }).mo238020d($$Lambda$UM87tD8wdWXJXLuqoMRtIDktY.INSTANCE).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$c$RkuBRvWoduzegLZtRHJSwci61E */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12291c.this.m51198a((C12291c) ((ArrayList) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$c$fa93tVb9pHHA92iPAXs84BUxVOA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12291c.this.m51197a((C12291c) ((Throwable) obj));
            }
        }));
    }

    public C12291c(C7718l lVar, Context context, C10917c cVar) {
        this.f32997a = lVar;
        this.f32998b = context;
        this.f32999c = cVar;
    }
}
