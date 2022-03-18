package com.bytedance.ee.bear.drive.module;

import android.content.Context;
import android.util.Log;
import com.bytedance.ee.bear.AbstractC4306b;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity;
import com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.SpaceFileDownloadManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/drive/module/DriveDownloadImpl;", "Lcom/bytedance/ee/bear/IDriveDownload;", "()V", "downloadFile", "", "context", "Landroid/content/Context;", "openEntity", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/BaseSpaceOpenEntity;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.module.a */
public final class DriveDownloadImpl implements AbstractC4306b {
    @Override // com.bytedance.ee.bear.AbstractC4306b
    /* renamed from: a */
    public void mo16902a(Context context, BaseSpaceOpenEntity baseSpaceOpenEntity) {
        if (context == null || baseSpaceOpenEntity == null) {
            Log.e("DriveComponent", "downloadFile() param is null");
        } else {
            new SpaceFileDownloadManager(context, baseSpaceOpenEntity, null).mo26339a();
        }
    }
}
