package com.bytedance.ee.webapp.p720a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.bytedance.ee.webapp.a.a */
public class C13754a extends OPMonitorCode {

    /* renamed from: a */
    public static final C13754a f35953a = new C13754a(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "share_entry_start");

    /* renamed from: b */
    public static final C13754a f35954b = new C13754a(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "share_api_verify_failed");

    /* renamed from: c */
    public static final C13754a f35955c = new C13754a(10003, OPMonitorLevel.NORMAL, "share_upload_image_success");

    /* renamed from: d */
    public static final C13754a f35956d = new C13754a(10004, OPMonitorLevel.ERROR, "share_upload_image_failed");

    /* renamed from: e */
    public static final C13754a f35957e = new C13754a(10005, OPMonitorLevel.NORMAL, "share_container_start");

    public C13754a(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.share", i, oPMonitorLevel, str);
    }

    public C13754a(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
