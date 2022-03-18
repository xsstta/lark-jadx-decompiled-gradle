package com.ss.android.lark.maincore.dto;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TabInfo {
    @JSONField(name = "mainNavigation")
    private Map<String, TabAppInfo> mMainApps = new LinkedHashMap();
    @JSONField(name = "shortcutNavigation")
    private Map<String, TabAppInfo> mNavApps = new LinkedHashMap();
    @JSONField(name = "primary_count")
    private int mPrimaryCount;

    public int getPrimaryCount() {
        return this.mPrimaryCount;
    }

    public void clearMainTabApps() {
        this.mMainApps.clear();
    }

    @JSONField(serialize = false)
    public List<String> getMainAppNames() {
        return new ArrayList(this.mMainApps.keySet());
    }

    public List<TabAppInfo> getMainApps() {
        return new ArrayList(this.mMainApps.values());
    }

    @JSONField(serialize = false)
    public List<String> getNavAppNames() {
        return new ArrayList(this.mNavApps.keySet());
    }

    public List<TabAppInfo> getNavApps() {
        return new ArrayList(this.mNavApps.values());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (TabAppInfo tabAppInfo : this.mMainApps.values()) {
            sb.append(tabAppInfo.getKey());
            sb.append(", ");
        }
        for (TabAppInfo tabAppInfo2 : this.mNavApps.values()) {
            sb2.append(tabAppInfo2.getKey());
            sb2.append(", ");
        }
        return "TabInfo{mMainApps=[" + ((Object) sb) + "], mNavApps=[" + ((Object) sb2) + "], mPrimaryCount=" + this.mPrimaryCount + '}';
    }

    public void setPrimaryCount(int i) {
        this.mPrimaryCount = i;
    }

    public void addMainTab(TabAppInfo tabAppInfo) {
        this.mMainApps.put(tabAppInfo.getKey(), tabAppInfo);
    }

    public void addNavTab(TabAppInfo tabAppInfo) {
        this.mNavApps.put(tabAppInfo.getKey(), tabAppInfo);
    }

    public boolean containsTab(String str) {
        if (getTabAppInfoByKey(str) != null) {
            return true;
        }
        return false;
    }

    public TabAppInfo deleteMainTab(String str) {
        return this.mMainApps.remove(str);
    }

    public TabAppInfo deleteNavTab(String str) {
        return this.mNavApps.remove(str);
    }

    public TabAppInfo getTabAppInfoByKey(String str) {
        TabAppInfo tabAppInfo = this.mMainApps.get(str);
        if (tabAppInfo == null) {
            return this.mNavApps.get(str);
        }
        return tabAppInfo;
    }
}
