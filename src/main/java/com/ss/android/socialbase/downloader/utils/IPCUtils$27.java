package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60028f;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback;

/* access modifiers changed from: package-private */
public class IPCUtils$27 extends IDownloadDiskSpaceAidlCallback.Stub {
    final /* synthetic */ AbstractC60028f val$diskSpaceCallback;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback
    public void onDiskCleaned() throws RemoteException {
        this.val$diskSpaceCallback.mo204510a();
    }

    IPCUtils$27(AbstractC60028f fVar) {
        this.val$diskSpaceCallback = fVar;
    }
}
