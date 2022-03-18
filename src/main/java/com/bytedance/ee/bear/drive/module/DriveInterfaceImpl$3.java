package com.bytedance.ee.bear.drive.module;

import com.bytedance.ee.bear.drive.services.BinderIDownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;

/* access modifiers changed from: package-private */
public class DriveInterfaceImpl$3 extends BinderIDownloadCallback.Stub {
    final /* synthetic */ C7097b this$0;
    final /* synthetic */ DownloadRequestInfo val$requestInfo;

    DriveInterfaceImpl$3(C7097b bVar, DownloadRequestInfo downloadRequestInfo) {
        this.this$0 = bVar;
        this.val$requestInfo = downloadRequestInfo;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7185a
    public boolean onFailed(String str, int i) {
        if (this.val$requestInfo.f25121m != null) {
            return this.val$requestInfo.f25121m.onFailed(str, i);
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l.AbstractC7185a
    public boolean updateProgress(String str, int i, long j, long j2, String str2) {
        if (this.val$requestInfo.f25121m != null) {
            return this.val$requestInfo.f25121m.updateProgress(str, DriveFile.Status.from(i), j, j2, str2);
        }
        return false;
    }
}
