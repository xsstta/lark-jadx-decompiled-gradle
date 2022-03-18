package com.ss.android.appcenter.business.monitor.p1269a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.GeofenceErrorCodes;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.appcenter.business.monitor.a.b */
public class C27702b {

    /* renamed from: A */
    public static final OPMonitorCode f69204A = new C27707e(10214, OPMonitorLevel.ERROR, "workplace_remove_common_app_request_error");

    /* renamed from: B */
    public static final OPMonitorCode f69205B = new C27707e(10215, OPMonitorLevel.NORMAL, "workplace_update_common_item_success");

    /* renamed from: C */
    public static final OPMonitorCode f69206C = new C27707e(10216, OPMonitorLevel.ERROR, "workplace_update_common_item_fail");

    /* renamed from: D */
    public static final OPMonitorCode f69207D = new C27707e(10217, OPMonitorLevel.NORMAL, "workplace_get_user_setting_success");

    /* renamed from: E */
    public static final OPMonitorCode f69208E = new C27707e(10218, OPMonitorLevel.ERROR, "workplace_get_user_setting_fail");

    /* renamed from: F */
    public static final OPMonitorCode f69209F = new C27707e(10219, OPMonitorLevel.NORMAL, "workplace_get_sub_tag_request_success");

    /* renamed from: G */
    public static final OPMonitorCode f69210G = new C27707e(10220, OPMonitorLevel.NORMAL, "workplace_get_sub_tag_request_fail");

    /* renamed from: H */
    public static final OPMonitorCode f69211H = new C27707e(10221, OPMonitorLevel.NORMAL, "workplace_get_operational_config_success");

    /* renamed from: I */
    public static final OPMonitorCode f69212I = new C27707e(10222, OPMonitorLevel.ERROR, "workplace_get_operational_config_fail");

    /* renamed from: J */
    public static final OPMonitorCode f69213J = new C27707e(10301, OPMonitorLevel.NORMAL, "workplace_get_template_list_success");

    /* renamed from: K */
    public static final OPMonitorCode f69214K = new C27707e(10302, OPMonitorLevel.ERROR, "workplace_get_template_list_fail");

    /* renamed from: L */
    public static final OPMonitorCode f69215L = new C27707e(10303, OPMonitorLevel.NORMAL, "workplace_download_template_success");

    /* renamed from: M */
    public static final OPMonitorCode f69216M = new C27707e(10304, OPMonitorLevel.ERROR, "workplace_download_template_fail");

    /* renamed from: N */
    public static final OPMonitorCode f69217N = new C27707e(10305, OPMonitorLevel.NORMAL, "workplace_get_platform_component_data_success");

    /* renamed from: O */
    public static final OPMonitorCode f69218O = new C27707e(10306, OPMonitorLevel.ERROR, "workplace_get_platform_component_data_fail");

    /* renamed from: P */
    public static final OPMonitorCode f69219P = new C27707e(10307, OPMonitorLevel.NORMAL, "workplace_get_external_component_data_success");

    /* renamed from: Q */
    public static final OPMonitorCode f69220Q = new C27707e(10308, OPMonitorLevel.ERROR, "workplace_get_external_component_data_fail");

    /* renamed from: R */
    public static final OPMonitorCode f69221R = new C27707e(10309, OPMonitorLevel.NORMAL, "workplace_page_load");

    /* renamed from: S */
    public static final OPMonitorCode f69222S = new C27707e(10310, OPMonitorLevel.NORMAL, "workplace_page_show_content");

    /* renamed from: T */
    public static final OPMonitorCode f69223T = new C27707e(10311, OPMonitorLevel.ERROR, "workplace_page_show_error");

    /* renamed from: U */
    public static final OPMonitorCode f69224U = new C27707e(10312, OPMonitorLevel.NORMAL, "workplace_startup");

    /* renamed from: V */
    public static final OPMonitorCode f69225V = new C27707e(10313, OPMonitorLevel.NORMAL, "workplace_block_startup");

    /* renamed from: W */
    public static final OPMonitorCode f69226W = new C27707e(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "workplace_not_expected_path");

    /* renamed from: X */
    public static final OPMonitorCode f69227X = new C27707e(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "workplace_method_exception");

