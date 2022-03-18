package com.ss.android.appcenter.business.net.useritems;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.common.util.C28184h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserItemsData implements Serializable {
    @SerializedName("allItemInfos")
    private Map<String, ItemInfo> allItemInfos;
    @SerializedName("commonIconItemList")
    private List<String> commonIconItemList;
    @SerializedName("commonWidgetItemList")
    private List<String> commonWidgetItemList;
    @SerializedName("recommendItemList")
    private List<String> recommendItemList;
    @SerializedName("ts")
    private long timeStamp;

    public List<String> getCommonIconItemList() {
        if (this.commonIconItemList == null) {
            this.commonIconItemList = new ArrayList();
        }
        return this.commonIconItemList;
    }

    public List<String> getCommonWidgetItemList() {
        if (this.commonWidgetItemList == null) {
            this.commonWidgetItemList = new ArrayList();
        }
        return this.commonWidgetItemList;
    }

    public List<String> getRecommendItemList() {
        if (this.recommendItemList == null) {
            this.recommendItemList = new ArrayList();
        }
        return this.recommendItemList;
    }

    public Map<String, ItemInfo> getAllItemInfos() {
        if (this.allItemInfos == null) {
            C28184h.m103250d("GetUserItems", "get allItemInfos is null");
            this.allItemInfos = new HashMap();
        }
        return this.allItemInfos;
    }

    public String toString() {
        return "SortPageData{" + "recommendItemList=" + this.recommendItemList + ", commonIconItemList=" + this.commonIconItemList + ", commonWidgetItemList=" + this.commonWidgetItemList + ", allItemInfos=" + this.allItemInfos + ", timeStamp=" + this.timeStamp + '}';
    }

    public static List<ItemInfo> convert(List<String> list, Map<String, ItemInfo> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            ItemInfo itemInfo = map.get(str);
            if (itemInfo != null) {
                arrayList.add(itemInfo);
            }
        }
        return arrayList;
    }
}
