package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator;
import com.ss.android.socialbase.downloader.downloader.AbstractC60067q;

/* access modifiers changed from: package-private */
public class IPCUtils$5 extends IRetryDelayTimeAidlCalculator.Stub {
    final /* synthetic */ AbstractC60067q val$retryDelayTimeCalculator;

    IPCUtils$5(AbstractC60067q qVar) {
        this.val$retryDelayTimeCalculator = qVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator
    public long calculateRetryDelayTime(int i, int i2) throws RemoteException {
        return this.val$retryDelayTimeCalculator.mo204838a(i, i2);
    }
}
