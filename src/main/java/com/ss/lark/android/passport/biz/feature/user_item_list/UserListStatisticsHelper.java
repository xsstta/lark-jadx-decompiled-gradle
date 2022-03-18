package com.ss.lark.android.passport.biz.feature.user_item_list;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.lark.android.passport.biz.entity.UserItemListStep;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/user_item_list/UserListStatisticsHelper;", "", "()V", "APPEAL", "", "CHOOSE_TEAM_CLICK", "CONTINUE_CREATE", "CREATE_TEAM", "ENTER_TEAM", "JOIN_TEAM", "PASSPORT_TEAM_INFO_SETTING_VIEW", "appealEvent", "", "flowType", "is_create_join_show", "", "continueCreateTeamEvent", "createTeamEvent", "enterTeamEvent", "isCreateJoinShow", "stepInfo", "Lcom/ss/lark/android/passport/biz/entity/UserItemListStep;", "joinTeamEvent", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.b */
public final class UserListStatisticsHelper {

    /* renamed from: a */
    public static final UserListStatisticsHelper f163990a = new UserListStatisticsHelper();

    private UserListStatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m255713a(UserItemListStep userItemListStep) {
        if (userItemListStep == null) {
            return false;
        }
        if (userItemListStep.joinButton == null && userItemListStep.registerButton == null) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m255712a(String str, boolean z) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_choose_team_click").mo171607a("click", "enter_team").mo171607a("flow_type", str).mo171607a("is_create_join_show", String.valueOf(z)).mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m255714b(String str, boolean z) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_choose_team_click").mo171607a("click", "appeal").mo171607a("flow_type", str).mo171607a("is_create_join_show", String.valueOf(z)).mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m255715c(String str, boolean z) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_choose_team_click").mo171607a("click", "join_team").mo171607a("flow_type", str).mo171607a("is_create_join_show", String.valueOf(z)).mo171607a("target", "none"));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m255716d(String str, boolean z) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_choose_team_click").mo171607a("click", "create_team").mo171607a("flow_type", str).mo171607a("is_create_join_show", String.valueOf(z)).mo171607a("target", "passport_team_info_setting_view"));
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m255717e(String str, boolean z) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_choose_team_click").mo171607a("click", "continue_create").mo171607a("flow_type", str).mo171607a("is_create_join_show", String.valueOf(z)).mo171607a("target", "none"));
    }
}
