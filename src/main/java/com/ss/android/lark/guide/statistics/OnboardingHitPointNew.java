package com.ss.android.lark.guide.statistics;

import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.statistics.Statistics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J \u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0011J\u0014\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/guide/statistics/OnboardingHitPointNew;", "", "()V", "CLICK", "", "KEY", "NONE", "TARGET", "sendLandingPageClick", "", "isLogin", "", "sendLangingPageView", "sendOperatingActivitiesClick", "param", "Lcom/ss/android/lark/guide/statistics/OnboardingHitPointNew$OperatingActivitiesClickParam;", "selectedServiceList", "", "sendOperatingActivitiesView", "serviceList", "OperatingActivitiesClickParam", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OnboardingHitPointNew {

    /* renamed from: a */
    public static final OnboardingHitPointNew f99381a = new OnboardingHitPointNew();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/guide/statistics/OnboardingHitPointNew$OperatingActivitiesClickParam;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "FETCH", "NEXT", "SKIP", "CHECKED", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum OperatingActivitiesClickParam {
        FETCH("fetch", "none"),
        NEXT("next", "none"),
        SKIP("skip", "none"),
        CHECKED("checked", "none");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private OperatingActivitiesClickParam(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    private OnboardingHitPointNew() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m152608a() {
        AbstractC38549a a = C38548a.m152027a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
        AbstractC38549a.AbstractC38556g p = a.mo141266p();
        Intrinsics.checkExpressionValueIsNotNull(p, "GuideModule.getDependency().passportDependency");
        Statistics.sendEvent("passport_landing_page_view", new JSONObject().put("passport_appid", String.valueOf(p.mo141278a())).put("tracking_code", "none").put("template_id", "none").put("utm_from", "none"));
    }

    /* renamed from: a */
    public final void mo141637a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "serviceList");
        Statistics.sendEvent("onboarding_operating_activities_view", new JSONObject().put("key", list));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m152609a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("click", "login");
            jSONObject.put("target", "none");
        } else {
            jSONObject.put("click", "register");
            jSONObject.put("target", "passport_team_info_setting_view");
        }
        AbstractC38549a a = C38548a.m152027a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
        AbstractC38549a.AbstractC38556g p = a.mo141266p();
        Intrinsics.checkExpressionValueIsNotNull(p, "GuideModule.getDependency().passportDependency");
        jSONObject.put("passport_appid", String.valueOf(p.mo141278a())).put("tracking_code", "none").put("template_id", "none").put("utm_from", "none");
        Statistics.sendEvent("passport_landing_page_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo141636a(OperatingActivitiesClickParam operatingActivitiesClickParam, List<String> list) {
        Intrinsics.checkParameterIsNotNull(operatingActivitiesClickParam, "param");
        JSONObject put = new JSONObject().put("click", operatingActivitiesClickParam.getAction()).put("target", operatingActivitiesClickParam.getTarget());
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        Statistics.sendEvent("onboarding_operating_activities_click", put.put("key", list));
    }
}
