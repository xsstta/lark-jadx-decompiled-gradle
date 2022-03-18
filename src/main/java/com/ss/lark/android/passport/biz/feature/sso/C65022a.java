package com.ss.lark.android.passport.biz.feature.sso;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.a */
public class C65022a {
    /* renamed from: a */
    public static void m255254a() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_auth_click").mo171607a("click", "auth_all").mo171607a("target", "none"));
    }

    /* renamed from: b */
    public static void m255256b() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_auth_click").mo171607a("click", "auth_one").mo171607a("target", "none"));
    }

    /* renamed from: c */
    public static void m255257c() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_auth_click").mo171607a("click", "auth_login").mo171607a("target", "none"));
    }

    /* renamed from: a */
    public static void m255255a(String str, String str2) {
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 519758630) {
                if (hashCode == 883847853) {
                    if (str.equals("page_show")) {
                        c = 0;
                    }
                }
            } else if (str.equals("confirm_btn_click")) {
                c = 1;
            }
            if (c == 0) {
                StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_third_party_auth_view").mo171607a(ShareHitPoint.f121869d, str2));
            } else if (c == 1) {
                StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_third_party_auth_click").mo171607a("click", "auth").mo171607a(ShareHitPoint.f121869d, str2).mo171607a("target", "none"));
            }
        } catch (Exception e) {
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171471d("AuthBuryPoint", "AuthBuryPoint:" + e.getMessage());
        }
    }
}
