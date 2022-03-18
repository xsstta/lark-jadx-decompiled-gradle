package com.huawei.hms.framework.network.grs.p1014b;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.huawei.hms.framework.network.grs.b.f */
public class C23557f {

    /* renamed from: a */
    private static final String f58058a = "f";

    /* renamed from: b */
    public static final Set<String> f58059b = Collections.unmodifiableSet(new C23556e(16));

    /* renamed from: a */
    public static String m85445a(String str, GrsBaseInfo grsBaseInfo) {
        if (TextUtils.isEmpty(str)) {
            Logger.m85375w(f58058a, "routeBy must be not empty string or null.");
            return null;
        } else if (!"no_route".equals(str) && !"unconditional".equals(str)) {
            return m85446b(str, grsBaseInfo);
        } else {
            Logger.m85373v(f58058a, "routeBy equals NO_ROUTE_POLICY");
            return "no_route_country";
        }
    }

    /* renamed from: b */
    private static String m85446b(String str, GrsBaseInfo grsBaseInfo) {
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        String[] split = str.split(">");
        for (String str2 : split) {
            if (f58059b.contains(str2.trim())) {
                if ("ser_country".equals(str2.trim()) && !TextUtils.isEmpty(serCountry)) {
                    return serCountry;
                }
                if ("reg_country".equals(str2.trim()) && !TextUtils.isEmpty(regCountry)) {
                    return regCountry;
                }
                if ("issue_country".equals(str2.trim()) && !TextUtils.isEmpty(issueCountry)) {
                    return issueCountry;
                }
            }
        }
        return "";
    }
}
