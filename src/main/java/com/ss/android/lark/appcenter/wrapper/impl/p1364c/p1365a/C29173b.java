package com.ss.android.lark.appcenter.wrapper.impl.p1364c.p1365a;

import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.c.a.b */
public class C29173b extends OPMonitorCode {

    /* renamed from: a */
    public static final OPMonitorCode f72992a = new C29174a(10005, OPMonitorLevel.NORMAL, "check_has_authed_success");

    /* renamed from: b */
    public static final OPMonitorCode f72993b = new C29174a(10006, OPMonitorLevel.ERROR, "check_has_authed_not_auth");

    /* renamed from: c */
    public static final OPMonitorCode f72994c = new C29174a(10007, OPMonitorLevel.NORMAL, "get_user_ticket_success");

    /* renamed from: d */
    public static final OPMonitorCode f72995d = new C29174a(10008, OPMonitorLevel.ERROR, "invalid_server_request_param");

    /* renamed from: e */
    public static final OPMonitorCode f72996e = new C29174a(10009, OPMonitorLevel.ERROR, "network_error");

    /* renamed from: f */
    public static final OPMonitorCode f72997f = new C29174a(10010, OPMonitorLevel.ERROR, "internal_error");

    /* renamed from: g */
    public static final OPMonitorCode f72998g = new C29174a(10011, OPMonitorLevel.NORMAL, "face_live_success");

    /* renamed from: h */
    public static final OPMonitorCode f72999h = new C29174a(10012, OPMonitorLevel.WARN, "face_live_user_cancel");

    /* renamed from: i */
    public static final OPMonitorCode f73000i = new C29174a(10013, OPMonitorLevel.WARN, "face_live_user_cancel_after_error");

    /* renamed from: j */
    public static final OPMonitorCode f73001j = new C29174a(10014, OPMonitorLevel.WARN, "face_live_device_interrupt");

    /* renamed from: k */
    public static final OPMonitorCode f73002k = new C29174a(10015, OPMonitorLevel.ERROR, "face_live_internal_error");

    /* renamed from: l */
    public static final OPMonitorCode f73003l = new C29174a(10016, OPMonitorLevel.ERROR, "check_has_authed_error");

    /* renamed from: m */
    public static final OPMonitorCode f73004m = new C29174a(10018, OPMonitorLevel.ERROR, "get_user_ticket_error");

    /* renamed from: n */
    public static final OPMonitorCode f73005n = new C29174a(10020, OPMonitorLevel.ERROR, "check_has_authed_param_error");

    /* renamed from: com.ss.android.lark.appcenter.wrapper.impl.c.a.b$a */
    public static class C29174a extends OPMonitorCode {
        public C29174a(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.api.face_liveness", i, oPMonitorLevel, str);
        }
    }
}
