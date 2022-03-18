package com.bytedance.common.wschannel.heartbeat;

public interface HeartBeatReactListener {
    void onHeartBeatTimeout();

    void onSendPing();
}
