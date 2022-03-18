package com.bytedance.ee.bear.list.offlinecache;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class ManualOfflineManager$6 extends BinderBackgroundSyncDocumentsCallback.Stub {
    final /* synthetic */ C8640a this$0;

    ManualOfflineManager$6(C8640a aVar) {
        this.this$0 = aVar;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5095a
    public void onChange(OfflineDoc offlineDoc) {
        C13479a.m54764b("OfflineCacheManager", "onSynced()...");
        for (Document document : this.this$0.f23413e) {
            if (TextUtils.equals(document.mo32472o(), offlineDoc.getFakeToken())) {
                document.mo32451i(offlineDoc.getObj_token());
                document.mo32436e(7);
                document.mo32431b(true);
                this.this$0.mo33613a(document);
                C13479a.m54764b("OfflineCacheManager", "on watched document synced");
                return;
            }
        }
    }
}
