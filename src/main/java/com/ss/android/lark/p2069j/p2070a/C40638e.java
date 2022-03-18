package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.e */
public class C40638e extends OPMonitorCode {

    /* renamed from: a */
    public static final C40638e f103070a = new C40638e(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "old_get_wifi_list_api_sum");

    public C40638e(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.api.wifi", i, oPMonitorLevel, str);
    }

    public C40638e(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
