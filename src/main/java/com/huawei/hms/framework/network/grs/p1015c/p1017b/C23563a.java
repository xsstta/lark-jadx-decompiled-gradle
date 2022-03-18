package com.huawei.hms.framework.network.grs.p1015c.p1017b;

import com.huawei.hms.framework.common.BuildConfig;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;

/* renamed from: com.huawei.hms.framework.network.grs.c.b.a */
public class C23563a extends HianalyticsBaseData {
    public static final String TAG = HianalyticsBaseData.class.getSimpleName();

    public C23563a() {
        put("sdk_version", BuildConfig.VERSION_NAME);
        put("if_name", "NetworkKit-grs");
    }
}
