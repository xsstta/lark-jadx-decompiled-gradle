package com.bytedance.ee.bear.drive.biz.upload.error;

import android.content.Context;
import com.bytedance.ee.bear.drive.biz.upload.adapter.DriveUploadStateMonitorAdapter;
import com.bytedance.ee.bear.drive.p325b.C6319a;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class UploadErrorManager$1 extends DriveUploadStateMonitorAdapter {
    final /* synthetic */ C6763e this$0;
    final /* synthetic */ Context val$context;

    UploadErrorManager$1(C6763e eVar, Context context) {
        this.this$0 = eVar;
        this.val$context = context;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a, com.bytedance.ee.bear.drive.biz.upload.adapter.DriveUploadStateMonitorAdapter
    public void onUploadErrorCode(String str, int i) {
        C13479a.m54764b("UploadErrorManager", "onUploadErrorCode = " + i);
        if (this.this$0.mo26599b(i)) {
            this.this$0.mo26600c(i);
        } else if (this.this$0.mo26598a(i)) {
            C6319a.m25390a(this.val$context, i);
        }
    }
}
