package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.i */
public class C40642i extends OPMonitorCode {

    /* renamed from: a */
    public static final C40642i f103094a = new C40642i(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "page_appear");

    /* renamed from: b */
    public static final C40642i f103095b = new C40642i(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "page_onready");

    /* renamed from: c */
    public static final C40642i f103096c = new C40642i(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "page_disappear");

    /* renamed from: d */
    public static final C40642i f103097d = new C40642i(10003, OPMonitorLevel.NORMAL, "gadget_foreground");

    /* renamed from: e */
    public static final C40642i f103098e = new C40642i(10004, OPMonitorLevel.NORMAL, "gadget_background");

    /* renamed from: f */
    public static final C40642i f103099f = new C40642i(10007, OPMonitorLevel.NORMAL, "gadget_close");

    /* renamed from: g */
    public static final C40642i f103100g = new C40642i(10008, OPMonitorLevel.NORMAL, "gadget_heartbeat");

    public C40642i(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.gadget.lifecycle", i, oPMonitorLevel, str);
    }

    public C40642i(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
