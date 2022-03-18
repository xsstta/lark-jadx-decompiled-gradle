package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60040r;
import com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* access modifiers changed from: package-private */
public class IPCUtils$4 extends INotificationClickAidlCallback.Stub {
    final /* synthetic */ AbstractC60040r val$notificationClickCallback;

    IPCUtils$4(AbstractC60040r rVar) {
        this.val$notificationClickCallback = rVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback
    public boolean onClickWhenInstalled(DownloadInfo downloadInfo) throws RemoteException {
        return this.val$notificationClickCallback.mo204527c(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback
    public boolean onClickWhenSuccess(DownloadInfo downloadInfo) throws RemoteException {
        return this.val$notificationClickCallback.mo204526b(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback
    public boolean onClickWhenUnSuccess(DownloadInfo downloadInfo) throws RemoteException {
        return this.val$notificationClickCallback.mo204525a(downloadInfo);
    }
}
