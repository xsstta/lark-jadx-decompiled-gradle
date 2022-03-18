package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60034l;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor;

/* access modifiers changed from: package-private */
public class IPCUtils$14 extends IDownloadAidlInterceptor.Stub {
    final /* synthetic */ AbstractC60034l val$interceptor;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor
    public boolean intercept() throws RemoteException {
        return this.val$interceptor.mo204515a();
    }

    IPCUtils$14(AbstractC60034l lVar) {
        this.val$interceptor = lVar;
    }
}
