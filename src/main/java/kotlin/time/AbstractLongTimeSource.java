package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\fB\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH$R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource;", "unit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "(Ljava/util/concurrent/TimeUnit;)V", "getUnit", "()Ljava/util/concurrent/TimeUnit;", "markNow", "Lkotlin/time/TimeMark;", "read", "", "LongTimeMark", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.time.a */
public abstract class AbstractLongTimeSource implements TimeSource {

    /* renamed from: a */
    private final TimeUnit f173375a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo242603a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final TimeUnit mo242605c() {
        return this.f173375a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u00020\u0007X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/TimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", "offset", "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;DLkotlin/jvm/internal/DefaultConstructorMarker;)V", "D", "elapsedNow", "()D", "plus", "duration", "plus-LRDsOJo", "(D)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.time.a$a */
    private static final class LongTimeMark extends TimeMark {

        /* renamed from: a */
        private final long f173376a;

        /* renamed from: b */
        private final AbstractLongTimeSource f173377b;

        /* renamed from: c */
        private final double f173378c;

        @Override // kotlin.time.TimeMark
        /* renamed from: a */
        public double mo242606a() {
            return Duration.m266201a(C69352c.m266219a(this.f173377b.mo242603a() - this.f173376a, this.f173377b.mo242605c()), this.f173378c);
        }

        private LongTimeMark(long j, AbstractLongTimeSource aVar, double d) {
            this.f173376a = j;
            this.f173377b = aVar;
            this.f173378c = d;
        }

        public /* synthetic */ LongTimeMark(long j, AbstractLongTimeSource aVar, double d, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, aVar, d);
        }
    }

    /* renamed from: b */
    public TimeMark mo242604b() {
        return new LongTimeMark(mo242603a(), this, Duration.f173381c.mo242613a(), null);
    }

    public AbstractLongTimeSource(TimeUnit timeUnit) {
        Intrinsics.checkParameterIsNotNull(timeUnit, "unit");
        this.f173375a = timeUnit;
    }
}
