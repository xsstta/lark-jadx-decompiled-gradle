package com.ss.android.lark.wschannelprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.util.concurrent.TimeUnit;

public class WschannelLaunchService extends Service {
    public void onCreate() {
        Log.m165389i("WschannelLaunchService", "onCreate");
        super.onCreate();
    }

    /* renamed from: a */
    private void m230228a() {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.wschannelprocess.WschannelLaunchService.RunnableC592831 */

            public void run() {
                Log.m165389i("WschannelLaunchService", "setupGlobalAppstateObserver");
                C59294a.m230246a().mo201567a(WschannelLaunchService.this.getApplicationContext());
            }
        }, 2, TimeUnit.SECONDS);
    }

    public IBinder onBind(Intent intent) {
        Log.m165389i("WschannelLaunchService", "onBind");
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.m165389i("WschannelLaunchService", "onStartCommand");
        if (intent != null) {
            m230228a();
        } else {
            Log.m165389i("WschannelLaunchService", "onStartCommand intent is null");
        }
        return super.onStartCommand(intent, i, i2);
    }
}
