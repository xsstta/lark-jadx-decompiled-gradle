package com.ss.android.appcenter.business.net.operationconfig;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class OperationalActivity implements Serializable {
    @SerializedName("mobileUrl")
    private String mobileUrl;
    @SerializedName("name")
    private String name;

    public String getMobileUrl() {
        return this.mobileUrl;
    }

    public String getName() {
        return this.name;
    }
}
