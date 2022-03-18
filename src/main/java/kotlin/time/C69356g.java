package kotlin.time;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0001¨\u0006\u0004"}, d2 = {"shortName", "", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/time/DurationUnitKt")
/* renamed from: kotlin.time.g */
class C69356g extends C69355f {
    /* renamed from: a */
    public static final String m266222a(TimeUnit timeUnit) {
        Intrinsics.checkParameterIsNotNull(timeUnit, "$this$shortName");
        switch (C69354e.f173383a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return C14002h.f36692e;
            case 7:
                return C63690d.f160779a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
