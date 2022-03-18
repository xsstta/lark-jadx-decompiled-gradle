package com.ss.lark.android.passport.biz.feature.verify_code;

import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u0010\u0015\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u0010\u0016\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J$\u0010\u0017\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001a\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/verify_code/VerifyCodeStatisticsHelper;", "", "()V", "CHANGE_TO_PWD", "", "FAILED", "FIND_ACCOUNT", "PASSPORT_PWD_VERIFY_VIEW", "REQUEST_VERIFY_CODE", "SUCCESS", "VERIFY_CODE_CLICK", "VERIFY_CODE_VIEW", "VERIFY_RESULT", "addCommonParam", "Lcom/ss/android/lark/passport/infra/statistics/StatisticsHelper$StatisticsEvent;", "event", "verifyType", "verifyBean", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/model/VerifyIdentityStepInfo$VerifyIdentifyBean;", "applyCodeEvent", "", "clickChangePwd", "clickFindAccount", "verifyCodePoint", "success", "", "verifyEnter", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.c */
public final class VerifyCodeStatisticsHelper {

    /* renamed from: a */
    public static final VerifyCodeStatisticsHelper f164029a = new VerifyCodeStatisticsHelper();

    private VerifyCodeStatisticsHelper() {
    }

    /* renamed from: c */
    public final void mo224318c(String str, VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean) {
        StatisticsHelper.m193775a(mo224317a(new StatisticsHelper.StatisticsEvent("passport_verify_code_view"), str, verifyIdentifyBean));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m255793a(String str, VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean) {
        StatisticsHelper.m193775a(f164029a.mo224317a(new StatisticsHelper.StatisticsEvent("passport_verify_code_click").mo171607a("click", "change_to_pwd").mo171607a("target", "passport_pwd_verify_view"), str, verifyIdentifyBean));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m255795b(String str, VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean) {
        StatisticsHelper.m193775a(f164029a.mo224317a(new StatisticsHelper.StatisticsEvent("passport_verify_code_click").mo171607a("click", "find_account").mo171607a("target", "none"), str, verifyIdentifyBean));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m255796d(String str, VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean) {
        StatisticsHelper.m193775a(f164029a.mo224317a(new StatisticsHelper.StatisticsEvent("passport_verify_code_click").mo171607a("click", "request_verify_code").mo171607a("target", "none"), str, verifyIdentifyBean));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m255794a(String str, VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean, boolean z) {
        String str2;
        StatisticsHelper.StatisticsEvent a = new StatisticsHelper.StatisticsEvent("passport_verify_code_click").mo171607a("click", "next").mo171607a("target", "none");
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        StatisticsHelper.m193775a(f164029a.mo224317a(a.mo171607a("verify_result", str2), str, verifyIdentifyBean));
    }

    /* renamed from: a */
    public final StatisticsHelper.StatisticsEvent mo224317a(StatisticsHelper.StatisticsEvent aVar, String str, VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean) {
        String str2;
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        boolean z = false;
        if (verifyIdentifyBean != null) {
            if (verifyIdentifyBean.pwd_button != null) {
                z = true;
            }
        }
        if (verifyIdentifyBean == null || (str2 = verifyIdentifyBean.flowType) == null) {
            str2 = "";
        }
        return aVar.mo171607a("is_pwd_enable", String.valueOf(z)).mo171607a("verify_type", str).mo171607a("flow_type", str2);
    }
}
