package com.bytedance.ee.bear.contract;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import io.reactivex.AbstractC68307f;
import java.util.List;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.contract.ag */
public interface AbstractC5094ag {

    /* renamed from: com.bytedance.ee.bear.contract.ag$a */
    public interface AbstractC5095a {
        void onChange(OfflineDoc offlineDoc);
    }

    /* renamed from: com.bytedance.ee.bear.contract.ag$b */
    public interface AbstractC5096b {
        void onPreloadFail(String str);

        void onPreloadStart(String str);

        void onPreloadSuccess(String str);
    }

    /* renamed from: com.bytedance.ee.bear.contract.ag$c */
    public interface AbstractC5097c {
        void connected();

        void disconnect();
    }

    /* renamed from: com.bytedance.ee.bear.contract.ag$d */
    public interface AbstractC5098d {
        void onReceiveData(String str);
    }

    /* renamed from: com.bytedance.ee.bear.contract.ag$e */
    public interface AbstractC5099e {
        void onChange(String str);
    }

    /* renamed from: com.bytedance.ee.bear.contract.ag$f */
    public interface AbstractC5100f {
        void onChange(List<String> list);

        void onRemove(List<String> list);
    }

    void addRnConnectStatusCallback(BinderIRnConnectStatus binderIRnConnectStatus);

    void clearCacheView();

    AbstractC68307f<Boolean> clearDocCache();

    int clearImageUpTimeMills(long j, long j2);

    AbstractC68307f<Boolean> clearMemUserData();

    int clearUpTimeMills(long j);

    AbstractC68307f<Boolean> clearUserData();

    void delDocs(String str);

    void delDocsList(List<String> list);

    AbstractC68307f<Long> getDocCacheSize(long j);

    List<String> getTokenList();

    void preloadDocs(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback);

    void preloadDocs(List<OfflineDoc> list);

    void preloadDocsInterval(List<OfflineDoc> list);

    void registSendDataCallback(BinderISendDataCallback binderISendDataCallback);

    void registerBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback);

    void registerListPushListener(BinderPushListener binderPushListener, String str);

    void registerUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback);

    void removeRnConnectStatusCallback(BinderIRnConnectStatus binderIRnConnectStatus);

    void unRegistSendDataCallback(BinderISendDataCallback binderISendDataCallback);

    void unRegisterBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback);

    void unRegisterListPushListener(BinderPushListener binderPushListener, String str);

    void unRegisterUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback);

    void unWatchDocs(List<OfflineDoc> list, String str);

    void uploadDocs(List<OfflineDoc> list);

    void watchDocs(List<OfflineDoc> list, String str);
}
