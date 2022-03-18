package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.q */
public class C40650q extends OPMonitorCode {

    /* renamed from: a */
    public static final C40650q f103138a = new C40650q(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "worker_load_result");

    public C40650q(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.worker.load", i, oPMonitorLevel, str);
    }

    public C40650q(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
