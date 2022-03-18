package com.bytedance.ee.bear.middleground.permission.setting.manager;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;

public class CheckLockResult extends NetService.Result<Serializable> {
    private boolean needLock;

    public CheckLockResult() {
    }

    public boolean isNeedLock() {
        return this.needLock;
    }

    public void setNeedLock(boolean z) {
        this.needLock = z;
    }

    public CheckLockResult(boolean z) {
        this.needLock = z;
    }
}
