package bytekn.foundation.concurrent.scheduler;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\r\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/EnhancedDelayQueue;", "T", "", "()V", "queue", "Ljava/util/concurrent/DelayQueue;", "Lbytekn/foundation/concurrent/scheduler/EnhancedDelayQueue$Entry;", "set", "", "offer", "", "item", "timeout", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)V", "removeFirst", "()Ljava/lang/Object;", "take", "Entry", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.d.d */
public final class EnhancedDelayQueue<T> {

    /* renamed from: a */
    private final DelayQueue<Entry<T>> f5735a = new DelayQueue<>();

    /* renamed from: b */
    private final Set<Entry<T>> f5736b;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u0013*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u0013B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/EnhancedDelayQueue$Entry;", "T", "Ljava/util/concurrent/Delayed;", "item", "expirationNanoTime", "", "(Ljava/lang/Object;J)V", "getExpirationNanoTime", "()J", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "sequenceNumber", "compareTo", "", "other", "getDelay", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.d$a */
    public static final class Entry<T> implements Delayed {

        /* renamed from: a */
        public static final Companion f5737a = new Companion(null);

        /* renamed from: e */
        private static final AtomicLong f5738e = new AtomicLong();

        /* renamed from: b */
        private final long f5739b;

        /* renamed from: c */
        private final T f5740c;

        /* renamed from: d */
        private final long f5741d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/EnhancedDelayQueue$Entry$Companion;", "", "()V", "sequencer", "Ljava/util/concurrent/atomic/AtomicLong;", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: bytekn.foundation.b.d.d$a$a */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final T mo8645a() {
            return this.f5740c;
        }

        public long getDelay(TimeUnit timeUnit) {
            Intrinsics.checkParameterIsNotNull(timeUnit, "timeUnit");
            return timeUnit.convert(this.f5741d - System.nanoTime(), TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public int compareTo(Delayed delayed) {
            Intrinsics.checkParameterIsNotNull(delayed, "other");
            if (this != delayed) {
                if (delayed instanceof Entry) {
                    Entry aVar = (Entry) delayed;
                    int i = ((this.f5741d - aVar.f5741d) > 0 ? 1 : ((this.f5741d - aVar.f5741d) == 0 ? 0 : -1));
                    if (i >= 0) {
                        if (i > 0) {
                            return 1;
                        }
                        long j = this.f5739b;
                        long j2 = aVar.f5739b;
                        if (j >= j2) {
                            if (j > j2) {
                                return 1;
                            }
                        }
                    }
                } else {
                    int i2 = ((getDelay(TimeUnit.NANOSECONDS) - delayed.getDelay(TimeUnit.NANOSECONDS)) > 0 ? 1 : ((getDelay(TimeUnit.NANOSECONDS) - delayed.getDelay(TimeUnit.NANOSECONDS)) == 0 ? 0 : -1));
                    if (i2 >= 0) {
                        if (i2 > 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            }
            return 0;
        }
    }

    public EnhancedDelayQueue() {
        Set<Entry<T>> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkExpressionValueIsNotNull(newSetFromMap, "Collections.newSetFromMa…Map<Entry<T>, Boolean>())");
        this.f5736b = newSetFromMap;
    }

    /* renamed from: b */
    public final T mo8643b() {
        T a;
        while (true) {
            Entry<T> take = this.f5735a.take();
            if (!this.f5736b.remove(take)) {
                take = null;
            }
            Entry<T> aVar = take;
            if (aVar != null && (a = aVar.mo8645a()) != null) {
                return a;
            }
        }
    }

    /* renamed from: a */
    public final T mo8642a() {
        Entry<T> peek = this.f5735a.peek();
        if (peek == null) {
            return null;
        }
        if (!this.f5736b.remove(peek)) {
            peek = null;
        }
        if (peek == null) {
            return null;
        }
        this.f5735a.remove(peek);
        if (peek != null) {
            return peek.mo8645a();
        }
        return null;
    }
}
