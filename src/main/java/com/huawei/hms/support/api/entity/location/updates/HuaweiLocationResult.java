package com.huawei.hms.support.api.entity.location.updates;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.List;

public class HuaweiLocationResult implements IMessageEntity {
    @Packed
    private List<HuaweiLocationInfo> locations;

    public List<HuaweiLocationInfo> getHuaweiLocationInfos() {
        return this.locations;
    }

    public void setHuaweiLocationInfos(List<HuaweiLocationInfo> list) {
        this.locations = list;
    }
}
