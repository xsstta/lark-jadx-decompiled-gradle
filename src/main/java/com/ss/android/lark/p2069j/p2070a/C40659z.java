package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.z */
public class C40659z extends OPMonitorCode {

    /* renamed from: a */
    public static final C40659z f103251a = new C40659z(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "upgrade_session_check");

    /* renamed from: b */
    public static final C40659z f103252b = new C40659z(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "upgrade_session_request_start");

    /* renamed from: c */
    public static final C40659z f103253c = new C40659z(10003, OPMonitorLevel.NORMAL, "upgrade_session_end_succ");

    /* renamed from: d */
    public static final C40659z f103254d = new C40659z(10004, OPMonitorLevel.ERROR, "upgrade_session_end_fail");

    public C40659z(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.passport.monitor.unspecified", i, oPMonitorLevel, str);
    }

    public C40659z(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
