package com.ss.android.vc.entity.response;

import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import java.io.Serializable;
import java.util.List;

public class SetVcVirtualBackgroundEntity implements Serializable {
    private List<VirtualBackgroundInfo> infoList;

    public List<VirtualBackgroundInfo> getInfoList() {
        return this.infoList;
    }

    public String toString() {
        return "SetVcVirtualBackgroundEntity{infoList=" + this.infoList + '}';
    }

    public void setInfoList(List<VirtualBackgroundInfo> list) {
        this.infoList = list;
    }
}
