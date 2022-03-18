package com.ss.android.lark.passport.env.p2419a;

import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.signinsdk_api.entity.EnvConst;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57878s;

/* renamed from: com.ss.android.lark.passport.env.a.b */
public class C49000b {
    /* renamed from: a */
    public static HostEnvBean m192978a() {
        String string = C57744a.m224104a().getString("env_config_host_env");
        if (string == null) {
            return m192981b();
        }
        return (HostEnvBean) C57878s.m224590a(string, HostEnvBean.class);
    }

    /* renamed from: b */
    private static HostEnvBean m192981b() {
        String str = null;
        if (!C57744a.m224104a().contains("login_host_env")) {
            return null;
        }
        JSONObject a = C57878s.m224589a(C57744a.m224104a().getString("login_host_env", ""));
        if (a != null) {
            str = a.getString("envName");
        }
        HostEnvBean a2 = m192979a(str);
        if (a2 != null) {
            m192980a(a2);
        }
        C57744a.m224104a().remove("login_host_env");
        return a2;
    }

    /* renamed from: a */
    public static void m192980a(HostEnvBean hostEnvBean) {
        C57744a.m224104a().putString("env_config_host_env", C57878s.m224591a(hostEnvBean));
    }

    /* renamed from: a */
    public static HostEnvBean m192979a(String str) {
        if ("feishu".equals(str)) {
            return EnvConst.m194442a();
        }
        if ("lark".equals(str)) {
            return EnvConst.m194443b();
        }
        return null;
    }
}
