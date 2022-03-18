package com.bytedance.ee.bear.document.offline.p317d;

import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.d.a */
public class C5918a implements AbstractC7945d<OfflineRenameData> {

    /* renamed from: a */
    private C10917c f16570a;

    public C5918a(C10917c cVar) {
        this.f16570a = cVar;
    }

    /* renamed from: a */
    public void handle(OfflineRenameData offlineRenameData, AbstractC7947h hVar) {
        C13479a.m54764b("OfflineRenameHandler", "OfflineRenameHandler.handler: 32 data=" + offlineRenameData);
        if (this.f16570a == null) {
            C13479a.m54764b("OfflineRenameHandler", "OfflineRenameHandler.handler: 37 mServiceContext is null");
        } else {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31495a(offlineRenameData);
        }
    }
}
