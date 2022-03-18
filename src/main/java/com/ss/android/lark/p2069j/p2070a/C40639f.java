package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.f */
public class C40639f extends OPMonitorCode {

    /* renamed from: a */
    public static final C40639f f103071a = new C40639f(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "config_value_empty");

    /* renamed from: b */
    public static final C40639f f103072b = new C40639f(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "fetch_mina_config_result");

    /* renamed from: c */
    public static final C40639f f103073c = new C40639f(10003, OPMonitorLevel.NORMAL, "fetch_settings_config_result");

    /* renamed from: d */
    public static final C40639f f103074d = new C40639f(10004, OPMonitorLevel.NORMAL, "fetch_config_result");

    public C40639f(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.common.config", i, oPMonitorLevel, str);
    }

    public C40639f(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
