package com.huawei.hms.common.internal;

import com.huawei.hms.common.HuaweiApi;

/* access modifiers changed from: package-private */
public class HandlerMessageWrapper {
    final HuaweiApi<?> mApi;
    final BaseContentWrapper mContentWrapper;

    public HandlerMessageWrapper(BaseContentWrapper baseContentWrapper, int i, HuaweiApi<?> huaweiApi) {
        this.mContentWrapper = baseContentWrapper;
        this.mApi = huaweiApi;
    }
}
