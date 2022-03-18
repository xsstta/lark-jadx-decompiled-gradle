package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.presenter;

import com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.C6801a;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.ProgressingEntity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;

/* access modifiers changed from: package-private */
public class RustUploadStatusMonitor$2 extends BinderIUploadStateMonitor.Stub {
    final /* synthetic */ C6806a this$0;

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onExistUploadingFile() {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onFileCountChange(int i, int i2) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadError(int i) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadFileSuccess(String str, String str2, String str3) {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadFinished() {
    }

    RustUploadStatusMonitor$2(C6806a aVar) {
        this.this$0 = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onFileProgressChange(int i, ProgressingEntity progressingEntity) {
        if (progressingEntity == null) {
            C13479a.m54775e("UpdateListTAG", "update upload list progress data empty.");
            return;
        }
        int a = C6806a.m26854a(progressingEntity.mo35709d());
        this.this$0.mo26808a(a, progressingEntity, new C6801a(a, progressingEntity.mo35704b(), progressingEntity.mo35707c()));
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
    public void onUploadErrorCode(String str, int i) {
        C13479a.m54764b("UpdateListTAG", "onUploadErrorCode, fileId: " + C13598b.m55197d(str) + ", errorCode: " + i);
        this.this$0.f18504a.mo26816a(new C6801a(str, String.valueOf(i)), 0);
    }
}
