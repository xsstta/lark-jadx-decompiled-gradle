package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.v */
public class C40655v extends OPMonitorCode {

    /* renamed from: a */
    public static final C40655v f103204a = new C40655v(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "passport_logout_start");

    /* renamed from: b */
    public static final C40655v f103205b = new C40655v(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "passport_logout_end_succ");

    /* renamed from: c */
    public static final C40655v f103206c = new C40655v(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "passport_logout_end_fail");

    /* renamed from: d */
    public static final C40655v f103207d = new C40655v(10003, OPMonitorLevel.NORMAL, "passport_logout_app_request_start");

    /* renamed from: e */
    public static final C40655v f103208e = new C40655v(10004, OPMonitorLevel.NORMAL, "passport_logout_app_request_succ");

    /* renamed from: f */
    public static final C40655v f103209f = new C40655v(10005, OPMonitorLevel.ERROR, "passport_logout_app_request_fail");

    /* renamed from: g */
    public static final C40655v f103210g = new C40655v(10006, OPMonitorLevel.NORMAL, "passport_logout_offline_task_start");

    /* renamed from: h */
    public static final C40655v f103211h = new C40655v(10007, OPMonitorLevel.NORMAL, "passport_logout_offline_task_end_succ");

    /* renamed from: i */
    public static final C40655v f103212i = new C40655v(10008, OPMonitorLevel.NORMAL, "passport_logout_offline_task_end_fail");

    /* renamed from: j */
    public static final C40655v f103213j = new C40655v(10009, OPMonitorLevel.NORMAL, "passport_logout_token_request_start");

    /* renamed from: k */
    public static final C40655v f103214k = new C40655v(10010, OPMonitorLevel.NORMAL, "passport_logout_token_request_succ");

    /* renamed from: l */
    public static final C40655v f103215l = new C40655v(10011, OPMonitorLevel.ERROR, "passport_logout_token_request_fail");

    /* renamed from: m */
    public static final C40655v f103216m = new C40655v(10012, OPMonitorLevel.NORMAL, "passport_logout_rust_offline_start");

    /* renamed from: n */
    public static final C40655v f103217n = new C40655v(10013, OPMonitorLevel.NORMAL, "passport_logout_rust_offline_succ");

    /* renamed from: o */
    public static final C40655v f103218o = new C40655v(10014, OPMonitorLevel.ERROR, "passport_logout_rust_offline_fail");

    public C40655v(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.monitor.logout", i, oPMonitorLevel, str);
    }

    public C40655v(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
