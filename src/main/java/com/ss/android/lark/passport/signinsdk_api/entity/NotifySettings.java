package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;

public class NotifySettings implements Serializable {
    private boolean disableMobileNotify;
    private boolean stillNotifyAt;

    public boolean isDisableMobileNotify() {
        return this.disableMobileNotify;
    }

    public boolean isStillNotifyAt() {
        return this.stillNotifyAt;
    }

    public void setDisableMobileNotify(boolean z) {
        this.disableMobileNotify = z;
    }

    public void setStillNotifyAt(boolean z) {
        this.stillNotifyAt = z;
    }
}
