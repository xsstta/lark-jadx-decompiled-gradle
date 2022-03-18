package com.ss.android.lark.calendar.impl.features.common.featureswitch;

import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30048l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007R\u0013\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/featureswitch/CalendarFeatureSwitch;", "", "()V", "fgDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IFeatureGatingDependency;", "Lorg/jetbrains/annotations/NotNull;", "isFeatureSwitchSuiteReportEnable", "", "isFeatureSwitchSuiteVcEnable", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.b.b */
public final class CalendarFeatureSwitch {

    /* renamed from: a */
    public static final Companion f78605a = new Companion(null);

    /* renamed from: b */
    private final AbstractC30048l f78606b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/featureswitch/CalendarFeatureSwitch$Companion;", "", "()V", "FEATURE_SWITCH_KEY_SUITE_REPORT", "", "FEATURE_SWITCH_KEY_SUITE_VC", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo112719a() {
        return this.f78606b.mo108236a("suite_vc");
    }

    /* renamed from: b */
    public final boolean mo112720b() {
        return this.f78606b.mo108236a("suite_report");
    }

    public CalendarFeatureSwitch() {
        AbstractC30048l featureGatingDependency = C30022a.f74882a.featureGatingDependency();
        Intrinsics.checkExpressionValueIsNotNull(featureGatingDependency, "CalendarDependencyHolder…featureGatingDependency()");
        this.f78606b = featureGatingDependency;
    }
}
