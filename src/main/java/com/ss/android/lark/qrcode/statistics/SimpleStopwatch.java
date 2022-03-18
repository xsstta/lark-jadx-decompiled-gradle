package com.ss.android.lark.qrcode.statistics;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/qrcode/statistics/SimpleStopwatch;", "", "()V", "startNanos", "", "elapsed", "desiredUnit", "Ljava/util/concurrent/TimeUnit;", "elapsedNanos", "Companion", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.qrcode.b.a */
public final class SimpleStopwatch {

    /* renamed from: a */
    public static final Companion f130792a = new Companion(null);

    /* renamed from: b */
    private final long f130793b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/qrcode/statistics/SimpleStopwatch$Companion;", "", "()V", "createStarted", "Lcom/ss/android/lark/qrcode/statistics/SimpleStopwatch;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final SimpleStopwatch mo180852a() {
            return new SimpleStopwatch(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final long mo180850a() {
        return System.nanoTime() - this.f130793b;
    }

    private SimpleStopwatch() {
        this.f130793b = System.nanoTime();
    }

    public /* synthetic */ SimpleStopwatch(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final long mo180851a(TimeUnit timeUnit) {
        Intrinsics.checkParameterIsNotNull(timeUnit, "desiredUnit");
        return timeUnit.convert(mo180850a(), TimeUnit.NANOSECONDS);
    }
}
