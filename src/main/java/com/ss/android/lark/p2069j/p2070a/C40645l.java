package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.l */
public class C40645l extends OPMonitorCode {

    /* renamed from: a */
    public static final C40645l f103103a = new C40645l(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "open_app_sandbox_info");

    /* renamed from: b */
    public static final C40645l f103104b = new C40645l(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "open_app_filesystem_primitive_api");

    /* renamed from: c */
    public static final C40645l f103105c = new C40645l(10004, OPMonitorLevel.NORMAL, "root_dir_create_result");

    public C40645l(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.infra.file_system", i, oPMonitorLevel, str);
    }

    public C40645l(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
