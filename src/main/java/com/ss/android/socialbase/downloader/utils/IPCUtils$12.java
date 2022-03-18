package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.AbstractC60024b;
import com.ss.android.socialbase.downloader.depend.AbstractC60035m;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class IPCUtils$12 extends IDownloadAidlMonitorDepend.Stub {
    final /* synthetic */ AbstractC60035m val$depend;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend
    public String getEventPage() throws RemoteException {
        return this.val$depend.mo204517b();
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend
    public int[] getAdditionalMonitorStatus() throws RemoteException {
        AbstractC60035m mVar = this.val$depend;
        if (mVar instanceof AbstractC60024b) {
            return ((AbstractC60024b) mVar).mo204504a();
        }
        return null;
    }

    IPCUtils$12(AbstractC60035m mVar) {
        this.val$depend = mVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend
    public void monitorLogSend(String str) throws RemoteException {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.val$depend.mo204516a(new JSONObject(str));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
