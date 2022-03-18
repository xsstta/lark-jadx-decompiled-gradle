package com.ss.android.lark.mm.module.player.speed.repo;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.mm.base.IMmSerializable;

public class SilenceDetail implements IMmSerializable {
    @JSONField(name = "start_time")
    private long startTime;
    @JSONField(name = "stop_time")
    private long stopTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setStopTime(long j) {
        this.stopTime = j;
    }
}
