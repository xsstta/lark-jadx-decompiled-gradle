package com.bytedance.falconx.statistic;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StatisticData {
    @SerializedName("common")
    public Common mCommon;
    @SerializedName("offline")
    public List<InterceptorModel> offline;
}
