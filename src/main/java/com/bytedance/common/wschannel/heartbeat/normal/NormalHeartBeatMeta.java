package com.bytedance.common.wschannel.heartbeat.normal;

import com.bytedance.common.wschannel.heartbeat.model.IHeartBeatMeta;

public class NormalHeartBeatMeta implements IHeartBeatMeta<NormalHeartBeatMeta> {
    private long pingInterval;
    private long timeout;

    public NormalHeartBeatMeta() {
    }

    public long getPingInterval() {
        return this.pingInterval;
    }

    public long getTimeout() {
        return this.timeout;
    }

    private static class DefaultNormalHeartBeatMeta extends NormalHeartBeatMeta {
        private DefaultNormalHeartBeatMeta() {
            super(-1, 5000);
        }
    }

    public NormalHeartBeatMeta provideDefaultMeta() {
        return new DefaultNormalHeartBeatMeta();
    }

    /* access modifiers changed from: package-private */
    public void setPingInterval(long j) {
        this.pingInterval = j;
    }

    public NormalHeartBeatMeta(long j, long j2) {
        this.pingInterval = j;
        this.timeout = j2;
    }
}
