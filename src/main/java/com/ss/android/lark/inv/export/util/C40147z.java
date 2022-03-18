package com.ss.android.lark.inv.export.util;

import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.C26320t;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.api.InvitationApi;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.aj;

/* renamed from: com.ss.android.lark.inv.export.util.z */
public class C40147z {
    /* renamed from: e */
    public static boolean m159165e() {
        return DesktopUtil.m144307b();
    }

    /* renamed from: a */
    public static IInvitationModuleDependency m159160a() {
        return m159163c().getDependency();
    }

    /* renamed from: b */
    public static InvitationServiceApi m159162b() {
        return m159163c().getService();
    }

    /* renamed from: c */
    public static InvitationApi m159163c() {
        return (InvitationApi) ApiUtils.getApi(InvitationApi.class);
    }

    /* renamed from: d */
    public static boolean m159164d() {
        return C26284k.m95185a(aj.m224263a());
    }

    /* renamed from: a */
    public static void m159161a(String str, String str2) {
        if (str2 != null) {
            "".equals(str2);
        }
        Log.m165389i("InvitationModule", str + ": " + C26320t.m95318a(str2));
    }
}
