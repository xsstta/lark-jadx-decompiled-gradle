package com.ss.android.appcenter.business.tab.business.widget;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class WidgetContentData implements Serializable {
    @SerializedName("TimeStamp")
    private long mTimeStamp;
    @SerializedName("WidgetDataList")
    private List<WidgetData> mWidgetDataList;

    public long getTimeStamp() {
        return this.mTimeStamp;
    }

    public List<WidgetData> getWidgetDataList() {
        return this.mWidgetDataList;
    }
}
