package com.bytedance.ee.bear.list.sort;

import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.sort.AbstractC8757c;
import com.bytedance.ee.bear.list.sort.AbstractC8765g;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.list.sort.l */
public class C8779l extends BasePresenter<AbstractC8765g.AbstractC8766a, AbstractC8765g.AbstractC8767b, AbstractC8765g.AbstractC8767b.AbstractC8768a> {

    /* renamed from: b */
    static final /* synthetic */ boolean f23648b = true;

    /* renamed from: a */
    public final AbstractC8757c.AbstractC8758a f23649a;

    /* renamed from: c */
    private final String f23650c = "SortAndFilterPresenter";

    /* renamed from: d */
    private final C7718l f23651d;

    /* renamed from: e */
    private final C10917c f23652e;

    /* renamed from: f */
    private final String f23653f;

    /* renamed from: g */
    private final String f23654g;

    /* renamed from: h */
    private final String f23655h;

    /* renamed from: i */
    private C8786n f23656i;

    /* renamed from: j */
    private FolderSortStrategy f23657j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC8765g.AbstractC8767b.AbstractC8768a createViewDelegate() {
        return new C8781a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C13479a.m54764b("SortAndFilterPresenter", "destroy()...");
        this.f23656i.setSortAndFilterMenuState(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.sort.l$a */
    public class C8781a implements AbstractC8765g.AbstractC8767b.AbstractC8768a {
        @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8767b.AbstractC8768a
        /* renamed from: a */
        public void mo33815a() {
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append("onClickClose(): ");
            if (C8779l.this.f23649a != null) {
                z = C8779l.f23648b;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("SortAndFilterPresenter", sb.toString());
            if (C8779l.this.f23649a != null) {
                C8779l.this.f23649a.close();
            }
        }

        private C8781a() {
        }

        @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8767b.AbstractC8768a
        /* renamed from: a */
        public void mo33816a(FolderSortStrategy folderSortStrategy) {
            C13479a.m54764b("SortAndFilterPresenter", "onClickDone()...sortStrategy = " + folderSortStrategy);
            C8779l.this.mo33829a(folderSortStrategy);
        }

        @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8767b.AbstractC8768a
        /* renamed from: b */
        public void mo33817b(FolderSortStrategy folderSortStrategy) {
            C13479a.m54764b("SortAndFilterPresenter", "onClickReset()...sortStrategy = " + folderSortStrategy);
            C8779l.this.mo33829a(folderSortStrategy);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13479a.m54764b("SortAndFilterPresenter", "create()...");
        if (f23648b || this.f23651d.getActivity() != null) {
            this.f23656i = (C8786n) aj.m5366a(this.f23651d.getActivity()).mo6005a(C8786n.class);
            ((AbstractC8765g.AbstractC8767b) getView()).mo33814a(((AbstractC8765g.AbstractC8766a) getModel()).mo33058b(), ((AbstractC8765g.AbstractC8766a) getModel()).mo32811a());
            if (this.f23657j != null) {
                ((AbstractC8765g.AbstractC8767b) getView()).mo33813a(this.f23657j);
            }
            this.f23656i.setSortAndFilterMenuState(1);
            ListAnalysis.m32531c(C5234y.m21391b(), this.f23653f);
            ListAnalysis.m32528b(this.f23653f, this.f23654g, this.f23655h);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36828a(Throwable th) throws Exception {
        C13479a.m54761a("SortAndFilterPresenter", th);
    }

    /* renamed from: a */
    public void mo33829a(FolderSortStrategy folderSortStrategy) {
        this.f23657j = folderSortStrategy;
        AbstractC68307f.m265083a(Boolean.valueOf((boolean) f23648b)).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(folderSortStrategy) {
            /* class com.bytedance.ee.bear.list.sort.$$Lambda$l$ubTunO0osCTsp6RnOFqL9og */
            public final /* synthetic */ FolderSortStrategy f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8779l.this.m36827a(this.f$1, (Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.sort.$$Lambda$l$XNvl2OJTddnuLrnkHxnMlHoQIr0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8779l.this.m36828a((C8779l) ((Throwable) obj));
            }
        });
        AbstractC8757c.AbstractC8758a aVar = this.f23649a;
        if (aVar != null) {
            aVar.close();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36827a(FolderSortStrategy folderSortStrategy, Boolean bool) throws Exception {
        ((AbstractC8765g.AbstractC8766a) getModel()).mo33801a(folderSortStrategy);
        this.f23656i.postSortStrategy(folderSortStrategy);
    }

    C8779l(C7718l lVar, AbstractC8765g.AbstractC8767b bVar, AbstractC8765g.AbstractC8766a aVar, AbstractC8757c.AbstractC8758a aVar2, C10917c cVar, String str, String str2, String str3, FolderSortStrategy folderSortStrategy) {
        super(aVar, bVar);
        this.f23651d = lVar;
        this.f23649a = aVar2;
        this.f23652e = cVar;
        this.f23653f = str;
        this.f23654g = str2;
        this.f23655h = str3;
        this.f23657j = folderSortStrategy;
    }
}
