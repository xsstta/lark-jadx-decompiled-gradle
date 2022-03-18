package com.bytedance.ee.bear.list.loadstateview;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public enum LoadFailCategory {
    CATEGORY_NO_NETWORK("nonetwork", LocationRequest.PRIORITY_HD_ACCURACY),
    CATEGORY_OVERTIME("overtime", 201),
    CATEGORY_UN_KNOW("unknow", 202),
    CATEGORY_TEMPLATE_FAILED("template_fail", SmEvents.EVENT_HBRESET),
    CATEGORY_FOLDER_NOT_FOUND("folder_not_found", 204);
    
    private final String mCategoryName;
    private final int mId;

    public String getmCategoryName() {
        return this.mCategoryName;
    }

    public int getmId() {
        return this.mId;
    }

    private LoadFailCategory(String str, int i) {
        this.mCategoryName = str;
        this.mId = i;
    }
}
