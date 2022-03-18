package com.bytedance.common.wschannel.heartbeat.monitor;

public class HeartBeatMonitor implements IHeartBeatMonitor {
    private IHeartBeatMonitor heartBeatMonitor;

    /* access modifiers changed from: private */
    public static final class SingletonHolder {
        public static final HeartBeatMonitor instance = new HeartBeatMonitor();
    }

    private HeartBeatMonitor() {
    }

    public static HeartBeatMonitor getInstance() {
        return SingletonHolder.instance;
    }

    @Override // com.bytedance.common.wschannel.heartbeat.monitor.IHeartBeatMonitor
    public void onPingSuccess() {
        IHeartBeatMonitor iHeartBeatMonitor = this.heartBeatMonitor;
        if (iHeartBeatMonitor != null) {
            iHeartBeatMonitor.onPingSuccess();
        }
    }

    @Override // com.bytedance.common.wschannel.heartbeat.monitor.IHeartBeatMonitor
    public void onPingTimeout() {
        IHeartBeatMonitor iHeartBeatMonitor = this.heartBeatMonitor;
        if (iHeartBeatMonitor != null) {
            iHeartBeatMonitor.onPingTimeout();
        }
    }

    public void setHeartBeatMonitor(IHeartBeatMonitor iHeartBeatMonitor) {
        this.heartBeatMonitor = iHeartBeatMonitor;
    }

    @Override // com.bytedance.common.wschannel.heartbeat.monitor.IHeartBeatMonitor
    public void onPingFail(Throwable th) {
        IHeartBeatMonitor iHeartBeatMonitor = this.heartBeatMonitor;
        if (iHeartBeatMonitor != null) {
            iHeartBeatMonitor.onPingFail(th);
        }
    }
}
