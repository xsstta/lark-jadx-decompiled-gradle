package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.PreloadEntity;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.services.BinderDriveService;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderDriveServiceImp extends BinderDriveService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC7184l mDriveService;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.BinderDriveService.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.BinderDriveService.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.drive.services.BinderDriveService.Stub
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> checkInitPluginFlowable() {
        lazyInit();
        return this.mDriveService.checkInitPluginFlowable();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> cleanDriveCleanableCache() {
        lazyInit();
        return this.mDriveService.cleanDriveCleanableCache();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Long> getDriveCleanableCacheSize() {
        lazyInit();
        return this.mDriveService.getDriveCleanableCacheSize();
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void onConfigChanged() {
        lazyInit();
        this.mDriveService.onConfigChanged();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mDriveService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderDriveServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Integer> canImport(String str) {
        lazyInit();
        return this.mDriveService.canImport(str);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void cancelManualOfflineFile(String str) {
        lazyInit();
        this.mDriveService.cancelManualOfflineFile(str);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> cleanDriveCacheFlowable(long j) {
        lazyInit();
        return this.mDriveService.cleanDriveCacheFlowable(j);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> deleteDriveCacheByTokens(ArrayList<String> arrayList) {
        lazyInit();
        return this.mDriveService.deleteDriveCacheByTokens(arrayList);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void driveCancelDownload(ArrayList<String> arrayList) {
        lazyInit();
        this.mDriveService.driveCancelDownload(arrayList);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void onLoginStatusChangedEvent(int i) {
        lazyInit();
        this.mDriveService.onLoginStatusChangedEvent(i);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void openDriveTestActivity(Bundle bundle) {
        lazyInit();
        this.mDriveService.openDriveTestActivity(bundle);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void preloadDriveSdkFile(ArrayList<PreloadEntity> arrayList) {
        lazyInit();
        this.mDriveService.preloadDriveSdkFile(arrayList);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void registerOpenMonitor(BinderIDriveOpenMonitor binderIDriveOpenMonitor) {
        lazyInit();
        this.mDriveService.registerOpenMonitor(binderIDriveOpenMonitor);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void requestImport(ImportFileEntity importFileEntity) {
        lazyInit();
        this.mDriveService.requestImport(importFileEntity);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void requestPreviewUsingPlatformCapability(String str) {
        lazyInit();
        this.mDriveService.requestPreviewUsingPlatformCapability(str);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void setDocPageVisiable(boolean z) {
        lazyInit();
        this.mDriveService.setDocPageVisiable(z);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void unRegisterUploadStateMonitor(BinderIUploadStateMonitor binderIUploadStateMonitor) {
        lazyInit();
        this.mDriveService.unRegisterUploadStateMonitor(binderIUploadStateMonitor);
    }

    public BinderDriveServiceImp(AbstractC7184l lVar, Application application) {
        this.mDriveService = lVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void execDriveSdkPreviewAction(String str, ArrayList<PreviewAction> arrayList) {
        lazyInit();
        this.mDriveService.execDriveSdkPreviewAction(str, arrayList);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public AbstractC68307f<Boolean> preloadFile(int i, ArrayList<DriveOfflineDoc> arrayList) {
        lazyInit();
        return this.mDriveService.preloadFile(i, arrayList);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void registerUploadStateMonitor(String str, String str2, BinderIUploadStateMonitor binderIUploadStateMonitor) {
        lazyInit();
        this.mDriveService.registerUploadStateMonitor(str, str2, binderIUploadStateMonitor);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void showUploadStateView(String str, String str2, String str3) {
        lazyInit();
        this.mDriveService.showUploadStateView(str, str2, str3);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void downloadManualOfflineFile(boolean z, String str, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, Bundle bundle) {
        lazyInit();
        this.mDriveService.downloadManualOfflineFile(z, str, binderIDownloadDriveManualCacheCallback, bundle);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void uploadFile(String str, String str2, Bundle bundle, int i) {
        lazyInit();
        this.mDriveService.uploadFile(str, str2, bundle, i);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public void uploadMedia(String str, String str2, Bundle bundle, int i) {
        lazyInit();
        this.mDriveService.uploadMedia(str, str2, bundle, i);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public String driveUpload(String str, String str2, String str3, String str4, int i, BinderIUploadCallback binderIUploadCallback) {
        lazyInit();
        return this.mDriveService.driveUpload(str, str2, str3, str4, i, binderIUploadCallback);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public String driveDownloadNormal(String str, String str2, int i, String str3, boolean z, long j, String str4, BinderIDownloadCallback binderIDownloadCallback) {
        lazyInit();
        return this.mDriveService.driveDownloadNormal(str, str2, i, str3, z, j, str4, binderIDownloadCallback);
    }

    @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
    public String driveDownload(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, int i4, int i5, String str7, boolean z, boolean z2, String str8, BinderIDownloadCallback binderIDownloadCallback) {
        lazyInit();
        return this.mDriveService.driveDownload(str, str2, str3, str4, i, str5, i2, str6, i3, i4, i5, str7, z, z2, str8, binderIDownloadCallback);
    }
}
