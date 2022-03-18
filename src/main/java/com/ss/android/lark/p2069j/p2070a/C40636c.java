package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.c */
public class C40636c extends OPMonitorCode {

    /* renamed from: a */
    public static final C40636c f103064a = new C40636c(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "start_location_update");

    /* renamed from: b */
    public static final C40636c f103065b = new C40636c(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "stop_location_update");

    /* renamed from: c */
    public static final C40636c f103066c = new C40636c(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "plugin_start_process_location");

    /* renamed from: d */
    public static final C40636c f103067d = new C40636c(10003, OPMonitorLevel.NORMAL, "old_once_location_sum");

    /* renamed from: e */
    public static final C40636c f103068e = new C40636c(10004, OPMonitorLevel.NORMAL, "old_start_location_sum");

    public C40636c(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.api.location", i, oPMonitorLevel, str);
    }

    public C40636c(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
