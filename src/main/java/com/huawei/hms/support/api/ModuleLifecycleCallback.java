package com.huawei.hms.support.api;

import android.content.Context;

public interface ModuleLifecycleCallback {
    void onCreated(Context context);

    void onDestroyed(Context context);
}
