package com.bytedance.ee.bear.document.offline.create;

import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.sync.sync.C6027a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.create.b */
public class C5916b implements AbstractC7945d<OfflineDoc> {

    /* renamed from: a */
    private String f16567a = "Offline#Sync#";

    /* renamed from: b */
    private final C10917c f16568b;

    /* renamed from: c */
    private AbstractC5917c f16569c;

    /* renamed from: a */
    public void mo23893a(AbstractC5917c cVar) {
        this.f16569c = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23817a(AbstractC7947h hVar, Integer num) throws Exception {
        if (num.intValue() > 0) {
            C5890a.m23705a("", hVar);
        } else {
            C5890a.m23706a("", "", hVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23818a(AbstractC7947h hVar, Throwable th) throws Exception {
        C5890a.m23706a("", "", hVar);
        C13479a.m54759a(this.f16567a, "OfflineSyncDocHandler.accept: 84 ", th);
    }

    public C5916b(C10917c cVar, String str) {
        String str2 = this.f16567a + str + Integer.toHexString(hashCode());
        this.f16567a = str2;
        C13479a.m54764b(str2, "construct");
        this.f16568b = cVar;
    }

    /* renamed from: b */
    private void m23819b(OfflineDoc offlineDoc, AbstractC7947h hVar) {
        C5955d.m24025b().mo24077a(offlineDoc.getFakeToken()).mo237985a(C11678b.m48480d()).mo238020d(new Function(offlineDoc) {
            /* class com.bytedance.ee.bear.document.offline.create.$$Lambda$b$8XZYKqa8dyrIQzI2F0HpbSgtn0 */
            public final /* synthetic */ OfflineDoc f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5916b.this.m23816a(this.f$1, (List) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.create.$$Lambda$b$HR8UlJMfB5OldNJ7ybZkpHcpmmw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5916b.m23817a(AbstractC7947h.this, (Integer) obj);
            }
        }, new Consumer(hVar) {
            /* class com.bytedance.ee.bear.document.offline.create.$$Lambda$b$YpvsfPKr4I7CSm8pYY4SuonYBQ */
            public final /* synthetic */ AbstractC7947h f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5916b.this.m23818a((C5916b) this.f$1, (AbstractC7947h) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Integer m23816a(OfflineDoc offlineDoc, List list) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5968f fVar = (C5968f) it.next();
            fVar.mo24136c(offlineDoc.getObj_token());
            fVar.mo24147i(offlineDoc.getToken());
        }
        int b = C5955d.m24025b().mo24084b(list);
        String str = this.f16567a;
        C13479a.m54764b(str, "accept: ret=" + b);
        return Integer.valueOf(b);
    }

    /* renamed from: a */
    public void handle(OfflineDoc offlineDoc, AbstractC7947h hVar) {
        String str = this.f16567a;
        C13479a.m54764b(str, "handle:" + offlineDoc);
        if (offlineDoc != null && this.f16568b != null) {
            C6027a.m24403a().mo24355b(offlineDoc);
            m23819b(offlineDoc, hVar);
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31494a(offlineDoc);
            AbstractC5917c cVar = this.f16569c;
            if (cVar != null) {
                cVar.handleSyncedDoc(offlineDoc);
            } else {
                C13479a.m54764b(this.f16567a, "OfflineSyncDocHandler handle: mListener is null");
            }
        }
    }
}
