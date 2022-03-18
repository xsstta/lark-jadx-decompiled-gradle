package com.ss.ttm.player;

public interface IPlayerNotifyer {
    void handleErrorNotify(long j, int i, int i2, String str);

    void handlePlayerNotify(long j, int i, int i2, int i3, String str);
}
