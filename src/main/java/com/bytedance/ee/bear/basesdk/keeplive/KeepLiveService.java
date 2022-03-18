package com.bytedance.ee.bear.basesdk.keeplive;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.bytedance.ee.bear.facade.common.BaseService;
import com.bytedance.ee.log.C13479a;

public class KeepLiveService extends BaseService {
    @Override // com.bytedance.ee.bear.facade.common.BaseService
    public void onCreate() {
        super.onCreate();
        C13479a.m54764b("KeepLiveService", "onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("KeepLiveService", "onDestroy");
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.keeplive.KeepLiveService$a */
    public class BinderC4488a extends Binder {
        public BinderC4488a() {
        }
    }

    public IBinder onBind(Intent intent) {
        if (intent != null) {
            C13479a.m54764b("KeepLiveService", "onBind. intent = ");
        }
        return new BinderC4488a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C13479a.m54764b("KeepLiveService", "onStartCommand. intent = " + intent + ", flags = " + i + ", startId = " + i2);
        return 2;
    }
}
