package com.ss.lark.android.passport.biz.feature.login;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/OneKeyLoginStatisticsHelper;", "", "()V", "CLOSED", "", "FAILED", "LOGIN", "LOGIN_RESULT", "ONE_CLICK_LOGIN_CLICK", "SUCCESS", "SWITCH_LOGIN_METHOD", "clickCloseEvent", "", "clickLoginEvent", "success", "", "clickSwitchLoginMethodEvent", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.h */
public final class OneKeyLoginStatisticsHelper {

    /* renamed from: a */
    public static final OneKeyLoginStatisticsHelper f163476a = new OneKeyLoginStatisticsHelper();

    private OneKeyLoginStatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m254675a() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_one_click_login_click").mo171607a("click", "closed").mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m254677b() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_one_click_login_click").mo171607a("click", "switch_login_method").mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m254676a(boolean z) {
        String str;
        StatisticsHelper.StatisticsEvent a = new StatisticsHelper.StatisticsEvent("passport_one_click_login_click").mo171607a("click", "login").mo171607a("target", "none");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        StatisticsHelper.m193775a(a.mo171607a("login_result", str));
    }
}
