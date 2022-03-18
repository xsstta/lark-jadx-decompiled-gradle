package com.ss.android.appcenter.business.net.workplacesetting;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WorkplaceSetting implements Serializable {
    @SerializedName("appStoreMobileUrl")
    private String appStoreMobileUrl;
    @SerializedName("isShowAppStore")
    private boolean isShowAppStore;

    public String getAppStoreMobileUrl() {
        return this.appStoreMobileUrl;
    }

    public boolean isShowAppStore() {
        return this.isShowAppStore;
    }

    public String toString() {
        return "WorkplaceSettingData{" + "isShowAppStore=" + this.isShowAppStore + ", appStoreMobileUrl='" + this.appStoreMobileUrl + '\'' + '}';
    }
}
