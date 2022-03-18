package com.bytedance.ee.webapp.api.bean;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0016R2\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/webapp/api/bean/InspectedAppListInfo;", "", "()V", "appIDList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAppIDList", "()Ljava/util/ArrayList;", "setAppIDList", "(Ljava/util/ArrayList;)V", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InspectedAppListInfo {
    @JSONField(name = "appIDs")
    private ArrayList<String> appIDList;

    public final ArrayList<String> getAppIDList() {
        return this.appIDList;
    }

    public String toString() {
        return "InspectedAppListInfo{appIDList=" + String.valueOf(this.appIDList) + '}';
    }

    public final void setAppIDList(ArrayList<String> arrayList) {
        this.appIDList = arrayList;
    }
}
