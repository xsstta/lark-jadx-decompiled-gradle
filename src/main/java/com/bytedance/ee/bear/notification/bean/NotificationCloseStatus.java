package com.bytedance.ee.bear.notification.bean;

import com.bytedance.ee.util.io.NonProguard;

public class NotificationCloseStatus implements NonProguard {
    private boolean close;

    public boolean isClose() {
        return this.close;
    }

    public void setClose(boolean z) {
        this.close = z;
    }
}
