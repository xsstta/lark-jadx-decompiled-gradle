package com.bytedance.ee.bear.onboarding.synchronization;

import android.text.TextUtils;
import com.bytedance.ee.bear.onboarding.p514a.AbstractC10372a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import java.util.HashMap;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

class OnBoardingPrefData implements NonProguard {
    private Map<String, OnBoardingItem> onBoardingItemMap = new HashMap();

    public static class OnBoardingItem implements NonProguard {
        public String id;
        public boolean isDone;
        public int maxCount;
        public int updatedCount;

        public String getId() {
            return this.id;
        }

        public int getMaxCount() {
            return this.maxCount;
        }

        public int getUpdatedCount() {
            return this.updatedCount;
        }

        public boolean isDone() {
            return this.isDone;
        }

        public String toString() {
            return "OnBoardingItem{id='" + this.id + '\'' + ", maxCount=" + this.maxCount + ", updatedCount=" + this.updatedCount + ", isDone=" + this.isDone + '}';
        }

        public void setDone(boolean z) {
            this.isDone = z;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setMaxCount(int i) {
            this.maxCount = i;
        }

        public void setUpdatedCount(int i) {
            this.updatedCount = i;
        }
    }

    public Map<String, OnBoardingItem> getOnBoardingItemMap() {
        if (this.onBoardingItemMap == null) {
            this.onBoardingItemMap = new HashMap(1);
        }
        return this.onBoardingItemMap;
    }

    public String toString() {
        return "OnBoardingData{onBoardingStatusMap=" + this.onBoardingItemMap + '}';
    }

    public void setOnBoardingItemMap(Map<String, OnBoardingItem> map) {
        this.onBoardingItemMap = map;
    }

    public OnBoardingItem get(String str) {
        return getOnBoardingItemMap().get(str);
    }

    public boolean getStatus(String str) {
        OnBoardingItem onBoardingItem;
        if (!TextUtils.isEmpty(str) && (onBoardingItem = getOnBoardingItemMap().get(str)) != null && onBoardingItem.isDone) {
            return true;
        }
        return false;
    }

    public OnBoardingItem put(String str) {
        OnBoardingItem onBoardingItem = new OnBoardingItem();
        onBoardingItem.id = str;
        onBoardingItem.maxCount = ((AbstractC10372a) KoinJavaComponent.m268610a(AbstractC10372a.class)).mo30721a(str);
        onBoardingItem.updatedCount = 0;
        getOnBoardingItemMap().put(str, onBoardingItem);
        return onBoardingItem;
    }

    public void setMissionFinished(String str) {
        OnBoardingItem onBoardingItem;
        if (!TextUtils.isEmpty(str) && (onBoardingItem = getOnBoardingItemMap().get(str)) != null) {
            onBoardingItem.isDone = true;
        }
    }

    public void putAll(Map<String, Boolean> map) {
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String key = entry.getKey();
            OnBoardingItem onBoardingItem = getOnBoardingItemMap().get(key);
            if (onBoardingItem == null) {
                onBoardingItem = put(key);
            }
            onBoardingItem.isDone = entry.getValue().booleanValue();
        }
    }

    public boolean update(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        OnBoardingItem onBoardingItem = getOnBoardingItemMap().get(str);
        if (onBoardingItem == null) {
            onBoardingItem = put(str);
        } else {
            onBoardingItem.updatedCount++;
        }
        C13479a.m54764b("OnBoardingData", "update onBoardingItem: " + onBoardingItem);
        if (onBoardingItem.maxCount > onBoardingItem.updatedCount) {
            return false;
        }
        C13479a.m54764b("OnBoardingData", " onBoardingItem: " + str + ", set status: true");
        onBoardingItem.isDone = true;
        return true;
    }

    public void update(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            OnBoardingItem onBoardingItem = getOnBoardingItemMap().get(str);
            if (onBoardingItem == null) {
                onBoardingItem = put(str);
            }
            onBoardingItem.updatedCount++;
            C13479a.m54764b("OnBoardingData", "update onBoardingItem: " + str + ", set status: " + z);
            onBoardingItem.isDone = z;
        }
    }
}
