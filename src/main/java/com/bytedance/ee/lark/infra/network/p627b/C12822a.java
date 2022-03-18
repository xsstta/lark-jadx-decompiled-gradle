package com.bytedance.ee.lark.infra.network.p627b;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.bytedance.ee.lark.infra.network.b.a */
public class C12822a extends OPMonitorCode {

    /* renamed from: a */
    public static final C12822a f34245a = new C12822a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "econetwork_request_will_start");

    /* renamed from: b */
    public static final C12822a f34246b = new C12822a(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "econetwork_request_start");

    /* renamed from: c */
    public static final C12822a f34247c = new C12822a(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "econetwork_request_end");

    /* renamed from: d */
    public static final C12822a f34248d = new C12822a(10003, OPMonitorLevel.NORMAL, "econetwork_request_will_response");

    /* renamed from: e */
    public static final C12822a f34249e = new C12822a(10004, OPMonitorLevel.ERROR, "econetwork_create_client_error");

    /* renamed from: f */
    public static final C12822a f34250f = new C12822a(10005, OPMonitorLevel.ERROR, "econetwork_create_request_config_error");

    public C12822a(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.network", i, oPMonitorLevel, str);
    }

    public C12822a(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
