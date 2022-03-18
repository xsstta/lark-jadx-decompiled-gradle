package com.huawei.hms.maps;

import com.huawei.hms.feature.dynamic.LifecycleDelegate;

public interface StreetLifecycleDelegate extends LifecycleDelegate {
    void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback);
}
