package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60033k;
import com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback;
import com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler;

/* access modifiers changed from: package-private */
public class IPCUtils$6 extends IDownloadForbiddenAidlHandler.Stub {
    final /* synthetic */ AbstractC60033k val$forbiddenHandler;

    IPCUtils$6(AbstractC60033k kVar) {
        this.val$forbiddenHandler = kVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler
    public boolean onForbidden(IDownloadForbiddenAidlCallback iDownloadForbiddenAidlCallback) throws RemoteException {
        return this.val$forbiddenHandler.mo204514a(C60162e.m233846a(iDownloadForbiddenAidlCallback));
    }
}
