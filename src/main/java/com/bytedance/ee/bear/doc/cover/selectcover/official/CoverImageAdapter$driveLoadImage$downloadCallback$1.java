package com.bytedance.ee.bear.doc.cover.selectcover.official;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.log.C13479a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.p078b.p079a.C2057g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J0\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter$driveLoadImage$downloadCallback$1", "Lcom/bytedance/ee/bear/middleground/drive/export/DownloadCallback;", "onFailed", "", "key", "", "errorCode", "", "updateProgress", UpdateKey.STATUS, "Lcom/bytedance/ee/bear/middleground/drive/export/DriveFile$Status;", "bytesTransferred", "", "bytesTotal", "dataVersion", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CoverImageAdapter$driveLoadImage$downloadCallback$1 implements DownloadCallback {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $height;
    final /* synthetic */ ImageView $imageView;
    final /* synthetic */ String $localPath;
    final /* synthetic */ C2057g $skeleton;
    final /* synthetic */ int $width;
    final /* synthetic */ CoverImageAdapter this$0;

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
    public boolean onFailed(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C13479a.m54758a("DocCover_OfficialCoverSelectionFragment", "driveLoadImage()... onFailed ?, key = " + str + ", errorCode = " + i);
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
    public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(str2, "dataVersion");
        C13479a.m54772d("DocCover_OfficialCoverSelectionFragment", "driveLoadImage()... updateProgress, key = " + str + ", status = " + status);
        if (status != DriveFile.Status.SUCCESS) {
            return false;
        }
        this.this$0.mo21601a(this.$context, this.$localPath, this.$imageView, this.$width, this.$height, this.$skeleton);
        return false;
    }

    CoverImageAdapter$driveLoadImage$downloadCallback$1(CoverImageAdapter aVar, Context context, String str, ImageView imageView, int i, int i2, C2057g gVar) {
        this.this$0 = aVar;
        this.$context = context;
        this.$localPath = str;
        this.$imageView = imageView;
        this.$width = i;
        this.$height = i2;
        this.$skeleton = gVar;
    }
}
