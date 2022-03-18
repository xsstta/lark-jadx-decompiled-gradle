package com.ss.android.appcenter.business.net.workplacesetting;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WorkplaceSettingData implements Serializable {
    @SerializedName("workplaceSetting")
    private String mWorkplaceSetting;

    public String getWorkplaceSetting() {
        return this.mWorkplaceSetting;
    }
}
