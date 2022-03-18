package com.bytedance.geckox.model;

import android.os.Build;
import com.google.gson.annotations.SerializedName;

public class Common {
    @SerializedName("ac")
    public String ac;
    @SerializedName("aid")
    public long aid;
    @SerializedName("app_name")
    public String appName;
    @SerializedName("app_version")
    public String appVersion;
    @SerializedName("device_id")
    public String deviceId;
    @SerializedName("device_model")
    public String deviceModel = Build.MODEL;
    @SerializedName("device_platform")
    public String devicePlatform = "android";
    @SerializedName("os")
    public int os;
    @SerializedName("os_version")
    public String osVersion = (Build.VERSION.SDK_INT + "");
    @SerializedName("region")
    public String region;
    @SerializedName("sdk_version")
    public String sdkVersion = "2.4.1";
    @SerializedName("uid")
    public String uid;

    public Common(long j, String str, String str2, String str3) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.region = str3;
    }

    public Common(long j, String str, String str2, String str3, String str4) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
    }

    public Common(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
