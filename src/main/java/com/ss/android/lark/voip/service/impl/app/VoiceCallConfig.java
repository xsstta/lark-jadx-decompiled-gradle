package com.ss.android.lark.voip.service.impl.app;

import java.io.Serializable;

public class VoiceCallConfig implements Serializable {
    private int heartBeatCycle;
    private int heartBeatExpireTime;

    public int getHeartBeatCycle() {
        return this.heartBeatCycle;
    }

    public int getHeartBeatExpireTime() {
        return this.heartBeatExpireTime;
    }

    public void setHeartBeatCycle(int i) {
        this.heartBeatCycle = i;
    }

    public void setHeartBeatExpireTime(int i) {
        this.heartBeatExpireTime = i;
    }

    public VoiceCallConfig(int i, int i2) {
        this.heartBeatCycle = i;
        this.heartBeatExpireTime = i2;
    }
}
