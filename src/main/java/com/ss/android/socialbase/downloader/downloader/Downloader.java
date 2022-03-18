package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.AbstractC60025c;
import com.ss.android.socialbase.downloader.depend.AbstractC60031i;
import com.ss.android.socialbase.downloader.depend.AbstractC60036n;
import com.ss.android.socialbase.downloader.depend.AbstractC60039q;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.utils.C60158a;
import java.util.List;

public class Downloader {
    private static volatile Downloader instance;

    private Downloader() {
    }

    public void destoryDownloader() {
        C60046b.m232957a();
    }

    public AbstractC60066p getReserveWifiStatusListener() {
        return C60046b.m232948J();
    }

    public void pauseAll() {
        C60048c.m233017a().mo204695c();
    }

    public boolean isDownloadCacheSyncSuccess() {
        return C60048c.m233017a().mo204702e();
    }

    public boolean isHttpServiceInit() {
        return C60048c.m233017a().mo204700d();
    }

    public void setDownloadInMultiProcess() {
        if (C60158a.m233738a(4194304)) {
            synchronized (this) {
                C60046b.m232982b();
            }
            return;
        }
        C60046b.m232982b();
    }

    public void setReserveWifiStatusListener(AbstractC60066p pVar) {
        C60046b.m232972a(pVar);
    }

    Downloader(C60056f fVar) {
        C60046b.m232966a(fVar);
    }

    public void cancel(int i) {
        cancel(i, true);
    }

    public void forceDownloadIngoreRecommendSize(int i) {
        C60048c.m233017a().mo204711m(i);
    }

    public void pause(int i) {
        C60048c.m233017a().mo204698d(i);
    }

    public void registerDownloadCacheSyncListener(AbstractC60025c cVar) {
        C60048c.m233017a().mo204679a(cVar);
    }

    public void registerDownloaderProcessConnectedListener(AbstractC60039q qVar) {
        C60048c.m233017a().mo204680a(qVar);
    }

    public void restart(int i) {
        C60048c.m233017a().mo204705g(i);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        C60048c.m233017a().mo204682a(list);
    }

    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        C60048c.m233017a().mo204692b(list);
    }

    public void resume(int i) {
        C60048c.m233017a().mo204704f(i);
    }

    public void setLogLevel(int i) {
        C60048c.m233017a().mo204713o(i);
    }

    public void unRegisterDownloadCacheSyncListener(AbstractC60025c cVar) {
        C60048c.m233017a().mo204690b(cVar);
    }

    public void unRegisterDownloaderProcessConnectedListener(AbstractC60039q qVar) {
        C60048c.m233017a().mo204691b(qVar);
    }

    public static DownloadTask with(Context context) {
        getInstance(context);
        return new DownloadTask();
    }

    public boolean canResume(int i) {
        return C60048c.m233017a().mo204703e(i);
    }

    public void clearDownloadData(int i) {
        C60048c.m233017a().mo204699d(i, true);
    }

    public long getCurBytes(int i) {
        return C60048c.m233017a().mo204706h(i);
    }

    public AbstractC60031i getDownloadFileUriProvider(int i) {
        return C60048c.m233017a().mo204715q(i);
    }

    public DownloadInfo getDownloadInfo(int i) {
        return C60048c.m233017a().mo204709k(i);
    }

    public List<DownloadInfo> getDownloadInfoList(String str) {
        return C60048c.m233017a().mo204673a(str);
    }

    public AbstractC60036n getDownloadNotificationEventListener(int i) {
        return C60048c.m233017a().mo204710l(i);
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        return C60048c.m233017a().mo204701e(str);
    }

    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        return C60048c.m233017a().mo204686b(str);
    }

    public int getStatus(int i) {
        return C60048c.m233017a().mo204707i(i);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return C60048c.m233017a().mo204694c(str);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return C60048c.m233017a().mo204697d(str);
    }

    public boolean isDownloadServiceForeground(int i) {
        return C60048c.m233017a().mo204693c(i).mo204803b();
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return C60048c.m233017a().mo204683a(downloadInfo);
    }

    public void removeTaskMainListener(int i) {
        C60048c.m233017a().mo204675a(i, null, ListenerType.MAIN, true);
    }

    public void removeTaskNotificationListener(int i) {
        C60048c.m233017a().mo204675a(i, null, ListenerType.NOTIFICATION, true);
    }

    public void removeTaskSubListener(int i) {
        C60048c.m233017a().mo204675a(i, null, ListenerType.SUB, true);
    }

    public static Downloader getInstance(Context context) {
        if (instance == null) {
            synchronized (Downloader.class) {
                if (instance == null) {
                    C60046b.m232958a(context);
                    instance = new Downloader();
                }
            }
        }
        return instance;
    }

    public static synchronized void init(C60056f fVar) {
        synchronized (Downloader.class) {
            if (fVar != null) {
                if (instance == null) {
                    instance = fVar.mo204742A();
                } else {
                    C60046b.m232966a(fVar);
                }
            }
        }
    }

    public boolean isDownloading(int i) {
        boolean j;
        if (!C60158a.m233738a(4194304)) {
            return C60048c.m233017a().mo204708j(i);
        }
        synchronized (this) {
            j = C60048c.m233017a().mo204708j(i);
        }
        return j;
    }

    public void clearDownloadData(int i, boolean z) {
        C60048c.m233017a().mo204699d(i, z);
    }

    public void setDownloadNotificationEventListener(int i, AbstractC60036n nVar) {
        C60048c.m233017a().mo204677a(i, nVar);
    }

    public void setThrottleNetSpeed(int i, long j) {
        C60048c.m233017a().mo204674a(i, j);
    }

    public void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204688b(i, iDownloadListener, ListenerType.MAIN, false);
        }
    }

    public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204688b(i, iDownloadListener, ListenerType.NOTIFICATION, false);
        }
    }

    public void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204688b(i, iDownloadListener, ListenerType.SUB, false);
        }
    }

    public void cancel(int i, boolean z) {
        C60048c.m233017a().mo204696c(i, z);
    }

    public int getDownloadId(String str, String str2) {
        return C60048c.m233017a().mo204672a(str, str2);
    }

    public void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204675a(i, iDownloadListener, ListenerType.MAIN, false);
        }
    }

    public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204675a(i, iDownloadListener, ListenerType.NOTIFICATION, false);
        }
    }

    public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204675a(i, iDownloadListener, ListenerType.SUB, false);
        }
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204688b(i, iDownloadListener, ListenerType.MAIN, true);
        }
    }

    public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204688b(i, iDownloadListener, ListenerType.NOTIFICATION, true);
        }
    }

    public void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204688b(i, iDownloadListener, ListenerType.SUB, true);
        }
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        return C60048c.m233017a().mo204685b(str, str2);
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener, boolean z) {
        if (iDownloadListener != null) {
            C60048c.m233017a().mo204676a(i, iDownloadListener, ListenerType.MAIN, true, z);
        }
    }
}
