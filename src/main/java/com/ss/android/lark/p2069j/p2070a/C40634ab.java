package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.ab */
public class C40634ab extends OPMonitorCode {

    /* renamed from: a */
    public static final C40634ab f103062a = new C40634ab(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "heartbeat_report");

    public C40634ab(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("monitor.base.heartbeat", i, oPMonitorLevel, str);
    }

    public C40634ab(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
