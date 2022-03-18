package com.bytedance.common.jato.gcblocker;

public abstract class AbsGcBlocker {
    public abstract void requestBlockGc(long j);

    public abstract void startBlockGc(String str);

    public abstract void stopBlockGc(String str);
}
