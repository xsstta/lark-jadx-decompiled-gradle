package com.ss.lark.android.passport.biz.feature.company_login;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/company_login/SSOLoginStatisticsHelper;", "", "()V", "DOMAIN_HELP", "", "I_KONW", "PASSPORT_SSO_LOGIN_VIEW", "SSO_ALERT_CLICK", "SSO_ALERT_VIEW", "SSO_LOGIN", "SSO_LOGIN_CLICK", "clickIKnowEvent", "", "clickSSOLoginEvent", "domainhelpEvent", "showDialog", "ssoLoginEvent", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.company_login.c */
public final class SSOLoginStatisticsHelper {

    /* renamed from: a */
    public static final SSOLoginStatisticsHelper f163204a = new SSOLoginStatisticsHelper();

    private SSOLoginStatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m254154e() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_sso_alert_view"));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m254150a() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_sso_login_click").mo171607a("click", "next").mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m254151b() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_sso_login_click").mo171607a("click", "domain_help").mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m254152c() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_sso_alert_click").mo171607a("click", "sso_login").mo171607a("target", "passport_sso_login_view"));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m254153d() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_sso_alert_click").mo171607a("click", "i_konw").mo171607a("target", "none"));
    }
}
