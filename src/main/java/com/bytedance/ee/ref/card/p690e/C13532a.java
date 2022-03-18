package com.bytedance.ee.ref.card.p690e;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.bytedance.ee.ref.card.e.a */
public class C13532a {

    /* renamed from: a */
    public static final C13535c f35621a = new C13535c(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "meta_fetch_failed");

    /* renamed from: b */
    public static final C13535c f35622b = new C13535c(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "meta_fetch_success");

    /* renamed from: c */
    public static final C13535c f35623c = new C13535c(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "meta_fetch_result_invalid");

    /* renamed from: d */
    public static final C13535c f35624d = new C13535c(10003, OPMonitorLevel.ERROR, "batch_meta_fetch_failed");

    /* renamed from: e */
    public static final C13535c f35625e = new C13535c(10004, OPMonitorLevel.NORMAL, "batch_meta_fetch_success");

    /* renamed from: f */
    public static final C13533a f35626f = new C13533a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "download_failed");

    /* renamed from: g */
    public static final C13533a f35627g = new C13533a(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "download_success");

    /* renamed from: h */
    public static final C13534b f35628h = new C13534b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "install_failed");

    /* renamed from: i */
    public static final C13534b f35629i = new C13534b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "install_success");

    /* renamed from: j */
    public static final C13536d f35630j = new C13536d(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "render_failed");

    /* renamed from: k */
    public static final C13536d f35631k = new C13536d(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "render_success");

    /* renamed from: l */
    public static final C13536d f35632l = new C13536d(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "render_update_success");

    /* renamed from: m */
    public static final C13536d f35633m = new C13536d(10003, OPMonitorLevel.ERROR, "render_receive_error");

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.ref.card.e.a$a */
    public static class C13533a extends OPMonitorCode {
        public C13533a(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.app_card.download", i, oPMonitorLevel, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.ref.card.e.a$b */
    public static class C13534b extends OPMonitorCode {
        public C13534b(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.app_card.install", i, oPMonitorLevel, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.ref.card.e.a$c */
    public static class C13535c extends OPMonitorCode {
        public C13535c(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.app_card.meta", i, oPMonitorLevel, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.ref.card.e.a$d */
    public static class C13536d extends OPMonitorCode {
        public C13536d(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.app_card.render", i, oPMonitorLevel, str);
        }
    }
}
