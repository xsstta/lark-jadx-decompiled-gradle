package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.u */
public class C40654u extends OPMonitorCode {

    /* renamed from: A */
    public static final C40654u f103176A = new C40654u(10027, OPMonitorLevel.NORMAL, "onekey_mobile_security_scan");

    /* renamed from: B */
    public static final C40654u f103177B = new C40654u(10028, OPMonitorLevel.NORMAL, "onekey_mobile_security_scan_risk");

    /* renamed from: a */
    public static final C40654u f103178a = new C40654u(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "login_page_goto_next_click");

    /* renamed from: b */
    public static final C40654u f103179b = new C40654u(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "login_credential_request_succ");

    /* renamed from: c */
    public static final C40654u f103180c = new C40654u(10003, OPMonitorLevel.NORMAL, "login_auth_code_apply_request_succ");

    /* renamed from: d */
    public static final C40654u f103181d = new C40654u(10004, OPMonitorLevel.NORMAL, "login_auth_code_verify_request_succ");

    /* renamed from: e */
    public static final C40654u f103182e = new C40654u(10005, OPMonitorLevel.NORMAL, "login_auth_pwd_verify_request_succ");

    /* renamed from: f */
    public static final C40654u f103183f = new C40654u(10006, OPMonitorLevel.NORMAL, "login_auth_otp_verify_request_succ");

    /* renamed from: g */
    public static final C40654u f103184g = new C40654u(10007, OPMonitorLevel.NORMAL, "login_goto_user_list_page_succ");

    /* renamed from: h */
    public static final C40654u f103185h = new C40654u(10008, OPMonitorLevel.NORMAL, "login_user_list_app_request_succ");

    /* renamed from: i */
    public static final C40654u f103186i = new C40654u(10009, OPMonitorLevel.NORMAL, "onekey_login_start");

    /* renamed from: j */
    public static final C40654u f103187j = new C40654u(10010, OPMonitorLevel.NORMAL, "onekey_sdk_get_phone_request_start");

    /* renamed from: k */
    public static final C40654u f103188k = new C40654u(10011, OPMonitorLevel.NORMAL, "onekey_sdk_get_phone_request_succ");

    /* renamed from: l */
    public static final C40654u f103189l = new C40654u(10012, OPMonitorLevel.NORMAL, "onekey_login_page_entry");

    /* renamed from: m */
    public static final C40654u f103190m = new C40654u(10013, OPMonitorLevel.NORMAL, "onekey_login_page_goto_login");

    /* renamed from: n */
    public static final C40654u f103191n = new C40654u(10014, OPMonitorLevel.NORMAL, "onekey_sdk_get_token_request_start");

    /* renamed from: o */
    public static final C40654u f103192o = new C40654u(10015, OPMonitorLevel.NORMAL, "onekey_sdk_get_token_request_succ");

    /* renamed from: p */
    public static final C40654u f103193p = new C40654u(10016, OPMonitorLevel.NORMAL, "onekey_mobile_auth_request_start");

    /* renamed from: q */
    public static final C40654u f103194q = new C40654u(10017, OPMonitorLevel.NORMAL, "onekey_mobile_auth_request_succ");

    /* renamed from: r */
    public static final C40654u f103195r = new C40654u(10018, OPMonitorLevel.NORMAL, "onekey_login_end_succ");

    /* renamed from: s */
    public static final C40654u f103196s = new C40654u(10019, OPMonitorLevel.NORMAL, "idp_b_company_login_next_click");

    /* renamed from: t */
    public static final C40654u f103197t = new C40654u(10020, OPMonitorLevel.NORMAL, "idp_b_login_auth_url_request_succ");

    /* renamed from: u */
    public static final C40654u f103198u = new C40654u(10021, OPMonitorLevel.NORMAL, "idp_b_login_auth_url_browser_open");

    /* renamed from: v */
    public static final C40654u f103199v = new C40654u(10022, OPMonitorLevel.NORMAL, "idp_b_login_browser_auth_succ");

    /* renamed from: w */
    public static final C40654u f103200w = new C40654u(10023, OPMonitorLevel.NORMAL, "idp_b_login_idp_dispatch_request_succ");

    /* renamed from: x */
    public static final C40654u f103201x = new C40654u(10024, OPMonitorLevel.NORMAL, "idp_b_login_end_goto_next_succ");

    /* renamed from: y */
    public static final C40654u f103202y = new C40654u(10025, OPMonitorLevel.NORMAL, "idp_c_google_login_click");

    /* renamed from: z */
    public static final C40654u f103203z = new C40654u(10026, OPMonitorLevel.NORMAL, "idp_c_apple_login_click");

    public C40654u(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.monitor.login", i, oPMonitorLevel, str);
    }

    public C40654u(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
