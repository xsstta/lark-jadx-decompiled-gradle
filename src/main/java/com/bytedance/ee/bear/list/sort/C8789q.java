package com.bytedance.ee.bear.list.sort;

import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.sort.AbstractC8757c;
import com.bytedance.ee.bear.list.sort.AbstractC8769h;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.list.sort.q */
public class C8789q extends BasePresenter<AbstractC8769h.AbstractC8770a, AbstractC8769h.AbstractC8771b, AbstractC8769h.AbstractC8771b.AbstractC8772a> {

    /* renamed from: b */
    static final /* synthetic */ boolean f23688b = true;

    /* renamed from: a */
    public final AbstractC8757c.AbstractC8758a f23689a;

    /* renamed from: c */
    private final String f23690c = "SortPresenter";

    /* renamed from: d */
    private final C7718l f23691d;

    /* renamed from: e */
    private C8786n f23692e;

    /* renamed from: f */
    private final FolderSortStrategy f23693f;

    /* renamed from: g */
    private Disposable f23694g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC8769h.AbstractC8771b.AbstractC8772a createViewDelegate() {
        return new C8791a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C13479a.m54764b("SortPresenter", "destroy()...");
        this.f23692e.setSortAndFilterMenuState(0);
        Disposable disposable = this.f23694g;
        if (disposable != null && !disposable.isDisposed()) {
            this.f23694g.dispose();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.sort.q$a */
    public class C8791a implements AbstractC8769h.AbstractC8771b.AbstractC8772a {
        @Override // com.bytedance.ee.bear.list.sort.AbstractC8769h.AbstractC8771b.AbstractC8772a
        /* renamed from: a */
        public void mo33820a() {
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append("onClickClose(): ");
            if (C8789q.this.f23689a != null) {
                z = C8789q.f23688b;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("SortPresenter", sb.toString());
            if (C8789q.this.f23689a != null) {
                C8789q.this.f23689a.close();
            }
        }

        private C8791a() {
        }

        @Override // com.bytedance.ee.bear.list.sort.AbstractC8769h.AbstractC8771b.AbstractC8772a
        /* renamed from: a */
        public void mo33821a(FolderSortStrategy folderSortStrategy) {
            C13479a.m54764b("SortPresenter", "onClickSort()...sortStrategy = " + folderSortStrategy);
            C8789q.this.mo33841a(folderSortStrategy);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13479a.m54764b("SortPresenter", "create()...");
        if (f23688b || this.f23691d.getActivity() != null) {
            this.f23692e = (C8786n) aj.m5366a(this.f23691d.getActivity()).mo6005a(C8786n.class);
            ((AbstractC8769h.AbstractC8771b) getView()).mo33819a(((AbstractC8769h.AbstractC8770a) getModel()).mo32742a());
            if (this.f23693f != null) {
                ((AbstractC8769h.AbstractC8771b) getView()).mo33818a(this.f23693f);
            }
            this.f23692e.setSortAndFilterMenuState(1);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36855a(Throwable th) throws Exception {
        C13479a.m54761a("SortPresenter", th);
    }

    /* renamed from: a */
    public void mo33841a(FolderSortStrategy folderSortStrategy) {
        this.f23694g = AbstractC68307f.m265083a(Boolean.valueOf((boolean) f23688b)).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(folderSortStrategy) {
            /* class com.bytedance.ee.bear.list.sort.$$Lambda$q$KyC_0vuFyNI5UY6qa_yy7fi1EE */
            public final /* synthetic */ FolderSortStrategy f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8789q.this.m36854a(this.f$1, (Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.sort.$$Lambda$q$pIMXXTw2_Nt8v6WS381S3ykLiw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8789q.this.m36855a((C8789q) ((Throwable) obj));
            }
        });
        AbstractC8757c.AbstractC8758a aVar = this.f23689a;
        if (aVar != null) {
            aVar.close();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36854a(FolderSortStrategy folderSortStrategy, Boolean bool) throws Exception {
        ((AbstractC8769h.AbstractC8770a) getModel()).mo33802a(folderSortStrategy);
        this.f23692e.postSortStrategy(folderSortStrategy);
    }

    C8789q(C7718l lVar, AbstractC8769h.AbstractC8771b bVar, AbstractC8769h.AbstractC8770a aVar, AbstractC8757c.AbstractC8758a aVar2, FolderSortStrategy folderSortStrategy) {
        super(aVar, bVar);
        this.f23691d = lVar;
        this.f23689a = aVar2;
        this.f23693f = folderSortStrategy;
    }
}
