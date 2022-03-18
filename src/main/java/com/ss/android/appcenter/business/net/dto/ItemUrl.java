package com.ss.android.appcenter.business.net.dto;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.common.util.C28193m;
import java.io.Serializable;

public class ItemUrl implements Serializable {
    @SerializedName("mobileAppLink")
    private String mobileAppLink;
    @SerializedName("mobileCardWidgetUrl")
    private String mobileCardWidgetUrl;
    @SerializedName("mobileH5Url")
    private String mobileH5Url;
    @SerializedName("mobileMpUrl")
    private String mobileMpUrl;
    @SerializedName("pcAppLink")
    private String pcAppLink;
    @SerializedName("pcCardWidgetUrl")
    private String pcCardWidgetUrl;
    @SerializedName("pcH5Url")
    private String pcH5Url;
    @SerializedName("pcMpUrl")
    private String pcMpUrl;

    public String getMobileAppLink() {
        return this.mobileAppLink;
    }

    public String getMobileCardWidgetUrl() {
        return this.mobileCardWidgetUrl;
    }

    public String getMobileH5Url() {
        return this.mobileH5Url;
    }

    public String getMobileMpUrl() {
        return this.mobileMpUrl;
    }

    public String getPcH5Url() {
        return this.pcH5Url;
    }

    public String getPcMpUrl() {
        return this.pcMpUrl;
    }

    public boolean isAllUrlEmpty() {
        if (!TextUtils.isEmpty(this.pcH5Url) || !TextUtils.isEmpty(this.pcMpUrl) || !TextUtils.isEmpty(this.mobileH5Url) || !C28193m.m103268a(this.mobileMpUrl) || !TextUtils.isEmpty(this.mobileAppLink) || !TextUtils.isEmpty(this.mobileCardWidgetUrl) || !TextUtils.isEmpty(this.pcAppLink) || !TextUtils.isEmpty(this.pcCardWidgetUrl)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "ItemUrl{" + "pcH5Url='" + this.pcH5Url + '\'' + ", pcMpUrl='" + this.pcMpUrl + '\'' + ", mobileH5Url='" + this.mobileH5Url + '\'' + ", mobileMpUrl='" + this.mobileMpUrl + '\'' + ", mobileAppLink='" + this.mobileAppLink + '\'' + ", pcAppLink='" + this.pcAppLink + '\'' + ", pcCardWidgetUrl='" + this.pcCardWidgetUrl + '\'' + ", mobileCardWidgetUrl='" + this.mobileCardWidgetUrl + '\'' + '}';
    }
}