    /* renamed from: Y */
    public static final OPMonitorCode f69228Y = new C27704b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "pull_data_success");

    /* renamed from: Z */
    public static final OPMonitorCode f69229Z = new C27704b(10023, OPMonitorLevel.ERROR, "pull_cache_error");

    /* renamed from: a */
    public static final OPMonitorCode f69230a = new C27707e(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "workplace_home_render_success");
    public static final OPMonitorCode aA = new C27705c(10013, OPMonitorLevel.ERROR, "get_cqc_preview_error");
    public static final OPMonitorCode aB = new C27705c(10006, OPMonitorLevel.NORMAL, "get_ulawa_unread_success");
    public static final OPMonitorCode aC = new C27705c(10007, OPMonitorLevel.ERROR, "get_ulawa_unread_error");
    public static final OPMonitorCode aD = new C27705c(10010, OPMonitorLevel.NORMAL, "get_cqc_preview_success");
    public static final OPMonitorCode aE = new C27705c(10011, OPMonitorLevel.ERROR, "get_cqc_preview_error");
    public static final OPMonitorCode aF = new C27705c(10014, OPMonitorLevel.NORMAL, "get_ulawa_unread_success");
    public static final OPMonitorCode aG = new C27705c(10015, OPMonitorLevel.ERROR, "get_ulawa_unread_error");
    public static final OPMonitorCode aH = new C27706d(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "workplace_widget_display_success");
    public static final OPMonitorCode aa = new C27704b(10024, OPMonitorLevel.ERROR, "pull_response_null");
    public static final OPMonitorCode ab = new C27704b(10025, OPMonitorLevel.ERROR, "pull_response_code_error");
    public static final OPMonitorCode ac = new C27704b(10026, OPMonitorLevel.ERROR, "pull_data_null");
    public static final OPMonitorCode ad = new C27704b(10007, OPMonitorLevel.ERROR, "request_app_data_unknown_error");
    public static final OPMonitorCode ae = new C27704b(10027, OPMonitorLevel.ERROR, "pull_json_error");
    public static final OPMonitorCode af = new C27704b(10009, OPMonitorLevel.NORMAL, "fetch_onboarding_app_success");
    public static final OPMonitorCode ag = new C27704b(10028, OPMonitorLevel.ERROR, "fetch_onboarding_response_null");
    public static final OPMonitorCode ah = new C27704b(10029, OPMonitorLevel.ERROR, "fetch_onboarding_response_code_error");

    /* renamed from: ai  reason: collision with root package name */
    public static final OPMonitorCode f175443ai = new C27704b(10030, OPMonitorLevel.ERROR, "fetch_onboarding_data_null");
    public static final OPMonitorCode aj = new C27704b(10031, OPMonitorLevel.ERROR, "fetch_onboarding_request_error");
    public static final OPMonitorCode ak = new C27704b(10032, OPMonitorLevel.ERROR, "fetch_onboarding_json_error");
    public static final OPMonitorCode al = new C27704b(10013, OPMonitorLevel.NORMAL, "install_onboarding_app_success");
    public static final OPMonitorCode am = new C27704b(10014, OPMonitorLevel.ERROR, "install_onboarding_app_error");
    public static final OPMonitorCode an = new C27704b(10033, OPMonitorLevel.ERROR, "install_onboarding_json_error");
    public static final OPMonitorCode ao = new C27704b(10016, OPMonitorLevel.ERROR, "network_host_error");
    public static final OPMonitorCode ap = new C27703a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "update_common_app_success");
    public static final OPMonitorCode aq = new C27703a(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "update_common_app_biz_error");
    public static final OPMonitorCode ar = new C27705c(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "get_malaita_preview_success");
    public static final OPMonitorCode as = new C27705c(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "get_malaita_preview_error");
    public static final OPMonitorCode at = new C27705c(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "get_malaita_unread_success");
    public static final OPMonitorCode au = new C27705c(10003, OPMonitorLevel.ERROR, "get_malaita_unread_error");
    public static final OPMonitorCode av = new C27705c(10004, OPMonitorLevel.NORMAL, "get_ulawa_preview_success");
    public static final OPMonitorCode aw = new C27705c(10005, OPMonitorLevel.ERROR, "get_ulawa_preview_error");
    public static final OPMonitorCode ax = new C27705c(10008, OPMonitorLevel.NORMAL, "get_tns_preview_success");
    public static final OPMonitorCode ay = new C27705c(10009, OPMonitorLevel.ERROR, "get_tns_preview_error");
    public static final OPMonitorCode az = new C27705c(10012, OPMonitorLevel.NORMAL, "get_cqc_preview_success");

    /* renamed from: b */
    public static final OPMonitorCode f69231b = new C27707e(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "workplace_home_render_fail");

    /* renamed from: c */
    public static final OPMonitorCode f69232c = new C27707e(10003, OPMonitorLevel.NORMAL, "workplace_home_get_data_success");

    /* renamed from: d */
    public static final OPMonitorCode f69233d = new C27707e(10004, OPMonitorLevel.ERROR, "workplace_home_get_data_fail");

    /* renamed from: e */
    public static final OPMonitorCode f69234e = new C27707e(10101, OPMonitorLevel.NORMAL, "workplace_widget_render_success");

    /* renamed from: f */
    public static final OPMonitorCode f69235f = new C27707e(10102, OPMonitorLevel.ERROR, "workplace_widget_render_fail");

    /* renamed from: g */
    public static final OPMonitorCode f69236g = new C27707e(10103, OPMonitorLevel.ERROR, "workplace_widget_fail");

    /* renamed from: h */
    public static final OPMonitorCode f69237h = new C27707e(10104, OPMonitorLevel.NORMAL, "workplace_block_render_success");

    /* renamed from: i */
    public static final OPMonitorCode f69238i = new C27707e(10105, OPMonitorLevel.ERROR, "workplace_block_render_fail");

    /* renamed from: j */
    public static final OPMonitorCode f69239j = new C27707e(10107, OPMonitorLevel.NORMAL, "workplace_block_start_mount");

    /* renamed from: k */
    public static final OPMonitorCode f69240k = new C27707e(10108, OPMonitorLevel.NORMAL, "workplace_block_show_content");

    /* renamed from: l */
    public static final OPMonitorCode f69241l = new C27707e(10109, OPMonitorLevel.ERROR, "workplace_block_show_fail");

    /* renamed from: m */
    public static final OPMonitorCode f69242m = new C27707e(10110, OPMonitorLevel.NORMAL, "workplace_block_invoke_api");

    /* renamed from: n */
    public static final OPMonitorCode f69243n = new C27707e(GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT, OPMonitorLevel.NORMAL, "workplace_myapp_page_render_success");

    /* renamed from: o */
    public static final OPMonitorCode f69244o = new C27707e(GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT, OPMonitorLevel.ERROR, "workplace_myapp_page_render_fail");

    /* renamed from: p */
    public static final OPMonitorCode f69245p = new C27707e(10203, OPMonitorLevel.NORMAL, "workplace_addapp_page_render_success");

    /* renamed from: q */
    public static final OPMonitorCode f69246q = new C27707e(GeofenceErrorCodes.GEOFENCE_INSUFFICIENT_PERMISSION, OPMonitorLevel.ERROR, "workplace_addapp_page_render_fail");

    /* renamed from: r */
    public static final OPMonitorCode f69247r = new C27707e(GeofenceErrorCodes.GEOFENCE_REQUEST_TOO_OFTEN, OPMonitorLevel.NORMAL, "workplace_rank_page_request_success");

    /* renamed from: s */
    public static final OPMonitorCode f69248s = new C27707e(10206, OPMonitorLevel.ERROR, "workplace_rank_page_request_error");

    /* renamed from: t */
    public static final OPMonitorCode f69249t = new C27707e(10207, OPMonitorLevel.NORMAL, "workplace_category_search_request_success");

    /* renamed from: u */
    public static final OPMonitorCode f69250u = new C27707e(10208, OPMonitorLevel.ERROR, "workplace_category_search_request_error");

    /* renamed from: v */
    public static final OPMonitorCode f69251v = new C27707e(10209, OPMonitorLevel.NORMAL, "workplace_category_page_request_success");

    /* renamed from: w */
    public static final OPMonitorCode f69252w = new C27707e(10210, OPMonitorLevel.ERROR, "workplace_category_page_request_error");

    /* renamed from: x */
    public static final OPMonitorCode f69253x = new C27707e(10211, OPMonitorLevel.NORMAL, "workplace_add_common_app_request_success");

    /* renamed from: y */
    public static final OPMonitorCode f69254y = new C27707e(10212, OPMonitorLevel.ERROR, "workplace_add_common_app_request_error");

    /* renamed from: z */
    public static final OPMonitorCode f69255z = new C27707e(10213, OPMonitorLevel.NORMAL, "workplace_remove_common_app_request_success");

    /* renamed from: com.ss.android.appcenter.business.monitor.a.b$a */
    public static class C27703a extends OPMonitorCode {
        public C27703a(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.app_center.commonapp", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.ss.android.appcenter.business.monitor.a.b$b */
    public static class C27704b extends OPMonitorCode {
        public C27704b(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.app_center", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.ss.android.appcenter.business.monitor.a.b$c */
    public static class C27705c extends OPMonitorCode {
        public C27705c(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.app_center.moment", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.ss.android.appcenter.business.monitor.a.b$d */
    public static class C27706d extends OPMonitorCode {
        public C27706d(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.app_center.workplace", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.ss.android.appcenter.business.monitor.a.b$e */
    public static class C27707e extends OPMonitorCode {
        public C27707e(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.app_center.event", i, oPMonitorLevel, str);
        }
    }
}
