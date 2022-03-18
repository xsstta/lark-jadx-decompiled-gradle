package com.tt.miniapp.event;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.actions.SearchIntents;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.MicroSchemaEntity;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.pkg.IStreamLoader;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.d */
public class C66036d extends C67475d {
    /* renamed from: a */
    public static void m258589a(String str, String str2, long j, String str3, boolean z, IAppContext iAppContext) {
        C66020b.C66021a a = C66020b.m258530a("mp_stay_page", iAppContext).mo231090a("page_path", str);
        if (str2 == null) {
            str2 = "";
        }
        a.mo231090a(SearchIntents.EXTRA_QUERY, str2).mo231090a("duration", Long.valueOf(j)).mo231090a("exit_type", str3).mo231090a("has_webview", Integer.valueOf(z ? 1 : 0)).mo231092a();
    }

    /* renamed from: a */
    public static void m258593a(String str, boolean z, IAppContext iAppContext) {
        C66020b.m258530a("mp_share_click", iAppContext).mo231090a("page_path", AppConfig.m257573a(C67432a.m262319a(iAppContext).getCurrentPagePath())).mo231090a("position", str).mo231090a("share_type", z ? "token" : "link").mo231092a();
    }

    /* renamed from: a */
    public static void m258592a(String str, String str2, boolean z, IAppContext iAppContext) {
        C66020b.m258530a("mp_share_to_platform", iAppContext).mo231090a("page_path", AppConfig.m257573a(C67432a.m262319a(iAppContext).getCurrentPagePath())).mo231090a("share_platform", str).mo231090a("position", str2).mo231090a("share_type", z ? "token" : "link").mo231092a();
    }

    /* renamed from: a */
    public static void m258588a(String str, String str2, long j, String str3, String str4, boolean z, IAppContext iAppContext) {
        if (j != 0) {
            C66020b.m258530a("mp_share_window", iAppContext).mo231090a("page_path", AppConfig.m257573a(C67432a.m262319a(iAppContext).getCurrentPagePath())).mo231090a("share_platform", str).mo231090a("position", str2).mo231090a("share_type", z ? "token" : "link").mo231090a("result_type", str3).mo231090a("duration", Long.valueOf(TimeMeter.currentMillis() - j)).mo231090a("error_msg", str4).mo231092a();
        }
    }

    /* renamed from: a */
    public static void m258591a(String str, String str2, String str3, String str4, boolean z, IAppContext iAppContext) {
        C66020b.m258530a("mp_share_result", iAppContext).mo231090a("page_path", AppConfig.m257573a(C67432a.m262319a(iAppContext).getCurrentPagePath())).mo231090a("share_platform", str).mo231090a("position", str2).mo231090a("share_type", z ? "token" : "link").mo231090a("result_type", str3).mo231090a("error_msg", str4).mo231092a();
    }

    /* renamed from: a */
    public static void m258590a(String str, String str2, IAppContext iAppContext) {
        C66020b.m258530a("mp_publish_done", iAppContext).mo231090a("position", str).mo231090a("content_type", str2).mo231092a();
    }

    /* renamed from: a */
    public static void m258596a(boolean z, String str, long j, long j2, long j3, long j4, String str2, IAppContext iAppContext) {
        C66020b.C66021a a = C66020b.m258530a("mp_load_domready", iAppContext).mo231090a("duration", Long.valueOf(j)).mo231090a("result_type", "success").mo231090a("from_app_launch_start_duration", Long.valueOf(j2)).mo231090a("error_msg", CharacterUtils.empty());
        if (!TextUtils.isEmpty(str2)) {
            a.mo231090a("render_type", str2);
        }
        if (j3 != 0) {
            a.mo231090a("cold_launch_duration", Long.valueOf(j3));
            a.mo231090a("activity_service_init_diff", Long.valueOf(j4));
        }
        if (str != null) {
            a.mo231090a("has_preload", Boolean.valueOf(z));
            a.mo231090a("preload_ab_result", str);
        }
        a.mo231092a();
    }

    /* renamed from: a */
    public static void m258594a(JSONObject jSONObject, IAppContext iAppContext) {
        C66020b.m258530a("mp_storage_occupy", iAppContext).mo231091a(jSONObject).mo231092a();
    }

    /* renamed from: a */
    public static void m258595a(boolean z, IAppContext iAppContext) {
        C66020b.m258530a("mp_authority_setting", iAppContext).mo231090a("screen_record", Integer.valueOf(z ? 1 : 0)).mo231092a();
    }

