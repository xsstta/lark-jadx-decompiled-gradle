package com.bytedance.ee.bear.document.offline.base;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.jsbridge.AbstractC7944c;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.base.g */
public class C5912g implements AbstractC7944c<OfflineTransferModel> {

    /* renamed from: a */
    private static long f16557a = 2097152;

    /* renamed from: b */
    private C10917c f16558b;

    public C5912g(C10917c cVar) {
        this.f16558b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23805a(Throwable th) throws Exception {
        C13479a.m54759a("SetDataHandler", "handle: ", th);
        C13606d.m55245a("SetDataHandler", th);
    }

    /* renamed from: a */
    private void m23802a(C5968f fVar) {
        if (this.f16558b == null) {
            C13479a.m54764b("SetDataHandler", "docResourceDataSaveSuccess()...serviceContext is null");
            return;
        }
        String c = fVar.mo24134c();
        if (fVar.mo24156p() && !C5130a.m20997b(c)) {
            C13479a.m54764b("SetDataHandler", "docResourceDataSaveSuccess ");
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31513b(c);
        }
    }

    /* renamed from: a */
    private synchronized void m23803a(C5968f fVar, AbstractC7947h hVar) {
        long j;
        try {
            C5968f b = C5955d.m24025b().mo24086b(fVar.mo24124a(), fVar.mo24134c());
            if (b == null || b.mo24154n() <= 0) {
                j = C5955d.m24025b().mo24072a(fVar);
            } else {
                fVar.mo24131b(b.mo24154n());
                fVar.mo24125a(b.mo24151k());
                j = (long) C5955d.m24025b().mo24089c(fVar);
            }
            if (j > 0) {
                C5890a.m23705a("", hVar);
                m23802a(fVar);
            } else {
                C5890a.m23706a("", "", hVar);
                throw new RuntimeException("SetDataHandler ret <= 0   ret: " + j);
            }
        } catch (Exception e) {
            C5890a.m23706a("", "", hVar);
            C13479a.m54759a("SetDataHandler", "addDataToStorage: ", e);
            C13606d.m55245a("SetDataHandler", e);
        }
        return;
    }

    /* renamed from: a */
    public void handle(OfflineTransferModel offlineTransferModel, AbstractC7947h hVar) {
        if (offlineTransferModel != null) {
            String data = offlineTransferModel.getData();
            if (!TextUtils.isEmpty(data) && ((long) data.length()) > f16557a) {
                C13606d.m55245a("SetDataHandler", new Throwable("data length: " + data.length() + "  " + C13598b.m55197d(offlineTransferModel.getObjToken()) + "  " + C13598b.m55197d(offlineTransferModel.getKey())));
            }
            C5968f parseResourceData = offlineTransferModel.parseResourceData();
            if (parseResourceData != null && !TextUtils.isEmpty(parseResourceData.mo24134c()) && !TextUtils.isEmpty(parseResourceData.mo24124a())) {
                AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238001b(new Consumer(parseResourceData, hVar) {
                    /* class com.bytedance.ee.bear.document.offline.base.$$Lambda$g$Psh0zi81C5UxZZBtOj6SZ4nLXiU */
                    public final /* synthetic */ C5968f f$1;
                    public final /* synthetic */ AbstractC7947h f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C5912g.this.m23804a(this.f$1, this.f$2, (String) obj);
                    }
                }, $$Lambda$g$k1IfgN0JkHWrtiQpWg0SOr4Z_K0.INSTANCE);
                return;
            }
        }
        C13479a.m54775e("SetDataHandler", "SetDataHandler.handle:data is null   data: " + offlineTransferModel);
        C5890a.m23706a("", "", hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23804a(C5968f fVar, AbstractC7947h hVar, String str) throws Exception {
        m23803a(fVar, hVar);
    }
}
