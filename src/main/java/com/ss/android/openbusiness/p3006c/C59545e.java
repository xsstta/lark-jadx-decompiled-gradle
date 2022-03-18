package com.ss.android.openbusiness.p3006c;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.openbusiness.c.e */
public class C59545e {

    /* renamed from: a */
    public static final OPMonitorCode f147814a = new C59547b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "more_apps_request_data_success");

    /* renamed from: b */
    public static final OPMonitorCode f147815b = new C59547b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "more_apps_request_data_fail");

    /* renamed from: c */
    public static final OPMonitorCode f147816c = new C59547b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "external_apps_request_data_success");

    /* renamed from: d */
    public static final OPMonitorCode f147817d = new C59547b(10003, OPMonitorLevel.ERROR, "external_apps_request_data_fail");

    /* renamed from: e */
    public static final OPMonitorCode f147818e = new C59547b(10004, OPMonitorLevel.NORMAL, "cache_exist_in_chat");

    /* renamed from: f */
    public static final OPMonitorCode f147819f = new C59547b(10005, OPMonitorLevel.NORMAL, "cache_expire_in_chat");

    /* renamed from: g */
    public static final OPMonitorCode f147820g = new C59547b(10008, OPMonitorLevel.NORMAL, "update_config_success");

    /* renamed from: h */
    public static final OPMonitorCode f147821h = new C59547b(10009, OPMonitorLevel.ERROR, "update_config_fail");

    /* renamed from: i */
    public static final OPMonitorCode f147822i = new C59547b(10010, OPMonitorLevel.ERROR, "receive_push");

    /* renamed from: j */
    public static final OPMonitorCode f147823j = new C59548c(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "more_apps_request_data_success");

    /* renamed from: k */
    public static final OPMonitorCode f147824k = new C59548c(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.ERROR, "more_apps_request_data_fail");

    /* renamed from: l */
    public static final OPMonitorCode f147825l = new C59548c(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "external_apps_request_data_success");

    /* renamed from: m */
    public static final OPMonitorCode f147826m = new C59548c(10003, OPMonitorLevel.ERROR, "external_apps_request_data_fail");

    /* renamed from: n */
    public static final OPMonitorCode f147827n = new C59548c(10004, OPMonitorLevel.NORMAL, "cache_exist_in_chat");

    /* renamed from: o */
    public static final OPMonitorCode f147828o = new C59548c(10005, OPMonitorLevel.NORMAL, "cache_expire_in_chat");

    /* renamed from: p */
    public static final OPMonitorCode f147829p = new C59548c(10008, OPMonitorLevel.ERROR, "update_config_success");

    /* renamed from: q */
    public static final OPMonitorCode f147830q = new C59548c(10009, OPMonitorLevel.ERROR, "update_config_fail");

    /* renamed from: r */
    public static final OPMonitorCode f147831r = new C59548c(10010, OPMonitorLevel.ERROR, "receive_push");

    /* renamed from: s */
    public static final OPMonitorCode f147832s = new C59548c(99999, OPMonitorLevel.ERROR, "dependency_null");

    /* renamed from: com.ss.android.openbusiness.c.e$a */
    static class C59546a {

        /* renamed from: a */
        static String f147833a = "client.open_platform.messageaction_plusmenu.app_msg_action";

        /* renamed from: b */
        static String f147834b = "client.open_platform.messageaction_plusmenu.app_plus_menu";
    }

    /* renamed from: com.ss.android.openbusiness.c.e$b */
    private static class C59547b extends OPMonitorCode {
        public C59547b(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super(C59546a.f147833a, i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.ss.android.openbusiness.c.e$c */
    private static class C59548c extends OPMonitorCode {
        public C59548c(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super(C59546a.f147834b, i, oPMonitorLevel, str);
        }
    }
}
