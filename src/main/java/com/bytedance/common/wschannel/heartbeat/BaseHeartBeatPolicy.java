package com.bytedance.common.wschannel.heartbeat;

import android.os.Handler;
import com.bytedance.common.wschannel.heartbeat.model.IHeartBeatMeta;

public abstract class BaseHeartBeatPolicy<T extends IHeartBeatMeta> implements IHeartBeatPolicy {
    protected T mMeta;

    public abstract void init(HeartBeatReactListener heartBeatReactListener, Handler handler);

    public BaseHeartBeatPolicy(T t) {
        this.mMeta = t;
    }
}
