package com.bytedance.ee.bear.drive.module;

import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.contract.drive.DriveManualCacheStatus;
import com.bytedance.ee.bear.drive.services.BinderIDownloadDriveManualCacheCallback;

/* access modifiers changed from: package-private */
public class DriveInterfaceImpl$1 extends BinderIDownloadDriveManualCacheCallback.Stub {
    final /* synthetic */ C7097b this$0;
    final /* synthetic */ AbstractC4967c.AbstractC4968a val$callback;

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7186b
    public void onStatusChange(DriveManualCacheStatus driveManualCacheStatus) {
        AbstractC4967c.AbstractC4968a aVar = this.val$callback;
        if (aVar != null) {
            aVar.mo19663a(driveManualCacheStatus);
        }
    }

    DriveInterfaceImpl$1(C7097b bVar, AbstractC4967c.AbstractC4968a aVar) {
        this.this$0 = bVar;
        this.val$callback = aVar;
    }
}
