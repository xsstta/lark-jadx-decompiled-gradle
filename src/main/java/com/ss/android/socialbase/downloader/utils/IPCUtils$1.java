package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlListener;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback;
import com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator;
import com.ss.android.socialbase.downloader.model.DownloadAidlTask;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* access modifiers changed from: package-private */
public class IPCUtils$1 extends DownloadAidlTask.Stub {
    final /* synthetic */ DownloadTask val$downloadTask;

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public DownloadInfo getDownloadInfo() throws RemoteException {
        return this.val$downloadTask.getDownloadInfo();
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IChunkCntAidlCalculator getChunkStrategy() throws RemoteException {
        return C60162e.m233825a(this.val$downloadTask.getChunkStrategy());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadAidlDepend getDepend() throws RemoteException {
        return C60162e.m233826a(this.val$downloadTask.getDepend());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadDiskSpaceAidlHandler getDiskSpaceHandler() throws RemoteException {
        return C60162e.m233833a(this.val$downloadTask.getDiskSpaceHandler());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadCompleteAidlHandler getDownloadCompleteAidlHandler() throws RemoteException {
        return C60162e.m233831a(this.val$downloadTask.getDownloadCompleteHandler());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadNotificationEventAidlListener getDownloadNotificationEventListener() throws RemoteException {
        return C60162e.m233837a(this.val$downloadTask.getNotificationEventListener());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadAidlFileProvider getFileProvider() throws RemoteException {
        return C60162e.m233827a(this.val$downloadTask.getFileUriProvider());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadForbiddenAidlHandler getForbiddenHandler() throws RemoteException {
        return C60162e.m233835a(this.val$downloadTask.getForbiddenHandler());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadAidlInterceptor getInterceptor() throws RemoteException {
        return C60162e.m233828a(this.val$downloadTask.getInterceptor());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadAidlMonitorDepend getMonitorDepend() throws RemoteException {
        return C60162e.m233830a(this.val$downloadTask.getMonitorDepend());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public INotificationClickAidlCallback getNotificationClickCallback() throws RemoteException {
        return C60162e.m233838a(this.val$downloadTask.getNotificationClickCallback());
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IRetryDelayTimeAidlCalculator getRetryDelayTimeCalculator() throws RemoteException {
        return C60162e.m233839a(this.val$downloadTask.getRetryDelayTimeCalculator());
    }

    IPCUtils$1(DownloadTask downloadTask) {
        this.val$downloadTask = downloadTask;
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public int getDownloadListenerSize(int i) throws RemoteException {
        return this.val$downloadTask.getDownloadListenerSize(C60161d.m233815e(i));
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadAidlListener getSingleDownloadListener(int i) throws RemoteException {
        boolean z;
        IDownloadListener singleDownloadListener = this.val$downloadTask.getSingleDownloadListener(C60161d.m233815e(i));
        if (i == ListenerType.SUB.ordinal()) {
            z = false;
        } else {
            z = true;
        }
        return C60162e.m233829a(singleDownloadListener, z);
    }

    @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
    public IDownloadAidlListener getDownloadListenerByIndex(int i, int i2) throws RemoteException {
        boolean z;
        IDownloadListener downloadListenerByIndex = this.val$downloadTask.getDownloadListenerByIndex(C60161d.m233815e(i), i2);
        if (i == ListenerType.SUB.ordinal()) {
            z = false;
        } else {
            z = true;
        }
        return C60162e.m233829a(downloadListenerByIndex, z);
    }
}
