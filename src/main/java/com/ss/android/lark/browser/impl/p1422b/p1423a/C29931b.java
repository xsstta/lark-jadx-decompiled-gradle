package com.ss.android.lark.browser.impl.p1422b.p1423a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.browser.impl.b.a.b */
public class C29931b extends OPMonitorCode {

    /* renamed from: A */
    public static final C29934c f74667A = new C29934c(10003, OPMonitorLevel.NORMAL, "share_upload_image_success");

    /* renamed from: B */
    public static final C29934c f74668B = new C29934c(10004, OPMonitorLevel.ERROR, "share_upload_image_failed");

    /* renamed from: C */
    public static final C29934c f74669C = new C29934c(10005, OPMonitorLevel.NORMAL, "share_container_start");

    /* renamed from: a */
    public static final OPMonitorCode f74670a = new C29933b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "upload_info_success");

    /* renamed from: b */
    public static final OPMonitorCode f74671b = new C29933b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "update_info_fail");

    /* renamed from: c */
    public static final OPMonitorCode f74672c = new C29933b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "update_info_name_mismatch");

    /* renamed from: d */
    public static final OPMonitorCode f74673d = new C29933b(10003, OPMonitorLevel.ERROR, "update_info_code_mismatch");

    /* renamed from: e */
    public static final OPMonitorCode f74674e = new C29933b(10004, OPMonitorLevel.ERROR, "update_info_mobile_mismatch");

    /* renamed from: f */
    public static final OPMonitorCode f74675f = new C29933b(10005, OPMonitorLevel.NORMAL, "check_has_authed_success");

    /* renamed from: g */
    public static final OPMonitorCode f74676g = new C29933b(10006, OPMonitorLevel.ERROR, "check_has_authed_not_auth");

    /* renamed from: h */
    public static final OPMonitorCode f74677h = new C29933b(10007, OPMonitorLevel.NORMAL, "get_user_ticket_success");

    /* renamed from: i */
    public static final OPMonitorCode f74678i = new C29933b(10008, OPMonitorLevel.ERROR, "invalid_server_request_param");

    /* renamed from: j */
    public static final OPMonitorCode f74679j = new C29933b(10009, OPMonitorLevel.ERROR, "network_error");

    /* renamed from: k */
    public static final OPMonitorCode f74680k = new C29933b(10010, OPMonitorLevel.ERROR, "internal_error");

    /* renamed from: l */
    public static final OPMonitorCode f74681l = new C29933b(10011, OPMonitorLevel.NORMAL, "face_live_success");

    /* renamed from: m */
    public static final OPMonitorCode f74682m = new C29933b(10012, OPMonitorLevel.WARN, "face_live_user_cancel");

    /* renamed from: n */
    public static final OPMonitorCode f74683n = new C29933b(10013, OPMonitorLevel.WARN, "face_live_user_cancel_after_error");

    /* renamed from: o */
    public static final OPMonitorCode f74684o = new C29933b(10014, OPMonitorLevel.WARN, "face_live_device_interrupt");

    /* renamed from: p */
    public static final OPMonitorCode f74685p = new C29933b(10015, OPMonitorLevel.ERROR, "face_live_internal_error");

    /* renamed from: q */
    public static final OPMonitorCode f74686q = new C29933b(10019, OPMonitorLevel.ERROR, "upload_info_param_error");

    /* renamed from: r */
    public static final OPMonitorCode f74687r = new C29932a(11001, OPMonitorLevel.NORMAL, "lark webview has dirty session");

    /* renamed from: s */
    public static final OPMonitorCode f74688s = new C29932a(11002, OPMonitorLevel.NORMAL, "lark webview delete dirty session end");

    /* renamed from: t */
    public static final OPMonitorCode f74689t = new C29932a(11003, OPMonitorLevel.ERROR, "lark webview get cookie map error");

    /* renamed from: u */
    public static final OPMonitorCode f74690u = new C29932a(11004, OPMonitorLevel.NORMAL, "lark webview begin check session");

    /* renamed from: v */
    public static final OPMonitorCode f74691v = new C29932a(11005, OPMonitorLevel.ERROR, "lark webview clean session error");

    /* renamed from: w */
    public static final OPMonitorCode f74692w = new C29932a(11006, OPMonitorLevel.ERROR, "lark webview judging condition error");

    /* renamed from: x */
    public static final OPMonitorCode f74693x = new C29932a(11007, OPMonitorLevel.NORMAL, "lark webview delete dirty session start");

    /* renamed from: y */
    public static final C29934c f74694y = new C29934c(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "share_entry_start");

    /* renamed from: z */
    public static final C29934c f74695z = new C29934c(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "share_api_verify_failed");

    /* renamed from: com.ss.android.lark.browser.impl.b.a.b$a */
    public static class C29932a extends OPMonitorCode {
        public C29932a(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.cookie.monitor", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.ss.android.lark.browser.impl.b.a.b$b */
    public static class C29933b extends OPMonitorCode {
        public C29933b(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.api.face_liveness", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.ss.android.lark.browser.impl.b.a.b$c */
    public static class C29934c extends OPMonitorCode {
        public C29934c(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.share", i, oPMonitorLevel, str);
        }
    }
}
