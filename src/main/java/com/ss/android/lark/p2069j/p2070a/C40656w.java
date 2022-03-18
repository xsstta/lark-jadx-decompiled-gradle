package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.w */
public class C40656w extends OPMonitorCode {

    /* renamed from: a */
    public static final C40656w f103219a = new C40656w(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "account_migrate_start");

    /* renamed from: b */
    public static final C40656w f103220b = new C40656w(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "account_migrate_fail");

    /* renamed from: c */
    public static final C40656w f103221c = new C40656w(10003, OPMonitorLevel.ERROR, "passport_config_from_asset_fail");

    public C40656w(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.monitor.origin_task", i, oPMonitorLevel, str);
    }

    public C40656w(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
