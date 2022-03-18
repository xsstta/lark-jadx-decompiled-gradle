package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.r */
public class C40651r extends OPMonitorCode {

    /* renamed from: a */
    public static final C40651r f103139a = new C40651r(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "qr_login_scan_request_start");

    /* renamed from: b */
    public static final C40651r f103140b = new C40651r(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "qr_login_scan_request_succ");

    /* renamed from: c */
    public static final C40651r f103141c = new C40651r(10003, OPMonitorLevel.ERROR, "qr_login_scan_request_fail");

    /* renamed from: d */
    public static final C40651r f103142d = new C40651r(10004, OPMonitorLevel.NORMAL, "page_suite_enter");

    /* renamed from: e */
    public static final C40651r f103143e = new C40651r(10005, OPMonitorLevel.NORMAL, "page_authz_enter");

    /* renamed from: f */
    public static final C40651r f103144f = new C40651r(10006, OPMonitorLevel.NORMAL, "qr_login_confirm_request_start");

    /* renamed from: g */
    public static final C40651r f103145g = new C40651r(10007, OPMonitorLevel.NORMAL, "qr_login_confirm_request_succ");

    /* renamed from: h */
    public static final C40651r f103146h = new C40651r(10008, OPMonitorLevel.ERROR, "qr_login_confirm_request_fail");

    /* renamed from: i */
    public static final C40651r f103147i = new C40651r(10009, OPMonitorLevel.NORMAL, "qr_login_cancle_request_start");

    /* renamed from: j */
    public static final C40651r f103148j = new C40651r(10010, OPMonitorLevel.NORMAL, "qr_login_cancle_request_succ");

    /* renamed from: k */
    public static final C40651r f103149k = new C40651r(10011, OPMonitorLevel.ERROR, "qr_login_cancle_request_fail");

    /* renamed from: l */
    public static final C40651r f103150l = new C40651r(10012, OPMonitorLevel.NORMAL, "sso_sdk_auth_router_enter");

    /* renamed from: m */
    public static final C40651r f103151m = new C40651r(10013, OPMonitorLevel.NORMAL, "page_sso_sdk_auth_loading_enter");

    /* renamed from: n */
    public static final C40651r f103152n = new C40651r(10014, OPMonitorLevel.NORMAL, "sso_sdk_login_auth_request_start");

    /* renamed from: o */
    public static final C40651r f103153o = new C40651r(10015, OPMonitorLevel.NORMAL, "sso_sdk_login_auth_request_succ");

    /* renamed from: p */
    public static final C40651r f103154p = new C40651r(10016, OPMonitorLevel.ERROR, "sso_sdk_login_auth_request_fail");

    /* renamed from: q */
    public static final C40651r f103155q = new C40651r(10017, OPMonitorLevel.NORMAL, "sso_sdk_login_auth_confirm_request_succ");

    /* renamed from: r */
    public static final C40651r f103156r = new C40651r(10018, OPMonitorLevel.ERROR, "sso_sdk_login_auth_confirm_request_fail");

    /* renamed from: s */
    public static final C40651r f103157s = new C40651r(10019, OPMonitorLevel.NORMAL, "sso_sdk_login_auth_cancle");

    public C40651r(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.monitor.authorization", i, oPMonitorLevel, str);
    }

    public C40651r(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
