package com.ss.lark.android.passport.biz.feature.user_info;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_info/UserInfoSettingStatisticsHelper;", "", "()V", "MAIL_AND_NAME", "", "MAIL_LOGIN", "PASSPORT_VERIFY_CODE_VIEW", "PHONE_AND_NAME", "PHONE_LOGIN", "USER_INFO_SETTING_CLICK", "USER_INFO_TYPE", "clickMailEvent", "", "flowType", "clickNextEvent", "cpType", "", "clickPhoneEvent", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a */
public final class UserInfoSettingStatisticsHelper {

    /* renamed from: a */
    public static final UserInfoSettingStatisticsHelper f163904a = new UserInfoSettingStatisticsHelper();

    private UserInfoSettingStatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m255606a(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_user_info_setting_click").mo171607a("flow_type", str).mo171607a("click", "mail_login").mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m255608b(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_user_info_setting_click").mo171607a("flow_type", str).mo171607a("click", "phone_login").mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m255607a(String str, int i) {
        String str2;
        StatisticsHelper.StatisticsEvent a = new StatisticsHelper.StatisticsEvent("passport_user_info_setting_click").mo171607a("flow_type", str).mo171607a("click", "next").mo171607a("target", "passport_verify_code_view");
        if (i == 1) {
            str2 = "phone_and_name";
        } else {
            str2 = "mail_and_name";
        }
        StatisticsHelper.m193775a(a.mo171607a("user_info_type", str2));
    }
}
