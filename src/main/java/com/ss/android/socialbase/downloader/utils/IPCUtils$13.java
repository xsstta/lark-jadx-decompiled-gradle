package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator;
import com.ss.android.socialbase.downloader.downloader.AbstractC60058h;

/* access modifiers changed from: package-private */
public class IPCUtils$13 extends IChunkCntAidlCalculator.Stub {
    final /* synthetic */ AbstractC60058h val$cntCalculator;

    IPCUtils$13(AbstractC60058h hVar) {
        this.val$cntCalculator = hVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator
    public int calculateChunkCount(long j) throws RemoteException {
        return this.val$cntCalculator.mo204770a(j);
    }
}
