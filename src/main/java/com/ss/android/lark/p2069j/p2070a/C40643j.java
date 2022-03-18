package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.j */
public class C40643j extends OPMonitorCode {

    /* renamed from: a */
    public static final C40643j f103101a = new C40643j(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "intercept_unsafe_url");

    public C40643j(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.gadget.webview.component", i, oPMonitorLevel, str);
    }

    public C40643j(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
