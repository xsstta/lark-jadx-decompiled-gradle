package com.ss.android.appcenter.business.net.searchitem;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.appcenter.business.net.dto.C27737a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchItemData implements Serializable {
    @SerializedName("availableItems")
    private List<C27737a> mAvailableItems;
    @SerializedName("hasMore")
    private boolean mHasMore;
    @SerializedName(SearchIntents.EXTRA_QUERY)
    private String mQuery;
    @SerializedName("tagId")
    private String mTagId;
    @SerializedName("unavailableItems")
    private List<C27737a> mUnavailableItems;

    public String getQuery() {
        return this.mQuery;
    }

    public String getTagId() {
        return this.mTagId;
    }

    public boolean isHasMore() {
        return this.mHasMore;
    }

    public List<C27737a> getAvailableItems() {
        List<C27737a> list = this.mAvailableItems;
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    public List<C27737a> getUnavailableItems() {
        List<C27737a> list = this.mUnavailableItems;
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    public String toString() {
        return "SearchItemData{mTagId='" + this.mTagId + '\'' + '}';
    }
}
