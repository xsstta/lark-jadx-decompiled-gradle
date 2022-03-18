package com.huawei.hms.api;

import android.content.Intent;

public class UserRecoverableException extends Exception {

    /* renamed from: a */
    private final Intent f57861a;

    public Intent getIntent() {
        return new Intent(this.f57861a);
    }

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f57861a = intent;
    }
}
