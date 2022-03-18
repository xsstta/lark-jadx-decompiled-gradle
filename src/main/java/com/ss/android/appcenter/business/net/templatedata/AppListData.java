package com.ss.android.appcenter.business.net.templatedata;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import java.io.Serializable;
import java.util.List;

public class AppListData implements Serializable {
    public boolean gridMode = true;
    @SerializedName("itemInfos")
    public List<ItemInfo> itemInfos;
}
