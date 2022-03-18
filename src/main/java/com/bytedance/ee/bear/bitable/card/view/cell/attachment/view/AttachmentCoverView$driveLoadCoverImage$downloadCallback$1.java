package com.bytedance.ee.bear.bitable.card.view.cell.attachment.view;

import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.log.C13479a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J0\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentCoverView$driveLoadCoverImage$downloadCallback$1", "Lcom/bytedance/ee/bear/middleground/drive/export/DownloadCallback;", "onFailed", "", "key", "", "errorCode", "", "updateProgress", UpdateKey.STATUS, "Lcom/bytedance/ee/bear/middleground/drive/export/DriveFile$Status;", "bytesTransferred", "", "bytesTotal", "dataVersion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AttachmentCoverView$driveLoadCoverImage$downloadCallback$1 implements DownloadCallback {
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $localPath;
    final /* synthetic */ AttachmentCoverView this$0;

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
    public boolean onFailed(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        String str2 = this.this$0.f13546f;
        C13479a.m54758a(str2, "onFailed, key = " + str + ", errorCode = " + i);
        this.this$0.f13545e = DriveFile.Status.FAILED;
        return false;
    }

    AttachmentCoverView$driveLoadCoverImage$downloadCallback$1(AttachmentCoverView attachmentCoverView, String str, String str2) {
        this.this$0 = attachmentCoverView;
        this.$localPath = str;
        this.$fileName = str2;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
    public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(str2, "dataVersion");
        this.this$0.f13545e = status;
        if (status != DriveFile.Status.SUCCESS) {
            return false;
        }
        this.this$0.mo18073a(this.$localPath, this.$fileName);
        return false;
    }
}
