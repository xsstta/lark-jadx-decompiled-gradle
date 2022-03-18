package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60029g;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler;

/* access modifiers changed from: package-private */
public class IPCUtils$9 extends IDownloadDiskSpaceAidlHandler.Stub {
    final /* synthetic */ AbstractC60029g val$diskSpaceHandler;

    IPCUtils$9(AbstractC60029g gVar) {
        this.val$diskSpaceHandler = gVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler
    public boolean cleanUpDisk(long j, long j2, IDownloadDiskSpaceAidlCallback iDownloadDiskSpaceAidlCallback) throws RemoteException {
        return this.val$diskSpaceHandler.mo204511a(j, j2, C60162e.m233843a(iDownloadDiskSpaceAidlCallback));
    }
}
