package com.bytedance.falconx.statistic;

import android.os.Build;
import com.google.gson.annotations.SerializedName;

public class Common {
    @SerializedName("app_version")
    public String appVersion;
    @SerializedName("device_id")
    public String deviceId;
    @SerializedName("device_model")
    public String deviceModel = Build.MODEL;
    @SerializedName("os")
    public int os;
    @SerializedName("region")
    public String region;
    @SerializedName("sdk_version")
    public String sdkVersion = "2.0.1-rc.10";
}
