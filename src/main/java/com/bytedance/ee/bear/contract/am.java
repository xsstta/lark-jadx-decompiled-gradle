package com.bytedance.ee.bear.contract;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.list.dto.Document;
import io.reactivex.AbstractC68307f;
import java.util.List;

@NewRemoteService
public interface am {

    /* renamed from: com.bytedance.ee.bear.contract.am$a */
    public interface AbstractC5108a {
        void onOfflinePostExecute(boolean z);

        void onPostExecuteFail(int i);

        void onPostExecuteSuccess();

        void onPreExecute();
    }

    /* renamed from: com.bytedance.ee.bear.contract.am$b */
    public interface AbstractC5109b {
        void onFailed(String str, int i);

        void onSucceed(String str, String str2, String str3);
    }

    /* renamed from: com.bytedance.ee.bear.contract.am$c */
    public interface AbstractC5110c {
        void onDownloadStatusChange();

        void onShowConfirmDownloadDialog(Document document, long j, BinderIManualOfflineDialogCallback binderIManualOfflineDialogCallback);
    }

    /* renamed from: com.bytedance.ee.bear.contract.am$d */
    public interface AbstractC5111d {
        void onConfirmDownload(Document document);

        void onWaitingWifi(Document document);
    }

    /* renamed from: com.bytedance.ee.bear.contract.am$e */
    public interface AbstractC5112e {
        void onDelete(String str);

        void onFileClose();

        void onFileOpen();

        void onPin(String str, boolean z);

        void onRename(String str, String str2);

        void onRename(List<OfflineRenameData> list);

        void onStar(String str, boolean z);

        void onSubscribe(String str, boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.contract.am$f */
    public interface AbstractC5113f {
        void onFail(int i, String str);

        void onSuccess();
    }

    void cancelManualOffline(String str, int i, boolean z, String str2);

    AbstractC68307f<Boolean> clearDocsCacheDataFlowable(long j);

    AbstractC68307f<DocumentCreateInfo> createDocument(int i, String str, String str2, boolean z);

    AbstractC68307f<OfflineDoc> createOfflineDocument(int i, String str, String str2, boolean z);

    int delCachedStatus(List<String> list);

    void delOfflineDoc(String str, BinderIDeleteDocCallback binderIDeleteDocCallback);

    void deleteAllDocStatus();

    void deleteDocByObjToken(String str, int i, int i2, BinderIDeleteDocCallback binderIDeleteDocCallback);

    int deleteDocStatusList(List<String> list);

    void deleteListRecord(String str, int i);

    List<Document> getManualOfflineStateList();

    AbstractC68307f<OfflineDoc> getOfflineDoc(String str);

    void handleSyncedDoc(OfflineDoc offlineDoc);

    AbstractC68307f<Boolean> hasCached(String str);

    AbstractC68307f<Boolean> isManualOffline(String str);

    void makeCopy(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, BinderIMakeCopyCallback binderIMakeCopyCallback);

    void manualOfflineDownload(boolean z, boolean z2, String str, boolean z3, Document document, BinderIManualOfflineCallback binderIManualOfflineCallback);

    void notifyFileClose();

    void notifyFileOpen();

    void notifyListDocDelete(String str);

    void notifyListRename(String str, String str2);

    void notifyListStar(String str, boolean z);

    void onDocNotFound(String str);

    void pinDoc(String str, int i, boolean z);

    void registerChangeCallback(BinderListDataChangeCallback binderListDataChangeCallback);

    void renameDocList(List<OfflineRenameData> list);

    int saveCachedStatus(List<String> list);

    void setDocDataCached(String str);

    void starDoc(String str, int i, boolean z);

    void starSpace(String str, boolean z);

    void subscribeDoc(String str, int i, boolean z, BinderOnRequestCallback binderOnRequestCallback);

    void unRegisterChangeCallback(BinderListDataChangeCallback binderListDataChangeCallback);

    void updateFileName(OfflineRenameData offlineRenameData);
}
