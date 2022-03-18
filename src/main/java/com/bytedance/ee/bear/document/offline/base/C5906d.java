package com.bytedance.ee.bear.document.offline.base;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.jsbridge.AbstractC7944c;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.document.offline.base.d */
public class C5906d implements AbstractC7944c<OfflineTransferModel> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23786a(AbstractC7947h hVar, Throwable th) throws Exception {
        C13479a.m54759a("GetDataHandler", "GetDataHandler.handle: get data fail ", th);
        C5890a.m23705a("", hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23785a(AbstractC7947h hVar, C5968f fVar) throws Exception {
        if (fVar == null || TextUtils.isEmpty(fVar.mo24124a()) || TextUtils.isEmpty(fVar.mo24134c())) {
            C5890a.m23705a("", hVar);
        } else {
            C5890a.m23705a(fVar.mo24137d(), hVar);
        }
    }

    /* renamed from: a */
    public void handle(OfflineTransferModel offlineTransferModel, AbstractC7947h hVar) {
        C5968f parseResourceData;
        if (offlineTransferModel == null || (parseResourceData = offlineTransferModel.parseResourceData()) == null || TextUtils.isEmpty(parseResourceData.mo24124a()) || TextUtils.isEmpty(parseResourceData.mo24134c())) {
            C5890a.m23705a("", hVar);
            C13479a.m54775e("GetDataHandler", "GetDataHandler.handle: model is null ");
            return;
        }
        C5955d.m24025b().mo24078a(parseResourceData.mo24124a(), parseResourceData.mo24134c()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.base.$$Lambda$d$cErAJ2b0MjKlmWvR1QBDBnQJlc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5906d.m23785a(AbstractC7947h.this, (C5968f) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.base.$$Lambda$d$RlffLAKlrv9iwrUOIkIm30Nxw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5906d.m23786a(AbstractC7947h.this, (Throwable) obj);
            }
        });
    }
}
