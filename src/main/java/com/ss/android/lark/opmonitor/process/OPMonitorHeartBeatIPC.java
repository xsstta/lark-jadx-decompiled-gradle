package com.ss.android.lark.opmonitor.process;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.opmonitor.api.AbstractC48904a;
import com.ss.android.lark.opmonitor.model.OPMonitorHeartBeatMonitorData;
import com.ss.android.lark.opmonitor.service.C48921c;

@RemoteServiceImpl(service = IOPMonitorHeartBeatIPC.class)
public class OPMonitorHeartBeatIPC implements IOPMonitorHeartBeatIPC {
    @Override // com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC
    public void endHeartBeat(String str) {
        C48921c.m192733a().mo170853a(str);
    }

    @Override // com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC
    public void setLarkStatus(boolean z) {
        C48921c.m192733a().mo170855a(z);
    }

    public OPMonitorHeartBeatIPC(Context context) {
        Log.m165389i("OPMonitorHeartBeatIPC", "OPMonitorHeartBeatIPC constructor... context:" + context);
    }

    @Override // com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC
    public void registerHeartBeat(OPMonitorHeartBeatMonitorData oPMonitorHeartBeatMonitorData, AbstractC48904a aVar) {
        Log.m165389i("OPMonitorHeartBeatIPC", "registerHeartBeat source:" + oPMonitorHeartBeatMonitorData.mo170785b());
        C48921c.m192733a().mo170852a(oPMonitorHeartBeatMonitorData, aVar);
    }
}
