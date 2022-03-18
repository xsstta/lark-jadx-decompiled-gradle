package com.huawei.hms.maps.model;

import com.huawei.hms.feature.dynamic.IObjectWrapper;
import java.util.Objects;

public final class BitmapDescriptor {

    /* renamed from: a */
    private final IObjectWrapper f58690a;

    public BitmapDescriptor(IObjectWrapper iObjectWrapper) {
        Objects.requireNonNull(iObjectWrapper, "Object is null");
        this.f58690a = iObjectWrapper;
    }

    public final IObjectWrapper getObject() {
        return this.f58690a;
    }
}
