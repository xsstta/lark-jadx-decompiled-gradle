package com.ss.android.lark.location.listener;

import com.ss.android.lark.location.dto.LarkLocation;

public class LocationRequestOption {

    /* renamed from: a */
    private LarkLocation.CoordinateSystem f105671a = LarkLocation.CoordinateSystem.DEFAULT;

    /* renamed from: b */
    private LocationPriority f105672b = LocationPriority.PRIORITY_HIGH_ACCURACY;

    public enum LocationPriority {
        PRIORITY_HIGH_ACCURACY,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_LOW_POWER,
        PRIORITY_NO_POWER,
        DEVICE_SENSORS
    }

    /* renamed from: a */
    public LarkLocation.CoordinateSystem mo149697a() {
        return this.f105671a;
    }

    /* renamed from: b */
    public LocationPriority mo149700b() {
        return this.f105672b;
    }

    /* renamed from: a */
    public void mo149698a(LarkLocation.CoordinateSystem coordinateSystem) {
        this.f105671a = coordinateSystem;
    }

    /* renamed from: a */
    public void mo149699a(LocationPriority locationPriority) {
        this.f105672b = locationPriority;
    }
}
