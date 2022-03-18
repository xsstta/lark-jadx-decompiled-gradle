package com.ss.android.lark.appstrategy.p1375b;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.appstrategy.b.b */
public class C29236b extends OPMonitorCode {

    /* renamed from: a */
    public static final C29236b f73183a = new C29236b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "terminal_trigger_start");

    /* renamed from: b */
    public static final C29236b f73184b = new C29236b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "request_settings_start");

    /* renamed from: c */
    public static final C29236b f73185c = new C29236b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "request_settings_success");

    /* renamed from: d */
    public static final C29236b f73186d = new C29236b(10003, OPMonitorLevel.ERROR, "request_settings_fail");

    /* renamed from: e */
    public static final C29236b f73187e = new C29236b(10004, OPMonitorLevel.NORMAL, "should_upload_info");

    /* renamed from: f */
    public static final C29236b f73188f = new C29236b(10005, OPMonitorLevel.NORMAL, "get_terminal_info_finish");

    /* renamed from: g */
    public static final C29236b f73189g = new C29236b(10006, OPMonitorLevel.NORMAL, "upload_terminal_info_start");

    /* renamed from: h */
    public static final C29236b f73190h = new C29236b(10007, OPMonitorLevel.NORMAL, "upload_terminal_info_success");

    /* renamed from: i */
    public static final C29236b f73191i = new C29236b(10008, OPMonitorLevel.ERROR, "upload_terminal_info_fail");

    public C29236b(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.gadget.terminal_info", i, oPMonitorLevel, str);
    }

    public C29236b(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
