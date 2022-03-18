package com.ss.android.lark.platform.batterymonitor.dozeipc;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.C51721b;
import com.ss.android.lark.wschannelprocess.IWschannelProcIPCServer;
import ee.android.framework.manis.C68183b;

/* renamed from: com.ss.android.lark.platform.batterymonitor.dozeipc.a */
public class C51750a {
    /* renamed from: a */
    public void mo177869a(final boolean z) {
        Log.m165389i("BatteryMonitor", "dealMainProcDozeStateChange bDoze " + z);
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.platform.batterymonitor.dozeipc.C51750a.RunnableC517511 */

            public void run() {
                IWschannelProcIPCServer iWschannelProcIPCServer = (IWschannelProcIPCServer) C68183b.m264839a().mo237086a(C51721b.m200560g().mo177815c(), IWschannelProcIPCServer.class);
                if (iWschannelProcIPCServer == null) {
                    Log.m165383e("BatteryMonitor", "dealMainProcDozeStateChange  get wschannelIPCClient is null");
                    return;
                }
                Log.m165389i("BatteryMonitor", "dealMainProcDoeStateChange begin deal main proc doze state change, bDoze is " + z);
                iWschannelProcIPCServer.dealMainProcDozeStateChange(z);
            }
        });
    }
}
