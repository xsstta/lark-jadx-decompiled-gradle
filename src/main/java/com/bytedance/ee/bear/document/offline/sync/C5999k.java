package com.bytedance.ee.bear.document.offline.sync;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.sync.C5999k;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.k */
public class C5999k {

    /* renamed from: a */
    public final List<OfflineDoc> f16796a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f16797b = false;

    /* renamed from: c */
    public Runnable f16798c = new Runnable() {
        /* class com.bytedance.ee.bear.document.offline.sync.C5999k.RunnableC60012 */

        public void run() {
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48480d()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.document.offline.sync.$$Lambda$k$2$zszPx2DXI7mLbgxXYMkuPwiugkc */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5999k.RunnableC60012.this.m24298a((C5999k.RunnableC60012) ((Boolean) obj));
                }
            }, $$Lambda$k$2$186eOVMsYfEjkfwMyX3YtNo6q1Y.INSTANCE);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m24298a(Boolean bool) throws Exception {
            C5999k.this.mo24258b();
            if (!C5999k.this.f16796a.isEmpty()) {
                C13748k.m55735c(C5999k.this.f16798c);
                C13748k.m55733a(C5999k.this.f16798c, (long) C6002l.f16804b.getPreload_clientvar_frequency());
            }
        }
    };

    /* renamed from: d */
    private C10917c f16799d;

    /* renamed from: e */
    private Runnable f16800e = new Runnable() {
        /* class com.bytedance.ee.bear.document.offline.sync.C5999k.RunnableC60001 */

        public void run() {
            C13479a.m54775e("PreloadIntervalExecutor", "backgroundSleepRunnable======");
            C5999k.this.f16797b = true;
            C13748k.m55735c(C5999k.this.f16798c);
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m24294c() {
        C5102ai.m20872j().mo20215g().mo5925a(new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.offline.sync.$$Lambda$k$KIshA_4fgJZb2lTgIGAb8xcKt_k */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C5999k.this.m24289a((C5999k) ((Boolean) obj));
            }
        });
    }

    /* renamed from: b */
    public void mo24258b() {
        C13479a.m54764b("PreloadIntervalExecutor", "intervalRunnable====== mPreloadOfflineDocListInterval.size()： " + this.f16796a.size());
        int min = Math.min(this.f16796a.size(), C6002l.f16804b.getPreload_clientvar_number_per_time());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < min; i++) {
            arrayList.add(this.f16796a.remove(0));
        }
        this.f16799d.mo41508c(AbstractC5094ag.class).mo238020d(new Function(arrayList) {
            /* class com.bytedance.ee.bear.document.offline.sync.$$Lambda$k$1CXzFnwtS2IRyv0boIaFn9nLdRM */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((AbstractC5094ag) obj).preloadDocs(this.f$0);
            }
        }).mo238001b($$Lambda$k$lBipqfqKoXK48KXatc1EjrC29SE.INSTANCE, $$Lambda$k$9EjniFWL751uPp_I4s4nDnI5d9A.INSTANCE);
    }

    /* renamed from: a */
    public void mo24256a() {
        C13479a.m54764b("PreloadIntervalExecutor", "clearData()...");
        this.f16796a.clear();
    }

    public C5999k(C10917c cVar) {
        this.f16799d = cVar;
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.document.offline.sync.$$Lambda$k$lmkOA2rcxujm_dXizZkY_TaA5ZU */

            public final void run() {
                C5999k.this.m24294c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24289a(Boolean bool) {
        if (bool == Boolean.TRUE) {
            C13748k.m55735c(this.f16800e);
            if (this.f16797b) {
                this.f16797b = false;
                if (!this.f16796a.isEmpty()) {
                    C13748k.m55735c(this.f16798c);
                    C13748k.m55732a(this.f16798c);
                    return;
                }
                return;
            }
            return;
        }
        C13748k.m55735c(this.f16800e);
        C13748k.m55733a(this.f16800e, C5102ai.m20872j().mo20216h());
    }

    /* renamed from: a */
    public void mo24257a(List<OfflineDoc> list) {
        if (list != null) {
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48480d()).mo238001b(new Consumer(list) {
                /* class com.bytedance.ee.bear.document.offline.sync.$$Lambda$k$sSYFNuBfQxeB023xJFcEszzI80 */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5999k.this.m24292a((C5999k) this.f$1, (List) ((Boolean) obj));
                }
            }, $$Lambda$k$HYg7dTxo4okM5XhqSH6tMMH99lw.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24292a(List list, Boolean bool) throws Exception {
        list.removeAll(this.f16796a);
        this.f16796a.addAll(list);
        if (!this.f16796a.isEmpty()) {
            C13748k.m55735c(this.f16798c);
            C13748k.m55732a(this.f16798c);
        }
    }
}
