package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hianalytics.hms.HiAnalytics;
import com.huawei.hianalytics.hms.HiAnalyticsConf;

public class HMSBIInit {
    public boolean isInit() {
        return HiAnalytics.getInitFlag();
    }

    public static <T> T checkNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public void init(Context context, boolean z, boolean z2, boolean z3, String str) {
        checkNonNull(context, "context must not be null.");
        new HiAnalyticsConf.Builder(context).setEnableImei(z).setEnableUDID(z2).setEnableSN(z3).setCollectURL(0, str).create();
    }

    public void refresh(Context context, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        checkNonNull(context, "context must not be null.");
        new HiAnalyticsConf.Builder(context).setEnableImei(z).setEnableUDID(z2).setEnableSN(z3).setCollectURL(0, str).refresh(z4);
    }
}
