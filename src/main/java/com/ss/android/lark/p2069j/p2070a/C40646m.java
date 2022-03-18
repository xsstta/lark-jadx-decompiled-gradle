package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.m */
public class C40646m extends OPMonitorCode {

    /* renamed from: a */
    public static final C40646m f103106a = new C40646m(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "econetwork_request_will_start");

    /* renamed from: b */
    public static final C40646m f103107b = new C40646m(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "econetwork_request_start");

    /* renamed from: c */
    public static final C40646m f103108c = new C40646m(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "econetwork_request_end");

    /* renamed from: d */
    public static final C40646m f103109d = new C40646m(10003, OPMonitorLevel.NORMAL, "econetwork_request_will_response");

    /* renamed from: e */
    public static final C40646m f103110e = new C40646m(10004, OPMonitorLevel.ERROR, "econetwork_create_client_error");

    /* renamed from: f */
    public static final C40646m f103111f = new C40646m(10005, OPMonitorLevel.ERROR, "econetwork_create_request_config_error");

    /* renamed from: g */
    public static final C40646m f103112g = new C40646m(10006, OPMonitorLevel.NORMAL, "network_quality_type_change");

    public C40646m(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.network", i, oPMonitorLevel, str);
    }

    public C40646m(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
