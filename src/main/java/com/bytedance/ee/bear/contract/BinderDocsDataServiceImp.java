package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderDocsDataService;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderDocsDataServiceImp extends BinderDocsDataService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC5094ag mDocsDataService;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderDocsDataService.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderDocsDataService.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.contract.BinderDocsDataService.Stub
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void clearCacheView() {
        lazyInit();
        this.mDocsDataService.clearCacheView();
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public AbstractC68307f<Boolean> clearDocCache() {
        lazyInit();
        return this.mDocsDataService.clearDocCache();
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public AbstractC68307f<Boolean> clearMemUserData() {
        lazyInit();
        return this.mDocsDataService.clearMemUserData();
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public AbstractC68307f<Boolean> clearUserData() {
        lazyInit();
        return this.mDocsDataService.clearUserData();
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public List<String> getTokenList() {
        lazyInit();
        return this.mDocsDataService.getTokenList();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mDocsDataService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderDocsDataServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void addRnConnectStatusCallback(BinderIRnConnectStatus binderIRnConnectStatus) {
        lazyInit();
        this.mDocsDataService.addRnConnectStatusCallback(binderIRnConnectStatus);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public int clearUpTimeMills(long j) {
        lazyInit();
        return this.mDocsDataService.clearUpTimeMills(j);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void delDocs(String str) {
        lazyInit();
        this.mDocsDataService.delDocs(str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void delDocsList(List<String> list) {
        lazyInit();
        this.mDocsDataService.delDocsList(list);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public AbstractC68307f<Long> getDocCacheSize(long j) {
        lazyInit();
        return this.mDocsDataService.getDocCacheSize(j);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void preloadDocsInterval(List<OfflineDoc> list) {
        lazyInit();
        this.mDocsDataService.preloadDocsInterval(list);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void registSendDataCallback(BinderISendDataCallback binderISendDataCallback) {
        lazyInit();
        this.mDocsDataService.registSendDataCallback(binderISendDataCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void registerBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback) {
        lazyInit();
        this.mDocsDataService.registerBackgroundSyncDocumentsChangeCallback(binderBackgroundSyncDocumentsCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void registerUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback) {
        lazyInit();
        this.mDocsDataService.registerUnSyncDocumentsChangeCallback(binderUnSyncDocumentsCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void removeRnConnectStatusCallback(BinderIRnConnectStatus binderIRnConnectStatus) {
        lazyInit();
        this.mDocsDataService.removeRnConnectStatusCallback(binderIRnConnectStatus);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unRegistSendDataCallback(BinderISendDataCallback binderISendDataCallback) {
        lazyInit();
        this.mDocsDataService.unRegistSendDataCallback(binderISendDataCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unRegisterBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback) {
        lazyInit();
        this.mDocsDataService.unRegisterBackgroundSyncDocumentsChangeCallback(binderBackgroundSyncDocumentsCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unRegisterUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback) {
        lazyInit();
        this.mDocsDataService.unRegisterUnSyncDocumentsChangeCallback(binderUnSyncDocumentsCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void uploadDocs(List<OfflineDoc> list) {
        lazyInit();
        this.mDocsDataService.uploadDocs(list);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void preloadDocs(List<OfflineDoc> list) {
        lazyInit();
        this.mDocsDataService.preloadDocs(list);
    }

    public BinderDocsDataServiceImp(AbstractC5094ag agVar, Application application) {
        this.mDocsDataService = agVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public int clearImageUpTimeMills(long j, long j2) {
        lazyInit();
        return this.mDocsDataService.clearImageUpTimeMills(j, j2);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void preloadDocs(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback) {
        lazyInit();
        this.mDocsDataService.preloadDocs(offlineDoc, binderIPreloadCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void registerListPushListener(BinderPushListener binderPushListener, String str) {
        lazyInit();
        this.mDocsDataService.registerListPushListener(binderPushListener, str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unRegisterListPushListener(BinderPushListener binderPushListener, String str) {
        lazyInit();
        this.mDocsDataService.unRegisterListPushListener(binderPushListener, str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unWatchDocs(List<OfflineDoc> list, String str) {
        lazyInit();
        this.mDocsDataService.unWatchDocs(list, str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void watchDocs(List<OfflineDoc> list, String str) {
        lazyInit();
        this.mDocsDataService.watchDocs(list, str);
    }
}
