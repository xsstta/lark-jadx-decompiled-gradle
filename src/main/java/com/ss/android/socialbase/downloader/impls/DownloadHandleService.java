package com.ss.android.socialbase.downloader.impls;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.socialbase.downloader.downloader.C60046b;

public class DownloadHandleService extends Service {

    /* renamed from: a */
    private static final String f149870a = "DownloadHandleService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C60046b.m232958a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r4 = r4.getIntExtra("extra_download_id", 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m233317a(android.content.Intent r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r4.getAction()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x000e
            return
        L_0x000e:
            r1 = 0
            java.lang.String r2 = "extra_download_id"
            int r4 = r4.getIntExtra(r2, r1)
            if (r4 != 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r1 = "com.ss.android.downloader.action.DOWNLOAD_WAKEUP"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x002d
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.C60046b.m233001k()
            com.ss.android.socialbase.downloader.impls.DownloadHandleService$1 r1 = new com.ss.android.socialbase.downloader.impls.DownloadHandleService$1
            r1.<init>(r4)
            r0.execute(r1)
            goto L_0x0048
        L_0x002d:
            java.lang.String r1 = "com.ss.android.downloader.action.PROCESS_NOTIFY"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003d
            com.ss.android.socialbase.downloader.downloader.c r0 = com.ss.android.socialbase.downloader.downloader.C60048c.m233017a()
            r0.mo204714p(r4)
            goto L_0x0048
        L_0x003d:
            java.lang.String r4 = "com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0048
            com.ss.android.socialbase.downloader.downloader.C60046b.m232982b()
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.DownloadHandleService.m233317a(android.content.Intent):void");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        m233317a(intent);
        return 2;
    }
}
