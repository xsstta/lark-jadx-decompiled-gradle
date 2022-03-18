package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.d */
public class C40637d extends OPMonitorCode {

    /* renamed from: a */
    public static final C40637d f103069a = new C40637d(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "old_get_user_info_api_sum");

    public C40637d(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.api.user", i, oPMonitorLevel, str);
    }

    public C40637d(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
