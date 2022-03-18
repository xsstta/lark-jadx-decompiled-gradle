package com.ss.android.appcenter.business.monitor.statistics;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.appcenter.business.monitor.statistics.BizStatisticsConstants;
import com.ss.android.appcenter.common.util.C28179c;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.monitor.statistics.b */
public class C27710b extends BizStatisticsConstants {

    /* renamed from: a */
    public static String f69273a = "";

    /* renamed from: b */
    private static Gson f69274b = new Gson();

    /* renamed from: a */
    public static void m101264a(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("appname", str);
            hashMap.put("app_id", str2);
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("commonly", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                hashMap.put("applink_type", str5);
            }
            if (!TextUtils.equals("ONCALL", str3) && !TextUtils.equals("", str3)) {
                hashMap.put("application_type", str3);
            }
            hashMap.put("badge_status", str6);
            hashMap.put("badge_number", Integer.valueOf(i));
            String json = f69274b.toJson(hashMap);
            if (m101313n()) {
                m101294e("appcenter_call_app", json);
            }
        }
    }

    /* renamed from: a */
    public static void m101263a(String str, String str2, String str3, String str4, String str5) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("appname", str);
            hashMap.put("app_id", str2);
            if (!TextUtils.equals("ONCALL", str3) && !TextUtils.equals("", str3)) {
                hashMap.put("application_type", str3);
            }
            hashMap.put(ShareHitPoint.f121868c, str4);
            hashMap.put("action", str5);
            String json = f69274b.toJson(hashMap);
            if (m101313n()) {
                m101294e("app_setting_set_Badge", json);
            }
        }
    }

    /* renamed from: a */
    public static void m101260a(String str, String str2, String str3) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("feedback_from", str);
            hashMap.put("app_id", str2);
            hashMap.put("appname", str3);
            m101294e("appcenter_feedback_enter", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: a */
    public static void m101261a(String str, String str2, String str3, int i, String str4) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("feedback_from", str);
            hashMap.put("app_id", str2);
            hashMap.put("appname", str3);
            hashMap.put("error_code", Integer.valueOf(i));
            hashMap.put("error_message", str4);
            m101294e("appcenter_feedback_sumbit", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: a */
    public static void m101268a(boolean z) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("is_success", z ? "yes" : "no");
            m101294e("appcenter_rendering", f69274b.toJson(o));
        }
    }

    /* renamed from: a */
    public static void m101266a(String str, boolean z) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            o.put("is_success", z ? "1" : "0");
            m101294e("widget_rendering", f69274b.toJson(o));
        }
    }

    /* renamed from: a */
    public static void m101258a(String str, long j) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            o.put("time", Long.valueOf(j));
            m101294e("widget_rendering_time", f69274b.toJson(o));
        }
    }

    /* renamed from: b */
    public static void m101278b(String str, boolean z) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            o.put("click_type", z ? "expand" : "fold");
            m101294e("widget_unfold_click", f69274b.toJson(o));
        }
    }

    /* renamed from: a */
    public static void m101259a(String str, String str2) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            o.put("item_id", str2);
            o.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            m101294e("origin_logevent_log_hourly", f69274b.toJson(o));
        }
    }

    /* renamed from: a */
    public static void m101269a(boolean z, String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_help", Boolean.valueOf(z));
            hashMap.put("application_type", str);
            m101294e("op_profile_show", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: a */
    public static void m101267a(List<String> list) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("appids", list);
            m101294e("appcenter_onboardinginstall_exposure", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: b */
    public static void m101279b(List<String> list) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("appids", list);
            m101294e("appcenter_onboardinginstall_istall", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: a */
    public static void m101262a(String str, String str2, String str3, String str4, int i) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, "block_menu");
            hashMap.put("app_name", str);
            hashMap.put("application_id", str2);
            hashMap.put("block_id", str4);
            hashMap.put("block_type_id", str3);
            hashMap.put("menu_count", Integer.valueOf(i));
            m101294e("openplatform_workspace_main_page_component_expo_view", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: a */
    public static void m101265a(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("click", "block");
            hashMap.put("target", "none");
            hashMap.put("application_id", str);
            hashMap.put("app_name", str4);
            hashMap.put("block_id", str3);
            hashMap.put("block_type_id", str2);
            if (z) {
                hashMap.put("mode", "standard");
            } else {
                hashMap.put("mode", "off_standard");
            }
            if (z2) {
                hashMap.put("host", "old");
            } else {
                hashMap.put("host", "template");
            }
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: b */
    public static void m101277b(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, "block");
            hashMap.put("application_id", str);
            hashMap.put("app_name", str4);
            hashMap.put("block_type_id", str2);
            hashMap.put("block_id", str3);
            if (z) {
                hashMap.put("mode", "standard");
            } else {
                hashMap.put("mode", "off_standard");
            }
            if (z2) {
                hashMap.put("host", "old");
            } else {
                hashMap.put("host", "template");
            }
            m101294e("openplatform_workspace_main_page_component_expo_view", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: o */
    private static Map<String, Object> m101314o() {
        return m101251a((Context) null);
    }

    /* renamed from: a */
    public static void m101252a() {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            m101250C("app_states_unavailable_show");
        }
    }

    /* renamed from: b */
    public static void m101270b() {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            m101250C("app_states_unavailable_in_process");
        }
    }

    /* renamed from: c */
    public static void m101280c() {
        if (m101313n()) {
            m101294e("appcenter_click_open_appdirectory", f69274b.toJson(m101314o()));
        }
    }

    /* renamed from: e */
    public static void m101292e() {
        if (m101313n()) {
            m101294e("appcenter_click_settings", f69274b.toJson(m101314o()));
        }
    }

    /* renamed from: f */
    public static void m101296f() {
        if (m101313n()) {
            m101294e("appcenter_adjustorder", f69274b.toJson(m101314o()));
        }
    }

    /* renamed from: g */
    public static void m101298g() {
        if (m101313n()) {
            m101294e("appcenter_click_addapps", f69274b.toJson(m101314o()));
        }
    }

    /* renamed from: j */
    public static void m101304j() {
        if (C27548m.m100547m().mo98216a() != null) {
            m101294e("openplatform_workspace_main_page_view", f69274b.toJson(new HashMap()));
        }
    }

    /* renamed from: k */
    public static void m101306k() {
        if (C27548m.m100547m().mo98216a() != null) {
            m101294e("openplatform_workspace_setting_page_view", f69274b.toJson(new HashMap()));
        }
    }

    /* renamed from: l */
    public static void m101308l() {
        if (C27548m.m100547m().mo98216a() != null) {
            m101294e("openplatform_workspace_add_app_page_view", f69274b.toJson(new HashMap()));
        }
    }

    /* renamed from: m */
    private static Map<String, Object> m101310m() {
        HashMap hashMap = new HashMap();
        hashMap.put("solution_id", "none");
        hashMap.put("scene_type", "none");
        hashMap.put("application_id", "none");
        return hashMap;
    }

    /* renamed from: n */
    private static boolean m101313n() {
        if (C27548m.m100547m().mo98218b() != null) {
            return !C27548m.m100547m().mo98218b().mo98173d();
        }
        return false;
    }

    /* renamed from: d */
    public static void m101287d() {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("click", "openplatform_application_get");
            o.put("target", "openplatform_ecosystem_application_menu_view");
            m101294e("openplatform_ecosystem_workspace_mainpage_click", f69274b.toJson(o));
        }
    }

    /* renamed from: h */
    public static void m101300h() {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            m101294e("appcenter_onboardinginstall_skip", f69274b.toJson(new HashMap()));
        }
    }

    /* renamed from: i */
    public static void m101302i() {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            m101294e("appcenter_operation_installapp_skip", f69274b.toJson(new HashMap()));
        }
    }

    /* renamed from: C */
    private static void m101250C(String str) {
        C27548m.m100547m().mo98216a().mo98156a(str);
    }

    /* renamed from: A */
    public static void m101248A(String str) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, str);
            m101294e("openplatform_workspace_main_page_component_expo_view", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: d */
    public static void m101289d(String str) {
        if (m101313n()) {
            Map<String, Object> m = m101310m();
            m.put("application_id", str);
            m101294e("openplatform_workspace_appcard_action_menu_view", f69274b.toJson(m));
        }
    }

    /* renamed from: h */
    public static void m101301h(String str) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("item_id", str);
            m101294e("appcenter_deleteapp", f69274b.toJson(o));
        }
    }

    /* renamed from: i */
    public static void m101303i(String str) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            m101294e("widget_icon_click", f69274b.toJson(o));
        }
    }

    /* renamed from: B */
    public static void m101249B(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("appId", str);
            m101294e("groupbot_addbot_success", f69274b.toJson(o));
        }
    }

    /* renamed from: a */
    private static Map<String, Object> m101251a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("tenant_id", C28179c.m103226a(C27548m.m100547m().mo98221e().mo98215d()));
        hashMap.put("user_id", C28179c.m103226a(C27548m.m100547m().mo98221e().mo98213b()));
        if (context != null) {
            hashMap.put("platform", "android");
        }
        return hashMap;
    }

    /* renamed from: b */
    public static void m101271b(int i) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", Integer.valueOf(i));
            m101294e("app_states_unavailable_apply", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: c */
    public static void m101282c(String str) {
        if (m101313n()) {
            Map<String, Object> m = m101310m();
            m.put("click", "app_share");
            m.put("target", "openplatform_application_share_view");
            m.put("application_id", str);
            m101294e("openplatform_bot_profile_click", f69274b.toJson(m));
        }
    }

    /* renamed from: e */
    public static void m101293e(String str) {
        if (m101313n()) {
            Map<String, Object> m = m101310m();
            m.put("click", "app_share");
            m.put("target", "openplatform_application_share_view");
            m.put("application_id", str);
            m101294e("openplatform_workspace_appcard_action_menu_click", f69274b.toJson(m));
        }
    }

    /* renamed from: f */
    public static void m101297f(String str) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            m101294e("appcenter_my_deleteapp", f69274b.toJson(o));
        }
    }

    /* renamed from: g */
    public static void m101299g(String str) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("item_id", str);
            m101294e("appcenter_addapp", f69274b.toJson(o));
        }
    }

    /* renamed from: j */
    public static void m101305j(String str) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            m101294e("appcenter_set_commonuse", f69274b.toJson(o));
        }
    }

    /* renamed from: k */
    public static void m101307k(String str) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            m101294e("appcenter_set_cancel_commonuse", f69274b.toJson(o));
        }
    }

    /* renamed from: l */
    public static void m101309l(String str) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            m101294e("appcenter_set_order", f69274b.toJson(o));
        }
    }

    /* renamed from: m */
    public static void m101311m(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", str);
            m101294e("gadget_about_show_restart", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: n */
    public static void m101312n(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", str);
            m101294e("gadget_about_tap_restart", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: o */
    public static void m101315o(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", str);
            m101294e("gadget_about_show_download_failed", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: p */
    public static void m101316p(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", str);
            m101294e("gadget_about_tap_download_failed", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: q */
    public static void m101317q(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", str);
            m101294e("appcenter_onboardinginstall_viewdetail", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: r */
    public static void m101318r(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            m101294e("appcenter_onboardinginstall_user_action", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: s */
    public static void m101319s(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("operation_id", str);
            m101294e("appcenter_operation_exposure", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: t */
    public static void m101320t(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("operation_id", str);
            m101294e("appcenter_operation_open", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: u */
    public static void m101321u(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", str);
            m101294e("appcenter_operation_installapp_viewdetail", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: v */
    public static void m101322v(String str) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", str);
            m101294e("appcenter_widgetopen", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: w */
    public static void m101323w(String str) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, str);
            hashMap.put("click", BizStatisticsConstants.C27708a.f69267a);
            hashMap.put("sub_type", "native");
            hashMap.put("target", "openplatform_workspace_add_app_page_view");
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: x */
    public static void m101324x(String str) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, str);
            hashMap.put("click", BizStatisticsConstants.C27708a.f69269c);
            hashMap.put("sub_type", "native");
            hashMap.put("target", "none");
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: y */
    public static void m101325y(String str) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, str);
            hashMap.put("click", "more");
            hashMap.put("sub_type", "native");
            hashMap.put("target", "none");
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: z */
    public static void m101326z(String str) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("click", "block_menu_item");
            if (TextUtils.equals("sort", str)) {
                hashMap.put("target", "openplatform_workspace_setting_page_view");
            } else {
                hashMap.put("target", "none");
            }
            hashMap.put("menu_type", str);
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: a */
    public static void m101253a(int i) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("apps_count", Integer.valueOf(i));
            String json = f69274b.toJson(hashMap);
            if (m101313n()) {
                m101294e("appcenter_set_badgeSettingPageOnShow", json);
            }
        }
    }

    /* renamed from: c */
    public static void m101281c(int i) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, "feed");
            hashMap.put("click", "feed");
            hashMap.put("sub_type", "native");
            hashMap.put("target", "none");
            hashMap.put("feed_type", "swiper");
            hashMap.put("position", Integer.valueOf(i));
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: d */
    public static void m101288d(int i) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, "feed");
            hashMap.put("feed_type", "swiper");
            hashMap.put("position", Integer.valueOf(i));
            m101294e("openplatform_workspace_main_page_component_expo_view", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: e */
    public static void m101295e(List<String> list) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("appids", list);
            m101294e("appcenter_operation_installapp_installsuccessed", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: b */
    public static void m101273b(String str) {
        if (m101313n()) {
            Map<String, Object> m = m101310m();
            m.put("application_id", str);
            m101294e("openplatform_bot_profile_view", f69274b.toJson(m));
        }
    }

    /* renamed from: a */
    public static void m101255a(long j) {
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("time", Long.valueOf(j));
            m101294e("appcenter_rendering_time", f69274b.toJson(o));
        }
    }

    /* renamed from: d */
    public static void m101291d(List<String> list) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("appids", list);
            m101294e("appcenter_operation_installapp_install", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: a */
    public static void m101256a(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", str);
            String json = f69274b.toJson(hashMap);
            if (m101313n()) {
                m101294e("click_app_menu_bot", json);
            }
        }
    }

    /* renamed from: c */
    public static void m101286c(List<String> list) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("appids", list);
            m101294e("appcenter_onboardinginstall_installsuccessed", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: e */
    private static void m101294e(String str, String str2) {
        C27548m.m100547m().mo98216a().mo98157a(str, str2);
    }

    /* renamed from: b */
    public static void m101272b(int i, int i2) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, "feed");
            hashMap.put("feed_type", "list");
            hashMap.put("position", Integer.valueOf(i));
            hashMap.put("tab_count", Integer.valueOf(i2));
            m101294e("openplatform_workspace_main_page_component_expo_view", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: a */
    public static void m101254a(int i, int i2) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, "feed");
            hashMap.put("click", "feed");
            hashMap.put("sub_type", "native");
            hashMap.put("target", "none");
            hashMap.put("feed_type", "list");
            hashMap.put("position", Integer.valueOf(i));
            hashMap.put("tab_count", Integer.valueOf(i2));
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: c */
    public static void m101283c(String str, String str2) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, "header");
            hashMap.put("click", str);
            hashMap.put("sub_type", "native");
            hashMap.put("target", str2);
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: d */
    public static void m101290d(String str, String str2) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, "app_menu");
            hashMap.put("app_name", str);
            hashMap.put("application_id", str2);
            m101294e("openplatform_workspace_main_page_component_expo_view", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: b */
    public static void m101274b(String str, String str2) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("function_name", str);
            hashMap.put("application_type", str2);
            m101294e("op_profile_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: c */
    public static void m101285c(String str, boolean z) {
        String str2;
        if (m101313n()) {
            Map<String, Object> o = m101314o();
            o.put("app_id", str);
            if (z) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            o.put("app_area", str2);
            m101294e("appcenter_set_more", f69274b.toJson(o));
        }
    }

    /* renamed from: c */
    public static void m101284c(String str, String str2, String str3) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", str);
            hashMap.put("current_version", str2);
            hashMap.put("latest_version", str3);
            m101294e("gadget_about_enter", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: b */
    public static void m101275b(String str, String str2, String str3) {
        if (C27548m.m100547m().mo98216a() != null && m101313n()) {
            HashMap hashMap = new HashMap();
            hashMap.put("feedback_from", str);
            hashMap.put("app_id", str2);
            hashMap.put("appname", str3);
            m101294e("appcenter_feedback_sumbit", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: a */
    public static void m101257a(String str, int i, String str2) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, str);
            hashMap.put("click", BizStatisticsConstants.C27708a.f69268b);
            hashMap.put("sub_type", "native");
            hashMap.put("target", "none");
            hashMap.put("position", Integer.valueOf(i));
            hashMap.put("tab_from", str2);
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }

    /* renamed from: b */
    public static void m101276b(String str, String str2, String str3, String str4, String str5) {
        if (C27548m.m100547m().mo98216a() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, str);
            hashMap.put("click", "application");
            hashMap.put("sub_type", "native");
            hashMap.put("target", "none");
            hashMap.put("app_name", str3);
            hashMap.put("application_id", str2);
            hashMap.put("app_scene", str4);
            hashMap.put("app_type", str5);
            m101294e("openplatform_workspace_main_page_click", f69274b.toJson(hashMap));
        }
    }
}
