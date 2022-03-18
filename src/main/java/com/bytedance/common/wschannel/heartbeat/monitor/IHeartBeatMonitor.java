package com.bytedance.common.wschannel.heartbeat.monitor;

public interface IHeartBeatMonitor {
    void onPingFail(Throwable th);

    void onPingSuccess();

    void onPingTimeout();
}
