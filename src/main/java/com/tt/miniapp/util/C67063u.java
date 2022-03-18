package com.tt.miniapp.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.settings.configs.PreRenderAppConfig;
import com.tt.miniapp.settings.configs.PreRenderConfig;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.C67479c;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: com.tt.miniapp.util.u */
public class C67063u {
    /* renamed from: b */
    public static String m261366b(String str) {
        return C67056s.m261344a().mo233158a(str);
    }

    /* renamed from: a */
    public static String m261363a(IAppContext iAppContext) {
        String str = C67432a.m262319a(iAppContext).getAppInfo().appId;
        String str2 = C67432a.m262319a(iAppContext).getAppInfo().version;
        String currentPage = AppbrandApplicationImpl.getInst(iAppContext).getCurrentPage();
        String userId = HostDependManager.getInst().getUserId();
        String language = C67479c.m262467a().mo234230c().getLanguage();
        return "PRE_RENDER_" + str + "_" + userId + "_" + str2 + "_" + language + "_" + currentPage;
    }

    /* renamed from: a */
    public static boolean m261365a(String str) {
        PreRenderConfig preRenderConfig;
        boolean z = false;
        String a = C12738a.m52723a(AppbrandContext.getInst().getApplicationContext(), "", Settings.PRE_RENDER);
        if (!TextUtils.isEmpty(a)) {
            preRenderConfig = (PreRenderConfig) JSON.parseObject(a, (Type) PreRenderConfig.class, new Feature[0]);
        } else {
            preRenderConfig = null;
        }
        List<PreRenderAppConfig> appList = preRenderConfig.getAppList();
        if (appList != null && !appList.isEmpty()) {
            for (PreRenderAppConfig preRenderAppConfig : appList) {
                if (preRenderAppConfig.getAppId().equals(str)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m261364a(String str, String str2) {
        C67056s.m261344a().mo233160a(str, str2);
    }
}