    /* renamed from: a */
    public static void m258580a(IAppContext iAppContext) {
        C66020b.m258530a("mp_snapshot_launch", iAppContext).mo231092a();
    }

    /* renamed from: f */
    private static String m258609f(IAppContext iAppContext) {
        IStreamLoader loadTask = StreamLoader.getLoadTask(iAppContext);
        if (loadTask != null) {
            return loadTask.getLoadPkgType();
        }
        return null;
    }

    /* renamed from: c */
    private static Integer m258603c(IAppContext iAppContext) {
        IStreamLoader loadTask = StreamLoader.getLoadTask(iAppContext);
        if (loadTask == null) {
            return null;
        }
        return Integer.valueOf(!loadTask.isFirstLaunch());
    }

    /* renamed from: d */
    private static Integer m258606d(IAppContext iAppContext) {
        IStreamLoader loadTask = StreamLoader.getLoadTask(iAppContext);
        if (loadTask == null) {
            return null;
        }
        return Integer.valueOf(loadTask.getDownloadType());
    }

    /* renamed from: e */
    private static String m258608e(IAppContext iAppContext) {
        boolean z;
        if (StreamLoader.getLoadTask(iAppContext) == null || !StreamLoader.getLoadTask(iAppContext).isUseLocalPkg()) {
            z = false;
        } else {
            z = true;
        }
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        if (z) {
            return "restart";
        }
        if (appInfo == null || appInfo.getFromType != 1) {
            return "";
        }
        return "local_meta";
    }

    /* renamed from: c */
    public static void m258604c(String str, IAppContext iAppContext) {
        C66020b.m258530a("event_mp_basebundle_file_not_found", iAppContext).mo231090a("file_path", str).mo231092a();
    }

    /* renamed from: d */
    public static void m258607d(String str, IAppContext iAppContext) {
        C66020b.m258530a("mp_page_load_start", iAppContext).mo231090a("page_path", str).mo231092a();
    }

    /* renamed from: a */
    public static void m258584a(String str, IAppContext iAppContext) {
        C66020b.m258530a("mp_technology_msg", iAppContext).mo231090a("device_model", Build.MODEL).mo231090a("msg", str).mo231092a();
    }

    /* renamed from: b */
    public static void m258600b(String str, IAppContext iAppContext) {
        String str2;
        String str3;
        String str4;
        C66020b.C66021a a = C66020b.m258530a("mp_schema_assess", iAppContext);
        String str5 = null;
        if (MicroSchemaEntity.checkLaunchFrom(str) == null) {
            str2 = null;
        } else {
            str2 = MicroSchemaEntity.checkLaunchFrom(str).getName();
        }
        C66020b.C66021a a2 = a.mo231090a("launch_from_check", str2);
        if (MicroSchemaEntity.checkTTid(str) == null) {
            str3 = null;
        } else {
            str3 = MicroSchemaEntity.checkTTid(str).getName();
        }
        C66020b.C66021a a3 = a2.mo231090a("ttid_check", str3);
        if (MicroSchemaEntity.checkScene(str) == null) {
            str4 = null;
        } else {
            str4 = MicroSchemaEntity.checkScene(str).getName();
        }
        C66020b.C66021a a4 = a3.mo231090a("scene_check", str4);
        if (MicroSchemaEntity.checkBdpsum(str) != null) {
            str5 = MicroSchemaEntity.checkBdpsum(str).getName();
        }
        a4.mo231090a("bdpsum_check", str5).mo231090a("schema_string", str).mo231092a();
    }

    /* renamed from: a */
    public static void m258581a(String str, long j, IAppContext iAppContext) {
        C66020b.m258530a("mp_preload_result", iAppContext).mo231090a("result_type", str).mo231090a("duration", Long.valueOf(j)).mo231092a();
    }

    /* renamed from: b */
    public static void m258598b(String str, long j, IAppContext iAppContext) {
        C66020b.m258530a("mp_load_sub_package_start", iAppContext).mo231090a("time", Long.valueOf(j)).mo231090a("page_path", str).mo231092a();
    }

    /* renamed from: c */
    public static void m258605c(String str, String str2, IAppContext iAppContext) {
        C66020b.m258530a("mp_apply", iAppContext).mo231090a("mp_latest_version", str).mo231090a("mp_current_version", str2).mo231092a();
    }

    /* renamed from: b */
    public static void m258601b(String str, String str2, IAppContext iAppContext) {
        C66020b.m258530a("mp_notify", iAppContext).mo231090a("mp_latest_version", str).mo231090a("mp_current_version", str2).mo231092a();
    }

