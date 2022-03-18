package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60036n;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* access modifiers changed from: package-private */
public class IPCUtils$3 extends IDownloadNotificationEventAidlListener.Stub {
    final /* synthetic */ AbstractC60036n val$notificationEventListener;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
    public String getNotifyProcessName() throws RemoteException {
        return this.val$notificationEventListener.mo204518a();
    }

    IPCUtils$3(AbstractC60036n nVar) {
        this.val$notificationEventListener = nVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
    public boolean interceptAfterNotificationSuccess(boolean z) throws RemoteException {
        return this.val$notificationEventListener.mo204520a(z);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener
    public void onNotificationEvent(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
        this.val$notificationEventListener.mo204519a(i, downloadInfo, str, str2);
    }
}
