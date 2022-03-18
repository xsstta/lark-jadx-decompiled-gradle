package com.ss.ttvideoengine.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONObject;

public class SubInfo {
    private String mFormat;
    private int mLanguageId;
    private int mSubId;
    private String mVersion;

    public int getValueInt(int i) {
        if (i == 0) {
            return this.mSubId;
        }
        if (i != 1) {
            return -1;
        }
        return this.mLanguageId;
    }

    public String getValueStr(int i) {
        if (i == 2) {
            return this.mFormat;
        }
        if (i != 3) {
            return "";
        }
        return this.mVersion;
    }

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mSubId = jSONObject.optInt("sub_id");
            this.mLanguageId = jSONObject.optInt("language_id");
            this.mFormat = jSONObject.optString("format");
            this.mVersion = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        }
    }
}
