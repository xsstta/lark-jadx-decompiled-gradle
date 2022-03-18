package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60027e;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* access modifiers changed from: package-private */
public class IPCUtils$11 extends IDownloadAidlDepend.Stub {
    final /* synthetic */ AbstractC60027e val$depend;

    IPCUtils$11(AbstractC60027e eVar) {
        this.val$depend = eVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend
    public void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) throws RemoteException {
        this.val$depend.mo204509a(downloadInfo, baseException, i);
    }
}
