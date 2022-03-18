package com.ss.android.lark.platform.batterymonitor.dozeipc;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.platform.batterymonitor.C51721b;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.wschannelprocess.IMainProcIPCServer;
import com.ss.android.lark.wschannelprocess.dto.AppLogEntity;
import com.ss.android.lark.wschannelprocess.dto.TeaLogEntity;
import java.util.List;
import org.json.JSONObject;

@RemoteServiceImpl(service = IMainProcIPCServer.class)
public class MainProcDozeModuleIPCServer implements IMainProcIPCServer {
    public static String TAG = "MainVsWsProcessModuleIPCServer";

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public boolean getMainProcDozeState() {
        Log.m165389i("BatteryMonitor", getClass().getName() + " getMainProcDozeState call");
        return C51721b.m200560g().mo177826h();
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public void removeMainProcDozeStateForWhile() {
        Log.m165389i("BatteryMonitor", getClass().getName() + " removeMainProcDozeStateForWhile call");
        C51721b.m200560g().mo177829k();
    }

    public MainProcDozeModuleIPCServer(Context context) {
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public void uploadAppLogRecord(final List<AppLogEntity> list) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.platform.batterymonitor.dozeipc.MainProcDozeModuleIPCServer.RunnableC517481 */

            public void run() {
                String str = MainProcDozeModuleIPCServer.TAG;
                Log.m165389i(str, "upload applog record begin: records size: " + list.size());
                for (AppLogEntity appLogEntity : list) {
                    try {
                        AppLogProxy.onEvent(appLogEntity.mo201593a(), appLogEntity.mo201594b(), appLogEntity.mo201595c(), appLogEntity.mo201596d(), appLogEntity.mo201598e(), new JSONObject(appLogEntity.mo201599f()));
                        Log.m165389i(MainProcDozeModuleIPCServer.TAG, "upload applog record finish");
                    } catch (Exception unused) {
                        Log.m165383e(MainProcDozeModuleIPCServer.TAG, "wschannel applog record json object parse error!");
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.wschannelprocess.IMainProcIPCServer
    public void uploadTeaRecord(final List<TeaLogEntity> list) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.platform.batterymonitor.dozeipc.MainProcDozeModuleIPCServer.RunnableC517492 */

            public void run() {
                String str = MainProcDozeModuleIPCServer.TAG;
                Log.m165389i(str, "upload tea record begin: records size: " + list.size());
                for (TeaLogEntity teaLogEntity : list) {
                    try {
                        Statistics.sendEvent(teaLogEntity.mo201606a(), new JSONObject(teaLogEntity.mo201607b()));
                        Log.m165389i(MainProcDozeModuleIPCServer.TAG, "upload tea record finish");
                    } catch (Exception unused) {
                        Log.m165383e(MainProcDozeModuleIPCServer.TAG, "wschannel applog record json object parse error!");
                    }
                }
            }
        });
    }
}
