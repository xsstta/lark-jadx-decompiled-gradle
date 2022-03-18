package com.huawei.hms.support.api.entity.location.locationavailability;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.support.api.entity.location.common.LocationBaseResponse;

public class GetLocationAvailabilityResponse extends LocationBaseResponse implements IMessageEntity {
    @Packed
    private LocationAvailability locationAvailability;

    public LocationAvailability getLocationAvailability() {
        return this.locationAvailability;
    }

    public void setLocationAvailability(LocationAvailability locationAvailability2) {
        this.locationAvailability = locationAvailability2;
    }
}
