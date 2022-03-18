package com.bytedance.ee.webapp.p720a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.bytedance.ee.webapp.a.c */
public class C13756c {

    /* renamed from: a */
    public static final OPMonitorCode f35959a = new OPMonitorCode("client.open_platform.web.launch", HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "load_error");

    /* renamed from: b */
    public static final OPMonitorCode f35960b = new OPMonitorCode("client.open_platform.web.launch", UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "load_ssl_error");

    /* renamed from: c */
    public static final OPMonitorCode f35961c = new OPMonitorCode("client.open_platform.web.launch", UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "load_success");

    /* renamed from: d */
    public static final OPMonitorCode f35962d = new OPMonitorCode("client.open_platform.web.runtime", HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "webview_crash");

    /* renamed from: e */
    public static final OPMonitorCode f35963e = new OPMonitorCode("client.open_platform.web.runtime", UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "render_error");

    /* renamed from: f */
    public static final OPMonitorCode f35964f = new OPMonitorCode("client.open_platform.web.runtime", UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "share_error");

    /* renamed from: g */
    public static final OPMonitorCode f35965g = new OPMonitorCode("client.open_platform.web.runtime", 10007, OPMonitorLevel.NORMAL, "api_check_permission_success");

    /* renamed from: h */
    public static final OPMonitorCode f35966h = new OPMonitorCode("client.open_platform.web.runtime", 10008, OPMonitorLevel.NORMAL, "api_check_permission_error");

    /* renamed from: i */
    public static final OPMonitorCode f35967i = new OPMonitorCode("client.open_platform.web.runtime", 10011, OPMonitorLevel.NORMAL, "add_menu_success");

    /* renamed from: j */
    public static final OPMonitorCode f35968j = new OPMonitorCode("client.open_platform.web.runtime", 10012, OPMonitorLevel.ERROR, "add_menu_failed");

    /* renamed from: k */
    public static final OPMonitorCode f35969k = new OPMonitorCode("client.open_platform.web.runtime", 10013, OPMonitorLevel.NORMAL, "remove_menu_success");

    /* renamed from: l */
    public static final OPMonitorCode f35970l = new OPMonitorCode("client.open_platform.web.runtime", 10014, OPMonitorLevel.ERROR, "remove_menu_failed");

    /* renamed from: m */
    public static final OPMonitorCode f35971m = new OPMonitorCode("client.open_platform.web.runtime", 10015, OPMonitorLevel.NORMAL, "search_menu_success");

    /* renamed from: n */
    public static final OPMonitorCode f35972n = new OPMonitorCode("client.open_platform.web.runtime", 10016, OPMonitorLevel.ERROR, "search_menu_failed");

    /* renamed from: o */
    public static final OPMonitorCode f35973o = new OPMonitorCode("client.open_platform.web.runtime", 10017, OPMonitorLevel.ERROR, "menu_other_error");

    /* renamed from: p */
    public static final OPMonitorCode f35974p = new OPMonitorCode("client.open_platform.web.api", UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "fail");

    /* renamed from: q */
    public static final OPMonitorCode f35975q = new OPMonitorCode("client.open_platform.web.api", 10004, OPMonitorLevel.NORMAL, "no_api");

    /* renamed from: r */
    public static final OPMonitorCode f35976r = new OPMonitorCode("client.open_platform.web.api_auth", HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "request_success");

    /* renamed from: s */
    public static final OPMonitorCode f35977s = new OPMonitorCode("client.open_platform.web.api_auth", UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "request_network_error");

    /* renamed from: t */
    public static final OPMonitorCode f35978t = new OPMonitorCode("client.open_platform.web.api_auth", UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "request_result_biz_fail");

    /* renamed from: u */
    public static final OPMonitorCode f35979u = new OPMonitorCode("client.open_platform.web.api_auth", 10003, OPMonitorLevel.ERROR, "request_result_data_invalid");

    /* renamed from: v */
    public static final OPMonitorCode f35980v = new OPMonitorCode("client.open_platform.web.api_auth", 10004, OPMonitorLevel.ERROR, "request_result_decrypt_error");

    /* renamed from: w */
    public static final OPMonitorCode f35981w = new OPMonitorCode("client.open_platform.web.api_auth", 10005, OPMonitorLevel.ERROR, "internal_error");

    /* renamed from: x */
    public static final OPMonitorCode f35982x = new OPMonitorCode("client.open_platform.web.api_auth", 10006, OPMonitorLevel.NORMAL, "auth_has_no_session");
}
