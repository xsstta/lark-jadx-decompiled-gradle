package com.ss.android.lark.feed.app.entity;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.dto.NetworkLevel;
import com.ss.android.lark.utils.UIHelper;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class NoticeHeaderPreview extends UIFeedCard {
    public static String doneBoxId = String.valueOf(UUID.randomUUID().toString().hashCode());
    public static String inboxId = String.valueOf(UUID.randomUUID().toString().hashCode());
    int delayCount;
    int deviceStatus;
    int inactiveTenantCount;
    NetworkLevel networkLevel;
    Map<String, Integer> tenantBadgeCount;
    int tenantCount;

    public int getDelayCount() {
        return this.delayCount;
    }

    public int getDeviceStatus() {
        return this.deviceStatus;
    }

    public int getInactiveTenantCount() {
        return this.inactiveTenantCount;
    }

    public NetworkLevel getNetworkLevel() {
        return this.networkLevel;
    }

    public Map<String, Integer> getTenantBadgeCount() {
        return this.tenantBadgeCount;
    }

    public int getTenantCount() {
        return this.tenantCount;
    }

    public boolean needCreate() {
        if (getDeviceStatus() != 0 || getDelayCount() > 0 || this.networkLevel == NetworkLevel.SERVICE_UNAVAILABLE || this.networkLevel == NetworkLevel.NET_UNAVAILABLE) {
            return true;
        }
        return false;
    }

    public void setDelayCount(int i) {
        this.delayCount = i;
    }

    public void setDeviceStatus(int i) {
        this.deviceStatus = i;
    }

    public void setInactiveTenantCount(int i) {
        this.inactiveTenantCount = i;
    }

    public void setNetworkLevel(NetworkLevel networkLevel2) {
        this.networkLevel = networkLevel2;
    }

    public void setTenantBadgeCount(Map<String, Integer> map) {
        this.tenantBadgeCount = map;
    }

    public void setTenantCount(int i) {
        this.tenantCount = i;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public boolean exactlyCompare(Object obj) {
        if (obj == null || !(obj instanceof NoticeHeaderPreview)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        NoticeHeaderPreview noticeHeaderPreview = (NoticeHeaderPreview) obj;
        if (noticeHeaderPreview.getTenantCount() == getTenantCount() && Objects.equals(noticeHeaderPreview.tenantBadgeCount, getTenantBadgeCount()) && noticeHeaderPreview.getInactiveTenantCount() == getInactiveTenantCount() && noticeHeaderPreview.getDeviceStatus() == getDeviceStatus() && noticeHeaderPreview.getDelayCount() == getDelayCount() && noticeHeaderPreview.getNetworkLevel() == getNetworkLevel()) {
            return super.exactlyCompare(obj);
        }
        return false;
    }

    public NoticeHeaderPreview(String str, FeedCard.FeedType feedType) {
        long j;
        setId(str);
        setType(FeedCard.Type.UNKNOWN);
        setFeedType(feedType);
        if (DesktopUtil.m144301a(UIHelper.getContext())) {
            j = 40;
        } else {
            j = 10;
        }
        setRankPriority(j);
    }
}
