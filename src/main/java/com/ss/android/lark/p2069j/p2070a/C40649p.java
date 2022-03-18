package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.p */
public class C40649p extends OPMonitorCode {

    /* renamed from: a */
    public static final C40649p f103132a = new C40649p(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "op_webapp_auth_strategy_init");

    /* renamed from: b */
    public static final C40649p f103133b = new C40649p(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "op_webapp_auth_strategy_config");

    /* renamed from: c */
    public static final C40649p f103134c = new C40649p(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "op_webapp_auth_strategy_status_after_config");

    /* renamed from: d */
    public static final C40649p f103135d = new C40649p(10003, OPMonitorLevel.NORMAL, "op_webapp_auth_strategy_status_after_url_change");

    /* renamed from: e */
    public static final C40649p f103136e = new C40649p(10004, OPMonitorLevel.NORMAL, "op_webapp_auth_strategy_status_before_use_jsapi");

    /* renamed from: f */
    public static final C40649p f103137f = new C40649p(10005, OPMonitorLevel.NORMAL, "op_webapp_auth_strategy_destroy");

    public C40649p(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.web.webapp_auth", i, oPMonitorLevel, str);
    }

    public C40649p(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
