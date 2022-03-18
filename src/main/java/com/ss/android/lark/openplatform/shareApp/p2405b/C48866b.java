package com.ss.android.lark.openplatform.shareApp.p2405b;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.openplatform.shareApp.b.b */
public class C48866b extends OPMonitorCode {

    /* renamed from: a */
    public static final C48866b f122752a = new C48866b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "share_entry_start");

    /* renamed from: b */
    public static final C48866b f122753b = new C48866b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "share_api_verify_failed");

    /* renamed from: c */
    public static final C48866b f122754c = new C48866b(10003, OPMonitorLevel.NORMAL, "share_upload_image_success");

    /* renamed from: d */
    public static final C48866b f122755d = new C48866b(10004, OPMonitorLevel.ERROR, "share_upload_image_failed");

    /* renamed from: e */
    public static final C48866b f122756e = new C48866b(10005, OPMonitorLevel.NORMAL, "share_container_start");

    /* renamed from: f */
    public static final C48866b f122757f = new C48866b(10006, OPMonitorLevel.NORMAL, "share_container_close");

    /* renamed from: g */
    public static final C48866b f122758g = new C48866b(10007, OPMonitorLevel.NORMAL, "share_card_success");

    /* renamed from: h */
    public static final C48866b f122759h = new C48866b(10008, OPMonitorLevel.ERROR, "share_card_failed");

    /* renamed from: i */
    public static final C48866b f122760i = new C48866b(10009, OPMonitorLevel.NORMAL, "share_convert_short_link_success");

    /* renamed from: j */
    public static final C48866b f122761j = new C48866b(10010, OPMonitorLevel.NORMAL, "share_convert_short_link_failed");

    /* renamed from: k */
    public static final C48866b f122762k = new C48866b(10011, OPMonitorLevel.NORMAL, "share_link_copy");

    /* renamed from: l */
    public static final C48866b f122763l = new C48866b(10012, OPMonitorLevel.NORMAL, "share_qrcode_save_success");

    /* renamed from: m */
    public static final C48866b f122764m = new C48866b(10013, OPMonitorLevel.ERROR, "share_qrcode_save_failed");

    /* renamed from: n */
    public static final C48866b f122765n = new C48866b(10014, OPMonitorLevel.NORMAL, "share_get_app_info_success");

    /* renamed from: o */
    public static final C48866b f122766o = new C48866b(10015, OPMonitorLevel.ERROR, "share_get_app_info_failed");

    /* renamed from: p */
    public static final C48866b f122767p = new C48866b(10016, OPMonitorLevel.NORMAL, "share_applink_start");

    /* renamed from: q */
    public static final C48866b f122768q = new C48866b(10017, OPMonitorLevel.ERROR, "share_applink_verify_failed");

    /* renamed from: r */
    public static final C48866b f122769r = new C48866b(10018, OPMonitorLevel.NORMAL, "share_applink_open_ability");

    public C48866b(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.share", i, oPMonitorLevel, str);
    }

    public C48866b(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
