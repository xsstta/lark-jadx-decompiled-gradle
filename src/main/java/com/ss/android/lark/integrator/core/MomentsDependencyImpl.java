package com.ss.android.lark.integrator.core;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.core.dependency.IMomentsDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0015\u0010\u0005\u001a\u00070\u0006¢\u0006\u0002\b\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/integrator/core/MomentsDependencyImpl;", "Lcom/ss/android/lark/core/dependency/IMomentsDependency;", "()V", "getMomentsName", "", "getProfileMomentsFragment", "Landroidx/fragment/app/Fragment;", "Lorg/jetbrains/annotations/NotNull;", "userId", "isMomentsSettingEnable", "", "onABExperimentsInit", "", "module", "Lcom/ss/android/lark/abtest/api/IABTestService;", "startMomentsSettingActivity", "activity", "Landroid/app/Activity;", "Companion", "core_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.core.l */
public final class MomentsDependencyImpl implements IMomentsDependency {

    /* renamed from: a */
    public static final Companion f100693a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/core/MomentsDependencyImpl$Companion;", "", "()V", "LOG_TAG", "", "core_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.core.l$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.core.dependency.IMomentsDependency
    /* renamed from: b */
    public String mo132989b() {
        String momentsTabName;
        ICalendarApi iCalendarApi = (ICalendarApi) ApiUtils.getApi(ICalendarApi.class);
        if (iCalendarApi == null || (momentsTabName = iCalendarApi.getMomentsTabName()) == null) {
            return "";
        }
        return momentsTabName;
    }

    @Override // com.ss.android.lark.core.dependency.IMomentsDependency
    /* renamed from: a */
    public boolean mo132988a() {
        ICalendarApi iCalendarApi = (ICalendarApi) ApiUtils.getApi(ICalendarApi.class);
        if (iCalendarApi != null) {
            return iCalendarApi.isMomentsSettingEnable();
        }
        return false;
    }

    @Override // com.ss.android.lark.core.dependency.IMomentsDependency
    /* renamed from: a */
    public void mo132986a(Activity activity) {
        ICalendarApi iCalendarApi = (ICalendarApi) ApiUtils.getApi(ICalendarApi.class);
        if (iCalendarApi != null) {
            iCalendarApi.startMomentsSettingActivity(activity);
        }
    }

    @Override // com.ss.android.lark.core.dependency.IMomentsDependency
    /* renamed from: a */
    public Fragment mo132985a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Fragment profileMomentsFragment = ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getProfileMomentsFragment(str);
        Intrinsics.checkExpressionValueIsNotNull(profileMomentsFragment, "ApiUtils.getApi(\n       …leMomentsFragment(userId)");
        return profileMomentsFragment;
    }

    @Override // com.ss.android.lark.core.dependency.IMomentsDependency
    /* renamed from: a */
    public void mo132987a(IABTestService iABTestService) {
        List<AbstractC28490a<?>> momentsABTestExperiments;
        Intrinsics.checkParameterIsNotNull(iABTestService, "module");
        ICalendarApi iCalendarApi = (ICalendarApi) ApiUtils.getApi(ICalendarApi.class);
        if (iCalendarApi == null || (momentsABTestExperiments = iCalendarApi.getMomentsABTestExperiments()) == null) {
            Log.m165383e("MomentsDependencyImpl", "onABExperimentsInit momentsABTestExperiments is null");
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(momentsABTestExperiments, "ApiUtils.getApi(ICalenda…         return\n        }");
        iABTestService.registerExperiments("MOMENTS", momentsABTestExperiments);
    }
}
