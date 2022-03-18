package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.aa */
public class C40633aa extends OPMonitorCode {

    /* renamed from: a */
    public static final C40633aa f103061a = new C40633aa(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "passport_universal_log");

    public C40633aa(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.universal", i, oPMonitorLevel, str);
    }

    public C40633aa(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
