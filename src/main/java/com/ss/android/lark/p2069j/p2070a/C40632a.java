package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.a */
public class C40632a extends OPMonitorCode {

    /* renamed from: a */
    public static final C40632a f103059a = new C40632a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "get_securityinfo_success");

    /* renamed from: b */
    public static final C40632a f103060b = new C40632a(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "get_securityinfo_fail");

    public C40632a(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.api.anti_cheating", i, oPMonitorLevel, str);
    }

    public C40632a(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
