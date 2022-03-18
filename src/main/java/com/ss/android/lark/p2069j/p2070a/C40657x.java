package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.x */
public class C40657x extends OPMonitorCode {

    /* renamed from: a */
    public static final C40657x f103222a = new C40657x(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "process_invalid_start");

    /* renamed from: b */
    public static final C40657x f103223b = new C40657x(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "check_status_request_start");

    /* renamed from: c */
    public static final C40657x f103224c = new C40657x(10003, OPMonitorLevel.NORMAL, "check_status_request_succ");

    /* renamed from: d */
    public static final C40657x f103225d = new C40657x(10004, OPMonitorLevel.ERROR, "check_status_request_fail");

    /* renamed from: e */
    public static final C40657x f103226e = new C40657x(10005, OPMonitorLevel.NORMAL, "process_invalid_bkg_user_end");

    /* renamed from: f */
    public static final C40657x f103227f = new C40657x(10006, OPMonitorLevel.NORMAL, "process_invalid_front_user_start");

    /* renamed from: g */
    public static final C40657x f103228g = new C40657x(10007, OPMonitorLevel.NORMAL, "process_invalid_front_user_end_block");

    /* renamed from: h */
    public static final C40657x f103229h = new C40657x(10008, OPMonitorLevel.NORMAL, "process_invalid_front_user_end_goto_bkg");

    /* renamed from: i */
    public static final C40657x f103230i = new C40657x(10009, OPMonitorLevel.NORMAL, "process_invalid_front_user_end_logout_all");

    /* renamed from: j */
    public static final C40657x f103231j = new C40657x(10010, OPMonitorLevel.NORMAL, "process_invalid_front_user_end_switch_succ");

    public C40657x(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.monitor.session_invalid", i, oPMonitorLevel, str);
    }

    public C40657x(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
