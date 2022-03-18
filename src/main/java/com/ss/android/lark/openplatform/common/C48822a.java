package com.ss.android.lark.openplatform.common;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.openplatform.OpenPlatformModule;

/* renamed from: com.ss.android.lark.openplatform.common.a */
public class C48822a {
    /* renamed from: e */
    public static String m192354e() {
        if (OpenPlatformModule.m192198d().isOverseaTenantBrand()) {
            return "applink.larksuite.com";
        }
        return "applink.feishu.cn";
    }

    /* renamed from: f */
    public static String m192355f() {
        return m192350a("https://", m192354e(), "/client/app_share/open");
    }

    /* renamed from: a */
    public static String m192349a() {
        return m192350a("https://", OpenPlatformModule.m192198d().getDynamicDomain(DomainSettings.Alias.OPEN_APPCENTER3), m192356g());
    }

    /* renamed from: c */
    public static String m192352c() {
        return m192350a("https://", OpenPlatformModule.m192198d().getDynamicDomain(DomainSettings.Alias.INTERNAL_API), "/lark/app_interface/api/app_share/info");
    }

    /* renamed from: d */
    public static String m192353d() {
        return m192350a("https://", OpenPlatformModule.m192198d().getDynamicDomain(DomainSettings.Alias.OPEN), "/open-apis/applink/shortlink/v1/generate");
    }

    /* renamed from: b */
    public static String m192351b() {
        String dynamicDomain = OpenPlatformModule.m192198d().getDynamicDomain(DomainSettings.Alias.OPEN_APPCENTER3);
        String appEnv = OpenPlatformModule.m192198d().getAppEnv();
        if (appEnv.equals("pre_release")) {
            return m192350a("https://", dynamicDomain, "/fleamarket/app_center/app_info");
        }
        if (appEnv.equals("staging")) {
            return m192350a("https://", dynamicDomain, "/appcenter/app_center/app_info");
        }
        return m192350a("https://", dynamicDomain, "/lark/appcenter/app_center/app_info");
    }

    /* renamed from: g */
    private static String m192356g() {
        StringBuilder sb = new StringBuilder();
        String appEnv = OpenPlatformModule.m192198d().getAppEnv();
        if (appEnv.equals("pre_release")) {
            sb.append("/fleamarket");
        } else if (appEnv.equals("staging")) {
            sb.append("/appcenter");
        } else {
            sb.append("/lark/appcenter");
        }
        sb.append("/app_center/PullPlusMenuApp");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m192350a(String str, String str2, String str3) {
        return str + str2 + str3;
    }
}
