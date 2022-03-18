package com.ss.android.appcenter.business.net.subtaginfo;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.workplacehome.TagChild;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SubTagData implements Serializable {
    @SerializedName("allItemInfos")
    private Map<String, ItemInfo> allItemInfos;
    @SerializedName("children")
    private List<TagChild> children;
    @SerializedName("hasMore")
    private boolean hasMore;

    public Map<String, ItemInfo> getAllItemInfos() {
        return this.allItemInfos;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public List<TagChild> getChildren() {
        if (this.children == null) {
            this.children = new ArrayList();
        }
        return this.children;
    }
}
