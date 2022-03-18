package com.ss.android.lark.feed.app.entity;

import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.feed.common.FeedFgUtils;
import java.util.List;
import java.util.UUID;

public class FilterPreview extends UIFeedCard {
    public static String id = String.valueOf(UUID.randomUUID().toString().hashCode());
    int deviceStatus;
    private List<FeedTabItemData.IFilterItem> filterItems;

    public int getDeviceStatus() {
        return this.deviceStatus;
    }

    public List<FeedTabItemData.IFilterItem> getFilterItems() {
        return this.filterItems;
    }

    public FilterPreview() {
        setType(FeedCard.Type.UNKNOWN);
        setId(id);
        setFeedType(FeedCard.FeedType.INBOX);
        setRankPriority(35);
    }

    public boolean needCreate() {
        if (!FeedFgUtils.m146773b() || (getDeviceStatus() == 0 && this.filterItems.size() <= 0)) {
            return false;
        }
        return true;
    }

    public void setDeviceStatus(int i) {
        this.deviceStatus = i;
    }

    public FilterPreview(FilterPreview filterPreview) {
        super(filterPreview);
        setFilterItems(filterPreview.filterItems);
        setDeviceStatus(filterPreview.deviceStatus);
    }

    public void setFilterItems(List<FeedTabItemData.IFilterItem> list) {
        this.filterItems = list;
        C37548b.m147657a().mo137790a(list);
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public boolean exactlyCompare(Object obj) {
        if (!(obj instanceof FilterPreview)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        FilterPreview filterPreview = (FilterPreview) obj;
        if (this.deviceStatus == filterPreview.deviceStatus && C26247a.m94982a((List) this.filterItems, (List) filterPreview.filterItems)) {
            return super.exactlyCompare(obj);
        }
        return false;
    }
}
