package com.miui.easygo.sdk.module;

import android.os.Bundle;

public class EasyGoRet {
    public int code;
    public Bundle result = new Bundle();

    public EasyGoRet() {
    }

    public EasyGoRet(int i, Bundle bundle) {
        this.code = i;
        this.result = bundle;
    }
}
