package com.tt.miniapphost.process;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.process.base.EmptyBinder;

public class HostCrossProcessCallService extends Service {
    public IBinder onBind(Intent intent) {
        AppBrandLogger.m52830i("HostCrossProcessCallService", "onBind");
        IBinder hostProcessCrossProcessCallBinder = ContextSingletonInstance.getInstance().getHostProcessSupport().getHostProcessCrossProcessCallBinder();
        if (hostProcessCrossProcessCallBinder == null) {
            AppBrandLogger.m52829e("HostCrossProcessCallService", "未正确获取的跨进程通信 Binder");
            return new EmptyBinder();
        }
        AppBrandLogger.m52830i("HostCrossProcessCallService", "返回正确的跨进程通信 Binder");
        return hostProcessCrossProcessCallBinder;
    }
}
