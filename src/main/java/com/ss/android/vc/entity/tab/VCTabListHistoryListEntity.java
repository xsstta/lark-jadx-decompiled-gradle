package com.ss.android.vc.entity.tab;

import java.io.Serializable;
import java.util.List;

public class VCTabListHistoryListEntity implements Serializable {
    private static final long serialVersionUID = 1;
    public int downVersion;
    public boolean hasMore;
    private List<VCTabListItem> tabListItems;

    public List<VCTabListItem> getTabListItems() {
        return this.tabListItems;
    }

    public String toString() {
        return "VCTabListHistoryListEntity hasMore: " + this.hasMore + " downVersion: " + this.downVersion + " item size= " + this.tabListItems.size();
    }

    public void setTabListItems(List<VCTabListItem> list) {
        this.tabListItems = list;
    }
}
