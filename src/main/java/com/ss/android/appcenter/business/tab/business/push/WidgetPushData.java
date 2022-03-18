package com.ss.android.appcenter.business.tab.business.push;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.tab.business.widget.WidgetData;
import com.ss.android.appcenter.common.util.C28183g;
import java.io.Serializable;

public class WidgetPushData implements Serializable {
    @SerializedName("OS")
    private String OS;
    @SerializedName("CardID")
    private String cardId;
    @SerializedName("Content")
    private String content;
    @SerializedName("Locale")
    private String locale;
    @SerializedName("Platform")
    private String platform;
    @SerializedName("CreateTime")
    private long ts;
    @SerializedName("Version")
    private String version;

    public WidgetData getWidgetData() {
        return new WidgetData(this.content, this.version, this.cardId, this.ts);
    }

    public boolean isPushValid() {
        if (TextUtils.equals(this.platform, "android") && TextUtils.equals(this.locale, C28183g.m103240a())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "WidgetPushData{" + "cardId='" + this.cardId + '\'' + ", version='" + this.version + '\'' + ", locale='" + this.locale + '\'' + ", platform='" + this.platform + '\'' + ", OS='" + this.OS + '\'' + ", ts=" + this.ts + ", content='" + this.content + '\'' + '}';
    }
}
