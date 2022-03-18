package com.ss.lark.android.passport.biz.feature.account_center;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/AccountCenterStatisticsHelper;", "", "()V", "AUTHED_EMAIL_TENANT_LIST_CLICK", "", "CLICK_EVENT_NAME", "JOIN_TEAM", "TARGET_PASSPORT_AUTHED_EMAIL_TENANT_LIST_VIEW", "TARGET_PASSPORT_JOIN_TEAM_VIEW", "TARGET_PASSPORT_TEAM_INFO_SETTING_VIEW", "TARGET_PASSPORT_USER_INFO_SETTING_VIEW", "VALUE_AUTHED_EMAIL_TENANT", "VALUE_CREATE_TEAM", "VALUE_ENTER_TEAM", "VALUE_JOIN_TEAM", "VALUE_LOGIN_ANOTHER", "VALUE_PERSONAL_USER", "clickAuthedEmailTenant", "", "clickCreateTeam", "clickEmailtenantListEvent", "clickEnterTeam", "clickJoinTeam", "clickLoginAnother", "clickPersonalUse", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a */
public final class AccountCenterStatisticsHelper {

    /* renamed from: a */
    public static final AccountCenterStatisticsHelper f163012a = new AccountCenterStatisticsHelper();

    private AccountCenterStatisticsHelper() {
    }

    /* renamed from: a */
    public final void mo223311a() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_change_or_create_team_click").mo171607a("click", "enter_team").mo171607a("target", "none"));
    }

    /* renamed from: b */
    public final void mo223312b() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_change_or_create_team_click").mo171607a("click", "authed_email_tenant").mo171607a("target", "passport_authed_email_tenant_list_view"));
    }

    /* renamed from: c */
    public final void mo223313c() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_change_or_create_team_click").mo171607a("click", "login_another").mo171607a("target", "none"));
    }

    /* renamed from: d */
    public final void mo223314d() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_change_or_create_team_click").mo171607a("click", "join_team").mo171607a("target", "passport_join_team_view"));
    }

    /* renamed from: e */
    public final void mo223315e() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_change_or_create_team_click").mo171607a("click", "personal_user").mo171607a("target", "passport_user_info_setting_view"));
    }

    /* renamed from: f */
    public final void mo223316f() {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_change_or_create_team_click").mo171607a("click", "create_team").mo171607a("target", "passport_team_info_setting_view"));
    }
}
