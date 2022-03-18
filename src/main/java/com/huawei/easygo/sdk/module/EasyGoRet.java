package com.huawei.easygo.sdk.module;

import android.os.Bundle;

public class EasyGoRet {
    public int code;
    public Bundle result = new Bundle();

    public EasyGoRet(com.huawei.easygo.module.EasyGoRet easyGoRet) {
        if (easyGoRet != null) {
            this.code = easyGoRet.code;
            this.result = easyGoRet.result;
        }
    }

    public EasyGoRet(int i, Bundle bundle) {
        this.code = i;
        this.result = bundle;
    }
}
