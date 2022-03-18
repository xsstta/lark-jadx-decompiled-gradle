package com.ss.lark.android.passport.biz.feature.input_pwd;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/input_pwd/PwdVerifyStatisticsHelper;", "", "()V", "CHANGE_TO_VERIFY_CODE", "", "FAILED", "PASSPORT_VERIFY_CODE_VIEW", "PWD_VERIFY_CLICK", "RESET_PWD", "SUCCESS", "VERIFY_RESULT", "clickChangeCode", "", "flow_type", "clickRestPwd", "enterPwdVerifyEvent", "flowType", "verifyPwd", "success", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.b */
public final class PwdVerifyStatisticsHelper {

    /* renamed from: a */
    public static final PwdVerifyStatisticsHelper f163361a = new PwdVerifyStatisticsHelper();

    private PwdVerifyStatisticsHelper() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m254425c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "flowType");
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_pwd_verify_view").mo171607a("flow_type", str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m254422a(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_pwd_verify_click").mo171607a("click", "change_to_verify_code").mo171607a("target", "passport_verify_code_view").mo171607a("flow_type", str));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m254424b(String str) {
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_pwd_verify_click").mo171607a("click", "reset_pwd").mo171607a("target", "none").mo171607a("flow_type", str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m254423a(String str, boolean z) {
        String str2;
        StatisticsHelper.StatisticsEvent a = new StatisticsHelper.StatisticsEvent("passport_pwd_verify_click").mo171607a("click", "next").mo171607a("target", "none").mo171607a("flow_type", str);
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        StatisticsHelper.m193775a(a.mo171607a("verify_result", str2));
    }
}
