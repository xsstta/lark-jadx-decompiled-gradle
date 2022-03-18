package com.bytedance.ee.bear.list.offlinecache;

import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.BinderIManualOfflineDialogCallback;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.offlinecache.C8640a;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class ManualOfflineManager$1$1 extends BinderIManualOfflineDialogCallback.Stub {
    final /* synthetic */ C8640a.C86411 this$1;
    final /* synthetic */ BinderIManualOfflineCallback val$callback;
    final /* synthetic */ boolean val$isGrid;
    final /* synthetic */ boolean val$isNeedReport;
    final /* synthetic */ String val$module;

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5111d
    public void onConfirmDownload(Document document) {
        C13479a.m54764b("OfflineCacheManager", "onConfirmDownload()...");
        C8640a.this.mo33611a(this.val$callback, document, this.val$isGrid, this.val$isNeedReport, this.val$module);
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5111d
    public void onWaitingWifi(Document document) {
        C13479a.m54764b("OfflineCacheManager", "onWaitingWifi()...");
        document.mo32444g(true);
        C8640a.this.mo33615a(document, this.val$isGrid, this.val$isNeedReport, this.val$module);
    }

    ManualOfflineManager$1$1(C8640a.C86411 r1, BinderIManualOfflineCallback binderIManualOfflineCallback, boolean z, boolean z2, String str) {
        this.this$1 = r1;
        this.val$callback = binderIManualOfflineCallback;
        this.val$isGrid = z;
        this.val$isNeedReport = z2;
        this.val$module = str;
    }
}
