package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.y */
public class C40658y extends OPMonitorCode {

    /* renamed from: a */
    public static final C40658y f103232a = new C40658y(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "switch_user_start");

    /* renamed from: b */
    public static final C40658y f103233b = new C40658y(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "switch_user_end_succ");

    /* renamed from: c */
    public static final C40658y f103234c = new C40658y(10003, OPMonitorLevel.ERROR, "switch_user_end_fail");

    /* renamed from: d */
    public static final C40658y f103235d = new C40658y(10004, OPMonitorLevel.NORMAL, "switch_identity_request_start");

    /* renamed from: e */
    public static final C40658y f103236e = new C40658y(10005, OPMonitorLevel.NORMAL, "switch_identity_request_succ");

    /* renamed from: f */
    public static final C40658y f103237f = new C40658y(10006, OPMonitorLevel.NORMAL, "enter_app_cross_user_entry");

    /* renamed from: g */
    public static final C40658y f103238g = new C40658y(10007, OPMonitorLevel.NORMAL, "cross_env_and_device_id_succ");

    /* renamed from: h */
    public static final C40658y f103239h = new C40658y(10008, OPMonitorLevel.NORMAL, "make_offline_process_start");

    /* renamed from: i */
    public static final C40658y f103240i = new C40658y(10009, OPMonitorLevel.NORMAL, "make_offline_process_end");

    /* renamed from: j */
    public static final C40658y f103241j = new C40658y(10010, OPMonitorLevel.NORMAL, "make_online_process_start");

    /* renamed from: k */
    public static final C40658y f103242k = new C40658y(10011, OPMonitorLevel.NORMAL, "make_online_process_end");

    /* renamed from: l */
    public static final C40658y f103243l = new C40658y(10012, OPMonitorLevel.NORMAL, "switch_to_invalid_session_user_start");

    /* renamed from: m */
    public static final C40658y f103244m = new C40658y(10013, OPMonitorLevel.NORMAL, "check_status_request_start");

    /* renamed from: n */
    public static final C40658y f103245n = new C40658y(10014, OPMonitorLevel.NORMAL, "check_status_request_succ");

    /* renamed from: o */
    public static final C40658y f103246o = new C40658y(10015, OPMonitorLevel.NORMAL, "switch_to_invalid_session_user_goto_switch_user");

    /* renamed from: p */
    public static final C40658y f103247p = new C40658y(10016, OPMonitorLevel.NORMAL, "switch_target_null_and_user_id_empty");

    /* renamed from: q */
    public static final C40658y f103248q = new C40658y(10017, OPMonitorLevel.NORMAL, "switch_target_null_and_request_tenant_beg");

    /* renamed from: r */
    public static final C40658y f103249r = new C40658y(10018, OPMonitorLevel.NORMAL, "switch_target_null_and_request_tenant_succ_next");

    /* renamed from: s */
    public static final C40658y f103250s = new C40658y(10019, OPMonitorLevel.ERROR, "switch_target_null_and_request_tenant_fail_end");

    public C40658y(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.monitor.switch_user", i, oPMonitorLevel, str);
    }

    public C40658y(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
