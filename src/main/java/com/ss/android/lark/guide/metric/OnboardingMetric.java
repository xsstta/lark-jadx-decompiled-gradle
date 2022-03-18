package com.ss.android.lark.guide.metric;

import com.larksuite.component.metriclogger.AbstractC24339c;
import com.larksuite.component.metriclogger.C24350k;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/metric/OnboardingMetric;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.c.a */
public final class OnboardingMetric {

    /* renamed from: a */
    public static final Companion f99302a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/metric/OnboardingMetric$Companion;", "", "()V", "metric", "", "metricId", "Lcom/larksuite/component/metriclogger/consts/domains/MetricId;", "time", "", "params", "", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo141515a(C24341b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "metricId");
            mo141517a(bVar, (Map<String, ? extends Object>) null);
        }

        /* renamed from: a */
        public final void mo141516a(C24341b bVar, long j) {
            Intrinsics.checkParameterIsNotNull(bVar, "metricId");
            C24350k.m88899a(j, bVar).mo87079a();
        }

        /* renamed from: a */
        public final void mo141517a(C24341b bVar, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(bVar, "metricId");
            AbstractC24339c a = C24350k.m88900a(bVar);
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    a.mo87077a(entry.getKey(), entry.getValue());
                }
            }
            a.mo87079a();
        }
    }
}
