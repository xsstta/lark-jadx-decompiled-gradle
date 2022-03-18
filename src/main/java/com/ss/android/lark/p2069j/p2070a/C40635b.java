package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.b */
public class C40635b extends OPMonitorCode {

    /* renamed from: a */
    public static final C40635b f103063a = new C40635b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "uri_branches_statistics");

    public C40635b(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.api.file_picker", i, oPMonitorLevel, str);
    }

    public C40635b(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
