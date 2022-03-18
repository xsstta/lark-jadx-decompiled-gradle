package com.huawei.hms.feature.dynamic;

import com.huawei.hms.feature.dynamic.LifecycleDelegate;

public interface OnDelegateCreatedListener<T extends LifecycleDelegate> {
    void onDelegateCreated(T t);
}
