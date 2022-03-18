package com.ss.android.lark.opmonitor.process;

import com.ss.android.lark.manis.annotation.RemoteService;
import com.ss.android.lark.opmonitor.api.AbstractC48904a;
import com.ss.android.lark.opmonitor.model.OPMonitorHeartBeatMonitorData;

@RemoteService
public interface IOPMonitorHeartBeatIPC {
    void endHeartBeat(String str);

    void registerHeartBeat(OPMonitorHeartBeatMonitorData oPMonitorHeartBeatMonitorData, AbstractC48904a aVar);

    void setLarkStatus(boolean z);
}
