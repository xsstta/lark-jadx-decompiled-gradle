package com.bytedance.ee.lark.infra.cookie.p619d;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.bytedance.ee.lark.infra.cookie.d.a */
public class C12761a {

    /* renamed from: a */
    public static final C12762a f34143a = new C12762a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "read_app_cookie");

    /* renamed from: b */
    public static final C12762a f34144b = new C12762a(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "write_app_cookie");

    /* renamed from: c */
    public static final C12762a f34145c = new C12762a(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "read_all_cookie_miss");

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.lark.infra.cookie.d.a$a */
    public static class C12762a extends OPMonitorCode {
        C12762a(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.common.cookie", i, oPMonitorLevel, str);
        }
    }
}
