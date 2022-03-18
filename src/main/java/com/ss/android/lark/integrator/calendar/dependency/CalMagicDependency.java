package com.ss.android.lark.integrator.calendar.dependency;

import android.app.Activity;
import com.ss.android.lark.biz.core.api.AbstractC29588w;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.calendar.dependency.idependency.IMagicDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalMagicDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IMagicDependency;", "()V", "registerScenario", "", "scenarioId", "", "activity", "Landroid/app/Activity;", "interceptor", "Lcom/ss/android/lark/calendar/dependency/idependency/IMagicDependency$IMagicInterceptorDependency;", "unregisterScenario", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.s */
public final class CalMagicDependency implements IMagicDependency {
    @Override // com.ss.android.lark.calendar.dependency.idependency.IMagicDependency
    /* renamed from: a */
    public void mo108274a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unregisterScenario(str);
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IMagicDependency
    /* renamed from: a */
    public void mo108275a(String str, Activity activity) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        mo143043a(str, activity, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "<anonymous parameter 2>", "canShow"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.s$a */
    public static final class C39222a implements AbstractC29588w {

        /* renamed from: a */
        final /* synthetic */ IMagicDependency.IMagicInterceptorDependency f100522a;

        C39222a(IMagicDependency.IMagicInterceptorDependency aVar) {
            this.f100522a = aVar;
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29588w
        /* renamed from: a */
        public final boolean mo105896a(String str, String str2, String str3) {
            IMagicDependency.IMagicInterceptorDependency aVar = this.f100522a;
            if (aVar == null || aVar.mo108276a()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo143043a(String str, Activity activity, IMagicDependency.IMagicInterceptorDependency aVar) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerScenario(str, null, new MagicViewContainer(activity), new C39222a(aVar));
    }
}
