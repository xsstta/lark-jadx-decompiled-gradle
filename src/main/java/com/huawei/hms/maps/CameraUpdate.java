package com.huawei.hms.maps;

import com.huawei.hms.maps.model.CameraUpdateParam;
import java.util.Objects;

public final class CameraUpdate {

    /* renamed from: a */
    private CameraUpdateParam f58447a;

    public CameraUpdate(CameraUpdateParam cameraUpdateParam) {
        Objects.requireNonNull(cameraUpdateParam, "Object is null");
        this.f58447a = cameraUpdateParam;
    }

    public final CameraUpdateParam getCameraUpdate() {
        return this.f58447a;
    }

    public final CameraUpdateParam getCameraUpdateParam() {
        return this.f58447a;
    }
}
