package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.h */
public class C40641h extends OPMonitorCode {

    /* renamed from: a */
    public static final C40641h f103079a = new C40641h(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "invalid_params");

    /* renamed from: b */
    public static final C40641h f103080b = new C40641h(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "init_error");

    /* renamed from: c */
    public static final C40641h f103081c = new C40641h(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "load_page_frame_html_error");

    /* renamed from: d */
    public static final C40641h f103082d = new C40641h(10005, OPMonitorLevel.ERROR, "webview_load_exception");

    /* renamed from: e */
    public static final C40641h f103083e = new C40641h(10006, OPMonitorLevel.ERROR, "read_script_content_from_file_error");

    /* renamed from: f */
    public static final C40641h f103084f = new C40641h(10008, OPMonitorLevel.ERROR, "load_script_from_url_error");

    /* renamed from: g */
    public static final C40641h f103085g = new C40641h(10009, OPMonitorLevel.ERROR, "webview_crash");

    /* renamed from: h */
    public static final C40641h f103086h = new C40641h(10010, OPMonitorLevel.WARN, "evaluate_javascript_error");

    /* renamed from: i */
    public static final C40641h f103087i = new C40641h(10011, OPMonitorLevel.ERROR, "schema_check_error");

    /* renamed from: j */
    public static final C40641h f103088j = new C40641h(10012, OPMonitorLevel.ERROR, "js_runtime_error");

    /* renamed from: k */
    public static final C40641h f103089k = new C40641h(10013, OPMonitorLevel.ERROR, "jssdk_download_failed");

    /* renamed from: l */
    public static final C40641h f103090l = new C40641h(10022, OPMonitorLevel.ERROR, "gl_oom_error");

    /* renamed from: m */
    public static final C40641h f103091m = new C40641h(10050, OPMonitorLevel.ERROR, "strategy_run_command_fail");

    /* renamed from: n */
    public static final C40641h f103092n = new C40641h(10056, OPMonitorLevel.ERROR, "read_old_platform_session");

    /* renamed from: o */
    public static final C40641h f103093o = new C40641h(10070, OPMonitorLevel.NORMAL, "apply_update_success");

    public C40641h(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.gadget", i, oPMonitorLevel, str);
    }

    public C40641h(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
