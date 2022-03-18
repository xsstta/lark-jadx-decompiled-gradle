package com.ss.android.socialbase.downloader.model;

import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.AbstractC60026d;
import com.ss.android.socialbase.downloader.depend.AbstractC60027e;
import com.ss.android.socialbase.downloader.depend.AbstractC60029g;
import com.ss.android.socialbase.downloader.depend.AbstractC60031i;
import com.ss.android.socialbase.downloader.depend.AbstractC60033k;
import com.ss.android.socialbase.downloader.depend.AbstractC60034l;
import com.ss.android.socialbase.downloader.depend.AbstractC60035m;
import com.ss.android.socialbase.downloader.depend.AbstractC60036n;
import com.ss.android.socialbase.downloader.depend.AbstractC60040r;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.AbstractC60057g;
import com.ss.android.socialbase.downloader.downloader.AbstractC60058h;
import com.ss.android.socialbase.downloader.downloader.AbstractC60067q;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.C60048c;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.p3026c.C59992a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class DownloadTask {
    private AbstractC60057g chunkAdjustCalculator;
    private AbstractC60058h chunkStrategy;
    private AbstractC60027e depend;
    private AbstractC60029g diskSpaceHandler;
    private AbstractC60026d downloadCompleteProcessor;
    private DownloadInfo downloadInfo;
    private DownloadInfo.C60119a downloadInfoBuilder;
    private AbstractC60031i fileUriProvider;
    private AbstractC60033k forbiddenHandler;
    private AbstractC60034l interceptor;
    private final SparseArray<IDownloadListener> mainThreadListeners;
    private AbstractC60035m monitorDepend;
    private boolean needDelayForCacheSync;
    private AbstractC60040r notificationClickCallback;
    private AbstractC60036n notificationEventListener;
    private final SparseArray<IDownloadListener> notificationListeners;
    private AbstractC60067q retryDelayTimeCalculator;
    private final SparseArray<ListenerType> singleListenerHashCodeMap;
    private final Map<ListenerType, IDownloadListener> singleListenerMap;
    private final SparseArray<IDownloadListener> subThreadListeners;

    public AbstractC60057g getChunkAdjustCalculator() {
        return this.chunkAdjustCalculator;
    }

    public AbstractC60058h getChunkStrategy() {
        return this.chunkStrategy;
    }

    public AbstractC60027e getDepend() {
        return this.depend;
    }

    public AbstractC60029g getDiskSpaceHandler() {
        return this.diskSpaceHandler;
    }

    public AbstractC60026d getDownloadCompleteHandler() {
        return this.downloadCompleteProcessor;
    }

    public DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public AbstractC60031i getFileUriProvider() {
        return this.fileUriProvider;
    }

    public AbstractC60033k getForbiddenHandler() {
        return this.forbiddenHandler;
    }

    public AbstractC60034l getInterceptor() {
        return this.interceptor;
    }

    public AbstractC60035m getMonitorDepend() {
        return this.monitorDepend;
    }

    public AbstractC60040r getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public AbstractC60036n getNotificationEventListener() {
        return this.notificationEventListener;
    }

    public AbstractC60067q getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public boolean isNeedDelayForCacheSync() {
        return this.needDelayForCacheSync;
    }

    public boolean canShowNotification() {
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (downloadInfo2 != null) {
            return downloadInfo2.canShowNotification();
        }
        return false;
    }

    public int getDownloadId() {
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (downloadInfo2 == null) {
            return 0;
        }
        return downloadInfo2.getId();
    }

    private void setChunkCalculator() {
        if (this.downloadInfo.getThrottleNetSpeed() > 0) {
            chunkStategy(new AbstractC60058h() {
                /* class com.ss.android.socialbase.downloader.model.DownloadTask.C601201 */

                @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60058h
                /* renamed from: a */
                public int mo204770a(long j) {
                    return 1;
                }
            });
        }
    }

    public DownloadTask() {
        this.singleListenerMap = new ConcurrentHashMap();
        this.singleListenerHashCodeMap = new SparseArray<>();
        this.needDelayForCacheSync = false;
        this.downloadInfoBuilder = new DownloadInfo.C60119a();
        this.mainThreadListeners = new SparseArray<>();
        this.subThreadListeners = new SparseArray<>();
        this.notificationListeners = new SparseArray<>();
    }

    public int download() {
        this.downloadInfo = this.downloadInfoBuilder.mo205279a();
        if (C60046b.m233010t().getDownloadInfo(this.downloadInfo.getId()) == null) {
            C59992a.m232851a(this, (BaseException) null, 0);
        }
        setChunkCalculator();
        C60048c.m233017a().mo204681a(this);
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (downloadInfo2 == null) {
            return 0;
        }
        return downloadInfo2.getId();
    }

    public void addListenerToDownloadingSameTask() {
        C59990a.m232838b("DownloadTask", "same task just tryDownloading, so add listener in last task instead of tryDownload");
        addListenerToDownloadingSameTask(ListenerType.MAIN);
        addListenerToDownloadingSameTask(ListenerType.SUB);
        C59992a.m232850a(this.monitorDepend, this.downloadInfo, new BaseException(1003, "has another same task, add Listener to old task"), 0);
    }

    public DownloadTask chunkAdjustCalculator(AbstractC60057g gVar) {
        this.chunkAdjustCalculator = gVar;
        return this;
    }

    public DownloadTask chunkStategy(AbstractC60058h hVar) {
        this.chunkStrategy = hVar;
        return this;
    }

    public DownloadTask depend(AbstractC60027e eVar) {
        this.depend = eVar;
        return this;
    }

    public DownloadTask diskSpaceHandler(AbstractC60029g gVar) {
        this.diskSpaceHandler = gVar;
        return this;
    }

    public DownloadTask downloadCompleteHandler(AbstractC60026d dVar) {
        this.downloadCompleteProcessor = dVar;
        return this;
    }

    public DownloadTask fileUriProvider(AbstractC60031i iVar) {
        this.fileUriProvider = iVar;
        return this;
    }

    public DownloadTask forbiddenHandler(AbstractC60033k kVar) {
        this.forbiddenHandler = kVar;
        return this;
    }

    public DownloadTask interceptor(AbstractC60034l lVar) {
        this.interceptor = lVar;
        return this;
    }

    public DownloadTask monitorDepend(AbstractC60035m mVar) {
        this.monitorDepend = mVar;
        return this;
    }

    public DownloadTask notificationClickCallback(AbstractC60040r rVar) {
        this.notificationClickCallback = rVar;
        return this;
    }

    public DownloadTask notificationEventListener(AbstractC60036n nVar) {
        this.notificationEventListener = nVar;
        return this;
    }

    public DownloadTask retryDelayTimeCalculator(AbstractC60067q qVar) {
        this.retryDelayTimeCalculator = qVar;
        return this;
    }

    public void setNeedDelayForCacheSync(boolean z) {
        this.needDelayForCacheSync = z;
    }

    public void setNotificationEventListener(AbstractC60036n nVar) {
        this.notificationEventListener = nVar;
    }

    public DownloadTask(DownloadInfo downloadInfo2) {
        this();
        this.downloadInfo = downloadInfo2;
    }

    public DownloadTask addListenerToSameTask(boolean z) {
        this.downloadInfoBuilder.mo205314q(z);
        return this;
    }

    public DownloadTask autoResumed(boolean z) {
        this.downloadInfoBuilder.mo205297f(z);
        return this;
    }

    public DownloadTask backUpUrlRetryCount(int i) {
        this.downloadInfoBuilder.mo205286c(i);
        return this;
    }

    public DownloadTask backUpUrls(List<String> list) {
        this.downloadInfoBuilder.mo205283b(list);
        return this;
    }

    public DownloadTask downloadSetting(JSONObject jSONObject) {
        this.downloadInfoBuilder.mo205275a(jSONObject);
        return this;
    }

    public DownloadTask enqueueType(EnqueueType enqueueType) {
        this.downloadInfoBuilder.mo205272a(enqueueType);
        return this;
    }

    public DownloadTask executorGroup(int i) {
        this.downloadInfoBuilder.mo205295f(i);
        return this;
    }

    public DownloadTask expectFileLength(long j) {
        this.downloadInfoBuilder.mo205271a(j);
        return this;
    }

    public DownloadTask extra(String str) {
        this.downloadInfoBuilder.mo205296f(str);
        return this;
    }

    public DownloadTask extraHeaders(List<HttpHeader> list) {
        this.downloadInfoBuilder.mo205274a(list);
        return this;
    }

    public DownloadTask extraMonitorStatus(int[] iArr) {
        this.downloadInfoBuilder.mo205285b(iArr);
        return this;
    }

    public DownloadTask force(boolean z) {
        this.downloadInfoBuilder.mo205284b(z);
        return this;
    }

    public DownloadTask headConnectionAvailable(boolean z) {
        this.downloadInfoBuilder.mo205310m(z);
        return this;
    }

    public DownloadTask iconUrl(String str) {
        this.downloadInfoBuilder.mo205308l(str);
        return this;
    }

    public DownloadTask ignoreDataVerify(boolean z) {
        this.downloadInfoBuilder.mo205311n(z);
        return this;
    }

    public DownloadTask maxBytes(int i) {
        this.downloadInfoBuilder.mo205270a(i);
        return this;
    }

    public DownloadTask maxProgressCount(int i) {
        this.downloadInfoBuilder.mo205289d(i);
        return this;
    }

    public DownloadTask md5(String str) {
        this.downloadInfoBuilder.mo205302i(str);
        return this;
    }

    public DownloadTask mimeType(String str) {
        this.downloadInfoBuilder.mo205298g(str);
        return this;
    }

    public DownloadTask minProgressTimeMsInterval(int i) {
        this.downloadInfoBuilder.mo205292e(i);
        return this;
    }

    public DownloadTask monitorScene(String str) {
        this.downloadInfoBuilder.mo205306k(str);
        return this;
    }

    public DownloadTask name(String str) {
        this.downloadInfoBuilder.mo205273a(str);
        return this;
    }

    public DownloadTask needChunkDowngradeRetry(boolean z) {
        this.downloadInfoBuilder.mo205312o(z);
        return this;
    }

    public DownloadTask needDefaultHttpServiceBackUp(boolean z) {
        this.downloadInfoBuilder.mo205301h(z);
        return this;
    }

    public DownloadTask needHttpsToHttpRetry(boolean z) {
        this.downloadInfoBuilder.mo205291d(z);
        return this;
    }

    public DownloadTask needIndependentProcess(boolean z) {
        this.downloadInfoBuilder.mo205309l(z);
        return this;
    }

    public DownloadTask needPostProgress(boolean z) {
        this.downloadInfoBuilder.mo205288c(z);
        return this;
    }

    public DownloadTask needRetryDelay(boolean z) {
        this.downloadInfoBuilder.mo205305j(z);
        return this;
    }

    public DownloadTask needReuseChunkRunnable(boolean z) {
        this.downloadInfoBuilder.mo205303i(z);
        return this;
    }

    public DownloadTask needReuseFirstConnection(boolean z) {
        this.downloadInfoBuilder.mo205307k(z);
        return this;
    }

    public DownloadTask needSDKMonitor(boolean z) {
        this.downloadInfoBuilder.mo205315r(z);
        return this;
    }

    public DownloadTask newSaveTempFileEnable(boolean z) {
        this.downloadInfoBuilder.mo205313p(z);
        return this;
    }

    public DownloadTask onlyWifi(boolean z) {
        this.downloadInfoBuilder.mo205276a(z);
        return this;
    }

    public DownloadTask outIp(String[] strArr) {
        this.downloadInfoBuilder.mo205278a(strArr);
        return this;
    }

    public DownloadTask outSize(int[] iArr) {
        this.downloadInfoBuilder.mo205277a(iArr);
        return this;
    }

    public DownloadTask packageName(String str) {
        this.downloadInfoBuilder.mo205300h(str);
        return this;
    }

    public DownloadTask retryCount(int i) {
        this.downloadInfoBuilder.mo205280b(i);
        return this;
    }

    public DownloadTask retryDelayTimeArray(String str) {
        this.downloadInfoBuilder.mo205304j(str);
        return this;
    }

    public DownloadTask savePath(String str) {
        this.downloadInfoBuilder.mo205290d(str);
        return this;
    }

    public DownloadTask showNotification(boolean z) {
        this.downloadInfoBuilder.mo205294e(z);
        return this;
    }

    public DownloadTask showNotificationForAutoResumed(boolean z) {
        this.downloadInfoBuilder.mo205299g(z);
        return this;
    }

    public DownloadTask tempPath(String str) {
        this.downloadInfoBuilder.mo205293e(str);
        return this;
    }

    public DownloadTask throttleNetSpeed(long j) {
        this.downloadInfoBuilder.mo205281b(j);
        return this;
    }

    public DownloadTask title(String str) {
        this.downloadInfoBuilder.mo205282b(str);
        return this;
    }

    public DownloadTask url(String str) {
        this.downloadInfoBuilder.mo205287c(str);
        return this;
    }

    public IDownloadListener getSingleDownloadListener(ListenerType listenerType) {
        return this.singleListenerMap.get(listenerType);
    }

    public DownloadTask mainThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        return mainThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public DownloadTask notificationListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        return notificationListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public DownloadTask subThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        return subThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public int getDownloadListenerSize(ListenerType listenerType) {
        int size;
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(listenerType);
        if (downloadListeners == null) {
            return 0;
        }
        synchronized (downloadListeners) {
            size = downloadListeners.size();
        }
        return size;
    }

    public SparseArray<IDownloadListener> getDownloadListeners(ListenerType listenerType) {
        if (listenerType == ListenerType.MAIN) {
            return this.mainThreadListeners;
        }
        if (listenerType == ListenerType.SUB) {
            return this.subThreadListeners;
        }
        if (listenerType == ListenerType.NOTIFICATION) {
            return this.notificationListeners;
        }
        return null;
    }

    private void addListenerToDownloadingSameTask(ListenerType listenerType) {
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(listenerType);
        synchronized (downloadListeners) {
            for (int i = 0; i < downloadListeners.size(); i++) {
                IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i));
                if (iDownloadListener != null) {
                    C60048c.m233017a().mo204688b(getDownloadId(), iDownloadListener, listenerType, false);
                }
            }
        }
    }

    public void copyInterfaceFromNewTask(DownloadTask downloadTask) {
        this.chunkAdjustCalculator = downloadTask.chunkAdjustCalculator;
        this.chunkStrategy = downloadTask.chunkStrategy;
        this.singleListenerMap.clear();
        this.singleListenerMap.putAll(downloadTask.singleListenerMap);
        synchronized (this.mainThreadListeners) {
            this.mainThreadListeners.clear();
            addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
        }
        synchronized (this.subThreadListeners) {
            this.subThreadListeners.clear();
            addAll(downloadTask.subThreadListeners, this.subThreadListeners);
        }
        synchronized (this.notificationListeners) {
            this.notificationListeners.clear();
            addAll(downloadTask.notificationListeners, this.notificationListeners);
        }
        this.notificationEventListener = downloadTask.notificationEventListener;
        this.interceptor = downloadTask.interceptor;
        this.depend = downloadTask.depend;
        this.monitorDepend = downloadTask.monitorDepend;
        this.forbiddenHandler = downloadTask.forbiddenHandler;
        this.diskSpaceHandler = downloadTask.diskSpaceHandler;
        this.retryDelayTimeCalculator = downloadTask.retryDelayTimeCalculator;
        this.notificationClickCallback = downloadTask.notificationClickCallback;
        this.fileUriProvider = downloadTask.fileUriProvider;
        this.downloadCompleteProcessor = downloadTask.downloadCompleteProcessor;
    }

    public void copyListenerFromPendingTask(DownloadTask downloadTask) {
        for (Map.Entry<ListenerType, IDownloadListener> entry : downloadTask.singleListenerMap.entrySet()) {
            if (entry != null && !this.singleListenerMap.containsKey(entry.getKey())) {
                this.singleListenerMap.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            if (downloadTask.mainThreadListeners.size() != 0) {
                synchronized (this.mainThreadListeners) {
                    removeAll(this.mainThreadListeners, downloadTask.mainThreadListeners);
                    addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                }
            }
            if (downloadTask.subThreadListeners.size() != 0) {
                synchronized (this.subThreadListeners) {
                    removeAll(this.subThreadListeners, downloadTask.subThreadListeners);
                    addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                }
            }
            if (downloadTask.notificationListeners.size() != 0) {
                synchronized (this.notificationListeners) {
                    removeAll(this.notificationListeners, downloadTask.notificationListeners);
                    addAll(downloadTask.notificationListeners, this.notificationListeners);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void addAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (!(sparseArray == null || sparseArray2 == null)) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                sparseArray2.put(keyAt, sparseArray.get(keyAt));
            }
        }
    }

    private void copyListeners(SparseArray<IDownloadListener> sparseArray, SparseArray<IDownloadListener> sparseArray2) {
        sparseArray.clear();
        for (int i = 0; i < sparseArray2.size(); i++) {
            int keyAt = sparseArray2.keyAt(i);
            IDownloadListener iDownloadListener = sparseArray2.get(keyAt);
            if (iDownloadListener != null) {
                sparseArray.put(keyAt, iDownloadListener);
            }
        }
    }

    private void removeAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (!(sparseArray == null || sparseArray2 == null)) {
            int size = sparseArray2.size();
            for (int i = 0; i < size; i++) {
                sparseArray.remove(sparseArray2.keyAt(i));
            }
        }
    }

    public IDownloadListener getDownloadListenerByIndex(ListenerType listenerType, int i) {
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(listenerType);
        if (downloadListeners == null || i < 0) {
            return null;
        }
        synchronized (downloadListeners) {
            if (i >= downloadListeners.size()) {
                return null;
            }
            return downloadListeners.get(downloadListeners.keyAt(i));
        }
    }

    public DownloadTask mainThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.mainThreadListeners) {
                this.mainThreadListeners.put(i, iDownloadListener);
            }
            this.singleListenerMap.put(ListenerType.MAIN, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, ListenerType.MAIN);
            }
        }
        return this;
    }

    public DownloadTask notificationListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.notificationListeners) {
                this.notificationListeners.put(i, iDownloadListener);
            }
            this.singleListenerMap.put(ListenerType.NOTIFICATION, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, ListenerType.NOTIFICATION);
            }
        }
        return this;
    }

    public void setDownloadListeners(SparseArray<IDownloadListener> sparseArray, ListenerType listenerType) {
        if (sparseArray != null) {
            try {
                if (listenerType == ListenerType.MAIN) {
                    synchronized (this.mainThreadListeners) {
                        copyListeners(this.mainThreadListeners, sparseArray);
                    }
                } else if (listenerType == ListenerType.SUB) {
                    synchronized (this.subThreadListeners) {
                        copyListeners(this.subThreadListeners, sparseArray);
                    }
                } else if (listenerType == ListenerType.NOTIFICATION) {
                    synchronized (this.notificationListeners) {
                        copyListeners(this.notificationListeners, sparseArray);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public DownloadTask subThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.subThreadListeners) {
                this.subThreadListeners.put(i, iDownloadListener);
            }
            this.singleListenerMap.put(ListenerType.SUB, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, ListenerType.SUB);
            }
        }
        return this;
    }

    public void addDownloadListener(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        Map<ListenerType, IDownloadListener> map;
        if (iDownloadListener != null) {
            if (z && (map = this.singleListenerMap) != null) {
                map.put(listenerType, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    this.singleListenerHashCodeMap.put(i, listenerType);
                }
            }
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(listenerType);
            if (downloadListeners != null) {
                synchronized (downloadListeners) {
                    downloadListeners.put(i, iDownloadListener);
                }
            }
        }
    }

    public void removeDownloadListener(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        int indexOfValue;
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(listenerType);
        if (downloadListeners != null) {
            synchronized (downloadListeners) {
                if (z) {
                    if (this.singleListenerMap.containsKey(listenerType)) {
                        iDownloadListener = this.singleListenerMap.get(listenerType);
                        this.singleListenerMap.remove(listenerType);
                    }
                    if (iDownloadListener != null && (indexOfValue = downloadListeners.indexOfValue(iDownloadListener)) >= 0 && indexOfValue < downloadListeners.size()) {
                        downloadListeners.removeAt(indexOfValue);
                    }
                } else {
                    downloadListeners.remove(i);
                    synchronized (this.singleListenerHashCodeMap) {
                        ListenerType listenerType2 = this.singleListenerHashCodeMap.get(i);
                        if (listenerType2 != null && this.singleListenerMap.containsKey(listenerType2)) {
                            this.singleListenerMap.remove(listenerType2);
                            this.singleListenerHashCodeMap.remove(i);
                        }
                    }
                }
            }
        } else if (z && this.singleListenerMap.containsKey(listenerType)) {
            this.singleListenerMap.remove(listenerType);
        }
    }
}
