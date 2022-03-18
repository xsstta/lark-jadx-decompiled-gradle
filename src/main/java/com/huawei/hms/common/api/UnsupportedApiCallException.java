package com.huawei.hms.common.api;

import com.huawei.hms.common.Feature;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature feature;

    public final String getMessage() {
        return this.feature + " is unsupported";
    }

    public UnsupportedApiCallException(Feature feature2) {
        this.feature = feature2;
    }
}
