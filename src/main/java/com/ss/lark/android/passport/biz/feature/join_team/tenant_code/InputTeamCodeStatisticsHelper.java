package com.ss.lark.android.passport.biz.feature.join_team.tenant_code;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/join_team/tenant_code/InputTeamCodeStatisticsHelper;", "", "()V", "FAILED", "", "PASSPORT_TEAM_QR_CODE_SACN_VIEW", "PASSPORT_USER_INFO_SETTING_VIEW", "SUCCESS", "SWITCH_QR_CODE", "TEAM_CODE_INPUT_CLICK", "VERIFY_RESULT", "switchQrCodeEvent", "", "flowType", "verifyTenantCodeEvent", "success", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.tenant_code.a */
public final class InputTeamCodeStatisticsHelper {

    /* renamed from: a */
    public static final InputTeamCodeStatisticsHelper f163442a = new InputTeamCodeStatisticsHelper();

    private InputTeamCodeStatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m254589a(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_team_code_input_click").mo171607a("click", "switch_qr_code").mo171607a("target", "passport_team_qr_code_sacn_view").mo171607a("flow_type", str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m254590a(String str, boolean z) {
        String str2;
        StatisticsHelper.StatisticsEvent a = new StatisticsHelper.StatisticsEvent("passport_team_code_input_click").mo171607a("click", "next").mo171607a("target", "passport_user_info_setting_view").mo171607a("flow_type", str);
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        StatisticsHelper.m193775a(a.mo171607a("verify_result", str2));
    }
}
