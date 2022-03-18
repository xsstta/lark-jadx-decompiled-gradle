package com.ss.android.lark.message.card.p2264d;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.message.card.d.b */
public class C45304b extends OPMonitorCode {

    /* renamed from: a */
    public static final OPMonitorCode f114695a = new C45304b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "root_view_null");

    /* renamed from: b */
    public static final OPMonitorCode f114696b = new C45304b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "child_params_list_empty");

    /* renamed from: c */
    public static final OPMonitorCode f114697c = new C45304b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.WARN, "child_params_null");

    /* renamed from: d */
    public static final OPMonitorCode f114698d = new C45304b(10003, OPMonitorLevel.TRACE, "img_key_empty");

    /* renamed from: e */
    public static final OPMonitorCode f114699e = new C45304b(10004, OPMonitorLevel.ERROR, "select_person_error");

    /* renamed from: f */
    public static final OPMonitorCode f114700f = new C45304b(10005, OPMonitorLevel.ERROR, "bind_data_error");

    /* renamed from: g */
    public static final OPMonitorCode f114701g = new C45304b(10009, OPMonitorLevel.ERROR, "messagecard_trigger_code_fail");

    /* renamed from: h */
    public static final OPMonitorCode f114702h = new C45304b(10013, OPMonitorLevel.ERROR, "messagecard_image_load_origin_error");

    /* renamed from: i */
    public static final OPMonitorCode f114703i = new C45304b(10014, OPMonitorLevel.ERROR, "messagecard_url_open_unsupport");

    /* renamed from: j */
    public static final OPMonitorCode f114704j = new C45304b(10015, OPMonitorLevel.ERROR, "messagecard_url_open_without_triggercode_func");

    /* renamed from: k */
    public static final OPMonitorCode f114705k = new C45304b(10016, OPMonitorLevel.ERROR, "messagecard_url_open_without_triggercode");

    /* renamed from: l */
    public static final OPMonitorCode f114706l = new C45304b(10017, OPMonitorLevel.ERROR, "messagecard_url_open_url_invalid");

    /* renamed from: m */
    public static final OPMonitorCode f114707m = new C45304b(10018, OPMonitorLevel.ERROR, "messagecard_url_open_url_limt_interval");

    /* renamed from: n */
    public static final OPMonitorCode f114708n = new C45304b(10019, OPMonitorLevel.ERROR, "messagecard_request_not_allow");

    /* renamed from: o */
    public static final OPMonitorCode f114709o = new C45304b(10020, OPMonitorLevel.ERROR, "messagecard_request_in_last_process");

    /* renamed from: p */
    public static final OPMonitorCode f114710p = new C45304b(10021, OPMonitorLevel.ERROR, "messagecard_request_response_fail");

    /* renamed from: q */
    public static final OPMonitorCode f114711q = new C45304b(10022, OPMonitorLevel.NORMAL, "messagecard_request_response_success");

    public C45304b(int i, OPMonitorLevel oPMonitorLevel, String str) {
        super("client.open_platform.card", i, oPMonitorLevel, str);
    }
}
