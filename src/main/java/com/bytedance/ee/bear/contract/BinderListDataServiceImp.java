package com.bytedance.ee.bear.contract;

import android.app.Application;
import com.bytedance.ee.bear.contract.BinderListDataService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderListDataServiceImp extends BinderListDataService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private am mListDataService;

    @Override // com.bytedance.ee.bear.contract.BinderListDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderListDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderListDataService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void deleteAllDocStatus() {
        lazyInit();
        this.mListDataService.deleteAllDocStatus();
    }

    @Override // com.bytedance.ee.bear.contract.am
    public List<Document> getManualOfflineStateList() {
        lazyInit();
        return this.mListDataService.getManualOfflineStateList();
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyFileClose() {
        lazyInit();
        this.mListDataService.notifyFileClose();
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyFileOpen() {
        lazyInit();
        this.mListDataService.notifyFileOpen();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mListDataService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderListDataServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<Boolean> clearDocsCacheDataFlowable(long j) {
        lazyInit();
        return this.mListDataService.clearDocsCacheDataFlowable(j);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public int delCachedStatus(List<String> list) {
        lazyInit();
        return this.mListDataService.delCachedStatus(list);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public int deleteDocStatusList(List<String> list) {
        lazyInit();
        return this.mListDataService.deleteDocStatusList(list);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<OfflineDoc> getOfflineDoc(String str) {
        lazyInit();
        return this.mListDataService.getOfflineDoc(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void handleSyncedDoc(OfflineDoc offlineDoc) {
        lazyInit();
        this.mListDataService.handleSyncedDoc(offlineDoc);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<Boolean> hasCached(String str) {
        lazyInit();
        return this.mListDataService.hasCached(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<Boolean> isManualOffline(String str) {
        lazyInit();
        return this.mListDataService.isManualOffline(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyListDocDelete(String str) {
        lazyInit();
        this.mListDataService.notifyListDocDelete(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void onDocNotFound(String str) {
        lazyInit();
        this.mListDataService.onDocNotFound(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void registerChangeCallback(BinderListDataChangeCallback binderListDataChangeCallback) {
        lazyInit();
        this.mListDataService.registerChangeCallback(binderListDataChangeCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void renameDocList(List<OfflineRenameData> list) {
        lazyInit();
        this.mListDataService.renameDocList(list);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public int saveCachedStatus(List<String> list) {
        lazyInit();
        return this.mListDataService.saveCachedStatus(list);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void setDocDataCached(String str) {
        lazyInit();
        this.mListDataService.setDocDataCached(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void unRegisterChangeCallback(BinderListDataChangeCallback binderListDataChangeCallback) {
        lazyInit();
        this.mListDataService.unRegisterChangeCallback(binderListDataChangeCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void updateFileName(OfflineRenameData offlineRenameData) {
        lazyInit();
        this.mListDataService.updateFileName(offlineRenameData);
    }

    public BinderListDataServiceImp(am amVar, Application application) {
        this.mListDataService = amVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void delOfflineDoc(String str, BinderIDeleteDocCallback binderIDeleteDocCallback) {
        lazyInit();
        this.mListDataService.delOfflineDoc(str, binderIDeleteDocCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void deleteListRecord(String str, int i) {
        lazyInit();
        this.mListDataService.deleteListRecord(str, i);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyListRename(String str, String str2) {
        lazyInit();
        this.mListDataService.notifyListRename(str, str2);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyListStar(String str, boolean z) {
        lazyInit();
        this.mListDataService.notifyListStar(str, z);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void starSpace(String str, boolean z) {
        lazyInit();
        this.mListDataService.starSpace(str, z);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void pinDoc(String str, int i, boolean z) {
        lazyInit();
        this.mListDataService.pinDoc(str, i, z);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void starDoc(String str, int i, boolean z) {
        lazyInit();
        this.mListDataService.starDoc(str, i, z);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void cancelManualOffline(String str, int i, boolean z, String str2) {
        lazyInit();
        this.mListDataService.cancelManualOffline(str, i, z, str2);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<DocumentCreateInfo> createDocument(int i, String str, String str2, boolean z) {
        lazyInit();
        return this.mListDataService.createDocument(i, str, str2, z);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<OfflineDoc> createOfflineDocument(int i, String str, String str2, boolean z) {
        lazyInit();
        return this.mListDataService.createOfflineDocument(i, str, str2, z);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void deleteDocByObjToken(String str, int i, int i2, BinderIDeleteDocCallback binderIDeleteDocCallback) {
        lazyInit();
        this.mListDataService.deleteDocByObjToken(str, i, i2, binderIDeleteDocCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void subscribeDoc(String str, int i, boolean z, BinderOnRequestCallback binderOnRequestCallback) {
        lazyInit();
        this.mListDataService.subscribeDoc(str, i, z, binderOnRequestCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void manualOfflineDownload(boolean z, boolean z2, String str, boolean z3, Document document, BinderIManualOfflineCallback binderIManualOfflineCallback) {
        lazyInit();
        this.mListDataService.manualOfflineDownload(z, z2, str, z3, document, binderIManualOfflineCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void makeCopy(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, BinderIMakeCopyCallback binderIMakeCopyCallback) {
        lazyInit();
        this.mListDataService.makeCopy(str, i, str2, str3, str4, str5, str6, i2, binderIMakeCopyCallback);
    }
}
