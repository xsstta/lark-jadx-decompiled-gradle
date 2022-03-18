package com.ss.android.lark.applink;

import com.ss.android.lark.applink.p1366a.C29181a;
import com.ss.android.lark.applink.p1366a.C29185b;
import java.util.Set;

/* renamed from: com.ss.android.lark.applink.g */
public class C29195g {
    /* renamed from: a */
    static boolean m107347a(C29187c cVar, String str, String str2) {
        if (str2 == null) {
            return false;
        }
        Set<String> b = AppLinkSetting.m107339b();
        if (b != null) {
            String str3 = str2 + "/";
            if (b.contains(str2) || b.contains(str3)) {
                return true;
            }
            cVar.mo103453b("PathCheck", "not in path:" + str2);
            C29181a.m107290a(C29185b.f73043h).addCategoryValue("url", str).addCategoryValue("config_msg", "path not right").flush();
            return false;
        }
        cVar.mo103455d("PathCheck", "setting not paths data");
        return true;
    }
}
