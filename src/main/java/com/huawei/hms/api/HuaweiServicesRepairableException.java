package com.huawei.hms.api;

import android.content.Intent;

public class HuaweiServicesRepairableException extends UserRecoverableException {

    /* renamed from: b */
    private final int f57851b;

    public int getConnectionStatusCode() {
        return this.f57851b;
    }

    public HuaweiServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.f57851b = i;
    }
}
