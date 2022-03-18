package com.ss.android.appcenter.business.net.tagsandrecent;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.net.dto.C27737a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TagsAndRecentData implements Serializable {
    @SerializedName("availableItems")
    private List<C27737a> mAvailableItems;
    @SerializedName("hasMore")
    private boolean mHasMore;
    @SerializedName("tag")
    private List<Tag> mTagList;
    @SerializedName("unavailableItems")
    private List<C27737a> mUnavailableItems;

    public List<C27737a> getUnavailableItems() {
        return this.mUnavailableItems;
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

    public List<Tag> getTagList() {
        List<Tag> list = this.mTagList;
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }
}