    /* renamed from: a */
    public static void m258582a(String str, long j, String str2, IAppContext iAppContext) {
        C66020b.m258530a("mp_js_load_result", iAppContext).mo231090a("result_type", str).mo231090a("duration", Long.valueOf(j)).mo231090a("error_msg", str2).mo231092a();
    }

    /* renamed from: b */
    public static void m258599b(String str, long j, String str2, IAppContext iAppContext) {
        C66020b.m258530a("mp_cpjs_load_result", iAppContext).mo231090a("duration", Long.valueOf(j)).mo231090a("result_type", str).mo231090a("error_msg", str2).mo231092a();
    }

    /* renamed from: a */
    public static void m258586a(String str, String str2, long j, IAppContext iAppContext) {
        C66020b.m258530a("mp_load_sub_package_result", iAppContext).mo231090a("time", Long.valueOf(System.currentTimeMillis())).mo231090a("result_type", str).mo231090a("page_path", str2).mo231090a("duration", Long.valueOf(j)).mo231092a();
    }

    /* renamed from: a */
    public static void m258579a(long j, String str, String str2, long j2, String str3, IAppContext iAppContext) {
        m258602c(j, str, str2, j2, str3, iAppContext).mo231092a();
    }

    /* renamed from: b */
    public static void m258597b(long j, String str, String str2, long j2, String str3, IAppContext iAppContext) {
        m258602c(j, str, str2, j2, str3, iAppContext).mo231090a("__inner_handled", true).mo231092a();
    }

    /* renamed from: a */
    public static void m258583a(String str, long j, String str2, String str3, boolean z, IAppContext iAppContext) {
        String str4;
        if (j != 0) {
            long currentMillis = TimeMeter.currentMillis() - j;
            C66020b.C66021a a = C66020b.m258530a("mp_share_upload", iAppContext).mo231090a("page_path", AppConfig.m257573a(C67432a.m262319a(iAppContext).getCurrentPagePath())).mo231090a("position", str);
            if (z) {
                str4 = "token";
            } else {
                str4 = "link";
            }
            a.mo231090a("share_type", str4).mo231090a("result_type", str2).mo231090a("duration", Long.valueOf(currentMillis)).mo231090a("error_msg", str3).mo231092a();
        }
    }

    /* renamed from: c */
    private static C66020b.C66021a m258602c(long j, String str, String str2, long j2, String str3, IAppContext iAppContext) {
        boolean z;
        String str4;
        if (iAppContext instanceof AbstractC67433a) {
            z = ((AbstractC67433a) iAppContext).mo234167g();
        } else {
            z = false;
        }
        C66020b.C66021a a = C66020b.m258530a("mp_load_result", iAppContext).mo231090a("duration", Long.valueOf(j));
        if (C67432a.m262319a(iAppContext).getAppInfo() != null) {
            str4 = C67432a.m262319a(iAppContext).getAppInfo().launchType;
        } else {
            str4 = "";
        }
        return a.mo231090a("launch_type", str4).mo231090a("result_type", str).mo231090a("load_type", m258608e(iAppContext)).mo231090a("error_msg", str2).mo231090a("total_duration", Long.valueOf(j2)).mo231090a("load_state", str3).mo231090a("is_subpackage_mode", Boolean.valueOf(z)).mo231090a("load_pkg_type", m258609f(iAppContext)).mo231090a("load_pkg_source", m258606d(iAppContext)).mo231090a("load_first_launch", m258603c(iAppContext));
    }

    /* renamed from: a */
    public static void m258585a(String str, String str2, int i, String str3, int i2, IAppContext iAppContext) {
        C66020b.C66021a a = C66020b.m258530a("mp_enter_page", iAppContext).mo231090a("page_path", str);
        if (str2 == null) {
            str2 = "";
        }
        C66020b.C66021a a2 = a.mo231090a(SearchIntents.EXTRA_QUERY, str2).mo231090a("has_webview", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str3)) {
            a2.mo231090a("last_page_path", str3);
            a2.mo231090a("last_has_webview", Integer.valueOf(i2));
        }
        a2.mo231092a();
    }

    /* renamed from: a */
    public static void m258587a(String str, String str2, long j, String str3, IAppContext iAppContext, String str4) {
        C66020b.m258530a("mp_page_load_result", iAppContext).mo231090a("page_path", str).mo231090a("result_type", str2).mo231090a("duration", Long.valueOf(j)).mo231090a("error_msg", str3).mo231090a("render_type", str4).mo231092a();
    }
}
