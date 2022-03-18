package com.tt.miniapphost.p3371e.p3372a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.tt.miniapphost.e.a.b */
public class C67501b {

    /* renamed from: A */
    public static final C67502a f170207A = new C67502a(10003, OPMonitorLevel.ERROR, "meta_encrypt_decrypt_failed");

    /* renamed from: B */
    public static final C67502a f170208B = new C67502a(10004, OPMonitorLevel.ERROR, "meta_server_error");

    /* renamed from: C */
    public static final C67502a f170209C = new C67502a(10005, OPMonitorLevel.ERROR, "response_invalid");

    /* renamed from: D */
    public static final C67502a f170210D = new C67502a(10006, OPMonitorLevel.ERROR, "meta_parse_invalid");

    /* renamed from: E */
    public static final C67502a f170211E = new C67502a(10007, OPMonitorLevel.ERROR, "pkg_mask_verified_failed");

    /* renamed from: F */
    public static final C67502a f170212F = new C67502a(10008, OPMonitorLevel.ERROR, "pkg_md5_verified_failed");

    /* renamed from: G */
    public static final C67502a f170213G = new C67502a(10009, OPMonitorLevel.ERROR, "pkg_download_canceled");

    /* renamed from: H */
    public static final C67502a f170214H = new C67502a(10010, OPMonitorLevel.ERROR, "no_pkg_download_url");

    /* renamed from: I */
    public static final C67502a f170215I = new C67502a(10011, OPMonitorLevel.ERROR, "pkg_not_found");

    /* renamed from: J */
    public static final C67502a f170216J = new C67502a(10012, OPMonitorLevel.ERROR, "pkg_file_not_found");

    /* renamed from: K */
    public static final C67502a f170217K = new C67502a(10013, OPMonitorLevel.ERROR, "pkg_data_failed");

    /* renamed from: L */
    public static final C67502a f170218L = new C67502a(10014, OPMonitorLevel.ERROR, "pkg_read_timeout");

    /* renamed from: M */
    public static final C67502a f170219M = new C67502a(10015, OPMonitorLevel.ERROR, "pkg_data_parse_failed");

    /* renamed from: N */
    public static final C67502a f170220N = new C67502a(10016, OPMonitorLevel.ERROR, "pkg_file_content_invalid");

    /* renamed from: O */
    public static final C67502a f170221O = new C67502a(10017, OPMonitorLevel.ERROR, "create_dir_failed");

    /* renamed from: P */
    public static final C67502a f170222P = new C67502a(10018, OPMonitorLevel.ERROR, "path_invalid");

    /* renamed from: Q */
    public static final C67502a f170223Q = new C67502a(10019, OPMonitorLevel.ERROR, "write_data_failed");

    /* renamed from: R */
    public static final C67502a f170224R = new C67502a(10020, OPMonitorLevel.ERROR, "pkg_version_too_old");

    /* renamed from: S */
    public static final C67502a f170225S = new C67502a(10021, OPMonitorLevel.ERROR, "webview_terminated");

    /* renamed from: T */
    public static final C67502a f170226T = new C67502a(10023, OPMonitorLevel.ERROR, "meta_data_invalid");

    /* renamed from: U */
    public static final C67502a f170227U = new C67502a(10024, OPMonitorLevel.ERROR, "pkg_br_decode_failed");

    /* renamed from: V */
    public static final C67502a f170228V = new C67502a(10025, OPMonitorLevel.ERROR, "not_ready_in_time");

    /* renamed from: W */
    public static final C67502a f170229W = new C67502a(10029, OPMonitorLevel.NORMAL, "v8port_init");

    /* renamed from: X */
    public static final C67502a f170230X = new C67502a(10030, OPMonitorLevel.NORMAL, "meta_parse_time");

    /* renamed from: Y */
    public static final C67502a f170231Y = new C67502a(10031, OPMonitorLevel.NORMAL, "meta_sp_time");

    /* renamed from: Z */
    public static final C67505d f170232Z = new C67505d(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "unknown_error");

