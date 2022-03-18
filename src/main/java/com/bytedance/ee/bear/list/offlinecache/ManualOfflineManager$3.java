package com.bytedance.ee.bear.list.offlinecache;

import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;

/* access modifiers changed from: package-private */
public class ManualOfflineManager$3 extends BinderIPreloadCallback.Stub {
    final /* synthetic */ C8640a this$0;
    final /* synthetic */ BinderIManualOfflineCallback val$callback;
    final /* synthetic */ Document val$document;
    final /* synthetic */ boolean val$isGrid;
    final /* synthetic */ boolean val$isNeedReport;
    final /* synthetic */ String val$module;

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5096b
    public void onPreloadFail(String str) {
        C13479a.m54764b("OfflineCacheManager", "docs, preload failed");
        this.this$0.mo33616a(this.val$document.mo32472o(), 8);
        this.this$0.mo33614a(this.val$document, 8);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5096b
    public void onPreloadStart(String str) {
        C13479a.m54764b("OfflineCacheManager", "docs, preload start");
        BinderIManualOfflineCallback binderIManualOfflineCallback = this.val$callback;
        if (binderIManualOfflineCallback != null) {
            binderIManualOfflineCallback.getClass();
            C13748k.m55732a(new Runnable() {
                /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$OPWG5wD6fhal0gb66YbMjZR4RU */

                public final void run() {
                    BinderIManualOfflineCallback.this.onDownloadStatusChange();
                }
            });
        }
        this.this$0.mo33615a(this.val$document, this.val$isGrid, this.val$isNeedReport, this.val$module);
        this.this$0.mo33616a(this.val$document.mo32472o(), 6);
        this.this$0.mo33614a(this.val$document, 6);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5096b
    public void onPreloadSuccess(String str) {
        C13479a.m54764b("OfflineCacheManager", "docs, preload success");
        if (this.val$document.mo32408X()) {
            C8153a.m32844b().mo31625e(str, false);
        }
        this.this$0.mo33616a(this.val$document.mo32472o(), 7);
        this.this$0.mo33614a(this.val$document, 7);
    }

    ManualOfflineManager$3(C8640a aVar, BinderIManualOfflineCallback binderIManualOfflineCallback, Document document, boolean z, boolean z2, String str) {
        this.this$0 = aVar;
        this.val$callback = binderIManualOfflineCallback;
        this.val$document = document;
        this.val$isGrid = z;
        this.val$isNeedReport = z2;
        this.val$module = str;
    }
}
