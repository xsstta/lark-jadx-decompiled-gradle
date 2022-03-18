package com.ss.android.appcenter.business.net.workplacehome;

import android.text.TextUtils;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.net.dto.AppBadgeNode;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.common.util.C28182f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class WorkplaceHomeData implements Serializable {
    @SerializedName("allItemInfos")
    private Map<String, ItemInfo> allItemInfos;
    private boolean fromCache;
    @SerializedName("tagList")
    private List<C27776b> tagList;
    @SerializedName("ts")
    private long timeStamp;

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public boolean isFromCache() {
        return this.fromCache;
    }

    public List<C27776b> getTagList() {
        return C28182f.m103237b(this.tagList);
    }

    public Map<String, ItemInfo> getAllItemInfos() {
        if (this.allItemInfos == null) {
            this.allItemInfos = new HashMap();
        }
        return this.allItemInfos;
    }

    public boolean isDataEmpty() {
        Map<String, ItemInfo> map = this.allItemInfos;
        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

    private C27776b findAllAppsTag() {
        List<C27776b> list = this.tagList;
        if (list == null) {
            return null;
        }
        for (C27776b bVar : list) {
            if (bVar.mo99140h()) {
                return bVar;
            }
        }
        return null;
    }

    private C27776b findMainTag() {
        List<C27776b> list = this.tagList;
        if (list == null) {
            return null;
        }
        for (C27776b bVar : list) {
            if (bVar.mo99137e()) {
                return bVar;
            }
        }
        return null;
    }

    public List<AppBadgeNode> badgeNodes() {
        ArrayList arrayList = new ArrayList();
        Map<String, ItemInfo> map = this.allItemInfos;
        if (map == null) {
            return arrayList;
        }
        for (Map.Entry<String, ItemInfo> entry : map.entrySet()) {
            ItemInfo value = entry.getValue();
            if (!(value == null || value.badgeNodes() == null)) {
                arrayList.addAll(value.badgeNodes());
            }
        }
        return arrayList;
    }

    public void parseBadges() {
        for (Map.Entry<String, ItemInfo> entry : this.allItemInfos.entrySet()) {
            entry.getValue().parseBadgeInfo();
        }
    }

    public int badgeSum() {
        boolean z;
        Map<String, ItemInfo> map = this.allItemInfos;
        int i = 0;
        if (map != null && !map.isEmpty()) {
            HashSet hashSet = new HashSet();
            boolean z2 = true;
            if (findAllAppsTag() != null) {
                z = true;
            } else {
                z = false;
            }
            C27776b findMainTag = findMainTag();
            if (findMainTag == null) {
                z2 = false;
            }
            for (Map.Entry<String, ItemInfo> entry : this.allItemInfos.entrySet()) {
                ItemInfo value = entry.getValue();
                String itemId = value.getItemId();
                if ((!z || !z2 || findMainTag.mo99132a(itemId)) && !hashSet.contains(itemId)) {
                    i += value.badgeNum();
                    hashSet.add(itemId);
                }
            }
        }
        return i;
    }

    public List<OpenAppBadgeNode> rawBadgeNodes() {
        ArrayList arrayList = new ArrayList();
        Map<String, ItemInfo> map = this.allItemInfos;
        if (map == null) {
            return arrayList;
        }
        for (Map.Entry<String, ItemInfo> entry : map.entrySet()) {
            ItemInfo value = entry.getValue();
            if (!(value == null || value.badgeNodes() == null)) {
                for (AppBadgeNode appBadgeNode : value.badgeNodes()) {
                    OpenAppBadgeNode rawAppBadgeNode = appBadgeNode.toRawAppBadgeNode();
                    if (rawAppBadgeNode != null) {
                        arrayList.add(rawAppBadgeNode);
                    }
                }
            }
        }
        return arrayList;
    }

    public void setFromCache(boolean z) {
        this.fromCache = z;
    }

    public boolean updateBadge(AppBadgeNode appBadgeNode) {
        boolean z = false;
        if (appBadgeNode == null) {
            return false;
        }
        Map<String, ItemInfo> map = this.allItemInfos;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, ItemInfo> entry : this.allItemInfos.entrySet()) {
                ItemInfo value = entry.getValue();
                int mobileDefaultAbility = value.getMobileDefaultAbility();
                if (appBadgeNode.appAbility == mobileDefaultAbility && TextUtils.equals(value.getAppId(), appBadgeNode.clientId)) {
                    AppBadgeNode badgeNode = value.badgeNode(mobileDefaultAbility);
                    if (badgeNode == null || appBadgeNode.version >= badgeNode.version) {
                        z = true;
                        value.updateBadgeNode(appBadgeNode);
                    }
                }
            }
        }
        return z;
    }

    private void updateTagChildCommon(String str, boolean z) {
        String str2;
        List<C27776b> list = this.tagList;
        if (list != null) {
            for (C27776b bVar : list) {
                for (TagChild tagChild : bVar.mo99136d()) {
                    if (tagChild.compareId(str)) {
                        if (z) {
                            str2 = "common";
                        } else {
                            str2 = "available";
                        }
                        tagChild.setSubType(str2);
                    }
                }
            }
        }
    }

    public boolean dealItemCommonStatusChanged(ItemInfo itemInfo, boolean z) {
        if (itemInfo == null) {
            return false;
        }
        C27776b findMainTag = findMainTag();
        C27776b findAllAppsTag = findAllAppsTag();
        if (findMainTag == null || findAllAppsTag == null) {
            return false;
        }
        if (z) {
            findMainTag.mo99131a(itemInfo);
            updateTagChildCommon(itemInfo.getItemId(), true);
        } else {
            findMainTag.mo99134b(itemInfo.getItemId());
            updateTagChildCommon(itemInfo.getItemId(), false);
        }
        return true;
    }
}
