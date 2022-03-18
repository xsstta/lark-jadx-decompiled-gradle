package com.huawei.hms.support.api.client;

import android.os.Bundle;

public class BundleResult {
    private int resultCode;
    private Bundle rspBody;

    public int getResultCode() {
        return this.resultCode;
    }

    public Bundle getRspBody() {
        return this.rspBody;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setRspBody(Bundle bundle) {
        this.rspBody = bundle;
    }

    public BundleResult(int i, Bundle bundle) {
        this.resultCode = i;
        this.rspBody = bundle;
    }
}
