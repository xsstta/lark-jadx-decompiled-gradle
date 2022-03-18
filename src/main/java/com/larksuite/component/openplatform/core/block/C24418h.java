package com.larksuite.component.openplatform.core.block;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.larksuite.component.openplatform.core.block.h */
public class C24418h {

    /* renamed from: A */
    public static final OPMonitorCode f60250A = new C24419a(10012, OPMonitorLevel.NORMAL, "first_content_render_finish");

    /* renamed from: a */
    public static final OPMonitorCode f60251a = new C24420b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "unknown_error");

    /* renamed from: b */
    public static final OPMonitorCode f60252b = new C24420b(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "success");

    /* renamed from: c */
    public static final OPMonitorCode f60253c = new C24420b(UpdateDialogStatusCode.SHOW, OPMonitorLevel.ERROR, "cancel");

    /* renamed from: d */
    public static final OPMonitorCode f60254d = new C24420b(10003, OPMonitorLevel.ERROR, "device_unavailable");

    /* renamed from: e */
    public static final OPMonitorCode f60255e = new C24420b(10004, OPMonitorLevel.ERROR, "environment_invalid");

    /* renamed from: f */
    public static final OPMonitorCode f60256f = new C24420b(10005, OPMonitorLevel.ERROR, "invalid_appid");

    /* renamed from: g */
    public static final OPMonitorCode f60257g = new C24420b(10006, OPMonitorLevel.ERROR, "invalid_host");

    /* renamed from: h */
    public static final OPMonitorCode f60258h = new C24420b(10009, OPMonitorLevel.ERROR, "meta_info_fail");

    /* renamed from: i */
    public static final OPMonitorCode f60259i = new C24420b(10010, OPMonitorLevel.ERROR, "download_fail");

    /* renamed from: j */
    public static final OPMonitorCode f60260j = new C24420b(10011, OPMonitorLevel.ERROR, "offline");

    /* renamed from: k */
    public static final OPMonitorCode f60261k = new C24420b(10014, OPMonitorLevel.ERROR, "no_permission");

    /* renamed from: l */
    public static final OPMonitorCode f60262l = new C24420b(10015, OPMonitorLevel.ERROR, "incompatible");

    /* renamed from: m */
    public static final OPMonitorCode f60263m = new C24420b(10020, OPMonitorLevel.ERROR, "timeout");

    /* renamed from: n */
    public static final OPMonitorCode f60264n = new C24420b(10025, OPMonitorLevel.ERROR, "parse_block_config_failed");

    /* renamed from: o */
    public static final OPMonitorCode f60265o = new C24420b(10036, OPMonitorLevel.ERROR, "on_document_ready_error");

    /* renamed from: p */
    public static final OPMonitorCode f60266p = new C24420b(10039, OPMonitorLevel.ERROR, "invalid_init_params");

    /* renamed from: q */
    public static final OPMonitorCode f60267q = new C24420b(10039, OPMonitorLevel.ERROR, "invalid_block_type_id");

    /* renamed from: r */
    public static final OPMonitorCode f60268r = new C24420b(10040, OPMonitorLevel.NORMAL, "package_force_update");

    /* renamed from: s */
    public static final OPMonitorCode f60269s = new C24419a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "app_container_create");

    /* renamed from: t */
    public static final OPMonitorCode f60270t = new C24419a(UpdateDialogStatusCode.DISMISS, OPMonitorLevel.NORMAL, "app_container_loaded");

    /* renamed from: u */
    public static final OPMonitorCode f60271u = new C24419a(UpdateDialogStatusCode.SHOW, OPMonitorLevel.NORMAL, "app_launch_start");

    /* renamed from: v */
    public static final OPMonitorCode f60272v = new C24419a(10007, OPMonitorLevel.NORMAL, "component_load_start");

    /* renamed from: w */
    public static final OPMonitorCode f60273w = new C24419a(10008, OPMonitorLevel.NORMAL, "component_load_end");

    /* renamed from: x */
    public static final OPMonitorCode f60274x = new C24419a(10009, OPMonitorLevel.NORMAL, "render_load_start");

    /* renamed from: y */
    public static final OPMonitorCode f60275y = new C24419a(10010, OPMonitorLevel.NORMAL, "render_load_end");

    /* renamed from: z */
    public static final OPMonitorCode f60276z = new C24419a(10011, OPMonitorLevel.NORMAL, "runtime_load_end");

    /* renamed from: com.larksuite.component.openplatform.core.block.h$a */
    static class C24419a extends OPMonitorCode {
        public C24419a(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.blockit.app_load", i, oPMonitorLevel, str);
        }
    }

    /* renamed from: com.larksuite.component.openplatform.core.block.h$b */
    static class C24420b extends OPMonitorCode {
        public C24420b(int i, OPMonitorLevel oPMonitorLevel, String str) {
            super("client.open_platform.blockit.launch", i, oPMonitorLevel, str);
        }
    }
}
