package com.bytedance.geckox.statistic.model;

import android.os.Build;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class SettingsUpdateData {
    @SerializedName("ac")
    public String ac;
    @SerializedName("aid")
    public long aid;
    @SerializedName("api_version")
    public String apiVersion;
    @SerializedName("app_version")
    public String appVersion;
    @SerializedName("device_id")
    public String deviceId;
    @SerializedName("device_model")
    private String deviceModel = Build.MODEL;
    @SerializedName("err_code")
    public int errCode;
    @SerializedName("err_msg")
    public String errorMsg;
    @SerializedName("http_status")
    public int httpStatus;
    @SerializedName("x_tt_logid")
    public String logId;
    @SerializedName("os")
    private int os;
    @SerializedName("os_version")
    public String osVersion = String.valueOf(Build.VERSION.SDK_INT);
    @SerializedName("params_for_special")
    private String paramsForSpecial = "gecko";
    @SerializedName("region")
    public String region;
    @SerializedName("req_type")
    public int reqType = 1;
    @SerializedName("sdk_version")
    private String sdkVersion = "2.4.1";
    @SerializedName("settings_info")
    public String settingsInfo;

    public static String getLogId(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("x-tt-logid");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String str2 = map.get("X-Tt-Logid");
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String str3 = map.get("X-TT-LOGID");
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return "";
    }
}
