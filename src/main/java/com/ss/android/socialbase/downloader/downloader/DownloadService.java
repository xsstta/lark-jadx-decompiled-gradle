package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public class DownloadService extends Service {

    /* renamed from: b */
    private static final String f149668b = "DownloadService";

    /* renamed from: a */
    protected AbstractC60064n f149669a;

    public void onCreate() {
        super.onCreate();
        C60046b.m232958a(this);
        AbstractC60064n u = C60046b.m233011u();
        this.f149669a = u;
        u.mo204659a(new WeakReference(this));
    }

    public void onDestroy() {
        if (C59990a.m232836a()) {
            C59990a.m232838b(f149668b, "Service onDestroy");
        }
        AbstractC60064n nVar = this.f149669a;
        if (nVar != null) {
            nVar.mo204666d();
            this.f149669a = null;
        }
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        boolean z;
        String str = f149668b;
        StringBuilder sb = new StringBuilder();
        sb.append("onBind downloadServiceHandler != null:");
        if (this.f149669a != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C59990a.m232838b(str, sb.toString());
        AbstractC60064n nVar = this.f149669a;
        if (nVar != null) {
            return nVar.mo204652a(intent);
        }
        return null;
    }

    public int onStartCommand(final Intent intent, final int i, final int i2) {
        if (C59990a.m232836a()) {
            C59990a.m232838b(f149668b, "DownloadService onStartCommand");
        }
        this.f149669a.mo204664c();
        ExecutorService k = C60046b.m233001k();
        if (k == null) {
            return 3;
        }
        k.execute(new Runnable() {
            /* class com.ss.android.socialbase.downloader.downloader.DownloadService.RunnableC600431 */

            public void run() {
                if (DownloadService.this.f149669a != null) {
                    DownloadService.this.f149669a.mo204656a(intent, i, i2);
                }
            }
        });
        return 3;
    }
}
