package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60026d;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* access modifiers changed from: package-private */
public class IPCUtils$17 extends IDownloadCompleteAidlHandler.Stub {
    final /* synthetic */ AbstractC60026d val$downloadCompleteHandler;

    IPCUtils$17(AbstractC60026d dVar) {
        this.val$downloadCompleteHandler = dVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler
    public boolean needHandle(DownloadInfo downloadInfo) throws RemoteException {
        return this.val$downloadCompleteHandler.mo204508b(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler
    public void handle(DownloadInfo downloadInfo) throws RemoteException {
        try {
            this.val$downloadCompleteHandler.mo204507a(downloadInfo);
        } catch (BaseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
