package com.ss.android.socialbase.downloader.utils;

import com.ss.android.socialbase.downloader.depend.AbstractC60042t;
import com.ss.android.socialbase.downloader.depend.ProcessAidlCallback;

/* access modifiers changed from: package-private */
public class IPCUtils$24 extends ProcessAidlCallback.Stub {
    final /* synthetic */ AbstractC60042t val$callback;

    IPCUtils$24(AbstractC60042t tVar) {
        this.val$callback = tVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.ProcessAidlCallback
    public void callback(int i, int i2) {
        this.val$callback.mo204530a(i, i2);
    }
}
