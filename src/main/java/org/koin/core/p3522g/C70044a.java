package org.koin.core.p3522g;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00010\b\"\u0004\b\u0000\u0010\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\u001a'\u0010\u0007\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"measureDuration", "", "code", "Lkotlin/Function0;", "", "message", "", "measureDurationForResult", "Lkotlin/Pair;", "T", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "koin-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: org.koin.core.g.a */
public final class C70044a {
    /* renamed from: a */
    public static final double m268706a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "code");
        TimeMark a = TimeSource.Monotonic.f173391a.mo242615a();
        function0.invoke();
        return Duration.m266210f(a.mo242606a());
    }

    /* renamed from: b */
    public static final <T> Pair<T, Double> m268707b(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "code");
        return new Pair<>(function0.invoke(), Double.valueOf(Duration.m266210f(TimeSource.Monotonic.f173391a.mo242615a().mo242606a())));
    }
}
