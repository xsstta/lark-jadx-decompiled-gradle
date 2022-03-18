package com.ss.lark.android.passport.biz.feature.set;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/set/SetPasswordStatisticsHelper;", "", "()V", "CLOSE", "", "LATER_SET", "PWD_SETTING_CLICK", "SUCCESS_CREATE_TEAM_VIEW", "clickCloseEvent", "", "flowType", "clickLaterSetEvent", "clickNextEvent", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.set.b */
public final class SetPasswordStatisticsHelper {

    /* renamed from: a */
    public static final SetPasswordStatisticsHelper f163701a = new SetPasswordStatisticsHelper();

    private SetPasswordStatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m255092a(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_pwd_setting_click").mo171607a("flow_type", str).mo171607a("click", "next").mo171607a("target", "passport_success_create_team_view"));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m255093b(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_pwd_setting_click").mo171607a("flow_type", str).mo171607a("click", "close").mo171607a("target", "passport_success_create_team_view"));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m255094c(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_pwd_setting_click").mo171607a("flow_type", str).mo171607a("click", "later_set").mo171607a("target", "passport_success_create_team_view"));
    }
}
