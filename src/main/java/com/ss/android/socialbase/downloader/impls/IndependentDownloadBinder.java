package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlListener;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback;
import com.ss.android.socialbase.downloader.depend.ProcessAidlCallback;
import com.ss.android.socialbase.downloader.downloader.AbstractC60062l;
import com.ss.android.socialbase.downloader.downloader.C60048c;
import com.ss.android.socialbase.downloader.downloader.IDownloadAidlService;
import com.ss.android.socialbase.downloader.model.DownloadAidlTask;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.C60161d;
import com.ss.android.socialbase.downloader.utils.C60162e;
import java.util.List;

public class IndependentDownloadBinder extends IDownloadAidlService.Stub {
    private static final String TAG = "IndependentDownloadBinder";
    private final AbstractC60062l downloadProxy = new C60108o(true);

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void clearData() throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204817f();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean isDownloadCacheSyncSuccess() throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204815e();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean isHttpServiceInit() throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204808c();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean isServiceForeground() throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204803b();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void pauseAll() throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204776a();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204802b(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void addDownloadChunk(DownloadChunk downloadChunk) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204790a(downloadChunk);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void addProcessCallback(ProcessAidlCallback processAidlCallback) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204789a(C60162e.m233852a(processAidlCallback));
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean canResume(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204804b(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void forceDownloadIngoreRecommendSize(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204822j(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public long getCurBytes(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return 0;
        }
        return lVar.mo204813e(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public List<DownloadChunk> getDownloadChunk(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return lVar.mo204821i(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public IDownloadAidlFileProvider getDownloadFileUriProvider(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return C60162e.m233827a(lVar.mo204831s(i));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public DownloadInfo getDownloadInfo(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return lVar.mo204820h(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public List<DownloadInfo> getDownloadInfoList(String str) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return lVar.mo204775a(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public IDownloadNotificationEventAidlListener getDownloadNotificationEventListener(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return C60162e.m233837a(lVar.mo204829q(i));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public int getDownloadWithIndependentProcessStatus(int i) throws RemoteException {
        return C60048c.m233017a().mo204684b(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return lVar.mo204814e(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return lVar.mo204796b(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public INotificationClickAidlCallback getNotificationClickCallback(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return C60162e.m233838a(lVar.mo204830r(i));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public int getStatus(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return 0;
        }
        return lVar.mo204816f(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return lVar.mo204805c(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return lVar.mo204810d(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204794a(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean isDownloading(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204819g(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void pause(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204777a(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void removeAllDownloadChunk(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204827o(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean removeDownloadInfo(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204826n(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean removeDownloadTaskData(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204828p(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void restart(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204812d(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void restartAllFailedDownloadTasks(List<String> list) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204792a(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void resume(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204806c(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean retryDelayStart(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204824l(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void setLogLevel(int i) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204823k(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void stopForeground(boolean z) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204793a(true, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void tryDownload(DownloadAidlTask downloadAidlTask) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204801b(C60162e.m233856a(downloadAidlTask));
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public boolean updateDownloadInfo(DownloadInfo downloadInfo) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return false;
        }
        return lVar.mo204809c(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void setDownloadWithIndependentProcessStatus(int i, boolean z) throws RemoteException {
        C60048c.m233017a().mo204689b(i, z);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void cancel(int i, boolean z) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204788a(i, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void clearDownloadData(int i, boolean z) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204799b(i, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void dispatchProcessCallback(int i, int i2) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204778a(i, i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public int getDownloadId(String str, String str2) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return 0;
        }
        return lVar.mo204774a(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public DownloadInfo getDownloadInfoByUrlAndPath(String str, String str2) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar == null) {
            return null;
        }
        return lVar.mo204795b(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void resetDownloadData(int i, boolean z) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204799b(i, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void setDownloadNotificationEventListener(int i, IDownloadNotificationEventAidlListener iDownloadNotificationEventAidlListener) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204786a(i, C60162e.m233850a(iDownloadNotificationEventAidlListener));
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void setThrottleNetSpeed(int i, long j) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204784a(i, j);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void startForeground(int i, Notification notification) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204785a(i, notification);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void syncDownloadChunks(int i, List<DownloadChunk> list) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204787a(i, list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204798b(i, list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void updateDownloadChunk(int i, int i2, long j) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204781a(i, i2, j);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void updateSubDownloadChunk(int i, int i2, int i3, long j) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204780a(i, i2, i3, j);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204779a(i, i2, i3, i4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void addDownloadListener(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204782a(i, i2, C60162e.m233836a(iDownloadAidlListener), C60161d.m233815e(i3), z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void removeDownloadListener(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204797b(i, i2, C60162e.m233836a(iDownloadAidlListener), C60161d.m233815e(i3), z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
    public void addDownloadListener1(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z, boolean z2) throws RemoteException {
        AbstractC60062l lVar = this.downloadProxy;
        if (lVar != null) {
            lVar.mo204783a(i, i2, C60162e.m233836a(iDownloadAidlListener), C60161d.m233815e(i3), z, z2);
        }
    }
}
