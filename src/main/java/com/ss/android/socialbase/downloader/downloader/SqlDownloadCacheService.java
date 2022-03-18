package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.ss.android.socialbase.downloader.impls.C60090d;

public class SqlDownloadCacheService extends Service {

    /* renamed from: a */
    private static final String f149674a = "SqlDownloadCacheService";

    public void onCreate() {
        super.onCreate();
        C60046b.m232958a(getApplicationContext());
    }

    public IBinder onBind(Intent intent) {
        AbstractC60068r rVar;
        AbstractC60059i t = C60046b.m233010t();
        if (t instanceof C60090d) {
            rVar = ((C60090d) t).mo204938b();
        } else if (t instanceof AbstractC60068r) {
            rVar = (AbstractC60068r) t;
        } else {
            rVar = null;
        }
        if (rVar instanceof IBinder) {
            return (IBinder) rVar;
        }
        return new Binder();
    }

    /* renamed from: a */
    public static void m232921a(Context context, ServiceConnection serviceConnection) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, SqlDownloadCacheService.class);
                if (serviceConnection != null) {
                    context.bindService(intent, serviceConnection, 1);
                }
                context.startService(intent);
            } catch (Throwable th) {
                Log.w(f149674a, "startServiceAndBind fail", th);
            }
        }
    }
}
