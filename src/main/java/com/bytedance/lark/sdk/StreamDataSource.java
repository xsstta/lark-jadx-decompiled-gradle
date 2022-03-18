package com.bytedance.lark.sdk;

import com.bytedance.lark.pb.basic.v1.RequestPacket;

public enum StreamDataSource {
    DEFAULT_SMART(1),
    ONCE_LOCAL(2),
    ONCE_NET(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static RequestPacket.BizConfig.DataSource forNumber(int i) {
        if (i == 1) {
            return RequestPacket.BizConfig.DataSource.DEFAULT;
        }
        if (i == 2) {
            return RequestPacket.BizConfig.DataSource.LOCAL;
        }
        if (i != 3) {
            return RequestPacket.BizConfig.DataSource.DEFAULT;
        }
        return RequestPacket.BizConfig.DataSource.PREFERRED_ONLINE;
    }

    public static StreamDataSource valueOf(int i) {
        if (i == 1) {
            return DEFAULT_SMART;
        }
        if (i == 2) {
            return ONCE_LOCAL;
        }
        if (i != 3) {
            return DEFAULT_SMART;
        }
        return ONCE_NET;
    }

    private StreamDataSource(int i) {
        this.value = i;
    }
}
