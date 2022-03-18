package com.ss.android.socialbase.downloader.utils;

import com.ss.android.socialbase.downloader.depend.AbstractC60032j;
import com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback;
import java.util.List;

/* access modifiers changed from: package-private */
public class IPCUtils$23 extends IDownloadForbiddenAidlCallback.Stub {
    final /* synthetic */ AbstractC60032j val$forbiddenCallback;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback
    public boolean hasCallback() {
        return this.val$forbiddenCallback.mo204503a();
    }

    IPCUtils$23(AbstractC60032j jVar) {
        this.val$forbiddenCallback = jVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback
    public void onCallback(List<String> list) {
        this.val$forbiddenCallback.mo204502a(list);
    }
}
