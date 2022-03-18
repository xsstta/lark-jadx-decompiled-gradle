package com.tt.miniapp.shortcut;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.event.C66020b;

/* renamed from: com.tt.miniapp.shortcut.b */
public class C66827b {
    /* renamed from: a */
    public static void m260740a(IAppContext iAppContext) {
        AppBrandLogger.m52828d("ShortcutEventReporter", "mp_add_desktop_icon_pop_up");
        C66020b.m258530a("mp_add_desktop_icon_pop_up", iAppContext).mo231092a();
    }

    /* renamed from: b */
    public static void m260743b(IAppContext iAppContext) {
        AppBrandLogger.m52828d("ShortcutEventReporter", "mp_add_desktop_icon_learn_more_show");
        C66020b.m258530a("mp_add_desktop_icon_learn_more_show", iAppContext).mo231092a();
    }

    /* renamed from: a */
    public static void m260741a(String str, IAppContext iAppContext) {
        AppBrandLogger.m52828d("ShortcutEventReporter", "mp_add_desktop_icon_click", "params", str);
        C66020b.m258530a("mp_add_desktop_icon_click", iAppContext).mo231090a("trigger_by", str).mo231092a();
    }

    /* renamed from: b */
    public static void m260744b(String str, IAppContext iAppContext) {
        AppBrandLogger.m52828d("ShortcutEventReporter", "mp_add_desktop_icon_select_option");
        C66020b.m258530a("mp_add_desktop_icon_select_option", iAppContext).mo231090a("select_option", str).mo231092a();
    }

    /* renamed from: a */
    public static void m260742a(String str, String str2, IAppContext iAppContext) {
        AppBrandLogger.m52828d("ShortcutEventReporter", "mp_add_desktop_icon_click_result", "params", str + ":", str2);
        C66020b.m258530a("mp_add_desktop_icon_click_result", iAppContext).mo231090a("add_icon_success", str).mo231090a("error_msg", str2).mo231092a();
    }
}
