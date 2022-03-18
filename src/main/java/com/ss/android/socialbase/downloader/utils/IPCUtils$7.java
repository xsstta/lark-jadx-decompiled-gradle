package com.ss.android.socialbase.downloader.utils;

import android.net.Uri;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60031i;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider;

/* access modifiers changed from: package-private */
public class IPCUtils$7 extends IDownloadAidlFileProvider.Stub {
    final /* synthetic */ AbstractC60031i val$fileUriProvider;

    IPCUtils$7(AbstractC60031i iVar) {
        this.val$fileUriProvider = iVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider
    public Uri getUriForFile(String str, String str2) throws RemoteException {
        return this.val$fileUriProvider.mo204513a(str, str2);
    }
}
