package com.ss.lark.android.passport.biz.feature.login_input;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u0014\u001a\u00020\u0012H\u0007J\b\u0010\u0015\u001a\u00020\u0012H\u0007J\b\u0010\u0016\u001a\u00020\u0012H\u0007J\b\u0010\u0017\u001a\u00020\u0012H\u0007J\b\u0010\u0018\u001a\u00020\u0012H\u0007J\b\u0010\u0019\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login_input/LoginStatisticsHelper;", "", "()V", "APPLE", "", "CHECKED_PRIVACY_POLICY", "CREATE_TENANT", "GOOGLE", "LOGIN_CLICK", "MAIL_LOGIN", "MORE_LOGIN_TYPE", "PASSPORT_LOGIN_VIEW", "PASSPORT_TEAM_INFO_SETTING_VIEW", "PASSPORT_VERIFY_CODE_VIEW", "PHONE_LOGIN", "SSO", "TYPE", "checkPrivacyPolicyEvent", "", "clickAppleLoginEvent", "clickGoogleLoginEvent", "clickMailLoginEvent", "clickNextEvent", "clickPhoneLoginEvent", "clickRegisterEvent", "clickSSOLoginEvent", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login_input.a */
public final class LoginStatisticsHelper {

    /* renamed from: a */
    public static final LoginStatisticsHelper f163540a = new LoginStatisticsHelper();

    private LoginStatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m254799a() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_click").mo171607a("click", "next").mo171607a("target", "passport_verify_code_view"));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m254800b() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_click").mo171607a("click", "create_tenant").mo171607a("target", "passport_team_info_setting_view"));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m254801c() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_click").mo171607a("click", "phone_login").mo171607a("target", "passport_login_view"));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m254802d() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_click").mo171607a("click", "mail_login").mo171607a("target", "passport_login_view"));
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m254806h() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_click").mo171607a("click", "checked_privacy_policy").mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m254803e() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_click").mo171607a("click", "more_login_type").mo171607a(ShareHitPoint.f121869d, "sso").mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m254804f() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_click").mo171607a("click", "more_login_type").mo171607a(ShareHitPoint.f121869d, "apple").mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m254805g() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_login_click").mo171607a("click", "more_login_type").mo171607a(ShareHitPoint.f121869d, "google").mo171607a("target", "none"));
    }
}
