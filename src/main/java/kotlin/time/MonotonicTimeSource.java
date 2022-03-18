package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\bÁ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource;", "()V", "read", "", "toString", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.time.i */
public final class MonotonicTimeSource extends AbstractLongTimeSource implements TimeSource {

    /* renamed from: a */
    public static final MonotonicTimeSource f173388a = new MonotonicTimeSource();

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    private MonotonicTimeSource() {
        super(TimeUnit.NANOSECONDS);
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.time.AbstractLongTimeSource
    /* renamed from: a */
    public long mo242603a() {
        return System.nanoTime();
    }
}
