package com.tt.remotedebug.p3438b;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.tt.remotedebug.b.b */
public class C67965b extends C67964a {

    /* renamed from: a */
    public static final C67965b f171226a = new C67965b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "realmachine_socket_init");

    /* renamed from: b */
    public static final C67965b f171227b = new C67965b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "realmachine_socket_open");

    /* renamed from: c */
    public static final C67965b f171228c = new C67965b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "realmachine_socket_failed");

    /* renamed from: d */
    public static final C67965b f171229d = new C67965b(10003, OPMonitorLevel.NORMAL, "realmachine_socket_disconnected");

    /* renamed from: e */
    public static final C67965b f171230e = new C67965b(10004, OPMonitorLevel.NORMAL, "realmachine_client_finish_debug");

    /* renamed from: f */
    public static final C67965b f171231f = new C67965b(10005, OPMonitorLevel.NORMAL, "realmachine_init_worker");

    public C67965b(int i, OPMonitorLevel oPMonitorLevel, String str) {
        super("client.open_platform.opdev.realmachine_debug", i, oPMonitorLevel, str);
    }
}
