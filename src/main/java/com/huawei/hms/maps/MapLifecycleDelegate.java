package com.huawei.hms.maps;

import com.huawei.hms.feature.dynamic.LifecycleDelegate;

public interface MapLifecycleDelegate extends LifecycleDelegate {
    void getMapAsync(OnMapReadyCallback onMapReadyCallback);
}
