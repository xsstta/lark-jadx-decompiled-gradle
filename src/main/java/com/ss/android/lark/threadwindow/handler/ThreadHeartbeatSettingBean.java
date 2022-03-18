package com.ss.android.lark.threadwindow.handler;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class ThreadHeartbeatSettingBean implements Serializable {
    private static final long serialVersionUID = -3151896304216603498L;
    @JSONField(name = "analysis_heartbeat_interval")
    private int heartbeatInterval;

    public int getHeartbeatInterval() {
        return this.heartbeatInterval;
    }

    public void setHeartbeatInterval(int i) {
        this.heartbeatInterval = i;
    }
}
