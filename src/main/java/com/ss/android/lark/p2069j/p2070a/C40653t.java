package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.t */
public class C40653t extends OPMonitorCode {

    /* renamed from: a */
    public static final C40653t f103165a = new C40653t(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "join_by_scan_code_entry");

    /* renamed from: b */
    public static final C40653t f103166b = new C40653t(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "join_by_scan_code_scan_succ");

    /* renamed from: c */
    public static final C40653t f103167c = new C40653t(10003, OPMonitorLevel.NORMAL, "join_by_scan_code_request_start");

    /* renamed from: d */
    public static final C40653t f103168d = new C40653t(10004, OPMonitorLevel.NORMAL, "join_by_scan_code_request_succ");

    /* renamed from: e */
    public static final C40653t f103169e = new C40653t(10005, OPMonitorLevel.ERROR, "join_by_scan_code_request_fail");

    /* renamed from: f */
    public static final C40653t f103170f = new C40653t(10006, OPMonitorLevel.NORMAL, "join_by_scan_code_join_succ");

    /* renamed from: g */
    public static final C40653t f103171g = new C40653t(10007, OPMonitorLevel.NORMAL, "join_by_team_code_entry");

    /* renamed from: h */
    public static final C40653t f103172h = new C40653t(10009, OPMonitorLevel.NORMAL, "join_by_team_code_request_start");

    /* renamed from: i */
    public static final C40653t f103173i = new C40653t(10010, OPMonitorLevel.NORMAL, "join_by_team_code_request_succ");

    /* renamed from: j */
    public static final C40653t f103174j = new C40653t(10011, OPMonitorLevel.ERROR, "join_by_team_code_request_fail");

    /* renamed from: k */
    public static final C40653t f103175k = new C40653t(10012, OPMonitorLevel.NORMAL, "join_by_team_code_join_succ");

    public C40653t(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.monitor.invitation_join", i, oPMonitorLevel, str);
    }

    public C40653t(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
