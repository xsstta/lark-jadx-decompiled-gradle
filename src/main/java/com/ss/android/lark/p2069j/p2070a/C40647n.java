package com.ss.android.lark.p2069j.p2070a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.n */
public class C40647n extends OPMonitorCode {

    /* renamed from: a */
    public static final C40647n f103113a = new C40647n(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "share_entry_start");

    /* renamed from: b */
    public static final C40647n f103114b = new C40647n(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "share_api_verify_failed");

    /* renamed from: c */
    public static final C40647n f103115c = new C40647n(10003, OPMonitorLevel.NORMAL, "share_upload_image_success");

    /* renamed from: d */
    public static final C40647n f103116d = new C40647n(10004, OPMonitorLevel.ERROR, "share_upload_image_failed");

    /* renamed from: e */
    public static final C40647n f103117e = new C40647n(10005, OPMonitorLevel.NORMAL, "share_container_start");

    /* renamed from: f */
    public static final C40647n f103118f = new C40647n(10006, OPMonitorLevel.NORMAL, "share_container_close");

    /* renamed from: g */
    public static final C40647n f103119g = new C40647n(10007, OPMonitorLevel.NORMAL, "share_card_success");

    /* renamed from: h */
    public static final C40647n f103120h = new C40647n(10008, OPMonitorLevel.ERROR, "share_card_failed");

    /* renamed from: i */
    public static final C40647n f103121i = new C40647n(10009, OPMonitorLevel.NORMAL, "share_convert_short_link_success");

    /* renamed from: j */
    public static final C40647n f103122j = new C40647n(10010, OPMonitorLevel.NORMAL, "share_convert_short_link_failed");

    /* renamed from: k */
    public static final C40647n f103123k = new C40647n(10011, OPMonitorLevel.NORMAL, "share_link_copy");

    /* renamed from: l */
    public static final C40647n f103124l = new C40647n(10012, OPMonitorLevel.NORMAL, "share_qrcode_save_success");

    /* renamed from: m */
    public static final C40647n f103125m = new C40647n(10013, OPMonitorLevel.ERROR, "share_qrcode_save_failed");

    /* renamed from: n */
    public static final C40647n f103126n = new C40647n(10014, OPMonitorLevel.NORMAL, "share_get_app_info_success");

    /* renamed from: o */
    public static final C40647n f103127o = new C40647n(10015, OPMonitorLevel.ERROR, "share_get_app_info_failed");

    /* renamed from: p */
    public static final C40647n f103128p = new C40647n(10016, OPMonitorLevel.NORMAL, "share_applink_start");

    /* renamed from: q */
    public static final C40647n f103129q = new C40647n(10017, OPMonitorLevel.ERROR, "share_applink_verify_failed");

    /* renamed from: r */
    public static final C40647n f103130r = new C40647n(10018, OPMonitorLevel.NORMAL, "share_applink_open_ability");

    public C40647n(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.share", i, oPMonitorLevel, str);
    }

    public C40647n(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
