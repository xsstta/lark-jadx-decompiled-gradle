package com.ss.android.lark.p2069j.p2070a;

import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.s */
public class C40652s extends OPMonitorCode {

    /* renamed from: a */
    public static final C40652s f103158a = new C40652s(90001, OPMonitorLevel.NORMAL, "passport_monitor_http_request_start");

    /* renamed from: b */
    public static final C40652s f103159b = new C40652s(90002, OPMonitorLevel.NORMAL, "passport_monitor_http_request_succ");

    /* renamed from: c */
    public static final C40652s f103160c = new C40652s(90003, OPMonitorLevel.ERROR, "passport_monitor_http_request_fail");

    /* renamed from: d */
    public static final C40652s f103161d = new C40652s(90004, OPMonitorLevel.NORMAL, "passport_monitor_step_action_run");

    /* renamed from: e */
    public static final C40652s f103162e = new C40652s(90005, OPMonitorLevel.NORMAL, "passport_monitor_step_page_run");

    /* renamed from: f */
    public static final C40652s f103163f = new C40652s(90006, OPMonitorLevel.NORMAL, "passport_monitor_step_view_run");

    /* renamed from: g */
    public static final C40652s f103164g = new C40652s(90007, OPMonitorLevel.NORMAL, "passport_monitor_step_fun_run");

    public C40652s(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.monitor", i, oPMonitorLevel, str);
    }

    public C40652s(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
