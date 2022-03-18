package com.bytedance.ee.bear.drive.services;

import android.os.Bundle;
import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import com.bytedance.ee.bear.contract.drive.DriveManualCacheStatus;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.PreloadEntity;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.drive.services.l */
public interface AbstractC7184l {

    /* renamed from: com.bytedance.ee.bear.drive.services.l$a */
    public interface AbstractC7185a {
        boolean onFailed(String str, int i);

        boolean updateProgress(String str, int i, long j, long j2, String str2);
    }

    /* renamed from: com.bytedance.ee.bear.drive.services.l$b */
    public interface AbstractC7186b {
        void onStatusChange(DriveManualCacheStatus driveManualCacheStatus);
    }

    /* renamed from: com.bytedance.ee.bear.drive.services.l$c */
    public interface AbstractC7187c {
        void onOpenFinish();
    }

    /* renamed from: com.bytedance.ee.bear.drive.services.l$d */
    public interface AbstractC7188d {
        boolean onFailed(String str, int i, String str2);

        boolean updateProgress(String str, int i, long j, long j2, String str2, String str3, String str4, String str5);
    }

    AbstractC68307f<Integer> canImport(String str);

    void cancelManualOfflineFile(String str);

    AbstractC68307f<Boolean> checkInitPluginFlowable();

    AbstractC68307f<Boolean> cleanDriveCacheFlowable(long j);

    AbstractC68307f<Boolean> cleanDriveCleanableCache();

    AbstractC68307f<Boolean> deleteDriveCacheByTokens(ArrayList<String> arrayList);

    void downloadManualOfflineFile(boolean z, String str, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, Bundle bundle);

    void driveCancelDownload(ArrayList<String> arrayList);

    String driveDownload(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, int i4, int i5, String str7, boolean z, boolean z2, String str8, BinderIDownloadCallback binderIDownloadCallback);

    String driveDownloadNormal(String str, String str2, int i, String str3, boolean z, long j, String str4, BinderIDownloadCallback binderIDownloadCallback);

    String driveUpload(String str, String str2, String str3, String str4, int i, BinderIUploadCallback binderIUploadCallback);

    void execDriveSdkPreviewAction(String str, ArrayList<PreviewAction> arrayList);

    AbstractC68307f<Long> getDriveCleanableCacheSize();

    void onConfigChanged();

    void onLoginStatusChangedEvent(int i);

    void openDriveTestActivity(Bundle bundle);

    void preloadDriveSdkFile(ArrayList<PreloadEntity> arrayList);

    AbstractC68307f<Boolean> preloadFile(int i, ArrayList<DriveOfflineDoc> arrayList);

    void registerOpenMonitor(BinderIDriveOpenMonitor binderIDriveOpenMonitor);

    void registerUploadStateMonitor(String str, String str2, BinderIUploadStateMonitor binderIUploadStateMonitor);

    void requestImport(ImportFileEntity importFileEntity);

    void requestPreviewUsingPlatformCapability(String str);

    void setDocPageVisiable(boolean z);

    void showUploadStateView(String str, String str2, String str3);

    void unRegisterUploadStateMonitor(BinderIUploadStateMonitor binderIUploadStateMonitor);

    void uploadFile(String str, String str2, Bundle bundle, int i);

    void uploadMedia(String str, String str2, Bundle bundle, int i);
}
