package com.ss.android.appcenter.business.tab.business.widget;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CardConfig implements Serializable {
    @SerializedName("mobileHeaderLinkUrl")
    private String mobileHeaderLinkUrl;
    @SerializedName("needRequestBusinessData")
    private boolean needRequestBusinessData = true;
    @SerializedName("widgetCanExpand")
    private boolean widgetCanExpand;

    public String getMobileHeaderLinkUrl() {
        return this.mobileHeaderLinkUrl;
    }

    public boolean isNeedRequestBusinessData() {
        return this.needRequestBusinessData;
    }

    public boolean isWidgetCanExpand() {
        return this.widgetCanExpand;
    }
}
