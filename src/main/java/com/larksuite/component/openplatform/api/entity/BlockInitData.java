package com.larksuite.component.openplatform.api.entity;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;

public class BlockInitData {
    @SerializedName("customApis")
    public List<CustomApis> customApis;
    @SerializedName("host")
    public String host;
    @SerializedName("typedDataCollection")
    public JsonObject typedDataCollection;

    public static class CustomApis {
        @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_APINAME)
        public String apiName;
        @SerializedName("apiType")
        public String apiType;

        public CustomApis(String str, String str2) {
            this.apiName = str;
            this.apiType = str2;
        }
    }
}