    /* renamed from: a */
    public static final C67503b f170233a = new C67503b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "invalid_params");
    public static final OPMonitorCode aA = new C67505d(10027, OPMonitorLevel.NORMAL, "attach_first_page");
    public static final C67506e aB = new C67506e(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "page_appear");
    public static final C67506e aC = new C67506e(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "page_onready");
    public static final C67506e aD = new C67506e(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "page_disappear");
    public static final C67506e aE = new C67506e(10003, OPMonitorLevel.NORMAL, "gadget_foreground");
    public static final C67506e aF = new C67506e(10004, OPMonitorLevel.NORMAL, "gadget_background");
    public static final C67506e aG = new C67506e(10007, OPMonitorLevel.NORMAL, "gadget_close");
    public static final OPMonitorCode aH = new C67504c(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "upload_info_success");
    public static final OPMonitorCode aI = new C67504c(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "update_info_fail");
    public static final OPMonitorCode aJ = new C67504c(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "update_info_name_mismatch");
    public static final OPMonitorCode aK = new C67504c(10003, OPMonitorLevel.ERROR, "update_info_code_mismatch");
    public static final OPMonitorCode aL = new C67504c(10004, OPMonitorLevel.ERROR, "update_info_mobile_mismatch");
    public static final OPMonitorCode aM = new C67504c(10005, OPMonitorLevel.NORMAL, "check_has_authed_success");
    public static final OPMonitorCode aN = new C67504c(10006, OPMonitorLevel.ERROR, "check_has_authed_not_auth");
    public static final OPMonitorCode aO = new C67504c(10007, OPMonitorLevel.NORMAL, "get_user_ticket_success");
    public static final OPMonitorCode aP = new C67504c(10008, OPMonitorLevel.ERROR, "invalid_server_request_param");
    public static final OPMonitorCode aQ = new C67504c(10009, OPMonitorLevel.ERROR, "network_error");
    public static final OPMonitorCode aR = new C67504c(10010, OPMonitorLevel.ERROR, "internal_error");
    public static final OPMonitorCode aS = new C67504c(10011, OPMonitorLevel.NORMAL, "face_live_success");
    public static final OPMonitorCode aT = new C67504c(10012, OPMonitorLevel.WARN, "face_live_user_cancel");
    public static final OPMonitorCode aU = new C67504c(10013, OPMonitorLevel.WARN, "face_live_user_cancel_after_error");
    public static final OPMonitorCode aV = new C67504c(10014, OPMonitorLevel.WARN, "face_live_device_interrupt");
    public static final OPMonitorCode aW = new C67504c(10015, OPMonitorLevel.ERROR, "face_live_internal_error");
    public static final OPMonitorCode aX = new C67504c(10016, OPMonitorLevel.ERROR, "check_has_authed_error");
    public static final OPMonitorCode aY = new C67504c(10018, OPMonitorLevel.ERROR, "get_user_ticket_error");
    public static final OPMonitorCode aZ = new C67504c(10019, OPMonitorLevel.ERROR, "upload_info_param_error");
    public static final C67505d aa = new C67505d(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "success");
    public static final C67505d ab = new C67505d(UpdateDialogStatusCode.SHOW, OPMonitorLevel.WARN, "cancel");
    public static final C67505d ac = new C67505d(10003, OPMonitorLevel.ERROR, "device_unavailable");
    public static final C67505d ad = new C67505d(10004, OPMonitorLevel.ERROR, "environment_invalid");
    public static final C67505d ae = new C67505d(10005, OPMonitorLevel.ERROR, "invalid_appid");
    public static final C67505d af = new C67505d(10006, OPMonitorLevel.ERROR, "invalid_host");
    public static final C67505d ag = new C67505d(10007, OPMonitorLevel.ERROR, "error_type_app");
    public static final C67505d ah = new C67505d(10008, OPMonitorLevel.ERROR, "error_type_game");

    /* renamed from: ai  reason: collision with root package name */
    public static final C67505d f175470ai = new C67505d(10009, OPMonitorLevel.ERROR, "meta_info_fail");
    public static final C67505d aj = new C67505d(10010, OPMonitorLevel.ERROR, "download_fail");
    public static final C67505d ak = new C67505d(10011, OPMonitorLevel.ERROR, "offline");
    public static final C67505d al = new C67505d(10012, OPMonitorLevel.ERROR, "jssdk_old");
    public static final C67505d am = new C67505d(10013, OPMonitorLevel.ERROR, "service_disabled");
    public static final C67505d an = new C67505d(10014, OPMonitorLevel.ERROR, "no_permission");
    public static final C67505d ao = new C67505d(10015, OPMonitorLevel.ERROR, "incompatible");
    public static final C67505d ap = new C67505d(10016, OPMonitorLevel.ERROR, "entry_control_disabled");
    public static final C67505d aq = new C67505d(10017, OPMonitorLevel.ERROR, "preview_expired");
    public static final C67505d ar = new C67505d(10018, OPMonitorLevel.ERROR, "orientation_landscape_unsupport");
    public static final C67505d as = new C67505d(10019, OPMonitorLevel.ERROR, "orientation_portrait_unsupport");
    public static final C67505d at = new C67505d(10020, OPMonitorLevel.ERROR, "timeout");
    public static final C67505d au = new C67505d(10021, OPMonitorLevel.ERROR, "app_state_cancel");
    public static final C67505d av = new C67505d(10022, OPMonitorLevel.ERROR, "app_state_timeout");
    public static final C67505d aw = new C67505d(10023, OPMonitorLevel.ERROR, "ready_timeout");
    public static final C67505d ax = new C67505d(10024, OPMonitorLevel.ERROR, "open_mini_app_activity_failed");
    public static final C67505d ay = new C67505d(10025, OPMonitorLevel.ERROR, "parse_app_config_failed");
    public static final C67505d az = new C67505d(10026, OPMonitorLevel.ERROR, "app_context_error");

    /* renamed from: b */
    public static final C67503b f170234b = new C67503b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "init_error");
    public static final OPMonitorCode ba = new C67504c(10030, OPMonitorLevel.NORMAL, "offline_check_success");
    public static final OPMonitorCode bb = new C67504c(10031, OPMonitorLevel.ERROR, "offline_check_other_error");
    public static final OPMonitorCode bc = new C67504c(10032, OPMonitorLevel.NORMAL, "offline_check_not_downloaded");
    public static final OPMonitorCode bd = new C67504c(10033, OPMonitorLevel.WARN, "offline_check_no_model");
    public static final OPMonitorCode be = new C67504c(10034, OPMonitorLevel.ERROR, "offline_check_md5_error");
    public static final OPMonitorCode bf = new C67504c(10040, OPMonitorLevel.NORMAL, "offline_prepare_success");
    public static final OPMonitorCode bg = new C67504c(10041, OPMonitorLevel.ERROR, "offline_prepare_other_error");
    public static final OPMonitorCode bh = new C67504c(10042, OPMonitorLevel.ERROR, "offline_prepare_download_failed");
    public static final OPMonitorCode bi = new C67504c(10043, OPMonitorLevel.NORMAL, "offline_prepare_not_needed");
    public static final OPMonitorCode bj = new C67504c(10044, OPMonitorLevel.WARN, "offline_prepare_timeout");
    public static final OPMonitorCode bk = new C67504c(10050, OPMonitorLevel.NORMAL, "offline_verify_success");
    public static final OPMonitorCode bl = new C67504c(10051, OPMonitorLevel.NORMAL, "offline_verify_other_error");
    public static final OPMonitorCode bm = new C67504c(10052, OPMonitorLevel.ERROR, "offline_verify_img_read_failed");
    public static final OPMonitorCode bn = new C67504c(10053, OPMonitorLevel.ERROR, "offline_verify_liveness_init_error");
    public static final OPMonitorCode bo = new C67504c(10054, OPMonitorLevel.WARN, "offline_verify_liveness_failed");
    public static final OPMonitorCode bp = new C67504c(10055, OPMonitorLevel.ERROR, "offline_verify_compare_init_failed");
    public static final OPMonitorCode bq = new C67504c(10056, OPMonitorLevel.WARN, "offline_verify_compare_failed");
    public static final OPMonitorCode br = new C67508g(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "gadget load normal webview");
    public static final OPMonitorCode bs = new C67508g(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "gadget load larkwebview");
    public static final OPMonitorCode bt = new C67508g(10003, OPMonitorLevel.NORMAL, "gadget web-view load normal webview");
    public static final OPMonitorCode bu = new C67508g(10004, OPMonitorLevel.NORMAL, "gadget web-view load larkwebview");
    public static final OPMonitorCode bv = new C67507f(1000, OPMonitorLevel.NORMAL, "gadget_router_repeat");

    /* renamed from: c */
    public static final C67503b f170235c = new C67503b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "load_page_frame_html_error");

    /* renamed from: d */
    public static final C67503b f170236d = new C67503b(10003, OPMonitorLevel.ERROR, "load_page_frame_script_error");

    /* renamed from: e */
    public static final C67503b f170237e = new C67503b(10004, OPMonitorLevel.ERROR, "load_path_frame_script_error");

    /* renamed from: f */
    public static final C67503b f170238f = new C67503b(10005, OPMonitorLevel.ERROR, "webview_load_exception");

    /* renamed from: g */
    public static final C67503b f170239g = new C67503b(10006, OPMonitorLevel.ERROR, "read_script_content_from_file_error");

    /* renamed from: h */
    public static final C67503b f170240h = new C67503b(10007, OPMonitorLevel.ERROR, "batch_read_script_content_from_file_error");

    /* renamed from: i */
    public static final C67503b f170241i = new C67503b(10008, OPMonitorLevel.ERROR, "load_script_from_url_error");

    /* renamed from: j */
    public static final C67503b f170242j = new C67503b(10009, OPMonitorLevel.ERROR, "webview_crash");

    /* renamed from: k */
    public static final C67503b f170243k = new C67503b(10010, OPMonitorLevel.WARN, "evaluate_javascript_error");

    /* renamed from: l */
    public static final C67503b f170244l = new C67503b(10011, OPMonitorLevel.ERROR, "schema_check_error");

    /* renamed from: m */
    public static final C67503b f170245m = new C67503b(10012, OPMonitorLevel.ERROR, "js_runtime_error");

    /* renamed from: n */
    public static final C67503b f170246n = new C67503b(10013, OPMonitorLevel.ERROR, "jssdk_download_failed");

    /* renamed from: o */
    public static final C67503b f170247o = new C67503b(10014, OPMonitorLevel.ERROR, "webview_blank_detect");

    /* renamed from: p */
    public static final C67503b f170248p = new C67503b(10015, OPMonitorLevel.ERROR, "webview_blank_close");

    /* renamed from: q */
    public static final C67503b f170249q = new C67503b(10056, OPMonitorLevel.ERROR, "read old platform session");

    /* renamed from: r */
    public static final C67503b f170250r = new C67503b(10057, OPMonitorLevel.ERROR, "add_into_workplace_error");

    /* renamed from: s */
    public static final C67503b f170251s = new C67503b(10058, OPMonitorLevel.ERROR, "remove_from_workplace_error");

    /* renamed from: t */
    public static final C67503b f170252t = new C67503b(10059, OPMonitorLevel.NORMAL, "add_into_workplace_success");

    /* renamed from: u */
    public static final C67503b f170253u = new C67503b(10060, OPMonitorLevel.NORMAL, "remove_from_workplace_success");

    /* renamed from: v */
    public static final C67503b f170254v = new C67503b(10061, OPMonitorLevel.ERROR, "load_workplace_data_error");

    /* renamed from: w */
    public static final C67503b f170255w = new C67503b(10062, OPMonitorLevel.NORMAL, "APP_START_CPU_LOAD");

    /* renamed from: x */
    public static final C67502a f170256x = new C67502a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.WARN, "unknown");

    /* renamed from: y */
    public static final C67502a f170257y = new C67502a(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "request_error");

    /* renamed from: z */
    public static final C67502a f170258z = new C67502a(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "meta_invalid_params");

    /* renamed from: com.tt.miniapphost.e.a.b$a */
    static class C67502a extends OPMonitorCode {
        public C67502a(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.gadget.app_load", i, oPMonitorLevel, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapphost.e.a.b$b */
    public static class C67503b extends OPMonitorCode {
        public C67503b(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.gadget", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.tt.miniapphost.e.a.b$c */
    static class C67504c extends OPMonitorCode {
        public C67504c(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.api.face_liveness", i, oPMonitorLevel, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapphost.e.a.b$d */
    public static class C67505d extends OPMonitorCode {
        public C67505d(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.gadget.launch", i, oPMonitorLevel, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapphost.e.a.b$e */
    public static class C67506e extends OPMonitorCode {
        public C67506e(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.gadget.lifecycle", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.tt.miniapphost.e.a.b$f */
    static class C67507f extends OPMonitorCode {
        public C67507f(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.gadget.router", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.tt.miniapphost.e.a.b$g */
    static class C67508g extends OPMonitorCode {
        public C67508g(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.gadget.webview", i, oPMonitorLevel, str);
        }
    }
}
