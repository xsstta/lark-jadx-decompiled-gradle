package com.ss.android.lark.applink.p1366a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.applink.a.b */
public class C29185b extends OPMonitorCode {

    /* renamed from: a */
    public static final OPMonitorCode f73036a = new C29185b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "uri_is Null");

    /* renamed from: b */
    public static final OPMonitorCode f73037b = new C29185b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "short_link_request_timeout");

    /* renamed from: c */
    public static final OPMonitorCode f73038c = new C29185b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "short_link_request_fail");

    /* renamed from: d */
    public static final OPMonitorCode f73039d = new C29185b(10003, OPMonitorLevel.ERROR, "version_not_support");

    /* renamed from: e */
    public static final OPMonitorCode f73040e = new C29185b(10004, OPMonitorLevel.ERROR, "path_not_support");

    /* renamed from: f */
    public static final OPMonitorCode f73041f = new C29185b(10005, OPMonitorLevel.ERROR, "handler_can_not_open");

    /* renamed from: g */
    public static final OPMonitorCode f73042g = new C29185b(10006, OPMonitorLevel.ERROR, "no_handler");

    /* renamed from: h */
    public static final OPMonitorCode f73043h = new C29185b(10010, OPMonitorLevel.WARN, "check_with_config_return_false");

    public C29185b(int i, OPMonitorLevel oPMonitorLevel, String str) {
        super("client.open_platform.applink", i, oPMonitorLevel, str);
    }
}
