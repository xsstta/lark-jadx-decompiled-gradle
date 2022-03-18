package com.ss.lark.android.passport.biz.feature.join_team.join_way;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/join_team/join_way/JoinTeamStatisticsHelper;", "", "()V", "CREATE_TEAM", "", "CREATE_TEAM_OR_PERSONAL_USE_CLICK", "CREATE_TEAM_OR_PESONAL_USE", "INPUT_TEAM_CODE", "JOIN_TEAM_CLICK", "PASSPORT_CREATE_TEAM_OR_PERSONAL_USE_VIEW", "PASSPORT_TEAM_CODE_INPUT_VIEW", "PASSPORT_TEAM_QR_CODE_SACN_VIEW", "PERSONAL_USE", "SCAN_QR_CODE", "TARGET_PASSPORT_TEAM_INFO_SETTING_VIEW", "TARGET_PASSPORT_USER_INFO_SETTING_VIEW", "clickCreateTeamEvent", "", "flowType", "clickCreateTeamOrPersonalUseEvent", "clickInputTeamCodeEvent", "clickPersonalUseEvent", "clickScanQrCodeEvent", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.c */
public final class JoinTeamStatisticsHelper {

    /* renamed from: a */
    public static final JoinTeamStatisticsHelper f163439a = new JoinTeamStatisticsHelper();

    private JoinTeamStatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m254570a(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_join_team_click").mo171607a("flow_type", str).mo171607a("click", "input_team_code").mo171607a("target", "passport_team_code_input_view"));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m254571b(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_join_team_click").mo171607a("flow_type", str).mo171607a("click", "scan_qr_code").mo171607a("target", "passport_team_qr_code_sacn_view"));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m254572c(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_join_team_click").mo171607a("flow_type", str).mo171607a("click", "create_team_or_pesonal_use").mo171607a("target", "passport_create_team_or_personal_use_view"));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m254573d(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_create_team_or_personal_use_click").mo171607a("flow_type", str).mo171607a("click", "create_team").mo171607a("target", "passport_team_info_setting_view"));
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m254574e(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_create_team_or_personal_use_click").mo171607a("flow_type", str).mo171607a("click", "personal_use").mo171607a("target", "passport_user_info_setting_view"));
    }
}
